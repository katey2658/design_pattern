package bridge.example;

/**
 * 桥接客户端
 */
public  class BridgeClient{

  public static void main(String[] args) {
    //创建一个客户端，构建一个我们想要的对象
    Transmission transmission=new Transmission();
    AbstractCar abstractor=new AbstractCar();
    abstractor.setTransmission(transmission);

    //同理，同样可以创建其它能不一样跑的，不同类型发动机的车

  }

}
