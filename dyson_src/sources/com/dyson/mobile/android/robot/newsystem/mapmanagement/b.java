package com.dyson.mobile.android.robot.newsystem.mapmanagement;

import com.dyson.mobile.android.robot.newsystem.mapengine.data.ManageMapAction;
import com.salesforce.marketingcloud.UrlHandler;
import h12.y;
import java.util.List;
import kotlin.Metadata;
/* loaded from: classes3.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/b$a;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/b;", "", "mapId", "<init>", "(Ljava/lang/String;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16454a;

        public a(String str) {
            str.getClass();
            this.f16454a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f16454a.equals(((a) obj).f16454a);
        }

        public final int hashCode() {
            return this.f16454a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("EditFurniture(mapId=", this.f16454a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/b$b;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/b;", "", "mapId", "Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ManageMapAction;", UrlHandler.ACTION, "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ManageMapAction;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.newsystem.mapmanagement.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0582b implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16455a;

        /* renamed from: b  reason: collision with root package name */
        public final ManageMapAction f16456b;

        public C0582b(String str, ManageMapAction manageMapAction) {
            str.getClass();
            manageMapAction.getClass();
            this.f16455a = str;
            this.f16456b = manageMapAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0582b) {
                C0582b c0582b = (C0582b) obj;
                return this.f16455a.equals(c0582b.f16455a) && this.f16456b == c0582b.f16456b;
            }
            return false;
        }

        public final int hashCode() {
            return this.f16456b.hashCode() + (this.f16455a.hashCode() * 31);
        }

        public final String toString() {
            return "EditRooms(mapId=" + this.f16455a + ", action=" + this.f16456b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/b$c;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/b;", "", "mapId", "<init>", "(Ljava/lang/String;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16457a;

        public c(String str) {
            str.getClass();
            this.f16457a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f16457a.equals(((c) obj).f16457a);
        }

        public final int hashCode() {
            return this.f16457a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("EditRules(mapId=", this.f16457a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/b$d;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/b;", "", "mapId", "currentMapName", "", "existingMapNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16458a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16459b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f16460c;

        public d(String str, String str2, List<String> list) {
            d72.a.x(str, str2, list);
            this.f16458a = str;
            this.f16459b = str2;
            this.f16460c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f16458a.equals(dVar.f16458a) && this.f16459b.equals(dVar.f16459b) && this.f16460c.equals(dVar.f16460c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16460c.hashCode() + y.c(this.f16458a.hashCode() * 31, 31, this.f16459b);
        }

        public final String toString() {
            return b0.g.k(ma.e.m("RenameMap(mapId=", this.f16458a, ", currentMapName=", this.f16459b, ", existingMapNames="), this.f16460c, ")");
        }
    }
}
