import java.util.Arrays;
public class BP1 {
    public static void main(String[] args){
        String[] arr= new String[6];
        for(int i=0;i<6;i++){ //Lakshay
            arr[i]=args[i].toUpperCase();
        }
        Arrays.sort(arr);
        System.out.println("******Sorted City Names:********");
        for(int i=0;i<6;i++){
            System.out.println(arr[i]);
        }
    }
}
