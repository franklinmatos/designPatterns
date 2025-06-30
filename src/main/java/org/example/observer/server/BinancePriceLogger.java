package org.example.observer.server;

import java.math.BigDecimal;

public class BinancePriceLogger implements BitcoinPriceObserver {
    @Override
    public void update(BigDecimal price) {
        System.out.println("Atualizando preço.  Novo preço: "+ price);
    }
}
