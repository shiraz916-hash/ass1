//Shiraz Turgeman 208250662 and Tehila Dahan 212633507
package ass1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilesTask {

    public static void main(String[] args) {

        try {

            Scanner cs = new Scanner(new File("CS.txt"));
            Scanner hedva = new Scanner(new File("hedva.txt"));

            PrintWriter report = new PrintWriter("report.txt");

            String[][] scores = new String[100][3];
            int index = 0;

            while (hedva.hasNext()) {
                scores[index][0] = hedva.next();
                scores[index][1] = hedva.next();
                scores[index][2] = hedva.next();
                index++;
            }

            while (cs.hasNext()) {
                String first = cs.next();
                String last = cs.next();
                String id = cs.next();

                String g1 = "-";
                String g2 = "-";

                for (int i = 0; i < index; i++) {
                    if (scores[i][0].equals(id)) {
                        g1 = scores[i][1];
                        g2 = scores[i][2];
                        break;
                    }
                }

                report.println(id + " " + first + " " + last + " " + g1 + " " + g2);
            }

            cs.close();
            hedva.close();
            report.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
