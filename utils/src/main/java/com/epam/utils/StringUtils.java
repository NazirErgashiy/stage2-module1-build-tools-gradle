package com.epam.utils;

import java.*;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int parser = 0;
        if (Integer.parseInt(str) > 0) {
            return true;
        }
        return false;
    }
}
