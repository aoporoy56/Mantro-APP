package com.example.mantro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] mantroTitle;
    LayoutInflater inflater=null;
    TextView textView;
    CustomAdapter(Context context,String[] mantroTitle){
        this.context=context;
        this.mantroTitle=mantroTitle;
    }

    @Override
    public int getCount() {
        return mantroTitle.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.layout_list,null);
        }
        textView = view.findViewById(R.id.mantroTitle);
        textView.setText(mantroTitle[i]);
        return view;
    }
}
