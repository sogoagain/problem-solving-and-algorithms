import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PhoneBookTest {
    private PhoneBook phoneBook;
    public PhoneBookTest() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void test_1stCase() throws Exception {
        String[] phones = {"119", "97674223", "1195524421"};
        assertThat(phoneBook.findPrefix(phones)).isEqualTo(false);
    }

    @Test
    public void test_2ndCase() throws Exception {
        String[] phones = {"123", "456", "789"};
        assertThat(phoneBook.findPrefix(phones)).isEqualTo(true);
    }

    @Test
    public void test_3rdCase() throws Exception {
        String[] phones = {"12", "123", "1235", "567", "88"};
        assertThat(phoneBook.findPrefix(phones)).isEqualTo(false);

    }

    @Test
    public void test_4thCase() throws Exception {
        String[] phones = {"02", "023", "1235", "567", "88"};
        assertThat(phoneBook.findPrefix(phones)).isEqualTo(false);

    }


    @Test
    public void test_5thCase() throws Exception {
        String[] phones = {"113", "12340", "123440", "12345", "98346"};
        assertThat(phoneBook.findPrefix(phones)).isEqualTo(true);

    }
}