package com.busyzero.chainofresponsibility.function;

public abstract class ProcessingObject<T>{
  protected ProcessingObject<T> susslor;

  public void setSucessor(ProcessingObject<T> successor){
    this.successor=successor;
  }

  public T handle(T input){
    T r=handleWork(input);
    if(successor!=null){
      return successor.handle(r);
    }
    return r;
  }

  abstract protected T handle(T input);
}
