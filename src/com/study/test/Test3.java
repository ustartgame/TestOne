package com.study.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        List<Map> ls = new ArrayList<Map>();
        for (Map m : ls) {
            System.out.println(m.get("name"));
        }
    }
}
