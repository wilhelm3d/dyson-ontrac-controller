package com.dyson.mobile.android.machine.response.expertcontent;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import b0.y1;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import x12.r;
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContent;", "Landroid/os/Parcelable;", "", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentCollection;", "content", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lh12/f0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContent", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpertContent implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExpertContent> CREATOR = new a();
    @SerializedName("content")
    private final List<ExpertContentCollection> content;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ExpertContent> {
        @Override // android.os.Parcelable.Creator
        public final ExpertContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(ExpertContentCollection.CREATOR, parcel, arrayList, i13, 1);
            }
            return new ExpertContent(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ExpertContent[] newArray(int i13) {
            return new ExpertContent[i13];
        }
    }

    public ExpertContent(List<ExpertContentCollection> list) {
        list.getClass();
        this.content = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpertContent copy$default(ExpertContent expertContent, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = expertContent.content;
        }
        return expertContent.copy(list);
    }

    public final List<ExpertContentCollection> component1() {
        return this.content;
    }

    public final ExpertContent copy(List<ExpertContentCollection> list) {
        list.getClass();
        return new ExpertContent(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExpertContent) && r.c(this.content, ((ExpertContent) obj).content);
    }

    public final List<ExpertContentCollection> getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        return y1.l("ExpertContent(content=", ")", this.content);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        Iterator n13 = d72.a.n(this.content, parcel);
        while (n13.hasNext()) {
            ((ExpertContentCollection) n13.next()).writeToParcel(parcel, i13);
        }
    }
}
