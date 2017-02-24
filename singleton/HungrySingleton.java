package singleton;

/**
 * 饿汉模式
   优点：避免了多线程的同步问题，线程安全,编写简单
   缺点：无法做到延迟创建对象。在很多情况下我们都希望对象能够尽可能的延迟加载，从而减小负载
 */
public class HungrySingleton {
  private final static HungrySingleton instance = new HungrySingleton();

  private HungrySingleton() {}

  public static HungrySingleton getInstance() {
    return instance;
  }
}
