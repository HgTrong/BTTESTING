import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Check {

    public void testAdd() {
        Add calculator = new Add();
        assertEquals(5, calculator.add(2, 3), "Phép cộng của 2 và 3 phải bằng 5");
    }
}