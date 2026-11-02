package com.dyson.mobile.android.robot.onboarding;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.robot.onboarding.steps.OnboardingStep;
import java.util.List;
import kotlin.Metadata;
import se1.y;
import x12.r;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/b;", "Lqb/a;", "Lcu0/a;", "Lse1/y;", "resourcesProvider", "Landroidx/fragment/app/Fragment;", "hostFragment", "", "coordinatorId", "<init>", "(Lse1/y;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends qb.a implements cu0.a {

    /* renamed from: j  reason: collision with root package name */
    public final y f16561j;

    /* renamed from: k  reason: collision with root package name */
    public final String f16562k;

    /* renamed from: l  reason: collision with root package name */
    public List<OnboardingStep> f16563l;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface a {
        b a(Fragment fragment, String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y yVar, Fragment fragment, String str) {
        super(fragment);
        yVar.getClass();
        fragment.getClass();
        str.getClass();
        this.f16561j = yVar;
        this.f16562k = str;
    }

    @Override // cu0.a
    public final Drawable b() {
        return c7.a.e(this.f16561j.f76070a, R.drawable.ic_filled_circle);
    }

    @Override // qb.a
    public final com.dyson.mobile.android.robot.onboarding.steps.b f(int i13) {
        List<OnboardingStep> list = this.f16563l;
        if (list == null) {
            r.i("onboardingSteps");
            throw null;
        }
        OnboardingStep onboardingStep = list.get(i13);
        com.dyson.mobile.android.robot.onboarding.steps.b.f16595g.getClass();
        String str = this.f16562k;
        str.getClass();
        onboardingStep.getClass();
        com.dyson.mobile.android.robot.onboarding.steps.b bVar = new com.dyson.mobile.android.robot.onboarding.steps.b();
        Bundle bundle = new Bundle();
        bundle.putString("COORDINATOR_ID", str);
        bundle.putParcelable("ONBOARDING_STEP", onboardingStep);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        List<OnboardingStep> list = this.f16563l;
        if (list != null) {
            return list.size();
        }
        r.i("onboardingSteps");
        throw null;
    }
}
