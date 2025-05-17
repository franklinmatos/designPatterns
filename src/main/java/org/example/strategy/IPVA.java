package org.example.strategy;

import java.math.BigDecimal;

public class IPVA implements Tax {
    @Override
    public BigDecimal calculate(BigDecimal amount) {
        // Define a taxa de 4% como um BigDecimal
        BigDecimal taxRate = new BigDecimal("0.04");
        return amount.multiply(taxRate);
    }
}
