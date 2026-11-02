package com.dyson.mobile.android.audio.home.audiosource;

import com.brightcove.player.captioning.TTMLParser;
import h12.y;
import kotlin.Metadata;
import mj.c;
/* loaded from: classes2.dex */
public interface c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/c$a;", "Lcom/dyson/mobile/android/audio/home/audiosource/c;", "Lmj/c$a;", com.salesforce.marketingcloud.config.a.f20855h, "", "title", TTMLParser.Tags.BODY, "<init>", "(Lmj/c$a;Ljava/lang/String;Ljava/lang/String;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final c.a f12392a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12393b;

        /* renamed from: c  reason: collision with root package name */
        public final String f12394c;

        public a(c.a aVar, String str, String str2) {
            aVar.getClass();
            str.getClass();
            str2.getClass();
            this.f12392a = aVar;
            this.f12393b = str;
            this.f12394c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f12392a == aVar.f12392a && this.f12393b.equals(aVar.f12393b) && this.f12394c.equals(aVar.f12394c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f12394c.hashCode() + y.c(this.f12392a.hashCode() * 31, 31, this.f12393b);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(eventName=");
            sb2.append(this.f12392a);
            sb2.append(", title=");
            sb2.append(this.f12393b);
            sb2.append(", body=");
            return ie.a.h(sb2, this.f12394c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/c$b;", "Lcom/dyson/mobile/android/audio/home/audiosource/c;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12395a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1151388191;
        }

        public final String toString() {
            return "None";
        }
    }
}
