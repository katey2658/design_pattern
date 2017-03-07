package template;

/**
 * 抽象类，抽象类中定义了模板的方法和步骤，又给予了子类一定的按照自己实现的地方
 */
public abstract class AbstractClass{
  /**
   * 模板方法
   * @return [description]
   */
  pulbic void templateMethod(){
    primitveOperation1();
    primitveOperation2();
    primitveOperation3();
  }

/**
 * 钩子方法：子类可以加以拓展
 */
  void primitveOperation1(){
    return;
  }
  /**
   * 需要子类根据自己情况类实现
   */
  void primitveOperation2();

/**
 * 具体方法：有默认实现，可以重写
 */
  void primitveOperation3(){

    //do something
    return;
  }
}
