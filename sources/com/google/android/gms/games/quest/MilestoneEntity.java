package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ku;

/* JADX INFO: loaded from: classes.dex */
public final class MilestoneEntity implements SafeParcelable, Milestone {
    public static final a CREATOR = new a();
    private final int a;
    private final String b;
    private final long c;
    private final long d;
    private final byte[] e;
    private final int f;
    private final String g;

    MilestoneEntity(int i, String str, long j, long j2, byte[] bArr, int i2, String str2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = bArr;
        this.f = i2;
        this.g = str2;
    }

    public MilestoneEntity(Milestone milestone) {
        this.a = 4;
        this.b = milestone.j_();
        this.c = milestone.c();
        this.d = milestone.f();
        this.f = milestone.e();
        this.g = milestone.d();
        byte[] bArrG = milestone.g();
        if (bArrG == null) {
            this.e = null;
        } else {
            this.e = new byte[bArrG.length];
            System.arraycopy(bArrG, 0, this.e, 0, bArrG.length);
        }
    }

    static int a(Milestone milestone) {
        return ku.a(milestone.j_(), Long.valueOf(milestone.c()), Long.valueOf(milestone.f()), Integer.valueOf(milestone.e()), milestone.d());
    }

    static boolean a(Milestone milestone, Object obj) {
        if (!(obj instanceof Milestone)) {
            return false;
        }
        if (milestone == obj) {
            return true;
        }
        Milestone milestone2 = (Milestone) obj;
        return ku.a(milestone2.j_(), milestone.j_()) && ku.a(Long.valueOf(milestone2.c()), Long.valueOf(milestone.c())) && ku.a(Long.valueOf(milestone2.f()), Long.valueOf(milestone.f())) && ku.a(Integer.valueOf(milestone2.e()), Integer.valueOf(milestone.e())) && ku.a(milestone2.d(), milestone.d());
    }

    static String b(Milestone milestone) {
        return ku.a(milestone).a("MilestoneId", milestone.j_()).a("CurrentProgress", Long.valueOf(milestone.c())).a("TargetProgress", Long.valueOf(milestone.f())).a("State", Integer.valueOf(milestone.e())).a("CompletionRewardData", milestone.g()).a("EventId", milestone.d()).toString();
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public long c() {
        return this.c;
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public String d() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public long f() {
        return this.d;
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public byte[] g() {
        return this.e;
    }

    public int h() {
        return this.a;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.common.data.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Milestone a() {
        return this;
    }

    @Override // com.google.android.gms.games.quest.Milestone
    public String j_() {
        return this.b;
    }

    public String toString() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
