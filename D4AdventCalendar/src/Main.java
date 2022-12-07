import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bur = new BufferedReader(new FileReader("./D4Input.txt"));

        String in = bur.readLine();
        long sumret = 0;

        while (in != null) {
            int min1 = 0;
            int max1 = 0;

            int min2 = 0;
            int max2 = 0;
            String num1 = "";
            for (int i = 0; i < whereIsComma(in); i++) {

                if (in.charAt(i) != '-') {
                    num1 += in.charAt(i);
                } else if (in.charAt(i) == '-') {
                    min1 = Integer.parseInt(num1);
                    max1 = Integer.parseInt(in.substring(i+1, whereIsComma(in)));
                }

            }
            num1 = "";
            for (int i = whereIsComma(in) +1; i < in.length(); i++) {
                if (in.charAt(i) != '-') {
                    num1 += in.charAt(i);
                } else if (in.charAt(i) == '-') {
                    min2 = Integer.parseInt(num1);
                    max2 = Integer.parseInt(in.substring(i+1));
                }

            }

            if(min1 <= min2 && max1 >= max2 || min2 <= min1 && max2 >= max1){
                sumret++;
            }

            in = bur.readLine();
        }
        System.out.print(sumret);

    }

    private static int whereIsComma(String s){
        for(int i = 0; i< s.length();i++){
            if(s.charAt(i) == ','){
                return i;
            }
        }
        return 0;
    }
}
