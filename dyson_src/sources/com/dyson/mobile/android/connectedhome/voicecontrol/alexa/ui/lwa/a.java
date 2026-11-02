package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa;

import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/a;", "", "<init>", "()V", "a", "b", "c", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f13145a = new c(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/a$a;", "Ly9/m0;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;", "alexaAuthArgs", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0392a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final AlexaAuthResult.AlexaAuthArgs f13146a;

        public C0392a(AlexaAuthResult.AlexaAuthArgs alexaAuthArgs) {
            alexaAuthArgs.getClass();
            this.f13146a = alexaAuthArgs;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.actionLink;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0392a) && this.f13146a == ((C0392a) obj).f13146a;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(AlexaAuthResult.AlexaAuthArgs.class);
            AlexaAuthResult.AlexaAuthArgs alexaAuthArgs = this.f13146a;
            if (isAssignableFrom) {
                bundle.putParcelable("alexaAuthArgs", alexaAuthArgs);
                return bundle;
            } else if (Serializable.class.isAssignableFrom(AlexaAuthResult.AlexaAuthArgs.class)) {
                bundle.putSerializable("alexaAuthArgs", (Serializable) alexaAuthArgs);
                return bundle;
            } else {
                ie.a.t(AlexaAuthResult.AlexaAuthArgs.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
        }

        public final int hashCode() {
            return this.f13146a.hashCode();
        }

        public final String toString() {
            return "ActionLink(alexaAuthArgs=" + this.f13146a + ")";
        }
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/a$c;", "", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/a$b;", "Ly9/m0;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;", "alexaError", "", "isLegacyUnlinkFailure", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;Z)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final AlexaError f13147a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13148b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13149c;

        public b(AlexaError alexaError, boolean z13) {
            alexaError.getClass();
            this.f13147a = alexaError;
            this.f13148b = z13;
            this.f13149c = R.id.actionLinkWithLwaFailed;
        }

        @Override // y9.m0
        public final int a() {
            return this.f13149c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return r.c(this.f13147a, bVar.f13147a) && this.f13148b == bVar.f13148b;
            }
            return false;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(AlexaError.class);
            AlexaError alexaError = this.f13147a;
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
            bundle.putBoolean("isLegacyUnlinkFailure", this.f13148b);
            return bundle;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13148b) + (this.f13147a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionLinkWithLwaFailed(alexaError=" + this.f13147a + ", isLegacyUnlinkFailure=" + this.f13148b + ")";
        }

        public /* synthetic */ b(AlexaError alexaError, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(alexaError, (i13 & 2) != 0 ? false : z13);
        }
    }
}
