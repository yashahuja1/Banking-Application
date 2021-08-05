import java.util.*;

public class Banking_application {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name;
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("\n WELCOME " + name + "!!\n");
        
        int D=0;
        int W=0;
        int Cp=0;

        int num=0;
        int balance = 0;
        do{
            System.out.println(" 1.Account balance \n 2.Deposite \n 3.Withdraw \n 4.Check previous transaction \n 5.Exit \n");
            System.out.println("Choose your option: ");
            num = sc.nextInt();
            System.out.println();

            if(num == 1){
                System.out.println("Your Account balance is: " + balance + "\n");
            }
            else if(num == 2){
                System.out.println("Enter the ammount you wanna deposite: ");
                D = sc.nextInt();
                balance = balance + D;
                Cp = D;
                System.out.println();
            }
            else if(num == 3){
                System.out.println("Enter the amount you wanna withdraw: ");
                W = sc.nextInt();
                System.out.println();
                if(W > balance){
                    System.out.println("Your value exceeds your current balance!");
                    break;
                }
                balance = balance - W;
                Cp = -W;
            }
            else if(num == 4){
                if(Cp < 0){
                    System.out.println("You lastly Withdrawed: " + Math.abs(Cp));
                }
                else{
                    System.out.println("You lastly Deposited: " + Cp);
                }
                System.out.println();
            }
            else {
                break;
            }
        }while(num <= 5 && num >= 1);
        
        if(num > 5 || num < 0){
            System.out.println("Invalid Option!!");
        }
        System.out.println("Bye!!");
        sc.close();
    }
}
