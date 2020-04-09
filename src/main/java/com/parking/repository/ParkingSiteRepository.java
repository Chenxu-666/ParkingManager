package com.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.parking.domain.ParkingSite;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSiteRepository extends JpaRepository<ParkingSite, Integer> {
}
