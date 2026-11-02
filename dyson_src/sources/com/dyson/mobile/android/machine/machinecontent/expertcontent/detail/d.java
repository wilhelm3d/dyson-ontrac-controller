package com.dyson.mobile.android.machine.machinecontent.expertcontent.detail;

import com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideoPlaylist;
import h12.y;
import kotlin.Metadata;
import q62.n;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/d;", "", "", "posterImageUrl", "header", "playlistTitle", "playlistDescription", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", "videoPlaylist", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c.d {

    /* renamed from: a  reason: collision with root package name */
    public final String f15218a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15219b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15220c;
    public final String d;
    public final ExpertContentVideoPlaylist e;

    public d(String str, String str2, String str3, String str4, ExpertContentVideoPlaylist expertContentVideoPlaylist) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        expertContentVideoPlaylist.getClass();
        this.f15218a = str;
        this.f15219b = str2;
        this.f15220c = str3;
        this.d = str4;
        this.e = expertContentVideoPlaylist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f15218a.equals(dVar.f15218a) && this.f15219b.equals(dVar.f15219b) && this.f15220c.equals(dVar.f15220c) && this.d.equals(dVar.d) && this.e.equals(dVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + y.c(y.c(y.c(this.f15218a.hashCode() * 31, 31, this.f15219b), 31, this.f15220c), 31, this.d);
    }

    public final String toString() {
        StringBuilder m13 = ma.e.m("PlayList(posterImageUrl=", this.f15218a, ", header=", this.f15219b, ", playlistTitle=");
        n.o(m13, this.f15220c, ", playlistDescription=", this.d, ", videoPlaylist=");
        m13.append(this.e);
        m13.append(")");
        return m13.toString();
    }
}
