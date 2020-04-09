/**
 * 
 */
package com.parking.service;

import com.parking.domain.ParkingLot;
import com.parking.domain.ParkingSite;

import java.util.List;

/**
 * @author LiHengfei
 *
 */
public interface ParkingLotService {
	/**
	 * 添加新停车位
	 * @param parkingLot 新停车位
	 * @param parkingSite 新停车位所属的停车场
	 * @return
	 */
	public void addParkingLot(ParkingLot parkingLot, ParkingSite parkingSite);
}
