public class DonkeyKongGame {
    public static void main(String[] args) {

        //ARTEFACTS

        // create sample artefact that helps Mario (ex. umbrellas, purse, hammer, hat)
        Artefact umbrella = new Artefact(3,5,"umbrella",0); // princess umbrella
        System.out.println("--Umbrella-- \n"+umbrella);

        // create sample artefacts that hurts Mario (ex. barrel, fire barrel, cement tins)
        Artefact barrel = new Artefact(6,7,"barrel",2);
        System.out.println("\n--Barrel-- \n"+barrel);
        barrel.setPositionY(5);
        System.out.println("\n--Barrel after moving left 2 places-- \n"+barrel);

        Artefact fireBall = new Artefact(6,2,"ball",6);
        System.out.println("\n--Fire Ball-- \n"+fireBall);
        System.out.println("\nFire Ball boosted points = " + fireBall.getPoints(true));
        fireBall.destroyed();
        //since destruction sets shape to null it would not appear
        System.out.println("\n--Fire Ball after destruction-- \n"+fireBall);


        //STRUCTURES

        //create sample structure for mario to climb up
        Structures stair = new Structures(3,3,"rectangular", 2, true);
        System.out.println("\n--Stairs-- \n"+stair);


        //PLAYERS
        //create a new player
        MarioPlayers mario1 = new MarioPlayers("mario1");
        System.out.println("\n--Player 1-- \n"+mario1);

        //saved player
        MarioPlayers mario2 = new MarioPlayers("mario2", 8, 1450, 3);
        System.out.println("\n--Player 2-- \n"+mario2);


        //OTHER TESTS

        //Checking that abstract method cannot be instantiated and causes error
        //Objects error = new Objects(5,5,"x");
        //System.out.println("\n--Error-- \n"+error);
    }
}
