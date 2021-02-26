public class GameCharacterPage extends GameCharacter {

    /**
     * Constructor
     */
    public GameCharacterPage() {

        guitarType = new PlayFenderStratocaster();
        uniqueSoloAct = new SetGuitarOnFire();

    }

    @Override
    void display() {

        System.out.println("I'm Jimi Page!");

    }
}
