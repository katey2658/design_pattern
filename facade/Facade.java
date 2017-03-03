package facade;


/**
 * 外观类中维持类对子系统对象的引用
 * 客户端可以通过外观类来间接调用子系统对象的业务方法，而无须与子系统对象进行直接交互
 */
public  class Facade{

  private SubSystemA obj1=new SubSystemA();
  private SubSystemB obj2=new SubSystemB();
  private SubSystemC obj3=new SubSystemC();

  public void Method(){
    obj1.methodA();
    obj2.methodB();
    obj3.methodC();

  }

}
