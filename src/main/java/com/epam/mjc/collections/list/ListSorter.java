package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int result = Double.compare(functionValue(x), functionValue(y));
        if (result == 0) {
            return Integer.compare(x, y);
        }
        return result;
    }
    private double functionValue(int x) {
        return 5 * Math.pow(x, 2) + 3;
    }
}
