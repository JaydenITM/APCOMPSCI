package pkg;

public class Movie{
    
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 62335791;
    }
    
    public Movie(String a, double b, int c, int d){
        movieName = a;
        rating = b;
        numRatings = c;
        revenue = d;
    }
    
    public void movieToString(){
        System.out.println("Movie: "+movieName);
        System.out.println("Rating: "+rating);
        System.out.println("Number of ratings: "+numRatings);
        System.out.println("Revenue: "+revenue);
        System.out.println(" ");
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public void addRating(double a){
        rating = ((rating*numRatings)+a)/(numRatings+1);
        numRatings++;
    }
    
    public double getRating(){
        return rating;
    }
    
    public boolean compareRatings(Movie a){
        Movie b = new Movie();
        double val1 = a.getRating();
        double val2 = b.getRating();
        if (val2>val1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int revenueToString(){
        return revenue;
    }
    
}
