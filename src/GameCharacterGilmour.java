public class GameCharacterGilmour extends GameCharacter {


    /**
     * Constructor
     */
    public GameCharacterGilmour() {

        guitarType = new PlayGibsonLesPaul();
        uniqueSoloAct = new JumpOffStage();

    }

    @Override
    void display() {

        System.out.println("I'm David Gilmour!");

    }
}
