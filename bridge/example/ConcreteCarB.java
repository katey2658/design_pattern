package bridge.example;

/**
 * 具体的车型类B
 */
public class ConcreteCarB extends AbstractCar{

  @Override
  public void run(){
    gear.gear();
    //do something
  }
}
