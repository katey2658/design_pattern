package com.busyzero.chainofresponsibility.function;

public class HeaderTextProcessing extends ProcessingObject<String>{
  public String handleWork(String text){
    return "from Raoul ,Mario and Alan :"+text;
  }
}
