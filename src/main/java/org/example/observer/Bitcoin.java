package org.example.observer;

import org.example.observer.server.BitcoinPriceObserver;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bitcoin {

    BigDecimal price;
    List<BitcoinPriceObserver> observersList = new ArrayList<>();

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal newPrice) {

        if (Objects.equals(newPrice, this.price)) {
            return;
        }
        this.price = newPrice;
        this.notifyObservers();
    }

    public void addObervers(BitcoinPriceObserver observer){
        this.observersList.add(observer);
    }

    private void notifyObservers() {
        observersList.forEach(item -> item.update(this.price));
    }
}
