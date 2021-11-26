public class Bucket {

   public static void Refill(){

       int a = 30;
       int b = 0;
       for (int i = 0; i<30; i++){
           a--;


           if (a%10 != 0) {
               b++;


           }
           System.out.print(" Bucket >  " + a);
           System.out.println(" >> " + b);
       }

    }

}
