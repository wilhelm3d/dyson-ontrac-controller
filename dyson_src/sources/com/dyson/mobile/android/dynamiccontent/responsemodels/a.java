package com.dyson.mobile.android.dynamiccontent.responsemodels;

import com.brightcove.player.event.AbstractEvent;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o80.g;
import q62.n;
import x12.r;
@JsonAdapter(GridItemJsonAdapter.class)
/* loaded from: classes2.dex */
public interface a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/a$a;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/a;", "", "id", "Lo80/c;", AbstractEvent.SIZE, "reference", "<init>", "(Ljava/lang/String;Lo80/c;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Lo80/c;", "c", "()Lo80/c;", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.dynamiccontent.responsemodels.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0452a implements a {
        @SerializedName("id")

        /* renamed from: a  reason: collision with root package name */
        private final String f14072a;
        @SerializedName(AbstractEvent.SIZE)

        /* renamed from: b  reason: collision with root package name */
        private final o80.c f14073b;
        @SerializedName("ref")

        /* renamed from: c  reason: collision with root package name */
        private final String f14074c;

        public C0452a(String str, o80.c cVar, String str2) {
            str.getClass();
            cVar.getClass();
            str2.getClass();
            this.f14072a = str;
            this.f14073b = cVar;
            this.f14074c = str2;
        }

        public final String a() {
            return this.f14072a;
        }

        public final String b() {
            return this.f14074c;
        }

        public final o80.c c() {
            return this.f14073b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0452a) {
                C0452a c0452a = (C0452a) obj;
                return r.c(this.f14072a, c0452a.f14072a) && this.f14073b == c0452a.f14073b && r.c(this.f14074c, c0452a.f14074c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f14073b.hashCode();
            return this.f14074c.hashCode() + ((hashCode + (this.f14072a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            String str = this.f14072a;
            o80.c cVar = this.f14073b;
            String str2 = this.f14074c;
            StringBuilder sb2 = new StringBuilder("Native(id=");
            sb2.append(str);
            sb2.append(", size=");
            sb2.append(cVar);
            sb2.append(", reference=");
            return ie.a.h(sb2, str2, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/a$c;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/a;", "<init>", "()V", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements a {
        static {
            new c();
        }

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1384811128;
        }

        public final String toString() {
            return "Unknown";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0014\u0010\u001f¨\u0006 "}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/a$b;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/a;", "", "id", "Lo80/c;", AbstractEvent.SIZE, "title", "description", "imageUrl", "Lo80/b;", "orientation", "actionUrl", "Lo80/g;", "cta", "<init>", "(Ljava/lang/String;Lo80/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo80/b;Ljava/lang/String;Lo80/g;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lo80/c;", "g", "()Lo80/c;", "c", "h", "e", "f", "Lo80/b;", "()Lo80/b;", "Lo80/g;", "()Lo80/g;", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements a {
        @SerializedName("id")

        /* renamed from: a  reason: collision with root package name */
        private final String f14075a;
        @SerializedName(AbstractEvent.SIZE)

        /* renamed from: b  reason: collision with root package name */
        private final o80.c f14076b;
        @SerializedName("title")

        /* renamed from: c  reason: collision with root package name */
        private final String f14077c;
        @SerializedName("description")
        private final String d;
        @SerializedName("image")
        private final String e;
        @SerializedName("orientation")

        /* renamed from: f  reason: collision with root package name */
        private final o80.b f14078f;
        @SerializedName("url")

        /* renamed from: g  reason: collision with root package name */
        private final String f14079g;
        @SerializedName(alternate = {"button"}, value = "cta")

        /* renamed from: h  reason: collision with root package name */
        private final g f14080h;

        public b(String str, o80.c cVar, String str2, String str3, String str4, o80.b bVar, String str5, g gVar) {
            str.getClass();
            cVar.getClass();
            str2.getClass();
            str4.getClass();
            str5.getClass();
            this.f14075a = str;
            this.f14076b = cVar;
            this.f14077c = str2;
            this.d = str3;
            this.e = str4;
            this.f14078f = bVar;
            this.f14079g = str5;
            this.f14080h = gVar;
        }

        public final String a() {
            return this.f14079g;
        }

        public final g b() {
            return this.f14080h;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.f14075a;
        }

        public final String e() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return r.c(this.f14075a, bVar.f14075a) && this.f14076b == bVar.f14076b && r.c(this.f14077c, bVar.f14077c) && r.c(this.d, bVar.d) && r.c(this.e, bVar.e) && this.f14078f == bVar.f14078f && r.c(this.f14079g, bVar.f14079g) && r.c(this.f14080h, bVar.f14080h);
            }
            return false;
        }

        public final o80.b f() {
            return this.f14078f;
        }

        public final o80.c g() {
            return this.f14076b;
        }

        public final String h() {
            return this.f14077c;
        }

        public final int hashCode() {
            int c13 = y.c((this.f14076b.hashCode() + (this.f14075a.hashCode() * 31)) * 31, 31, this.f14077c);
            String str = this.d;
            int c14 = y.c((c13 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
            o80.b bVar = this.f14078f;
            int c15 = y.c((c14 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f14079g);
            g gVar = this.f14080h;
            return c15 + (gVar != null ? gVar.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f14075a;
            o80.c cVar = this.f14076b;
            String str2 = this.f14077c;
            String str3 = this.d;
            String str4 = this.e;
            o80.b bVar = this.f14078f;
            String str5 = this.f14079g;
            g gVar = this.f14080h;
            StringBuilder sb2 = new StringBuilder("Standard(id=");
            sb2.append(str);
            sb2.append(", size=");
            sb2.append(cVar);
            sb2.append(", title=");
            n.o(sb2, str2, ", description=", str3, ", imageUrl=");
            sb2.append(str4);
            sb2.append(", orientation=");
            sb2.append(bVar);
            sb2.append(", actionUrl=");
            sb2.append(str5);
            sb2.append(", cta=");
            sb2.append(gVar);
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ b(String str, o80.c cVar, String str2, String str3, String str4, o80.b bVar, String str5, g gVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, cVar, str2, (i13 & 8) != 0 ? null : str3, str4, bVar, str5, (i13 & 128) != 0 ? null : gVar);
        }
    }
}
