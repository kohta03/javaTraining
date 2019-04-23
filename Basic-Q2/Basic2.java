
public class Basic2{
  public static void main(String[] args){
    int[] sieve = new int[1001];

    for(int i = 0; i < sieve.length; i++){
      if(i == 0 || i == 1){
        sieve[i] = 0;
      }
      sieve[i] = 1;
    }

    for(int i = 2; i < sieve.length; i++){
      for(int j = 2; j < sieve.length; j++){
        if(i * j < sieve.length){
          sieve[i * j] = 0;
        }
      }
      if(sieve[i] == 1){
        System.out.println(i);
      }
    }

  }
}
