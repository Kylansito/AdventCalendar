import java.io.*;
import java.util.ArrayList;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bur = new BufferedReader(new FileReader("./InputDay3.txt"));

        /*

        PART 1

        String in = bur.readLine();
        long sumret = 0;

        while(!in.equals("hola")) {
            String subs1 = in.substring(0, in.length()/2);
            String subs2 = in.substring(in.length()/2);

            char matching = matchingChar(subs1, subs2);

            sumret += valueOfChar(matching);

            in = bur.readLine();
        }
        System.out.print(sumret);



        PART 2

        String in = bur.readLine();
        long sumret = 0;

        while(in != null) {
            int cont = 0;
            char[] charT1 = null;
            char[] charT2 = null;
            char[] charT3 = null;
            while (cont < 3) {
                switch (cont) {
                    case 0:
                        charT1 = in.toCharArray();
                        break;
                    case 1:
                        charT2 = in.toCharArray();
                        break;
                    case 2:
                        charT3 = in.toCharArray();
                        break;
                }
                in = bur.readLine();
                cont++;
            }

            char matching = matchingCharArrayList(matchingChars(charT1, charT2), charT3);

            sumret += valueOfChar(matching);

        }
        System.out.print(sumret);

         */


    }

    private static ArrayList matchingChars(char[] c1, char[] c2){
        ArrayList ret = new ArrayList<>();

        for(int i = 0; i < c1.length; i++){
            for (int j = 0; j < c2.length; j++) {
                if (c1[i] == c2[j]) {
                    ret.add(c2[j]);
                }
            }
        }
        return ret;

    }

    private static char matchingCharArrayList(ArrayList arr, char[] table){
        for(int i = 0; i < table.length; i++){

            if(arr.contains(table[i])){
                return table[i];
            }
        }
        return 'a';
    }

    private static char matchingChar(String str1, String str2){
        for(int i = 0; i < str1.length(); i++){

            char[] charA = str1.toCharArray();

            for (char c : charA) {
                if (c == str2.charAt(i)) {
                    return str2.charAt(i);
                }
            }
        }
        return 'a';
    }

    private static int valueOfChar(char c){
        if(c>='a'&&c<='z'){
            return c-96;
        }
        return c-38;
    }


}
