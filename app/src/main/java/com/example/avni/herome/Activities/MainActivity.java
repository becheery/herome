package com.example.avni.herome.Activities;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.avni.herome.Fragments.BackstoryFragment;
import com.example.avni.herome.Fragments.MainFragment;
import com.example.avni.herome.Fragments.PickPowerFragment;
import com.example.avni.herome.R;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener, PickPowerFragment.PickPowerInteractionListener, BackstoryFragment.BackstoryInteractionListener {

    private FragmentManager manager;
    private Fragment fragment;
    public static String buttonClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        fragment = manager.findFragmentById(R.id.fragment_container);

        if(fragment == null) {
            fragment = new MainFragment();
            manager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    public void loadPickPowerFragment(String text) {
        buttonClicked = text;
        PickPowerFragment pickPowerFragment = new PickPowerFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, pickPowerFragment).addToBackStack(null).commit();
    }

    public void loadBackstoryFragment(String text) {
        BackstoryFragment bsFragment = BackstoryFragment.newInstance(buttonClicked, text);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, bsFragment).addToBackStack(null).commit();
    }

    public void loadMainFragment() {
        manager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPickPowerFragmentInteraction(Uri uri) {

    }

    @Override
    public void onBackstoryFragmentInteraction(Uri uri) {

    }
}
