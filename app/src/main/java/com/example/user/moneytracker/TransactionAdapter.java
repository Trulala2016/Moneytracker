package com.example.user.moneytracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 04.08.2016.
 */
public class TransactionAdapter extends ArrayAdapter<Transactions> {
    Context context;
    List<Transactions> transactions;

    public TransactionAdapter(Context context, List<Transactions> transactions) {
        super(context, 0, transactions);
        this.transactions = transactions;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Transactions transaction = getItem(position);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView sum = (TextView) convertView.findViewById(R.id.sum);
        TextView dt = (TextView) convertView.findViewById(R.id.date);
        title.setText(transaction.title);
        sum.setText(transaction.sum + "");
        dt.setText(transaction.date);
        return convertView;
    }
}
