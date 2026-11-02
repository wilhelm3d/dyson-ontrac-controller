package com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.brightcove.player.event.Event;
import com.brightcove.player.model.Video;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.c;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g;
import com.dyson.mobile.android.resources.brightcove.DysonBrightcoveVideoPlayerView;
import h12.f0;
import h12.l;
import h12.n;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import m9.w;
import x12.m;
import x12.p;
import x12.p0;
import x12.q0;
import x12.r;
import x12.t;
import y9.u;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/chapteredguide/ExpertContentChapteredGuideFragment;", "Lms0/h;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpertContentChapteredGuideFragment extends ms0.h {
    public g.b e;

    /* renamed from: f  reason: collision with root package name */
    public final u f15116f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f15117g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a extends p implements Function1<com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.c, f0> {
        public a(Object obj) {
            super(1, obj, com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g.class, "onEvent", "onEvent(Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/chapteredguide/ExpertContentChapterGuideEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.c cVar) {
            com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.c cVar2 = cVar;
            cVar2.getClass();
            com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g gVar = (com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g) this.receiver;
            gVar.getClass();
            if (cVar2 instanceof c.a) {
                gVar.f15140i.setValue(f0.f36844a);
            } else if (cVar2 instanceof c.b) {
                gVar.f15141j.setValue(f0.f36844a);
            } else if (cVar2 instanceof c.d) {
                gVar.S(0);
            } else if (cVar2 instanceof c.C0508c) {
                int i13 = ((c.C0508c) cVar2).f15131a;
                int size = gVar.f15139h.getVideos().size() - 1;
                if ((i13 == 0 ? g.c.FIRST : (1 > i13 || i13 >= size) ? i13 == size ? g.c.LAST : g.c.OTHER : g.c.MIDDLE) != g.c.OTHER) {
                    gVar.S(i13);
                }
            } else if (!(cVar2 instanceof c.e)) {
                ma.e.o();
                return null;
            } else {
                c.e eVar = (c.e) cVar2;
                Event event = eVar.f15133a;
                Video video = eVar.f15134b;
                if (video != null) {
                    gVar.f15138g.a(video, event);
                }
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements m9.p, m {
        public final /* synthetic */ Function1 d;

        public b(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h12.h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof m9.p) && (obj instanceof m)) {
                return r.c(d(), ((m) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return d().hashCode();
        }

        @Override // m9.p
        public final /* synthetic */ void onChanged(Object obj) {
            this.d.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements w12.a<Fragment> {
        public final /* synthetic */ Fragment d;

        public c(Fragment fragment) {
            this.d = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements w12.a<Bundle> {
        public static final d d = new d();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ w12.a e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f15118f;

        public e(w12.a aVar, w12.a aVar2, Function1 function1) {
            this.d = aVar;
            this.e = aVar2;
            this.f15118f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Fragment fragment = (Fragment) this.d.invoke();
            Bundle bundle = (Bundle) this.e.invoke();
            if (bundle == null) {
                bundle = fragment.getArguments();
            }
            return ef1.d.a(fragment, bundle, this.f15118f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f15119f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f15119f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f15119f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15120f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar) {
            super(0);
            this.f15120f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f15120f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class h extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f15121f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l lVar) {
            super(0);
            this.f15121f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f15121f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class i extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15122f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f15123g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w12.a aVar, l lVar) {
            super(0);
            this.f15122f = aVar;
            this.f15123g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f15122f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f15123g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j implements w12.a<Bundle> {
        public final /* synthetic */ Fragment d;

        public j(Fragment fragment) {
            this.d = fragment;
        }

        @Override // w12.a
        public final Bundle invoke() {
            Fragment fragment = this.d;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            pa.c.w(y.i("Fragment ", fragment, " has null arguments"));
            return null;
        }
    }

    public ExpertContentChapteredGuideFragment() {
        q0 q0Var = p0.f86717a;
        this.f15116f = new u(q0Var.b(ki0.c.class), new j(this));
        e eVar = new e(new c(this), d.d, new ki0.a(this, 0));
        l a13 = h12.m.a(n.NONE, new g(new f(this)));
        this.f15117g = new d0(q0Var.b(com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g.class), new h(a13), eVar, new i(null, a13));
    }

    @Override // ms0.h, com.brightcove.player.appcompat.BrightcovePlayerFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        uf0.g a13 = uf0.g.a(getContext());
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        sg0.b bVar = a13.f81922a;
        this.e = (g.b) bVar.D0.f88315a;
        bVar.f76110n.get();
        Lifecycle lifecycle = getLifecycle();
        d0 d0Var = this.f15117g;
        lifecycle.a((com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g) d0Var.getValue());
        Context requireContext = requireContext();
        requireContext.getClass();
        this.d = new DysonBrightcoveVideoPlayerView(requireContext, null, 0, 6, null);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        ComposeView composeView = new ComposeView(requireContext2, null, 0, 6, null);
        composeView.setContent(new c4.c(687689299, true, new ki0.b(this, 0)));
        ((com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g) d0Var.getValue()).f15140i.observe(getViewLifecycleOwner(), new b(new ki0.a(this, 1)));
        ((com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g) d0Var.getValue()).f15141j.observe(getViewLifecycleOwner(), new b(new ki0.a(this, 2)));
        return composeView;
    }

    @Override // ms0.h, com.brightcove.player.appcompat.BrightcovePlayerFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        androidx.fragment.app.e activity = getActivity();
        activity.getClass();
        ActionBar supportActionBar = ((l.b) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w();
        }
    }
}
