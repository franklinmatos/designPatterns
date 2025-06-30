package org.example.observer.server;

import java.math.BigDecimal;

public class InvestorNotifier implements BitcoinPriceObserver {
    @Override
    public void update(BigDecimal price) {
        System.out.println("Notificando investidores. Novo preço: "+ price);
    }
}
