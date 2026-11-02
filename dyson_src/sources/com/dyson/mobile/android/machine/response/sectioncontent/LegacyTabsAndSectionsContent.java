package com.dyson.mobile.android.machine.response.sectioncontent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/machine/response/sectioncontent/LegacyTabsAndSectionsContent;", "Landroid/os/Parcelable;", "", "Lcom/dyson/mobile/android/machine/response/sectioncontent/Section;", "sections", "Lcom/dyson/mobile/android/machine/response/sectioncontent/Tab;", "tabs", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "d", "Ljava/util/List;", "i", "()Ljava/util/List;", "e", "j", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegacyTabsAndSectionsContent implements Parcelable {
    public static final Parcelable.Creator<LegacyTabsAndSectionsContent> CREATOR = new a();
    @SerializedName("sections")
    private final List<Section> d;
    @SerializedName("tabs")
    private final List<Tab> e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<LegacyTabsAndSectionsContent> {
        @Override // android.os.Parcelable.Creator
        public final LegacyTabsAndSectionsContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            int i14 = 0;
            while (i14 != readInt) {
                i14 = d72.a.d(Section.CREATOR, parcel, arrayList, i14, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i13 != readInt2) {
                i13 = d72.a.d(Tab.CREATOR, parcel, arrayList2, i13, 1);
            }
            return new LegacyTabsAndSectionsContent(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final LegacyTabsAndSectionsContent[] newArray(int i13) {
            return new LegacyTabsAndSectionsContent[i13];
        }
    }

    public LegacyTabsAndSectionsContent(List<Section> list, List<Tab> list2) {
        list.getClass();
        list2.getClass();
        this.d = list;
        this.e = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyTabsAndSectionsContent) {
            LegacyTabsAndSectionsContent legacyTabsAndSectionsContent = (LegacyTabsAndSectionsContent) obj;
            return r.c(this.d, legacyTabsAndSectionsContent.d) && r.c(this.e, legacyTabsAndSectionsContent.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final List<Section> i() {
        return this.d;
    }

    public final List<Tab> j() {
        return this.e;
    }

    public final String toString() {
        List<Section> list = this.d;
        List<Tab> list2 = this.e;
        return "LegacyTabsAndSectionsContent(sections=" + list + ", tabs=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        Iterator n13 = d72.a.n(this.d, parcel);
        while (n13.hasNext()) {
            ((Section) n13.next()).writeToParcel(parcel, i13);
        }
        Iterator n14 = d72.a.n(this.e, parcel);
        while (n14.hasNext()) {
            ((Tab) n14.next()).writeToParcel(parcel, i13);
        }
    }
}
