package com.dyson.mobile.android.account.legacy.passwordandotpcapture;

import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.account.legacy.resetpassword.host.PasswordResetType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/passwordandotpcapture/a;", "", "<init>", "()V", "a", "b", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f12195a = new b(null);

    private a() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/passwordandotpcapture/a$b;", "", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/passwordandotpcapture/a$a;", "Ly9/m0;", "", "email", "Lcom/dyson/mobile/android/account/legacy/resetpassword/host/PasswordResetType;", com.salesforce.marketingcloud.messages.inbox.b.f21448j, "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/account/legacy/resetpassword/host/PasswordResetType;)V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.account.legacy.passwordandotpcapture.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0330a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f12196a;

        /* renamed from: b  reason: collision with root package name */
        public final PasswordResetType f12197b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12198c;

        public C0330a(String str, PasswordResetType passwordResetType) {
            str.getClass();
            passwordResetType.getClass();
            this.f12196a = str;
            this.f12197b = passwordResetType;
            this.f12198c = R.id.actionForgottenPassword;
        }

        @Override // y9.m0
        public final int a() {
            return this.f12198c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0330a) {
                C0330a c0330a = (C0330a) obj;
                return r.c(this.f12196a, c0330a.f12196a) && this.f12197b == c0330a.f12197b;
            }
            return false;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PasswordResetType.class);
            PasswordResetType passwordResetType = this.f12197b;
            if (isAssignableFrom) {
                passwordResetType.getClass();
                bundle.putParcelable(com.salesforce.marketingcloud.messages.inbox.b.f21448j, (Parcelable) passwordResetType);
            } else if (Serializable.class.isAssignableFrom(PasswordResetType.class)) {
                passwordResetType.getClass();
                bundle.putSerializable(com.salesforce.marketingcloud.messages.inbox.b.f21448j, passwordResetType);
            }
            bundle.putString("email", this.f12196a);
            return bundle;
        }

        public final int hashCode() {
            return this.f12197b.hashCode() + (this.f12196a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionForgottenPassword(email=" + this.f12196a + ", type=" + this.f12197b + ")";
        }

        public /* synthetic */ C0330a(String str, PasswordResetType passwordResetType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? PasswordResetType.FORGOTTEN_PASSWORD : passwordResetType);
        }
    }
}
