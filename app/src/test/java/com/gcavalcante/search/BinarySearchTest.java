package com.gcavalcante.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class BinarySearchTest {
    BinarySearch<Integer> binarySearch = new BinarySearch<>();
    List<Integer> sortedList = Arrays.asList(-3, -1, 0, 4, 8, 19, 30, 42);

    @Test
    void whenTargetDoesNotExists_thenReturnLowerNegativeOne() {
       var res = binarySearch.search(sortedList, 1337); 
       assertEquals(-1, res);
    }

    @Test
    void whenTargetExists_thenReturnPosition() {
        var target = 42;

        var res = binarySearch.search(sortedList, target);
        assertEquals(7, res);
        assertEquals(target, sortedList.get(res));
    }

}
