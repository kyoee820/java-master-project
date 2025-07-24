package javachange.java8.interpacedefaultmethod;

import java.time.ZonedDateTime;

public class J8Class implements J8Interface {      // default 메소드로 인해, override 필요 X

    @Override
    public String getTime() {
        return ZonedDateTime.now(java.time.ZoneId.of("Asia/Seoul")).toString();
    }
}
