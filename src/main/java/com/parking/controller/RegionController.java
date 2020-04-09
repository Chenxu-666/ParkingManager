package com.parking.controller;

import java.util.List;

import com.parking.domain.Region;
import com.parking.service.RegionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/region")
public class RegionController {
  @Autowired
  private RegionService regionService;

  public RegionController(RegionService regionService) {
    this.regionService = regionService;
  }
  
  @RequestMapping(value = "/first-level-regions", method = RequestMethod.GET)
  public List<Region> getAllFirstLevelRegions() {
    return this.regionService.listFirstLevelRegions();
  }

  @RequestMapping(value = "/get-lower-regions")
  public List<Region> getLowerRegions(@RequestParam(value="superior-region-code") String superiorRegionCode) {
    return this.regionService.getLowerRegions(superiorRegionCode);
  }
}