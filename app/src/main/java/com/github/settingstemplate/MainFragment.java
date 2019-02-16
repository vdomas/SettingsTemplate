package com.github.settingstemplate;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static com.github.settingstemplate.Constants.TAG;

public class MainFragment extends Fragment {

    private ImageView imgSettings;
    private Context fragmentContext;


    public MainFragment() {
    }


    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragmentContext = context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: " + MainFragment.class.getSimpleName());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: " + MainFragment.class.getSimpleName());
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated: " + MainFragment.class.getSimpleName());
        imgSettings = (ImageView)view.findViewById(R.id.img_settings);
        imgSettings.setOnClickListener(settingsImageView -> Navigation.findNavController(settingsImageView).navigate(R.id.action_mainFragment_to_settingsFragment));
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + MainFragment.class.getSimpleName());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: " + MainFragment.class.getSimpleName());
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: " + MainFragment.class.getSimpleName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + MainFragment.class.getSimpleName());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach: ");
    }
}
