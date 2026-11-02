package com.dyson.mobile.android.resources.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.dyson.mobile.android.resources.view.a;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dyson/mobile/android/resources/view/c;", "Landroid/animation/AnimatorListenerAdapter;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ DysonSeekArc d;
    public final /* synthetic */ a.d e;

    public c(DysonSeekArc dysonSeekArc, a.d dVar) {
        this.d = dysonSeekArc;
        this.e = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        this.d.arcMark.m(this.e);
    }
}
