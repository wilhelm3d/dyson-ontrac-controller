package com.dyson.mobile.android.connectionjourney.enablebluetooth;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.logging.Logger;
import e70.b;
import hx.v;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import q8.n;
import rf0.i0;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/enablebluetooth/b;", "Lm9/u;", "Lx50/c;", "bleManager", "Lpf0/c;", "localisationManager", "Le70/b;", "bluetoothStateObserver", "<init>", "(Lx50/c;Lpf0/c;Le70/b;)V", "a", "b", "d", "c", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u {

    /* renamed from: m  reason: collision with root package name */
    public static final int f13470m;

    /* renamed from: n  reason: collision with root package name */
    public static final int f13471n;

    /* renamed from: o  reason: collision with root package name */
    public static final int f13472o;

    /* renamed from: p  reason: collision with root package name */
    public static final int f13473p;
    public final x50.c d;
    public final pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public final e70.b f13474f;

    /* renamed from: g  reason: collision with root package name */
    public final xf1.a<EnumC0423b> f13475g;

    /* renamed from: h  reason: collision with root package name */
    public final xf1.a f13476h;

    /* renamed from: i  reason: collision with root package name */
    public final d f13477i;

    /* renamed from: j  reason: collision with root package name */
    public final f f13478j;

    /* renamed from: k  reason: collision with root package name */
    public final gz1.b f13479k;

    /* renamed from: l  reason: collision with root package name */
    public mz1.e f13480l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/enablebluetooth/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "NAVIGATE_TO_NEXT_SCREEN_IMMEDIATE", "NAVIGATE_TO_NEXT_SCREEN_WITH_ANIMATION", "ON_TURN_ON_BLUETOOTH_CLICKED", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.enablebluetooth.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class EnumC0423b {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ EnumC0423b[] $VALUES;
        public static final EnumC0423b NAVIGATE_TO_NEXT_SCREEN_IMMEDIATE = new EnumC0423b("NAVIGATE_TO_NEXT_SCREEN_IMMEDIATE", 0);
        public static final EnumC0423b NAVIGATE_TO_NEXT_SCREEN_WITH_ANIMATION = new EnumC0423b("NAVIGATE_TO_NEXT_SCREEN_WITH_ANIMATION", 1);
        public static final EnumC0423b ON_TURN_ON_BLUETOOTH_CLICKED = new EnumC0423b("ON_TURN_ON_BLUETOOTH_CLICKED", 2);

        private static final /* synthetic */ EnumC0423b[] $values() {
            return new EnumC0423b[]{NAVIGATE_TO_NEXT_SCREEN_IMMEDIATE, NAVIGATE_TO_NEXT_SCREEN_WITH_ANIMATION, ON_TURN_ON_BLUETOOTH_CLICKED};
        }

        static {
            EnumC0423b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private EnumC0423b(String str, int i13) {
        }

        public static o12.a<EnumC0423b> getEntries() {
            return $ENTRIES;
        }

        public static EnumC0423b valueOf(String str) {
            return (EnumC0423b) Enum.valueOf(EnumC0423b.class, str);
        }

        public static EnumC0423b[] values() {
            return (EnumC0423b[]) $VALUES.clone();
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/enablebluetooth/b$d;", "", "Lq8/n;", "", "Lcom/dyson/mobile/android/utilities/type/ObservableString;", "title", "Landroidx/databinding/ObservableInt;", "imageIcon", "imageCircle", "Landroidx/databinding/ObservableBoolean;", "enableBluetoothButtonEnabled", "enableBluetoothButtonSpinnerVisible", "<init>", "(Lq8/n;Landroidx/databinding/ObservableInt;Landroidx/databinding/ObservableInt;Landroidx/databinding/ObservableBoolean;Landroidx/databinding/ObservableBoolean;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final n<String> f13481a;

        /* renamed from: b  reason: collision with root package name */
        public final ObservableInt f13482b;

        /* renamed from: c  reason: collision with root package name */
        public final ObservableInt f13483c;
        public final ObservableBoolean d;
        public final ObservableBoolean e;

        public d(n<String> nVar, ObservableInt observableInt, ObservableInt observableInt2, ObservableBoolean observableBoolean, ObservableBoolean observableBoolean2) {
            nVar.getClass();
            observableInt.getClass();
            observableInt2.getClass();
            observableBoolean.getClass();
            observableBoolean2.getClass();
            this.f13481a = nVar;
            this.f13482b = observableInt;
            this.f13483c = observableInt2;
            this.d = observableBoolean;
            this.e = observableBoolean2;
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13484a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.TURNING_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.TURNING_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.a.ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.a.OFF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13484a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/enablebluetooth/b$f", "Lcom/dyson/mobile/android/connectionjourney/enablebluetooth/b$c;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements c {
        public f() {
        }

        @Override // com.dyson.mobile.android.connectionjourney.enablebluetooth.b.c
        public final void a() {
            int i13 = b.f13470m;
            b bVar = b.this;
            bVar.T();
            bVar.f13475g.setValue(EnumC0423b.ON_TURN_ON_BLUETOOTH_CLICKED);
        }
    }

    static {
        new a(null);
        f13470m = 2131231694;
        f13471n = 2131233774;
        f13472o = 2131231220;
        f13473p = R.drawable.ic_tick_themed;
    }

    public b(x50.c cVar, pf0.c cVar2, e70.b bVar) {
        cVar.getClass();
        cVar2.getClass();
        bVar.getClass();
        this.d = cVar;
        this.e = cVar2;
        this.f13474f = bVar;
        xf1.a<EnumC0423b> aVar = new xf1.a<>();
        this.f13475g = aVar;
        this.f13476h = aVar;
        this.f13477i = new d(new n(cVar2.d(i0.f71574b2)), new ObservableInt(f13472o), new ObservableInt(f13470m), new ObservableBoolean(true), new ObservableBoolean(false));
        this.f13478j = new f();
        this.f13479k = new gz1.b();
    }

    public final void S(b.a aVar) {
        int i13 = e.f13484a[aVar.ordinal()];
        d dVar = this.f13477i;
        if (i13 == 1 || i13 == 2) {
            dVar.d.m(false);
            dVar.e.m(true);
            return;
        }
        pf0.c cVar = this.e;
        if (i13 == 3) {
            dVar.f13481a.m(cVar.d(i0.f71620e2));
            dVar.f13482b.l(f13473p);
            dVar.f13483c.l(f13471n);
            dVar.d.m(false);
            dVar.e.m(false);
        } else if (i13 != 4) {
            Logger.e("setViewState: Unexpected BluetoothState: " + aVar, null);
        } else {
            dVar.f13481a.m(cVar.d(i0.f71574b2));
            dVar.f13482b.l(f13472o);
            dVar.f13483c.l(f13470m);
            dVar.d.m(true);
            dVar.e.m(false);
        }
    }

    public final void T() {
        Logger.a("startWaitForConnection waiting 30 seconds");
        Logger.a("stopWaitForConnection");
        mz1.e eVar = this.f13480l;
        if (eVar != null) {
            jz1.d.dispose(eVar);
        }
        this.f13480l = dz1.b.B(30L, TimeUnit.SECONDS).r(fz1.a.a()).w(new he0.e(this, 6));
    }

    @Override // m9.u
    public final void onCleared() {
        mz1.e eVar = this.f13480l;
        if (eVar != null) {
            jz1.d.dispose(eVar);
        }
        this.f13479k.e();
        super.onCleared();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/enablebluetooth/b$a;", "", "<init>", "()V", "", "CONNECTING_TIMEOUT_SECONDS", "J", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
