package strategy;

public class Component{
  /**
   * 策略的引用，实际上策略模式就是面向接口编程的一个典型应用
   */
  private Strategy strategy;

/**
 * 构造方法中需要传递一个具体的策略实现
 * @param  Strategy
 * @return
 */
  public Component(Strategy strategy){
    this.strategy=strategy;
  }

  /**
   * 可以在上下文中使用策略实现
   * @return [description]
   */
  public void domething(){
    //do something
    strategy.algorithm();
  }

}
