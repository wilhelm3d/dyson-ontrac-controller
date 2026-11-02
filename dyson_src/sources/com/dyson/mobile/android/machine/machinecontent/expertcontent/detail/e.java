package com.dyson.mobile.android.machine.machinecontent.expertcontent.detail;

import com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c;
import h12.y;
import kotlin.Metadata;
import q62.n;
import x12.r;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/e;", "", "", "header", "videoTitle", "videoDescription", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$b;", "ctaLink", "videoId", "currentMarket", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$b;Ljava/lang/String;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c.d {

    /* renamed from: a  reason: collision with root package name */
    public final String f15221a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15222b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15223c;
    public final c.b d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15224f;

    public e(String str, String str2, String str3, c.b bVar, String str4, String str5) {
        n.m(str, str2, str3, str4, str5);
        this.f15221a = str;
        this.f15222b = str2;
        this.f15223c = str3;
        this.d = bVar;
        this.e = str4;
        this.f15224f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f15221a.equals(eVar.f15221a) && this.f15222b.equals(eVar.f15222b) && this.f15223c.equals(eVar.f15223c) && r.c(this.d, eVar.d) && this.e.equals(eVar.e) && this.f15224f.equals(eVar.f15224f);
        }
        return false;
    }

    public final int hashCode() {
        int c13 = y.c(y.c(this.f15221a.hashCode() * 31, 31, this.f15222b), 31, this.f15223c);
        c.b bVar = this.d;
        return this.f15224f.hashCode() + y.c((c13 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder m13 = ma.e.m("VideoContent(header=", this.f15221a, ", videoTitle=", this.f15222b, ", videoDescription=");
        m13.append(this.f15223c);
        m13.append(", ctaLink=");
        m13.append(this.d);
        m13.append(", videoId=");
        return jy1.a.f(m13, this.e, ", currentMarket=", this.f15224f, ")");
    }
}
