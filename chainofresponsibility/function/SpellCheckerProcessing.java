package com.busyzero.chainofresponsibility.function;

public class SpellCheckerProcessing extends ProcessingObject<String>{
  public String handleWork(String text){
    return text.replaceAll("labda","lambda");
  }
}
