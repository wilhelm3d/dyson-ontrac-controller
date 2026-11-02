package com.dyson.mobile.android.account.legacy.resetpassword.activateaccount;

import android.os.Bundle;
import bv1.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.t;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/resetpassword/activateaccount/a;", "Ly9/t;", "", "email", "<init>", "(Ljava/lang/String;)V", "a", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements t {

    /* renamed from: b  reason: collision with root package name */
    public static final C0332a f12229b = new C0332a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f12230a;

    public a(String str) {
        str.getClass();
        this.f12230a = str;
    }

    public static final a fromBundle(Bundle bundle) {
        f12229b.getClass();
        return C0332a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f12230a.equals(((a) obj).f12230a);
    }

    public final int hashCode() {
        return this.f12230a.hashCode();
    }

    public final String toString() {
        return f.e("ActivateAccountFragmentArgs(email=", this.f12230a, ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/resetpassword/activateaccount/a$a;", "", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.account.legacy.resetpassword.activateaccount.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0332a {
        public /* synthetic */ C0332a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static a a(Bundle bundle) {
            bundle.getClass();
            bundle.setClassLoader(a.class.getClassLoader());
            if (!bundle.containsKey("email")) {
                pa.c.p("Required argument \"email\" is missing and does not have an android:defaultValue");
                return null;
            }
            String string = bundle.getString("email");
            if (string != null) {
                return new a(string);
            }
            pa.c.p("Argument \"email\" is marked as non-null but was passed a null value.");
            return null;
        }

        private C0332a() {
        }
    }
}
