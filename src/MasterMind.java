
import java.util.Scanner;

public class MasterMind {
    public static int m=6;
    public static int n=4;
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        int[] laCombinaison=new int[n];
        int[] combinaison=new int[n];
        int[] reponse=new int[n];
        boolean[] flags=new boolean[n];

        laCombinaison= new int[]{1, 2, 1, 2};
        combinaison=new int[]{1,1,2,1};
    }
    static int hasard(int max) {
        return (1 + (int)(Math.random() * max));
    }
    static int hasard(){
      return  hasard(m);
    }
    static void tirerCombinaison(int[] uneCombinaison){
        for (int i = 0; i < uneCombinaison.length; i++) {
            uneCombinaison[i]=hasard();
        }
    }
    static void demanderCoup(int[] combinaison){
        System.out.println("veuiller saisir "+combinaison.length+" valeurs de 1 -"+m);
        for (int i = 0; i < combinaison.length; i++) {
            combinaison[i]= scanner.nextInt();
        }
    }
    static boolean compare(int[] combinaison1, int[] combinaison2, int[] reponse){
        for (int i = 0; i < n; i++) {

        }
        return false;
    }
}



















