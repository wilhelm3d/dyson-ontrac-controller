package com.dyson.mobile.android.account.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.g;
import w42.d;
import x12.r;
import x42.a2;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"com/dyson/mobile/android/account/navigation/destination/ExistingUserDestination$ForgotPasswordDestination", "", "", "email", "", "passwordSent", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLx42/w1;)V", "Companion", "a", "b", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes2.dex */
public final class ExistingUserDestination$ForgotPasswordDestination implements UserLoginDestination {
    public final String d;
    public final boolean e;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<ExistingUserDestination$ForgotPasswordDestination> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/account/navigation/destination/ExistingUserDestination.ForgotPasswordDestination.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/account/navigation/destination/ExistingUserDestination$ForgotPasswordDestination;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a implements e0<ExistingUserDestination$ForgotPasswordDestination> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12283a;
        private static final v42.e descriptor;

        static {
            a aVar = new a();
            f12283a = aVar;
            o1 o1Var = new o1("com.dyson.mobile.android.account.navigation.destination.ExistingUserDestination.ForgotPasswordDestination", aVar, 2);
            o1Var.i("email", false);
            o1Var.i("passwordSent", false);
            descriptor = o1Var;
        }

        private a() {
        }

        @Override // t42.h, t42.a
        public final v42.e a() {
            return descriptor;
        }

        @Override // t42.a
        public final Object b(w42.e eVar) {
            v42.e eVar2 = descriptor;
            w42.c c13 = eVar.c(eVar2);
            boolean z13 = true;
            int i13 = 0;
            boolean z14 = false;
            String str = null;
            while (z13) {
                int w13 = c13.w(eVar2);
                if (w13 == -1) {
                    z13 = false;
                } else if (w13 == 0) {
                    str = c13.g(eVar2, 0);
                    i13 |= 1;
                } else if (w13 != 1) {
                    jy1.a.q(w13);
                    return null;
                } else {
                    z14 = c13.v(eVar2, 1);
                    i13 |= 2;
                }
            }
            c13.a(eVar2);
            return new ExistingUserDestination$ForgotPasswordDestination(i13, str, z14, null);
        }

        @Override // x42.e0
        public final t42.b<?>[] c() {
            return new t42.b[]{a2.f86824a, x42.g.f86854a};
        }

        @Override // t42.h
        public final void d(w42.b bVar, Object obj) {
            ExistingUserDestination$ForgotPasswordDestination existingUserDestination$ForgotPasswordDestination = (ExistingUserDestination$ForgotPasswordDestination) obj;
            existingUserDestination$ForgotPasswordDestination.getClass();
            v42.e eVar = descriptor;
            d c13 = bVar.c(eVar);
            c13.l(eVar, 0, existingUserDestination$ForgotPasswordDestination.d);
            c13.n(eVar, 1, existingUserDestination$ForgotPasswordDestination.e);
            c13.a(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements Parcelable.Creator<ExistingUserDestination$ForgotPasswordDestination> {
        @Override // android.os.Parcelable.Creator
        public final ExistingUserDestination$ForgotPasswordDestination createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ExistingUserDestination$ForgotPasswordDestination(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExistingUserDestination$ForgotPasswordDestination[] newArray(int i13) {
            return new ExistingUserDestination$ForgotPasswordDestination[i13];
        }
    }

    public /* synthetic */ ExistingUserDestination$ForgotPasswordDestination(int i13, String str, boolean z13, w1 w1Var) {
        if (3 != (i13 & 3)) {
            l1.g(i13, 3, a.f12283a.a());
            throw null;
        }
        this.d = str;
        this.e = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExistingUserDestination$ForgotPasswordDestination) {
            ExistingUserDestination$ForgotPasswordDestination existingUserDestination$ForgotPasswordDestination = (ExistingUserDestination$ForgotPasswordDestination) obj;
            return r.c(this.d, existingUserDestination$ForgotPasswordDestination.d) && this.e == existingUserDestination$ForgotPasswordDestination.e;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return o1.a.e("ForgotPasswordDestination(email=", this.d, ", passwordSent=", this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/account/navigation/destination/ExistingUserDestination$ForgotPasswordDestination$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/account/navigation/destination/ExistingUserDestination$ForgotPasswordDestination;", "serializer", "()Lt42/b;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t42.b<ExistingUserDestination$ForgotPasswordDestination> serializer() {
            return a.f12283a;
        }

        private b() {
        }
    }

    public ExistingUserDestination$ForgotPasswordDestination(String str, boolean z13) {
        str.getClass();
        this.d = str;
        this.e = z13;
    }
}
