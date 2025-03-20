package com.llsoftwares.cacaeventos.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "treasures")
@NoArgsConstructor
public class Treasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private UUID code;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
