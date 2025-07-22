package javamaster.annotation.general.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "rawtypes", "unused"})
public class SuppressWarningsExample {
    public void something() {
        List lit = new ArrayList();
        list.add("data");
        System.out.println(list.get(0));
    }
}
