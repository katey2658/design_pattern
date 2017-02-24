package observer;

/**
 * 观察者模式中的：拉模型
 *  PollModel
 */
class ConcretePullSubject extents Subject{
  /**
   * 状态量
   */
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
  public void changeState(){
    this.state=newState;
    this.notifyObservers(subject);
    return;
  }
}
