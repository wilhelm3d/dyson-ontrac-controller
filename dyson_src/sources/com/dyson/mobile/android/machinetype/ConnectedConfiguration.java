package com.dyson.mobile.android.machinetype;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.event.EventType;
import h12.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import q62.n;
import v80.c;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/machinetype/ConnectedConfiguration;", "Landroid/os/Parcelable;", "", "connectionType", "localCredentials", "mqttRootTopicLevel", EventType.VERSION, "", "isAutoUpdateEnabled", "isUpdateAvailable", "", "capabilities", "minAppVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;)V", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectedConfiguration implements Parcelable {
    public static final Parcelable.Creator<ConnectedConfiguration> CREATOR = new a();
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15552f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15553g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f15554h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f15555i;

    /* renamed from: j  reason: collision with root package name */
    public final List<String> f15556j;

    /* renamed from: k  reason: collision with root package name */
    public final String f15557k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ConnectedConfiguration> {
        @Override // android.os.Parcelable.Creator
        public final ConnectedConfiguration createFromParcel(Parcel parcel) {
            boolean z13;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z14 = false;
            if (parcel.readInt() != 0) {
                z13 = false;
                z14 = true;
            } else {
                z13 = false;
            }
            return new ConnectedConfiguration(readString, readString2, readString3, readString4, z14, parcel.readInt() == 0 ? z13 : true, parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConnectedConfiguration[] newArray(int i13) {
            return new ConnectedConfiguration[i13];
        }
    }

    public ConnectedConfiguration(String str, String str2, String str3, String str4, boolean z13, boolean z14, List<String> list, String str5) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.d = str;
        this.e = str2;
        this.f15552f = str3;
        this.f15553g = str4;
        this.f15554h = z13;
        this.f15555i = z14;
        this.f15556j = list;
        this.f15557k = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectedConfiguration) {
            ConnectedConfiguration connectedConfiguration = (ConnectedConfiguration) obj;
            return r.c(this.d, connectedConfiguration.d) && r.c(this.e, connectedConfiguration.e) && r.c(this.f15552f, connectedConfiguration.f15552f) && r.c(this.f15553g, connectedConfiguration.f15553g) && this.f15554h == connectedConfiguration.f15554h && this.f15555i == connectedConfiguration.f15555i && r.c(this.f15556j, connectedConfiguration.f15556j) && r.c(this.f15557k, connectedConfiguration.f15557k);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        String str = this.e;
        int h13 = tq1.a.h(w.c(w.c(y.c(y.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15552f), 31, this.f15553g), 31, this.f15554h), 31, this.f15555i), 31, this.f15556j);
        String str2 = this.f15557k;
        return h13 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m13 = e.m("ConnectedConfiguration(connectionType=", this.d, ", localCredentials=", this.e, ", mqttRootTopicLevel=");
        n.o(m13, this.f15552f, ", version=", this.f15553g, ", isAutoUpdateEnabled=");
        c.m(m13, this.f15554h, ", isUpdateAvailable=", this.f15555i, ", capabilities=");
        m13.append(this.f15556j);
        m13.append(", minAppVersion=");
        m13.append(this.f15557k);
        m13.append(")");
        return m13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f15552f);
        parcel.writeString(this.f15553g);
        parcel.writeInt(this.f15554h ? 1 : 0);
        parcel.writeInt(this.f15555i ? 1 : 0);
        parcel.writeStringList(this.f15556j);
        parcel.writeString(this.f15557k);
    }

    public /* synthetic */ ConnectedConfiguration(String str, String str2, String str3, String str4, boolean z13, boolean z14, List list, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z13, z14, list, (i13 & 128) != 0 ? null : str5);
    }
}
