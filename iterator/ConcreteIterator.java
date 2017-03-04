package iterator;


/**
 * 具体迭代器类中
 */
public class ConcreteIterator implements Iterator{
  /**
   * 维持一个对聚合对象的引用
   */
  private ConcreteAggregate objects;
  /**
   * 定义一个游标
   */
  private int cursor;

  public ConcreteAggregate(ConcreteAggregate objects){
    this.objects=objects;
  }
  @Override
  public void first(){}

  @Override
  public void next(){}

  @Override
  public boolean hasNext(){}

  @Override
  public Object currentItem(){}
}
