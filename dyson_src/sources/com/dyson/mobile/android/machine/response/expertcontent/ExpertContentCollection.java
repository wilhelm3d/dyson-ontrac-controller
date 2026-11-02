package com.dyson.mobile.android.machine.response.expertcontent;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.messages.inbox.b;
import h12.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ma.e;
import x12.r;
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJR\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b*\u0010\u0017J\u001a\u0010-\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010%R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b7\u0010\u001f¨\u00068"}, d2 = {"Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentCollection;", "Landroid/os/Parcelable;", "", "id", b.f21448j, "title", "Lcom/dyson/mobile/android/machine/response/expertcontent/CollectionPoster;", "poster", "", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentItem;", "items", "topic", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machine/response/expertcontent/CollectionPoster;Ljava/util/List;Ljava/lang/String;)V", "Lik0/a;", "expertContentCollectionCategory", "", "isCategory", "(Lik0/a;)Z", "getCategory", "()Lik0/a;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lh12/f0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/dyson/mobile/android/machine/response/expertcontent/CollectionPoster;", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machine/response/expertcontent/CollectionPoster;Ljava/util/List;Ljava/lang/String;)Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentCollection;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getType", "getTitle", "Lcom/dyson/mobile/android/machine/response/expertcontent/CollectionPoster;", "getPoster", "Ljava/util/List;", "getItems", "getTopic", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpertContentCollection implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExpertContentCollection> CREATOR = new a();
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f15301id;
    @SerializedName("items")
    private final List<ExpertContentItem> items;
    @SerializedName("poster")
    private final CollectionPoster poster;
    @SerializedName("title")
    private final String title;
    @SerializedName("topic")
    private final String topic;
    @SerializedName(b.f21448j)
    private final String type;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ExpertContentCollection> {
        @Override // android.os.Parcelable.Creator
        public final ExpertContentCollection createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            CollectionPoster createFromParcel = CollectionPoster.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(ExpertContentItem.CREATOR, parcel, arrayList, i13, 1);
            }
            return new ExpertContentCollection(readString, readString2, readString3, createFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExpertContentCollection[] newArray(int i13) {
            return new ExpertContentCollection[i13];
        }
    }

    public ExpertContentCollection(String str, String str2, String str3, CollectionPoster collectionPoster, List<ExpertContentItem> list, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        collectionPoster.getClass();
        list.getClass();
        str4.getClass();
        this.f15301id = str;
        this.type = str2;
        this.title = str3;
        this.poster = collectionPoster;
        this.items = list;
        this.topic = str4;
    }

    public static /* synthetic */ ExpertContentCollection copy$default(ExpertContentCollection expertContentCollection, String str, String str2, String str3, CollectionPoster collectionPoster, List list, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = expertContentCollection.f15301id;
        }
        if ((i13 & 2) != 0) {
            str2 = expertContentCollection.type;
        }
        if ((i13 & 4) != 0) {
            str3 = expertContentCollection.title;
        }
        if ((i13 & 8) != 0) {
            collectionPoster = expertContentCollection.poster;
        }
        List<ExpertContentItem> list2 = list;
        if ((i13 & 16) != 0) {
            list2 = expertContentCollection.items;
        }
        if ((i13 & 32) != 0) {
            str4 = expertContentCollection.topic;
        }
        List list3 = list2;
        String str5 = str4;
        return expertContentCollection.copy(str, str2, str3, collectionPoster, list3, str5);
    }

    public final String component1() {
        return this.f15301id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final CollectionPoster component4() {
        return this.poster;
    }

    public final List<ExpertContentItem> component5() {
        return this.items;
    }

    public final String component6() {
        return this.topic;
    }

    public final ExpertContentCollection copy(String str, String str2, String str3, CollectionPoster collectionPoster, List<ExpertContentItem> list, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        collectionPoster.getClass();
        list.getClass();
        str4.getClass();
        return new ExpertContentCollection(str, str2, str3, collectionPoster, list, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExpertContentCollection) {
            ExpertContentCollection expertContentCollection = (ExpertContentCollection) obj;
            return r.c(this.f15301id, expertContentCollection.f15301id) && r.c(this.type, expertContentCollection.type) && r.c(this.title, expertContentCollection.title) && r.c(this.poster, expertContentCollection.poster) && r.c(this.items, expertContentCollection.items) && r.c(this.topic, expertContentCollection.topic);
        }
        return false;
    }

    public final ik0.a getCategory() {
        Object obj;
        Iterator<E> it = ik0.a.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (isCategory((ik0.a) obj)) {
                break;
            }
        }
        return (ik0.a) obj;
    }

    public final String getId() {
        return this.f15301id;
    }

    public final List<ExpertContentItem> getItems() {
        return this.items;
    }

    public final CollectionPoster getPoster() {
        return this.poster;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.topic.hashCode() + tq1.a.h((this.poster.hashCode() + y.c(y.c(this.f15301id.hashCode() * 31, 31, this.type), 31, this.title)) * 31, 31, this.items);
    }

    public final boolean isCategory(ik0.a aVar) {
        aVar.getClass();
        return v32.y.r(this.f15301id, aVar.getValue(), false);
    }

    public String toString() {
        String str = this.f15301id;
        String str2 = this.type;
        String str3 = this.title;
        CollectionPoster collectionPoster = this.poster;
        List<ExpertContentItem> list = this.items;
        String str4 = this.topic;
        StringBuilder m13 = e.m("ExpertContentCollection(id=", str, ", type=", str2, ", title=");
        m13.append(str3);
        m13.append(", poster=");
        m13.append(collectionPoster);
        m13.append(", items=");
        m13.append(list);
        m13.append(", topic=");
        m13.append(str4);
        m13.append(")");
        return m13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.f15301id);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        this.poster.writeToParcel(parcel, i13);
        Iterator n13 = d72.a.n(this.items, parcel);
        while (n13.hasNext()) {
            ((ExpertContentItem) n13.next()).writeToParcel(parcel, i13);
        }
        parcel.writeString(this.topic);
    }
}
