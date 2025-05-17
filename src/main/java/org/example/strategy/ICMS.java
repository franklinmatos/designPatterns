package org.example.strategy;

import java.math.BigDecimal;

public class ICMS implements Tax{
    @Override
    public BigDecimal calculate(BigDecimal amount) {
        // Define a taxa de 13% como um BigDecimal
        BigDecimal taxRate = new BigDecimal("0.13");
        return amount.multiply(taxRate);
    }
}
