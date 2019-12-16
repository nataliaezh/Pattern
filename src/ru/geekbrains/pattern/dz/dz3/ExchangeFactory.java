package ru.geekbrains.pattern.dz.dz3;

public interface ExchangeFactory {
    SourceDocProvider createSourceDocProvider();
    TranslationProvider createTranslationProvider();
}
