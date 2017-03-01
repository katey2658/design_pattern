package composite;

/**
 * 文件夹类
 */
public class Folder{
  private String name;

  private ArrayList<Folder> folderList=new ArrayList<>();

  private ArrayList<ImageFile> ImageList=new ArrayList<>();

  private ArrayList<TextFile> textList=new ArrayList<>();

  public Folder(String name){
    this.name=name;
  }
  /**
   * 添加文件夹
   * @param Folder folder [description]
   */
  public void addFolder(Folder folder){
    folderList.add(folder)
  }
  /**
   * 添加心的image成员
   * @param ImageFile image [description]
   */
  public void addImageFile(ImageFile image){
    imageList.add(image);
  }

  public void addTextFile(TextFile text){
    imageList.add(text);
  }


    TODO 需要添加几个方法进行文件的增删改查
  public void killVirus(){
    //模拟对文件杀毒
    //递归进行模拟杀毒
    for(Obejct object:folderList){
      (Folder)object.killVirus();
    }
    //递归模拟文件杀毒
    for (Object object:imageList ) {
      (ImageFile)object.killVirus();
    }
    //模拟对里面的文字进行杀毒
    for (Object object:textList ) {
      (TextFile)object.killVirus();
    }
  }

}
