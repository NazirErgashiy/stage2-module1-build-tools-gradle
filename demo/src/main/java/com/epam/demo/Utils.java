package com.epam.demo;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < args.size(); i++) {
            integerList.add(Integer.parseInt(args.get(i)));
        }
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) <= 0) {
                return false;
            }
        }
        return true;
    }
}