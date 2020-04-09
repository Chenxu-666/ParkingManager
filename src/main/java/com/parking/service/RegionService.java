package com.parking.service;

import java.util.List;

import com.parking.domain.Region;

public interface RegionService {

	/**
	 * 列出所有省级单位
	 * 
	 * @return
	 */
	List<Region> listFirstLevelRegions();
	
	/**
	 * 获取superiorRegionCode所代表区域的下级区域列表
	 * @param superiorRegionCode 区域代码
	 * @return
	 */
	List<Region> getLowerRegions(String superiorRegionCode);

}