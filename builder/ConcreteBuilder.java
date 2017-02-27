package builder;

/**
 * 具体的构建着，通过接口来构建和装配产品的部件
 * 定义明确它要创建的是什么具体的东西
 */
public class ConcreteBuilder implements Builder{

  private Part partA;

  private Part partB;

  private Part partC;

  public void buildPartA(){
    //build partA
  }

  public void buildePartB(){
    //build partB
  }

  public void buildPartC(){
    //build partC
  }

  public Product getResult(){
    //将各个部分进行组装返回
  }

}
