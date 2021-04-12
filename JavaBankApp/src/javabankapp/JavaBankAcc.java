/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabankapp;

import java.util.Scanner;

/**
 *
 * @author PRINCE
 */
class bankInternal {
    int accNumber;
    float bal=0;
    Scanner get = new Scanner(System.in);
    bankInternal()
    {
        System.out.println("Enter Account Number:");
        accNumber = get.nextInt();
        System.out.println("Enter Initial Balance:");
        bal = get.nextFloat();        
    }
    void deposit()
    {
        float amount;
        System.out.println("Enter Amount to be Deposited:");
        amount = get.nextFloat();
        bal = bal+amount;
        System.out.println("Deposited! Account Balance is "+bal);
    }
    void withdraw()
    {
        float amount;
        System.out.println("Enter Amount to be Withdrawn:");
        amount = get.nextFloat();
        if(amount<bal)
        {
            bal = bal-amount;
            System.out.println("Amount Withdrawn!! Available Balance: "+bal);
        }
        else
        {
            System.out.println("Insufficient funds!!");
        }
    }
}

public class JavaBankAcc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
bankInternal myObj = new bankInternal();
        myObj.deposit();
        myObj.withdraw();   
    }
    
    
    
}

   