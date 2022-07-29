package com.scaler.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

// 1:M
// 1:1

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel {
    private String name;
    @OneToMany
    private List<Seat> seats;
    private int capacity;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeature> auditoriumFeatures;

    // 1 A : 1 T
    // M  A :   1 T
    @ManyToOne
    private Theatre theatre;
}
