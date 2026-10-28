package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class aa extends Binder implements z {
    public aa() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static z a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof z)) ? new ab(iBinder) : (z) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                com.google.android.gms.a.a aVarA = a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(aVarA != null ? aVarA.asBinder() : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                b();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                boolean zC = c();
                parcel2.writeNoException();
                parcel2.writeInt(zC ? 1 : 0);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                boolean zA = a(parcel.readInt() != 0 ? aj.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                d();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                e();
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                a(x.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                a(ag.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                f();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                g();
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.c.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                h();
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.c.MapAttrs_useViewLifecycle /* 12 */:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                am amVarI = i();
                parcel2.writeNoException();
                if (amVarI == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                amVarI.writeToParcel(parcel2, 1);
                return true;
            case com.google.android.gms.c.MapAttrs_zOrderOnTop /* 13 */:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                a(parcel.readInt() != 0 ? am.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                a(ed.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                a(el.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
