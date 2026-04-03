public class Sach {
    private String masach;
    private String tensach;
    private String tacgia;
    private int soluong;
    public Sach(String masach,String tensach,String tacgia,int soluong){
        this.masach=masach;
        this.tensach=tensach;
        this.soluong=soluong;
        this.tacgia=tacgia;
    }
    public String getTenSach(){
        return this.tensach;
    }
    public int SoLuong(){
        return this.soluong;
    }
    public void SoLuongSach(int soluong){
        this.soluong=soluong;
    }
    public String toString(){
        return "Ma: " + masach + "| Ten: " + tensach + "| Tac gia: " + tacgia + "| So Luong: " +soluong;
    }
}
