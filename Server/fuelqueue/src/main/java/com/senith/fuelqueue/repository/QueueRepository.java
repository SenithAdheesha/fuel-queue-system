package com.senith.fuelqueue.repository;

import com.senith.fuelqueue.entity.Queue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QueueRepository extends JpaRepository<Queue, Long> {

    // Get all queue entries for a station
    List<Queue> findByStationId(Long stationId);

    // Get latest queue number for a station
    Optional<Queue> findTopByStationIdOrderByQueueNumberDesc(Long stationId);

    // Get queues by user
    List<Queue> findByUserId(Long userId);

}