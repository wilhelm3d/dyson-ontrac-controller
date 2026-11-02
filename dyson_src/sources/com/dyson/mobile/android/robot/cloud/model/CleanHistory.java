package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.utilities.gson.StrictTypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import h12.y;
import i12.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import x12.r;
import y9.w;
@JsonAdapter(StrictTypeAdapterFactory.class)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/CleanHistory;", "Landroid/os/Parcelable;", "", "Lcom/dyson/mobile/android/robot/cloud/model/CleanHistory$Entry;", "entries", "<init>", "(Ljava/util/List;)V", "()V", "d", "Ljava/util/List;", "i", "()Ljava/util/List;", "setEntries", "Entry", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CleanHistory implements Parcelable {
    public static final Parcelable.Creator<CleanHistory> CREATOR = new a();
    @SerializedName("Entries")
    private List<Entry> d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<CleanHistory> {
        @Override // android.os.Parcelable.Creator
        public final CleanHistory createFromParcel(Parcel parcel) {
            parcel.getClass();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(Entry.CREATOR, parcel, arrayList, i13, 1);
            }
            return new CleanHistory(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CleanHistory[] newArray(int i13) {
            return new CleanHistory[i13];
        }
    }

    public /* synthetic */ CleanHistory(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new ArrayList() : list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CleanHistory) && r.c(this.d, ((CleanHistory) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final List<Entry> i() {
        return this.d;
    }

    public final String toString() {
        return y1.l("CleanHistory(entries=", ")", this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        Iterator n13 = d72.a.n(this.d, parcel);
        while (n13.hasNext()) {
            ((Entry) n13.next()).writeToParcel(parcel, i13);
        }
    }

    public CleanHistory(List<Entry> list) {
        list.getClass();
        this.d = list;
    }

    public CleanHistory() {
        this(e0.d);
    }

    @JsonAdapter(StrictTypeAdapterFactory.class)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/CleanHistory$Entry;", "Landroid/os/Parcelable;", "", "clean", EventsNameKt.STARTED, "finished", "", "area", "", "charges", "Llu0/a;", com.salesforce.marketingcloud.messages.inbox.b.f21448j, "", "isInterim", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILlu0/a;Z)V", "()V", "d", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "setClean", "(Ljava/lang/String;)V", "e", "m", "setStarted", "f", "l", "setFinished", "g", "D", "i", "()D", "setArea", "(D)V", "h", "I", "j", "()I", "setCharges", "(I)V", "Llu0/a;", "n", "()Llu0/a;", "setType", "(Llu0/a;)V", "Z", TTMLParser.Tags.CAPTION, "()Z", "setInterim", "(Z)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Entry implements Parcelable {
        public static final Parcelable.Creator<Entry> CREATOR = new a();
        @SerializedName("Clean")
        private String d;
        @SerializedName("Started")
        private String e;
        @SerializedName("Finished")

        /* renamed from: f  reason: collision with root package name */
        private String f15924f;
        @SerializedName("Area")

        /* renamed from: g  reason: collision with root package name */
        private double f15925g;
        @SerializedName("Charges")

        /* renamed from: h  reason: collision with root package name */
        private int f15926h;
        @SerializedName("Type")

        /* renamed from: i  reason: collision with root package name */
        private lu0.a f15927i;
        @SerializedName(alternate = {"isInterim"}, value = "IsInterim")

        /* renamed from: j  reason: collision with root package name */
        private boolean f15928j;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<Entry> {
            @Override // android.os.Parcelable.Creator
            public final Entry createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Entry(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt(), lu0.a.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Entry[] newArray(int i13) {
                return new Entry[i13];
            }
        }

        public Entry(String str, String str2, String str3, double d, int i13, lu0.a aVar, boolean z13) {
            str.getClass();
            str2.getClass();
            aVar.getClass();
            this.d = str;
            this.e = str2;
            this.f15924f = str3;
            this.f15925g = d;
            this.f15926h = i13;
            this.f15927i = aVar;
            this.f15928j = z13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                return r.c(this.d, entry.d) && r.c(this.e, entry.e) && r.c(this.f15924f, entry.f15924f) && Double.compare(this.f15925g, entry.f15925g) == 0 && this.f15926h == entry.f15926h && this.f15927i == entry.f15927i && this.f15928j == entry.f15928j;
            }
            return false;
        }

        public final int hashCode() {
            int c13 = y.c(this.d.hashCode() * 31, 31, this.e);
            String str = this.f15924f;
            return Boolean.hashCode(this.f15928j) + ((this.f15927i.hashCode() + w.b(this.f15926h, o1.a.a((c13 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15925g), 31)) * 31);
        }

        public final double i() {
            return this.f15925g;
        }

        public final int j() {
            return this.f15926h;
        }

        public final String k() {
            return this.d;
        }

        public final String l() {
            return this.f15924f;
        }

        public final String m() {
            return this.e;
        }

        public final lu0.a n() {
            return this.f15927i;
        }

        public final boolean p() {
            return this.f15928j;
        }

        public final String toString() {
            String str = this.d;
            String str2 = this.e;
            String str3 = this.f15924f;
            double d = this.f15925g;
            int i13 = this.f15926h;
            lu0.a aVar = this.f15927i;
            boolean z13 = this.f15928j;
            StringBuilder m13 = e.m("Entry(clean=", str, ", started=", str2, ", finished=");
            m13.append(str3);
            m13.append(", area=");
            m13.append(d);
            m13.append(", charges=");
            m13.append(i13);
            m13.append(", type=");
            m13.append(aVar);
            m13.append(", isInterim=");
            m13.append(z13);
            m13.append(")");
            return m13.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f15924f);
            parcel.writeDouble(this.f15925g);
            parcel.writeInt(this.f15926h);
            parcel.writeString(this.f15927i.name());
            parcel.writeInt(this.f15928j ? 1 : 0);
        }

        public Entry() {
            this("", "", "", 0.0d, 0, lu0.a.MANUAL, false);
        }
    }
}
