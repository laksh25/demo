/**
 * Code to declare & instantiate a 2D-array to hold marks obtained by students
in different subjects in a class. Assume that there are up to 10 students in a
class & there are 5 subjects. Find out the best student according to average
marks of all subjects and display all the marks of him/her.
 */
import java.util.Arrays;
public class BP8 {
    public static void main(String[] args) {
        Result r= new Result();
        r.res();
    }
}
class Result{
    String std[][]=new String[10][6];
    void res(){
        //Std name            //Maths          //Physics         //Chmemistry      //C++           //English
        std[0][0]="Lakshay";  std[0][1]="95";  std[0][2]="95";  std[0][3]="95";  std[0][4]="91";  std[0][5]="87";
        std[1][0]="Andrew";  std[1][1]="87";  std[1][2]="78";  std[1][3]="92";  std[1][4]="87";  std[1][5]="90";
        std[2][0]="Mathew";  std[2][1]="80";  std[2][2]="86";  std[2][3]="68";  std[2][4]="78";  std[2][5]="67";
        std[3][0]="Mohammad";  std[3][1]="89";  std[3][2]="32";  std[3][3]="82";  std[3][4]="90";  std[3][5]="78";
        std[4][0]="De Silva";  std[4][1]="32";  std[4][2]="43";  std[4][3]="54";  std[4][4]="96";  std[4][5]="92";
        std[5][0]="Augustus";  std[5][1]="54";  std[5][2]="65";  std[5][3]="89";  std[5][4]="41";  std[5][5]="80";
        std[6][0]="John";  std[6][1]="57";  std[6][2]="98";  std[6][3]="90";  std[6][4]="43";  std[6][5]="91";
        std[7][0]="Oasis";  std[7][1]="72";  std[7][2]="90";  std[7][3]="91";  std[7][4]="82";  std[7][5]="89";
        std[8][0]="Yuvi";  std[8][1]="89";  std[8][2]="76";  std[8][3]="65";  std[8][4]="69";  std[8][5]="71";
        std[9][0]="Vanshul";  std[9][1]="43";  std[9][2]="88";  std[9][3]="78";  std[9][4]="76";  std[9][5]="67";

        double avg[]=new double[std.length];
        for(int i=0;i<std.length;i++){
        avg[i]=((Double.parseDouble(std[i][1])+Double.parseDouble(std[i][2])+Double.parseDouble(std[i][3])+
               Double.parseDouble(std[i][4])+Double.parseDouble(std[i][5]))/500)*100;
        }
    
        Arrays.sort(avg);

        double bstavg= avg[9];
        //fetching details of student with best marks
        for(int i=0;i<std.length;i++){
            if(bstavg==((Double.parseDouble(std[i][1])+Double.parseDouble(std[i][2])+Double.parseDouble(std[i][3])+
            Double.parseDouble(std[i][4])+Double.parseDouble(std[i][5]))/500)*100){
                        System.out.println("Student having best avg in all subjects is: "+std[i][0]);
                        System.out.println();
                        System.out.println("Marks obtianed by "+ std[i][0]+" in Maths : "+std[i][1]);
                        System.out.println("Marks obtained by "+ std[i][0]+ " in Physics : "+std[i][2]);
                        System.out.println("Marks obtained by "+ std[i][0]+ " in Chemistry : "+std[i][3]);
                        System.out.println("Marks obtained by "+ std[i][0]+ " in C++ : "+std[i][4]);
                        System.out.println("Marks obtained by "+ std[i][0]+ " in English : "+std[i][5]);
                       }
        }
    }
}
