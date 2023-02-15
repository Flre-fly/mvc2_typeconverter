package hello.typeconverter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.text.ParseException;
import java.util.Locale;

public class MyNumberFormatterTest {
    MyNumberFormatter formatter = new MyNumberFormatter();
    @Test
    void parse() throws ParseException {
        Number result = formatter.parse("1,000", Locale.KOREA);
        assertThat(result).isEqualTo(1000L); //Long 타입 주의
    }
    @Test
    void print() {
        String result = formatter.print(1000, Locale.KOREA);
        assertThat(result).isEqualTo("1,000");
    }
}
