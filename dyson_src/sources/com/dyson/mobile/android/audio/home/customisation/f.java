package com.dyson.mobile.android.audio.home.customisation;

import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/f$a;", "Lcom/dyson/mobile/android/audio/home/customisation/f;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12483a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1317216273;
        }

        public final String toString() {
            return "CloseScreen";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/f$b;", "Lcom/dyson/mobile/android/audio/home/customisation/f;", "Lkj/b;", "urlWithTracking", "<init>", "(Lkj/b;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        public final kj.b f12484a;

        public b(kj.b bVar) {
            bVar.getClass();
            this.f12484a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f12484a.equals(((b) obj).f12484a);
        }

        public final int hashCode() {
            return this.f12484a.hashCode();
        }

        public final String toString() {
            return "OpenShop(urlWithTracking=" + this.f12484a + ")";
        }
    }
}
