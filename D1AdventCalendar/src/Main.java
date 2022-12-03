import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("../AdventCalendar/D1Input.txt");

        BufferedReader bur = new BufferedReader(new FileReader("./D1Input.txt"));
        /*
        ********
        PART ONE
        ********

            String elf = bur.readLine();
            long sumtot = 0;
            long sumret = 0;
            boolean acabar = false;

            while(Integer.parseInt(elf) > 0) {
                sumtot = 0;
                while (!elf.equals("")) {
                    sumtot += Integer.parseInt(elf);
                    elf = bur.readLine();
                }
                if (sumtot > sumret) {
                    sumret = sumtot;
                }

                elf = bur.readLine();

            }
            System.out.print(sumret);




        ********
        PART TWO
        ********

        String elf = bur.readLine();
        int sumtot = 0;
        int[] taulaRet = new int[3];
        taulaRet[0] = 0;taulaRet[1] = 0;taulaRet[2] = 0;

        while(Integer.parseInt(elf) > 0) {
            sumtot = 0;
            while (!elf.equals("")) {
                sumtot += Integer.parseInt(elf);
                elf = bur.readLine();
            }
            taulaRet = taula(taulaRet, sumtot);

            elf = bur.readLine();

        }
        System.out.print(taulaRet[0]+taulaRet[1]+taulaRet[2]);
        */

    }

    private static int[] taula(int t[], int a){
        if(a > t[0]) {
            t[0] = a;
        } else if(a > t[1]){
                t[1] = a;
            }
        else if(a > t[2]){
                t[2] = a;
            }
        return t;
    }


}