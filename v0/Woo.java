public class Woo{

  public static void main(String[] args){
    System.out.println(MathC.cscd(45) ); // Should return 1/(sqrt2/2) -> 2/sqrt2 -> sqrt2
    System.out.println(MathC.permute(6, 2) ); // 6P2 = 6 * 5 = 30
    System.out.println(MathC.choose(7, 5) ); // 7C5 = 7P2 / 2! = 21
    MathC.binomCDFAll(11, 5, 0.62);
  }

}
