import java.util.ArrayList;
public class Thuvien{
    private ArrayList<Sach> danhSachSach;
    public Thuvien(){
        this.danhSachSach=new ArrayList<>();
    }
    public void themSach(Sach s){
        danhSachSach.add(s);
        System.out.println("Da them sach: " +s.getTenSach());
    }
    public void hienthitoanboSach(){
        System.out.println("Danh sach sach co trong thu vien:");
        for(Sach s: danhSachSach){
            System.out.println(s);
        }
    }
    public void Timsach(String ten){
        System.out.println("Ket qua tim kiem cho: '" + ten + "':");
        for(Sach s : danhSachSach){
            if(s.getTenSach().equalsIgnoreCase(ten)){
                System.out.println(s);
            }
        }
    }
    boolean flag=false;
    public void ChoMuonSach(String ten){
        for(Sach s : danhSachSach){
            if(s.getTenSach().equalsIgnoreCase(ten)){
                flag=true;
                if(s.SoLuong() > 0){
                    s.SoLuongSach(s.SoLuong()-1);
                    System.out.println("cho mươn thanh cong. So luong con lai la: " + s.SoLuong());
                }
                else{
                System.out.println("het sach trong kho");
                }
            }
        }
        if(flag==false){
            System.out.println("khong co sach");
        }
    }
}

