public class Main {
   public static void main(String[] args) {
      int a, b, temp;
      a = 15;
      b = 27;

      temp = a;
      a = b;
      b = temp;

      System.out.println("Os valores trocados são: " + a + " and " + b);
   }
}
