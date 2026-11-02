package com.dyson.mobile.android.account.legacy.mobilenumber;

import android.os.Bundle;
import bv1.f;
import com.dyson.mobile.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/mobilenumber/a;", "", "<init>", "()V", "a", "b", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f12158a = new b(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/mobilenumber/a$a;", "Ly9/m0;", "", "challengeId", "<init>", "(Ljava/lang/String;)V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.account.legacy.mobilenumber.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0326a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f12159a;

        public C0326a(String str) {
            str.getClass();
            this.f12159a = str;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.actionNextOnMobileNumberSubmitted;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0326a) && this.f12159a.equals(((C0326a) obj).f12159a);
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("challengeId", this.f12159a);
            return bundle;
        }

        public final int hashCode() {
            return this.f12159a.hashCode();
        }

        public final String toString() {
            return f.e("ActionNextOnMobileNumberSubmitted(challengeId=", this.f12159a, ")");
        }
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/mobilenumber/a$b;", "", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
