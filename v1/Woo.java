import java.util.Scanner;
public class Woo{

  public static void main(String[] args){
    /** System.out.println(Trigonometry.cscd(45) ); // Should return 1/(sqrt2/2) -> 2/sqrt2 -> sqrt2
    System.out.println(Probability.permute(6, 2) ); // 6P2 = 6 * 5 = 30
    System.out.println(Probability.choose(7, 5) ); // 7C5 = 7P2 / 2! = 21
    Probability.binomCDFAll(11, 5, 0.62); **/

    Scanner sc = new Scanner(System.in);

    System.out.println("Select a category: \n [1] Probability \n [2] Trigonometry \n [3] Exit");

    while (true){
      int type = sc.nextInt();

      if (type == 1){
        int n, r;
        double p;
        System.out.println(" Select a category: \n [1] Factorial \n [2] Permutation \n [3] Combinations \n [4] Binomial Distributions");
        int trigType = sc.nextInt();
        if (trigType == 1){
          System.out.println("What is input for factorial: ");
          n = sc.nextInt();
          System.out.println(Probability.factorial(n));
        }
      }
/*
      if (type == 2){
        System.out.println("");
      }
*/
      if (type == 3){
        break;
      }

    }

  }

}
