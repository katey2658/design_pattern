package prototype;

/**
 * 工作周报原型
 */
public class WeeklyLogDeepClone implements Serializable{

  private String name;

  private String date;

  private String content;

/**
 * 使用序列化技术实现深拷贝
 * 补充：Cloneabel 和Serializable 都是空接口
 */
  public WeeklyLogDeepClone deepClone() throws IOException,ClassNotFoundException,OptionDataException{
    //将对象写入流中
    ByteArrayOutStream bao=new ByteArrayOutStream();
    ObjectOutputStream oos=new ObjectOutputStream(bao);
    oos.writeObject(this);

    //将对象从流中取出
    ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
    ObjectInputStream ois =new ObjectInputStream(bis);
    return (WeeklyLogDeepClone)ois.readObject();
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
}
