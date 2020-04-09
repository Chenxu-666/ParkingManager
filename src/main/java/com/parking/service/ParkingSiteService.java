/**
 * 
 */
package com.parking.service;

import com.parking.domain.ParkingSite;
import org.springframework.stereotype.Service;

/**
 * @author LiHengfei
 *
 */
public interface ParkingSiteService {
	/**
	 * 添加新的停车场
	 * @param parkingSite 新停车场信息
	 * 
	 * 仅保存停车场基本信息，停车场中的车位数组可以留空
	 * 车位在ParkingLotService中添加（@see {@link com.parking.service.ParkingLotService#addParkingLot(com.parking.domain.ParkingLot, ParkingSite)}
	 */
	public void addParkingSite(ParkingSite parkingSite);
}
