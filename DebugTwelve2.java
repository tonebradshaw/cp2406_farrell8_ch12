/**
 * Created by tony on 16/09/2016.
 */
public class DebugTwelve2 {

    public static void main(String[] args)
    {
        byte num1 = 120, num2 = 120, result, allowed;
        final byte HIGHBYTE = 127;
        try{

            allowed = (byte)(HIGHBYTE - num1);

            if(num2 > allowed) {
                throw (new ArithmeticException());
            }
            result = (byte)(num1 + num2);
            System.out.println("Result is " + result);
        }
        catch(ArithmeticException error)
        {
            System.out.println("Byte can't hold value higher than " + HIGHBYTE);
        }
    }
}
