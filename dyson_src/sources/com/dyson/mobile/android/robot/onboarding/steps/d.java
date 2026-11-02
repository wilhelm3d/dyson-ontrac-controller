package com.dyson.mobile.android.robot.onboarding.steps;

import com.dyson.mobile.android.robot.onboarding.steps.c;
/* loaded from: classes3.dex */
public final class d implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final c41.b f16659a;

    public d(c41.b bVar) {
        this.f16659a = bVar;
    }

    @Override // com.dyson.mobile.android.robot.onboarding.steps.c.b
    public final c a(OnboardingStep onboardingStep) {
        c41.b bVar = this.f16659a;
        return new c(bVar.f10214a.get(), bVar.f10215b.get(), bVar.f10216c.get(), bVar.d.get(), bVar.e.get(), onboardingStep);
    }
}
