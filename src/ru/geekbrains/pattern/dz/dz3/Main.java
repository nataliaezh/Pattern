package ru.geekbrains.pattern.dz.dz3;

public class Main {
    public Money getSupplierPrice(String supplierName, Payment payment) throws Exception {

        ExchangeFactory exchangeFactory = Fabric.getInstance().createFactory(supplierName);

        // создать фабрикой конкретного поставщика его провайдер некоторых услуг
        SourceDocProvider sourceDocProvider = exchangeFactory.createSourceDocProvider();

        // получить услугу
        Money bill = sourceDocProvider.sendBill(payment);
        return bill;

    }
}
