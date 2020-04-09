package com.parking.service.impl;

import com.parking.domain.ParkingLot;
import com.parking.domain.ParkingSite;
import com.parking.repository.ParkingLotRepository;
import com.parking.repository.ParkingSiteRepository;
import com.parking.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {
    @Autowired
    ParkingLotRepository parkingLotRepository;
    @Autowired
    ParkingSiteRepository parkingSiteRepository;
    @Override
    public void addParkingLot(ParkingLot parkingLot, ParkingSite parkingSite) {
        parkingLotRepository.save(parkingLot);
        parkingSiteRepository.save(parkingSite);
    }
}
