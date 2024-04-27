package com.hcl.tms.service.impl;

import com.hcl.tms.common.exception.TMSException;
import com.hcl.tms.common.mapper.InstrumentMapper;
import com.hcl.tms.entity.Instrument;
import com.hcl.tms.repository.InstrumentRepository;
import com.hcl.tms.service.TradeService;
import com.hcl.tms.viewmodel.InstrumentModel;
import com.hcl.tms.viewmodel.TradeModel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TradeServiceImpl implements TradeService {

    @NonNull
    private InstrumentRepository instrumentRepository;

    @Override
    public List<InstrumentModel> getAllInstruments() {
        List<Instrument> instrumentList = instrumentRepository.findAll();
        return instrumentList.stream().map(InstrumentMapper.INSTANCE::entityToModel).collect(Collectors.toList());
    }

    @Override
    public TradeModel addTrade(TradeModel tradeModel) {
        if(tradeModel.getId() != null){
            throw  new TMSException("Received invalid data");
        }


        return null;
    }
}
