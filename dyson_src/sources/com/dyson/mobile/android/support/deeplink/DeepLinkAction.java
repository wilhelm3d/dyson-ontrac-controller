package com.dyson.mobile.android.support.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import x12.r;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/support/deeplink/DeepLinkAction;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenResolveContentUrl", "OpenErrorSupportScreen", "OpenAiChatBot", "Lcom/dyson/mobile/android/support/deeplink/DeepLinkAction$OpenAiChatBot;", "Lcom/dyson/mobile/android/support/deeplink/DeepLinkAction$OpenErrorSupportScreen;", "Lcom/dyson/mobile/android/support/deeplink/DeepLinkAction$OpenResolveContentUrl;", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DeepLinkAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/support/deeplink/DeepLinkAction$OpenErrorSupportScreen;", "Lcom/dyson/mobile/android/support/deeplink/DeepLinkAction;", "", "coordinatorId", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "faultCode", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;Ljava/lang/String;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenErrorSupportScreen extends DeepLinkAction {
        public static final Parcelable.Creator<OpenErrorSupportScreen> CREATOR = new a();
        public final String d;
        public final MachineDescriptor e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16815f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenErrorSupportScreen> {
            @Override // android.os.Parcelable.Creator
            public final OpenErrorSupportScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenErrorSupportScreen(parcel.readString(), (MachineDescriptor) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenErrorSupportScreen[] newArray(int i13) {
                return new OpenErrorSupportScreen[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenErrorSupportScreen(String str, MachineDescriptor machineDescriptor, String str2) {
            super(null);
            str.getClass();
            machineDescriptor.getClass();
            this.d = str;
            this.e = machineDescriptor;
            this.f16815f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenErrorSupportScreen) {
                OpenErrorSupportScreen openErrorSupportScreen = (OpenErrorSupportScreen) obj;
                return r.c(this.d, openErrorSupportScreen.d) && r.c(this.e, openErrorSupportScreen.e) && r.c(this.f16815f, openErrorSupportScreen.f16815f);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
            String str = this.f16815f;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenErrorSupportScreen(coordinatorId=");
            sb2.append(this.d);
            sb2.append(", machineDescriptor=");
            sb2.append(this.e);
            sb2.append(", faultCode=");
            return ie.a.h(sb2, this.f16815f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeSerializable(this.e);
            parcel.writeString(this.f16815f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/deeplink/DeepLinkAction$OpenResolveContentUrl;", "Lcom/dyson/mobile/android/support/deeplink/DeepLinkAction;", "", "url", "<init>", "(Ljava/lang/String;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenResolveContentUrl extends DeepLinkAction {
        public static final Parcelable.Creator<OpenResolveContentUrl> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenResolveContentUrl> {
            @Override // android.os.Parcelable.Creator
            public final OpenResolveContentUrl createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenResolveContentUrl(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenResolveContentUrl[] newArray(int i13) {
                return new OpenResolveContentUrl[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenResolveContentUrl(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenResolveContentUrl) && r.c(this.d, ((OpenResolveContentUrl) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OpenResolveContentUrl(url=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    public /* synthetic */ DeepLinkAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeepLinkAction() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/support/deeplink/DeepLinkAction$OpenAiChatBot;", "Lcom/dyson/mobile/android/support/deeplink/DeepLinkAction;", "", "machineSerial", "faultCode", "compatibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenAiChatBot extends DeepLinkAction {
        public static final Parcelable.Creator<OpenAiChatBot> CREATOR = new a();
        public final String d;
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16814f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenAiChatBot> {
            @Override // android.os.Parcelable.Creator
            public final OpenAiChatBot createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenAiChatBot(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenAiChatBot[] newArray(int i13) {
                return new OpenAiChatBot[i13];
            }
        }

        public /* synthetic */ OpenAiChatBot(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenAiChatBot) {
                OpenAiChatBot openAiChatBot = (OpenAiChatBot) obj;
                return r.c(this.d, openAiChatBot.d) && r.c(this.e, openAiChatBot.e) && r.c(this.f16814f, openAiChatBot.f16814f);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.d;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f16814f;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return ie.a.h(e.m("OpenAiChatBot(machineSerial=", this.d, ", faultCode=", this.e, ", compatibility="), this.f16814f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f16814f);
        }

        public OpenAiChatBot(String str, String str2, String str3) {
            super(null);
            this.d = str;
            this.e = str2;
            this.f16814f = str3;
        }

        public OpenAiChatBot() {
            this(null, null, null, 7, null);
        }
    }
}
