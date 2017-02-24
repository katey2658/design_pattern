package singleton;

/**
 * 懒汉模式，线程安全
 * 优点：使用volatile关键字进行限制 保证其对所有线程的可见性，并且禁止对其进行指令重新序列化
 *      从语义上保证线程安全
 * 缺点：效率低下
 */
public class LazySafeSingleton {
  private volatile static LazySafeSingleton instance;

  private LazySafeSingleton() {}

// 同步
  public static synchronized LazySafeSingleton getInstance() {
    if (instance == null) {
      instance = new LazySafeSingleton();
    }
    return instance;
  }
}
