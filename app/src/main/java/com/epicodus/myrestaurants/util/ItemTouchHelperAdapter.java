package com.epicodus.myrestaurants.util;

/**
 * Created by Guest on 9/25/17.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}