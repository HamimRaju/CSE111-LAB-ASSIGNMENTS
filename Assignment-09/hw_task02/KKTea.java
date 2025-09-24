package hw_task02;

public class KKTea  extends Tea{

    public int tea_bags;
    public int weight;
    public static int total_sales;
    public static int kk_regular_tea_sales;
    public static int flavoured_tea_sales;

    public KKTea(int price , int tea_bags){
        super("KK Regular Tea",price); 
        this.tea_bags = tea_bags;
        this.weight = tea_bags*2;
    }
    
    public static void updateSoldStatusRegular(KKTea object){
        object.status = true;
        kk_regular_tea_sales++;
        total_sales++;
    }

    public static void totalSales(){
        System.out.println("Total Sales : "+total_sales);
        System.out.println("KK Regular Tea : "+kk_regular_tea_sales);
        if(flavoured_tea_sales>0){
            System.out.println("KK Flavored Tea : "+flavoured_tea_sales);
        }
    }

    public void productDetail(){
        super.productDetail();
        System.out.println("Weight : "+weight+", "+"Tea Bags : "+tea_bags);
    }
}
