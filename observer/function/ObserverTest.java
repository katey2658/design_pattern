package com.busyzero.observer.function;

public class ObserverTest{
  public static void main(String[] args) {
    Feed f=new Feed();
    f.registerObserver(new NYTimers());
    f.registerObserver(new Guardian());
    f.registerObserver(new LeMonde());
    f.notifyObserver("the queen said her favourite book is java 8 in Action")
  }
}
