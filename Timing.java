import java.util.*;
import java.io.*;

public class Timing {
  public static void main(String[] args) throws IOException{
    Random rand = new Random();
    int SIZE = 0;
    Scanner in = new Scanner(System.in);
    System.out.print("filename: ");
    String fileN = in.nextLine();
    Scanner fin = new Scanner(new File(fileN));
    int i = 0;
    while(fin.hasNextInt()){
      i++;
      fin.next();
    }
    fin = new Scanner(new File(fileN));
    int[] arr = new int[i];
    for(int o = 0; o < i; o++){
      arr[o] = fin.nextInt();
      arr = new int[arr[o]];
      for (int j = 0; j < arr[o]; j++){
        arr[j] = rand.nextInt();
      }
     
    for (int a = 0; a < 10; a++){
      long start = System.currentTimeMillis();
      Util.insertionSort(arr);
      long end = System.currentTimeMillis();
      long diff = end - start; 
      System.out.println(diff);
    }
    System.out.println("end");
    } 
  }
}