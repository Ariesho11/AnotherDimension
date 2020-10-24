import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    // My test cases
    int[] testme = {1, 4, 2, 3};
    int[][] testme2 = {{1, 2, 3, 4, 5},
                       {5, 5},
                       {4, 3, 2, 1}};
    int[][] testme22 = {};
    int[][] testrectangle = {{2, 4, 6, 7},
                            {4, 5, 7, 6},
                            {1, 2, 3, 4}};
    int[][] testmerectmagic = {{1, 2, 3, 4},
                              {4, 3, 2, 1},
                              {0, 7, 0, 0}};
    System.out.println(ArrayOps.sum(testme));
    System.out.println(ArrayOps.largest(testme));
    System.out.println(Arrays.toString(ArrayOps.sumRows(testme2)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(testme2)));
    System.out.println(ArrayOps.sum(testme2));
    System.out.println(Arrays.toString(ArrayOps.sumCols(testrectangle)));
    System.out.println(ArrayOps.isRowMagic(testmerectmagic));
    //Mr. K's test cases
    int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[]  B  =   {  1, 3, 5 };
    System.out.println(Arrays.toString(ArrayOps.sumRows(A))); //[12, 8, -14]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A))); //[12, 7, 2]
    System.out.println(ArrayOps.sum(B)); //9
    System.out.println(ArrayOps.sum(A)); //6
    System.out.println(Arrays.toString(ArrayOps.sumCols(A))); //[3, -4, 16, -9]
  }
}
