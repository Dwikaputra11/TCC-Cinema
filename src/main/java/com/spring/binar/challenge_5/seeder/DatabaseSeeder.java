package com.spring.binar.challenge_5.seeder;

import com.spring.binar.challenge_5.models.Seat;
import com.spring.binar.challenge_5.repos.SeatRepository;
import com.spring.binar.challenge_5.repos.StudioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class DatabaseSeeder {
    private final SeatRepository repository;
    private final StudioRepository studioRepository;
    private final JdbcTemplate jdbcTemplate;


//    @EventListener
    public void seed(ContextRefreshedEvent event){
        seedSeatTable();
    }

    private void seedSeatTable() {
//        int studioId = 1;
//        byte counterSeat = 1;
//        int i = 1;
//        char[] charSeat = {'A', 'B'};
//        Seat seat = new Seat();
//        while(i <= 68){
//            seat.setNumber(counterSeat);
//            if(counterSeat > 7) seat.setRow(charSeat[1]);
//            else seat.setRow(charSeat[0]);
//            seat.setStudio(studioRepository.findById(studioId).orElse(null));
//            repository.save(seat);
//            if(counterSeat%14 == 0){
//                counterSeat = 1;
//                studioId++;
//            }else{
//                counterSeat++;
//            }
//            i++;
//        }
    }
}
