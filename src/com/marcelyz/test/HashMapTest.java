package com.marcelyz.test;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("aaa", "AAA");
        map.put("bbb", "BBB");
        map.put("ccc", "CCC");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "===>" + map.get(key));
        }
    }

}