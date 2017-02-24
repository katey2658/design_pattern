package observer;

/**
 * 关于一个主题的抽象类
 * @author 11456
 */
public abstract class PushSubject{

  private List<PushOberver> observerList;
  /**
   * [attach 注册一个对象到监视者中]
   * @param Oberver observer [description]
   */
  protected void attach(Oberver observer){
    if(observerList==null){
      observerList=new ArrayList();
    }
    observerList.add(oberver);
  }
  /**
   * [detach 将观察者从列表中去除]
   * @param Observer oberver [description]
   */
  protected void detach(Observer oberver){
    observerList.remove(oberver);
  }

/**
 * [notifyObservers 通知所有的注册对象中状态已经更新]
 * @param PushOberver observer [description]
 */
  public void notifyObservers(String newState){
    //将注册列表中的所有注册者通知更新状态
    for (PushOberver oberver:observerList){
      observer.update(newState);
    }
  }
}
