package com.busyzero.observer.function;

public class LeMonde implements Observer{
  public void notify(){
    if(tweet!=null&&tweet.contains("wine")){
      System.out.println("Breaking news in NY!"+tweet);
    }
  }
}
