package com.busyzero.observer.function;

public class Guardian implements Oberver{
  public void notify(String tweet){
    if(tweet!=null&&tweet.contains("queen")){
      System.out.println("Breaking news in NY!"+tweet);
    }
  }
}
