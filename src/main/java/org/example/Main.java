package org.example;

import org.example.strategy.IcmsTax;
import org.example.strategy.IpvaTax;
import org.example.strategy.IssTax;
import org.example.strategy.Tax;
import org.example.strategy.enums.TaxType;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // adiciona todos os impostos e suas respectivas classes para serem instanciadas
        final Map<String, Tax> mapsTax = Map.of(
                TaxType.ISS.getDisplayName(), new IssTax(),
                TaxType.IPVA.getDisplayName(), new IpvaTax(),
                TaxType.IPTU.getDisplayName(), new IpvaTax(),
                TaxType.ICMS.getDisplayName(), new IcmsTax()
        );

        // ao selecioanr a classe ICMS, nos chamaremos automaticamente o médoto calculate dentro desta classe.
        // para ter uma visualização disso, adicione breakpoint em cada uma delas e acompanhe a execução
        BigDecimal retorno = mapsTax.get(TaxType.ICMS.getDisplayName()).calculate(new BigDecimal(BigInteger.valueOf(12000)));
        System.out.println(retorno.doubleValue());
    }
}