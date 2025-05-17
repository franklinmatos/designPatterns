package org.example.strategy.enums;

public enum TaxType {

    ICMS("ICMS"),
    IPVA("IPVA"),
    IPTU("IPTU"),
    ISS("ISS");

    private final String displayName;

    TaxType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static String getDisplayName(TaxType taxType) {
        return taxType.displayName;
    }
}
