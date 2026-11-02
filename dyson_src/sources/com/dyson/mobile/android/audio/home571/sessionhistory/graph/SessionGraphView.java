package com.dyson.mobile.android.audio.home571.sessionhistory.graph;

import android.content.Context;
import android.util.AttributeSet;
import com.dyson.mobile.android.R;
import ft0.j;
import i12.t;
import ik.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lk.c;
import nk.b;
import nk.d;
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR:\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R:\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R:\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R.\u0010%\u001a\u0004\u0018\u00010\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R:\u0010*\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012R*\u00101\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/sessionhistory/graph/SessionGraphView;", "Lik/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Llk/a;", "value", "x", "Ljava/util/List;", "getGraphDataSets", "()Ljava/util/List;", "setGraphDataSets", "(Ljava/util/List;)V", "graphDataSets", "Lft0/j;", "y", "getTooltips", "setTooltips", "tooltips", "Lum/a;", "z", "getGraphHorizontalLines", "setGraphHorizontalLines", "graphHorizontalLines", "Lnk/a;", "A", "Lnk/a;", "getLimitLine", "()Lnk/a;", "setLimitLine", "(Lnk/a;)V", "limitLine", "Lvm/a;", "B", "getGraphNonPurifyingSessions", "setGraphNonPurifyingSessions", "graphNonPurifyingSessions", "C", "I", "getDataAreaRightPadding", "()I", "setDataAreaRightPadding", "(I)V", "dataAreaRightPadding", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionGraphView extends a {
    public nk.a A;
    public List<vm.a> B;
    public int C;

    /* renamed from: q  reason: collision with root package name */
    public final b f12649q;

    /* renamed from: r  reason: collision with root package name */
    public final ok.b f12650r;

    /* renamed from: s  reason: collision with root package name */
    public final c f12651s;

    /* renamed from: t  reason: collision with root package name */
    public final d f12652t;

    /* renamed from: u  reason: collision with root package name */
    public final um.b f12653u;

    /* renamed from: v  reason: collision with root package name */
    public final um.c f12654v;

    /* renamed from: w  reason: collision with root package name */
    public final vm.b f12655w;

    /* renamed from: x  reason: collision with root package name */
    public List<lk.a> f12656x;

    /* renamed from: y  reason: collision with root package name */
    public List<j> f12657y;

    /* renamed from: z  reason: collision with root package name */
    public List<um.a> f12658z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionGraphView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        float dimension = context.getResources().getDimension(R.dimen.session_history_graph_view_top_padding);
        float dimension2 = context.getResources().getDimension(R.dimen.session_history_graph_view_bottom_padding);
        float dimension3 = context.getResources().getDimension(R.dimen.session_history_graph_view_right_padding);
        float dimension4 = context.getResources().getDimension(R.dimen.session_history_graph_view_left_padding);
        b bVar = new b(context);
        this.f12649q = bVar;
        ok.b bVar2 = new ok.b(context);
        this.f12650r = bVar2;
        c cVar = new c(context);
        this.f12651s = cVar;
        d dVar = new d(context);
        this.f12652t = dVar;
        um.b bVar3 = new um.b(context);
        this.f12653u = bVar3;
        um.c cVar2 = new um.c(context);
        this.f12654v = cVar2;
        vm.b bVar4 = new vm.b(context);
        this.f12655w = bVar4;
        tm.b bVar5 = new tm.b(true, false, context);
        getRenderedGraphComponents().addAll(t.h(bVar3, bVar, cVar, bVar5, dVar, bVar4, cVar2, new pk.b(context), bVar2));
        getDataAreaGraphComponents().addAll(t.h(cVar, bVar5, bVar4, bVar2));
        setGraphInsets(new ik.d(dimension, dimension2, dimension4, dimension3));
    }

    public final int getDataAreaRightPadding() {
        return this.C;
    }

    public final List<lk.a> getGraphDataSets() {
        return this.f12656x;
    }

    public final List<um.a> getGraphHorizontalLines() {
        return this.f12658z;
    }

    public final List<vm.a> getGraphNonPurifyingSessions() {
        return this.B;
    }

    public final nk.a getLimitLine() {
        return this.A;
    }

    public final List<j> getTooltips() {
        return this.f12657y;
    }

    public final void setDataAreaRightPadding(int i13) {
        this.C = i13;
        setDataAreaInsets(new ik.d(0.0f, 0.0f, 0.0f, i13 != 0 ? getContext().getResources().getDimension(i13) : 0.0f));
        invalidate();
    }

    public final void setGraphDataSets(List<lk.a> list) {
        this.f12656x = list;
        this.f12651s.f52280g = list;
        invalidate();
    }

    public final void setGraphHorizontalLines(List<um.a> list) {
        this.f12658z = list;
        this.f12653u.e = list;
        this.f12654v.e = list;
        invalidate();
    }

    public final void setGraphNonPurifyingSessions(List<vm.a> list) {
        this.B = list;
        this.f12655w.f84622h = list;
        invalidate();
    }

    public final void setLimitLine(nk.a aVar) {
        this.A = aVar;
        this.f12649q.e = aVar;
        this.f12652t.e = aVar;
        invalidate();
    }

    public final void setTooltips(List<j> list) {
        this.f12657y = list;
        this.f12650r.f60416g = list;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionGraphView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SessionGraphView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
