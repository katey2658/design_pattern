package prototype.example;

/**
 * 可行性分析报告
 */
public class FAR implements OfficialDocument{

  @Override
  public OfficialDocument clone(){
    OfficialDocument far=null;
    try {
      far=(OfficialDocument)super.clone();
    }catch(CloneNotSupportedExcepton e){
      //不支持复制
    }
    return far;
  }

  public void display(){
    //打印显示
  }
}
