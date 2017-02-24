package observer;

/**
 * 观察者抽象接口
 */
public interface PushObserver{
  /**
   * 更新方法
   * @param String newState [description]
   */
  void update(String newState);
  
}
