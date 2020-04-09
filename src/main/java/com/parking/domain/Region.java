package com.parking.domain;

// import java.util.Collection;

public class Region {
	public enum Type {
		Province, 							// 省、台湾
		DirectlyGovernedCity, 	// 直辖市、港、澳
		City, 									// 市
		Distract, 							// 区/县
		Street									// 街道
	}
	private String code;
	private String name;
	private String shortName;
	private int level;
	private Type type;
	
	// private Collection<Region> lowerRegions;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	// public Collection<Region> getLowerRegions() {
	// 	return lowerRegions;
	// }

	// public void setLowerRegions(Collection<Region> lowerRegions) {
	// 	this.lowerRegions = lowerRegions;
	// }

	/**
	 * @return String return the code
	 */
	public String getCode() {
			return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
			this.code = code;
	}

}
