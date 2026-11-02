package com.dyson.mobile.android.machine.response.expertcontent;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.brightcove.player.event.AbstractEvent;
import com.brightcove.player.model.Video;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.messages.inbox.b;
import h12.y;
import java.util.List;
import kotlin.Metadata;
import ma.e;
import x12.r;
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0080\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u0010\u00100\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b0\u0010\u0016J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010&R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010(\"\u0004\bB\u0010CR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\bF\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bG\u0010\u001e¨\u0006H"}, d2 = {"Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentItem;", "Landroid/os/Parcelable;", "", "id", b.f21448j, "title", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentThumbnail;", Video.Fields.THUMBNAIL, "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentPoster;", "poster", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideo;", "video", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", AbstractEvent.PLAYLIST, "", "tags", "ctaTitle", "ctaLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentThumbnail;Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentPoster;Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideo;Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lh12/f0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentThumbnail;", "component5", "()Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentPoster;", "component6", "()Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideo;", "component7", "()Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", "component8", "()Ljava/util/List;", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentThumbnail;Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentPoster;Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideo;Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getType", "getTitle", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentThumbnail;", "getThumbnail", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentPoster;", "getPoster", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideo;", "getVideo", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", "getPlaylist", "setPlaylist", "(Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;)V", "Ljava/util/List;", "getTags", "getCtaTitle", "getCtaLink", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpertContentItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExpertContentItem> CREATOR = new a();
    @SerializedName("ctaLink")
    private final String ctaLink;
    @SerializedName("ctaTitle")
    private final String ctaTitle;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f15302id;
    @SerializedName(AbstractEvent.PLAYLIST)
    private ExpertContentVideoPlaylist playlist;
    @SerializedName("poster")
    private final ExpertContentPoster poster;
    @SerializedName("tags")
    private final List<String> tags;
    @SerializedName(Video.Fields.THUMBNAIL)
    private final ExpertContentThumbnail thumbnail;
    @SerializedName("title")
    private final String title;
    @SerializedName(b.f21448j)
    private final String type;
    @SerializedName("video")
    private final ExpertContentVideo video;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ExpertContentItem> {
        @Override // android.os.Parcelable.Creator
        public final ExpertContentItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ExpertContentItem(parcel.readString(), parcel.readString(), parcel.readString(), ExpertContentThumbnail.CREATOR.createFromParcel(parcel), ExpertContentPoster.CREATOR.createFromParcel(parcel), ExpertContentVideo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ExpertContentVideoPlaylist.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExpertContentItem[] newArray(int i13) {
            return new ExpertContentItem[i13];
        }
    }

    public ExpertContentItem(String str, String str2, String str3, ExpertContentThumbnail expertContentThumbnail, ExpertContentPoster expertContentPoster, ExpertContentVideo expertContentVideo, ExpertContentVideoPlaylist expertContentVideoPlaylist, List<String> list, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        expertContentThumbnail.getClass();
        expertContentPoster.getClass();
        expertContentVideo.getClass();
        list.getClass();
        this.f15302id = str;
        this.type = str2;
        this.title = str3;
        this.thumbnail = expertContentThumbnail;
        this.poster = expertContentPoster;
        this.video = expertContentVideo;
        this.playlist = expertContentVideoPlaylist;
        this.tags = list;
        this.ctaTitle = str4;
        this.ctaLink = str5;
    }

    public static /* synthetic */ ExpertContentItem copy$default(ExpertContentItem expertContentItem, String str, String str2, String str3, ExpertContentThumbnail expertContentThumbnail, ExpertContentPoster expertContentPoster, ExpertContentVideo expertContentVideo, ExpertContentVideoPlaylist expertContentVideoPlaylist, List list, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = expertContentItem.f15302id;
        }
        if ((i13 & 2) != 0) {
            str2 = expertContentItem.type;
        }
        if ((i13 & 4) != 0) {
            str3 = expertContentItem.title;
        }
        if ((i13 & 8) != 0) {
            expertContentThumbnail = expertContentItem.thumbnail;
        }
        if ((i13 & 16) != 0) {
            expertContentPoster = expertContentItem.poster;
        }
        if ((i13 & 32) != 0) {
            expertContentVideo = expertContentItem.video;
        }
        if ((i13 & 64) != 0) {
            expertContentVideoPlaylist = expertContentItem.playlist;
        }
        List<String> list2 = list;
        if ((i13 & 128) != 0) {
            list2 = expertContentItem.tags;
        }
        if ((i13 & 256) != 0) {
            str4 = expertContentItem.ctaTitle;
        }
        if ((i13 & 512) != 0) {
            str5 = expertContentItem.ctaLink;
        }
        String str6 = str4;
        String str7 = str5;
        ExpertContentVideoPlaylist expertContentVideoPlaylist2 = expertContentVideoPlaylist;
        List list3 = list2;
        ExpertContentPoster expertContentPoster2 = expertContentPoster;
        ExpertContentVideo expertContentVideo2 = expertContentVideo;
        return expertContentItem.copy(str, str2, str3, expertContentThumbnail, expertContentPoster2, expertContentVideo2, expertContentVideoPlaylist2, list3, str6, str7);
    }

    public final String component1() {
        return this.f15302id;
    }

    public final String component10() {
        return this.ctaLink;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final ExpertContentThumbnail component4() {
        return this.thumbnail;
    }

    public final ExpertContentPoster component5() {
        return this.poster;
    }

    public final ExpertContentVideo component6() {
        return this.video;
    }

    public final ExpertContentVideoPlaylist component7() {
        return this.playlist;
    }

    public final List<String> component8() {
        return this.tags;
    }

    public final String component9() {
        return this.ctaTitle;
    }

    public final ExpertContentItem copy(String str, String str2, String str3, ExpertContentThumbnail expertContentThumbnail, ExpertContentPoster expertContentPoster, ExpertContentVideo expertContentVideo, ExpertContentVideoPlaylist expertContentVideoPlaylist, List<String> list, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        expertContentThumbnail.getClass();
        expertContentPoster.getClass();
        expertContentVideo.getClass();
        list.getClass();
        return new ExpertContentItem(str, str2, str3, expertContentThumbnail, expertContentPoster, expertContentVideo, expertContentVideoPlaylist, list, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExpertContentItem) {
            ExpertContentItem expertContentItem = (ExpertContentItem) obj;
            return r.c(this.f15302id, expertContentItem.f15302id) && r.c(this.type, expertContentItem.type) && r.c(this.title, expertContentItem.title) && r.c(this.thumbnail, expertContentItem.thumbnail) && r.c(this.poster, expertContentItem.poster) && r.c(this.video, expertContentItem.video) && r.c(this.playlist, expertContentItem.playlist) && r.c(this.tags, expertContentItem.tags) && r.c(this.ctaTitle, expertContentItem.ctaTitle) && r.c(this.ctaLink, expertContentItem.ctaLink);
        }
        return false;
    }

    public final String getCtaLink() {
        return this.ctaLink;
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final String getId() {
        return this.f15302id;
    }

    public final ExpertContentVideoPlaylist getPlaylist() {
        return this.playlist;
    }

    public final ExpertContentPoster getPoster() {
        return this.poster;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final ExpertContentThumbnail getThumbnail() {
        return this.thumbnail;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final ExpertContentVideo getVideo() {
        return this.video;
    }

    public int hashCode() {
        int c13 = y.c(y.c(this.f15302id.hashCode() * 31, 31, this.type), 31, this.title);
        int hashCode = (this.video.hashCode() + ((this.poster.hashCode() + ((this.thumbnail.hashCode() + c13) * 31)) * 31)) * 31;
        ExpertContentVideoPlaylist expertContentVideoPlaylist = this.playlist;
        int h13 = tq1.a.h((hashCode + (expertContentVideoPlaylist == null ? 0 : expertContentVideoPlaylist.hashCode())) * 31, 31, this.tags);
        String str = this.ctaTitle;
        int hashCode2 = (h13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ctaLink;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPlaylist(ExpertContentVideoPlaylist expertContentVideoPlaylist) {
        this.playlist = expertContentVideoPlaylist;
    }

    public String toString() {
        String str = this.f15302id;
        String str2 = this.type;
        String str3 = this.title;
        ExpertContentThumbnail expertContentThumbnail = this.thumbnail;
        ExpertContentPoster expertContentPoster = this.poster;
        ExpertContentVideo expertContentVideo = this.video;
        ExpertContentVideoPlaylist expertContentVideoPlaylist = this.playlist;
        List<String> list = this.tags;
        String str4 = this.ctaTitle;
        String str5 = this.ctaLink;
        StringBuilder m13 = e.m("ExpertContentItem(id=", str, ", type=", str2, ", title=");
        m13.append(str3);
        m13.append(", thumbnail=");
        m13.append(expertContentThumbnail);
        m13.append(", poster=");
        m13.append(expertContentPoster);
        m13.append(", video=");
        m13.append(expertContentVideo);
        m13.append(", playlist=");
        m13.append(expertContentVideoPlaylist);
        m13.append(", tags=");
        m13.append(list);
        m13.append(", ctaTitle=");
        return jy1.a.f(m13, str4, ", ctaLink=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.f15302id);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        this.thumbnail.writeToParcel(parcel, i13);
        this.poster.writeToParcel(parcel, i13);
        this.video.writeToParcel(parcel, i13);
        ExpertContentVideoPlaylist expertContentVideoPlaylist = this.playlist;
        if (expertContentVideoPlaylist == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            expertContentVideoPlaylist.writeToParcel(parcel, i13);
        }
        parcel.writeStringList(this.tags);
        parcel.writeString(this.ctaTitle);
        parcel.writeString(this.ctaLink);
    }
}
