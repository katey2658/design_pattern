package facade.example;

/**
 * 数据加密类，从当子系统类
 */
public class CipheMachine{
  public String Encrypt(String plainText){
    Console.write("数据加密，将明文转换为密文");
    String es="";
    char[] chars=plainText.toCharArray();
    foreach(char ch in chars){
      String c=(ch%7).toString();
      es+=c;
    }
    Console.writeLine(es);
    return es;
  }

}
