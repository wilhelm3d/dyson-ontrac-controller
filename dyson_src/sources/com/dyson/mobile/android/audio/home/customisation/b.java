package com.dyson.mobile.android.audio.home.customisation;

import android.net.Uri;
import com.dyson.mobile.android.localisation.LocalisationKey;
import kotlin.Metadata;
import v32.y;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/b;", "", "Lpf0/c;", "localisationManager", "<init>", "(Lpf0/c;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final pf0.c f12459a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12460b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12461c;
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12462f;

    /* renamed from: g  reason: collision with root package name */
    public final String f12463g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12464h;

    static {
        int i13 = pf0.c.d;
    }

    public b(pf0.c cVar) {
        cVar.getClass();
        this.f12459a = cVar;
        this.f12460b = cVar.d(rf0.e.f71149k);
        this.f12461c = cVar.d(rf0.e.f71147i);
        this.d = cVar.d(rf0.e.f71148j);
        this.e = cVar.d(rf0.e.f71145g);
        this.f12462f = cVar.d(rf0.e.f71146h);
        this.f12463g = cVar.d(rf0.e.e);
        this.f12464h = cVar.d(rf0.e.f71144f);
    }

    public final gl.i a(bk.b bVar, boolean z13, boolean z14, String str, String str2) {
        String c13 = bVar.c();
        String str3 = !z14 ? "" : z13 ? this.f12461c : this.d;
        String str4 = (z14 && str.equals("earcushions")) ? this.e : (z14 && str.equals("earcups")) ? this.f12462f : str.equals("earcushions") ? this.f12463g : this.f12464h;
        LocalisationKey.f15077f.getClass();
        String e = this.f12459a.e(LocalisationKey.a.b(c13), "");
        String obj = y.U(str3 + " " + str4 + " " + this.f12460b + " " + e).toString();
        if (str2 != null) {
            return new gl.i(bVar.c(), Uri.parse(str2), obj);
        }
        return null;
    }
}
