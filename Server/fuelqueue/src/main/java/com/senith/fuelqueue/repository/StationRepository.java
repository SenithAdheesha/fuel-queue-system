package com.senith.fuelqueue.repository;

import com.senith.fuelqueue.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {

}