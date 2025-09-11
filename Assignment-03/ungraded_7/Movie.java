package ungraded_7;

public class Movie {
    public String movie_name;
    public String director_name;
    public double rating;
    public String [] all_actors = new String[4];
    int count = 0;

    public void setMovieDetails(String title,String director,double rating){
        movie_name = title;
        director_name=director;
        this.rating= rating;
    }
    public void setMovieDetails(String title,String director){
        movie_name = title;
        director_name=director;
    }
    public void addActors(String name){
        all_actors[count] =name;
        count++;
        System.out.println("Added actor \""+name+"\" to \""+movie_name+"\".");
    }
    public void addActors(String actor1,String actor2){
        all_actors[count] =actor1;
        count++;
        System.out.println("Added actor \""+actor1+"\" to \""+movie_name+"\".");
        all_actors[count] =actor2;
        count++;
        System.out.println("Added actor \""+actor2+"\" to \""+movie_name+"\".");
    }
     public void addActors(String actor1,String actor2,String actor3){
        all_actors[count] =actor1;
        count++;
        System.out.println("Added actor \""+actor1+"\" to \""+movie_name+"\".");
        all_actors[count] =actor2;
        count++;
        System.out.println("Added actor \""+actor2+"\" to \""+movie_name+"\".");
        all_actors[count] =actor3;
        count++;
        System.out.println("Added actor \""+actor3+"\" to \""+movie_name+"\".");
    }
    public void updateRating(double rating){
        this.rating = rating;
        System.out.println("Updated rating of \""+movie_name+"\" to"+rating);
    }

    public void showInfo(){
        System.out.println("Title : "+movie_name);
        System.out.println("Director : "+director_name);
        System.out.println("Rating : "+rating);
        System.out.println("Actors : ");
        for(int i=0;i<count;i++){
            System.out.print(all_actors[i]+",");
        }
        System.out.println();
    }

}
