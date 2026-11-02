package com.dyson.mobile.android.robot.home.maincontrol;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.dyson.mobile.android.R;
import h12.m;
import h12.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q8.g;
import yu0.m4;
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/dyson/mobile/android/robot/home/maincontrol/RobotMainControlView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ldt0/a;", "animationSeries", "Lh12/f0;", "setAnimation", "(Ldt0/a;)V", "iconResource", "setIcon", "(I)V", "", "isPulsing", "setPulse", "(Z)V", "isEnabled", "setEnabled", "getImportantForAccessibility", "()I", "Landroid/animation/ObjectAnimator;", "e", "Lh12/l;", "getPulseAnimator", "()Landroid/animation/ObjectAnimator;", "pulseAnimator", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotMainControlView extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f16058f = 0;
    public final m4 d;
    public final t e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            RobotMainControlView robotMainControlView = RobotMainControlView.this;
            robotMainControlView.setAlpha(robotMainControlView.isEnabled() ? 1.0f : 0.3f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotMainControlView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        LayoutInflater from = LayoutInflater.from(context);
        int i14 = m4.f90814f;
        DataBinderMapperImpl dataBinderMapperImpl = g.f66228a;
        m4 m4Var = (m4) q8.t.inflateInternal(from, R.layout.view_robot_control_button, this, true, null);
        m4Var.getClass();
        this.d = m4Var;
        this.e = m.b(new ia0.a(this, 11));
        setAlpha(1.0f);
    }

    private final ObjectAnimator getPulseAnimator() {
        Object value = this.e.getValue();
        value.getClass();
        return (ObjectAnimator) value;
    }

    @Override // android.view.View
    public int getImportantForAccessibility() {
        return 1;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setEnabled(isEnabled());
        }
    }

    public final void setAnimation(dt0.a aVar) {
        aVar.getClass();
        this.d.d.i(aVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z13) {
        super.setEnabled(z13);
        setAlpha(z13 ? 1.0f : 0.3f);
    }

    public final void setIcon(int i13) {
        this.d.e.setImageResource(i13);
    }

    public final void setPulse(boolean z13) {
        if (z13) {
            getPulseAnimator().start();
        } else {
            getPulseAnimator().cancel();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/robot/home/maincontrol/RobotMainControlView$a;", "", "<init>", "()V", "", "ALPHA_ENABLED", "F", "ALPHA_DISABLED", "PULSE_ANIM_MIN_ALPHA", "PULSE_ANIM_MAX_ALPHA", "", "PULSE_ANIM_DURATION", "J", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RobotMainControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RobotMainControlView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ RobotMainControlView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
