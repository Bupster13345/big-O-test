import java.util.Random;

public class Timing {
  public static void main(String[] args) {
    Random rand = new Random();
    int SIZE = 1024;
    int[] arr = new int[SIZE];

    // generate random numbers for array
    for (int i = 0; i < SIZE; i++) {
      arr[i] = rand.nextInt();
    }
    
    long start = System.currentTimeMillis();
    Util.bubbleSort(arr);
    long end = System.currentTimeMillis();
    long diff = end - start; 
    System.out.print("Start: " + start + ", End: " + end + ", Difference: " + diff);
  }
}