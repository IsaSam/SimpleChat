package com.codepath.isaac.simplechat;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by isaac_000 on 7/31/2017.
 */
public class ChatListAdapter extends ArrayAdapter<Message> {


    public ChatListAdapter(Context context, int resource) {
        super(context, resource);
    }
}