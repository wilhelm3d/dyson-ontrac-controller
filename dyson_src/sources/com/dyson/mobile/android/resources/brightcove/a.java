package com.dyson.mobile.android.resources.brightcove;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import com.dyson.mobile.android.resources.brightcove.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import ms0.c;
import ms0.i;
import pf0.f;
import q8.n;
import qv1.s;
import rf0.i0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/resources/brightcove/a;", "", "Lms0/c;", "brightcoveDurationConverter", "Lms0/b;", "brightcoveCaptionLocaleProvider", "<init>", "(Lms0/c;Lms0/b;)V", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f15651a;

    /* renamed from: b  reason: collision with root package name */
    public final ms0.b f15652b;

    /* renamed from: c  reason: collision with root package name */
    public final ObservableBoolean f15653c;
    public final ObservableInt d;
    public final ObservableBoolean e;

    /* renamed from: f  reason: collision with root package name */
    public final ObservableBoolean f15654f;

    /* renamed from: g  reason: collision with root package name */
    public final n<String> f15655g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15656h;

    /* renamed from: i  reason: collision with root package name */
    public i f15657i;

    /* renamed from: j  reason: collision with root package name */
    public i f15658j;

    public a(c cVar, ms0.b bVar) {
        cVar.getClass();
        bVar.getClass();
        this.f15651a = cVar;
        this.f15652b = bVar;
        this.f15653c = new ObservableBoolean(false);
        this.d = new ObservableInt(4);
        this.e = new ObservableBoolean(false);
        this.f15654f = new ObservableBoolean(false);
        this.f15655g = new n<>("");
        this.f15656h = s.i(f.c(i0.f71587c), "\n", f.c(i0.d));
    }

    public final void a(b bVar) {
        bVar.getClass();
        boolean equals = bVar.equals(b.d.f15662a);
        ObservableInt observableInt = this.d;
        ObservableBoolean observableBoolean = this.f15653c;
        ObservableBoolean observableBoolean2 = this.f15654f;
        ObservableBoolean observableBoolean3 = this.e;
        if (equals) {
            observableBoolean3.m(true);
            observableBoolean2.m(false);
            observableBoolean.m(false);
            observableInt.l(4);
        } else if (bVar instanceof b.f) {
            observableBoolean3.m(false);
            observableBoolean2.m(false);
            observableInt.l(0);
            if (((b.f) bVar).f15664a) {
                return;
            }
            observableBoolean.m(true);
        } else if (bVar.equals(b.e.f15663a)) {
            observableBoolean3.m(false);
            observableBoolean2.m(false);
            observableBoolean.m(false);
            observableInt.l(0);
        } else if (bVar.equals(b.a.f15659a)) {
            observableBoolean3.m(true);
        } else if (bVar.equals(b.c.f15661a)) {
            observableBoolean3.m(false);
        } else if (!bVar.equals(b.C0539b.f15660a)) {
            e.o();
        } else {
            observableBoolean3.m(false);
            observableBoolean2.m(true);
            observableBoolean.m(false);
            observableInt.l(4);
        }
    }

    public a() {
        this(null, null, 3, null);
    }

    public /* synthetic */ a(c cVar, ms0.b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new c() : cVar, (i13 & 2) != 0 ? new ms0.b() : bVar);
    }
}
