package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.Show;
import com.scaler.bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import javax.persistence.QueryHint;
import java.util.List;

@Repository
public interface ShowSeatRepository
extends JpaRepository<ShowSeat, Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @QueryHints({
            @QueryHint(name = "javax.persistence.lock.timeout", value = "30000")
    })
    List<ShowSeat> findByIdIn(List<Long> showSeatIds);
    // select * from show_seats
    // where show_seat id in ()
    // for update;

//    @Query("select * from show_seat_mapping where show_seat_mapping.seat_id in ()")
//    List<ShowSeat> findByIdIn(List<Long> showSeatIds);

    ShowSeat save(ShowSeat showSeat);
}
