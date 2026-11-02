package com.dyson.mobile.android.audio.home.settings.removeproduct;

import com.brightcove.player.captioning.TTMLParser;
import h12.y;
import kotlin.Metadata;
import q62.n;
/* loaded from: classes2.dex */
public interface d {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/audio/home/settings/removeproduct/d$a;", "Lcom/dyson/mobile/android/audio/home/settings/removeproduct/d;", "", "title", TTMLParser.Tags.BODY, "confirmButtonText", "Lcom/dyson/mobile/android/audio/home/settings/removeproduct/b;", "confirmButtonEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/audio/home/settings/removeproduct/b;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final String f12575a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12576b;

        /* renamed from: c  reason: collision with root package name */
        public final String f12577c;
        public final com.dyson.mobile.android.audio.home.settings.removeproduct.b d;

        public a(String str, String str2, String str3, com.dyson.mobile.android.audio.home.settings.removeproduct.b bVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            bVar.getClass();
            this.f12575a = str;
            this.f12576b = str2;
            this.f12577c = str3;
            this.d = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f12575a.equals(aVar.f12575a) && this.f12576b.equals(aVar.f12576b) && this.f12577c.equals(aVar.f12577c) && this.d.equals(aVar.d);
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + y.c(y.c(this.f12575a.hashCode() * 31, 31, this.f12576b), 31, this.f12577c);
        }

        public final String toString() {
            StringBuilder m13 = ma.e.m("Alert(title=", this.f12575a, ", body=", this.f12576b, ", confirmButtonText=");
            m13.append(this.f12577c);
            m13.append(", confirmButtonEvent=");
            m13.append(this.d);
            m13.append(")");
            return m13.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/settings/removeproduct/d$b;", "Lcom/dyson/mobile/android/audio/home/settings/removeproduct/d;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12578a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -642062275;
        }

        public final String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/audio/home/settings/removeproduct/d$c;", "Lcom/dyson/mobile/android/audio/home/settings/removeproduct/d;", "", "title", TTMLParser.Tags.BODY, "cancelButtonText", "confirmButtonText", "Lcom/dyson/mobile/android/audio/home/settings/removeproduct/b;", "confirmButtonEvent", "cancelButtonEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/audio/home/settings/removeproduct/b;Lcom/dyson/mobile/android/audio/home/settings/removeproduct/b;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final String f12579a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12580b;

        /* renamed from: c  reason: collision with root package name */
        public final String f12581c;
        public final String d;
        public final com.dyson.mobile.android.audio.home.settings.removeproduct.b e;

        /* renamed from: f  reason: collision with root package name */
        public final com.dyson.mobile.android.audio.home.settings.removeproduct.b f12582f;

        public c(String str, String str2, String str3, String str4, com.dyson.mobile.android.audio.home.settings.removeproduct.b bVar, com.dyson.mobile.android.audio.home.settings.removeproduct.b bVar2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            bVar.getClass();
            bVar2.getClass();
            this.f12579a = str;
            this.f12580b = str2;
            this.f12581c = str3;
            this.d = str4;
            this.e = bVar;
            this.f12582f = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f12579a.equals(cVar.f12579a) && this.f12580b.equals(cVar.f12580b) && this.f12581c.equals(cVar.f12581c) && this.d.equals(cVar.d) && this.e.equals(cVar.e) && this.f12582f.equals(cVar.f12582f);
            }
            return false;
        }

        public final int hashCode() {
            int c13 = y.c(y.c(y.c(this.f12579a.hashCode() * 31, 31, this.f12580b), 31, this.f12581c), 31, this.d);
            return this.f12582f.hashCode() + ((this.e.hashCode() + c13) * 31);
        }

        public final String toString() {
            StringBuilder m13 = ma.e.m("Prompt(title=", this.f12579a, ", body=", this.f12580b, ", cancelButtonText=");
            n.o(m13, this.f12581c, ", confirmButtonText=", this.d, ", confirmButtonEvent=");
            m13.append(this.e);
            m13.append(", cancelButtonEvent=");
            m13.append(this.f12582f);
            m13.append(")");
            return m13.toString();
        }
    }
}
