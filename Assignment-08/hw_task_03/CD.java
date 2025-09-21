package hw_task_03;

public class CD extends Product{
    
    public String band;
    public int duration;
    public String genre;

    public CD(int id,String title,int price,String band,int duration,String genre){
        super(id, title, price);

        this.band = band;
        this.duration = duration;
        this.genre = genre;
    }

    public String printDetail(){
        return super.getIdTitlePrice()+"\nBand : "+this.band+" Duration : "+this.duration+" minutes"+" \nGenre : "+this.genre;
    }
}
