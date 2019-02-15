package com.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{

	
	private List<Observer> observer;
	private String message;
	private boolean changed;
	
	final Object MUTEX=new Object();
	
	public MyTopic() {
	this.observer=new ArrayList<>();
	}
	@Override
	public void register(Observer observer) {
	
	
	}

	@Override
	public void unregister(Observer observer) {
		
	}

	@Override
	public void notifyObservers() {
		
	}

	@Override
	public Object getUpdate(Observer observer) {
		return null;
	}
	

}
