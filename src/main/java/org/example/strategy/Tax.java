package org.example.strategy;

import java.math.BigDecimal;

// this calss has been the main behavior metohd in use for all taxes.
public interface Tax {

    BigDecimal calculate( BigDecimal amount);
}
