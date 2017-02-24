package observer;

/**
 * 主题具体实现类
 */
public class ConcreteSubject extends Subject{

  private string state;

  public int getState(){
    return this.state;
  }

  /**
   * [changeState 当状态改变的时候需要通知其它进行更新]
   * @return [description]
   */
  public changeState(string newState){
    this.state=newState;
    this.notifyObservers();
    return;
  }

}
