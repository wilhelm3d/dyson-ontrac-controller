package com.dyson.mobile.android.salesforce;

import androidx.lifecycle.ViewModelProvider;
import com.dyson.mobile.android.usermanagement.profile.model.QuestionnaireStartInfo;
import ee1.j;
import kotlin.Metadata;
import m9.u;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/salesforce/e;", "Lm9/u;", "Leo0/b;", "deepLinkIntentBroadcaster", "Lee1/j;", "userProfileManager", "Lcom/dyson/mobile/android/salesforce/b;", "salesForceDeepLinkParser", "<init>", "(Leo0/b;Lee1/j;Lcom/dyson/mobile/android/salesforce/b;)V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends u {
    public final eo0.b d;
    public final j e;

    /* renamed from: f  reason: collision with root package name */
    public final b f16702f;

    /* renamed from: g  reason: collision with root package name */
    public final xf1.a<com.dyson.mobile.android.salesforce.a> f16703g;

    /* renamed from: h  reason: collision with root package name */
    public final xf1.a<QuestionnaireStartInfo> f16704h;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/salesforce/e$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Leo0/b;", "deepLinkIntentBroadcaster", "Lee1/j;", "userProfileManager", "Lcom/dyson/mobile/android/salesforce/b;", "salesForceDeepLinkParser", "<init>", "(Leo0/b;Lee1/j;Lcom/dyson/mobile/android/salesforce/b;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final eo0.b f16705a;

        /* renamed from: b  reason: collision with root package name */
        public final j f16706b;

        /* renamed from: c  reason: collision with root package name */
        public final b f16707c;

        public a(eo0.b bVar, j jVar, b bVar2) {
            bVar.getClass();
            jVar.getClass();
            bVar2.getClass();
            this.f16705a = bVar;
            this.f16706b = jVar;
            this.f16707c = bVar2;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new e(this.f16705a, this.f16706b, this.f16707c);
        }
    }

    public e(eo0.b bVar, j jVar, b bVar2) {
        bVar.getClass();
        jVar.getClass();
        bVar2.getClass();
        this.d = bVar;
        this.e = jVar;
        this.f16702f = bVar2;
        this.f16703g = new xf1.a<>();
        this.f16704h = new xf1.a<>();
    }
}
