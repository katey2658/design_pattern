package com.busyzero.observer.function;

public class Feed implements Subject{
  private final List<Observer> observers=new ArrayList<>();

  public void registerObserver(Observer o){
    this.observers.add(o);
  }

  public void notifyObserver(String tweet){
    observers.forEach(o->o.notify(tweet));
  }
}
