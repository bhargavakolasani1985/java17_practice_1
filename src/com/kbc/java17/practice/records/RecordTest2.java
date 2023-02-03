import java.time.LocalDate;

public record RecordTest2(int size, String brand, LocalDate expires) {
    public static int MAX_STORAGE = 100;
    public RecordTest2(int size, String brand, LocalDate expires) {
        this.size = size;
        this.brand = brand;
    }
}