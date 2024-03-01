import java.util.*;

import javax.sound.midi.Soundbank;




class Atm{
    float money;
    int pin = 4567;

    public void cheakpin(){
        System.out.println("|| **WELCOME TO ATM MACHINE SYSTEM** ||");
        System.out.println();
        System.out.println(" Enter your 4 digit ATM Pin ");
        Scanner sc = new Scanner(System.in);
        int enteredpin= sc.nextInt();

        if(enteredpin==pin){
            menu();
        }
        else{
            System.out.println("wrong entered pin XXX please try again");
            cheakpin();
        }
    }


    public void menu(){
        System.out.println(" Chose the any one  option ");
        System.out.println("1. Cheak A/C Balance");
        System.out.println("2. Add Money");
        System.out.println("3. Withdrwal money");
        System.out.println("4. Exit ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1){
            checkBalance();

        }else if(opt==2){
            addmoney();
        }
        else if(opt==3){
            withdrwal();

        }
        else if(opt==4){
           return;
        }
        else{
            System.out.println(" Entered the wrong option ");
        }
    }
public void  checkBalance(){
    System.out.println("Balance:" + money );
    menu();
}

public void  addmoney() {
    System.out.println("Enter the amount:");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    money= money+amount;
    System.out.println(" Total avilable Balnce:"+ money );

    menu();
}

public void  withdrwal(){
    System.out.println("Withdrwalling process....");
    System.out.println(" Enter the amount:");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();

    if (amount>money) {
        System.out.println(" Insifitient Balance");
        
    }
    else{
        money= money-amount;
        System.out.println(amount+ "Sucessfull Withdrwal ");
        System.out.println("Avilable Balance:"+ money);

    }


}

}
public class AtmMachine {
    public static void main(String [] args){
        Atm obj = new Atm();
        obj.cheakpin();
  
    }

    
}