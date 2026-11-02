package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/landingscreen/a;", "", "<init>", "()V", "b", "a", "c", "d", "e", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f13071a = new e(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/landingscreen/a$b;", "Ly9/m0;", "Landroid/net/Uri;", "lwaUri", "<init>", "(Landroid/net/Uri;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f13075a;

        public b(Uri uri) {
            uri.getClass();
            this.f13075a = uri;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.actionLinkWithLwa;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f13075a.equals(((b) obj).f13075a);
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Uri.class);
            Uri uri = this.f13075a;
            if (isAssignableFrom) {
                bundle.putParcelable("lwaUri", uri);
                return bundle;
            } else if (Serializable.class.isAssignableFrom(Uri.class)) {
                bundle.putSerializable("lwaUri", (Serializable) uri);
                return bundle;
            } else {
                ie.a.t(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
        }

        public final int hashCode() {
            return this.f13075a.hashCode();
        }

        public final String toString() {
            return "ActionLinkWithLwa(lwaUri=" + this.f13075a + ")";
        }
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/landingscreen/a$e;", "", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/landingscreen/a$d;", "Ly9/m0;", "", "isLegacyUnlinkSuccess", "<init>", "(Z)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13079a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13080b;

        public d(boolean z13) {
            this.f13079a = z13;
            this.f13080b = R.id.actionUnlinkSuccess;
        }

        @Override // y9.m0
        public final int a() {
            return this.f13080b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f13079a == ((d) obj).f13079a;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isLegacyUnlinkSuccess", this.f13079a);
            return bundle;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13079a);
        }

        public final String toString() {
            return d72.a.j("ActionUnlinkSuccess(isLegacyUnlinkSuccess=", ")", this.f13079a);
        }

        public d() {
            this(false, 1, null);
        }

        public /* synthetic */ d(boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z13);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/landingscreen/a$a;", "Ly9/m0;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;", "alexaError", "", "isLegacyUnlinkFailure", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;Z)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0387a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final AlexaError f13072a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13073b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13074c;

        public C0387a(AlexaError alexaError, boolean z13) {
            alexaError.getClass();
            this.f13072a = alexaError;
            this.f13073b = z13;
            this.f13074c = R.id.actionInitiateFailed;
        }

        @Override // y9.m0
        public final int a() {
            return this.f13074c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0387a) {
                C0387a c0387a = (C0387a) obj;
                return r.c(this.f13072a, c0387a.f13072a) && this.f13073b == c0387a.f13073b;
            }
            return false;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(AlexaError.class);
            AlexaError alexaError = this.f13072a;
            if (isAssignableFrom) {
                alexaError.getClass();
                bundle.putParcelable("alexaError", alexaError);
            } else if (!Serializable.class.isAssignableFrom(AlexaError.class)) {
                ie.a.t(AlexaError.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            } else {
                alexaError.getClass();
                bundle.putSerializable("alexaError", (Serializable) alexaError);
            }
            bundle.putBoolean("isLegacyUnlinkFailure", this.f13073b);
            return bundle;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13073b) + (this.f13072a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionInitiateFailed(alexaError=" + this.f13072a + ", isLegacyUnlinkFailure=" + this.f13073b + ")";
        }

        public /* synthetic */ C0387a(AlexaError alexaError, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(alexaError, (i13 & 2) != 0 ? false : z13);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/landingscreen/a$c;", "Ly9/m0;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;", "alexaError", "", "isLegacyUnlinkFailure", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;Z)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final AlexaError f13076a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13077b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13078c;

        public c(AlexaError alexaError, boolean z13) {
            alexaError.getClass();
            this.f13076a = alexaError;
            this.f13077b = z13;
            this.f13078c = R.id.actionUnlinkFailed;
        }

        @Override // y9.m0
        public final int a() {
            return this.f13078c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return r.c(this.f13076a, cVar.f13076a) && this.f13077b == cVar.f13077b;
            }
            return false;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(AlexaError.class);
            AlexaError alexaError = this.f13076a;
            if (isAssignableFrom) {
                alexaError.getClass();
                bundle.putParcelable("alexaError", alexaError);
            } else if (!Serializable.class.isAssignableFrom(AlexaError.class)) {
                ie.a.t(AlexaError.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            } else {
                alexaError.getClass();
                bundle.putSerializable("alexaError", (Serializable) alexaError);
            }
            bundle.putBoolean("isLegacyUnlinkFailure", this.f13077b);
            return bundle;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13077b) + (this.f13076a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionUnlinkFailed(alexaError=" + this.f13076a + ", isLegacyUnlinkFailure=" + this.f13077b + ")";
        }

        public /* synthetic */ c(AlexaError alexaError, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(alexaError, (i13 & 2) != 0 ? false : z13);
        }
    }
}
