package task_01;

public class NikeBD {

    public static String [] products = { "Jordan", "Cortez", "Kobe" };
    public static int [] total_stock = {0, 0, 0};
    public int [] branch_stock ={0, 0, 0};

    public String outlet;
    public static int total_sold;
    public int branch_sold;
    public static int total_branch;

    public NikeBD(String outlet){
        this.outlet = outlet;
        total_branch++;
    }

    public void productSold(String name,int qunatity,String name2,int qunatity2){
        for(int i=0;i<products.length;i++){
            if(name.equals(products[i])){
                branch_stock[i]-=qunatity;
                total_stock[i]-=qunatity;
                total_sold+=qunatity;
                branch_sold+=qunatity;   
            }
            else if(name2.equals(products[i])){
                branch_stock[i]-=qunatity2;
                total_stock[i]-=qunatity2;
                total_sold+=qunatity2;
                branch_sold+=qunatity2;
            }
        }
    }

    public static void status(){
        System.out.println("Nike Bangladesh Status : ");
        System.out.println("Branches Opened : "+total_branch);
        System.out.println("Currently Stocked : ");
        for(int i=0;i<3;i++){
            System.out.print(products[i]+": "+total_stock[i]+", ");
        }
        System.out.println("\nSold : "+total_sold);
    }

    public void restockProducts(String name,int qunatity){
        for(int i=0;i<products.length;i++){
            if(name.equals(products[i])){
                branch_stock[i]+=qunatity;
                total_stock[i]+=qunatity;
            }
        }
    }

    public void restockProducts(String [] products,int[] qty){
        for(int i=0;i<3;i++){
            restockProducts(products[i], qty[i]);
        }
    }
    

    public void details(){
        System.out.println("Nike "+outlet+" outlet: ");
        System.out.println("Products Currently Stocked: ");
        for(int i=0;i<3;i++){
            System.out.print(products[i]+": "+branch_stock[i]+", ");
        }
        System.out.println("\nSold: "+branch_sold);
    }
}
