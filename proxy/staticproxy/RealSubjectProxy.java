package proxy.staticproxy;

/**
 * 静态代理类
 * 该类和需要被代理的对象应该共同实现相同功能接口，
 * 来实现代码增强和防止直接操作者直接接触资源带来的不稳定
 */
public class RealSubjectProxy implements Subject{
  /**
   * 面向接口编程，减小了了代码的侵入性，实现适当分离，利于功能修改
   */
  private Subject subject;

  public RealSubjectProxy(Subject subject){
    this.subject=subject;
  }

  /**
   * 在这个地方，我们可以在执行目标之前和之后做对应的事情
   * 来实现对象功能的增强，安全性维护
   */
  public void whateverMethod(){
    //do something
    subject.whateverMethod();
    //do something
  }
}
