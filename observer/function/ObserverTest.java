package com.busyzero.observer.function;

public class ObserverTest{
  /**
   * 旧的使用方法
   */
  public static void old(){
    Feed f=new Feed();
    f.registerObserver(new NYTimers());
    f.registerObserver(new Guardian());
    f.registerObserver(new LeMonde());
    f.notifyObserver("the queen said her favourite book is java 8 in Action")
  }

  public static void main(String[] args) {
    Feed f=new Feed();
    f.registerObserver((String tweet)->{
      if(tweet!=null&&tweet.contains("money")){
        System.out.println("Breaking news in NY! "+tweet);
      }
    });
    f.registerObserver((String tweet)->{
      if(tweet!=null&&tweet.contains("queen")){
        System.out.println("Yet another news in London..."+tweet);
      }
    })
  }
}
