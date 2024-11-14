
public class Teste{
    public static void main (String args[]){
        Fatorial conta = new Fatorial();
        for (long i = 0; i<=10; i++){
            System.out.println(i + "! = " + conta.fatorial(i));
        }
    
    }
    /*public static long fatorial(long num) {
      if(num<= 1) {
          return 1;         
      }
      else{
          return num * fatorial(num -1);
      }
    }*/
}