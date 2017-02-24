package singleton;
/**
 * 饿汉模式
 */
public class HungryPlusSingleton {
  private HungryPlusSingleton instance = null;

  static {
    instance = new HungrySingleton();
  }

  private HungryPlusSingleton() {}

  public static HungrySingleton getInstance() {
    return this.instance;
  }
}
