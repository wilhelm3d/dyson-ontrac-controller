package com.dyson.mobile.android.audio.home.customisation;

import com.dyson.nst.dyson3d.schema.model.Schema;
import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface m {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/m$a;", "Lcom/dyson/mobile/android/audio/home/customisation/m;", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "schema", "<init>", "(Lcom/dyson/nst/dyson3d/schema/model/Schema;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final Schema f12517a;

        public a(Schema schema) {
            schema.getClass();
            this.f12517a = schema;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f12517a.equals(((a) obj).f12517a);
        }

        public final int hashCode() {
            return this.f12517a.hashCode();
        }

        public final String toString() {
            return "Loaded(schema=" + this.f12517a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/m$b;", "Lcom/dyson/mobile/android/audio/home/customisation/m;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements m {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12518a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 992894197;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/m$c;", "Lcom/dyson/mobile/android/audio/home/customisation/m;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements m {

        /* renamed from: a  reason: collision with root package name */
        public static final c f12519a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1119785699;
        }

        public final String toString() {
            return "NotAvailable";
        }
    }
}
