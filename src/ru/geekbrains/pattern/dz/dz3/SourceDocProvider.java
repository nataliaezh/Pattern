package ru.geekbrains.pattern.dz.dz3;

public interface SourceDocProvider {
    Doc getDoc(int id);
    Money sendBill(Payment payment);

}
