package ru.geekbrains.pattern.homework_Lesson5;

import ru.geekbrains.pattern.homework_Lesson5.impl.EmailNotoficationListener;
import ru.geekbrains.pattern.homework_Lesson5.impl.LogOpenListener;

import java.io.File;

public interface EventManager {

    void publishEvent(Event event);
    void registerListener(String listenerKey, EventListener listener);
    void unregisterListener(String listenerKey);

    void subscribe(String open, LogOpenListener logOpenListener);

    void notify(String open, File file);
}
