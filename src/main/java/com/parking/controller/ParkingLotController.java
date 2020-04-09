package com.parking.controller;


import com.parking.domain.ParkingLot;
import com.parking.domain.ParkingSite;
import com.parking.service.impl.ParkingLotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

@Controller
public class ParkingLotController {
    Date date = new Date();
    Timestamp timestamp = new Timestamp(date.getTime());
    @Autowired
    ParkingLotServiceImpl parkingLotServiceImpl;

    @GetMapping("/addParkingLot")
    @ResponseBody
    public void addParkingLot(@RequestParam(value = "id")int id,
                              @RequestParam(value = "no",required = false)String no,
                              @RequestParam(value = "status")ParkingLot.Status status,
                              @RequestParam(value = "ps_id")int ps_id,
                              @RequestParam(value = "name" , required = false)String name,
                              @RequestParam(value = "region_code", required = false)String region_code,
                              @RequestParam(value = "memo" , required = false)String memo,
                              @RequestParam(value = "address" , required = false)String address,
                              @RequestParam(value = "contact" , required = false)String contact,
                              @RequestParam(value = "longitude" , required = false)String longitude,
                              @RequestParam(value = "latitude" , required = false)String latitude,
                              @RequestParam(value = "province")String province,
                              @RequestParam(value = "city")String city,
                              @RequestParam(value = "district")String district,
                              @RequestParam(value = "street")String street){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(id);
        parkingLot.setNo(no);
        parkingLot.setStatus(status);
        parkingLot.setLastUpdate(timestamp);
        ParkingSite parkingSite = new ParkingSite();
        parkingSite.setId(ps_id);
        parkingSite.setName(name);
        parkingSite.setMemo(memo);
        parkingSite.setAddress(address);
        parkingSite.setContact(contact);
        parkingSite.setLongitude(longitude);
        parkingSite.setLatitude(latitude);
        parkingSite.setProvince(province);
        parkingSite.setCity(city);
        parkingSite.setDistrict(district);
        parkingSite.setStreet(street);
        parkingLotServiceImpl.addParkingLot(parkingLot,parkingSite);
    }

}
