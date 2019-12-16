package ru.geekbrains.pattern.homework_Lesson5.impl;

import ru.geekbrains.pattern.homework_Lesson5.Event;
import ru.geekbrains.pattern.homework_Lesson5.EventListener;
import ru.geekbrains.pattern.homework_Lesson5.EventManager;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager() {
            @Override
            public void publishEvent(Event event) {

            }

            @Override
            public void registerListener(String listenerKey, EventListener listener) {

            }

            @Override
            public void unregisterListener(String listenerKey) {

            }

            @Override
            public void subscribe(String open, LogOpenListener logOpenListener) {

            }

            @Override
            public void notify(String open, File file) {

            }
        };
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}