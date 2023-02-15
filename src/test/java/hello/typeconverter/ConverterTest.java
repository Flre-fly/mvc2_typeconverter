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
    @Test
    public void IpPortToString(){
        IpPortToStringConverter converter = new IpPortToStringConverter();
        String result = converter.convert(new IpPort("127.0.0.1", 8888));
        Assertions.assertThat(result).isEqualTo("127.0.0.1:8888");
    }
    @Test
    public void StringToIpPort(){
        StringToIpPortConverter converter = new StringToIpPortConverter();
        IpPort result = converter.convert("127.0.0.1:8888");
        IpPort temp = new IpPort("127.0.0.1", 8888);
        Assertions.assertThat(result).isEqualTo(temp);
    }
}
