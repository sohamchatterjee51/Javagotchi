/**
 * Created by k1763617 on 30/10/17.
 */
public class Creature {
          int energy, fullness,happiness;
          String name;

    public Creature(String name){
        energy=15;
        happiness=15;
        fullness=15;

        this.name= name;

    }
    public String checkStatus(){
  public void eat()
    {
        if (fullness >= 12)
       {
     print("Woops," + this.getName() + "is already full.");
   } else {  fullness += 8;
             happiness-= 6;
             energy -= 4;  if(fullness>15){fullness=15;} }
    public void play(){
         happiness += 8;  energy -= 6;
         fullness -=4; print("This was so much fun! Let's do it again!");}
    public String getName(){

        return name;}
           public void play(){

            if (fullness >= 12)
                 print("Woops," + this.getName() + "is already full.");
            } else {  energy += 8;
                happiness-= 5;
                energy -= 5;}  print("This was so much fun"); } }
    public void print(String s){
    System.out.println(s);
       }
    }