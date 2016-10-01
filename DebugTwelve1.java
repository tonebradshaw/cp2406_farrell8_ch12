/**
 * Created by tony on 16/09/2016.
 */
public class DebugTwelve1 {

    public static void main(String[] args) throws ArithmeticException{

        double num = -8.8, result;
        try{

            if(num <= 0) {

                throw (new ArithmeticException());
            }
            result = Math.log(num);
            System.out.println("Result is " + result);
        }
        catch(ArithmeticException a){
            System.out.println("Can't take logarithm for value of zero or lower");
        }
    }
}
