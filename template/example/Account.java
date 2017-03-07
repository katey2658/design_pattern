package template.example;

abstract class Account{

/**
 * 基本方法
 */
  public bool validate(String account,String password){
    Console.writeLine("账号：{0}",account);
    Console.writeLine("密码:{1}",password);
    //模拟登录
    if(account.Equals("张无忌")&&password.Equals("12345")){
      return true;
    }else{
      return false;
    }
  }
/**
 * 基本方法：抽象方法
 */
  public abstract void calculateInterest();

  public void handle(String account,String password){
    if (!validate(account,password)) {
      Console.writeLine("账号或者密码有错");
      return ;
    }
    calculateInterest();
    display();
  }

}
