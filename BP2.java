import java.util.Arrays;
class BP2{
    static void fastRunnerFinder(){
        String[][] data=new String[16][16];
        data[0][0]= "Elena";  data[0][1]= "341";
        data[1][0]= "Thomas"; data[1][1]= "273";
        data[2][0]= "Hamilton"; data[2][1]= "278";
        data[3][0]= "Suzie"; data[3][1]= "329";
        data[4][0]= "Phil"; data[4][1]= "445";
        data[5][0]= "Matt"; data[5][1]= "402";
        data[6][0]= "Alex"; data[6][1]= "388";
        data[7][0]= "Emma"; data[7][1]= "275";
        data[8][0]= "John"; data[8][1]= "243";
        data[9][0]= "Jane"; data[9][1]= "412";
        data[10][0]= "Emily"; data[10][1]= "393";
        data[11][0]= "Daniel"; data[11][1]= "299";
        data[12][0]= "Neda"; data[12][1]= "343";
        data[13][0]= "Aaron"; data[13][1]= "317";
        data[14][0]= "Kate"; data[14][1]= "265";

        int[] sort=new int[15];
        for(int i=0;i<15;i++){
            sort[i]=Integer.parseInt(data[i][1]);
        }
        //Time is sorted
        Arrays.sort(sort);
        //Minimum time is stored in minTime
        int minTime=sort[0]; //Lakshay BP2
        int secRunner=sort[1];
        for(int i=0;i<15;i++){
            if(minTime==Integer.parseInt(data[i][1])){
                System.out.println();
                System.out.print("*** Fastest Runner is: ");
                System.out.println(data[i][0]+" *****");
                System.out.println("**** Time taken by fastest Runner is: "+ minTime+" ******"); 
                System.out.println();
            }
            if(secRunner==Integer.parseInt(data[i][1])){
                System.out.print("*** RunnerUP is: ");
                System.out.println(data[i][0]+" *****");
                System.out.println("**** Time taken by RunnerUp is: "+ secRunner+" ******"); 
            }
        }
    }
    public static void main(String[] args) {
        fastRunnerFinder();
    }
}



