package com.dyson.mobile.android.audio.home571.sessionhistory.timelinegraph;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.dyson.mobile.android.R;
import com.salesforce.marketingcloud.push.g;
import i12.t;
import ik.a;
import ik.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ym.b;
import zm.e;
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR:\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/sessionhistory/timelinegraph/TimelineGraphView;", "Lik/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lym/b;", "value", "r", "Ljava/util/List;", "getTimelineSessions", "()Ljava/util/List;", "setTimelineSessions", "(Ljava/util/List;)V", "timelineSessions", "Lym/a;", g.f21679k, "Lym/a;", "getSessionSelectedListener", "()Lym/a;", "setSessionSelectedListener", "(Lym/a;)V", "sessionSelectedListener", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimelineGraphView extends a {

    /* renamed from: q  reason: collision with root package name */
    public final e f12659q;

    /* renamed from: r  reason: collision with root package name */
    public List<b> f12660r;

    /* renamed from: s  reason: collision with root package name */
    public ym.a f12661s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineGraphView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        float dimension = context.getResources().getDimension(R.dimen.session_history_graph_view_top_padding);
        float dimension2 = context.getResources().getDimension(R.dimen.session_history_graph_view_bottom_padding);
        float dimension3 = context.getResources().getDimension(R.dimen.session_history_graph_view_right_padding);
        float dimension4 = context.getResources().getDimension(R.dimen.session_history_graph_view_left_padding);
        e eVar = new e(context);
        this.f12659q = eVar;
        getRenderedGraphComponents().addAll(t.h(new tm.b(false, true, context), eVar));
        getTouchableGraphComponents().add(eVar);
        setGraphInsets(new d(dimension, dimension2, dimension4, dimension3));
    }

    public final ym.a getSessionSelectedListener() {
        return this.f12661s;
    }

    public final List<b> getTimelineSessions() {
        return this.f12660r;
    }

    public final void setSessionSelectedListener(ym.a aVar) {
        this.f12661s = aVar;
        this.f12659q.f92863g = aVar;
    }

    public final void setTimelineSessions(List<b> list) {
        this.f12660r = list;
        e eVar = this.f12659q;
        eVar.f92862f = list;
        zm.b bVar = eVar.f92871o;
        int size = list != null ? list.size() : 0;
        ArrayList arrayList = bVar.f92850b;
        while (size > arrayList.size()) {
            Drawable mutate = bVar.f92849a.invoke().mutate();
            mutate.getClass();
            arrayList.add(mutate);
        }
        while (size < arrayList.size()) {
            arrayList.remove(arrayList.size() - 1);
        }
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineGraphView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ TimelineGraphView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
