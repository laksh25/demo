class Waffle{
    double Price;
    String flavor;
    Waffle(double p, String fvr){
        //Lakshay BP3
        Price=p;
        flavor=fvr;
    }
    public String toString(){
        return (this.Price+" "+this.flavor); 
    }
    void equals(Waffle w)
     {
        if(this.Price==w.Price && this.flavor==w.flavor){
            System.out.println("Both flavours and price are same");
        }
        else{
            System.out.println("Flavours and price are different");
       
        }
    }
}
public class WaffleMain {
    double Price;
    String flavor;

   WaffleMain(double p, String fvr){
       Price=p;
       flavor=fvr;
   } 
   public static void main(String[] args) {
       Waffle w1= new Waffle(250.50,"Vanilla");
       Waffle w2= new Waffle(250.50,"Chocolate");
       System.out.println("The price and flavour of Waffle class: "+w1.toString());
       System.out.println("The price and flavour of WaffleMain class"+w2.toString());
       w1.equals(w2);
   }
}
