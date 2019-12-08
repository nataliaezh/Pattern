package ru.geekbrains.pattern.dz.dz3;

public class LegalEntitySourceDocProvider implements SourceDocProvider {
    @Override
    public Doc getDoc(int id) {
        return new Doc();
    }

    @Override
    public Money sendBill(Payment payment) {

        return null;
    }
}
