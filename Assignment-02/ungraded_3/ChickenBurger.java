package ungraded_3;

public class ChickenBurger {
    public String bun="Sesame";
    public int price=200;
    public String sauceOption="Less";
    public String[] all_spicy_level={"Mild","Spicy","Naga"};
    public String spiceLevel="Not set";

    public void customizeSpiceLevel(String spice){
        spiceLevel=spice;
        for(int i=0;i<all_spicy_level.length;i++){
            if(all_spicy_level[i].equals(spice)){
                spiceLevel=spice;
                System.out.println("Spice level set to "+ spiceLevel);  
                return;
            }
        }
        System.out.println("This spice level is unavailable");  
        
    }
    public String serveBurger(){
        for(int i=0; i<all_spicy_level.length; i++){
            if(spiceLevel.equals(all_spicy_level[i])){
                return"The burger is being served:-\nBun Type: "+this.bun+"\nPrice: "+this.price+"\nSauce option: "+sauceOption+"\nSpice Level: "+this.spiceLevel;
            }
        }
        return"Cannot serve now. Customize Spice Level first.";
    }
    
}
