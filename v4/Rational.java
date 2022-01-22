/*

*/
public class Rational{
 private int numer , denom;
 private static int n, d, gcd;

 public Rational(){
   this.numer = 0;
   this.denom = 1;
 }

 public Rational(int num){
     this(num, 1); // Constructor for int(eger) values
 }

 public Rational(Rational other){
     this(other.numer, other.denom); // Copy constructor
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
   String x = numer + "";
   if(denom != 1) x += "/" + denom;
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

 public void reduce(){
   gcd = MathC.gcd(numer, denom);
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

}
