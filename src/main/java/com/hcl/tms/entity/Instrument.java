package com.hcl.tms.entity;

import com.hcl.tms.enums.InstrumentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "INSTRUMENT")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String instrumentName;
    private double instrumentValue;

    @Enumerated(EnumType.STRING)
    private InstrumentType instrumentType;
}
