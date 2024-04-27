package com.gcavalcante.search;

import java.util.List;

import javax.annotation.Nonnull;

public interface Search<T extends Comparable<T>> {

    /**
     * Search to a given element on a sorted list.
     * 
     * @param sortedList Nonnull sorted list.
     * @param target Nonnull target.
     * @return -1 if the target does not exists on the list, or the position of target on the list.
     */
    int search(@Nonnull List<T> sortedList, @Nonnull T target);
    
}
