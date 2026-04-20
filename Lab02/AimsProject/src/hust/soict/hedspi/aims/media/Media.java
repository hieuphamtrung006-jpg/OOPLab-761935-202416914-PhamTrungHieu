package hust.soict.hedspi.aims.media;
import java.util.Comparator;
public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media() {
        // Constructor mặc định
    }

    // --- GETTERS & SETTERS ---
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public float getCost() { return cost; }
    public void setCost(float cost) { this.cost = cost; }

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null || !(obj instanceof Media)) return false;
        
        Media other = (Media) obj;
        return this.getTitle() != null && this.getTitle().equals(other.getTitle());
    }

    @Override
    public String toString() {
        return "Media - [" + this.getTitle() + "] - [" + this.getCategory() + "]: " + this.getCost() + " $";
    }
}
