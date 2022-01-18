public class MathC{
    // Generic Math methods

    // Return greatest common divisor of two numbers
    static int gcd(int n, int d){
      int a, b, x;
      a = n;
      b = d;
      while( a % b != 0 ) {
          x = a;
          a = b;
          b = x % b;
      }
      return b;
    }

    // Return least common multiple of two numbers
    static int lcm(int a, int b){
        return(a * b / gcd(a, b));
    }


    

}
