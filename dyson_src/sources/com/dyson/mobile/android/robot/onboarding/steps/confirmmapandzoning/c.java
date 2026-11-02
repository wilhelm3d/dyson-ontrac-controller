package com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning;

import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.robot.onboarding.steps.OnboardingStep;
import com.dyson.mobile.android.robot.onboarding.steps.OnboardingSteps;
import h12.m;
import h12.t;
import hx.v;
import i12.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.j;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/c;", "", "<init>", "()V", "b", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f16638g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final OnboardingStep f16639a;

    /* renamed from: b  reason: collision with root package name */
    public final OnboardingStep f16640b;

    /* renamed from: c  reason: collision with root package name */
    public final OnboardingStep f16641c;
    public final t d;
    public final t e;

    /* renamed from: f  reason: collision with root package name */
    public final t f16642f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "OOB_CONFIRM_MAP", "OOB_ZONING", "ZONING", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b OOB_CONFIRM_MAP = new b("OOB_CONFIRM_MAP", 0);
        public static final b OOB_ZONING = new b("OOB_ZONING", 1);
        public static final b ZONING = new b("ZONING", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{OOB_CONFIRM_MAP, OOB_ZONING, ZONING};
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

    /* renamed from: com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class C0597c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16643a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.OOB_CONFIRM_MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.OOB_ZONING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.ZONING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16643a = iArr;
        }
    }

    static {
        new a(null);
    }

    public c() {
        LocalisationKey localisationKey = j.H0;
        LocalisationKey localisationKey2 = j.I0;
        OnboardingStep.a aVar = OnboardingStep.a.NEXT;
        this.f16639a = new OnboardingStep("makeSense", 0, localisationKey, localisationKey2, aVar, null, "onboarding_make_sense_of_map.json", 32, null);
        this.f16640b = new OnboardingStep("recognize", 0, j.J0, j.K0, aVar, null, "onboarding_recognise_map.json", 32, null);
        this.f16641c = new OnboardingStep("divide", 0, j.L0, j.M0, aVar, null, "onboarding_divide_map.json", 32, null);
        this.d = m.b(new w12.a(this) { // from class: d41.c
            public final /* synthetic */ com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i13 = r2;
                com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c cVar = this.e;
                switch (i13) {
                    case 0:
                        int i14 = com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c.f16638g;
                        return new OnboardingSteps(s.c(cVar.f16641c));
                    case 1:
                        int i15 = com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c.f16638g;
                        return new OnboardingSteps(i12.t.h(cVar.f16639a, cVar.f16640b));
                    default:
                        int i16 = com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c.f16638g;
                        return new OnboardingSteps(i12.t.h(cVar.f16639a, cVar.f16640b, cVar.f16641c));
                }
            }
        });
        this.e = m.b(new w12.a(this) { // from class: d41.c
            public final /* synthetic */ com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i13 = r2;
                com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c cVar = this.e;
                switch (i13) {
                    case 0:
                        int i14 = com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c.f16638g;
                        return new OnboardingSteps(s.c(cVar.f16641c));
                    case 1:
                        int i15 = com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c.f16638g;
                        return new OnboardingSteps(i12.t.h(cVar.f16639a, cVar.f16640b));
                    default:
                        int i16 = com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c.f16638g;
                        return new OnboardingSteps(i12.t.h(cVar.f16639a, cVar.f16640b, cVar.f16641c));
                }
            }
        });
        this.f16642f = m.b(new w12.a(this) { // from class: d41.c
            public final /* synthetic */ com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i13 = r2;
                com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c cVar = this.e;
                switch (i13) {
                    case 0:
                        int i14 = com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c.f16638g;
                        return new OnboardingSteps(s.c(cVar.f16641c));
                    case 1:
                        int i15 = com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c.f16638g;
                        return new OnboardingSteps(i12.t.h(cVar.f16639a, cVar.f16640b));
                    default:
                        int i16 = com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c.f16638g;
                        return new OnboardingSteps(i12.t.h(cVar.f16639a, cVar.f16640b, cVar.f16641c));
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/c$a;", "", "<init>", "()V", "", "IDENTIFIER_PAGE_0", "Ljava/lang/String;", "IDENTIFIER_PAGE_1", "IDENTIFIER_PAGE_2", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
