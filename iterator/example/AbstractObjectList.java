package iterator.example;

/**
 * 抽象聚合类
 */
public abstract class AbstractObjctList{
  protected List<Object> objects=new ArrayList<Object>();

  public AbstractObjctList(List objects){
    this.objects=objects;
  }

  public void addObject(Object obj){
    this.objects.add(obj);
  }

  public void removeObject(Object obj){
    this.objects.remove(obj);
  }

  public void getObjects(){
    return this.objects;
  }

  /**
   * 声明式创建迭代器对象抽象工厂方法
   */
  abstract AbstractObjectList createIterator();
}
