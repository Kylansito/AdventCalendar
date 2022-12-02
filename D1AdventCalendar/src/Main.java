import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("../AdventCalendar/D1Input.txt");

        BufferedReader bur = new BufferedReader(new FileReader("../D1AdventCalendar/D1Input.txt"));
        String elf = bur.readLine();
        long sumtot = 0;
        long sumret = 0;
        boolean acabar = false;

        while(Integer.parseInt(elf) > 0) {
            sumtot = 0;
            while (!elf.equals("")) {
                int num = Integer.parseInt(elf);
                sumtot += num;
                elf = bur.readLine();
            }
            if (sumtot > sumret) {
                sumret = sumtot;
            }

            elf = bur.readLine();

        }
        System.out.print(sumtot);
    }
}