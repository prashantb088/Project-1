/**
 * Illustrating banking operations with Regular Expressions and Exception Handling by
 Prashant Bansal
 *
 */


package first.bank;

import first.bank.Controller.bankController;
import first.bank.model.bankModel;

import java.util.Scanner;

import static java.lang.System.out;

public class app {
    public static void main(String[] args){

        bankController bc = new bankController();//controller object to validate the data
        bankModel bm = new bankModel();//controller object to validate the data
        Scanner ps = new Scanner (System.in);
        out.println("\t\t\t------WELCOME TO CANARA BANK------");
        out.println("Enter account Holder Name");
       
        String accHolderName = ps.next();
        bm.setAccHolder(accHolderName);
        out.println("Enter Account Number");
        int accnumber = ps.nextInt();
        bm.setAccNumber(accnumber);
        out.println("Enter Minimum Balance");
        int accBalance = ps.nextInt();
        bm.setAccBalance(accBalance);
        out.println("Enter password for your account");
        
        String accPassword = ps.next();
        bm.setAccPassword(accPassword);
        try{
            if(bc.checkUsername(bm)){
                out.println("-----------Your Bank Details----------");
                out.println(bm.toString());
            }
        }
        catch (Exception e){
            out.println(e.getMessage());
        }
    }
}
catch(Exception e)
      {
      	out.println(e.getMessage());
      	System.exit(0);
      }
      sc.close();
  }
}
    


