package hello.typeconverter;

import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

import static org.assertj.core.api.Assertions.assertThat;

public class FormattingConversionServiceTest {
    @Test
    void conversionService() {
        //등록
        DefaultFormattingConversionService conversionService = new
                DefaultFormattingConversionService();
        //converter도 등록가능하고
        conversionService.addConverter(new StringToIntegerConverter());
        //formatter도 등록가능하다
        conversionService.addFormatter(new MyNumberFormatter());
        //사용
        assertThat(conversionService.convert("10",
                Integer.class)).isEqualTo(10);
        assertThat(conversionService.convert("1,000", Number.class)).isEqualTo(1000L);
    }
}
