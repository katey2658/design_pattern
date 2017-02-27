package builder;
/**
 * 构建者接口
 */
public interface Builder{
  /**
   * 构建部件A
   */
  void buildPartA();
  /**
   * 构建部件B
   */
  void buildPartB();
  /**
   * 构建部件C
   */
  void buildPartC();
  /**
   * 组装成产品
   * @return [description]
   */
  Product getResult();
}
