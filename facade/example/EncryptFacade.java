package facade.example;


/**
 * 加密外观类
 */
public  class EncryptFacade{
  private FileReader  reader;

  private CipheMachine cipher;

  private FileWriter writer;

  public EncryptFacade(){

    reader=new FileReader();

    cipher=new CipheMachine();

    writer=new FileWriter();
  }
/**
 * 其它对象调用的方法
 * @param String fileNameSrc  [description]
 * @param String fileNameDesc [description]
 */
  public  void fileEncrypt(String fileNameSrc,String fileNameDesc){
    String plainText=reader.read(fileNameSrc);
    String encryptStr=cipher.encrypt(plainText);
    writer.write(encryptStr,fileNameDesc);
  }
}
