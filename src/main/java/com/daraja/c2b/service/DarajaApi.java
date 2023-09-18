package com.daraja.c2b.service;

import com.daraja.c2b.dtos.*;

public interface DarajaApi {
    AccessTokenResponse getAccessToken();
    RegisterUrlResponse registerUrl(RegisterUrlRequest registerUrlRequest);
    SimulateTransactionResponse simulateC2BTransaction(SimulateTransactionRequest simulateTransactionRequest);
}
