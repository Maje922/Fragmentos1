package com.android.curso.fragmentos1;

import android.app.FragmentController;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.curso.fragmentos1.fragmentos.DataFragment;
import com.android.curso.fragmentos1.fragmentos.DetailsFragment;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String text) {

        DetailsFragment detailsFragment=(DetailsFragment)getSupportFragmentManager().findFragmentById(R.id.detailFragment);
        detailsFragment.renderText(text);

    }
}
