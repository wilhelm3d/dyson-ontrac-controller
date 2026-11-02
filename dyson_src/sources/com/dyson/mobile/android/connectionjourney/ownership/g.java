package com.dyson.mobile.android.connectionjourney.ownership;

import com.brightcove.player.captioning.TTMLParser;
import h12.y;
import kotlin.Metadata;
import mj.a;
import mj.b;
import mj.c;
import q62.n;
/* loaded from: classes2.dex */
public interface g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/g$a;", "Lcom/dyson/mobile/android/connectionjourney/ownership/g;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13787a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1469942049;
        }

        public final String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/g$b;", "Lcom/dyson/mobile/android/connectionjourney/ownership/g;", "", "title", TTMLParser.Tags.BODY, "cancelButtonText", "confirmButtonText", "Lcom/dyson/mobile/android/connectionjourney/ownership/i;", "confirmButtonEvent", "cancelButtonEvent", "Lmj/c$a;", "alertViewName", "Lmj/a$b;", "alertClickName", "Lmj/b$a;", "alertDismissName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/connectionjourney/ownership/i;Lcom/dyson/mobile/android/connectionjourney/ownership/i;Lmj/c$a;Lmj/a$b;Lmj/b$a;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public final String f13788a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13789b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13790c;
        public final String d;
        public final i e;

        /* renamed from: f  reason: collision with root package name */
        public final i f13791f;

        /* renamed from: g  reason: collision with root package name */
        public final c.a f13792g;

        /* renamed from: h  reason: collision with root package name */
        public final a.b f13793h;

        /* renamed from: i  reason: collision with root package name */
        public final b.a f13794i;

        public b(String str, String str2, String str3, String str4, i iVar, i iVar2, c.a aVar, a.b bVar, b.a aVar2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            iVar.getClass();
            iVar2.getClass();
            aVar.getClass();
            bVar.getClass();
            aVar2.getClass();
            this.f13788a = str;
            this.f13789b = str2;
            this.f13790c = str3;
            this.d = str4;
            this.e = iVar;
            this.f13791f = iVar2;
            this.f13792g = aVar;
            this.f13793h = bVar;
            this.f13794i = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f13788a.equals(bVar.f13788a) && this.f13789b.equals(bVar.f13789b) && this.f13790c.equals(bVar.f13790c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f13791f.equals(bVar.f13791f) && this.f13792g == bVar.f13792g && this.f13793h == bVar.f13793h && this.f13794i == bVar.f13794i;
            }
            return false;
        }

        public final int hashCode() {
            int c13 = y.c(y.c(y.c(this.f13788a.hashCode() * 31, 31, this.f13789b), 31, this.f13790c), 31, this.d);
            int hashCode = this.f13791f.hashCode();
            int hashCode2 = this.f13792g.hashCode();
            int hashCode3 = this.f13793h.hashCode();
            return this.f13794i.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.e.hashCode() + c13) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder m13 = ma.e.m("Prompt(title=", this.f13788a, ", body=", this.f13789b, ", cancelButtonText=");
            n.o(m13, this.f13790c, ", confirmButtonText=", this.d, ", confirmButtonEvent=");
            m13.append(this.e);
            m13.append(", cancelButtonEvent=");
            m13.append(this.f13791f);
            m13.append(", alertViewName=");
            m13.append(this.f13792g);
            m13.append(", alertClickName=");
            m13.append(this.f13793h);
            m13.append(", alertDismissName=");
            m13.append(this.f13794i);
            m13.append(")");
            return m13.toString();
        }
    }
}
