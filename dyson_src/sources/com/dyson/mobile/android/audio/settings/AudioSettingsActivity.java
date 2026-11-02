package com.dyson.mobile.android.audio.settings;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.settings.b;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pl0.c;
import pl0.e;
import rf0.q;
import vj.f;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/AudioSettingsActivity;", "Lpl0/c;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioSettingsActivity extends c {

    /* renamed from: w  reason: collision with root package name */
    public static final a f12704w = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public pf0.c f12705s;

    /* renamed from: u  reason: collision with root package name */
    public String f12707u;

    /* renamed from: t  reason: collision with root package name */
    public e f12706t = new e();

    /* renamed from: v  reason: collision with root package name */
    public String f12708v = "";

    @Override // pl0.c, bt0.f
    public final bt0.a i1() {
        return this.f12706t;
    }

    @Override // pl0.c, bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        this.f12707u = y13;
        f.f84306m.getClass();
        f a14 = f.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12705s = a14.f84312l.f();
        super.onCreate(bundle);
        pf0.c cVar = this.f12705s;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        this.f12708v = cVar.d(q.A0);
        e eVar = new e();
        this.f12706t = eVar;
        String str = this.f12708v;
        eVar.f64437f = R.drawable.ic_machine_settings;
        eVar.f64438g = str;
    }

    @Override // pl0.c, bt0.f, l.b, android.app.Activity
    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            b.a aVar = b.f12736t;
            String str = this.f12707u;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar.getClass();
            b bVar = new b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            bVar.setArguments(bundle2);
            s1(bVar, this.f12708v, true);
        }
    }

    @Override // bt0.f, l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // pl0.c
    public final e r1() {
        return this.f12706t;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/AudioSettingsActivity$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
