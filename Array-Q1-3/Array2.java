
public class Array2{
  public static void main(String[] args){
    int[][] array = new int[3][3];
    array[0][0] = 98;
    array[0][1] = 73;
    array[0][2] = 66;
    array[1][0] = 77;
    array[1][1] = 75;
    array[1][2] = 88;
    array[2][0] = 80;
    array[2][1] = 92;
    array[2][2] = 83;
    int jap = 0, math = 0, eng = 0;
    double[] result = new double[3];

    for(int i = 0; i < 3; i++){
      jap += array[i][0];
      math += array[i][1];
      eng += array[i][2];
    }

    for(int i = 0; i < result.length; i++){
      if(i == 0){
        result[i] = jap / 3;
        System.out.println(result[i]);
      }else if(i == 1){
        result[i] = math / 3;
        System.out.println(result[i]);
      }else if(i == 2){
        result[i] = eng / 3;
        System.out.println(result[i]);
      }
    }
  }
}
