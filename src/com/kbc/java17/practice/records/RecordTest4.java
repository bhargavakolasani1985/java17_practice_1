import java.time.LocalDate;

public record RecordTest4(int size, String brand, LocalDate expires) {
    public static int MAX_STORAGE = 100;
    public int MIN_STORAGE = 100;
    public RecordTest4(int size, String brand, LocalDate expires) {
        this.size = size;
        this.brand = brand;
        this.expires = expires;
    }
}