package org.example.strategy;

import java.math.BigDecimal;

public class IptuTax implements Tax{
    @Override
    public BigDecimal calculate(BigDecimal amount) {
        // Define a taxa de 0.5% como um BigDecimal
        BigDecimal taxRate = new BigDecimal("0.005");
        return amount.multiply(taxRate);
    }
}
