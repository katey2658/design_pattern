package decorator;

/**
 * 装饰者接口（可以是抽象类），可以做适当增强，添加方法和属性
 */
public interface Decorator extends Component{
  /**
   * [methodM 装饰需要增加的方法]
   */
  void methodM();

}
