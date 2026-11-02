package f60;

import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectivity.ble.lec.LTKRetrievalException;
import com.dyson.mobile.android.connectivity.ble.lec.UpdateCachedLTKException;
import com.dyson.mobile.android.logging.Logger;
import fa0.p;
import fd0.g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;
import zc0.d0;
/* loaded from: classes2.dex */
public final /* synthetic */ class x implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ x(int i13) {
        this.d = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p.d dVar;
        int i13;
        wa0.b bVar;
        List p13;
        int i14 = 0;
        switch (this.d) {
            case 0:
                Throwable th2 = (Throwable) obj;
                int i15 = y.f30005j;
                th2.getClass();
                return dz1.b.p(new UpdateCachedLTKException(th2));
            case 1:
                c70.a aVar = (c70.a) obj;
                byte[] bArr = j0.f29980c;
                aVar.getClass();
                byte[] h13 = in0.c.h(aVar.a());
                return new h0(h13, u60.b.b(new byte[0], h13, j0.f29980c));
            case 2:
                Throwable th3 = (Throwable) obj;
                byte[] bArr2 = j0.f29980c;
                th3.getClass();
                Logger.a("Failed to retrieve the LTK: " + th3);
                return dz1.x.g(new LTKRetrievalException(th3));
            case 3:
                e22.m<Object>[] mVarArr = fa0.c.f30408j;
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_oscillation);
            case 4:
                fa0.p pVar = (fa0.p) obj;
                e22.m<Object>[] mVarArr2 = fa0.c.f30408j;
                pVar.getClass();
                return pVar instanceof p.d ? ((p.d) pVar).f30480b : "OFF";
            case 5:
                e22.m<Object>[] mVarArr3 = fa0.c.f30408j;
                ((fa0.p) obj).getClass();
                return null;
            case 6:
                e22.m<Object>[] mVarArr4 = fa0.e.f30426k;
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_humidification);
            case 7:
                e22.m<Object>[] mVarArr5 = fa0.f.f30435i;
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_auto);
            case 8:
                e22.m<Object>[] mVarArr6 = fa0.h.f30442k;
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_oscillation);
            case 9:
                fa0.p pVar2 = (fa0.p) obj;
                e22.m<Object>[] mVarArr7 = fa0.h.f30442k;
                pVar2.getClass();
                return pVar2 instanceof p.d ? ((p.d) pVar2).f30480b : "OFF";
            case 10:
                e22.m<Object>[] mVarArr8 = fa0.h.f30442k;
                ((fa0.p) obj).getClass();
                return null;
            case 11:
                int i16 = fa0.i.f30451k;
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_oscillation);
            case 12:
                fa0.p pVar3 = (fa0.p) obj;
                int i17 = fa0.i.f30451k;
                pVar3.getClass();
                return pVar3 instanceof p.d ? "ON" : "OFF";
            case 13:
                int i18 = fa0.j.f30453k;
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_oscillation);
            case 14:
                e22.m<Object>[] mVarArr9 = fa0.m.f30462j;
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_cool);
            case 15:
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_diffuse);
            case 16:
                ((fa0.p) obj).getClass();
                return 0;
            case 17:
                ((fa0.p) obj).getClass();
                return null;
            case 18:
                fa0.p pVar4 = (fa0.p) obj;
                pVar4.getClass();
                if (pVar4 instanceof p.d) {
                    return p.c.f30478a;
                }
                if (pVar4 instanceof p.c) {
                    return new p.d(null, null, 3, null);
                }
                return null;
            case 19:
                ((fa0.p) obj).getClass();
                return h12.f0.f36844a;
            case 20:
                fa0.p pVar5 = (fa0.p) obj;
                int i19 = fa0.t.f30491g;
                pVar5.getClass();
                if (pVar5.equals(p.c.f30478a)) {
                    dVar = new p.d(d0.b.FORWARD, null, 2, null);
                } else {
                    d0.b bVar2 = d0.b.FORWARD;
                    if (pVar5.equals(new p.d(bVar2, null, 2, null))) {
                        dVar = new p.d(d0.b.BACKWARD, null, 2, null);
                    } else if (!pVar5.equals(new p.d(d0.b.BACKWARD, null, 2, null))) {
                        return null;
                    } else {
                        dVar = new p.d(bVar2, null, 2, null);
                    }
                }
                return dVar;
            case 21:
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_night);
            case 22:
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_power);
            case 23:
                int i23 = fa0.z.f30505j;
                ((fa0.p) obj).getClass();
                return Integer.valueOf((int) R.drawable.ic_ec_control_timer);
            case 24:
                fa0.p pVar6 = (fa0.p) obj;
                int i24 = fa0.z.f30505j;
                pVar6.getClass();
                return pVar6 instanceof p.d ? ((p.d) pVar6).f30480b : "OFF";
            case 25:
                int i25 = fa0.z.f30505j;
                ((fa0.p) obj).getClass();
                return null;
            case 26:
                fa0.p pVar7 = (fa0.p) obj;
                int i26 = fa0.b0.f30406j;
                pVar7.getClass();
                return Integer.valueOf(!(pVar7 instanceof p.d) ? R.drawable.ic_ec_control_timer_off : 0);
            case 27:
                fa0.p pVar8 = (fa0.p) obj;
                int i27 = fa0.b0.f30406j;
                pVar8.getClass();
                if (pVar8 instanceof p.d) {
                    return ((p.d) pVar8).f30480b;
                }
                return null;
            case 28:
                int i28 = fa0.b0.f30406j;
                ((fa0.p) obj).getClass();
                return null;
            default:
                String str = (String) obj;
                g.a aVar2 = fd0.g.e;
                str.getClass();
                long j8 = fd0.g.f30615f;
                JSONObject jSONObject = new JSONObject(str);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                Date parse = simpleDateFormat.parse(jSONObject.getString("start_time"));
                if (parse == null) {
                    pa.c.p("Required value was null.");
                    return null;
                }
                long time = parse.getTime() + j8;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, wa0.c> entry : fd0.g.f30616g.entrySet()) {
                    wa0.c value = entry.getValue();
                    JSONArray optJSONArray = jSONObject.optJSONArray(entry.getKey());
                    if (optJSONArray == null || (p13 = u32.v.p(u32.v.n(i12.c0.E(d22.p.n(i14, optJSONArray.length())), new gf1.c(optJSONArray, 1)))) == null) {
                        i13 = i14;
                        bVar = null;
                    } else {
                        ArrayList arrayList = new ArrayList(i12.u.o(p13, 10));
                        int i29 = i14;
                        for (Object obj2 : p13) {
                            int i33 = i29 + 1;
                            if (i29 < 0) {
                                i12.t.n();
                                throw null;
                            }
                            Float f13 = (Float) obj2;
                            int i34 = i14;
                            long j13 = (i29 * j8) + time;
                            if (f13 == null || Math.abs(f13.floatValue()) > Float.MAX_VALUE) {
                                f13 = null;
                            }
                            arrayList.add(new ft0.i(j13, f13));
                            i14 = i34;
                            i29 = i33;
                        }
                        i13 = i14;
                        bVar = new wa0.b();
                        bVar.addAll(arrayList);
                    }
                    if (bVar != null) {
                        linkedHashMap.put(value, bVar);
                    }
                    i14 = i13;
                }
                return new wa0.a(linkedHashMap);
        }
    }

    public /* synthetic */ x(Object obj, int i13) {
        this.d = i13;
    }
}
