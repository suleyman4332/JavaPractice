package week07;

public class P01DoWhileLoop {
   /* 'k' harfinden 't' harfine kadar harfleri yazdirin.*/
   public static void main(String[] args) {
       char ilkHarf='k';
       do{
           System.out.print(ilkHarf+"-");
           ilkHarf++;
       }while (ilkHarf<='t');

   }

}
