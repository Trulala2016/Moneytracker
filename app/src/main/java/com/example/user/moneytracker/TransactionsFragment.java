package com.example.user.moneytracker;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by User on 07.08.2016.
 */
public class TransactionsFragment extends Fragment {
    private static String TAG = "mapp";
    private ListView listView;
    List<Transactions> data = new ArrayList<>();
    private TransactionAdapter transactionAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_transaction, container);
        List<Transactions> adapterData = null;
        adapterData = getDataList();
        transactionAdapter = new TransactionAdapter(getActivity(), adapterData);
        listView = (ListView) inflate.findViewById(R.id.listview);
        if (null == listView) Log.d(TAG, "onCreate: " + listView);
        listView.setAdapter(transactionAdapter);
        return inflate;
    }

    private List<Transactions> getDataList() {
        data.add(new Transactions("Telephone", 2000, "05-03-2014"));
        data.add(new Transactions("T-Shirts", 20, "10-11-2015"));
        data.add(new Transactions("Jeans", 100, "15-12-2016"));
        return data;
    }
}
