package decorator;

/**
 * 装饰者对象类，对对象进行功能增强
 * 关于装饰者模式和代理模式的区别：
 *    装饰者模式是对对象的增强。
 *   代理模式是对资源对象的限制，防止其直接接触资源。
 */
public class ConcreteDecorator implements Decorator{

  /**
   * 对需要装饰的对象的引用
   */
  private  Component component;

  public ConcreteDecorator(Component component){
    this.component=component;
  }

  @Override
  public void methodA(){
    component.methodA();
  }
  @Override
  public void methodB(){
    component.methodB();
  }

  @Override
  public void methodM(){
    //dosomething
  }
}
