package facade.example;

/**
 * 文件读取类
 */
public class FileReader{
  public  string Read(String fileNameSrc){
    Console.write("读取文件");
    FileStream fs=null;
    StringBuffer sb=new StringBuffer();
    try{
      fs=new FileStream(fileNameSrc,FileMode.Open);
      int data;
      while((data=fs.readByte())!=-1){
        sb=sb.append((char)data);
      }
      fs.close();
      Console.writeLine(sb.toString);
    }catch (FileNotFoundException e) {
      //文件不存在
    }catch(IOException e){
      //文件操作错误
    }
    return sb.toString();
  }
}
