package com.florianegerer.dagger;

/**
 * Callbacks interface that all activities using this fragment must implement.
 */
public interface NavCallback {
    /**
     * Called when an item in the navigation drawer is selected.
     */
    void onNavigationDrawerItemSelected(int position);
}