package com.example.networking;

import java.util.ArrayList;

public class RecyclerViewAdapter {
    public RecyclerViewAdapter(MainActivity mainActivity, ArrayList<RecyclerViewItem> items, OnClickListener onClickListener) {
    }

    public interface OnClickListener {
        void onClick(RecyclerViewItem item);
    }
}
