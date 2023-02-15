package hello.typeconverter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class ConverterTest {
    @Test
    public void IntegerToString(){
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(1);
        Assertions.assertThat(result).isEqualTo("1");
    }
    @Test
    public void StringToInteger(){
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("1");
        Assertions.assertThat(result).isEqualTo(1);
    }
}
