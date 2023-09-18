package com.daraja.c2b.controller;

import com.daraja.c2b.dtos.*;
import com.daraja.c2b.service.DarajaApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mobile-money")
@Slf4j
//@RequiredArgsConstructor
public class MpesaController {

    @Autowired
    private final DarajaApi darajaApi;
    @Autowired
    private final ObjectMapper objectMapper;
    private final AcknowledgeResponse acknowledgeResponse;

    public MpesaController(DarajaApi darajaApi, ObjectMapper objectMapper, AcknowledgeResponse acknowledgeResponse) {
        this.darajaApi = darajaApi;
        this.objectMapper = objectMapper;
        this.acknowledgeResponse = acknowledgeResponse;
    }
    @GetMapping(path = "/token", produces = "application/json")
    public ResponseEntity<AccessTokenResponse> getAccessToken() {
        return ResponseEntity.ok(darajaApi.getAccessToken());
    }
//    @PostMapping(path = "/register-url", produces = "application/json")
//    public ResponseEntity<RegisterUrlResponse> registerUrl() {
//        return ResponseEntity.ok(darajaApi.registerUrl());
//    }

    @PostMapping(path = "/register-url", produces = "application/json")
    public ResponseEntity<RegisterUrlResponse> registerUrl(@RequestBody RegisterUrlRequest registerUrlRequest) {
        return ResponseEntity.ok(darajaApi.registerUrl(registerUrlRequest));
    }

    @PostMapping(path = "/validation", produces = "application/json")
    public ResponseEntity<AcknowledgeResponse> mpesaValidation(@RequestBody MpesaValidationResponse mpesaValidationResponse) {

//        B2C_C2B_Entries b2CC2BEntry = b2CC2BEntriesRepository.findByBillRefNumber(mpesaValidationResponse.getBillRefNumber());
//
//        b2CC2BEntry.setRawCallbackPayloadResponse(mpesaValidationResponse);
//        b2CC2BEntry.setResultCode("0");
//        b2CC2BEntry.setTransactionId(mpesaValidationResponse.getTransID());
//
//        b2CC2BEntriesRepository.save(b2CC2BEntry);

        return ResponseEntity.ok(acknowledgeResponse);
    }

    @PostMapping(path = "/simulate-c2b", produces = "application/json")
    public ResponseEntity<SimulateTransactionResponse> simulateC2BTransaction(@RequestBody SimulateTransactionRequest simulateTransactionRequest) {
        return ResponseEntity.ok(darajaApi.simulateC2BTransaction(simulateTransactionRequest));
    }

}
