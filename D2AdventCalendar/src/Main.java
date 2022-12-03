import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bur = new BufferedReader(new FileReader("./InputDay2.txt"));

        /*

        PART 1

        String in = bur.readLine();
        long sumret = 0;

        while(in.charAt(0) != 'm') {
            char elf = in.charAt(0);
            char me = in.charAt(2);

            sumret += valorDeChar(me) + valorDePartida(elf, me);

            in = bur.readLine();
        }
        System.out.print(sumret);




        PART 2

        String in = bur.readLine();
        long sumret = 0;

        while(in.charAt(0) != 'm') {
            char elf = in.charAt(0);
            char resultat = in.charAt(2);
            char me = hedeTreure(elf, resultat);
            sumret += valorDeChar(me) + valorDePartida(elf, me);

            in = bur.readLine();
        }
        System.out.print(sumret);

         */


    }

    private static int valorDeChar(char c){
        switch (c){
            case 'A':
            case 'X': return 1;
            case 'B':
            case 'Y': return 2;
            case 'C':
            case 'Z': return 3;

            default:  return -1;
        }
    }

    private static int valorDePartida(char elf, char me){
        /*
        Rock = 1
        Paper = 2
        Scisors = 3

         */

        if(me == 'X'){
            switch (elf){
                case 'A': return 3;
                case 'B': return 0;
                case 'C': return 6;
            }
        }
        if(me == 'Y'){
            switch (elf){
                case 'A': return 6;
                case 'B': return 3;
                case 'C': return 0;
            }
        }
        if(me == 'Z'){
            switch (elf){
                case 'A': return 0;
                case 'B': return 6;
                case 'C': return 3;
            }
        }
        return -1;
    }

    private static char hedeTreure(char elf, char resultat){
        /*
        Rock = 1
        Paper = 2
        Scisors = 3

         */

        if(resultat == 'X'){
            switch (elf){
                case 'A': return 'Z';
                case 'B': return 'X';
                case 'C': return 'Y';
            }
        }
        if(resultat == 'Y'){
            switch (elf){
                case 'A': return 'X';
                case 'B': return 'Y';
                case 'C': return 'Z';
            }
        }
        if(resultat == 'Z'){
            switch (elf){
                case 'A': return 'Y';
                case 'B': return 'Z';
                case 'C': return 'X';
            }
        }
        return 's';
    }
}

