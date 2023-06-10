package hust.soict.ict.lab01;

import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Vu Duc Minh 5226 - Please enter your name");
        JOptionPane.showMessageDialog(null, "Toi la Vu Duc Minh 5226. Hi " + result + "!");
        System.exit(0);
    }
}
