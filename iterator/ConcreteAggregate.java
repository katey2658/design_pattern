package iterator;

/**
 * 具体聚合类
 */
public class ConcreteIterator{

  @Override
  public Iterator createIterator(){
    return new ConcreteIterator();
  }

}
