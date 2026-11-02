package bk;

import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import i12.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lbk/h;", "", "Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "machineDefinition", "Lpf0/c;", "localisationManager", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDefinition;Lpf0/c;)V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final MachineDefinition f7886a;

    /* renamed from: b  reason: collision with root package name */
    public final pf0.c f7887b;

    static {
        new a(null);
    }

    public h(MachineDefinition machineDefinition, pf0.c cVar) {
        machineDefinition.getClass();
        cVar.getClass();
        this.f7886a = machineDefinition;
        this.f7887b = cVar;
    }

    public final String a(h12.p<String, String> pVar, LocalisationKey localisationKey, LocalisationKey localisationKey2) {
        if (pVar == null) {
            return null;
        }
        String str = pVar.e;
        String str2 = pVar.d;
        LocalisationKey localisationKey3 = rf0.e.f71149k;
        pf0.c cVar = this.f7887b;
        String d = cVar.d(localisationKey3);
        boolean c13 = x12.r.c(str2, str);
        if (c13) {
            localisationKey = localisationKey2;
        }
        String d13 = cVar.d(localisationKey);
        j12.b b13 = i12.s.b();
        b13.add(d13);
        if (!c13) {
            b13.add(cVar.d(rf0.e.f71147i));
        }
        b13.add(d);
        LocalisationKey.f15077f.getClass();
        b13.add(cVar.d(LocalisationKey.a.b(str2)));
        if (!c13) {
            b13.add(cVar.d(rf0.e.f71148j));
            b13.add(d);
            b13.add(cVar.d(LocalisationKey.a.b(str)));
        }
        return c0.W(i12.s.a(b13), ", ", null, null, null, 62);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbk/h$a;", "", "<init>", "()V", "", "SEPARATOR", "Ljava/lang/String;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
