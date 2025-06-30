package org.example.observer.server;

import java.math.BigDecimal;

public interface BitcoinPriceObserver {

    void update(BigDecimal price);
}
