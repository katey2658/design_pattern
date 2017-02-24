package observer;

/**
 * 主题具体实现类
 */
public class ConcretePushSubject extends Subject{

  private string state;

  /**
   * 获取状态
   * @return [description]
   */
  public int getState(){
    return this.state;
  }

  /**
   * 1.当状态发生改变的时候
   * [changeState 当状态改变的时候需要通知其它进行更新]
   * @return [description]
   */
  public void changeState(string newState){
    this.state=newState;
    this.notifyObservers(newState);
    return;
  }
}
