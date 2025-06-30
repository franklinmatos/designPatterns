package org.example.observer.server;

import java.math.BigDecimal;

public class NewsPlataform implements BitcoinPriceObserver {
    @Override
    public void update(BigDecimal price) {
        System.out.println("Atualizando plataformas. Novo preço: "+ price);
    }
}
