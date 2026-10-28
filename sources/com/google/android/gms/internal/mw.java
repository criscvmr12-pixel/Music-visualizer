package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class mw extends mm {
    private mw(Context context, nx nxVar, ny nyVar) {
        super(context, nxVar, nyVar);
    }

    public static mw a(String str, Context context) {
        fz fzVar = new fz();
        a(str, context, fzVar);
        return new mw(context, fzVar, new ob(239));
    }

    @Override // com.google.android.gms.internal.mm, com.google.android.gms.internal.lf
    protected void b(Context context) {
        super.b(context);
        try {
            try {
                mx mxVarE = e(context);
                a(28, mxVarE.b() ? 1L : 0L);
                String strA = mxVarE.a();
                if (strA != null) {
                    a(30, strA);
                }
            } catch (com.google.android.gms.common.e e) {
            } catch (IOException e2) {
                a(28, 1L);
            }
        } catch (IOException e3) {
        }
    }

    mx e(Context context) throws IOException {
        String strA;
        int i = 0;
        try {
            com.google.android.gms.ads.b.b bVarB = com.google.android.gms.ads.b.a.b(context);
            String strA2 = bVarB.a();
            if (strA2 == null || !strA2.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")) {
                strA = strA2;
            } else {
                byte[] bArr = new byte[16];
                int i2 = 0;
                while (i < strA2.length()) {
                    if (i == 8 || i == 13 || i == 18 || i == 23) {
                        i++;
                    }
                    bArr[i2] = (byte) ((Character.digit(strA2.charAt(i), 16) << 4) + Character.digit(strA2.charAt(i + 1), 16));
                    i2++;
                    i += 2;
                }
                strA = this.c.a(bArr, true);
            }
            return new mx(this, strA, bVarB.b());
        } catch (com.google.android.gms.common.f e) {
            throw new IOException(e);
        }
    }
}
