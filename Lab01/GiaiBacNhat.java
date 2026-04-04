//Example 6.1
import javax.swing.JOptionPane;
public class GiaiBacNhat {
    public static void main(String[] args) {
        try {
            String aStr = JOptionPane.showInputDialog(null, "Nhap he so a:", "ax + b = 0", JOptionPane.QUESTION_MESSAGE);
            String bStr = JOptionPane.showInputDialog(null, "Nhap he so b:", "ax + b = 0", JOptionPane.QUESTION_MESSAGE);

            double a = Double.parseDouble(aStr);
            double b = Double.parseDouble(bStr);

            if (a == 0) {
                if (b == 0) {
                    JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem.");
                } else {
                    JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem.");
                }
            } else {
                double x = -b / a;
                JOptionPane.showMessageDialog(null, "Nghiem duy nhat x = " + x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Loi du lieu nhap vao!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}