package builder;

public class Director{

  private builder builder;

  public Director(Builder builder){
    this.builder=builder;
  }
  //构建各组件的过程
  public void construct(){
    builder.buildPartA();
    builder.buildPartB();
    builder.buildPartC();
  }
}
