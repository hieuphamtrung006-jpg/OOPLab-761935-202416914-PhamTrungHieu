public class Main {
    public static void main(String[] args) {
        Thuvien myLib = new Thuvien();

        // Tạo vài cuốn sách
        Sach s1 = new Sach("S01", "Lap trinh Java", "Bao", 5);
        Sach s2 = new Sach("S02", "Python co ban", "Phu", 2);

        // Thêm vào thư viện
        myLib.themSach(s1);
        myLib.themSach(s2);

        myLib.hienthitoanboSach();
        myLib.ChoMuonSach("Python co ban");
        myLib.hienthitoanboSach();
        
        }
}
