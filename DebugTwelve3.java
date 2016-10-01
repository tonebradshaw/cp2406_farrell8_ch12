import javax.swing.*;

/**
 * Created by tony on 16/09/2016.
 */
public class DebugTwelve3 {

    public static void main(String[] args){

        String inStr;
        double num, result;
        double[] array = {12, 4, 6, 8};

        inStr = JOptionPane.showInputDialog(null, "Enter a number ");
        num = Integer.parseInt(inStr);

        try{

            for(int x = 0; x < array.length; ++x){
                result =  array[x] / num;
                JOptionPane.showMessageDialog(null, "Result of division is " + result);
                result = array[(int)Math.floor(num)];
                JOptionPane.showMessageDialog(null, "Result accessing array is " + result);
            }


        }
        catch(ArithmeticException error){
            JOptionPane.showMessageDialog(null, "Arithmetic error - division by 0");
        }
        catch(IndexOutOfBoundsException error)
        {
            JOptionPane.showMessageDialog(null, "Index error - subscript out of range");
        }

    }
}
