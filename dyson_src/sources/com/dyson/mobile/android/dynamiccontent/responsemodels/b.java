package com.dyson.mobile.android.dynamiccontent.responsemodels;

import b0.y1;
import com.brightcove.player.captioning.TTMLParser;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import h12.y;
import java.util.List;
import kotlin.Metadata;
import o80.g;
import o80.h;
import o80.i;
import o80.l;
import o80.m;
import x12.r;
@JsonAdapter(ContentItemJsonAdapter.class)
/* loaded from: classes2.dex */
public interface b {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u000e\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b$a;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b;", "", "id", "title", "", "Lo80/f;", "items", "Lo80/a;", "orientation", "Lo80/g;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lo80/a;Lo80/g;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lo80/a;", "()Lo80/a;", "Lo80/g;", "()Lo80/g;", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements b {
        @SerializedName("id")

        /* renamed from: a  reason: collision with root package name */
        private final String f14081a;
        @SerializedName("title")

        /* renamed from: b  reason: collision with root package name */
        private final String f14082b;
        @SerializedName("items")

        /* renamed from: c  reason: collision with root package name */
        private final List<o80.f> f14083c;
        @SerializedName("orientation")
        private final o80.a d;
        @SerializedName("cta")
        private final g e;

        public a(String str, String str2, List<o80.f> list, o80.a aVar, g gVar) {
            d72.a.x(str, str2, list);
            this.f14081a = str;
            this.f14082b = str2;
            this.f14083c = list;
            this.d = aVar;
            this.e = gVar;
        }

        public final g a() {
            return this.e;
        }

        public final String b() {
            return this.f14081a;
        }

        public final List<o80.f> c() {
            return this.f14083c;
        }

        public final o80.a d() {
            return this.d;
        }

        public final String e() {
            return this.f14082b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return r.c(this.f14081a, aVar.f14081a) && r.c(this.f14082b, aVar.f14082b) && r.c(this.f14083c, aVar.f14083c) && this.d == aVar.d && r.c(this.e, aVar.e);
            }
            return false;
        }

        public final int hashCode() {
            int h13 = tq1.a.h(y.c(this.f14081a.hashCode() * 31, 31, this.f14082b), 31, this.f14083c);
            o80.a aVar = this.d;
            int hashCode = (h13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            g gVar = this.e;
            return hashCode + (gVar != null ? gVar.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f14081a;
            String str2 = this.f14082b;
            List<o80.f> list = this.f14083c;
            o80.a aVar = this.d;
            g gVar = this.e;
            StringBuilder m13 = ma.e.m("Carousel(id=", str, ", title=", str2, ", items=");
            m13.append(list);
            m13.append(", orientation=");
            m13.append(aVar);
            m13.append(", cta=");
            m13.append(gVar);
            m13.append(")");
            return m13.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b$b;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b;", "", "id", "", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/a;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.dynamiccontent.responsemodels.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0453b implements b {
        @SerializedName("id")

        /* renamed from: a  reason: collision with root package name */
        private final String f14084a;
        @SerializedName("items")

        /* renamed from: b  reason: collision with root package name */
        private final List<com.dyson.mobile.android.dynamiccontent.responsemodels.a> f14085b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0453b(String str, List<? extends com.dyson.mobile.android.dynamiccontent.responsemodels.a> list) {
            str.getClass();
            list.getClass();
            this.f14084a = str;
            this.f14085b = list;
        }

        public final String a() {
            return this.f14084a;
        }

        public final List<com.dyson.mobile.android.dynamiccontent.responsemodels.a> b() {
            return this.f14085b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0453b) {
                C0453b c0453b = (C0453b) obj;
                return r.c(this.f14084a, c0453b.f14084a) && r.c(this.f14085b, c0453b.f14085b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f14085b.hashCode() + (this.f14084a.hashCode() * 31);
        }

        public final String toString() {
            return y1.k("Grid(id=", this.f14084a, ", items=", ")", this.f14085b);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b$c;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b;", "", "id", "Lo80/h;", "display", "image", "description", "<init>", "(Ljava/lang/String;Lo80/h;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lo80/h;", "()Lo80/h;", "d", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements b {
        @SerializedName("id")

        /* renamed from: a  reason: collision with root package name */
        private final String f14086a;
        @SerializedName("display")
        @JsonAdapter(UnifiedContentImageDisplayAdapter.class)

        /* renamed from: b  reason: collision with root package name */
        private final h f14087b;
        @SerializedName("image")

        /* renamed from: c  reason: collision with root package name */
        private final String f14088c;
        @SerializedName("description")
        private final String d;

        public c(String str, h hVar, String str2, String str3) {
            str.getClass();
            hVar.getClass();
            str2.getClass();
            str3.getClass();
            this.f14086a = str;
            this.f14087b = hVar;
            this.f14088c = str2;
            this.d = str3;
        }

        public final String a() {
            return this.d;
        }

        public final h b() {
            return this.f14087b;
        }

        public final String c() {
            return this.f14086a;
        }

        public final String d() {
            return this.f14088c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return r.c(this.f14086a, cVar.f14086a) && this.f14087b == cVar.f14087b && r.c(this.f14088c, cVar.f14088c) && r.c(this.d, cVar.d);
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + y.c((this.f14087b.hashCode() + (this.f14086a.hashCode() * 31)) * 31, 31, this.f14088c);
        }

        public final String toString() {
            String str = this.f14086a;
            h hVar = this.f14087b;
            String str2 = this.f14088c;
            String str3 = this.d;
            StringBuilder sb2 = new StringBuilder("Image(id=");
            sb2.append(str);
            sb2.append(", display=");
            sb2.append(hVar);
            sb2.append(", image=");
            return jy1.a.f(sb2, str2, ", description=", str3, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b$d;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b;", "", "id", "reference", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements b {
        @SerializedName("id")

        /* renamed from: a  reason: collision with root package name */
        private final String f14089a;
        @SerializedName("ref")

        /* renamed from: b  reason: collision with root package name */
        private final String f14090b;

        public d(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f14089a = str;
            this.f14090b = str2;
        }

        public final String a() {
            return this.f14089a;
        }

        public final String b() {
            return this.f14090b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return r.c(this.f14089a, dVar.f14089a) && r.c(this.f14090b, dVar.f14090b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f14090b.hashCode() + (this.f14089a.hashCode() * 31);
        }

        public final String toString() {
            return y1.j("Native(id=", this.f14089a, ", reference=", this.f14090b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b$e;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b;", "", "id", "Lo80/m;", "style", "Lo80/l;", TTMLParser.Attributes.COLOR, "text", "<init>", "(Ljava/lang/String;Lo80/m;Lo80/l;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lo80/m;", "c", "()Lo80/m;", "Lo80/l;", "()Lo80/l;", "d", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements b {
        @SerializedName("id")

        /* renamed from: a  reason: collision with root package name */
        private final String f14091a;
        @SerializedName("style")

        /* renamed from: b  reason: collision with root package name */
        private final m f14092b;
        @SerializedName(TTMLParser.Attributes.COLOR)

        /* renamed from: c  reason: collision with root package name */
        private final l f14093c;
        @SerializedName("text")
        private final String d;

        public e(String str, m mVar, l lVar, String str2) {
            str.getClass();
            str2.getClass();
            this.f14091a = str;
            this.f14092b = mVar;
            this.f14093c = lVar;
            this.d = str2;
        }

        public final l a() {
            return this.f14093c;
        }

        public final String b() {
            return this.f14091a;
        }

        public final m c() {
            return this.f14092b;
        }

        public final String d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return r.c(this.f14091a, eVar.f14091a) && this.f14092b == eVar.f14092b && this.f14093c == eVar.f14093c && r.c(this.d, eVar.d);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f14091a.hashCode() * 31;
            m mVar = this.f14092b;
            int hashCode2 = (hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
            l lVar = this.f14093c;
            return this.d.hashCode() + ((hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            String str = this.f14091a;
            m mVar = this.f14092b;
            l lVar = this.f14093c;
            String str2 = this.d;
            return "Text(id=" + str + ", style=" + mVar + ", color=" + lVar + ", text=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b$f;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b;", "", "id", "Lo80/e;", TTMLParser.Tags.LAYOUT, "", "Lo80/i;", "items", "<init>", "(Ljava/lang/String;Lo80/e;Ljava/util/List;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Lo80/e;", "c", "()Lo80/e;", "Ljava/util/List;", "()Ljava/util/List;", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements b {
        @SerializedName("id")

        /* renamed from: a  reason: collision with root package name */
        private final String f14094a;
        @SerializedName(TTMLParser.Tags.LAYOUT)

        /* renamed from: b  reason: collision with root package name */
        private final o80.e f14095b;
        @SerializedName("items")

        /* renamed from: c  reason: collision with root package name */
        private final List<i> f14096c;

        public f(String str, o80.e eVar, List<i> list) {
            str.getClass();
            list.getClass();
            this.f14094a = str;
            this.f14095b = eVar;
            this.f14096c = list;
        }

        public final String a() {
            return this.f14094a;
        }

        public final List<i> b() {
            return this.f14096c;
        }

        public final o80.e c() {
            return this.f14095b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return r.c(this.f14094a, fVar.f14094a) && this.f14095b == fVar.f14095b && r.c(this.f14096c, fVar.f14096c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f14094a.hashCode() * 31;
            o80.e eVar = this.f14095b;
            return this.f14096c.hashCode() + ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31);
        }

        public final String toString() {
            String str = this.f14094a;
            o80.e eVar = this.f14095b;
            List<i> list = this.f14096c;
            StringBuilder sb2 = new StringBuilder("UnifiedList(id=");
            sb2.append(str);
            sb2.append(", layout=");
            sb2.append(eVar);
            sb2.append(", items=");
            return b0.g.k(sb2, list, ")");
        }
    }
}
