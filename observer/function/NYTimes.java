package com.busyzero.observer.function;

public class NYTimers implements Observer{
  public void notify(String tweet){
    if(tweet!=null&&tweet.contains("money")){
      System.out.println("Breaking news in NY!"+tweet);
    }
  }
}
