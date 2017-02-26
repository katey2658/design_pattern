package adapter;

/**
 * 这个适配器是关于对象的适配。我们想要一个对象，但是我们本身只有一个另外的对象
 * 于是我们把这个拥有的对象交给适配器，它帮我们拓展功能，成为想要的对象
 *
 * 补充：关于装饰者模式和适配器模式区别，前者是使用者知道我们拥有的对象，并有知道添加了的功能
 * 而适配器模式是对于使用者来只需要得想要的结果对象，对于怎么来的，添加了哪些功能并不关心
 */
public class Adapter{
  private ConcreteComponent component;

  public Adapter(ConcreteComponent component){
    this.component=component;
  }

  public void operaionMethod1(){
    component.operaionMethod1();
  }
  public void operaionMethod1(){
    //do mething
  }
}
