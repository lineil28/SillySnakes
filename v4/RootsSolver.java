import java.util.Arrays;
import java.util.ArrayList;

public class RootsSolver{

	public static String rootsSolver(int[] coefficients){
        if(coefficients.length == 2){
					// mx + b = 0, x = -b/m
					Rational root = new Rational(-coefficients[1], coefficients[0]);
					root.reduce();
					return root.toString();
				}

				if(coefficients.length == 3){return QuadraticSolver.quadSolver(coefficients);}

				if(coefficients.length == 4){return CubicSolver.cubicSolver(coefficients);}

				return "no roots found!";
    }



}
