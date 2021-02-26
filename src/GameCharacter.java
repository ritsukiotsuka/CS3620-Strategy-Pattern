public abstract class GameCharacter {

    GuitarType guitarType;
    UniqueSoloAct uniqueSoloAct;

    /**
     * Constructor
     */
    public GameCharacter()
    {
        // do nothing
    }

    /**
     *
     */
    public void playGuitar() {

        guitarType.play();

    }

    /**
     *
     */
    public void playSolo() {

        uniqueSoloAct.play();

    }

    /**
     * Character introduces theirselves
     */
    abstract void display();
}
