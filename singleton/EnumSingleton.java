package singleton;

/**
 * 枚举：线程安全，可以防止反射强行调用构造器，提供自动序列化机制，防止反序列化的时候创建新对象（Effective Java 推荐）
 * android jdk 都是jdk1.6以上，还加了锁优化，推荐双重检验锁法
 */
public enum  EnumSingleton() {
  INSTANCE;

  public void whateverMethod(){}
}
