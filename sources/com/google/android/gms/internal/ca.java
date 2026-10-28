package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ca extends Binder implements bz {
    public ca() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static bz a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bz)) ? new cb(iBinder) : (bz) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a(com.google.android.gms.a.b.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? am.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? aj.CREATOR.createFromParcel(parcel) : null, parcel.readString(), cd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                com.google.android.gms.a.a aVarA = a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(aVarA != null ? aVarA.asBinder() : null);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a(com.google.android.gms.a.b.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? aj.CREATOR.createFromParcel(parcel) : null, parcel.readString(), cd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                b();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                c();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a(com.google.android.gms.a.b.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? am.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? aj.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), cd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a(com.google.android.gms.a.b.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? aj.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), cd.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                d();
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                e();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
