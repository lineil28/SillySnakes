public class QuadraticSolver{
  public static String quadraticSolver(int a, int b, int c){
    String output = "The roots of (" + a + ")x^2 + (" + b + ")x + (" + c + ") = 0 are ";

      int discriminant = b * b - 4 * a * c;
      if(discriminant == 0 || Math.sqrt(discriminant) * Math.sqrt(discriminant) == discriminant){
        int plusMinus = Integer.parseInt(MathC.simplifySqrt(discriminant));
        Rational rootOne = new Rational(-b + plusMinus, 2 * a);
        Rational rootTwo = new Rational(-b - plusMinus, 2 * a);
        rootOne.reduce();
        rootTwo.reduce();
        output += rootOne.toString() + ", " + rootTwo.toString();
      }
      else{
        String rootOne = "(" + (-b) + " + (" + MathC.simplifySqrt(b * b - 4 * a * c) + ") )/" + (2 * a);
        String rootTwo = "(" + (-b) + " - (" + MathC.simplifySqrt(b * b - 4 * a * c) + ") )/" + (2 * a);
          output += rootOne + ", " + rootTwo;
      }
      return output;

  }
}
