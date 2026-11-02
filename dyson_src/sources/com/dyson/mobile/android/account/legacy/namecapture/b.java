package com.dyson.mobile.android.account.legacy.namecapture;

import android.os.Bundle;
import com.dyson.mobile.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/namecapture/b;", "", "<init>", "()V", "a", "b", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0328b f12169a = new C0328b(null);

    private b() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/namecapture/b$b;", "", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.account.legacy.namecapture.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0328b {
        public /* synthetic */ C0328b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0328b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/namecapture/b$a;", "Ly9/m0;", "", "isAlternateName", "<init>", "(Z)V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f12170a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12171b;

        public a(boolean z13) {
            this.f12170a = z13;
            this.f12171b = R.id.actionAlternateName;
        }

        @Override // y9.m0
        public final int a() {
            return this.f12171b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f12170a == ((a) obj).f12170a;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isAlternateName", this.f12170a);
            return bundle;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12170a);
        }

        public final String toString() {
            return d72.a.j("ActionAlternateName(isAlternateName=", ")", this.f12170a);
        }

        public a() {
            this(false, 1, null);
        }

        public /* synthetic */ a(boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? true : z13);
        }
    }
}
