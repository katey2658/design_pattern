package composite;

/**
 * 抽象组件
 */
public class Component{
  /**
   * 添加成员
   * @param Component c [description]
   */
  void add(Component c);
  /**
   * 删除成员
   */
  void remove(Component c);

  /**
   * 获取成员
   */
  Component getChild(int i);

  /**
  * 业务方法
  */
  void operation();

}
