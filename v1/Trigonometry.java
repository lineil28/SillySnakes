public class Trigonometry{

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
  static double cscd(double angle){ return 1.0 / Trigonometry.sind(angle); }
  static double secd(double angle){ return 1.0 / Trigonometry.cosd(angle); }
  static double cotd(double angle){ return 1.0 / Trigonometry.tand(angle); }

  // Inverse Trig Functions w/ degree outputs
  static double asind(double value){ return Math.asin(value) * 180 / Math.PI; }
  static double acosd(double value){ return Math.acos(value) * 180 / Math.PI; }
  static double atand(double value){ return Math.atan(value) * 180 / Math.PI; }

}
