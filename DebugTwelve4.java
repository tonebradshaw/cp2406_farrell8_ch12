import javax.swing.*;

/**
 * Created by tony on 16/09/2016.
 */
public class DebugTwelve4 {

    public static void main(String[] args){

        String inStr, outString = "";
        final int MAX = 999;
        int[] emp = new int[4];

        for(int x = 0; x < emp.length; ++x){

            inStr = JOptionPane.showInputDialog(null, "Enter employee ID number");

            try{
                    emp[x] = Integer.parseInt(inStr);

                if(emp[x] > MAX){

                    throw(new DebugEmployeeIDException());
                }
            }
            catch(NumberFormatException error){

                --x;
                JOptionPane.showMessageDialog(null, inStr + "\nNonnumeric ID");
            }
            catch(DebugEmployeeIDException error){

                --x;
                JOptionPane.showMessageDialog(null, inStr + "\n" + error);
            }
        }
        for(int x = 0; x < emp.length; ++x)
        {
            outString = outString + emp[x] + " ";
        }
        JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);
    }
}
