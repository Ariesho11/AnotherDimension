public class ArrayOps{
  public static int sum(int[] arr){
    int total = 0;
    for(int i = 0; i < arr.length; i++){
      total = total + arr[i];
    }
    return total;
  }

  public static int largest(int[] arr){
    int large = 0;
    for(int i = 0 ; i < arr.length; i++){
      if (arr[i] > large) large = arr[i];
    }
    return large;
  }

  public static int[] sumRows(int[][] matrix){
    int[] sum = new int[matrix.length];
    for(int i = 0; i < matrix.length; i++){
      int tempsum = 0;
      for(int a = 0; a < matrix[i].length; a++){
        tempsum = tempsum + matrix[i][a];
      }
      sum[i] = tempsum;
    }
    return sum;
  }

  public static int[] largestInRows(int[][] matrix){
    int[] largest = new int[matrix.length];
    for(int i = 0; i < matrix.length; i++){
      int templarge = 0;
      for(int a = 0; a < matrix[i].length; a++){
        if (matrix[i][a] > templarge) templarge = matrix[i][a];
        largest[i] = templarge;
      }
    }
    return largest;
  }

  public static int sum(int[][] arr){
    int total = 0;
    for(int i = 0; i < arr.length; i++){
      for(int a = 0; a < arr[i].length; a++){
        total = total + arr[i][a];
      }
    }
    return total;
  }

  public static int[] sumCols(int[][] matrix){
    int[] sum = new int[matrix.length];
    return sum;
  }

  public static boolean isRowMagic(int[][] matrix){
    boolean samesum = false;
    return samesum;
  }

  public static boolean isColMagic(int[][] matrix){
    boolean samesum = false;
    return samesum;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int clmn){
    boolean samesum = false;
    return samesum;
  }

}
