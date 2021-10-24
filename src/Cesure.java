import java.util.Scanner;

class Cesure {
    static final String alphabet="abcdefghijklmnopqrstuvwxyz";
    static final String voyelle="aeyuoi";
    static String[] elements;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String[] phrase = lirePhrase();
        for (int i = 0; i < elements.length; i++) {
            cesure(elements[i]);
        }
    }

    static String[] lirePhrase() {
        String phrase=scanner.nextLine();
        String[] tableauDesChars=new String[phrase.length()];
        elements = phrase.split(" ");
        for (int i = 0; i < tableauDesChars.length; i++) {
            tableauDesChars[i]= String.valueOf(phrase.charAt(i));
            if(i< elements.length)System.out.println(elements[i]);
        }
        return tableauDesChars;
        // A compléter:
        // retourne un tableau de chaines de caractères
        // introduits par l'utilisateur
    }

    static boolean voyelle(char c) {
        return voyelle.contains(String.valueOf(c));
        // A compléter:
        // teste si un caractère est une voyelle
    }

    static boolean queVoyelles(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(!voyelle(s.charAt(i))){
                return false;
            }
        }
        return true;
        // A compléter:
        // teste si une chaîne ne contient que des voyelles
        // utilise la méthode voyelle
    }

    static void cesure(String mot) {
        boolean auMoinsUneConsonne=false;
     //   String result=mot;
        if(queVoyelles(mot)){
            System.out.println(mot);
        }else {
            for (int i = 0; i < mot.length(); i++) {
                if(auMoinsUneConsonne ) {
                    if (voyelle(mot.charAt(i)) && i + 2 < mot.length() && !voyelle(mot.charAt(i + 1)) && alphabet.contains(String.valueOf(mot.charAt(i + 2)))) {
                        mot=mot.substring(0,i+1)+"-"+"\n"+mot.substring(i+1);
                        auMoinsUneConsonne=false;

                    }
                }else if(!voyelle((mot.charAt(i)))){
                    auMoinsUneConsonne=true;
                }
            }
            System.out.println(mot);
        }
        
        // A compléter:
        // détermine la césure d'un mot donné et effectue les affichages
        // correspondants (voir exemple de déroulement)
    }
}
