public class Bat extends Mammal {
    
    public Bat(int energyLevel) {
        super(energyLevel);
    }

    public void fly(){
        System.out.println("To the Batmobile! Nananananananana Nananananananana Batman!");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("I vnt to dreenk your blood!");
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("*POW*  *BAM*");
        this.energyLevel -= 100;
    }



}

