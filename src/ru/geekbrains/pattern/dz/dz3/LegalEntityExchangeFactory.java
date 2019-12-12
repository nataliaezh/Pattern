package ru.geekbrains.pattern.dz.dz3;

public class LegalEntityExchangeFactory implements ExchangeFactory {
    @Override
    public SourceDocProvider createSourceDocProvider() {
        return new LegalEntitySourceDocProvider();
    }

    @Override
    public TranslationProvider createTranslationProvider() {
        return new LegalEntityTranslationProvider();
    }
}
