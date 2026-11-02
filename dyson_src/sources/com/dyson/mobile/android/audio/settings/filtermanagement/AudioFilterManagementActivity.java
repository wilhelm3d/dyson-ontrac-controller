package com.dyson.mobile.android.audio.settings.filtermanagement;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.settings.filtermanagement.a;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pl0.c;
import pl0.e;
import q8.g;
import we1.a;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/filtermanagement/AudioFilterManagementActivity;", "Lpl0/c;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioFilterManagementActivity extends c {

    /* renamed from: t  reason: collision with root package name */
    public static final a f12762t = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public String f12763s;

    @Override // pl0.c, bt0.f
    public final bt0.a i1() {
        return new e();
    }

    @Override // pl0.c, bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        this.f12763s = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        dk.e eVar = (dk.e) g.d(this, R.layout.activity_audio_filter_management);
        a.C0360a c0360a = com.dyson.mobile.android.audio.settings.filtermanagement.a.f12781k;
        String str = this.f12763s;
        if (str == null) {
            pa.c.p("Required value was null.");
            return;
        }
        c0360a.getClass();
        com.dyson.mobile.android.audio.settings.filtermanagement.a aVar = new com.dyson.mobile.android.audio.settings.filtermanagement.a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", str);
        aVar.setArguments(bundle2);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.g(R.id.fragment_container, aVar, null, 1);
        aVar2.f();
        eVar.d.setOnClickListener(new ao1.a(this, 24));
    }

    @Override // pl0.c
    public final e r1() {
        return new e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/filtermanagement/AudioFilterManagementActivity$a;", "", "<init>", "()V", "", "COORDINATOR_ID", "Ljava/lang/String;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
