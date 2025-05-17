package org.example;

import org.example.strategy.ICMS;
import org.example.strategy.IPVA;
import org.example.strategy.ISS;
import org.example.strategy.Tax;
import org.example.strategy.enums.TaxType;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // adiciona todos os impostos e suas respectivas classes para serem instanciadas
        final Map<String, Tax> mapsTax = Map.of(
                TaxType.ISS.getDisplayName(), new ISS(),
                TaxType.IPVA.getDisplayName(), new IPVA(),
                TaxType.IPTU.getDisplayName(), new IPVA(),
                TaxType.ICMS.getDisplayName(), new ICMS()
        );

        // ao selecioanr a classe ICMS, nos chamaremos automaticamente o médoto calculate dentro desta classe.
        // para ter uma visualização disso, adicione breakpoint em cada uma delas e acompanhe a execução
        BigDecimal retorno = mapsTax.get(TaxType.ICMS.getDisplayName()).calculate(new BigDecimal(BigInteger.valueOf(12000)));
        System.out.println(retorno.doubleValue());
    }
}