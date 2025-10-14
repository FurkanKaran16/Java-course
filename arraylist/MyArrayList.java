package arraylist;

public class MyArrayList<E>{
  // özellikler
  private E[] aList; // liste oluşturulur
  private int kapasite;
  private int elemansayisi;
  // metodlar

  // constructor (yapıcı fonk başlangıç değeri atanır)
  
  // Java'da diziler, çalışma zamanında (runtime) hangi türden olduklarını bilirler (Bu özelliğe reification denir). Ancak Jenerikler (yani <E>), derleme sonrasında tür bilgisini siler (Type Erasure).
  // Java, çalışma zamanında new E[3] gibi bir ifade oluşturamaz, çünkü derleme bittiğinde E'nin hangi tür olduğunu bilmez.
  //Bu nedenle, bir Jenerik liste (ArrayList gibi) oluştururken, önce en genel tür olan Object dizisi oluşturulur (new Object[3]), ardından bu dizi Jenerik türe (E[]) zorla dönüştürülür (cast edilir). Bu zorlama sırasında derleyici, gelecekte bir çalışma zamanı hatası oluşabileceği konusunda sizi uyarır.
  
  //@SuppressWarnings("Unchecked") 
  public MyArrayList(){
    this.aList = (E[]) new Object[3];
    this.kapasite = 3;
    this.elemansayisi = 0;

  }
  // eleman ekleme (sona)
  public boolean ekle(E e){
    this.aList[elemansayisi] = e;
    elemansayisi++;
    return true;
  }
  // Stringe çevir
  public String toString(){
    String sonuc ="";
    for(int i=0;i<elemansayisi;i++){
      sonuc += aList[i].toString();
      
    }
    return sonuc;
  }
  
  private boolean doluMu(){
    if (this.elemansayisi == this.kapasite) {
      return true;
    }
    else{
      return false;
    }
  }

  private boolean kapasiteArttir(){
    E[] temp = (E[]) new Object[this.kapasite*2];
    for (int i = 0;this.elemansayisi;i++) // ...
  }

}

