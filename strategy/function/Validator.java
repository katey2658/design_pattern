package com.busyzero.strategy.function;

/**
 * 验证器
 */
public class Validator{
  private final ValidationStrategy strategy;

  public Validator(ValidationStrategy strategy){
    this.strategy=strategy;
  }

  public boolean validate(String s){
    return strategy.execute(s);  
  }
}
