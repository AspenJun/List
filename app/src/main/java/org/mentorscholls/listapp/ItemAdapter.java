package org.mentorscholls.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] ranges;
    String[] descriptions;

    public ItemAdapter(Context c, String[] i, String[] r, String[] d){
        items = i;
        ranges = r;
        descriptions = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView rangeTextView = (TextView) v.findViewById(R.id.rangeTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);

        String name = items[i];
        String cost = ranges[i];
        String desc = descriptions[i];

        nameTextView.setText(name);
        rangeTextView.setText(cost);
        descriptionTextView.setText(desc);

        return v;
    }
}
