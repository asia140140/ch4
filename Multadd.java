
public class Multadd{
    public static void main(String[] args){
        multadd(1.0,2.0,3.0);
        multadd(Math.cos(Math.PI/4),  0.5,  Math.sin(Math.PI/4.0) );
        multadd(Math.log(10.0),1,Math.log(20.0));

        expSum(9.0);
    }

    public static double multadd(double a, double b, double c){
        return a * b + c;

    }

    public static double expSum(double x){
        return x*Math.exp(-x)+Math.sqrt(1-Math.exp(-x));

    }
}