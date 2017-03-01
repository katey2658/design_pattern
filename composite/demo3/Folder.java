package composite;

public class Folder extends AbstractFile{

  private String name;
  //定义集合，用于存储抽象文件类型的成员
  private ArrayList<AbstractFile> fileList=new ArrayList<>();

  public Folder(String name){
    this.name=name
  }

  @Override
  public void add(AbstractFile file){
    fileList.add(file);
  }

  @Override
  public void remove(AbstractFile file){
    fileList.remove(file);
  }

  @Override
  public void getChild(int i){
    return (AbstractFile)fileList.get(i);
  }

  @Override
  public void killVirus(){
    //模拟查毒处理
    for (Object Object :fileList ) {
      (AbstractFile)Object.killVirus();
    }
  }
}
