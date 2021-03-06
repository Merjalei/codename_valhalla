package JOptionPaneBlackJack;

import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
This luoka tallenaa nimit ja highscoret
 */

 /*
 *@author nk
 */
public class HighScore {

    private ArrayList<Integer> TopTen = new ArrayList(10);
    private ArrayList<String> TopTen_nimet = new ArrayList(10);

    ImageIcon palkinto = new ImageIcon(Naytto.class.getResource("bb.png"));

    public void checkHighScore(int hscore, String nimi) {
        for (int i = 0; i < 9; i++) {
            if (hscore >= TopTen.get(i)) {
                this.TopTen.add(i, hscore);
                this.TopTen_nimet.add(i, nimi);

                i = 9;
            }
        }
    }

    /* The following fills the arrays so out of bound errors do not occur */
    public void initialize() {
        this.TopTen.add(0, 10000);
        this.TopTen_nimet.add(0, "Julius Caesar");
        this.TopTen.add(1, 9000);
        this.TopTen_nimet.add(1, "Augustus");
        this.TopTen.add(2, 8000);
        this.TopTen_nimet.add(2, "Tiberius");
        this.TopTen.add(3, 7000);
        this.TopTen_nimet.add(3, "Caligula");
        this.TopTen.add(4, 6000);
        this.TopTen_nimet.add(4, "Cladius");
        this.TopTen.add(5, 1000);
        this.TopTen_nimet.add(5, "Nero");
        this.TopTen.add(6, 800);
        this.TopTen_nimet.add(6, "Galba");
        this.TopTen.add(7, 700);
        this.TopTen_nimet.add(7, "Otho");
        this.TopTen.add(8, 600);
        this.TopTen_nimet.add(8, "Vitellius");
        this.TopTen.add(9, 510);
        this.TopTen_nimet.add(9, "Vespasian");
    }

    public void showHighScore() {
        StringBuilder kimba = new StringBuilder();        // helps to save all string output to one "string"
        kimba.append("Top 10 Scores\n");
        for (int i = 0; i < 10; i++) {
            kimba.append("" + (i + 1) + ". \t" + TopTen_nimet.get(i) + "  \t" + TopTen.get(i) + "\n");
        }

        JOptionPane.showMessageDialog(null, kimba.toString(), "HALL  OF  FAME", JOptionPane.INFORMATION_MESSAGE, palkinto);
    }

}
