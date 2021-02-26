import java.util.Scanner;
public class BP5 {
    public static void main(String[] args) {
        int size;
        System.out.println("*******Enter no of rows :********");
        Scanner s= new Scanner(System.in);
        size=s.nextInt();
        if(size<=0){
            System.out.println("Dont you even know a valid size of array?? :D ");
            System.out.println("*****Exiting******");
            System.exit(0);
        }
        int[][] arr= new int[size][];  
        int x=1;
        for(int y=0;y<size;y++){
            arr[y]=new int[x++];
        }
        int k;
        for(int i=0;i<arr.length;i++)
        {   
            k=1;
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=k++;
            }
        }
        //printing 1st pattern
        for(int i=0;i<arr.length;i++)
        {   
            for(int a=0;a<arr.length;a++){
                System.out.print(" ");
            }
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //printing 2nd pattern
        for(int i=0;i<arr.length;i++)
        {   
            for(int a=arr.length-1-i;a>=0;a--){
                System.out.print(" ");
            }
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        s.close();
    } 
}


