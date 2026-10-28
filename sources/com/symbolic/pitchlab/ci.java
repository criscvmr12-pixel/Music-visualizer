package com.symbolic.pitchlab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ci extends ArrayAdapter {
    int a;

    public ci(Context context, int i, List list) {
        super(context, i, list);
        this.a = i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(this.a, viewGroup, false);
        }
        ((ch) getItem(i)).a(view);
        return view;
    }
}
