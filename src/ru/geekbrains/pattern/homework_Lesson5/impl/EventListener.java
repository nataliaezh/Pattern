package ru.geekbrains.pattern.homework_Lesson5.impl;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}