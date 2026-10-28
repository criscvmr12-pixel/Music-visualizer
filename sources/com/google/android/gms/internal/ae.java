package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
class ae implements ac {
    private IBinder a;

    ae(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.google.android.gms.internal.ac
    public IBinder a(com.google.android.gms.a.a aVar, am amVar, String str, bw bwVar, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
            if (amVar != null) {
                parcelObtain.writeInt(1);
                amVar.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeStrongBinder(bwVar != null ? bwVar.asBinder() : null);
            parcelObtain.writeInt(i);
            this.a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }
}
