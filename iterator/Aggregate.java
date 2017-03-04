package iterator;

/**
 * 抽象聚合类接口：
 * 负责存储数据集；返回具体聚合类中的具体迭代对象
 */
public interface Aggregate{
  
  Iterator createIterator();
}
