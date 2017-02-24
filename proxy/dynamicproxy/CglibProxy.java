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

  public Object getProxyInstance(Object target){
    this.target=target;
    Enhancer enhancer=new Enhancer();
    enhancer.setSuperclass(this.target.getClass());
    enhancer.setCallback(this);
    return enhancer.create();
  }

  @Override
  public Object intercept(Object target,Method method,Object[] args,MethodProxy proxy)throws Throwable{
    //do something
    Object obj=proxy.invokeSuper(target.args);
    //do something
    return obj;
  }
}
