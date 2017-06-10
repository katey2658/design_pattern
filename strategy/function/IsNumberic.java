package com.busyzero.strategy.function;

/**
 * 是不是一个数字
 */
public class IsNumberic implements ValidationStrategy{
  public boolean execute(String s){
    return s.matches("\\d+");
  }
}
