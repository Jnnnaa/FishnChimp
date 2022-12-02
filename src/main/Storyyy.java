package main;

//import player.WeaponType;

import player.Player;

import java.util.Scanner;

public class Storyyy {

    /**
     * the method separates the string in substrings(length<=15).
     * Separates if char matches whitespace. Reduce the String by given length.
     * Saves old String reduced by substring as long as the String is not null.
     *
     * @param comeOnPutSomeStringInHere variable of the String.
     */
    public static void separateString(String comeOnPutSomeStringInHere) {
        StringBuilder originalString = new StringBuilder(comeOnPutSomeStringInHere);
        while (!comeOnPutSomeStringInHere.equals("")) {
            for (int i = 50; i >= 0; i--) {
                if (comeOnPutSomeStringInHere.charAt(i) == ' ') {
                    String sub_str_1 = comeOnPutSomeStringInHere.substring(0, i);
                    System.out.println(sub_str_1);
                    comeOnPutSomeStringInHere = originalString.replace(0, i + 1, "").toString();
                    i=50;
                }
            }
        }
    }

    /**
     * origin story. And player gets help request. Chooses if he wants
     * to play the game.
     */
    public void textAtTheBeginning() {
        System.out.println("Do you want to skip origin story? Enter Yes or No.");
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        if (answer.matches("No")) {
            String storyOfOrigin = "Dear adventurer, back in the glory days when your tribe lived in peace, King Ape created a magical banana." +
                    "King Ape saw his nearing death coming. In advance he summons the lords and potential kings to choose an heir to the throne." +
                    "When all arrived the king presented the magical banana, which choose the destined heir. " +
                    "When the time came and King Ape died, all chimpanzees gathered for the great suffering in the church. " +
                    "In our darkest hour the new king, your dearest friend, was murdered by the devious fish and the magical banana stolen.";
            separateString(storyOfOrigin);
        }

        String helpRequest = "Oh no, the evil fish murdered our new king and stolen the magical banana. Please, " + "name1 " + " save our tribe and return the banana.";
        separateString(helpRequest);

        System.out.println("Do You accept this terrific adventure? Enter Yes or No.");
        String answerAccept = sc.next();
        if(answerAccept.matches("Yes")) {
            System.out.println("Go to Herbert, the armourer.");
        }
    }

    /**
     * First action is to choose a weapon. Choices based on numberOfCoins: Sword, Gun, Slingshot
     * If it works, actualises the parameter of the player object
     */
    /*public void firstQuestChooseWeapon(Player player) {
        System.out.println("Choose weapon.");
        String weaponShop;
        if(getNumberOfCoins() <= 13 ) {
            weaponShop = "Gun=13coins Slingshot=0coins";
        }
        else if(getNumberOfCoins()>=20) {
            weaponShop = "Sword=20coins Gun=13coins Slingshot=0coins";
        } else{weaponShop = "Slingshot=0coins ";}

        String[] buyWeapons = weaponShop.split(" ");
        for(String buyWeapon: buyWeapons) {
            System.out.println(buyWeapon);
        }
        Scanner sc = new Scanner(System.in);
        String yourWeapon = sc.next();
        if(yourWeapon.matches("Sword")) {
            weapon = setWeapon(WeaponType.SWORD);
        }
        else if(yourWeapon.matches("Gun")) {
            weapon = setWeapon(WeaponType.GUN);
        } else { weapon = setWeapon(WeaponType.SLINGSHOT); }


    }

     */
}
    //Anfangstext, der nachdem der Spieler erstellt ist erscheint
    // Auswahl ob die Geschichte begonnen werden soll
    //Möglichkeiten zu Station 1 zu gehen (oder Waffen zu kaufen)

    // 1.Station: "" MONSTER
        //
    //Gewonnen: zu Station 2 oder speichern und schließen
    //2.Station: ""MONSTER
        //



