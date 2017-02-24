package singleton;

/**
 * 双重检查锁形式
 * 优点：线程安全，提升了并发性，并且兼顾效率
 */
public class CheckAgainSingleton {
  //补充：1 volatile对内存的修改会马上写回主存，工作内存是线程独享的，主存是线程共享的
  //     2.可以禁止指令重排序列化。
  //       由于编译器优化，最后执行的代码可能和我们编写的顺序不同
  //       编译器只保证执行结果和源代码相同，并不保证实际指令的顺序和源代码相同
  //       在引入多线程的时候乱序可能会导致严重后果
  //关于这个volatile,jdk 1.5之后才可正常使用，对于jdk1.5之前所以这也是不乐观的
  private volatile static CheckAgainSingleton instance;

  private CheckAgainSingleton() {}

  public static CheckAgainSingleton getInstance() {
    if (instance == null) {
      synchronized (CheckAgainSingleton.class) {
        if (instance == null) {
          instance == new CheckAgainSingleton();
        }
      }
    }
    return instance;
  }
}
