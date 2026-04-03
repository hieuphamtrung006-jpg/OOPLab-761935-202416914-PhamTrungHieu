//Example 5
import javax.swing.JOptionPane;
public class bai5 {
    public static void main(String[] args) {
        
        try {
            String strNum1 = JOptionPane.showInputDialog(null, 
                "Please input the first number:", "Input", JOptionPane.QUESTION_MESSAGE);
            
            String strNum2 = JOptionPane.showInputDialog(null, 
                "Please input the second number:", "Input", JOptionPane.QUESTION_MESSAGE);
            double num1 = Double.parseDouble(strNum1);
            double num2 = Double.parseDouble(strNum2);
            double sum = num1 + num2;
            double diff = num1 - num2;
            double product = num1 * num2;
            String result = "Results for " + num1 + " and " + num2 + ":\n"
                          + "Sum: " + sum + "\n"
                          + "Difference: " + diff + "\n"
                          + "Product: " + product + "\n";
            if (num2 == 0) {
                result += "Quotient: Cannot divide by zero!";
            } else {
                double quotient = num1 / num2;
                result += "Quotient: " + quotient;
            }
            JOptionPane.showMessageDialog(null, result, "Calculation Results", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Lỗi: Dữ liệu nhập vào không phải là số hợp lệ!", 
                "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            System.exit(0);
        }

        System.exit(0); 
    }
}

