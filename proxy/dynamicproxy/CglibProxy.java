package proxy.dynamicproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * cglib动态代理类
 */
public class CglibProxy implements MethodInterceptor{
  private Object target;

 /**
  * 被代理的目标对象
  * @param  Object target        [description]
  * @return        [description]
  */
  public Object getProxyInstance(Object target){
    this.target=target;
    Enhancer enhancer=new Enhancer();
    enhancer.setSuperclass(this.target.getClass());
    enhancer.setCallback(this);
    //获得一个子类对象
    return enhancer.create();
  }

/**
 * 代理对象的方法被调用
 * @param  Object      target        [description]
 * @param  Method      method        [description]
 * @param  Object[]    args          [description]
 * @param  MethodProxy proxy         [description]
 * @return             [description]
 * @throws Throwable   [description]
 */
  @Override
  public Object intercept(Object target,Method method,Object[] args,MethodProxy proxy)throws Throwable{
    //do something
    Object obj=proxy.invokeSuper(target,args);
    //do something
    return obj;
  }
}
