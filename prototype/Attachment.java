package prototype;

import  java.io.*;


/**
 * 附件类
 */
public class Attachment implements Serializable{
  private String name;
  public void setName(String name){
    this.name=name;
  }

  public String getName(){
    this.name;
  }

  public void download(){
    //下载附件，附件名字
  }
}
