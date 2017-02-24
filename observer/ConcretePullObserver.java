package observer;

/**
 * 具体的观察者对象类
 */
public class ConcretePullObserver implements Observer{
  /**
   * 本地状态量
   */
  private String state;

/**
 * 客户端在被通知状态更新后，执行的方法
 * @param String newState [description]
 */
  @Override
  public void update(PullSubject subject){
    this.state=subject.getState();
    System.out.println("客户状态已经改变：是"+this.state);
  }
}
