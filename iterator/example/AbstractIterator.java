package iteator.example;

public interface AbstractIterator{
  /**
   * 移到下一个元素
   */
  public void next();
/**
 * 判断是否为最后一个元素
 * @return [description]
 */
  public boolean isLast();
/**
 * 移到上一个元素
 */
  public void previous();
/**
 * 是否是第一个元素
 * @return [description]
 */
  public boolean isFirst();

/**
 * 获取下一个元素
 * @return [description]
 */
  public Object getNextItem();
/**
 * 获取上一个元素
 */
  public Object getPreviousItem();


}
