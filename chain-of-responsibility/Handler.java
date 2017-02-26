package chainofresponsibility;

public abstract class Handler{

  protected Handler successor;

  abstract void handlderRequest();

  public void setSuccessor(Handler successor){
    this.successor=successor;
  }

  public Handler getSuccessor(String request){
    return this.successor;
  }

}
