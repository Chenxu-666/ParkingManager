package com.parking.domain;

import java.io.Serializable;

public class Location implements Serializable {

	/**
	 * 地址类，表示停车场地址
	 * @author LiHengfei
	 *
	 */
	private static final long serialVersionUID = -8402095762942742021L;
	
	private String province;	// 省/直辖市
	private String city;		// 市
	private String district;	// 区
	private String street;		// 街道
	private String address;		// 地址
	private String latitude;	// 纬度
	private String longitude;	// 经度
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}
