package composite;


/**
 * 容器构件：
 * 在容器构件中实现了抽象构件中的声明的所有方法，既包括业务方法，也包括管理成员子构件的方法
 * 注意：实现具体业务方法时候，由于容器构件中仍然是容器角色，包含容器构架，因此它将调用
 * 其成员构件的业务方法。在组合模式结构中，由于容器构件中任然可以包含容器构件，因此在对容器构件进行
 * 处理时候需要使用递归算法，在容器的operation()中继续递归调用成员构件的operatio()
 */
public class Composite{
  private ArrayList<Component> list=new ArrayList<Component>();

  private void add(Component c){
    list.add(c);
  }

  public void remove(Component c){
    list.remove(c);
  }

  public Component getChild(int i){
    return (Component)list.get(i);
  }
  public void operation(){
    //容器构件具体业务方法的实现
    //递归调用成员构件的业务方法
    for(Object Object:list){
      ((Component)obj).operation();
    }
  }
}
