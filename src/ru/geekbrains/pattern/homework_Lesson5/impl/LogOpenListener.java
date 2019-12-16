package ru.geekbrains.pattern.homework_Lesson5.impl;

import ru.geekbrains.pattern.homework_Lesson5.Event;
import ru.geekbrains.pattern.homework_Lesson5.EventListener;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    public LogOpenListener() {
    }

    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }

    @Override
    public void handleEvent(Event event) {

    }
}