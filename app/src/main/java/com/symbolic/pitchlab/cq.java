package com.symbolic.pitchlab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class cq extends ArrayAdapter {
    List a;
    int b;

    public cq(Context context, int i, List list) {
        super(context, i, list);
        this.b = i;
        this.a = list;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(this.b, viewGroup, false);
        }
        ((cp) getItem(i)).a(view);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return ((cp) this.a.get(i)).a();
    }
}
