package singleton;

/**
* 懒汉模式，线程不安全
* 优点:可以实现延迟加载，从而减小负载
* 缺点：线程不安全，可能导致重复创建对象
*/
public class LazyNotSafeSingleton {

  private static LazyNotSafeSingleton instance;

  private LazyNotSafeSingleton() {}

  public static LazyNotSafeSingleton getInstance() {
    if (instance == null) {
      instance = new LazyNotSafeSingleton();
    }
    return instance;
  }
}
