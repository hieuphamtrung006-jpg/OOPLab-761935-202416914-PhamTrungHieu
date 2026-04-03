public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; [cite: 450]
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; [cite: 451, 452]
    private int qtyOrdered = 0; [cite: 456]

    // Thêm DVD vào giỏ [cite: 457, 462]
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Đĩa đã được thêm vào giỏ hàng.");
        } else {
            System.out.println("Giỏ hàng đã đầy!");
        }
    }

    // Xóa DVD khỏi giỏ [cite: 459]
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("Đã xóa DVD khỏi giỏ hàng.");
                return;
            }
        }
        System.out.println("Không tìm thấy DVD trong giỏ.");
    }

    // Tính tổng chi phí [cite: 460, 461]
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Lọc và Sắp xếp (Hành vi bổ sung từ yêu cầu)
    public void searchById(String id) { /* Logic lọc theo ID [cite: 57] */ }
    public void sortByTitle() { /* Logic sắp xếp theo tiêu đề [cite: 51, 52] */ }
    public void sortByCost() { /* Logic sắp xếp theo giá [cite: 53, 54] */ }
}
