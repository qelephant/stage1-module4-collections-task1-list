package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                result.addLast(num); // Even number, add to the end
            } else {
                result.addFirst(num); // Odd number, add to the beginning
            }
        }
        
        return result;
    }
}
