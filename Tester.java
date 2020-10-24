import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[] testme = {1, 4, 2, 3};
    int[][] testme2 = {{1, 2, 3, 4, 5},
                       {5, 5},
                       {4, 3, 2, 1}};
    System.out.println(ArrayOps.sum(testme));
    System.out.println(ArrayOps.largest(testme));
    System.out.println(Arrays.toString(ArrayOps.sumRows(testme2)));
  }
}
