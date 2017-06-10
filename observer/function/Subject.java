package com.busyzero.observer.function;

public interface Subject{
  void registerObserver(Observer observer);
  void notifyObserver(String tweet);
}
