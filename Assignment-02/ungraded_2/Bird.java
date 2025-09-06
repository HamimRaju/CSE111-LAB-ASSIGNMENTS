package ungraded_2;
public class Bird {
    String name ;
    String sound;
    int total_height=0;
    public void flyUp(int height){
        System.out.println(name+" has flown up "+height+" feet.");
        total_height+=height;
    }
    public void flyDown(int height){
        if(height<total_height){
            System.out.println(name+" has flown down "+height+" feet.");
            total_height-=height;
        }
        else if(total_height==height){
            System.out.println(name+" has flown down " +height +" feet and landed.");
        }
        else if(height>total_height){
            System.out.println(name+" can not fly down "+height+" feet.");
        }
    }
    public void makeNoise(){
        if(name.equals("Parrot")){
            System.out.println("Squawk");
        }
        else if( name.equals("Eagle")){
            System.out.println("Squee");
        }
    }
}
