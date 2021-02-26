public class RockLegends {

    public static void main(String[] args) {


        //Create game character objects
        GameCharacter player1 = new GameCharacterEdge();
        GameCharacter player2 = new GameCharacterPage();
        GameCharacter player3 = new GameCharacterGilmour();

        //Player: The Edge
        System.out.println("==============================================");
        System.out.println("Player: The Edge\n");
        player1.display();
        player1.playGuitar();
        player1.playSolo();


        //Player: Jimi Page
        System.out.println("\n==============================================");
        System.out.println("Player: The Jimi Page\n");
        player2.display();
        player2.playGuitar();
        player2.playSolo();


        //Player: David Gilmour
        System.out.println("\n==============================================");
        System.out.println("Player: David Gilmour\n");
        player3.display();
        player3.playGuitar();
        player3.playSolo();

    }

}