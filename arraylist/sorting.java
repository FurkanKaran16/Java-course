package arraylist;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Comparator;
import java.util.Comparator;

class sorting {
  public static void main(String[] args){
      char vowels[] = {'e','i','u','o','a'};
      vowels[2] = 'Ü';
      int dates[] = {1453,1071,571,1299};
      
      Arrays.sort(vowels);
      Arrays.sort(dates);

     

      System.out.println(Arrays.toString(vowels));
      System.out.println(Arrays.toString(dates));
      
      char key = 'o'; // from vowels
      int foundItemIndex = Arrays.binarySearch(vowels, key);

      Arrays.fill(vowels,'f'); // output: fffff

      System.out.println(foundItemIndex);
      System.out.println(vowels);
      
      //-------------------------------------
      
      int nums[] = {16,9,25,7,14};
      // int startingIndex = 1;
      // int endingIndex = 4;
      int copyOfNums[] = nums;

      Arrays.fill(nums,0);

      System.out.println(Arrays.toString(nums));
      // Arrays.sort(nums,startingIndex,endingIndex);
      System.out.println(Arrays.toString(copyOfNums)); // both 0,0,0,0,0

      //-------------------------------------

      ArrayList<Integer> denemeler = new ArrayList<>();
      denemeler.add(45);
      denemeler.add(23);
      denemeler.add(57);
      denemeler.add(12);
      denemeler.sort(Comparator.reverseOrder());    // reverse sorting

      System.out.println(denemeler);

      denemeler.forEach(deneme -> {System.out.println(deneme * 2);} );
    }
}
