package singleton;

/**
 * 静态内部类
 * 线程安全，静态内部类只会被加载一次,简单安全
 */
public class InnerStaticSingleton {
  private static class SingletonHolder {
    private static final SingletonHolder INSTANCE = new InnerStaticSingleton();
  }

  private InnerStaticSingleton(){}

  public static final InnerStaticSingleton getInstance() {
    return SingletonHolder.INSTANCE;
  }
}
