package com.parking.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.parking.domain.Region;
import com.parking.service.RegionService;

@Service
public class RegionServiceImpl implements RegionService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<Region> regionRowMapper;

	public RegionServiceImpl(final JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		this.regionRowMapper = new RowMapper<Region>() {

			@Override
			public Region mapRow(final ResultSet rs, final int rowNum) throws SQLException {
				final Region region = new Region();
				final String name = rs.getString("CRI_NAME");
				region.setName(name);
				Region.Type type;
				if (name.endsWith("市") || name.equals("香港") || name.equals("澳门")) {
					type = Region.Type.DirectlyGovernedCity;
				} else {
					type = Region.Type.Province;
				}
				region.setType(type);
				region.setShortName(rs.getString("CRI_SHORT_NAME"));
				region.setLevel(1);
				region.setCode(rs.getString("CRI_CODE"));
				return region;
			}

		};
	}

	/**
	 * 列出所有省级单位
	 * 
	 * @return
	 */
	@Override
	public List<Region> listFirstLevelRegions() {
		final String sql = 
			"SELECT CRI_CODE, CRI_NAME, CRI_SHORT_NAME, CRI_LNG, CRI_LAT " + 
			"  FROM cn_region_info " + 
			" WHERE CRI_LEVEL = '1'";
		return this.jdbcTemplate.query(sql, this.regionRowMapper);
	}

	@Override
	public List<Region> getLowerRegions(final String superiorRegionCode) {
		final String sql =
			"SELECT CRI_CODE, CRI_NAME, CRI_SHORT_NAME, CRI_LNG, CRI_LAT " +
			"  FROM cn_region_info " +
			" WHERE CRI_SUPERIOR_CODE = ?";
		return this.jdbcTemplate.query(sql, 
														new Object[]{superiorRegionCode}, 
														this.regionRowMapper);
	}
}
