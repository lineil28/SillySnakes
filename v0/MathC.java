public class MathC{

    static int factorial(int num){
      if(num < 0){throw new RuntimeException("Invalid input - less than 0");}
      if(num == 0){return 1;}
      int product = 1;
      for(int i = num; i > 0; i--){product *= i; }
      return product;
    }

    static int permute(int n, int r){
      if(n < r){throw new RuntimeException("Invalid input - r is greater than n");}
      if(n < 0 || n < r){throw new RuntimeException("Invalid input - n < 0 or r < 0"); }
      int product = 1;
      for(int val = n; val > n - r; val--){product *= val; }
      return product;
     }
    // Trig functions Suite

    // Reciprocal Trig Functions
    static double csc(double angle){ return 1.0 / Math.sin(angle); }
    static double sec(double angle){ return 1.0 / Math.cos(angle); }
    static double cot(double angle){ return 1.0 / Math.cos(angle); }

    // Trig functions w/ degree inputs
    static double sind(double angle){ return Math.sin(angle * Math.PI / 180); }
    static double cosd(double angle){ return Math.cos(angle * Math.PI / 180); }
    static double tand(double angle){ return Math.tan(angle * Math.PI / 180);  }

    // Reciprocal trig funtions w/ degree inputs
    static double cscd(double angle){ return 1.0 / MathC.sind(angle); }
    static double secd(double angle){ return 1.0 / MathC.cosd(angle); }
    static double cotd(double angle){ return 1.0 / MathC.tand(angle); }

    // Inverse Trig Functions w/ degree outputs
    static double asind(double value){ return Math.asin(value) * 180 / Math.PI; }
    static double acosd(double value){ return Math.acos(value) * 180 / Math.PI; }
    static double atand(double value){ return Math.atan(value) * 180 / Math.PI; }

}
