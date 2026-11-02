package com.dyson.mobile.android.machine.response.expertcontent;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import b0.g;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.messages.inbox.b;
import h12.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ma.e;
import q62.n;
import x12.r;
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006,"}, d2 = {"Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", "Landroid/os/Parcelable;", "", "id", b.f21448j, "title", "launchText", "", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideo;", "videos", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lh12/f0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getType", "getTitle", "getLaunchText", "Ljava/util/List;", "getVideos", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpertContentVideoPlaylist implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExpertContentVideoPlaylist> CREATOR = new a();
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f15306id;
    @SerializedName("launchText")
    private final String launchText;
    @SerializedName("title")
    private final String title;
    @SerializedName(b.f21448j)
    private final String type;
    @SerializedName("videos")
    private final List<ExpertContentVideo> videos;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ExpertContentVideoPlaylist> {
        @Override // android.os.Parcelable.Creator
        public final ExpertContentVideoPlaylist createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(ExpertContentVideo.CREATOR, parcel, arrayList, i13, 1);
            }
            return new ExpertContentVideoPlaylist(readString, readString2, readString3, readString4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ExpertContentVideoPlaylist[] newArray(int i13) {
            return new ExpertContentVideoPlaylist[i13];
        }
    }

    public ExpertContentVideoPlaylist(String str, String str2, String str3, String str4, List<ExpertContentVideo> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.f15306id = str;
        this.type = str2;
        this.title = str3;
        this.launchText = str4;
        this.videos = list;
    }

    public static /* synthetic */ ExpertContentVideoPlaylist copy$default(ExpertContentVideoPlaylist expertContentVideoPlaylist, String str, String str2, String str3, String str4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = expertContentVideoPlaylist.f15306id;
        }
        if ((i13 & 2) != 0) {
            str2 = expertContentVideoPlaylist.type;
        }
        if ((i13 & 4) != 0) {
            str3 = expertContentVideoPlaylist.title;
        }
        if ((i13 & 8) != 0) {
            str4 = expertContentVideoPlaylist.launchText;
        }
        List<ExpertContentVideo> list2 = list;
        if ((i13 & 16) != 0) {
            list2 = expertContentVideoPlaylist.videos;
        }
        List list3 = list2;
        String str5 = str3;
        return expertContentVideoPlaylist.copy(str, str2, str5, str4, list3);
    }

    public final String component1() {
        return this.f15306id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.launchText;
    }

    public final List<ExpertContentVideo> component5() {
        return this.videos;
    }

    public final ExpertContentVideoPlaylist copy(String str, String str2, String str3, String str4, List<ExpertContentVideo> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        return new ExpertContentVideoPlaylist(str, str2, str3, str4, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExpertContentVideoPlaylist) {
            ExpertContentVideoPlaylist expertContentVideoPlaylist = (ExpertContentVideoPlaylist) obj;
            return r.c(this.f15306id, expertContentVideoPlaylist.f15306id) && r.c(this.type, expertContentVideoPlaylist.type) && r.c(this.title, expertContentVideoPlaylist.title) && r.c(this.launchText, expertContentVideoPlaylist.launchText) && r.c(this.videos, expertContentVideoPlaylist.videos);
        }
        return false;
    }

    public final String getId() {
        return this.f15306id;
    }

    public final String getLaunchText() {
        return this.launchText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final List<ExpertContentVideo> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return this.videos.hashCode() + y.c(y.c(y.c(this.f15306id.hashCode() * 31, 31, this.type), 31, this.title), 31, this.launchText);
    }

    public String toString() {
        String str = this.f15306id;
        String str2 = this.type;
        String str3 = this.title;
        String str4 = this.launchText;
        List<ExpertContentVideo> list = this.videos;
        StringBuilder m13 = e.m("ExpertContentVideoPlaylist(id=", str, ", type=", str2, ", title=");
        n.o(m13, str3, ", launchText=", str4, ", videos=");
        return g.k(m13, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.f15306id);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.launchText);
        Iterator n13 = d72.a.n(this.videos, parcel);
        while (n13.hasNext()) {
            ((ExpertContentVideo) n13.next()).writeToParcel(parcel, i13);
        }
    }
}
