package com.hcl.tms.service;

import com.hcl.tms.viewmodel.InstrumentModel;
import com.hcl.tms.viewmodel.TradeModel;

import java.util.List;

public interface TradeService {

    List<InstrumentModel> getAllInstruments();

    TradeModel addTrade(TradeModel tradeModel);

}
