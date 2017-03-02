package prototype.example;


/**
 * 软件需求规格说明书书
 */
public class SRS implements OfficialDocument{

 @Override
  public OfficialDocument clone(){
    OfficialDocument srs=null;
    try {
      srs=(OfficialDocument)super.clone();
    }catch (CloneNotSupportedExcepton e) {
      //提醒不可复制或者抛出异常
    }
    return srs;
  }

  public void display(){
    //显示：软件需求规格说明书
  }
}
