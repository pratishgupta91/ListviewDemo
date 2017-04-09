package com.example.pratish.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pratish on 09/04/17.
 */

public class ListAdapter extends BaseAdapter {

    ArrayList<ListModel> m_listItems;
    Context m_context;
    LayoutInflater m_inflater;

    public ListAdapter(Context context, ArrayList<ListModel> listItems) {

        // Set the activity context
        m_context = context;

        // Set the items of the list
        m_listItems = listItems;

        // Set the layout inflater
        m_inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return m_listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return m_listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;

        // If the view is not in cache, then create a new one
        if(convertView==null) {
            vi = m_inflater.inflate(R.layout.item_row, null);
        }

        // Fill the data
        // Set the title
        TextView title = (TextView)vi.findViewById(R.id.list_title);
        title.setText(m_listItems.get(position).getTitle());

        // Set the subtitle
        TextView subtitle = (TextView)vi.findViewById(R.id.list_subtitle);
        subtitle.setText(m_listItems.get(position).getSubtitle());

        // Set the image
        ImageView thumb_image = (ImageView)vi.findViewById(R.id.list_image);
        thumb_image.setImageResource( R.drawable.images);

        // Return the view
        return vi;
    }
}
