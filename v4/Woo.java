import java.util.Scanner;
import java.util.ArrayList;
public class Woo{

  public static int type;

  public static void main(String[] args){
    /** System.out.println(Trigonometry.cscd(45) ); // Should return 1/(sqrt2/2) -> 2/sqrt2 -> sqrt2
    System.out.println(Probability.permute(6, 2) ); // 6P2 = 6 * 5 = 30
    System.out.println(Probability.choose(7, 5) ); // 7C5 = 7P2 / 2! = 21
    Probability.binomCDFAll(11, 5, 0.62); **/
    /** for(int i = -10; i < 11; i++){System.out.println("Square root of " + i + " = " + MathC.simplifySqrt(i)); }
    for(int i = -10; i < 11; i++){System.out.println("Factors of " + i + " = " + MathC.factors(i)); } **/

    Scanner sc = new Scanner(System.in);

    while (true){

      System.out.println("Select a category: \n [1] General Math Utilities \n [2] Trigonometry \n [3] Probability \n [4] Polynomials \n [5] Exit");
      String type = sc.next();

      //General Math Util
      if(type.equals("1")){

        while(true){

          System.out.println("What would you like to calculate? \n[1] Greatest Common Divisor \n[2] Least Common Multiple \n[3] Simplify a square root \n[4] Factors of a number \n[5] Rectangular to Polar Form \n[6] Polar to Rectangular Form \n[7] Exit Math Utilities");
          int mathType = sc.nextInt();

          // GCD
          if(mathType == 1){
            ArrayList<Integer> values = new ArrayList<Integer>();
            System.out.println("Input the values (minimum of 2!) for calculating the GCD of, and enter 0 when you are done");
            int val = sc.nextInt();
            while(values.size() < 2 || val != 0){
              if(val != 0) {values.add(val);}
              val = sc.nextInt();
            }
            int gcd = values.get(0);
            for(int i = 1; i < values.size(); i++){
              gcd = MathC.gcd(gcd, values.get(i));
            }
            System.out.println("These were the values you inputted: " + values);
            System.out.println("This is their GCD: " + gcd);
          }

          // Essentially a copy of GCD code // LCM
          if(mathType == 2){
            ArrayList<Integer> values = new ArrayList<Integer>();
            System.out.println("Input the values (minimum of 2!) for calculating the LCM of, and enter 0 when you are done");
            int val = sc.nextInt();
            while(values.size() < 2 || val != 0){
              if(val != 0) {values.add(val);}
              val = sc.nextInt();
            }
            int lcm = values.get(0);
            for(int i = 1; i < values.size(); i++){
              lcm = MathC.lcm(lcm, values.get(i));
            }
            System.out.println("These were the values you inputted: " + values);
            System.out.println("This is their LCM: " + lcm);
          }

          // Square Root
          if(mathType == 3){
            while (true){

              System.out.println("What value would you like to simplify the square root of?");
              int square = sc.nextInt();
              if (square > 1 || square < 0){
                System.out.println("\u221A" + square + " -> " + MathC.simplifySqrt(square));
                break;
              }
              else{
                System.out.println(" Invalid input - input is between 0 and 1");
              }
            }

          }

          // Factor
          if(mathType == 4){
            System.out.println("Input the value you want to determine the factors of");
            int val = sc.nextInt();
            System.out.println("The factors of " + val + " are " + MathC.factors(val) );
          }

          // RectToPolar
          if(mathType == 5){
            System.out.print("What is your x coordinate? ");
            double x = sc.nextDouble();
            System.out.print("What is your y coordinate? ");
            double y = sc.nextDouble();
            System.out.println("(" + x + ", " + y + ") ->\n" + MathC.rectToPolar(x, y));
          }

          // PolarToRect
          if(mathType == 6){
            System.out.print("What is your magnitude? ");
            double r = sc.nextDouble();
            System.out.print("What is your angle? ");
            double t = sc.nextDouble();
            System.out.println("Magnitude: " + r + ", Angle: " + t + " -> " + MathC.polarToRect(r, t) );
          }

          //break
          if(mathType == 7) break;
        }
      }

      //Trigonometry
      else if (type.equals("2")){

          boolean inRadians = true; int trigType;
          // NEED A WAY TO MAKE THIS CODE CLEANER AND MORE SUCCINCT
          // EXTREMELY REPETITIVE
          // - Use an interface for the trig functions?

          while(true) {

            System.out.println("What would you like to do? \n[1] Change radians/degrees \n[2] Evaluate a trig function \n[3] Exit Trigonometry" );
            trigType = sc.nextInt();

            // Change radians/degrees
            if(trigType == 1){
              if(inRadians) {inRadians = false; System.out.println("Changed to degree mode\n");}
              else{inRadians = true; System.out.println("Changed to radian mode\n");}
            }

            // Evaluate a trig function
            if(trigType == 2){
              System.out.println("What what you like to evaluate? \n[1] Sin \n[2] Cosine \n[3] Tangent \n[4] Cosecant \n[5] Secant \n[6] Cotangent \n[7] Arcsin \n[8] Arccos \n[9] Arctan" );
              int trigFxn = sc.nextInt();
              System.out.println("What input would you like to input?");
              int val = sc.nextInt();
              if(trigFxn == 1){
                if(inRadians){System.out.println("sin(" + val + ") = " + Math.sin(val) ); }
                else {System.out.println("sin(" + val + "\u00b0) = " + Trigonometry.sind(val) );}
              }
              if(trigFxn == 2){
                if(inRadians){System.out.println("cos(" + val + ") = " + Math.cos(val) ); }
                else {System.out.println("cos(" + val + "\u00b0) = " + Trigonometry.cosd(val) );}
              }
              if(trigFxn == 3){
		if(inRadians){System.out.println("tan(" + val + ") = " + Math.tan(val) ); }
               	else {System.out.println("tan(" + val + "\u00b0) = " + Trigonometry.tand(val) );}
              }
	      if(trigFxn == 4){
               if(inRadians){System.out.println("csc(" + val + ") = " + Trigonometry.csc(val) ); }
               else {System.out.println("csc(" + val + "\u00b0) = " + Trigonometry.cscd(val) ); }
             }
             if(trigFxn == 5){
               if(inRadians){System.out.println("sec(" + val + ") = " + Trigonometry.sec(val) ); }
               else {System.out.println("sec(" + val + "\u00b0) = " + Trigonometry.secd(val) ); }
             }
              if(trigFxn == 6){
                if(inRadians){System.out.println("cot(" + val + ") = " + Trigonometry.cot(val) ); }
                else {System.out.println("cot(" + val + "\u00b0) = " + Trigonometry.cotd(val) ); }
              }
              if(trigFxn == 7){
                if(inRadians){System.out.println("arcsin(" + val + ") = " + Math.asin(val));}
                else{System.out.println("arcsin(" + val + ") = " + Trigonometry.asind(val) + "\u00b0");}
              }
              if(trigFxn == 8){
                if(inRadians){System.out.println("arccos(" + val + ") = " + Math.acos(val));}
                else{System.out.println("arccos(" + val + ") = " + Trigonometry.acosd(val) + "\u00b0");}
              }
              if(trigFxn == 9){
                if(inRadians){System.out.println("arctan(" + val + ") = " + Math.atan(val));}
                else{System.out.println("arctan(" + val + ") = " + Trigonometry.atand(val) + "\u00b0");}
              }
            }

            // Break
            if(trigType == 3) break;
          }
      }

      // Probability
      else if (type.equals("3")){
        int n, r;
        double p;
        System.out.println(" Select a category: \n [1] Factorial \n [2] Permutation \n [3] Combinations \n [4] Binomial Distributions \n [5] Exit Probability");
        int trigType = sc.nextInt();

        // Factorial
        if (trigType == 1){
          while (true){

            System.out.print("What is input for factorial: ");
            n = sc.nextInt();
            if (n >= 0){
              System.out.println(n + "!" + " = " + Probability.factorial(n));
              break;
            }
            else{
              System.out.println(" Invalid input - input is negative");
            }

          }
        }

        // Permutation
        if (trigType == 2){
          System.out.print("What is input for n of nPr: ");
          n = sc.nextInt();
          System.out.print("What is input for r of nPr: ");
          r = sc.nextInt();
          System.out.println(n + "P" + r + " = " + Probability.permute(n, r));
        }

        // Combination
        if (trigType == 3){
          while (true){
            System.out.print("What is input for n of nCr: ");
            n = sc.nextInt();
            System.out.print("What is input for r of nCr: ");
            r = sc.nextInt();
            if (n > r){
              System.out.println(n + "P" + r + " = " + Probability.choose(n, r));
            }
            else { System.out.println("Invalid input: r > n "); }
          }
        }

        //CDF
        if (trigType == 4){

          while (true){

            System.out.print("What is input for n : ");
            n = sc.nextInt();
            System.out.print("What is input for r : ");
            r = sc.nextInt();
            System.out.print("What is input for p : ");
            p = sc.nextDouble();

            if ( n > r && p < 1 && p > 0){
              System.out.println(Probability.binomCDFAll(n, r, p));
              break;
            }
            else if (n < r){
              System.out.println("Invalid input - n < r ");
            }
            else{
              System.out.println("Invalid input - p is not between 0 and 1 ");
            }

          }

        }
      }

      // Polynomials
      else if(type.equals("4")){
        System.out.println("What is the degree of your polynomial?");
        int degree = sc.nextInt();
        int[] polynomial = new int[degree + 1];

        System.out.println("Enter the coefficients for your polynomial");
        for(int i = degree; i >= 0; i--){
          System.out.println("x^ " + i);
          polynomial[degree - i] = sc.nextInt();
        }

        System.out.println(String.format("The roots of your polynomial are %s", RootsSolver.rootsSolver(polynomial)));
      }

      // Break
      else if (type.equals("5"))  break;

      else{
        System.out.println("Invalid input");
      }

    }

  }

}
