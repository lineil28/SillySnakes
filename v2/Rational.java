/*
 * Team Green: Abdullah Faruque, Neil Lin, Russell Goychayev
 * APCS pd8
 * HW42: Be More Rational
 * 2021-12-3
 * time spent - 0.5 hours
 *
 * Disco- ...
 *
 * QCC- ...
 *
*/
public class Rational{
 private int numer , denom;
 private static int n, d, gcd;

 public Rational(){
   this.numer = 0;
   this.denom = 1;
 }


 public Rational(int numer, int denom) {
   this.numer = numer;
   this.denom = denom;

   if (denom == 0) {
     System.out.println("Invalid denominator.");
   numer=0;
   denom=1;
   }
 }

 public String toString(){
   String x = (numer + "/" + denom);
   if (denom == 1){ x = numer + ""; }
   return x;
 }

 public double floatValue(){
   return ((double)numer/denom);
 }

 public void multiply(Rational s){
   this.numer=(this.numer*s.numer);
   this.denom=(this.denom*s.denom);
 }

 public void divide(Rational s){
   if (s.numer == 0){
     System.out.println("Div by 0 err.");
   }
   else{
     this.numer=(this.numer*s.denom);
     this.denom=(this.denom*s.numer);
   }
 }

 public void add(Rational s){
   this.numer=( (this.numer*s.denom) + (this.denom*s.numer) );
   this.denom=(this.denom*s.denom);
 }

 public void subtract(Rational s){
   this.numer=( (this.numer*s.denom) - (this.denom*s.numer) );
   this.denom=(this.denom*s.denom);
 }

 public int gcd(){
   return gcd(this.numer, this.denom);
 }

 public void reduce(){
   gcd = this.gcd();
   numer = numer / gcd;
   denom = denom / gcd;
 }

 public int compareTo(Rational r){

  if ( ( this.floatValue() - r.floatValue() ) != 0){
    if ( ( this.floatValue() - r.floatValue() ) > 0){
      return 1;
    }
    return -1;
  }
  return 0;
 }

 public static void main(String[] args){
   Rational r = new Rational(2,3);
   Rational s = new Rational(1,2);
   Rational t = new Rational(3,6);
   System.out.println(r.toString());
   System.out.println(r.floatValue());
   r.multiply(s);
   System.out.println(r.toString());
   r.divide(s);
   System.out.println(r.toString());
   r.add(s);
   System.out.println(r.toString());
   r.subtract(s);
   System.out.println(r.toString());
   System.out.println(r.gcd());
   r.reduce();
   System.out.println(r.toString());
   System.out.println(r.compareTo(s));
   System.out.println(s.compareTo(r));
   System.out.println(s.compareTo(t));
 }
}
