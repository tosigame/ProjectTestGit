
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
        tirerCombinaison(laCombinaison);
        int tries=0;

        do{
            resetResponseAndFlags(reponse,flags);
            demanderCoup(combinaison);
            compare(combinaison,laCombinaison,reponse,flags);
            afficheCombinaison(combinaison);
            afficheReponse(reponse);
            tries++;
        }while(!compare(combinaison,laCombinaison,reponse,flags) && tries<=10);
        if(tries<10){
        System.out.println("tas gagner");
        }else{
            System.out.println("tas predu en "+ tries +" coups");
        }
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
        System.out.println("veuiller saisir "+combinaison.length+" valeurs de 1 - "+m);
        for (int i = 0; i < combinaison.length; i++) {
            combinaison[i]= scanner.nextInt();
        }
    }
    static boolean compare(int[] combinaisonSaisie, int[] combinaisonCreer, int[] reponse,boolean[] flags){

       boolean result=true;
        for (int i = 0; i < n; i++) {
            if (combinaisonSaisie[i]==combinaisonCreer[i]){
                reponse[i]=1;
                flags[i]=true;
            }else{
                reponse[i]=3;
                flags[i]=false;
                result=false;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!flags[i] && !flags[j] && combinaisonSaisie[i]==combinaisonCreer[j]){
                    flags[i]=true;
                    reponse[i]=2;
                }
            }
        }

        return result;
    }
    static void afficheCombinaison(int[] combinaisonSaisie){
        for (int i = 0; i < n; i++) {
            System.out.print(combinaisonSaisie[i]+ " ");
        }
        System.out.println();
    }
    static void afficheReponse(int[] reponse){
        for (int i = 0; i < n; i++) {
            if(reponse[i]==1){
                System.out.print("#");
            }
        }
        for (int i = 0; i < n; i++) {
            if(reponse[i]==2){
                System.out.print("0");
            }
        }
        System.out.println();
    }
    static void resetResponseAndFlags(int[] response,boolean[] flags){
        response=new int[n];
        flags=new boolean[n];
    }

}



















