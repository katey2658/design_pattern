package template.example;

/**
 * 具体类：活期账户类
 */
public void CurrentAccount extends Account{
  @Override
  public void calculateInterest(){
    Console.writeLine("按活期利息计算");
  }
}
