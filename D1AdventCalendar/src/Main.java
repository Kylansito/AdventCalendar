import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("../AdventCalendar/D1Input.txt");

        BufferedReader bur = new BufferedReader(new FileReader("../AdventCalendar/D1Input.txt"));
        String elf = bur.readLine();
        int sumtot = 0;
        int sumret = 0;
        boolean acabar = false;
        while(Integer.parseInt(elf) > 0) {
            sumtot = 0;
            while (!elf.equals("")) {
                int num = Integer.parseInt(elf);
                sumtot += num;
                elf = bur.readLine();
                if(!elf.equals("")){
                    if(Integer.parseInt(elf) < 0){
                        acabar = true;
                    }
                }
            }
            if (sumtot > sumret) {
                sumret = sumtot;
            }
            if(!acabar) {
                elf = bur.readLine();
            }
        }
        System.out.print(sumtot);
    }
}