package com.groupeisi.stock.service;

import com.groupeisi.stock.entities.Produit;
import com.groupeisi.stock.util.DataUtil;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class StockService {
    private static Logger logger = Logger.getLogger(StockService.class);
    public int create(Produit produit){
        BasicConfigurator.configure();
        if (produit.getStock() < 10){
            logger.debug("Execution normale");
            return 1;
        }else {
            logger.error("Execution avec erreur !");
            return 0;
        }
    }
    public void getProperties(){
        BasicConfigurator.configure();
        logger.debug(DataUtil.host);
    }

}
