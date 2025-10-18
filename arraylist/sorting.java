package arraylist;
import java.util.Arrays;

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
      
      
      
      int nums[] = {16,9,25,7,14};
      // int startingIndex = 1;
      // int endingIndex = 4;
      int copyOfNums[] = nums;

      Arrays.fill(nums,0);

      System.out.println(Arrays.toString(nums));
      // Arrays.sort(nums,startingIndex,endingIndex);
      System.out.println(Arrays.toString(copyOfNums)); // both 0,0,0,0,0


    }  
}
