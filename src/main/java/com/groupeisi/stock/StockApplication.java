package com.groupeisi.stock;

import com.groupeisi.stock.service.StockService;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class StockApplication {
    private static Logger logger = Logger.getLogger(StockService.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        StockService stockService = new StockService();
        stockService.getProperties();
    }
}
