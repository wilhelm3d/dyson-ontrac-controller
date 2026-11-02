package com.dyson.mobile.android.account.legacy.namecapture;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.t;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/namecapture/a;", "Ly9/t;", "", "isAlternateName", "<init>", "(Z)V", "a", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements t {

    /* renamed from: b  reason: collision with root package name */
    public static final C0327a f12167b = new C0327a(null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12168a;

    public /* synthetic */ a(boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z13);
    }

    public static final a fromBundle(Bundle bundle) {
        f12167b.getClass();
        return C0327a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f12168a == ((a) obj).f12168a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12168a);
    }

    public final String toString() {
        return d72.a.j("NameCaptureFragmentArgs(isAlternateName=", ")", this.f12168a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/namecapture/a$a;", "", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.account.legacy.namecapture.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0327a {
        public /* synthetic */ C0327a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static a a(Bundle bundle) {
            bundle.getClass();
            bundle.setClassLoader(a.class.getClassLoader());
            return new a(bundle.containsKey("isAlternateName") ? bundle.getBoolean("isAlternateName") : false);
        }

        private C0327a() {
        }
    }

    public a(boolean z13) {
        this.f12168a = z13;
    }

    public a() {
        this(false, 1, null);
    }
}
