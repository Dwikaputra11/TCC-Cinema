package com.spring.binar.challenge_5.service;

import com.spring.binar.challenge_5.models.Seat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SeatService {
    Page<Seat> findAll(Pageable pageable);

    List<Seat> findAll();

    Seat findById(int id);

    Seat save(Seat seat);

    Seat update(Seat updatedSeat);

    void delete(int id);
}
