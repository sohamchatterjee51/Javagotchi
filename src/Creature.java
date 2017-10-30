/**
 * Created by k1763617 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;

    public Creature(String name) {
        energy = 15;
        happiness = 15;
        fullness = 15;

        this.name = name;

    }

    public String checkStatus() {
        String status = "";

        if (happiness <= 0)||energy <= 0 || fullness <= 0 {
            print("Oh no!" + this.getName() + "Has died.You're a terrible owner");
            System.exit(0);
        }

        if (happiness <= 6) {
            status = "Oh.." + this.getName() + "is really sad!\n"
            ;
        }

        if (energy <= 6) {
            status = "Oh.." + this.getName() + " is really tired!\n ";
        }
        if (fullness <= 6) {
            status = "Oh, " + this.getName() + "is super hungry!\n ";
        }
    }


    public void eat() {
        if (fullness >= 12) {
            System.out.println("Woops," + this.getName() + "is already full.");
        } else {
            fullness += 8;
            happiness -= 6;
            energy -= 4;

            if (fullness > 15) {
                fullness = 15;
            }
            print("Yum" + this.getName + "That was tasty");
        }
    }

    public void play() {
        happiness += 8;
        energy -= 6;
        fullness -= 4;
        System.out.println("This was so much fun! Let's do it again!");
    }

    public String getName() {

        return name;
    }

    public void()

    {

        if (fullness >= 12)
            System.out.println("Woops," + this.getName() + "is already full.");
    }

    else

    {
        energy += 8;
        happiness -= 5;
        energy -= 5;
    }

    System.out.println("This was so much fun");
    }



    public void sleep(){
        if(energy>=12){
         print("Woops" + this.getName + "is that sleepy");
        }
    }

    public void print(String s){
    System.out.println(s);
       }
    }