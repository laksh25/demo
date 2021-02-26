import java.util.Scanner;
class BP4{
    public static void main(String[] args) {
        //a) charAt()
        System.out.println("******charAt() usage example********");
        System.out.println();
        String str="Traverse#this";
        System.out.println("String before traversal: "+str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                str=str.replace('#',' ');
            }
        }
        System.out.println("String after Traversal: "+str);
        System.out.println();
        //b)  length()
        System.out.println("******length() usage example********");
        System.out.println();
        //lets say to compare two strings
        String str1="Short"; 
        String str2="Longer";
        int len=0;
        if(str1.length()<=str2.length()){
            len=str1.length();
        } 
        else if(str1.length()>=str2.length()){
            len=str2.length();
        }
        int ctr=0;
        for(int i=0;i<len;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                ctr++;
            }
        }
        if(ctr==len){
            System.out.println("Strings are equal");
        }
        else if(ctr!=len){
            System.out.println("Strings are not equal");
        }

        //c) contains()
        System.out.println("******contains() usage example********");
        System.out.println();
        System.out.println("'Using contains() to check if string contains Trav or not");
        System.out.println(str.contains("Trav"));

        //d) equals() and ==
        //easy way to find if two strings are equal.
        System.out.println("******equals() usage example********");
        System.out.println();
        String s1="String";
        String s2="String";
        if(s1.equals(s2)){
            System.out.println("Strings are equal");
        }
        
        //e) indexOf()
        //to find index of the character or a substring within a String
        System.out.println("******indexOf() usage example********");
        System.out.println();
        String s3="ThisIsTheString";
        int ind1= s3.indexOf("The");
        int ind2= s3.indexOf('i',8);
        System.out.println("index of 'The' is: "+ ind1);
        System.out.println(ind2);

        //f) spit() 
        System.out.println("******split() usage example********");
        System.out.println();
        String s4="This is the string we have split on the basis of spaces";
        String[] splitarr=s4.split(" ");
        for(int i=0; i< splitarr.length;i++){
            System.out.print(i+" "+ splitarr[i]);
            System.out.println();
        }
        System.out.println();
        //g) toUpperCase()
        //let say we take value from user and he type the value in both 
        //lowercase and uppercase then to work with that string with uneven 
        //characters may be not ideal.
        System.out.println("******toUpperCase() usage example********");
        System.out.println();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a String you want in upper");
        String s5=s.nextLine();
        s5=s5.toUpperCase();
        System.out.println(s5);
        s.close();
    }
}



