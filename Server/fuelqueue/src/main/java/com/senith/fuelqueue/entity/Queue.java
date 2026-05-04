package com.senith.fuelqueue.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
public class Queue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int queueNumber;

    private String status; // WAITING, CALLED, DONE

    private Long userId;
    private Long stationId;
}