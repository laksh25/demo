/**
 * An application maintains information regarding Products and Suppliers for a
particular business. Identify and implement the relation between Product and
Supplier. Create a program that provides the following options:
a) Enter ProductID
b) Enter SupplierID
When the user enters a valid
a) ProductID the details of suppliers who supply that product should be
displayed
b) SupplierID the details of products supplied by that supplier should be
displayed
Each product might be supplied by multiple suppliers also one supplier can supply multiple products.
 */
import java.util.Scanner;
public class BP9 {
    public static void main(String[] args) {
        Business b=new Business();
        b.details();
    }
}

class Business{
    void details(){
    String[][] supplier= new String[10][5];
      //supplierID               //Gears               
    supplier[0][0]= "S1";  supplier[0][1]= "Smart Watch";           
    supplier[1][0]= "S2";  supplier[1][1]= "Earpodes";              
    supplier[2][0]= "S3";  supplier[2][1]= "Smart Watch";
    supplier[3][0]= "S4";  supplier[3][1]= "Smartfit";
    supplier[4][0]= "S5";  supplier[4][1]= "Speakers";
    supplier[5][0]= "S6";  supplier[5][1]= "Earpodes";

    //Product1Name                      //Product 2Name
    supplier[0][2]= "Television";  supplier[0][3]= "Washing Machine";           
    supplier[1][2]= "Washing Machine";  supplier[1][3]= "Television";              
    supplier[2][2]= "Refrigerator";  supplier[2][3]= "Air Conditioner";
    supplier[3][2]= "Washing Machine";  supplier[3][3]= "Monitors";
    supplier[4][2]= "Referigerator";  supplier[4][3]= "Microwave";
    supplier[5][2]= "Television";  supplier[5][3]= "Washing Machine";

    //productid
    supplier[0][4]= "P1";             
    supplier[1][4]= "P2";               
    supplier[2][4]= "P3";     
    supplier[3][4]= "P4";  
    supplier[4][4]= "P5";  
    supplier[5][4]= "P6";                

    String[][] product= new String[10][5];
      //productID               //supplier Name               
    product[0][0]= "P1";  product[0][1]= "Samsung";           
    product[1][0]= "P2";  product[1][1]= "IBM";              
    product[2][0]= "P3";  product[2][1]= "Whirlpool";              
    product[3][0]= "P4";  product[3][1]= "Panasonic";              
    product[4][0]= "P5";  product[4][1]= "Lakshay";              
    product[5][0]= "P6";  product[5][1]= "Onida";                           
    
    //supplier office Branch                    //Country
    product[0][2]= "Mehrauli";  product[0][3]= "India";           
    product[1][2]= "Mumbai";  product[1][3]= "India";           
    product[2][2]= "Sydney Town";  product[2][3]= "Australia";           
    product[3][2]= "Kamla Nagar";  product[3][3]= "India";           
    product[4][2]= "Cape Town";  product[4][3]= "South Africa";           
    product[5][2]= "Guwahati";  product[5][3]= "India";                   
    
    //supplier id
    product[0][4]= "S1";             
    product[1][4]= "S2";               
    product[2][4]= "S3";     
    product[3][4]= "S4";  
    product[4][4]= "S5";  
    product[5][4]= "S6";           
    
    System.out.println("Select your choice:  ");
    System.out.println("1)Enter supplierId  ");
    System.out.println("2)Enter productID  ");
    
    Scanner s= new Scanner(System.in);
    int ch=s.nextInt();
    String supplierid,productid; 
    String pname1="", pname2="",pname3="";
    

    switch(ch){
        case 1:  System.out.println("Enter supplierId to know the details of that product");
                supplierid=s.next().toUpperCase();
                boolean flagt= false;
                for(int i=0;i<6;i++){
                        if(supplier[i][0].equals(supplierid)){
                                pname1=supplier[i][1];
                                pname2=supplier[i][2];
                                pname3=supplier[i][3];
                                flagt=true;
                        }
                }
                if(flagt==false){
                    System.out.println("Not a valid supplierid");
                    System.exit(0);
                }
                System.out.println("Details of product with supplier id "+supplierid+" are: ");
                System.out.println("Ist Product Name: "+ pname1);
                System.out.println("IInd Product Name: "+ pname2);
                System.out.println("IIIrd Product Name: "+ pname3);
                
                System.out.println();
                break;

        case 2: System.out.println("Enter productId to know the details of the supplier of that product:");
                productid=s.next().toUpperCase();
                boolean flagp=false;
                String suppliername="";
                for(int i=0;i<6;i++){
                        if(product[i][0].equals(productid)){
                            
                            System.out.println("Details of product with supplier id "+productid+" are: ");
                            System.out.println("Supplier Name is: "+product[i][1]);
                            System.out.println("supplier Office Branch is: "+product[i][2]);
                            System.out.println("supplier Country is: "+product[i][3]);
                            suppliername=product[i][1];
                            flagp=true;
                        }        
                }
                if(flagp==false){
                    System.out.println("Not a valid productid");
                    System.exit(0);
                }

                System.out.println();
                break;
            
            default: System.out.println("Not a Valid Choice!!!");
            } 
    s.close();
    }
}
