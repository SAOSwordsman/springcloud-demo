package com.yd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class Gateway9527ApplicationTests {

    @Test
    void contextLoads() {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        List<String> list = new ArrayList<String>();
        list.add("test");
        list.add("set");
        list.set(0, "rwe");
        HashMap<String, String> map = new HashMap<>();
        map.put("abc", "include");
        map.put("efg", "contain");
        list.add(map.get(1));
        System.out.println(list);
    }

}
