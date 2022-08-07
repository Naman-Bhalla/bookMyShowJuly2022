package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository
extends JpaRepository<Auditorium, Long> {
}
