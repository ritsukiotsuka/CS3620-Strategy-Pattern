public class GameCharacterEdge extends GameCharacter {

    /**
     * Constructor
     */
    public GameCharacterEdge() {

        guitarType = new PlayGibsonSG();
        uniqueSoloAct = new SmashGuitar();

    }

    @Override
    void display() {

        System.out.println("I'm The Edge!");

    }
}
