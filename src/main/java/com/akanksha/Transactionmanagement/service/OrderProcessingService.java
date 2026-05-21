package com.akanksha.Transactionmanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProcessingService {

    private final OrederHandler orederHandler;
    private final InventoryHandler inventoryHandler;


}
