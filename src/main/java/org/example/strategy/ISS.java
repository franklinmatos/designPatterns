package org.example.strategy;

import java.math.BigDecimal;

public class ISS implements Tax{
    @Override
    public BigDecimal calculate(BigDecimal amount) {
        // Define a taxa de 3% como um BigDecimal
        BigDecimal taxRate = new BigDecimal("0.03");
        return amount.multiply(taxRate);
    }
}
