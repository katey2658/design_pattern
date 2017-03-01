package composite;

/**
 * 提供默认add remove getChild的实现，减少子类的实现，当然也可以直接移除这些
 * 其它不变
 */
public  abstract class AbstractFile{

  public void add(AbstractFile file){
    //给出提示错误和异常
  }

  public void remove(AbstractFile file){
    //给出错误提示和异常
  }
  public void getChild(int i){
    //给出错误提示和异常
  }

  public void killVirus();
}
