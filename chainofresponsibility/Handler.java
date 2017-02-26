package chainofresponsibility;

/**
 * 处理者的抽象：
 */
public abstract class Handler{

  /**
   * 下一责任人：如果当前对象处理不了请求，那就需要交给下一个责任人
   */
  protected Handler successor;

  /**
   * 处理请求的抽象
   */
  abstract void handlderRequest();

/**
 * 设置下一责任人，最后会形成一条链
 * @param Handler successor [description]
 */
  public void setSuccessor(Handler successor){
    this.successor=successor;
  }
  /**
   * 获取下一责任人
   * @param  String request       [description]
   * @return        [description]
   */
  protected Handler getSuccessor(String request){
    return this.successor;
  }

}
