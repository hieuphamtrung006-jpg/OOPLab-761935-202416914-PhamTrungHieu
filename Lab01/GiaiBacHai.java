import javax.swing.JOptionPane;

public class GiaiBacHai {
    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Nhap he so a:"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Nhap he so b:"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Nhap he so c:"));

            if (a == 0) {
  
                if (b == 0) {
                    String msg = (c == 0) ? "Vo so nghiem." : "Vo nghiem.";
                    JOptionPane.showMessageDialog(null, msg);
                } else {
                    JOptionPane.showMessageDialog(null, "Nghiem x = " + (-c / b));
                }
            } else {
                double delta = b * b - 4 * a * c;
                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    JOptionPane.showMessageDialog(null, "2 nghiem phan biet:\nx1 = " + x1 + "\nx2 = " + x2);
                } else if (delta == 0) {
                    JOptionPane.showMessageDialog(null, "Nghiem kep: x = " + (-b / (2 * a)));
                } else {
                    JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem thuc.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Loi nhap du lieu!");
        }
        System.exit(0);
    }
}