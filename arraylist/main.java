package arraylist;
//import java.util.ArrayList; // javadan hazır arraylist özellikleri gelir 

public class main {
  public static void main(String[] args) {
    MyArrayList<Integer> MyList = new MyArrayList<>();
    MyList.ekle(1);
    System.out.println("MyList: "+ MyList);
  }
  
}

    
    
    
    
    
    
    
    
    // Hazır ArrayList yapısı
      // ArrayList<Integer> ArrList=new ArrayList<>();
      // ArrList.add(7);
      // System.out.println("ArrayList: "+ ArrList);
      // ArrList.add(16);
      // ArrList.add(14);
      // //ArrList.remove(-1);
      // Integer num=19;
      // ArrList.add(num);
      // ArrList.remove(num);
      // System.out.println("ArrayList: "+ ArrList);