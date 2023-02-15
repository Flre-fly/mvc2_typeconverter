package hello.typeconverter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class StringToIpPortConverter implements Converter<String, IpPort> {
    @Override
    public IpPort convert(String source) {
        log.info("convert String -> IpPort: {}", source);
        String input[] = source.split(":");
        String ip = input[0];
        int port = Integer.parseInt(input[1]);
        return new IpPort(ip, port);
    }
}
