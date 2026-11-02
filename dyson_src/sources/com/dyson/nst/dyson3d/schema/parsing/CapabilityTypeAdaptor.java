package com.dyson.nst.dyson3d.schema.parsing;

import android.annotation.SuppressLint;
import com.dyson.nst.dyson3d.schema.model.Capability;
import i12.u;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import ma.e;
import o12.a;
import oy1.i0;
import oy1.p;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/parsing/CapabilityTypeAdaptor;", "", "()V", "fromJson", "Lcom/dyson/nst/dyson3d/schema/model/Capability$Type;", "value", "", "toJson", "vector", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CapabilityTypeAdaptor {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Capability.Type.values().length];
            try {
                iArr[Capability.Type.OSCILLATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Capability.Type.AIRFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Capability.Type.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Capability.Type.AIRFLOW_TILT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Capability.Type.BREEZE_MODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Capability.Type.AUTO_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Capability.Type.NIGHT_MODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @p
    @SuppressLint({"EnumNameOrOrdinalReference"})
    public final Capability.Type fromJson(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -991967880:
                if (str.equals("airflow")) {
                    return Capability.Type.AIRFLOW;
                }
                break;
            case -647969224:
                if (str.equals("night-mode")) {
                    return Capability.Type.NIGHT_MODE;
                }
                break;
            case -579210487:
                if (str.equals("connected")) {
                    return Capability.Type.CONNECTED;
                }
                break;
            case 668359701:
                if (str.equals("breeze-mode")) {
                    return Capability.Type.BREEZE_MODE;
                }
                break;
            case 1291011307:
                if (str.equals("oscillation")) {
                    return Capability.Type.OSCILLATION;
                }
                break;
            case 1614918401:
                if (str.equals("auto-mode")) {
                    return Capability.Type.AUTO_MODE;
                }
                break;
            case 1755929074:
                if (str.equals("airflow-tilt")) {
                    return Capability.Type.AIRFLOW_TILT;
                }
                break;
        }
        a<Capability.Type> entries = Capability.Type.getEntries();
        ArrayList arrayList = new ArrayList(u.o(entries, 10));
        for (Capability.Type type : entries) {
            arrayList.add(type.name());
        }
        throw new NoSuchElementException("no type matching : " + str + " in " + arrayList);
    }

    @i0
    public final String toJson(Capability.Type type) {
        type.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return "oscillation";
            case 2:
                return "airflow";
            case 3:
                return "connected";
            case 4:
                return "airflow-tilt";
            case 5:
                return "breeze-mode";
            case 6:
                return "auto-mode";
            case 7:
                return "night-mode";
            default:
                e.o();
                return null;
        }
    }
}
