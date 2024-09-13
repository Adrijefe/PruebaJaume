import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {

        Producte p1 = new Producte("Albaricoques", 20);
        Producte p2 = new Producte("Bananas", 40);
        Producte p3 = new Producte("Berengenas", 15);
        Producte p4 = new Producte("Albertas", 10);
        Producte p5 = new Producte("Gisantes", 20);

        ArrayList<Producte> arrayList = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
         arrayList.add(p5);

        Iterator<Producte> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
         Producte p = iterator.next();
         System.out.println(p);
            }
        System.out.println("");


        arrayList.remove(p2);
        arrayList.remove(p3);

      Producte p6 = new Producte("Naranjas", 42);
      arrayList.add(arrayList.size()/2,p6);

     for (int i = 0; i < arrayList.size(); i++) {
         Producte p = arrayList.get(i);
         System.out.println(p);
     }

        System.out.println("");


      for (Producte p : arrayList) {
          System.out.println(p);

      }
        System.out.println("");


      Iterator<Producte> iterator2 = arrayList.iterator();
      while (iterator2.hasNext()) {
          Producte p = iterator2.next();
          System.out.println(p);
      }



    }





}

