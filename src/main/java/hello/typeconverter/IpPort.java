package hello.typeconverter;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode//필드값이 모두 같으면 같은객체로 인식
public class IpPort {
    private String ip;
    private int port;
    IpPort(String ip, int port){
        this.ip=ip;
        this.port=port;
    }
}
