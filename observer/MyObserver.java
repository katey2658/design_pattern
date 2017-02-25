package oberver;
import java.util.Observer;

/**
 * 创建观察者类，需要继承Observer接口
 */
public class MyObserver implements Observer {

  /**
   * 实例化的时候需要参数 监察者对象
   * @param  Observerable observerable  [description]
   * @return              [description]
   */
  public MyObserver(Observerable observerable){
    observerable.add(this);
  }

  /**
   * 更新的时候观察者需要执行的事情
   * @param Observable o   [description]
   * @param Object     arg [description]
   */
  @Override
    public void update(Observable o, Object arg) {

        System.out.println("状态发生改变：" + ((Obserable)o).getData());
    }

}
