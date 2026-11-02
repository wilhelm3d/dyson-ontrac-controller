package com.dyson.mobile.android.audio.home.customisation;

import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import gl.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q62.n;
import x12.r;
/* loaded from: classes2.dex */
public interface k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/k$a;", "Lcom/dyson/mobile/android/audio/home/customisation/k;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12510a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 804186730;
        }

        public final String toString() {
            return EventsNameKt.GENERIC_ERROR_MESSAGE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/k$b;", "Lcom/dyson/mobile/android/audio/home/customisation/k;", "Lgl/h;", "finishes", "<init>", "(Lgl/h;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public final gl.h f12511a;

        public b(gl.h hVar) {
            hVar.getClass();
            this.f12511a = hVar;
        }

        public gl.h a() {
            return this.f12511a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/k$c;", "Lcom/dyson/mobile/android/audio/home/customisation/k;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final c f12512a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1544972574;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/k$d;", "Lcom/dyson/mobile/android/audio/home/customisation/k$b;", "Lgl/h;", "finishes", "Lgl/p;", "selection", "", "accessibilityLabel", "cushionsSectionTitleKey", "capsSectionTitleKey", "<init>", "(Lgl/h;Lgl/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: b  reason: collision with root package name */
        public final gl.h f12513b;

        /* renamed from: c  reason: collision with root package name */
        public final p f12514c;
        public final String d;
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final String f12515f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(gl.h hVar, p pVar, String str, String str2, String str3) {
            super(hVar);
            hVar.getClass();
            pVar.getClass();
            this.f12513b = hVar;
            this.f12514c = pVar;
            this.d = str;
            this.e = str2;
            this.f12515f = str3;
        }

        @Override // com.dyson.mobile.android.audio.home.customisation.k.b
        public final gl.h a() {
            return this.f12513b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return r.c(this.f12513b, dVar.f12513b) && r.c(this.f12514c, dVar.f12514c) && r.c(this.d, dVar.d) && r.c(this.e, dVar.e) && r.c(this.f12515f, dVar.f12515f);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.f12514c.hashCode() + (this.f12513b.hashCode() * 31)) * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f12515f;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Ready(finishes=");
            sb2.append(this.f12513b);
            sb2.append(", selection=");
            sb2.append(this.f12514c);
            sb2.append(", accessibilityLabel=");
            n.o(sb2, this.d, ", cushionsSectionTitleKey=", this.e, ", capsSectionTitleKey=");
            return ie.a.h(sb2, this.f12515f, ")");
        }

        public /* synthetic */ d(gl.h hVar, p pVar, String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(hVar, pVar, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3);
        }
    }
}
