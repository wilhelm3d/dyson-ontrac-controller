package com.dyson.mobile.android.machine.machinecontent.productinformation;

import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import kotlin.Metadata;
/* loaded from: classes3.dex */
public interface g {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/productinformation/g$a;", "Lcom/dyson/mobile/android/machine/machinecontent/productinformation/g;", "Lsi0/b;", "productInformationContent", "<init>", "(Lsi0/b;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public final si0.b f15274a;

        public a(si0.b bVar) {
            bVar.getClass();
            this.f15274a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f15274a.equals(((a) obj).f15274a);
        }

        public final int hashCode() {
            return this.f15274a.hashCode();
        }

        public final String toString() {
            return "Data(productInformationContent=" + this.f15274a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/productinformation/g$b;", "Lcom/dyson/mobile/android/machine/machinecontent/productinformation/g;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15275a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -315159264;
        }

        public final String toString() {
            return EventsNameKt.GENERIC_ERROR_MESSAGE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/productinformation/g$c;", "Lcom/dyson/mobile/android/machine/machinecontent/productinformation/g;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f15276a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -404703660;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
