public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private String id; // Bổ sung ID theo yêu cầu quản lý [cite: 73]

    // Hàm khởi tạo đầy đủ thuộc tính [cite: 336]
    public DigitalVideoDisc(String id, String title, String category, String director, int length, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Các hàm khởi tạo nạp chồng khác [cite: 333 - 335]
    public DigitalVideoDisc(String title) { this.title = title; }
    
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getters [cite: 205, 306 - 320]
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }
    public String getId() { return id; }

    // Phương thức phát thử [cite: 38 - 39]
    public void play() {
        if (this.length > 0) {
            System.out.println("Đang phát DVD: " + this.getTitle());
            System.out.println("Độ dài DVD: " + this.getLength());
        } else {
            System.out.println("Lỗi: DVD này không thể phát được!");
        }
    }
}