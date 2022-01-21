public class QuadraticSolver{
  public static String quadraticSolver(int a, int b, int c){
    String output = "The roots of (" + a + ")x^2 + (" + b + ")x + (" + c + ") = 0 are ";

      int discriminant = b * b - 4 * a * c;
      String midTerm = MathC.simplifySqrt(discriminant);
      if(midTerm.indexOf("i") == -1 && midTerm.indexOf("\u221A") == -1){
        int plusMinus = Integer.parseInt(MathC.simplifySqrt(discriminant));
        Rational rootOne = new Rational(-b + plusMinus, 2 * a);
        Rational rootTwo = new Rational(-b - plusMinus, 2 * a);
        rootOne.reduce();
        rootTwo.reduce();
        output += rootOne.toString() + ", " + rootTwo.toString();
      }
      else{
        int partition = 0;
        while(partition < midTerm.length() && midTerm.substring(partition, partition + 1) != "i" && midTerm.substring(partition, partition + 1) != "\u221A"){
          partition += 1;
        }
        int maxSquareFactor = Integer.parseInt( midTerm.substring(0, partition) );
        String disc = midTerm.substring(partition, midTerm.length() );
        System.out.println(maxSquareFactor + " " + disc);
      }
      return output;

  }
}
