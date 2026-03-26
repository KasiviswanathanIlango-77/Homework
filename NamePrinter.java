
package advancedjavaapplication.ThreadJavaProgram;

import java.util.logging.Level;
import java.util.logging.Logger;


public class NamePrinter extends Thread {
    String[] names={"DIWAKAR", "KARTHIK", "RAJESH", "SATHISH", "SURYA"};
    @Override
    public void run()
    {
    for(String name : names)
    {
        System.out.println(name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NamePrinter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
}
