package ru.geekbrains.pattern.dz.dz3;

public class Fabric {

    public static final String SUPPLIER_ONE = "Частное лицо";
    public static final String SUPPLIER_TWO = "Юридическое лицо";

    public ExchangeFactory createFactory(String name) throws Exception {
        switch (name) {
            case SUPPLIER_ONE:
                return new PrivateCustomerExchangeFactory();
            case SUPPLIER_TWO:
                return new LegalEntityExchangeFactory();
        }
        return null;
    }

    private static Fabric instance = new Fabric();

    public static Fabric getInstance() {
        return instance;
    }

    private Fabric() {
    }


}