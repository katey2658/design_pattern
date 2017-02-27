package bridge.example;

/**
 * 具体的车型类A
 */
public class ConcreteCarA extends AbstractCar{

  @Override
  public void run(){
    gear.gear();
    //do something
  }
}
