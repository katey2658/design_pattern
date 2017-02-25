package observer;
import java.util.Observerable;

/**
 * 设置监察者，当状态量发生改变的时候需要通知观察者
 */
public class MyObserable extends Observerable {
  //状态量
  private String state;

  public String getData(){
    return this.state;
  }

/**
 * [setData 设置更新状态的时候]
 * @param String state [description]
 */
  public void setData(String state){
    //dosomething
    this.state=state;
    setChanged();//一定要调用这个方法
    notifyObservers();//通知更新
  }

}
