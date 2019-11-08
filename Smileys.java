
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
        printWithSmileys("Mikael");
        printWithSmileys("Arto");

        printWithSmileys("Matti");


    }

    private static void printWithSmileys(String characterString) {

        String smiley = ":)";
        int length;
        String space = " ";

        if (characterString.length() % 2 == 1) {
            
             characterString = " " + characterString + " "; 
            printSmileyRow(characterString);
            System.out.println("");
            System.out.println(smiley + characterString + space + smiley);
            printSmileyRow(characterString);
            System.out.print("\n");

        } else {
             characterString = " " + characterString + " "; 
            printSmileyRow(characterString);
            System.out.println("");
            System.out.println(smiley + characterString + smiley);
            printSmileyRow(characterString);
            System.out.print("\n");
        }
    }

    private static void printSmileyRow(String word) {
        int length;
        if (word.length() % 2 == 1) {
            length = (word.length() / 2) + 3;

        } else {
            length = (word.length() / 2) + 2;
        }
        String smiley = ":)";
        for (int i = 0; i < length; i++) {
            System.out.print(smiley);
        }
    }

}
