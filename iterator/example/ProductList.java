package iterator.example;

/**
 * 商品聚合类：具体聚合类
 */
public class ProductList extends AbstractObjctList{
  public ProductList(List products){
    super(products);
  }
/**
 * 实现创建迭代器的具体工厂方法
 */
  public AbstractIterator createIterator(){
    return new ProductIterator(this);
  }


}
