package hw_task02;

public class KKFlavouredTea extends KKTea{

    public KKFlavouredTea(String tea_name,int price,int tea_bags){
        super(price,tea_bags);
        super.name = "KK "+tea_name+" Tea";
    }
    public static void updateSoldStatusFlavoured(KKFlavouredTea object){
        flavoured_tea_sales++;
        total_sales++;
    }
}
