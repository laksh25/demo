import java.util.*;
public class BP7 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>();
        
        list.add(new Student(12,"Lakshay","Gupta",92.7));
        list.add(new Student(35,"Anjay","Mehta",72.5));
        list.add(new Student(70,"Gijra","Narayan",88.3));

        Collections.sort(list);
        System.out.println("Students details after sorting based on their ROLLNO");
        //display
        for(Student s:list){
            System.out.print(s.getroll()+" ");
            System.out.print(s.getname()+" ");
            System.out.println(s.getPerc());
        }
        System.out.println();
        
        FnameCompare fname=new FnameCompare();
        
        Collections.sort(list,fname);
        System.out.println("Students details after sorting based on their First Name");
        //display
        for(Student s: list){
            System.out.print(s.getroll()+" ");
            System.out.print(s.getname()+" ");
            System.out.println(s.getPerc());
        }

        PercCompare perc=new PercCompare();
        Collections.sort(list,perc);

        System.out.println();
        System.out.println("Students details after sorting based on their Percentage");
        //display
        for(Student s: list){
            System.out.print(s.getroll()+" ");
            System.out.print(s.getname()+" ");
            System.out.println(s.getPerc());
        }
    }  
}
class Student implements Comparable<Student>
{
    int rollno;
    String fname;
    String lname;
    Double perc;

    public int compareTo(Student s){
        return this.rollno-s.rollno;
    }
    Student(int roll, String fname, String lname, Double perc ){
        rollno=roll;
        this.fname=fname;
        this.lname=lname;
        this.perc=perc;
    }
    int getroll(){
        return rollno;
    }
    String getfname(){
        return fname;
    }
    String getname(){
        return(fname+" "+lname);
    }
    Double getPerc(){
        return perc;
    }
}
//to sort Student details based on their fname
class FnameCompare implements Comparator<Student> {

    public int compare(Student s1, Student s2){  
        // return s1.getfname().compareTo(s2.getfname());
        return s1.fname.compareTo(s2.fname);
    }
}
class PercCompare implements Comparator<Student>{
    
    public int compare(Student s1, Student s2){
        if(s1.perc<s2.perc){
            return -1;
        }
        else if(s1.perc>s2.perc){
            return 1;
        }
        else return 0;
    }
}