package org.example.observer;

import java.math.BigDecimal;
import java.util.Random;

public class BinanceAPI {

    public BigDecimal getLastPrice(){
        Random random = new Random();

        // 1. Número aleatório entre 0 (inclusive) e 100 (exclusive)
        int randomNumberInt = random.nextInt(100);
        BigDecimal bigDecimal1 = new BigDecimal(randomNumberInt);
        System.out.println("BigDecimal (int 0-99): " + bigDecimal1);

        return bigDecimal1;
    }
}
