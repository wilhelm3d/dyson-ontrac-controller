package ek;

import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import kotlin.Metadata;
import rf0.i0;
import rf0.q;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lek/a;", "Lek/c;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: ek.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class C0918a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27260a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f27261b;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.PRE_CALIBRATION_EAR_CUSHIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.CALIBRATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.BLE_BONDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.HOW_TO_RESTART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.HOW_TO_SWITCH_ON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.ANC_ISOLATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.ANC_TRANSPARENCY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e.ANC_OFF.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[e.ANC_CONVERSATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[e.ANC_ON_CALL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[e.ANC_NOT_CONNECTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[e.ANC_CONTROL_ISOLATION_ICON.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[e.ANC_CONTROL_TRANSPARENCY_ICON.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[e.ANC_CONTROL_OFF_ICON.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[e.EQ_GRAPH_ENHANCED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[e.EQ_GRAPH_BASS_BOOST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[e.EQ_GRAPH_NEUTRAL.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[e.EQ_CONTROL_ENHANCED_ICON.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[e.EQ_CONTROL_BASS_BOOST_ICON.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[e.EQ_CONTROL_NEUTRAL_ICON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[e.RESET.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f27260a = iArr;
            int[] iArr2 = new int[f.values().length];
            try {
                iArr2[f.SETTINGS_ACCESSORIES_TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[f.SETTINGS_EAR_CUSHIONS_TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[f.PRECALIBRATION_EAR_CUSHIONS_TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[f.PRECALIBRATION_EAR_CUSHIONS_DESCRIPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[f.PRECALIBRATION_EAR_CUSHIONS_DESCRIPTION_EXTENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[f.PRECALIBRATION_EAR_CUSHIONS_ACTION_BUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[f.RECALIBRATE_TITLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[f.RECALIBRATE_HEADER.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[f.RECALIBRATE_DESCRIPTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[f.RECALIBRATE_DESCRIPTION_EXTENDED.ordinal()] = 10;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[f.RECALIBRATE_BUTTON.ordinal()] = 11;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[f.CALIBRATION_FAILURE_TITLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[f.SOUND_CONTROL_NOISE_CANCELLATION_OFF_MODE_DESCRIPTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused34) {
            }
            f27261b = iArr2;
        }
    }

    @Override // ek.c
    public final LocalisationKey a(f fVar) {
        fVar.getClass();
        switch (C0918a.f27261b[fVar.ordinal()]) {
            case 1:
                return i0.f71701j5;
            case 2:
                return q.H0;
            case 3:
                return q.H0;
            case 4:
                return q.R0;
            case 5:
                return q.S0;
            case 6:
                return q.T0;
            case 7:
                return q.H0;
            case 8:
                return q.U0;
            case 9:
                return q.V0;
            case 10:
                return q.W0;
            case 11:
                return q.X0;
            case 12:
                return q.H0;
            case 13:
                return q.f72418l2;
            default:
                ma.e.o();
                return null;
        }
    }

    @Override // ek.c
    public final boolean b() {
        return false;
    }

    @Override // ek.c
    public final int c(e eVar) {
        eVar.getClass();
        switch (C0918a.f27260a[eVar.ordinal()]) {
            case 1:
                return R.drawable.ear_cushion_replacement_571;
            case 2:
                return R.drawable.recalibrate_571;
            case 3:
                return 2131231703;
            case 4:
            case 5:
                return -1;
            case 6:
                return R.drawable.anc_isolation_571;
            case 7:
                return R.drawable.anc_transparency_571;
            case 8:
                return R.drawable.anc_off_571;
            case 9:
                return R.drawable.anc_conversation_571;
            case 10:
                return R.drawable.anc_on_call_571;
            case 11:
                return R.drawable.anc_off_571;
            case 12:
                return R.drawable.ic_anc_isolation;
            case 13:
                return R.drawable.ic_anc_transparency;
            case 14:
                return R.drawable.ic_off;
            case 15:
                return 2131231500;
            case 16:
                return 2131231498;
            case 17:
                return 2131231502;
            case 18:
                return R.drawable.ic_eq_enhanced;
            case 19:
                return R.drawable.ic_eq_bassboost;
            case 20:
                return R.drawable.ic_eq_neutral;
            case 21:
                return R.drawable.ic_reset_571;
            default:
                ma.e.o();
                return 0;
        }
    }
}
