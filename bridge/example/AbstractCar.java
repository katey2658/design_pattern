package bridge.example;

/**
 * 抽象车，这是我们的顶层抽象
 * 桥接模式是为了将抽象部分和实现部分进行分离，从而可以相互独立的变化，减少维度间的耦合性
 */
public abstract class AbstractCar{

  /**
   * 发动机又可以重新抽象出来作为一个维度
   */
  protected Transmission gear;

  public abstract void run();

  public void setTransmission(Transmission gear){
    this.gear=gear;
  }

}
