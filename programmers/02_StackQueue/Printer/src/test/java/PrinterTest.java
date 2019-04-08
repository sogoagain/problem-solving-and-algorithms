import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PrinterTest {

    private Printer printer;

    public PrinterTest() {
        printer = new Printer();
    }

    @Test
    public void test_Printer1stCase() throws Exception {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        assertThat(printer.getPrintOrderOfDocument(priorities, location)).isEqualTo(1);
    }

    @Test
    public void test_Printer2ndCase() throws Exception {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        assertThat(printer.getPrintOrderOfDocument(priorities, location)).isEqualTo(5);
    }
}