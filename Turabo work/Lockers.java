public class Lockers{
  public static void main(String[] arg){
    boolean[] lockers = new boolean[100];
    for(int i = 1 ; i <= 100; i++){
      for(int j = i; j <= 100; j= j+i){
        lockers [ j - 1 ] = !lockers[j - 1];
      }
    }
    
    for (int i = 0; i < 100; i++) {
      if( lockers[i] ) {
        System.out.printf("the locker  %d is open.%n" , i+1);
      }
    }l,
  }
}