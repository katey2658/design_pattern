package chainofresponsibility;

/**
 * 具体的处理者
 */
public class ConcreteHandler extends Handler{

  /**
   * 执行来自客户的请求，如果能够处理，就处理，如果不能处理，就把这个请求交给下一个责任人
   * 对于客户来说，他只希望请求被处理，而不在乎是谁处理了请求
   * @param String request [description]
   */
  public void handlderRequest(String request){
    //如果能够处理，就处理如果不能处理就交给下一个责任人
    if (true) {
      System.out.println("Handler");
    }else{
      this.getSuccessor().handlderRequest(request);
    }
  }
}
