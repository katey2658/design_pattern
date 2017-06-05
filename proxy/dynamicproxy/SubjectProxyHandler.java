package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 创建一个处理类，
 */
public class SubjectProxyHandler implements InvocationHandler {

  /**
   * 被代理对象
   */
  private Object obj;
  /**
   * 传入代理对象：之后可以使用
   * @param  Object obj           [description]
   * @return        [description]
   */
  public JDKDynamicSubjectProxy(Object obj){
    this.obj=obj;
  }

/**
 * 当代理对象被调用时候
 * @param  Object    代理对象
 * @param  Method    被调用方法
 * @param  Object[] 参数对象
 * @return  方法调用后的返回值
 * @throws Throwable [description]
 */
  public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
    //do something
    method.invoke(obj,args);
    //do something
    renturn null;
  }
}
