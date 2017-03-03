package facade.example;

/**
 * 文件读写类
 */
public  class FileWriter{
  public void write(String encryptStr,String fileNameDesc){
    Console.writeLine("保存密文，写入文件！");
    FileStream fs=null;
    try{
      fs=new FileStream(fileNameDesc,FileMode.Create);
      byte[] str=Encoding.Default.GetBytes(encryStr);
      fs.write(str,0,str.length);
      fs.flush();
      fs.close();
    }catch (FileNotFoundException e) {
      //文件不存在
    }catch (IOException e){
      //文件操作错误
    }
  }
}
