
public class Pow {
    public static void main(String[] args) {
    	PowSolution s = new PowSolution();
        s.myPow(2.0000, -2);
    }
}

class PowSolution {
	public double myPow(double x, int n) {
        if( n < 0 ){
            return 1 / pow( x, -n ) ;
        }
        
        return pow( x, n ) ;
    }
	
    public double pow( double x, int n ){
        if( n == 0 ){
            return 1 ;
        }
        
        double ans = pow( x, n /2 ) ;
        ans *= ans ;
        
        if( n %2 != 0 ){    //  if n is odd
            ans *= x ;
        }
        
        return ans ;
    }
}

