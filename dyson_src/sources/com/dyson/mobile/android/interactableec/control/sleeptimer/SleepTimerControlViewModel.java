package com.dyson.mobile.android.interactableec.control.sleeptimer;

import android.annotation.SuppressLint;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import com.brightcove.player.video360.SphericalSceneRenderer;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.paypal.android.platform.authsdk.authcommon.AuthAnalyticsConstants;
import e22.m;
import i12.q;
import i12.q0;
import if1.g;
import java.util.Map;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import mz1.i;
import pf0.c;
import q8.n;
import qd0.d;
import rf0.f;
import rf0.i0;
import w90.j;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/sleeptimer/SleepTimerControlViewModel;", "Lm9/u;", "Lqd0/d;", "sleepTimerController", "Lw90/j;", "interactableECDataStore", "Lpf0/c;", "localisationManager", "<init>", "(Lqd0/d;Lw90/j;Lpf0/c;)V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"TimeUnitsSuffix"})
/* loaded from: classes2.dex */
public final class SleepTimerControlViewModel extends u {

    /* renamed from: s  reason: collision with root package name */
    public static final Integer[] f14398s;

    /* renamed from: t  reason: collision with root package name */
    public static final Map<Integer, String> f14399t;
    public final d d;
    public final j e;

    /* renamed from: f  reason: collision with root package name */
    public final c f14400f;

    /* renamed from: g  reason: collision with root package name */
    public final tf1.a f14401g;

    /* renamed from: h  reason: collision with root package name */
    public i f14402h;

    /* renamed from: i  reason: collision with root package name */
    public int f14403i;

    /* renamed from: j  reason: collision with root package name */
    public Timer f14404j;

    /* renamed from: k  reason: collision with root package name */
    public float f14405k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f14406l;

    /* renamed from: m  reason: collision with root package name */
    public final SleepTimerControlViewModel$graduationShown$1 f14407m;

    /* renamed from: n  reason: collision with root package name */
    public final n<CharSequence> f14408n;

    /* renamed from: o  reason: collision with root package name */
    public final n<LocalisationKey> f14409o;

    /* renamed from: p  reason: collision with root package name */
    public final SleepTimerControlViewModel$sleepTimerIndex$1 f14410p;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f14397r = {p0.f86717a.f(new y(SleepTimerControlViewModel.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/interactableec/control/sleeptimer/SleepTimerControlNavigator;", 0))};

    /* renamed from: q  reason: collision with root package name */
    public static final a f14396q = new a(null);

    static {
        String[] strArr = {AuthAnalyticsConstants.DEFAULT_ERROR_CODE, "15m", "30m", "45m", "1h", "2h", "3h", "4h", "5h", "6h", "7h", "8h", "9h"};
        Integer[] numArr = {0, 15, 30, 45, 60, 120, Integer.valueOf((int) SphericalSceneRenderer.SPHERE_SLICES), 240, 300, 360, 420, 480, 540};
        f14398s = numArr;
        f14399t = q0.k(q.g0(numArr, strArr));
    }

    public SleepTimerControlViewModel(d dVar, j jVar, c cVar) {
        dVar.getClass();
        jVar.getClass();
        cVar.getClass();
        this.d = dVar;
        this.e = jVar;
        this.f14400f = cVar;
        this.f14401g = new tf1.a(null, 1, null);
        this.f14407m = new SleepTimerControlViewModel$graduationShown$1(this);
        this.f14408n = new n<>(cVar.d(f.F0));
        this.f14409o = new n<>(i0.D6);
        this.f14410p = new SleepTimerControlViewModel$sleepTimerIndex$1(this);
    }

    public final void S(int i13) {
        int i14 = i13 - 3;
        if (i13 == 0) {
            this.f14408n.m(this.f14400f.d(f.F0));
        } else if (i13 < 4) {
            T(i13 * 15);
        } else {
            T(i14 * 60);
        }
    }

    public final void T(int i13) {
        int i14 = i13 / 60;
        int i15 = i13 % 60;
        c cVar = this.f14400f;
        if (i14 < 1) {
            U(i15, cVar.b(i15, i0.f71849t));
        } else if (i15 == 0) {
            U(i14, cVar.b(i14, i0.f71864u));
        } else {
            this.f14408n.m(i14 + "h " + i15 + "m");
        }
    }

    public final void U(int i13, String str) {
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) g.a("%d%n", Integer.valueOf(i13)));
        int length = append.length();
        append.append((CharSequence) str);
        append.setSpan(new RelativeSizeSpan(0.5f), length, append.length(), 0);
        this.f14408n.m(append);
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        i iVar = this.f14402h;
        if (iVar != null) {
            jz1.d.dispose(iVar);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/sleeptimer/SleepTimerControlViewModel$a;", "", "<init>", "()V", "", "DIAL_RESOLUTION_FOR_MORE_THAN_ONE_HOUR", "I", "DIAL_RESOLUTION_FOR_LESS_THAN_ONE_HOUR", "SIXTY_MINS", "NO_OF_POSITIONS_LESS_THAN_ONE_HOUR", "NO_OF_TIMER_VALUES_LESS_THAN_ONE_HOUR", "", "HIDING_GRADUATION_DELAY_MILLIS", "J", "SLEEP_TIMER_OFF_INDEX", "", "", "S_TIMER_DURATION_TEXTS", "[Ljava/lang/String;", "S_TIMER_DURATION_VALUES", "[Ljava/lang/Integer;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
