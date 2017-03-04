package iterator.example;

/**
 * 数据聚合类：迭代器是一个内部类
 */
public class ProductListInner extends AbstractoObjectList{

  public ProductList(List products){
    super(products);
  }

  public AbstractIterator createIterator(){
    return new ProductIterator();
  }

  /**
   * 创建内部迭代器类
   */
   private class ProductIterator implements AbstractIterator{
     private int cursor1;
     private int cursor2;

     public ProductIterator(){
       cursor1=0;
       cursor2=objects.size()-1;
     }

     public void next(){
       if(cussor1<objects.size()){
         cursor1++;
       }
     }

     public boolean isLast(){
       return (cussor1==objects.size());
     }

     public void previous(){
       id (cursor2>-1){
         cursor2--;
       }
     }

     public boolean isFirst(){
       return (cursor2==-1);
     }

     public Object getNextItem(){
       return objects.get(cussor1);
     }
     
     public Object getPreviousItem(){
       return objects.get(cursor2);
     }
   }
}
