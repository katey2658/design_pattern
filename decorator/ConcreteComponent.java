package decorator;

/**
 * 具体的需要被装饰的对象
 */
public class ConcreteComponent implements Component{
  /**
   * 内部属性
   */
  private String data;

  @Override
  public void methodA(){
    //do something
  }

  @Override
  public void methodB(){
    //do something
  }

  public void setData(String data){
    this.data=data;
  }

  public String getData(){

  }
}
