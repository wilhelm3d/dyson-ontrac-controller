package com.dyson.mobile.android.account.legacy.resetpassword.activateaccount;

import android.os.Bundle;
import bv1.f;
import com.dyson.mobile.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/resetpassword/activateaccount/b;", "", "<init>", "()V", "a", "b", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0333b f12231a = new C0333b(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/resetpassword/activateaccount/b$a;", "Ly9/m0;", "", "email", "<init>", "(Ljava/lang/String;)V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f12232a;

        public a(String str) {
            str.getClass();
            this.f12232a = str;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.actionNext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f12232a.equals(((a) obj).f12232a);
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("email", this.f12232a);
            return bundle;
        }

        public final int hashCode() {
            return this.f12232a.hashCode();
        }

        public final String toString() {
            return f.e("ActionNext(email=", this.f12232a, ")");
        }
    }

    private b() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/resetpassword/activateaccount/b$b;", "", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.account.legacy.resetpassword.activateaccount.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0333b {
        public /* synthetic */ C0333b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0333b() {
        }
    }
}
