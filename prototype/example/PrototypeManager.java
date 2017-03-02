package prototype.example;

/**
 * 原型管理器（使用饿汉单例模式)
 */
public  class PrototypeManager{

  //定义一个Hashtable 用于存储原型
  private Hashtable ht=new Hashtable();

  private static PrototypeManager pm=new PrototypeManager();

  //添加公文对象
  private PrototypeManager(){
    ht.put("far",new FAR());
    ht.put('srs',new SRS());
  }

  public void addOfficialDocument(String key,OfficialDocument doc){
    ht.put(key,doc);
  }
/**
 * 通过浅拷贝获取新的对象
 * @param  String key           [description]
 * @return        [description]
 */
  public OfficialDocument getOfficialDocument(String key){
    return ((OfficialDocument)ht.get(key)).clone());
  }
  public static PrototypeManager getPrototypeManager(){
    return this.pm;
  }

}
