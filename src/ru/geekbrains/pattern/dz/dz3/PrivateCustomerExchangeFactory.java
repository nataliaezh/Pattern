package ru.geekbrains.pattern.dz.dz3;

public class PrivateCustomerExchangeFactory implements ExchangeFactory {
    @Override
    public SourceDocProvider createSourceDocProvider() {
        return new PrivateCustomerSourceDocProvider();
    }

    @Override
    public TranslationProvider createTranslationProvider() {
        return new PrivateCustomerTranslationProvider();
    }
}
