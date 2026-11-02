package com.dyson.mobile.android.machine.traits.historicdata;

import ak0.f;
import al0.c;
import ap1.w;
import b0.y1;
import c42.u1;
import c42.w1;
import dl0.e;
import fl0.m;
import hx.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import rz1.d1;
import rz1.n;
import x12.r;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/machine/traits/historicdata/HistoricDataSynchronizer;", "", "Ldl0/e;", "historicDataUploader", "Lal0/c;", "historicDataRetriever", "Lfl0/m;", "recordsToUploadStore", "Lzk0/b;", "attemptUpdaterFactory", "Lak0/f;", "telemetryTransferLogTracker", "Lwf0/a;", "backgroundActiveStatusProvider", "<init>", "(Ldl0/e;Lal0/c;Lfl0/m;Lzk0/b;Lak0/f;Lwf0/a;)V", "SynchronizationFailureException", "b", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HistoricDataSynchronizer {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f15315j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final e f15316a;

    /* renamed from: b  reason: collision with root package name */
    public final c f15317b;

    /* renamed from: c  reason: collision with root package name */
    public final m f15318c;
    public final zk0.b d;
    public final f e;

    /* renamed from: f  reason: collision with root package name */
    public final wf0.a f15319f;

    /* renamed from: g  reason: collision with root package name */
    public zk0.a f15320g;

    /* renamed from: h  reason: collision with root package name */
    public final u1 f15321h;

    /* renamed from: i  reason: collision with root package name */
    public final d1 f15322i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/traits/historicdata/HistoricDataSynchronizer$SynchronizationFailureException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Lcom/dyson/mobile/android/machine/traits/historicdata/HistoricDataSynchronizer$b;", "failureReasons", "<init>", "(Ljava/util/List;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SynchronizationFailureException extends RuntimeException {
        public final List<b> d;

        /* JADX WARN: Multi-variable type inference failed */
        public SynchronizationFailureException(List<? extends b> list) {
            list.getClass();
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SynchronizationFailureException) && r.c(this.d, ((SynchronizationFailureException) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return y1.l("SynchronizationFailureException(failureReasons=", ")", this.d);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/traits/historicdata/HistoricDataSynchronizer$b;", "", "<init>", "(Ljava/lang/String;I)V", "UPLOAD_ERROR", "CONNECTION_ISSUE", "NOT_ALLOWED_UPDATE_IN_PROGRESS_ISSUE", "OTHER_ISSUE", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b UPLOAD_ERROR = new b("UPLOAD_ERROR", 0);
        public static final b CONNECTION_ISSUE = new b("CONNECTION_ISSUE", 1);
        public static final b NOT_ALLOWED_UPDATE_IN_PROGRESS_ISSUE = new b("NOT_ALLOWED_UPDATE_IN_PROGRESS_ISSUE", 2);
        public static final b OTHER_ISSUE = new b("OTHER_ISSUE", 3);

        private static final /* synthetic */ b[] $values() {
            return new b[]{UPLOAD_ERROR, CONNECTION_ISSUE, NOT_ALLOWED_UPDATE_IN_PROGRESS_ISSUE, OTHER_ISSUE};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private b(String str, int i13) {
        }

        public static o12.a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    static {
        new a(null);
    }

    public HistoricDataSynchronizer(e eVar, c cVar, m mVar, zk0.b bVar, f fVar, wf0.a aVar) {
        eVar.getClass();
        cVar.getClass();
        mVar.getClass();
        bVar.getClass();
        fVar.getClass();
        aVar.getClass();
        this.f15316a = eVar;
        this.f15317b = cVar;
        this.f15318c = mVar;
        this.d = bVar;
        this.e = fVar;
        this.f15319f = aVar;
        this.f15321h = w1.b(0, 1, null, 4);
        w wVar = new w(this, 25);
        b.a aVar2 = kz1.b.f50218a;
        this.f15322i = new n(wVar).S(c02.a.f10004c).K();
    }

    public final d1 a(zk0.a aVar) {
        aVar.getClass();
        this.f15320g = aVar;
        this.e.f1437k.c(aVar.getDisplayName());
        d1 d1Var = this.f15322i;
        d1Var.getClass();
        return d1Var;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/traits/historicdata/HistoricDataSynchronizer$a;", "", "<init>", "()V", "", "ENTIRE_PROCESS_TIMEOUT_SECONDS", "J", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
