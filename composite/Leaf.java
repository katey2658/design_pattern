package composite;


/**
 * 抽象构件类的子类
 * 在叶子构件中需要实现在抽象构件类中声明的所有方法，包括业务方法以及管理和访问子构件
 * 的方法，但是叶子构件不能包含子构件，因此需要在叶子构件中实现构件管理和方法是需要提供
 * 异常处理和错误提示
 *
 */
public class Leaf extends Component{

  public void add(Component c){
    //异常处理或错误提示
  }

  public void remove(Component c){
    //异常处理或者错误提示
  }

  public Component getChild(int i){
    //异常处理或错误提示
  }
}
