package com.hcl.tms.controller;

import com.hcl.tms.service.TradeService;
import com.hcl.tms.viewmodel.ApiResponse;
import com.hcl.tms.viewmodel.InstrumentModel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/trade")
@Log4j2
@CrossOrigin("*")
@RequiredArgsConstructor
public class TradeController {

    @NonNull
    private TradeService tradeServiceImpl;

    @GetMapping(value = "/instruments")
    public ResponseEntity<ApiResponse> getAllInstruments(){
        List<InstrumentModel> instrumentModels = tradeServiceImpl.getAllInstruments();
        return ResponseEntity.ok(ApiResponse.success(instrumentModels, "SUCESS"));
    }

//    @PostMapping(value = "/add")
//    public ResponseEntity<ApiResponse> addTrade(){
//
//    }
}
