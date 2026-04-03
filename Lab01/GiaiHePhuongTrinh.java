//Example 6.2
import javax.swing.JOptionPane;
public class GiaiHePhuongTrinh {
    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Nhap a11:"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Nhap a12:"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Nhap b1:"));

            double d = Double.parseDouble(JOptionPane.showInputDialog("Nhap a21:"));
            double e = Double.parseDouble(JOptionPane.showInputDialog("Nhap a22:"));
            double f = Double.parseDouble(JOptionPane.showInputDialog("Nhap b2:"));

            double D = a * e - d * b;
            double D1 = c * e - f * b;
            double D2 = a * f - d * c;

            if (D != 0) {
                double x1 = D1 / D;
                double x2 = D2 / D;
                JOptionPane.showMessageDialog(null, "Nghiem: x1 = " + x1 + ", x2 = " + x2);
            } else {
                if (D1 == 0 && D2 == 0) {
                    JOptionPane.showMessageDialog(null, "He co vo so nghiem.");
                } else {
                    JOptionPane.showMessageDialog(null, "He vo nghiem.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Loi du lieu!");
        }
        System.exit(0);
    }
}