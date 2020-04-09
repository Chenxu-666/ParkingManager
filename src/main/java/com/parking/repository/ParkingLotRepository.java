package com.parking.repository;

import com.parking.domain.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Dao层接口
@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot,Integer> {

}
