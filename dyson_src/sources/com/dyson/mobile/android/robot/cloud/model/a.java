package com.dyson.mobile.android.robot.cloud.model;

import b0.g;
import com.dyson.mobile.android.robot.cloud.model.CleanTimelineEvent;
import com.dyson.mobile.android.utilities.gson.StripNullItemsListTypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import i12.t;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0019\u0015Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b)\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b*\u0010#R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b,\u0010-R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b\u0019\u0010-¨\u0006/"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/a;", "", "", "id", "", "sequenceNumber", "Lcom/dyson/mobile/android/robot/cloud/model/a$b;", "persistentMap", "Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;", "cleanedFootprint", "Lcom/dyson/mobile/android/robot/cloud/model/DustMapDataGrid;", "dustMap", "lowSensitivityObject", "highSensitivityObject", "zones", "", "robotPath", "Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent;", "cleanTimeline", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/robot/cloud/model/a$b;Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;Lcom/dyson/mobile/android/robot/cloud/model/DustMapDataGrid;Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "I", "getSequenceNumber", "()I", "c", "Lcom/dyson/mobile/android/robot/cloud/model/a$b;", "i", "()Lcom/dyson/mobile/android/robot/cloud/model/a$b;", "d", "Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;", "()Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;", "e", "Lcom/dyson/mobile/android/robot/cloud/model/DustMapDataGrid;", "()Lcom/dyson/mobile/android/robot/cloud/model/DustMapDataGrid;", "f", "getLowSensitivityObject", "g", "getZones", "Ljava/util/List;", "getRobotPath", "()Ljava/util/List;", "j", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: k  reason: collision with root package name */
    public static final List<CleanTimelineEvent.b> f15968k;
    @SerializedName("cleanId")

    /* renamed from: a  reason: collision with root package name */
    private final String f15969a;
    @SerializedName("sequenceNumber")

    /* renamed from: b  reason: collision with root package name */
    private final int f15970b;
    @SerializedName("persistentMap")

    /* renamed from: c  reason: collision with root package name */
    private final b f15971c;
    @SerializedName("cleanedFootprint")
    private final MapDataGrid d;
    @SerializedName("dustMap")
    private final DustMapDataGrid e;
    @SerializedName("lowSensitivityObjects")

    /* renamed from: f  reason: collision with root package name */
    private final MapDataGrid f15972f;
    @SerializedName("highSensitivityAdditionalObjects")

    /* renamed from: g  reason: collision with root package name */
    private final MapDataGrid f15973g;
    @SerializedName("zones")

    /* renamed from: h  reason: collision with root package name */
    private final MapDataGrid f15974h;
    @SerializedName("robotPath")

    /* renamed from: i  reason: collision with root package name */
    private final List<Object> f15975i;
    @SerializedName("cleanTimeline")
    @JsonAdapter(StripNullItemsListTypeAdapterFactory.class)

    /* renamed from: j  reason: collision with root package name */
    private final List<CleanTimelineEvent> f15976j;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/a$b;", "", "", "id", "Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;", "cleanMapPosition", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;", "()Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        @SerializedName("id")

        /* renamed from: a  reason: collision with root package name */
        private final String f15977a;
        @SerializedName("cleanMapPosition")

        /* renamed from: b  reason: collision with root package name */
        private final MapPosition f15978b;

        public b(String str, MapPosition mapPosition) {
            str.getClass();
            mapPosition.getClass();
            this.f15977a = str;
            this.f15978b = mapPosition;
        }

        public final MapPosition a() {
            return this.f15978b;
        }

        public final String b() {
            return this.f15977a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return r.c(this.f15977a, bVar.f15977a) && r.c(this.f15978b, bVar.f15978b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15978b.hashCode() + (this.f15977a.hashCode() * 31);
        }

        public final String toString() {
            String str = this.f15977a;
            MapPosition mapPosition = this.f15978b;
            return "PersistentMapReference(id=" + str + ", cleanMapPosition=" + mapPosition + ")";
        }
    }

    static {
        new C0548a(null);
        f15968k = t.h(CleanTimelineEvent.b.CLEAN_ENDED, CleanTimelineEvent.b.RUN_ENDED);
    }

    public a(String str, int i13, b bVar, MapDataGrid mapDataGrid, DustMapDataGrid dustMapDataGrid, MapDataGrid mapDataGrid2, MapDataGrid mapDataGrid3, MapDataGrid mapDataGrid4, List<Object> list, List<CleanTimelineEvent> list2) {
        str.getClass();
        mapDataGrid.getClass();
        list.getClass();
        list2.getClass();
        this.f15969a = str;
        this.f15970b = i13;
        this.f15971c = bVar;
        this.d = mapDataGrid;
        this.e = dustMapDataGrid;
        this.f15972f = mapDataGrid2;
        this.f15973g = mapDataGrid3;
        this.f15974h = mapDataGrid4;
        this.f15975i = list;
        this.f15976j = list2;
    }

    public final int a() {
        List<CleanTimelineEvent.b> list;
        Iterator<CleanTimelineEvent> it = this.f15976j.iterator();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            } else if (it.next().i() == CleanTimelineEvent.b.CLEAN_STARTED) {
                break;
            } else {
                i14++;
            }
        }
        Integer valueOf = Integer.valueOf(i14);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        Iterator<CleanTimelineEvent> it2 = this.f15976j.iterator();
        int i15 = 0;
        while (true) {
            boolean hasNext = it2.hasNext();
            list = f15968k;
            if (!hasNext) {
                i15 = -1;
                break;
            } else if (list.contains(it2.next().i())) {
                break;
            } else {
                i15++;
            }
        }
        Integer valueOf2 = Integer.valueOf(i15);
        if (valueOf2.intValue() == -1) {
            valueOf2 = null;
        }
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : t.g(this.f15976j);
        if (intValue > intValue2) {
            return 0;
        }
        List<CleanTimelineEvent> subList = this.f15976j.subList(intValue, intValue2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            if (list.contains(((CleanTimelineEvent) obj).i())) {
                break;
            }
            arrayList.add(obj);
        }
        int i16 = 0;
        int i17 = 0;
        for (Object obj2 : arrayList) {
            int i18 = i16 + 1;
            if (i16 < 0) {
                t.n();
                throw null;
            }
            CleanTimelineEvent cleanTimelineEvent = (CleanTimelineEvent) obj2;
            if (cleanTimelineEvent.i() == CleanTimelineEvent.b.PAUSED) {
                i17 = i16;
            } else if (cleanTimelineEvent.i() == CleanTimelineEvent.b.CHARGING && i17 + 1 != i16) {
                i13++;
            }
            i16 = i18;
        }
        return i13;
    }

    public final List<CleanTimelineEvent> b() {
        return this.f15976j;
    }

    public final MapDataGrid c() {
        return this.d;
    }

    public final DustMapDataGrid d() {
        return this.e;
    }

    public final Date e(CleanTimelineEvent.b bVar) {
        Object obj;
        Iterator<T> it = this.f15976j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CleanTimelineEvent) obj).i() == bVar) {
                break;
            }
        }
        CleanTimelineEvent cleanTimelineEvent = (CleanTimelineEvent) obj;
        if (cleanTimelineEvent != null) {
            return cleanTimelineEvent.m();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return r.c(this.f15969a, aVar.f15969a) && this.f15970b == aVar.f15970b && r.c(this.f15971c, aVar.f15971c) && r.c(this.d, aVar.d) && r.c(this.e, aVar.e) && r.c(this.f15972f, aVar.f15972f) && r.c(this.f15973g, aVar.f15973g) && r.c(this.f15974h, aVar.f15974h) && r.c(this.f15975i, aVar.f15975i) && r.c(this.f15976j, aVar.f15976j);
        }
        return false;
    }

    public final Date f() {
        CleanTimelineEvent cleanTimelineEvent;
        List<CleanTimelineEvent> list = this.f15976j;
        ListIterator<CleanTimelineEvent> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                cleanTimelineEvent = null;
                break;
            }
            cleanTimelineEvent = listIterator.previous();
            if (cleanTimelineEvent.i() == CleanTimelineEvent.b.RUN_ENDED) {
                break;
            }
        }
        CleanTimelineEvent cleanTimelineEvent2 = cleanTimelineEvent;
        if (cleanTimelineEvent2 != null) {
            return cleanTimelineEvent2.m();
        }
        return null;
    }

    public final MapDataGrid g() {
        return this.f15973g;
    }

    public final String h() {
        return this.f15969a;
    }

    public final int hashCode() {
        int b13 = w.b(this.f15970b, this.f15969a.hashCode() * 31, 31);
        b bVar = this.f15971c;
        int hashCode = (this.d.hashCode() + ((b13 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        DustMapDataGrid dustMapDataGrid = this.e;
        int hashCode2 = (hashCode + (dustMapDataGrid == null ? 0 : dustMapDataGrid.hashCode())) * 31;
        MapDataGrid mapDataGrid = this.f15972f;
        int hashCode3 = (hashCode2 + (mapDataGrid == null ? 0 : mapDataGrid.hashCode())) * 31;
        MapDataGrid mapDataGrid2 = this.f15973g;
        int hashCode4 = (hashCode3 + (mapDataGrid2 == null ? 0 : mapDataGrid2.hashCode())) * 31;
        MapDataGrid mapDataGrid3 = this.f15974h;
        return this.f15976j.hashCode() + tq1.a.h((hashCode4 + (mapDataGrid3 != null ? mapDataGrid3.hashCode() : 0)) * 31, 31, this.f15975i);
    }

    public final b i() {
        return this.f15971c;
    }

    public final Date j() {
        Date e = e(CleanTimelineEvent.b.CLEAN_STARTED);
        if (e == null) {
            Date e13 = e(CleanTimelineEvent.b.RUN_STARTED);
            return e13 == null ? new Date() : e13;
        }
        return e;
    }

    public final String toString() {
        String str = this.f15969a;
        int i13 = this.f15970b;
        b bVar = this.f15971c;
        MapDataGrid mapDataGrid = this.d;
        DustMapDataGrid dustMapDataGrid = this.e;
        MapDataGrid mapDataGrid2 = this.f15972f;
        MapDataGrid mapDataGrid3 = this.f15973g;
        MapDataGrid mapDataGrid4 = this.f15974h;
        List<Object> list = this.f15975i;
        List<CleanTimelineEvent> list2 = this.f15976j;
        StringBuilder m13 = g.m(i13, "CleanMap(id=", str, ", sequenceNumber=", ", persistentMap=");
        m13.append(bVar);
        m13.append(", cleanedFootprint=");
        m13.append(mapDataGrid);
        m13.append(", dustMap=");
        m13.append(dustMapDataGrid);
        m13.append(", lowSensitivityObject=");
        m13.append(mapDataGrid2);
        m13.append(", highSensitivityObject=");
        m13.append(mapDataGrid3);
        m13.append(", zones=");
        m13.append(mapDataGrid4);
        m13.append(", robotPath=");
        m13.append(list);
        m13.append(", cleanTimeline=");
        m13.append(list2);
        m13.append(")");
        return m13.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/a$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.cloud.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0548a {
        public /* synthetic */ C0548a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0548a() {
        }
    }
}
