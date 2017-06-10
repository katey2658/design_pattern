package  com.busyzero.chainofresponsibility.function;

public void ProcessingObjectTest{
  public void old(){
    ProcessingObject<String> p1=new HeaderTextProcessing();
    ProcessingObject<String> p2=new SpellCheckerProcessing();

    p1.setSucessor(p2);
    String result=p1.handle("Aren't ladbs really sexy?");

    System.out.println(result);
  }

  public static void main(String[] args) {
  }
}
