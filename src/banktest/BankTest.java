package banktest;

import java.util.Scanner;

import clientsinfo.BankAccounts;
import clientsinfo.CurrentAccount;
import clientsinfo.LoanAccount;
import clientsinfo.SavingAccount;

public class BankTest {
	public static void main(String[] args) throws InterruptedException{
	
		 String processBar[] = {
		            "*",
		            "**",
		            "***",
		            "L",
		            "***",
		            "O",
		            "**",
		            "***",
		            "A",
		            "***",
		            "D",
		            "**",
		            "I",
		            "**",
		            "***",
		            "N",
		            "**",
		            "G",
		            "**",
		            "***",
		        };

		        for (int i = 0;
		             i < processBar.length;
		             i++) {
		           
		            Thread.sleep(500);
		            
		            System.out.print(processBar[i]);
		            
		        }
		        BankApp b=new BankApp();

	}

}
