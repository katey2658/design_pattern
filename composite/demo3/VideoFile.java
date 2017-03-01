package composite;

/**
 * 视频文件类：叶子构件
 */
public class VideoFile extends AbstractFile{
  private String name;

  public VideoFile(String name){
    this.name=name;
  }

  @Override
  public void add(AbstractFile file){
    //给出提示错误和异常
  }

  @Override
  public void remove(AbstractFile file){
    //给出错误提示和异常
  }

  @Override
  public void getChild(int i){
    //给出错误提示和异常
  }

  @Override
  public void killVirus(){
    //模拟查毒处理
  }
}
