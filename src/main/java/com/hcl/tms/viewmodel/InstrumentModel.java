package com.hcl.tms.viewmodel;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InstrumentModel {
    private Long id;
    private String instrumentName;
    private double instrumentValue;
    private String instrumentType;
}
