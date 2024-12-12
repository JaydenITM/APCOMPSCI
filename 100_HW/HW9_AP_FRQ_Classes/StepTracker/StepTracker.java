public class StepTracker{
    int steps; 
    int days; 
    int activeDays; 
    
    public StepTracker(int a){
        steps = a; 
    }
    
    public int activeDays(){
        return activeDays; 
    }
    
    public double averageSteps(){
        return (steps/days)*1.0;
    }
    
    public void addDailySteps(int a){
        steps = steps + a; 
        if(a>10000){
            activeDays++;
        }
        days++;
    }
}