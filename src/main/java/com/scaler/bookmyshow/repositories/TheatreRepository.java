package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.services.TheatreService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;

@Repository
public interface TheatreRepository extends
        JpaRepository<Theatre, Long> {

    Theatre save(Theatre theatre);

}
