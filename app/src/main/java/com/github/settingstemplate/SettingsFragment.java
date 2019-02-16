package com.github.settingstemplate;

import android.os.Bundle;
import android.util.Log;

import androidx.preference.PreferenceFragmentCompat;

import static com.github.settingstemplate.Constants.TAG;

public class SettingsFragment extends PreferenceFragmentCompat {


    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
        Log.d(TAG, "onCreatePreferences: " + SettingsFragment.class.getSimpleName());
    }
}
