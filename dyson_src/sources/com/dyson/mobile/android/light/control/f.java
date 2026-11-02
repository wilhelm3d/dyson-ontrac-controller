package com.dyson.mobile.android.light.control;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.control.e;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.resources.view.DysonToggleImageButton;
import java.util.ArrayList;
import je0.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/light/control/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/dyson/mobile/android/light/control/f$b;", "Lcom/dyson/mobile/android/light/control/g;", "viewModel", "Lpf0/c;", "localisationManager", "Log0/a;", "machineDataObject", "<init>", "(Lcom/dyson/mobile/android/light/control/g;Lpf0/c;Log0/a;)V", "a", "b", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends RecyclerView.h<b> {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f14841h = 0;

    /* renamed from: a  reason: collision with root package name */
    public final g f14842a;

    /* renamed from: b  reason: collision with root package name */
    public final pf0.c f14843b;

    /* renamed from: c  reason: collision with root package name */
    public final og0.a f14844c;
    public int d;
    public ArrayList<e> e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14845f;

    /* renamed from: g  reason: collision with root package name */
    public int f14846g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/control/f$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lje0/l1;", "binding", "<init>", "(Lje0/l1;)V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final l1 f14847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l1 l1Var) {
            super(l1Var.getRoot());
            l1Var.getClass();
            this.f14847a = l1Var;
        }
    }

    static {
        new a(null);
    }

    public f(g gVar, pf0.c cVar, og0.a aVar) {
        gVar.getClass();
        cVar.getClass();
        aVar.getClass();
        this.f14842a = gVar;
        this.f14843b = cVar;
        this.f14844c = aVar;
        this.d = -1;
        this.e = new ArrayList<>();
        this.f14846g = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(b bVar, final int i13) {
        b bVar2 = bVar;
        bVar2.getClass();
        final l1 l1Var = bVar2.f14847a;
        e eVar = this.e.get(i13);
        eVar.getClass();
        e eVar2 = eVar;
        g gVar = this.f14842a;
        l1Var.s(gVar);
        DysonToggleImageButton dysonToggleImageButton = l1Var.f44678f;
        if (eVar2 instanceof e.d) {
            e.d dVar = (e.d) eVar2;
            l1Var.n(this.f14843b.d(this.f14844c.b(dVar.d())));
            l1Var.m(Integer.valueOf(dVar.b()));
        } else if (!(eVar2 instanceof e.c)) {
            ma.e.o();
            return;
        } else {
            l1Var.n(((e.c) eVar2).e());
            l1Var.m(Integer.valueOf((int) R.drawable.button_custom));
        }
        l1Var.l(Float.valueOf((i13 == this.e.size() && gVar.f14868z) ? 0.4f : 1.0f));
        l1Var.r(Boolean.valueOf(i13 == this.f14846g));
        l1Var.q(Boolean.valueOf(i13 != this.f14846g && this.f14845f));
        dysonToggleImageButton.setChecked(i13 == this.d);
        dysonToggleImageButton.setOnClickListener(new View.OnClickListener() { // from class: ie0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.dyson.mobile.android.light.control.f fVar = this;
                com.dyson.mobile.android.light.control.g gVar2 = fVar.f14842a;
                com.dyson.mobile.android.light.control.e eVar3 = fVar.e.get(i13);
                eVar3.getClass();
                com.dyson.mobile.android.light.control.e eVar4 = eVar3;
                lf0.a aVar = gVar2.e;
                gVar2.f14859q.l(0);
                e.b.f14831a.getClass();
                if (!eVar4.equals(e.b.f14834f)) {
                    e.d dVar2 = e.b.f14832b;
                    if (eVar4.equals(dVar2)) {
                        gVar2.f(dVar2);
                        com.dyson.mobile.android.light.control.f fVar2 = gVar2.C;
                        fVar2.d = 0;
                        fVar2.notifyDataSetChanged();
                        aVar.J(true).g(new he0.d(gVar2, 1)).v();
                    } else if (eVar4.equals(e.b.f14833c) || eVar4.equals(e.b.d) || eVar4.equals(e.b.e)) {
                        gVar2.f((e.d) eVar4);
                        gVar2.E.a(aVar.U(eVar4).o(new b(new i81.d(2, gVar2, eVar4), 5)).w(new o(gVar2, 0)));
                    } else {
                        e.c cVar = (e.c) eVar4;
                        gVar2.e(cVar.c(), cVar.b());
                        gVar2.f14865w = false;
                        gVar2.h(gVar2.f14866x, gVar2.f14867y, false);
                        yd0.d dVar3 = gVar2.f14849g;
                        String str = gVar2.d;
                        boolean a13 = eVar4.a();
                        dVar3.f89784a.putBoolean(str.concat("_task_mode_on"), a13);
                    }
                } else if (gVar2.f14868z) {
                    com.dyson.mobile.android.light.control.h b13 = gVar2.b();
                    if (b13 != null) {
                        b13.d();
                    } else {
                        Logger.e("Navigator is null", null);
                    }
                } else {
                    com.dyson.mobile.android.light.control.h b14 = gVar2.b();
                    if (b14 != null) {
                        b14.b(gVar2.f14866x, gVar2.f14867y, gVar2.f14865w);
                    } else {
                        Logger.e("Navigator is null", null);
                    }
                }
                l1Var.f44678f.setChecked(true);
            }
        });
        dysonToggleImageButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: ie0.k
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i13;
                if (i14 < 4) {
                    int i15 = com.dyson.mobile.android.light.control.f.f14841h;
                    return false;
                }
                com.dyson.mobile.android.light.control.f fVar = this;
                if (i14 != fVar.e.size() - 1) {
                    fVar.f14842a.B.m(true);
                    l1Var.r(Boolean.TRUE);
                    fVar.f14845f = true;
                    fVar.f14846g = i14;
                    fVar.notifyDataSetChanged();
                    return true;
                }
                return false;
            }
        });
        l1Var.d.setOnClickListener(new bu1.d(3, this, eVar2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final b onCreateViewHolder(ViewGroup viewGroup, int i13) {
        viewGroup.getClass();
        l1 l1Var = (l1) q8.g.c(LayoutInflater.from(viewGroup.getContext()), R.layout.item_modes_light, viewGroup, false, null);
        l1Var.getClass();
        return new b(l1Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/light/control/f$a;", "", "<init>", "()V", "", "LIMIT_REACHED_BUTTON_ALPHA", "F", "DEFAULT_BUTTON_ALPHA", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
