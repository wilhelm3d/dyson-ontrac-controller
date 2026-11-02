package com.dyson.mobile.android.machine.response.sectioncontent;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/machine/response/sectioncontent/Tab;", "Landroid/os/Parcelable;", "", "id", "", "sectionIds", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "d", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "e", "Ljava/util/List;", "j", "()Ljava/util/List;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Tab implements Parcelable {
    public static final Parcelable.Creator<Tab> CREATOR = new a();
    @SerializedName("id")
    private final String d;
    @SerializedName("sections")
    private final List<String> e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Tab> {
        @Override // android.os.Parcelable.Creator
        public final Tab createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Tab(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Tab[] newArray(int i13) {
            return new Tab[i13];
        }
    }

    public Tab(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.d = str;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tab) {
            Tab tab = (Tab) obj;
            return r.c(this.d, tab.d) && r.c(this.e, tab.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String i() {
        return this.d;
    }

    public final List<String> j() {
        return this.e;
    }

    public final String toString() {
        return y1.k("Tab(id=", this.d, ", sectionIds=", ")", this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeStringList(this.e);
    }
}
