/**
 * 
 */
package com.parking.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

/**
 * 停车位
 * @author LiHengfei
 *
 */
@Entity
@Table(name = "parking_lot")
public class ParkingLot implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4324576938359640285L;



	/**
	 * 停车位状态
	 * @author LiHengfei
	 *
	 */
	public enum Status {
		Available,				// 空闲
		RegularParking,		// 规范停车
		IrregularParking	// 非规范停车
	}
	@Id
	@Column(name = "PL_ID")
	private int id;
	@Column(name = "PL_NO")
	private String no;
	@Column(name = "STATUE")
	@Enumerated(value = EnumType.STRING)
	private Status status;
	@Column(name = "LAST_UPDATE")
	private Timestamp lastUpdate;

	public int getId(int id) {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNo(String no) {
		return this.no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Status getStatus(Status status) {
		return this.status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Timestamp getLastUpdate(Timestamp lastUpdate) {return lastUpdate; }
	public void setLastUpdate(Timestamp lastUpdate){this.lastUpdate = lastUpdate;}

}
