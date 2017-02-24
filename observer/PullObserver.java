package observer;

/**
 * 观察者接口，实现的是拉模型
 */
public interface PullObserver{

  void update(PullSubject subject);
}
