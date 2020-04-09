/**
 * 
 */
package com.parking.domain;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 停车场类
 * @author LiHengfei
 *
 */
@Entity
@Table(name="parking_site")
public class ParkingSite implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5906007385449031187L;
	@Id
	@Column(name = "PS_ID")
	private int ps_id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PROVINCE")
	private String province;	// 省/直辖市
	@Column(name = "CITY")
	private String city;		// 市
	@Column(name = "DISTRICT")
	private String district;	// 区
	@Column(name = "STREET")
	private String street;		// 街道
	@Column(name = "ADDRESS")
	private String address;		// 地址
	@Column(name = "LAT")
	private String latitude;	// 纬度
	@Column(name = "LNG")
	private String longitude;	// 经度
	@Column(name = "CONTACT")
	private String contact;
	@Column(name = "MEMO")
	private String memo;
	@OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "PS_ID")
	List<ParkingLot> lots;
	
	
	public int getId(int ps_id) {
		return ps_id;
	}
	public void setId(int ps_id) {
		this.ps_id = ps_id;
	}
	public String getName(String name) {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public String getProvince(String province) {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity(String city) {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict(String distract) {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStreet(String street) {
		return this.street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAddress(String address) {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLatitude(String latitude) {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude(String longitude) {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getContact(String contract) {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public List<ParkingLot> getLots() {
		return lots;
	}
	public void setLots(List<ParkingLot> lots) {
		this.lots = lots;
	}
}
