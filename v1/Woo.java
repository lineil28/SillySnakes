import java.util.Scanner;
public class Woo{

  public static void main(String[] args){
    /** System.out.println(Trigonometry.cscd(45) ); // Should return 1/(sqrt2/2) -> 2/sqrt2 -> sqrt2
    System.out.println(Probability.permute(6, 2) ); // 6P2 = 6 * 5 = 30
    System.out.println(Probability.choose(7, 5) ); // 7C5 = 7P2 / 2! = 21
    Probability.binomCDFAll(11, 5, 0.62); **/

    Scanner sc = new Scanner(System.in);

    while (true){

      System.out.println("Select a category: \n [1] Probability \n [2] Trigonometry \n [3] Exit");

      int type = sc.nextInt();

      if (type == 1){
        int n, r;
        double p;
        System.out.println(" Select a category: \n [1] Factorial \n [2] Permutation \n [3] Combinations \n [4] Binomial Distributions");
        int trigType = sc.nextInt();
        //factorial
        if (trigType == 1){
          System.out.print("What is input for factorial: ");
          n = sc.nextInt();
          System.out.println(n + "!" + " = " + Probability.factorial(n));
        }
        //permutation
        if (trigType == 2){
          System.out.print("What is input for n of nPr: ");
          n = sc.nextInt();
          System.out.print("What is input for r of nPr: ");
          r = sc.nextInt();
          System.out.println(n + "P" + r + " = " + Probability.permute(n, r));
        }
        //combination
        if (trigType == 3){
          System.out.print("What is input for n of nCr: ");
          n = sc.nextInt();
          System.out.print("What is input for r of nCr: ");
          r = sc.nextInt();
          System.out.println(n + "P" + r + " = " + Probability.choose(n, r));
        }
        //CDF
        if (trigType == 4){
          System.out.print("What is input for : ");
          n = sc.nextInt();
          System.out.print("What is input for : ");
          r = sc.nextInt();
          System.out.print("What is input for : ");
          p = sc.nextDouble();
          System.out.println(Probability.binomCDFAll(n, r, p));
        }
      }

      if (type == 2){
        System.out.println("");
      }

      if (type == 3){
        break;
      }

    }

  }

}
