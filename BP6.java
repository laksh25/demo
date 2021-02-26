import java.util.Scanner; 
public class BP6 {
    public static void main(String[] args) {
        Sport s= new Sport();
        s.details();
    } 
}

class Sport{
    void details(){
    String[][] team= new String[10][5];
      //TeamID               //Name               
    team[0][0]= "T1";  team[0][1]= "Abraham";           
    team[1][0]= "T2";  team[1][1]= "Lakshay";              
    team[2][0]= "T3";  team[2][1]= "Mathew";
    team[3][0]= "T4";  team[3][1]= "Harry";
    team[4][0]= "T5";  team[4][1]= "Ronnie";
    team[5][0]= "T6";  team[5][1]= "William";
    team[6][0]= "T7";  team[6][1]= "Augustus";
    team[7][0]= "T8";  team[7][1]= "Telma";
    team[8][0]= "T9";  team[8][1]= "Manoj";
    team[9][0]= "T10";  team[9][1]= "Akhil";             
    
    //Role in Team       //Age
    team[0][2]= "Opening Batsman";  team[0][3]= "21";           
    team[1][2]= "Opening Batsman";  team[1][3]= "22";              
    team[2][2]= "All Rounder";  team[2][3]= "19";
    team[3][2]= "Fast Bowler";  team[3][3]= "25";
    team[4][2]= "Spinner";  team[4][3]= "24";
    team[5][2]= "All Rounder";  team[5][3]= "21";
    team[6][2]= "Wk Batsman (Captain)";  team[6][3]= "27";
    team[7][2]= "Spinner";  team[7][3]= "20";
    team[8][2]= "Fast Bowler";  team[8][3]= "18";
    team[9][2]= "All Rounder";  team[9][3]= "29";    
    
    //playerid
    team[0][4]= "P1";             
    team[1][4]= "P2";               
    team[2][4]= "P3";     
    team[3][4]= "P4";  
    team[4][4]= "P5";  
    team[5][4]= "P6"; 
    team[6][4]= "P7";
    team[7][4]= "P8";
    team[8][4]= "P9";
    team[9][4]= "P10";                 

    String[][] player= new String[10][5];
      //PlayerID               //Team Name               
    player[0][0]= "P1";  player[0][1]= "Maharashtra";           
    player[1][0]= "P2";  player[1][1]= "Delhi";              
    player[2][0]= "P3";  player[2][1]= "Adelaide";              
    player[3][0]= "P4";  player[3][1]= "Baroda";              
    player[4][0]= "P5";  player[4][1]= "Capetown";              
    player[5][0]= "P6";  player[5][1]= "Jharkhand";              
    player[6][0]= "P7";  player[6][1]= "Jamaica";              
    player[7][0]= "P8";  player[7][1]= "Chennai";              
    player[8][0]= "P9";  player[8][1]= "Kandy";              
    player[9][0]= "P10";  player[9][1]= "Southhall";              
    
    //Team stadium                     //Country
    player[0][2]= "WCG";  player[0][3]= "India";           
    player[1][2]= "ACG";  player[1][3]= "India";           
    player[2][2]= "FSK";  player[2][3]= "Australia";           
    player[3][2]= "MCG";  player[3][3]= "India";           
    player[4][2]= "LCG";  player[4][3]= "South Africa";           
    player[5][2]= "JLNCG";  player[5][3]= "India";           
    player[6][2]= "QCG";  player[6][3]= "West Indies";           
    player[7][2]= "WOCG";  player[7][3]= "India";           
    player[8][2]= "AUCG";  player[8][3]= "Sri Lanka";           
    player[9][2]= "BCG";  player[9][3]= "EngLand";           
    
    
    //team id
    player[0][4]= "T1";             
    player[1][4]= "T2";               
    player[2][4]= "T3";     
    player[3][4]= "T4";  
    player[4][4]= "T5";  
    player[5][4]= "T6"; 
    player[6][4]= "T7";
    player[7][4]= "T8";
    player[8][4]= "T9";
    player[9][4]= "T10";           
    
    System.out.println("Select your choice:  ");
    System.out.println("1)Enter TeamId  ");
    System.out.println("2)Enter PlayerID  ");
    
    Scanner s= new Scanner(System.in);
    int ch=s.nextInt();
    String teamid,playerid; 
    String pname="", prole="";
    int age=0;
    

    switch(ch){
        case 1:  System.out.println("Enter TeamId to know the details of that player");
                teamid=s.next().toUpperCase();
                boolean flagt= false;
                for(int i=0;i<10;i++){
                        if(team[i][0].equals(teamid)){
                                pname=team[i][1];
                                prole=team[i][2];
                                age=Integer.parseInt(team[i][3]);
                                flagt=true;
                        }
                }
                if(flagt==false){
                    System.out.println("Not a valid Teamid");
                    System.exit(0);
                }
                System.out.println("Details of Player with team id "+teamid+" are: ");
                System.out.println("Player Name: "+ pname);
                System.out.println("Player Role: "+ prole);
                System.out.println("Player Age: "+ age);
                
                System.out.println();
                System.out.println("Want to know details of " +pname+"'s"+ " team??(y/n)");
                String inp=s.next().toUpperCase();

                if(inp.equals("Y")){
                    for(int i=0;i<10;i++){
                        if(teamid.equals(player[i][4])){
                            System.out.println("Team Name is: "+player[i][1]);
                            System.out.println("Team Home Ground is: "+player[i][2]);
                            System.out.println("Team Nationality is: "+player[i][3]);
                            
                        }
                    }
                }
                else{
                    System.out.println("Ok Exiting....");
                    System.exit(0);
                }
                break;

        case 2: System.out.println("Enter PlayerId to know the details of the team of that player:");
                playerid=s.next().toUpperCase();
                boolean flagp=false;
                String teamname="";
                for(int i=0;i<10;i++){
                        if(player[i][0].equals(playerid)){
                            
                            System.out.println("Details of Player with team id "+playerid+" are: ");
                            System.out.println("Team Name is: "+player[i][1]);
                            System.out.println("Team Home Ground is: "+player[i][2]);
                            System.out.println("Team Nationality is: "+player[i][3]);
                            teamname=player[i][1];
                            flagp=true;
                        }        
                }
                if(flagp==false){
                    System.out.println("Not a valid Playerid");
                    System.exit(0);
                }
                System.out.println();
                System.out.println("Want to know details of players of "+teamname+" team??(y/n)");
                String inp1=s.next().toUpperCase();

                if(inp1.equals("Y")){
                    for(int i=0;i<10;i++){
                        if(playerid.equals(team[i][4])){
                            System.out.println("Player Name is: "+team[i][1]);
                            System.out.println("Player Role is: "+team[i][2]);
                            System.out.println("Player Age is: "+team[i][3]);
                            
                        }
                    }
                }
                else{
                    System.out.println("Ok Exiting....");
                    System.exit(0);
                }
                break;
            
            default: System.out.println("Not a Valid Choice!!!");
            } 
    s.close();
    }
}
