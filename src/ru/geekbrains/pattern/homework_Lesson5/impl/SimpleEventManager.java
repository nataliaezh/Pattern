package ru.geekbrains.pattern.homework_Lesson5.impl;


import ru.geekbrains.pattern.homework_Lesson5.Event;
import ru.geekbrains.pattern.homework_Lesson5.EventListener;
import ru.geekbrains.pattern.homework_Lesson5.EventManager;

import java.io.File;

public class SimpleEventManager implements EventManager {

	private EventListener listener;

	@Override
	public void publishEvent(Event event) {
		if (listener != null) {
			listener.handleEvent(event);
		}
	}

	@Override
	public void registerListener(String listenerKey, EventListener listener) {
		this.listener = listener;
	}

	@Override
	public void unregisterListener(String listenerKey) {
		listener = null;
	}

	@Override
	public void subscribe(String open, LogOpenListener logOpenListener) {

	}

	@Override
	public void notify(String open, File file) {

	}
}
