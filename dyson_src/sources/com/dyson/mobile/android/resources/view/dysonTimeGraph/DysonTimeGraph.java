package com.dyson.mobile.android.resources.view.dysonTimeGraph;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.resources.view.dysonTimeGraph.DysonTimeGraph;
import com.dyson.mobile.android.resources.view.dysonTimeGraph.internal.DysonCustomLineChart;
import com.github.mikephil.charting.data.Entry;
import fh1.h;
import fh1.i;
import ft0.f;
import ft0.h;
import ft0.i;
import gt0.c;
import h12.f0;
import i12.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh1.d;
import mz1.j;
import oh1.e;
import q8.g;
import q8.t;
import ss0.b1;
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001PB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R.\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\"\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010&\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R.\u0010.\u001a\u0004\u0018\u00010'2\b\u0010\u000b\u001a\u0004\u0018\u00010'8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u00107\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010?\u001a\u0002082\u0006\u0010\u000b\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>RF\u0010I\u001a\u0010\u0012\u0004\u0012\u00020A\u0018\u00010@j\u0004\u0018\u0001`B2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020A\u0018\u00010@j\u0004\u0018\u0001`B8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010M\u001a\u0002082\u0006\u0010\u000b\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010:\u001a\u0004\bK\u0010<\"\u0004\bL\u0010>R$\u0010N\u001a\u0002082\u0006\u0010\u000b\u001a\u0002088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010<\"\u0004\bO\u0010>¨\u0006Q"}, d2 = {"Lcom/dyson/mobile/android/resources/view/dysonTimeGraph/DysonTimeGraph;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lft0/f;", "value", "d", "Lft0/f;", "getGraphDataSet", "()Lft0/f;", "setGraphDataSet", "(Lft0/f;)V", "graphDataSet", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "e", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getOverlayText", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "setOverlayText", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;)V", "overlayText", "Lft0/h;", "f", "Lft0/h;", "getHistoryTimeRange", "()Lft0/h;", "setHistoryTimeRange", "(Lft0/h;)V", "historyTimeRange", "g", "getVisibleTimeRange", "setVisibleTimeRange", "visibleTimeRange", "Lkt0/a;", "h", "Lkt0/a;", "getVisibleTimeRangeChangedListener", "()Lkt0/a;", "setVisibleTimeRangeChangedListener", "(Lkt0/a;)V", "visibleTimeRangeChangedListener", "Lkt0/b;", "listener", "i", "Lkt0/b;", "getOnGraphDataPointSelectedListener", "()Lkt0/b;", "setOnGraphDataPointSelectedListener", "(Lkt0/b;)V", "onGraphDataPointSelectedListener", "", "j", "Z", "getShowRefreshButton", "()Z", "setShowRefreshButton", "(Z)V", "showRefreshButton", "Lkotlin/Function0;", "Lh12/f0;", "Lcom/dyson/mobile/android/resources/view/dysonTimeGraph/listeners/GraphOnRefreshClickedListener;", "k", "Lw12/a;", "getOnGraphRefreshClicked", "()Lw12/a;", "setOnGraphRefreshClicked", "(Lw12/a;)V", "onGraphRefreshClicked", "l", "getDismissHighlight", "setDismissHighlight", "dismissHighlight", "isLoading", "setLoading", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonTimeGraph extends FrameLayout {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f15776p = 0;
    public f d;
    public LocalisationKey e;

    /* renamed from: f  reason: collision with root package name */
    public h f15777f;

    /* renamed from: g  reason: collision with root package name */
    public h f15778g;

    /* renamed from: h  reason: collision with root package name */
    public kt0.a f15779h;

    /* renamed from: i  reason: collision with root package name */
    public kt0.b f15780i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15781j;

    /* renamed from: k  reason: collision with root package name */
    public w12.a<f0> f15782k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15783l;

    /* renamed from: m  reason: collision with root package name */
    public final c f15784m;

    /* renamed from: n  reason: collision with root package name */
    public final gt0.b f15785n;

    /* renamed from: o  reason: collision with root package name */
    public final b1 f15786o;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/dysonTimeGraph/DysonTimeGraph$b", "Lmh1/d;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kt0.b f15788b;

        public b(kt0.b bVar) {
            this.f15788b = bVar;
        }

        @Override // mh1.d
        public final void a() {
            kt0.b bVar = this.f15788b;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // mh1.d
        public final void b(Entry entry, ih1.b bVar) {
            entry.getClass();
            bVar.getClass();
            c cVar = DysonTimeGraph.this.f15784m;
            f0 f0Var = null;
            i iVar = cVar.f36280a != null ? new i(cVar.e(entry.j()), Float.valueOf(entry.i())) : null;
            if (iVar != null) {
                kt0.b bVar2 = this.f15788b;
                if (bVar2 != null) {
                    bVar2.b(iVar);
                    f0Var = f0.f36844a;
                }
                if (f0Var != null) {
                    return;
                }
            }
            a();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonTimeGraph(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        DysonCustomLineChart dysonCustomLineChart;
        context.getClass();
        this.f15783l = true;
        c cVar = new c();
        this.f15784m = cVar;
        gt0.b bVar = new gt0.b(cVar, null, 2, null);
        this.f15785n = bVar;
        LayoutInflater from = LayoutInflater.from(context);
        int i14 = b1.f76820j;
        DataBinderMapperImpl dataBinderMapperImpl = g.f66228a;
        b1 b1Var = (b1) t.inflateInternal(from, R.layout.layout_data_visualisation_graph, this, true, null);
        this.f15786o = b1Var;
        if (b1Var != null) {
            b1Var.l(cVar);
        }
        if (b1Var == null || (dysonCustomLineChart = b1Var.f76821f) == null) {
            return;
        }
        zs0.b.f93103a.getClass();
        dysonCustomLineChart.setAccessibilityDelegate(new zs0.a());
        dysonCustomLineChart.setHighlightPerTapEnabled(false);
        dysonCustomLineChart.setDoubleTapToZoomEnabled(false);
        dysonCustomLineChart.setScaleYEnabled(false);
        dysonCustomLineChart.setMinOffset(0.0f);
        dysonCustomLineChart.getDescription().f31576a = false;
        dysonCustomLineChart.getLegend().f31576a = false;
        dysonCustomLineChart.getXAxis().f31564o = false;
        dysonCustomLineChart.getAxisLeft().f31564o = false;
        dysonCustomLineChart.getAxisRight().f31564o = false;
        dysonCustomLineChart.getAxisLeft().f31566q = false;
        dysonCustomLineChart.getAxisRight().f31566q = false;
        dysonCustomLineChart.getXAxis().f31565p = false;
        dysonCustomLineChart.getAxisLeft().f31565p = false;
        dysonCustomLineChart.getAxisLeft().f31568s = true;
        dysonCustomLineChart.getAxisRight().f31565p = false;
        dysonCustomLineChart.getXAxis().f31566q = true;
        dysonCustomLineChart.getXAxis().C = h.a.BOTTOM;
        dysonCustomLineChart.setNoDataText("");
        oh1.g viewPortHandler = dysonCustomLineChart.getViewPortHandler();
        viewPortHandler.getClass();
        fh1.h xAxis = dysonCustomLineChart.getXAxis();
        xAxis.getClass();
        e a13 = dysonCustomLineChart.a(i.a.LEFT);
        a13.getClass();
        dysonCustomLineChart.setXAxisRenderer(new it0.a(context, viewPortHandler, xAxis, a13, cVar));
        gt0.a aVar = bVar.f36276b;
        aVar.getClass();
        dysonCustomLineChart.setOnChartGestureListener(aVar.f36273b);
        bVar.e = (j) aVar.f36272a.O(new gf1.j(new gf1.i(3, bVar, dysonCustomLineChart), 29));
    }

    public final void a() {
        DysonCustomLineChart dysonCustomLineChart;
        b1 b1Var = this.f15786o;
        if (b1Var == null || (dysonCustomLineChart = b1Var.f76821f) == null) {
            return;
        }
        c cVar = this.f15784m;
        ArrayList arrayList = cVar.f36290m;
        ArrayList arrayList2 = cVar.f36289l;
        if (arrayList != null && arrayList2 != null) {
            Paint paint = dysonCustomLineChart.getRenderer().f57349c;
            paint.getClass();
            float height = dysonCustomLineChart.getViewPortHandler().f60247b.height();
            float f13 = dysonCustomLineChart.getViewPortHandler().f60247b.top;
            paint.setShader(new LinearGradient(0.0f, height + f13, 0.0f, f13, c0.z0(arrayList), c0.x0(arrayList2), Shader.TileMode.CLAMP));
        }
        dysonCustomLineChart.invalidate();
    }

    public final boolean getDismissHighlight() {
        return this.f15783l;
    }

    public final f getGraphDataSet() {
        return this.d;
    }

    public final ft0.h getHistoryTimeRange() {
        return this.f15777f;
    }

    public final kt0.b getOnGraphDataPointSelectedListener() {
        return this.f15780i;
    }

    public final w12.a<f0> getOnGraphRefreshClicked() {
        return this.f15782k;
    }

    public final LocalisationKey getOverlayText() {
        return this.e;
    }

    public final boolean getShowRefreshButton() {
        return this.f15781j;
    }

    public final ft0.h getVisibleTimeRange() {
        return this.f15778g;
    }

    public final kt0.a getVisibleTimeRangeChangedListener() {
        return this.f15779h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f15785n.e;
        if (jVar != null) {
            jz1.d.dispose(jVar);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (i14 != i16) {
            post(new f8.b(this, 1));
        }
    }

    public final void setDismissHighlight(boolean z13) {
        b1 b1Var;
        DysonCustomLineChart dysonCustomLineChart;
        this.f15783l = z13;
        if (!z13 || (b1Var = this.f15786o) == null || (dysonCustomLineChart = b1Var.f76821f) == null) {
            return;
        }
        dysonCustomLineChart.g(null);
    }

    public final void setGraphDataSet(f fVar) {
        DysonCustomLineChart dysonCustomLineChart;
        this.d = fVar;
        c cVar = this.f15784m;
        cVar.f36287j = fVar;
        List<ft0.i> list = fVar != null ? fVar.f32243a : null;
        if (list == null || list.isEmpty()) {
            cVar.f36286i = false;
            cVar.f36280a = 0L;
            cVar.f36288k = new d22.e(0.0f, 1.0f);
            gh1.g f13 = c.f(i12.t.j(i12.t.j(new Entry(0.0f, 0.0f)), i12.t.j(new Entry(24.0f, 0.0f))));
            for (T t13 : f13.f34787i) {
                t13.l();
            }
            cVar.f36281b = f13;
        } else {
            cVar.d(0, null);
            cVar.f36286i = true;
            cVar.f36280a = Long.valueOf(((ft0.i) c0.N(list)).f32248a);
            d22.f<Float> fVar2 = fVar.f32244b;
            float floatValue = (fVar2.n().floatValue() - fVar2.j().floatValue()) * 0.01f;
            cVar.f36288k = new d22.e(fVar2.j().floatValue() - floatValue, fVar2.n().floatValue() + floatValue);
            long j8 = ((ft0.i) c0.N(list)).f32248a;
            ArrayList arrayList = new ArrayList();
            loop0: while (true) {
                boolean z13 = true;
                for (ft0.i iVar : list) {
                    Float f14 = iVar.f32249b;
                    if (f14 != null) {
                        if (z13) {
                            arrayList.add(new ArrayList());
                        }
                        ((List) c0.Y(arrayList)).add(new Entry(((float) (iVar.f32248a - j8)) / ((float) c.f36279q), f14.floatValue()));
                    }
                    if (f14 == null) {
                        break;
                    }
                    z13 = false;
                }
            }
            cVar.f36281b = c.f(arrayList);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            f fVar3 = cVar.f36287j;
            if (fVar3 != null) {
                for (ft0.c cVar2 : fVar3.d) {
                    d22.f<Float> fVar4 = cVar2.f32234a;
                    int i13 = cVar2.f32235b;
                    arrayList2.add(Float.valueOf(cVar.a(fVar4.j().floatValue())));
                    arrayList3.add(Integer.valueOf(i13));
                    arrayList2.add(Float.valueOf(cVar.a(fVar4.n().floatValue())));
                    arrayList3.add(Integer.valueOf(i13));
                }
            }
            cVar.f36289l = arrayList2;
            cVar.f36290m = arrayList3;
        }
        b1 b1Var = this.f15786o;
        if (b1Var == null || (dysonCustomLineChart = b1Var.f76821f) == null) {
            return;
        }
        gh1.g gVar = cVar.f36281b;
        if (gVar != null) {
            dysonCustomLineChart.setData(gVar);
            dysonCustomLineChart.setScaleXEnabled(cVar.f36286i);
            dysonCustomLineChart.invalidate();
            dysonCustomLineChart.k();
            a();
            Context context = dysonCustomLineChart.getContext();
            context.getClass();
            oh1.g viewPortHandler = dysonCustomLineChart.getViewPortHandler();
            viewPortHandler.getClass();
            fh1.i axisLeft = dysonCustomLineChart.getAxisLeft();
            axisLeft.getClass();
            e a13 = dysonCustomLineChart.a(i.a.LEFT);
            a13.getClass();
            dysonCustomLineChart.setRendererLeftYAxis(new jt0.b(context, viewPortHandler, axisLeft, a13, this.f15784m));
            fh1.i axisLeft2 = dysonCustomLineChart.getAxisLeft();
            float f15 = cVar.f36288k.d;
            axisLeft2.f31572w = true;
            axisLeft2.f31575z = f15;
            axisLeft2.A = Math.abs(axisLeft2.f31574y - f15);
            fh1.i axisLeft3 = dysonCustomLineChart.getAxisLeft();
            float f16 = cVar.f36288k.e;
            axisLeft3.f31573x = true;
            axisLeft3.f31574y = f16;
            axisLeft3.A = Math.abs(f16 - axisLeft3.f31575z);
        }
        gt0.e.f36296a.getClass();
        ft0.e b13 = cVar.b(gt0.e.a(dysonCustomLineChart));
        if (b13 != null) {
            cVar.g(b13);
        }
        ht0.a aVar = new ht0.a();
        aVar.f39586c.setValue(aVar, ht0.a.d[0], dysonCustomLineChart);
        dysonCustomLineChart.setMarker(aVar);
    }

    public final void setHistoryTimeRange(ft0.h hVar) {
        DysonCustomLineChart dysonCustomLineChart;
        d22.e c13;
        this.f15777f = hVar;
        c cVar = this.f15784m;
        cVar.f36293p = hVar;
        b1 b1Var = this.f15786o;
        if (b1Var == null || (dysonCustomLineChart = b1Var.f76821f) == null || (c13 = cVar.c(hVar)) == null) {
            return;
        }
        dysonCustomLineChart.invalidate();
        fh1.h xAxis = dysonCustomLineChart.getXAxis();
        float f13 = c13.d;
        xAxis.f31572w = true;
        xAxis.f31575z = f13;
        xAxis.A = Math.abs(xAxis.f31574y - f13);
        fh1.h xAxis2 = dysonCustomLineChart.getXAxis();
        float f14 = c13.e;
        xAxis2.f31573x = true;
        xAxis2.f31574y = f14;
        xAxis2.A = Math.abs(f14 - xAxis2.f31575z);
        dysonCustomLineChart.k();
    }

    public final void setLoading(boolean z13) {
        this.f15784m.f36282c.l(z13 ? 0 : 4);
    }

    public final void setOnGraphDataPointSelectedListener(kt0.b bVar) {
        DysonCustomLineChart dysonCustomLineChart;
        this.f15780i = bVar;
        b1 b1Var = this.f15786o;
        if (b1Var == null || (dysonCustomLineChart = b1Var.f76821f) == null) {
            return;
        }
        dysonCustomLineChart.setOnChartValueSelectedListener(new b(bVar));
    }

    public final void setOnGraphRefreshClicked(w12.a<f0> aVar) {
        this.f15782k = aVar;
        this.f15784m.f36292o = aVar;
    }

    public final void setOverlayText(LocalisationKey localisationKey) {
        this.e = localisationKey;
        this.f15784m.d(1, localisationKey);
    }

    public final void setShowRefreshButton(boolean z13) {
        this.f15781j = z13;
        this.f15784m.e.l(z13 ? 0 : 8);
    }

    public final void setVisibleTimeRange(ft0.h hVar) {
        final DysonCustomLineChart dysonCustomLineChart;
        this.f15778g = hVar;
        c cVar = this.f15784m;
        d22.e c13 = cVar.c(hVar);
        if (c13 != null) {
            float f13 = c13.e;
            float f14 = c13.d;
            b1 b1Var = this.f15786o;
            if (b1Var == null || (dysonCustomLineChart = b1Var.f76821f) == null) {
                Logger.e("no chart to animate", null);
            } else {
                this.f15785n.f36277c = true;
                final i.a aVar = i.a.LEFT;
                fh1.i iVar = dysonCustomLineChart.f26873c0;
                final float f15 = (iVar.A / 2.0f) + iVar.f31575z;
                final float floatValue = Float.valueOf(f14).floatValue();
                final float floatValue2 = 1.0f / (Float.valueOf(f13).floatValue() - Float.valueOf(f14).floatValue());
                final float floatValue3 = (Float.valueOf(f13).floatValue() + Float.valueOf(f14).floatValue()) / 2.0f;
                dysonCustomLineChart.setDragDecelerationFrictionCoef(0.0f);
                dysonCustomLineChart.computeScroll();
                float scaleY = dysonCustomLineChart.getScaleY();
                RectF rectF = dysonCustomLineChart.f26904w.f60247b;
                float f16 = rectF.left;
                float f17 = rectF.top;
                oh1.b b13 = oh1.b.b(0.0d, 0.0d);
                dysonCustomLineChart.a(aVar).c(f16, f17, b13);
                oh1.g gVar = dysonCustomLineChart.f26904w;
                e a13 = dysonCustomLineChart.a(aVar);
                fh1.i iVar2 = dysonCustomLineChart.f26873c0;
                float f18 = dysonCustomLineChart.f26893l.A;
                oh1.g gVar2 = dysonCustomLineChart.f26904w;
                float f19 = gVar2.f60252i;
                float f23 = gVar2.f60253j;
                lh1.c b14 = lh1.c.f52113u.b();
                b14.f52122f = gVar;
                b14.f52123g = floatValue2;
                b14.f52124h = scaleY;
                b14.f52125i = a13;
                b14.f52126j = dysonCustomLineChart;
                b14.f52111l = f19;
                b14.f52112m = f23;
                b14.f52118r = iVar2;
                b14.f52119s = f18;
                ObjectAnimator objectAnimator = b14.f52110k;
                objectAnimator.removeAllListeners();
                objectAnimator.removeAllUpdateListeners();
                objectAnimator.reverse();
                objectAnimator.addUpdateListener(b14);
                objectAnimator.addListener(b14);
                objectAnimator.setDuration(200L);
                dysonCustomLineChart.b(b14);
                oh1.b.c(b13);
                RectF rectF2 = dysonCustomLineChart.f26904w.f60247b;
                float f24 = rectF2.left;
                float f25 = rectF2.top;
                oh1.b b15 = oh1.b.b(0.0d, 0.0d);
                dysonCustomLineChart.a(aVar).c(f24, f25, b15);
                float f26 = dysonCustomLineChart.f26873c0.A;
                oh1.g gVar3 = dysonCustomLineChart.f26904w;
                e a14 = dysonCustomLineChart.a(aVar);
                float f27 = (float) b15.e;
                lh1.a b16 = lh1.a.f52109n.b();
                b16.f52122f = gVar3;
                b16.f52123g = floatValue;
                b16.f52124h = ((f26 / gVar3.f60253j) / 2.0f) + f15;
                b16.f52125i = a14;
                b16.f52126j = dysonCustomLineChart;
                b16.f52111l = f27;
                b16.f52112m = (float) b15.f60225f;
                b16.f52110k.setDuration(200L);
                dysonCustomLineChart.b(b16);
                oh1.b.c(b15);
                dysonCustomLineChart.postDelayed(new Runnable() { // from class: ft0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i13 = DysonTimeGraph.f15776p;
                        DysonCustomLineChart dysonCustomLineChart2 = DysonCustomLineChart.this;
                        dysonCustomLineChart2.setDragDecelerationFrictionCoef(0.9f);
                        i.a aVar2 = i.a.LEFT;
                        i.a aVar3 = aVar;
                        float f28 = aVar3 == aVar2 ? dysonCustomLineChart2.f26873c0.A : dysonCustomLineChart2.f26875d0.A;
                        oh1.g gVar4 = dysonCustomLineChart2.f26904w;
                        float f29 = f15;
                        oh1.e a15 = dysonCustomLineChart2.a(aVar3);
                        lh1.d b17 = lh1.d.f52121k.b();
                        b17.f52122f = gVar4;
                        b17.f52123g = floatValue;
                        b17.f52124h = ((f28 / gVar4.f60253j) / 2.0f) + f29;
                        b17.f52125i = a15;
                        b17.f52126j = dysonCustomLineChart2;
                        dysonCustomLineChart2.b(b17);
                        dysonCustomLineChart2.l(floatValue2, dysonCustomLineChart2.getScaleY(), floatValue3, f29);
                        this.f15785n.f36277c = false;
                    }
                }, 300L);
            }
        }
        if (hVar != null) {
            cVar.g(hVar);
        }
    }

    public final void setVisibleTimeRangeChangedListener(kt0.a aVar) {
        this.f15779h = aVar;
        this.f15785n.d = aVar;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/resources/view/dysonTimeGraph/DysonTimeGraph$a;", "", "<init>", "()V", "", "MIN_ZOOM_RANGE_HOURS", "F", "MAX_ZOOM_RANGE_HOURS", "", "SWITCH_DAY_ANIMATION_DURATION_MS", "J", "SWITCH_DAY_ANIMATION_FINALISE_AFTER_MS", "SMOOTH_SCROLL_DRAG_COEFFICIENT", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonTimeGraph(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonTimeGraph(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DysonTimeGraph(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
