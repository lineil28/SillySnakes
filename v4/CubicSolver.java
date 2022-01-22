public class CubicSolver{
  // Cubic:  ax^3 + bx^2 + cx + d = 0
   // Formula for cubic looks roughly like
  // cbrt(q + sqrt(q^2 + p^3)) + cbrt(q + sqrt(q^2 + p^3)) - b/3a
  //
  // q = (bc/6a^2 - d/2a - b^3)
  // p = (c/3a - b^2/9a^2)

  public static String cubic(int a, int b, int c, int d){
    Rational p = new Rational(c, 3 * a); // c/3a
    p.subtract(new Rational(b * b, 9 * a * a) ); // c/3a - b^2/9a^2
    p.reduce();

    Rational q = new Rational(b * c, 6 * a * a);
    q.subtract(new Rational(d, 2 * a));
    q.subtract(new Rational(b * b * b)); // bc/6a^2 - d/2a - b^3
    q.reduce();

    Rational sqrtSum = new Rational(q);
    sqrtSum.multiply(q); // q^2

    Rational p3 = new Rational(p);
    p3.multiply(p);
    p3.multiply(p); // p^3

    sqrtSum.add(p3); // q^2 + p^3, inside the sqrt sign
    sqrtSum.reduce();

    Rational shift = new Rational(-b, 3 * a); // -b/3a
    shift.reduce();

    return String.format("cbrt(%1$s + sqrt(%2$s)) + cbrt(%1$s - sqrt(%2$s)) + %3$s (& no further roots found)" ,  q.toString(), sqrtSum.toString(), shift.toString() );

   }

}
