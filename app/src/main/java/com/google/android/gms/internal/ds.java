package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ds {
    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time");
    private static final Object c = new Object();
    private static ds d;
    private final du b;

    private ds(Context context) {
        this.b = new du(this, context, "google_inapp_purchase.db");
    }

    public static ds a(Context context) {
        ds dsVar;
        synchronized (c) {
            if (d == null) {
                d = new ds(context);
            }
            dsVar = d;
        }
        return dsVar;
    }

    public SQLiteDatabase a() {
        try {
            return this.b.getWritableDatabase();
        } catch (SQLiteException e) {
            hj.e("Error opening writable conversion tracking database");
            return null;
        }
    }

    public dq a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new dq(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
    }

    public List a(long j) {
        Cursor cursorQuery;
        Cursor cursor = null;
        synchronized (c) {
            LinkedList linkedList = new LinkedList();
            if (j <= 0) {
                return linkedList;
            }
            SQLiteDatabase sQLiteDatabaseA = a();
            try {
                if (sQLiteDatabaseA == null) {
                    return linkedList;
                }
                try {
                    cursorQuery = sQLiteDatabaseA.query("InAppPurchase", null, null, null, null, null, "record_time ASC", String.valueOf(j));
                    try {
                        if (cursorQuery.moveToFirst()) {
                            do {
                                linkedList.add(a(cursorQuery));
                            } while (cursorQuery.moveToNext());
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        hj.e("Error extracing purchase info: " + e.getMessage());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    cursorQuery = null;
                } catch (Throwable th) {
                    th = th;
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
                return linkedList;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void a(dq dqVar) {
        if (dqVar == null) {
            return;
        }
        synchronized (c) {
            SQLiteDatabase sQLiteDatabaseA = a();
            if (sQLiteDatabaseA != null) {
                sQLiteDatabaseA.delete("InAppPurchase", String.format("%s = %d", "purchase_id", Long.valueOf(dqVar.a)), null);
            }
        }
    }

    public int b() {
        Cursor cursorRawQuery = null;
        int i = 0;
        synchronized (c) {
            SQLiteDatabase sQLiteDatabaseA = a();
            try {
                if (sQLiteDatabaseA != null) {
                    try {
                        cursorRawQuery = sQLiteDatabaseA.rawQuery("select count(*) from InAppPurchase", null);
                        if (cursorRawQuery.moveToFirst()) {
                            i = cursorRawQuery.getInt(0);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        } else if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } catch (SQLiteException e) {
                        hj.e("Error getting record count" + e.getMessage());
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    }
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }
        return i;
    }

    public void b(dq dqVar) {
        if (dqVar == null) {
            return;
        }
        synchronized (c) {
            SQLiteDatabase sQLiteDatabaseA = a();
            if (sQLiteDatabaseA == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("product_id", dqVar.c);
            contentValues.put("developer_payload", dqVar.b);
            contentValues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
            dqVar.a = sQLiteDatabaseA.insert("InAppPurchase", null, contentValues);
            if (b() > 20000) {
                c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x002c, B:15:0x002f, B:28:0x005a, B:29:0x005d, B:24:0x0052), top: B:34:0x0004 }] */
    public void c() {
        Cursor cursorQuery;
        synchronized (c) {
            SQLiteDatabase sQLiteDatabaseA = a();
            if (sQLiteDatabaseA == null) {
                return;
            }
            try {
                cursorQuery = sQLiteDatabaseA.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                a(a(cursorQuery));
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        hj.e("Error remove oldest record" + e.getMessage());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = null;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        }
    }
}
