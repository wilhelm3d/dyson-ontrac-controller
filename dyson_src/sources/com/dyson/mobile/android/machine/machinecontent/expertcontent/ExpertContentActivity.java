package com.dyson.mobile.android.machine.machinecontent.expertcontent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.dyson.mobile.android.R;
import f.j;
import f.x;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.b;
import q8.g;
import we1.a;
import y9.c0;
import y9.n0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/ExpertContentActivity;", "Ll/b;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpertContentActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f15115j = new a(null);

    public final c0 c1() {
        Fragment D = getSupportFragmentManager().D(R.id.nav_host_fragment);
        D.getClass();
        return androidx.navigation.fragment.a.a((NavHostFragment) D);
    }

    public final boolean d1(String str) {
        Bundle extras = getIntent().getExtras();
        return extras != null && extras.containsKey(str);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        g.d(this, R.layout.activity_expert_content);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newInstance method to create ExpertContentActivity";
        Bundle a14 = a13.a("machineSerial");
        if (d1("expertContentItemId") && d1("expertContentCollectionId")) {
            String y13 = o0.y("machineSerial", a14);
            String y14 = o0.y("expertContentCollectionId", a14);
            String y15 = o0.y("expertContentItemId", a14);
            n0 b13 = c1().d().b(R.navigation.nav_graph_expert_content);
            b13.w(R.id.expertContentDetailFragment);
            c0 c13 = c1();
            oi0.b bVar = new oi0.b(y14, y15, y13);
            Bundle bundle2 = new Bundle();
            bundle2.putString("expertContentCollectionId", bVar.f60259a);
            bundle2.putString("expertContentItemId", bVar.f60260b);
            bundle2.putString("machineSerial", bVar.f60261c);
            c13.getClass();
            c13.f89416b.v(b13, bundle2);
        } else if (d1("expertContentOnboardingTopic")) {
            String y16 = o0.y("machineSerial", a14);
            String y17 = o0.y("expertContentOnboardingTopic", a14);
            String y18 = o0.y("expertContentOnboardingTitle", a14);
            boolean z13 = a14.getBoolean("expertContentRefreshLobbyOnClose");
            n0 b14 = c1().d().b(R.navigation.nav_graph_expert_content);
            b14.w(R.id.expertContentChapteredGuideLoadingFragment);
            c0 c14 = c1();
            pi0.a aVar = new pi0.a(y16, y17, y18, z13);
            Bundle bundle3 = new Bundle();
            bundle3.putString("machineSerial", aVar.f64171a);
            bundle3.putString("topic", aVar.f64172b);
            bundle3.putString("title", aVar.f64173c);
            bundle3.putBoolean("shouldRefreshLobbyOnClose", aVar.d);
            c14.getClass();
            c14.f89416b.v(b14, bundle3);
        }
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/ExpertContentActivity$a;", "", "<init>", "()V", "", "MACHINE_SERIAL_EXTRA", "Ljava/lang/String;", "EXPERT_CONTENT_COLLECTION_ID_EXTRA", "EXPERT_CONTENT_ITEM_ID_EXTRA", "EXPERT_CONTENT_ONBOARDING_TOPIC_EXTRA", "EXPERT_CONTENT_ONBOARDING_TITLE_EXTRA", "EXPERT_CONTENT_SHOULD_REFRESH_LOBBY_ON_CLOSE_EXTRA", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, String str, String str2, String str3) {
            context.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            Intent intent = new Intent(context, ExpertContentActivity.class);
            intent.putExtra("machineSerial", str);
            intent.putExtra("expertContentCollectionId", str2);
            intent.putExtra("expertContentItemId", str3);
            return intent;
        }

        public static Intent b(Activity activity, String str, String str2, String str3, boolean z13) {
            activity.getClass();
            str.getClass();
            str3.getClass();
            Intent intent = new Intent(activity, ExpertContentActivity.class);
            intent.putExtra("machineSerial", str);
            intent.putExtra("expertContentOnboardingTopic", str2);
            intent.putExtra("expertContentOnboardingTitle", str3);
            intent.putExtra("expertContentRefreshLobbyOnClose", z13);
            return intent;
        }

        private a() {
        }
    }
}
