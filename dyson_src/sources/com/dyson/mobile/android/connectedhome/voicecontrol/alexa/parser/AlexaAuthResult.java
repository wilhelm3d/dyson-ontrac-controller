package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.paypal.pyplcheckout.ui.feature.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult;", "", "<init>", "()V", "AlexaAuthArgs", "a", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$a;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AlexaAuthResult {
    public static final int $stable = 0;

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult;", "Landroid/os/Parcelable;", "", PayPalNewShippingAddressReviewViewKt.STATE, "code", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lh12/f0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "getCode", "getRedirectUri", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class AlexaAuthArgs extends AlexaAuthResult implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AlexaAuthArgs> CREATOR = new a();
        private final String code;
        private final String redirectUri;
        private final String state;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<AlexaAuthArgs> {
            @Override // android.os.Parcelable.Creator
            public final AlexaAuthArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new AlexaAuthArgs(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AlexaAuthArgs[] newArray(int i13) {
                return new AlexaAuthArgs[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlexaAuthArgs(String str, String str2, String str3) {
            super(null);
            d72.a.v(str, str2, str3);
            this.state = str;
            this.code = str2;
            this.redirectUri = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getRedirectUri() {
            return this.redirectUri;
        }

        public final String getState() {
            return this.state;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.state);
            parcel.writeString(this.code);
            parcel.writeString(this.redirectUri);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult;", "", "error", "errorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends AlexaAuthResult {
        public final String d;
        public final String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.d = str;
            this.e = str2;
        }
    }

    public /* synthetic */ AlexaAuthResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AlexaAuthResult() {
    }
}
