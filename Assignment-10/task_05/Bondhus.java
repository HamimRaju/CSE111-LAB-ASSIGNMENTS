package task_05;

public class Bondhus extends SocialMedia{

    public String [] sent_box = new String[5];
    public int count;

    public Bondhus(String name,String mail){
        super(name, mail);
    }

    public void sendMessage(String message){
        if(count<5){
            sent_box[count]=message;
            count++;
        }
        else{
            System.out.println("Sentbox is full.");
            return;
        }
        
    }   

    public void showSentbox(){
        System.out.println(userName+" Sentbox : ");
        if(count ==0){
            System.out.println("No sent messages.");
        }
        else if(count>0 && count<5){
            for(int i=0;i<count;i++){
                System.out.println(sent_box[i]);
            }
        }    
    }

    public String toString(){
        return super.toString()+"\nMessages Sent : "+count;
    }
}
