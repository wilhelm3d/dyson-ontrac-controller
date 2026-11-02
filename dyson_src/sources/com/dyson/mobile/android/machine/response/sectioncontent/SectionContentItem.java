package com.dyson.mobile.android.machine.response.sectioncontent;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import bv1.f;
import com.brightcove.player.captioning.TTMLParser;
import com.google.gson.annotations.SerializedName;
import h12.y;
import ik0.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import q62.n;
import x12.r;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem;", "Landroid/os/Parcelable;", "Native", "Collection", "List", "Link", "Unknown", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Collection;", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Link;", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$List;", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Native;", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Unknown;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SectionContentItem extends Parcelable {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Collection;", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem;", "", "id", "topic", "Lkk0/a;", TTMLParser.Tags.LAYOUT, "Lik0/b;", "orientation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkk0/a;Lik0/b;)V", "d", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "e", "k", "f", "Lkk0/a;", "i", "()Lkk0/a;", "g", "Lik0/b;", "j", "()Lik0/b;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Collection implements SectionContentItem {
        public static final Parcelable.Creator<Collection> CREATOR = new a();
        @SerializedName("id")
        private final String d;
        @SerializedName("topic")
        private final String e;
        @SerializedName(TTMLParser.Tags.LAYOUT)

        /* renamed from: f  reason: collision with root package name */
        private final kk0.a f15307f;
        @SerializedName("orientation")

        /* renamed from: g  reason: collision with root package name */
        private final b f15308g;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<Collection> {
            @Override // android.os.Parcelable.Creator
            public final Collection createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Collection(parcel.readString(), parcel.readString(), kk0.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Collection[] newArray(int i13) {
                return new Collection[i13];
            }
        }

        public Collection(String str, String str2, kk0.a aVar, b bVar) {
            str2.getClass();
            aVar.getClass();
            this.d = str;
            this.e = str2;
            this.f15307f = aVar;
            this.f15308g = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                return r.c(this.d, collection.d) && r.c(this.e, collection.e) && this.f15307f == collection.f15307f && this.f15308g == collection.f15308g;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.d;
            int hashCode = (this.f15307f.hashCode() + y.c((str == null ? 0 : str.hashCode()) * 31, 31, this.e)) * 31;
            b bVar = this.f15308g;
            return hashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        public final kk0.a i() {
            return this.f15307f;
        }

        public final b j() {
            return this.f15308g;
        }

        public final String k() {
            return this.e;
        }

        public final String toString() {
            String str = this.d;
            String str2 = this.e;
            kk0.a aVar = this.f15307f;
            b bVar = this.f15308g;
            StringBuilder m13 = e.m("Collection(id=", str, ", topic=", str2, ", layout=");
            m13.append(aVar);
            m13.append(", orientation=");
            m13.append(bVar);
            m13.append(")");
            return m13.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f15307f.name());
            b bVar = this.f15308g;
            if (bVar == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$List;", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem;", "", "id", "", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Link;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "d", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "e", "Ljava/util/List;", "j", "()Ljava/util/List;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class List implements SectionContentItem {
        public static final Parcelable.Creator<List> CREATOR = new a();
        @SerializedName("id")
        private final String d;
        @SerializedName("items")
        private final java.util.List<Link> e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<List> {
            @Override // android.os.Parcelable.Creator
            public final List createFromParcel(Parcel parcel) {
                parcel.getClass();
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i13 = 0;
                while (i13 != readInt) {
                    i13 = d72.a.d(Link.CREATOR, parcel, arrayList, i13, 1);
                }
                return new List(readString, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final List[] newArray(int i13) {
                return new List[i13];
            }
        }

        public List(String str, java.util.List<Link> list) {
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
            if (obj instanceof List) {
                List list = (List) obj;
                return r.c(this.d, list.d) && r.c(this.e, list.e);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.d;
            return this.e.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String i() {
            return this.d;
        }

        public final java.util.List<Link> j() {
            return this.e;
        }

        public final String toString() {
            return y1.k("List(id=", this.d, ", items=", ")", this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            Iterator n13 = d72.a.n(this.e, parcel);
            while (n13.hasNext()) {
                ((Link) n13.next()).writeToParcel(parcel, i13);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Native;", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem;", "", "ref", "<init>", "(Ljava/lang/String;)V", "d", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Native implements SectionContentItem {
        public static final Parcelable.Creator<Native> CREATOR = new a();
        @SerializedName("ref")
        private final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<Native> {
            @Override // android.os.Parcelable.Creator
            public final Native createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Native(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Native[] newArray(int i13) {
                return new Native[i13];
            }
        }

        public Native(String str) {
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
            return (obj instanceof Native) && r.c(this.d, ((Native) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String i() {
            return this.d;
        }

        public final String toString() {
            return f.e("Native(ref=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Unknown;", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Unknown implements SectionContentItem {
        public static final Unknown d = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<Unknown> {
            @Override // android.os.Parcelable.Creator
            public final Unknown createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Unknown.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Unknown[] newArray(int i13) {
                return new Unknown[i13];
            }
        }

        private Unknown() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return -1642846812;
        }

        public final String toString() {
            return "Unknown";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bBK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Link;", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem;", "", "id", "title", "description", "imageUrl", "url", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Link$CtaButtonItem;", "ctaButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Link$CtaButtonItem;)V", "d", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "e", "m", "f", "j", "g", "l", "h", "n", "i", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Link$CtaButtonItem;", "()Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Link$CtaButtonItem;", "CtaButtonItem", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Link implements SectionContentItem {
        public static final Parcelable.Creator<Link> CREATOR = new a();
        @SerializedName("id")
        private final String d;
        @SerializedName("title")
        private final String e;
        @SerializedName("description")

        /* renamed from: f  reason: collision with root package name */
        private final String f15309f;
        @SerializedName("image")

        /* renamed from: g  reason: collision with root package name */
        private final String f15310g;
        @SerializedName("url")

        /* renamed from: h  reason: collision with root package name */
        private final String f15311h;
        @SerializedName("cta")

        /* renamed from: i  reason: collision with root package name */
        private final CtaButtonItem f15312i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem$Link$CtaButtonItem;", "Landroid/os/Parcelable;", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;)V", "d", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class CtaButtonItem implements Parcelable {
            public static final Parcelable.Creator<CtaButtonItem> CREATOR = new a();
            @SerializedName(AnnotatedPrivateKey.LABEL)
            private final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<CtaButtonItem> {
                @Override // android.os.Parcelable.Creator
                public final CtaButtonItem createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new CtaButtonItem(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CtaButtonItem[] newArray(int i13) {
                    return new CtaButtonItem[i13];
                }
            }

            public CtaButtonItem(String str) {
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
                return (obj instanceof CtaButtonItem) && r.c(this.d, ((CtaButtonItem) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String i() {
                return this.d;
            }

            public final String toString() {
                return f.e("CtaButtonItem(label=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<Link> {
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Link(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CtaButtonItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i13) {
                return new Link[i13];
            }
        }

        public /* synthetic */ Link(String str, String str2, String str3, String str4, String str5, CtaButtonItem ctaButtonItem, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, ctaButtonItem);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Link) {
                Link link = (Link) obj;
                return r.c(this.d, link.d) && r.c(this.e, link.e) && r.c(this.f15309f, link.f15309f) && r.c(this.f15310g, link.f15310g) && r.c(this.f15311h, link.f15311h) && r.c(this.f15312i, link.f15312i);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.d;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f15309f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f15310g;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f15311h;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            CtaButtonItem ctaButtonItem = this.f15312i;
            return hashCode5 + (ctaButtonItem != null ? ctaButtonItem.hashCode() : 0);
        }

        public final CtaButtonItem i() {
            return this.f15312i;
        }

        public final String j() {
            return this.f15309f;
        }

        public final String k() {
            return this.d;
        }

        public final String l() {
            return this.f15310g;
        }

        public final String m() {
            return this.e;
        }

        public final String n() {
            return this.f15311h;
        }

        public final String toString() {
            String str = this.d;
            String str2 = this.e;
            String str3 = this.f15309f;
            String str4 = this.f15310g;
            String str5 = this.f15311h;
            CtaButtonItem ctaButtonItem = this.f15312i;
            StringBuilder m13 = e.m("Link(id=", str, ", title=", str2, ", description=");
            n.o(m13, str3, ", imageUrl=", str4, ", url=");
            m13.append(str5);
            m13.append(", ctaButton=");
            m13.append(ctaButtonItem);
            m13.append(")");
            return m13.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f15309f);
            parcel.writeString(this.f15310g);
            parcel.writeString(this.f15311h);
            CtaButtonItem ctaButtonItem = this.f15312i;
            if (ctaButtonItem == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            ctaButtonItem.writeToParcel(parcel, i13);
        }

        public Link(String str, String str2, String str3, String str4, String str5, CtaButtonItem ctaButtonItem) {
            this.d = str;
            this.e = str2;
            this.f15309f = str3;
            this.f15310g = str4;
            this.f15311h = str5;
            this.f15312i = ctaButtonItem;
        }
    }
}
