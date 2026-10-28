package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
class e implements c {
    private IBinder a;

    e(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.google.android.gms.wearable.internal.c
    public void a(DataHolder dataHolder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (dataHolder != null) {
                parcelObtain.writeInt(1);
                dataHolder.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.c
    public void a(af afVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (afVar != null) {
                parcelObtain.writeInt(1);
                afVar.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.wearable.internal.c
    public void a(ai aiVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (aiVar != null) {
                parcelObtain.writeInt(1);
                aiVar.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }

    @Override // com.google.android.gms.wearable.internal.c
    public void b(ai aiVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (aiVar != null) {
                parcelObtain.writeInt(1);
                aiVar.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
