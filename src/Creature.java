/**
 * Created by k1764166 on 30/10/17.
 */
public class Creature {

    int energy, fullness, happiness;
    String name;

    public Creature(String name)
    {
        energy = 15;
        happiness = 15;
        fullness = 15;

        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void eat()
    {
        if (fullness >= 12) {
            System.out.println("Whoops, "+ this.name +" is already full");
        }else {
            fullness += 8;
            happiness -=6;
            energy -=4;
            if (fullness >15){fullness =15;}
            System.out.println("Yummy " + this.name + "really enjoyed that meal");
        }
    }

    public void play()
    {
        if (happiness >= 12) {
            System.out.println("Whoops, "+ this.name +" is not tired");
        }else {
            happiness += 8;
            fullness -=5;
            energy -=5;
            if (happiness >15){happiness =15;}
            System.out.println("That was great fun!");

        }
    }

    public void sleep()
    {
        energy += 8;
        happiness -=6;
        fullness -=4;
        if (energy >15){energy =15;}
        System.out.println("That was a good sleep!");

    }
    public String checkStatus()
    {
        String status = "";
        if(happiness <=0 || energy <0 || fullness <=0)
        {
            System.out.println("Uh Oh" + this.getName() + "Has died! You are a bad owner.");
            System.exit(0);
        }
        if(happiness <=6){
            status += "Oh"+ this.getName() + "is very sad \n";
        }
        if(energy <= 6)
        {
            status += "ZZZ"+ this.getName() + "is very tired! \n";

        }
        if(fullness<=6)
        {
            status += "Rumble"+ this.getName() + "is very hungry \n ";
        }



        return status;
    }
}
