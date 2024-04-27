package com.gcavalcante.search;

import java.util.List;

import javax.annotation.Nonnull;

public class BinarySearch<T extends Comparable<T>> implements Search<T> {
    @Override
    public int search(@Nonnull List<T> sortedList, @Nonnull T target) {
        var low = 0;
        var high = sortedList.size() - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            var item = sortedList.get(middle);

            if (item.equals(target)) {
                return middle;
            }

            if (item.compareTo(target) < 0) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }
}
