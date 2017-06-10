package com.busyzero.strategy.function;
/**
 * 测试
 */
public class StrategyTest {
  public static void main(String[] args) {
    Validator  numbericValidator=new Validator((String s)->s.matches("[a-z]+"));
    boolean b1=numbericValidator.validate("aaaaa");
    Validator lowerCaseValidator=new Validator((String s)->s.matches("\\d+"));
    boolean b2=lowerCaseValidator.validate("bbbbb");
  }
}
