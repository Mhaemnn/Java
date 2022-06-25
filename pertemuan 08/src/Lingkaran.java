import lingkaran.LingkaranPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lingkaran {
    private JTextField tfjarijari;
    private JTextField tfLuas;
    private JButton HITUNGButton;
    private JButton BATALButton;
    private JButton KELUARButton;

    public Lingkaran() {
        HITUNGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //membuat variable
                double jariJari, luas;
                double pi = 3.14;

                //mengambil inputan dari text field
                jariJari = Double.parseDouble(tfjarijari.getText());

                //titung luas
                luas = pi * (jariJari * jariJari);

                //menaruh luas
                tfLuas.setText(String.valueOf(luas));
            }
        });
    }

}
