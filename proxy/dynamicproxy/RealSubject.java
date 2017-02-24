package proxy.staticproxy;

/**
 * 真实的类，该类需要被代理
 */
public class ReadSubject implements Subject{

  public void whateverMethod(){
    //do some thing
  }
}
