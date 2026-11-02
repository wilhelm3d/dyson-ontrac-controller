package com.dyson.mobile.android.account.legacy.resetpassword.host;

import android.os.Bundle;
import android.os.Parcelable;
import com.salesforce.marketingcloud.messages.inbox.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import y9.t;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/resetpassword/host/a;", "Ly9/t;", "", "email", "Lcom/dyson/mobile/android/account/legacy/resetpassword/host/PasswordResetType;", b.f21448j, "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/account/legacy/resetpassword/host/PasswordResetType;)V", "a", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements t {

    /* renamed from: c  reason: collision with root package name */
    public static final C0335a f12263c = new C0335a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f12264a;

    /* renamed from: b  reason: collision with root package name */
    public final PasswordResetType f12265b;

    public a(String str, PasswordResetType passwordResetType) {
        str.getClass();
        passwordResetType.getClass();
        this.f12264a = str;
        this.f12265b = passwordResetType;
    }

    public static final a fromBundle(Bundle bundle) {
        f12263c.getClass();
        return C0335a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f12264a.equals(aVar.f12264a) && this.f12265b == aVar.f12265b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12265b.hashCode() + (this.f12264a.hashCode() * 31);
    }

    public final String toString() {
        return "PasswordResetHostActivityArgs(email=" + this.f12264a + ", type=" + this.f12265b + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/resetpassword/host/a$a;", "", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.account.legacy.resetpassword.host.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0335a {
        public /* synthetic */ C0335a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static a a(Bundle bundle) {
            bundle.getClass();
            bundle.setClassLoader(a.class.getClassLoader());
            if (!bundle.containsKey("email")) {
                c.p("Required argument \"email\" is missing and does not have an android:defaultValue");
                return null;
            }
            String string = bundle.getString("email");
            if (string == null) {
                c.p("Argument \"email\" is marked as non-null but was passed a null value.");
                return null;
            } else if (!bundle.containsKey(b.f21448j)) {
                c.p("Required argument \"type\" is missing and does not have an android:defaultValue");
                return null;
            } else if (!Parcelable.class.isAssignableFrom(PasswordResetType.class) && !Serializable.class.isAssignableFrom(PasswordResetType.class)) {
                ie.a.t(PasswordResetType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            } else {
                PasswordResetType passwordResetType = (PasswordResetType) bundle.get(b.f21448j);
                if (passwordResetType != null) {
                    return new a(string, passwordResetType);
                }
                c.p("Argument \"type\" is marked as non-null but was passed a null value.");
                return null;
            }
        }

        private C0335a() {
        }
    }
}
