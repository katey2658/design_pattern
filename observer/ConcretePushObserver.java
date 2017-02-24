package observer;

/**
 * 具体的观察者对象类
 */
public class ConcretePushObserver implements Observer{
  /**
   * 本地状态量
   */
  private String state;

/**
 * 客户端在被通知状态更新后，执行的方法
 * @param String newState [description]
 */
  @Override
  public void update(String newState){
    this.state=newState;
    System.out.println("客户状态已经改变：是"+newState);
  }
}
