package prototype;

/**
 * 工作周报原型，Object作为原型，浅拷贝
 */
public class WeeklyLog implements Cloneabel{

  private String name;

  private String date;

  private String content;

  private Attachment attachment;

  public void setAttachment(Attachment attachment){
    this.attachment=attachment;
  }

  public void getAttachment(){
    return this.attachment;
  }

  public void setName(String name){
    this.name=name;
  }

  public void setDate(String date){
    this.date=date;
  }


  public void setContent(String content){
    this.content=content;
  }

  public String getName(){
    return this.name;
  }

  public String getDate(){
    return this.date;
  }

  public String getContent(){
    return this.content;
  }

  /**
   * 使用java语言进行复制
   * @return [description]
   */
  @Override
  public WeeklyLog clone(){
    Object obj=null;
    try{
      obj=super.clone();
      return (WeeklyLog)obj;
    }ctach(CloneNotSupportedException e){
      //不支持
      return null;
    }
  }
}
