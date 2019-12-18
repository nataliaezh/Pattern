package ru.geekbrains.pattern.homework_Lesson5.impl;

import ru.geekbrains.pattern.homework_Lesson5.Event;
import ru.geekbrains.pattern.homework_Lesson5.EventListener;

import java.io.File;

public class EmailNotoficationListener extends LogOpenListener implements EventListener {
    private String email;

    public EmailNotoficationListener(String email) {
         this.email = email;
    }


    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }

    @Override
    public void handleEvent(Event event) {

    }
}