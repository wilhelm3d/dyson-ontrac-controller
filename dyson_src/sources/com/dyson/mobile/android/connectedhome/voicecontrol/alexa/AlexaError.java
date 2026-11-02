package com.dyson.mobile.android.connectedhome.voicecontrol.alexa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.paypal.android.platform.authsdk.authcommon.AuthAnalyticsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv1.s;
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;", "Landroid/os/Parcelable;", "stage", "", "<init>", "(Ljava/lang/String;)V", "getStage", "()Ljava/lang/String;", "error", "getError", "description", "getDescription", "analyticsParameter", "getAnalyticsParameter", "InitiateError", "AuthorizeError", "LinkError", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError$AuthorizeError;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError$InitiateError;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError$LinkError;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AlexaError implements Parcelable {
    public static final int $stable = 0;
    private final String stage;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError$AuthorizeError;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;", "", "error", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class AuthorizeError extends AlexaError {
        public static final Parcelable.Creator<AuthorizeError> CREATOR = new a();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<AuthorizeError> {
            @Override // android.os.Parcelable.Creator
            public final AuthorizeError createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new AuthorizeError(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AuthorizeError[] newArray(int i13) {
                return new AuthorizeError[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthorizeError(String str, String str2) {
            super("authorize", null);
            str.getClass();
            str2.getClass();
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError
        public final String getDescription() {
            return this.e;
        }

        @Override // com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError
        public final String getError() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError$InitiateError;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;", "", "error", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class InitiateError extends AlexaError {
        public static final Parcelable.Creator<InitiateError> CREATOR = new a();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<InitiateError> {
            @Override // android.os.Parcelable.Creator
            public final InitiateError createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InitiateError(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InitiateError[] newArray(int i13) {
                return new InitiateError[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiateError(String str, String str2) {
            super("initiate", null);
            str.getClass();
            str2.getClass();
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError
        public final String getDescription() {
            return this.e;
        }

        @Override // com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError
        public final String getError() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError$LinkError;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;", "", "error", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class LinkError extends AlexaError {
        public static final Parcelable.Creator<LinkError> CREATOR = new a();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<LinkError> {
            @Override // android.os.Parcelable.Creator
            public final LinkError createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LinkError(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LinkError[] newArray(int i13) {
                return new LinkError[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkError(String str, String str2) {
            super(AuthAnalyticsConstants.LINK_KEY, null);
            str.getClass();
            str2.getClass();
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError
        public final String getDescription() {
            return this.e;
        }

        @Override // com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError
        public final String getError() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    private AlexaError(String str) {
        this.stage = str;
    }

    public final String getAnalyticsParameter() {
        return s.i(this.stage, ":", getError());
    }

    public abstract String getDescription();

    public abstract String getError();

    public final String getStage() {
        return this.stage;
    }

    public /* synthetic */ AlexaError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
