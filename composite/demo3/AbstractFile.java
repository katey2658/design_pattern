package composite;

/**
 * 抽象文件类：抽象构件
 */
public abstract AbstractFile{
  /**
   * 添加子构件
   * @param AbstractFile file [description]
   */
  public abstract void add(AbstractFile file);
  /**
   * 移除文件
   * @param AbstractFile file [description]
   */
  public abstract void remove(AbstractFile file);

/**
 * 获取文件
 * @param  int i             [description]
 * @return     [description]
 */
  public abstract AbstractFile getChild(int i);
  /**
   * 模拟杀毒操作
   */
  public abstract void killVirus();
}
