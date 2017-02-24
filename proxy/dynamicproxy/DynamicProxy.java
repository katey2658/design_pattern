package proxy.dynamicproxy;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Constructor;

/**
 * JDK动态代理和Cglib动态代理
 * [DynamicProxy 动态代理模式]
 * @author 11456
 */
public class DynamicProxy(){

  /**
   * 被代理对象需要集成接口
   * [getJDKProxySubject 根据JDK动态代理获取对象代理]
   * @return [代理对象]
   */
  public Subject  getJDKProxySubject(){
    //创建我们需要代理的对象
    Subject subject=new RealSubject();
    InvocationHandler handler=new SubjectProxyHandler(subject);
    Class subs=subject.getClass();
    //获取代理
    return (Subject)Prox.newProxyInstance(subs.getClassLoader(),subs.getInterfaces(),handler);
  }

  /**
   * cglib动态代理不需要代理对象继承某一个接口，它使用继承的方法来实现动态代理
   * [getCglibProxyObj 使用cglib代理实现动态代理]
   * @return [代理对象]
   */
  public Object getCglibProxyObj(){
    CglibProxy proxy=new CglibProxy();
    RealSubject2 subject=proxy.getProxyInstance(new RealSubject2());
    renturn subject;
  }
}
