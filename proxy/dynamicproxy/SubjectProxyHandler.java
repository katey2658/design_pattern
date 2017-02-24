package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 创建一个处理类，
 */
public class SubjectProxyHandler implements InvocationHandler {

  private Object obj;


  public JDKDynamicSubjectProxy(Object obj){
    this.obj=obj;
  }

  public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
    //do something
    method.invoke(obj,args);
    //do something
    renturn null;
  }

}
