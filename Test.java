/**
 * Simulate a simple banking application. Provide for classes Bank and interface
Account. Account will be of two type- Savings and Current. There should be
methods to open an account, close an account and perform withdraw, deposit
and transfer operations on an account as abstract methods in Account and
properly overridden with definition in Account Types. Test classes should
instantiate Account Type Classes and provide a menu driven option for
operations.
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Savings sobj= new Savings();
        Scanner s= new Scanner(System.in);
        System.out.println("Select what type of Account you like to create (1/2): ");
        System.out.println("1) Savings ");
        System.out.println("2) Current ");
        int ch=s.nextInt();
        if(ch==1){
            int res= sobj.opacc();
            if(res==1){
                System.out.println("Select operation you like to perform on your Savings account:(1/2/3)  ");
                System.out.println("1) Cash Deposit ");
                System.out.println("2) Cash Withdrawl ");
                System.out.println("3) Close Account ");
                int ch1=s.nextInt();
                if(ch1==1){
                    sobj.cashdep();
                }
                else if(ch1==2){
                    sobj.cashwdr();
                }
                else if(ch1==3){
                    sobj.clacc();
                }
                else{
                    System.out.println("Not a valid choice!!");
                }
            }
        }  
        Current cobj= new Current();
        if(ch==2){
            int res1=cobj.opacc();
            if(res1==1){
                System.out.println("Select operation you like to perform on your Current account:(1/2/3)  ");
                System.out.println("1) Cash Deposit ");
                System.out.println("2) Cash Withdrawl ");
                System.out.println("3) Close Account ");
                int ch1=s.nextInt();
                if(ch1==1){
                    cobj.cashdep();
                }
                else if(ch1==2){
                    cobj.cashwdr();
                }
                else if(ch1==3){
                    cobj.clacc();
                }
                else{
                    System.out.println("Not a valid choice!!");
                }
            }
        } 
        else{
            System.out.println("Not a valid choice!!");
        }
    s.close();
    }
}
interface Accounts{
    int opacc();
    void clacc();
    void cashdep();
    void cashwdr();
}

class Savings implements Accounts{
    Scanner s= new Scanner(System.in);
        int accno;
        String name;
        long contno;
        String add;
        double accbal;
    public int opacc(){
        int accno=1001;
        System.out.println("Enter your name");
        String name=s.next();
        System.out.println("Enter your mobile no");
        long contno=s.nextLong();
        System.out.println("Enter your Address");
        String add=s.next();
        System.out.println("Enter your opening balance for your account (Atleast Rs. 5000)");
        accbal=s.nextDouble();
        if(accbal>=5000){
            System.out.println("Account is created Successfully");
            return 1;
        }
        else{
            System.out.println("Opening balance too low!!!");
            System.out.println("Failed to create Account ");
            System.exit(0);
            return 0;
        }
    }
    public void clacc(){
        System.out.println("Closing your account....");
        accno=0;
        name="";
        contno=0;
        add="";
        System.out.println("Your account has been closed");
    }
    public void cashdep(){
        System.out.println("Enter cash you want to deposit: ");
        long cash=s.nextLong(); 
        accbal+=cash;
        System.out.println("New account Balance: "+accbal);
    }

    public void cashwdr(){
        System.out.println("Enter cash you want to withdrawl: ");
        long cash=s.nextLong();
        accbal-=cash;
        System.out.println("New account Balance: "+accbal);
    }
}

class Current implements Accounts{
    Scanner s= new Scanner(System.in);
        int accno;
        String name;
        long contno;
        String add;
        double accbal;
        String busi;
    public int opacc(){
        int accno=1001;
        System.out.println("Enter your name: ");
        String name=s.next();
        System.out.println("Enter your mobile no: ");
        long contno=s.nextLong();
        System.out.println("Enter your Address: ");
        String add=s.next();
        System.out.println("Enter your Business Name: ");
        String busi=s.next();
        System.out.println("Enter your opening balance for your account (Atleast Rs. 10000): ");
        accbal=s.nextDouble();

        if(accbal>=10000){
            System.out.println("Account is created Successfully");
            return 1;
        }
        else{
            System.out.println("Opening balance too low!!!");
            System.out.println("Failed to create Account ");
            System.exit(0);
            return 0;
        }
    }
    public void clacc(){
        System.out.println("Closing your account....");
        accno=0;
        name="";
        contno=0;
        add="";
        System.out.println("Your account has been closed");
    }
    public void cashdep(){
        System.out.println("Enter cash you want to deposit: ");
        long cash=s.nextLong(); 
        accbal+=cash;
        System.out.println("New account Balance: "+accbal);
    }
    public void cashwdr(){
        System.out.println("Enter cash you want to withdrawl: ");
        long cash=s.nextLong();
        accbal-=cash;
        System.out.println("New account Balance: "+accbal);
    }
}

