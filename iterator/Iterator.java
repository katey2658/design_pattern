package iterator;

/**
 * 迭代器接口
 */
public interface Iterator{
  /**
   * 将游标指向第一个元素
   */
  public void first();
/**
 * 将游标指向下一个元素
 */
  public void next();
/**
 * 判断是否还存在下一个元素
 * @return [description]
 */
  public boolean hasNext();

  /**
   * 获取游标指向的当前元素
   * @return [description]
   */
  public Object currentItem();

}
