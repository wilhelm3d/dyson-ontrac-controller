package com.dyson.mobile.android.audio.home571.livedata.graph;

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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR:\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R:\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R.\u0010 \u001a\u0004\u0018\u00010\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010$\u001a\u00020!2\u0006\u0010\f\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/dyson/mobile/android/audio/home571/livedata/graph/HomescreenLiveValueGraphView;", "Lik/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Llk/a;", "value", "v", "Ljava/util/List;", "getGraphDataSets", "()Ljava/util/List;", "setGraphDataSets", "(Ljava/util/List;)V", "graphDataSets", "Lft0/j;", "w", "getTooltips", "setTooltips", "tooltips", "Lnk/a;", "x", "Lnk/a;", "getLimitLine", "()Lnk/a;", "setLimitLine", "(Lnk/a;)V", "limitLine", "", "y", "Z", "isDisplayValueDecimal", "()Z", "setDisplayValueDecimal", "(Z)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomescreenLiveValueGraphView extends a {

    /* renamed from: q  reason: collision with root package name */
    public final b f12640q;

    /* renamed from: r  reason: collision with root package name */
    public final ok.b f12641r;

    /* renamed from: s  reason: collision with root package name */
    public final d f12642s;

    /* renamed from: t  reason: collision with root package name */
    public final c f12643t;

    /* renamed from: u  reason: collision with root package name */
    public final qm.c f12644u;

    /* renamed from: v  reason: collision with root package name */
    public List<lk.a> f12645v;

    /* renamed from: w  reason: collision with root package name */
    public List<j> f12646w;

    /* renamed from: x  reason: collision with root package name */
    public nk.a f12647x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f12648y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomescreenLiveValueGraphView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        float dimension = context.getResources().getDimension(R.dimen.live_graph_view_top_padding);
        float dimension2 = context.getResources().getDimension(R.dimen.live_graph_view_bottom_padding);
        float dimension3 = context.getResources().getDimension(R.dimen.live_graph_view_right_axis_width);
        oc0.c cVar = new oc0.c(this, 25);
        b bVar = new b(context);
        this.f12640q = bVar;
        ok.b bVar2 = new ok.b(context);
        this.f12641r = bVar2;
        d dVar = new d(context);
        this.f12642s = dVar;
        c cVar2 = new c(context);
        this.f12643t = cVar2;
        qm.c cVar3 = new qm.c(context, cVar);
        this.f12644u = cVar3;
        this.f12648y = true;
        getRenderedGraphComponents().addAll(t.h(bVar, new pm.b(context), cVar2, new pm.a(context), dVar, new pk.b(context), cVar3, bVar2));
        setGraphInsets(new ik.d(dimension, dimension2, 0.0f, dimension3));
    }

    public final List<lk.a> getGraphDataSets() {
        return this.f12645v;
    }

    public final nk.a getLimitLine() {
        return this.f12647x;
    }

    public final List<j> getTooltips() {
        return this.f12646w;
    }

    public final void setDisplayValueDecimal(boolean z13) {
        this.f12648y = z13;
        invalidate();
    }

    public final void setGraphDataSets(List<lk.a> list) {
        this.f12645v = list;
        this.f12644u.f67214g = list;
        this.f12643t.f52280g = list;
        invalidate();
    }

    public final void setLimitLine(nk.a aVar) {
        this.f12647x = aVar;
        this.f12640q.e = aVar;
        this.f12642s.e = aVar;
        invalidate();
    }

    public final void setTooltips(List<j> list) {
        this.f12646w = list;
        this.f12641r.f60416g = list;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomescreenLiveValueGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomescreenLiveValueGraphView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ HomescreenLiveValueGraphView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
