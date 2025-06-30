package org.example.observer;

import org.example.observer.server.BinancePriceLogger;
import org.example.observer.server.InvestorNotifier;
import org.example.observer.server.NewsPlataform;

import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {
        Bitcoin bit = new Bitcoin();

        BinanceAPI binance = new BinanceAPI();


        bit.addObervers(new BinancePriceLogger());
        bit.addObervers(new InvestorNotifier());
        bit.addObervers(new NewsPlataform());

        BigDecimal newPrice = binance.getLastPrice();
        System.out.println("new Price: "+newPrice);
        bit.setPrice(newPrice);

    }



}
