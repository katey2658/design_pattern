package com.busyzero.strategy.function;

/**
 * 检查是否全部是小写
 */
public class IsAllLowerCase implements ValidationStrategy {
  @Override
  public boolean execute(String s){
    return s.matches("[a-z]+");
  }
}
