public class BatTest {
    
    public static void main(String[] args){

        Bat dracula = new Bat(300);

        dracula.displayEnergy();

        dracula.attackTown();
        dracula.attackTown();
        dracula.attackTown();
        
        dracula.displayEnergy();

        dracula.eatHumans();
        dracula.eatHumans();

        dracula.displayEnergy();

        dracula.fly();
        dracula.fly();

        dracula.displayEnergy();
        
    }

}
