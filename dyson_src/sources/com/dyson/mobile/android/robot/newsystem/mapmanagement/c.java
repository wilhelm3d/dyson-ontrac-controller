package com.dyson.mobile.android.robot.newsystem.mapmanagement;

import b0.y1;
import com.brightcove.player.event.AbstractEvent;
import kotlin.Metadata;
/* loaded from: classes3.dex */
public interface c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/c$a;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/c;", "", AbstractEvent.INDEX, "<init>", "(I)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final int f16461a;

        public a(int i13) {
            this.f16461a = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f16461a == ((a) obj).f16461a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16461a);
        }

        public final String toString() {
            return y1.i(this.f16461a, "OnChangeCurrentMapClicked(index=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/c$b;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/c;", "", "id", "<init>", "(Ljava/lang/String;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final String f16462a;

        public b(String str) {
            str.getClass();
            this.f16462a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f16462a.equals(((b) obj).f16462a);
        }

        public final int hashCode() {
            return this.f16462a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("OnDropdownStickyItemClicked(id=", this.f16462a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/c$c;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/c;", "", "id", "<init>", "(Ljava/lang/String;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.newsystem.mapmanagement.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0583c implements c {

        /* renamed from: a  reason: collision with root package name */
        public final String f16463a;

        public C0583c(String str) {
            str.getClass();
            this.f16463a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0583c) && this.f16463a.equals(((C0583c) obj).f16463a);
        }

        public final int hashCode() {
            return this.f16463a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("OnGridTileIconClicked(id=", this.f16463a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/c$d;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/c;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError;", "apiError", "<init>", "(Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final MapManagementApiError f16464a;

        public d(MapManagementApiError mapManagementApiError) {
            mapManagementApiError.getClass();
            this.f16464a = mapManagementApiError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f16464a.equals(((d) obj).f16464a);
        }

        public final int hashCode() {
            return this.f16464a.hashCode();
        }

        public final String toString() {
            return "OnReloadMapClicked(apiError=" + this.f16464a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/c$e;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/c;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final e f16465a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -605418675;
        }

        public final String toString() {
            return "OnRotateMapClicked";
        }
    }
}
