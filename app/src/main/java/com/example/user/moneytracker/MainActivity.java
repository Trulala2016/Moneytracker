package com.example.user.moneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "mapp";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final TransactionsFragment fragmentById = (TransactionsFragment) getFragmentManager().findFragmentById(R.id.transactions_fragment);

    }


}
