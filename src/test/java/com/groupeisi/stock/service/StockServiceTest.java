package com.groupeisi.stock.service;

import static org.junit.jupiter.api.Assertions.*;

import com.groupeisi.stock.entities.Produit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class StockServiceTest {

    @Test
    void create() {
        Produit produit = new Produit();
        produit.setStock(9);
        StockService stockService = new StockService();
        Assertions.assertEquals(1,stockService.create(produit));
    }

}