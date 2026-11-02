package com.dyson.mobile.android.robot.newsystem.home.tabs.maps;

import b0.y1;
import com.brightcove.player.event.AbstractEvent;
import kotlin.Metadata;
import x12.r;
/* loaded from: classes3.dex */
public interface b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b$a;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16337a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1289382277;
        }

        public final String toString() {
            return "CreateNewMapClicked";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b$b;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0565b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0565b f16338a = new C0565b();

        private C0565b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0565b);
        }

        public final int hashCode() {
            return 2127562432;
        }

        public final String toString() {
            return "DeleteMapClicked";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b$c;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b;", "", "mapId", "<init>", "(Ljava/lang/String;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16339a;

        public c(String str) {
            str.getClass();
            this.f16339a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f16339a.equals(((c) obj).f16339a);
        }

        public final int hashCode() {
            return this.f16339a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("EditFurnitureClicked(mapId=", this.f16339a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b$d;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f16340a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -437027689;
        }

        public final String toString() {
            return "EmptyMapViewButtonClicked";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b$e;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b;", "", "mapId", "<init>", "(Ljava/lang/String;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16341a;

        public e(String str) {
            str.getClass();
            this.f16341a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f16341a.equals(((e) obj).f16341a);
        }

        public final int hashCode() {
            return this.f16341a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("ManageRoomsClicked(mapId=", this.f16341a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b$f;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b;", "", "mapId", "<init>", "(Ljava/lang/String;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16342a;

        public f(String str) {
            str.getClass();
            this.f16342a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f16342a.equals(((f) obj).f16342a);
        }

        public final int hashCode() {
            return this.f16342a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("ManageRulesClicked(mapId=", this.f16342a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b$g;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b;", "", "mapId", "mapName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16343a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16344b;

        public g(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f16343a = str;
            this.f16344b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.f16343a.equals(gVar.f16343a) && this.f16344b.equals(gVar.f16344b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16344b.hashCode() + (this.f16343a.hashCode() * 31);
        }

        public final String toString() {
            return y1.j("MapNameClicked(mapId=", this.f16343a, ", mapName=", this.f16344b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b$h;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b;", "", AbstractEvent.INDEX, "<init>", "(I)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h implements b {

        /* renamed from: a  reason: collision with root package name */
        public final int f16345a;

        public h(int i13) {
            this.f16345a = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f16345a == ((h) obj).f16345a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16345a);
        }

        public final String toString() {
            return y1.i(this.f16345a, "MapSelected(index=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b$i;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/b;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError;", "error", "<init>", "(Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ManageMapsTabApiError f16346a;

        public i(ManageMapsTabApiError manageMapsTabApiError) {
            this.f16346a = manageMapsTabApiError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && r.c(this.f16346a, ((i) obj).f16346a);
        }

        public final int hashCode() {
            ManageMapsTabApiError manageMapsTabApiError = this.f16346a;
            if (manageMapsTabApiError == null) {
                return 0;
            }
            return manageMapsTabApiError.hashCode();
        }

        public final String toString() {
            return "ReloadManageMapsTabClicked(error=" + this.f16346a + ")";
        }
    }
}
