public class Odi extends Match{ 
    private int currentScore;          
 private float currentOver;
 private int target;
 
 public Odi(int currentScore, float currentOver, int target) {
  super();
  this.currentScore = currentScore;
  this.currentOver = currentOver;
  this.target = target;
 }
 
 public Odi() 
 {
  super();
 }
   public int getCurrentScore() {      
  return currentScore;
 }
 public void setCurrentScore(int currentScore) {
  this.currentScore = currentScore;
 }
 
 public float getCurrentOver() {
  return currentOver;
 }
 public void setCurrentOver(float currentOver) {
  this.currentOver = currentOver;
 }
   public int getTarget() {
  return target;
 }
 public void setTarget(int target) {
  this.target = target;
 }

 @Override
  public float calculateRunRate() {      
   float rr=(target-currentScore)/(50-currentOver);
   return (float) (Math.round(rr));
  }
  @Override
  public int calculateBalls() {   
   int oversCom=(int)currentOver;  

   int ballsComp=(int) ((currentOver*10)-(oversCom*10));
   int balls=(((50-oversCom)*6)-ballsComp);
   return balls;
  }
 
  public void display()  {
   if(calculateBalls()>1)
    {
    if((target-currentScore)>1)
    {
      System.out.println("Need "+(target-currentScore)+" Runs in "+calculateBalls()+" balls");
      System.out.print("Require Run Rate - ");
      System.out.printf("%.2f",calculateRunRate());
    }
    else
    {
      System.out.println("Need "+(target-currentScore)+" Run in "+calculateBalls()+" balls");
      System.out.print("Require Run Rate - ");
      System.out.printf("%.2f",calculateRunRate());
      }
    }
    else
    {
     if((target-currentScore)>1)
     {
       System.out.println("Need "+(target-currentScore)+" Runs in "+calculateBalls()+" ball");
       System.out.print("Require Run Rate - ");
       System.out.printf("%.2f",calculateRunRate());
     }
     else
     {
       System.out.println("Need "+(target-currentScore)+" Run in "+calculateBalls()+" ball");
          System.out.println("Require Run Rate - 6.00");
       }
    }
  }
}