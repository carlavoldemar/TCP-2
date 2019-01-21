public class Exercicio7 {
   public static void main(String[] args) {
      int a, b;
      a = 15;
      b = 27;

      System.out.println("Antes da troca : a, b = " + a + ", " + b);

      a = a + b;
      b = a - b;
      a = a - b;

      System.out.println("Depois da troca : a, b = " + a + ", " + b);
   }
}