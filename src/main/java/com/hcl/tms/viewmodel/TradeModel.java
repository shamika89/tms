package com.hcl.tms.viewmodel;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TradeModel {
    private Long id;
    private Long portfolioId;
    private Long noOfUnite;
    private String tradeType;
    private Long instrumentId;
}
