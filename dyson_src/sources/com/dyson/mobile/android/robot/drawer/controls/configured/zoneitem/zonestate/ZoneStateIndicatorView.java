package com.dyson.mobile.android.robot.drawer.controls.configured.zoneitem.zonestate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dyson.mobile.android.R;
import hv0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q8.g;
import q8.t;
import yu0.g4;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/robot/drawer/controls/configured/zoneitem/zonestate/ZoneStateIndicatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lhv0/b;", "viewModel", "Lh12/f0;", "setZoneStateViewModel", "(Lhv0/b;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZoneStateIndicatorView extends ConstraintLayout {
    public final g4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneStateIndicatorView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        t c13 = g.c(LayoutInflater.from(context), R.layout.layout_zone_state_indicator, this, true, null);
        c13.getClass();
        this.d = (g4) c13;
    }

    public final void setZoneStateViewModel(b bVar) {
        bVar.getClass();
        this.d.l(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoneStateIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoneStateIndicatorView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ZoneStateIndicatorView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
