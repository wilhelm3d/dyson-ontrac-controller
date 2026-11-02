package com.dyson.mobile.android.support.forsta.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.j;
import androidx.lifecycle.ViewModelProvider;
import com.dyson.mobile.android.support.forsta.ForstaSurveyConfig;
import com.dyson.mobile.android.support.forsta.survey.d;
import e71.n;
import f.g;
import f.x;
import h12.f0;
import h12.r;
import java.util.List;
import k30.n;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import n12.i;
import r3.k9;
import se1.q0;
import u3.p1;
import vk.f;
import we1.a;
import x12.p;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/ForstaSurveyActivity;", "Lf/g;", "<init>", "()V", "Inputs", "a", "Lcom/dyson/mobile/android/support/forsta/survey/d$d;", "uiState", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ForstaSurveyActivity extends g {

    /* renamed from: k  reason: collision with root package name */
    public static final a f16825k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public Inputs f16826j;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/ForstaSurveyActivity$Inputs;", "Landroid/os/Parcelable;", "", "", "machineTypeNames", "Lcom/dyson/mobile/android/support/forsta/ForstaSurveyConfig;", "surveyConfig", "<init>", "(Ljava/util/List;Lcom/dyson/mobile/android/support/forsta/ForstaSurveyConfig;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Inputs implements Parcelable {
        public static final Parcelable.Creator<Inputs> CREATOR = new a();
        public final List<String> d;
        public final ForstaSurveyConfig e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<Inputs> {
            @Override // android.os.Parcelable.Creator
            public final Inputs createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Inputs(parcel.createStringArrayList(), ForstaSurveyConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Inputs[] newArray(int i13) {
                return new Inputs[i13];
            }
        }

        public Inputs(List<String> list, ForstaSurveyConfig forstaSurveyConfig) {
            list.getClass();
            forstaSurveyConfig.getClass();
            this.d = list;
            this.e = forstaSurveyConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Inputs) {
                Inputs inputs = (Inputs) obj;
                return this.d.equals(inputs.d) && this.e == inputs.e;
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "Inputs(machineTypeNames=" + this.d + ", surveyConfig=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeStringList(this.d);
            this.e.writeToParcel(parcel, i13);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d$b;", "navigationEvent", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/support/forsta/survey/d$b;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.support.forsta.survey.ForstaSurveyActivity$onCreate$2$1$1$1", f = "ForstaSurveyActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class b extends i implements Function2<d.b, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        public b(l12.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(d.b bVar, l12.d<? super f0> dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            d.b bVar = (d.b) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (!(bVar instanceof d.b.a)) {
                ma.e.o();
                return null;
            }
            boolean z13 = ((d.b.a) bVar).f16840a;
            ForstaSurveyActivity forstaSurveyActivity = ForstaSurveyActivity.this;
            if (z13) {
                forstaSurveyActivity.setResult(-1);
            }
            forstaSurveyActivity.finish();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends p implements Function1<d.c, f0> {
        public c(Object obj) {
            super(1, obj, com.dyson.mobile.android.support.forsta.survey.d.class, "onUiEvent", "onUiEvent(Lcom/dyson/mobile/android/support/forsta/survey/ForstaSurveyViewModel$UiEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(d.c cVar) {
            d.c cVar2 = cVar;
            cVar2.getClass();
            ((com.dyson.mobile.android.support.forsta.survey.d) this.receiver).S(cVar2);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/support/forsta/survey/ForstaSurveyActivity$d", "Landroidx/lifecycle/ViewModelProvider$Factory;", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements ViewModelProvider.Factory {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q71.c f16828b;

        public d(q71.c cVar) {
            this.f16828b = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.dyson.mobile.android.support.forsta.survey.d$a, VMF] */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            if (d.a.class.isAnnotationPresent(wy1.a.class)) {
                ef1.a aVar = new ef1.a();
                aVar.f26823a = (d.a) ((q71.b) this.f16828b).Y.f88315a;
                try {
                    d.a aVar2 = (d.a) aVar.a();
                    Inputs inputs = ForstaSurveyActivity.this.f16826j;
                    if (inputs != null) {
                        return aVar2.a(inputs.e, inputs.d);
                    }
                    x12.r.i("activityInputs");
                    throw null;
                } catch (UninitializedPropertyAccessException unused) {
                    throw new ef1.b();
                }
            }
            throw new ef1.g();
        }
    }

    public final void Y0(d.InterfaceC0610d interfaceC0610d, Function1<? super d.c, f0> function1, hu0.e eVar, Composer composer, int i13) {
        androidx.compose.runtime.a aVar;
        androidx.compose.runtime.a k13 = composer.k(81140024);
        int i14 = i13 | (k13.Q(interfaceC0610d) ? 4 : 2) | (k13.D(function1) ? 32 : 16) | (k13.D(eVar) ? 256 : 128);
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier a13 = j.a(Modifier.f3231b, "ForstaSurveyActivity.ForstaSurveyScreen");
            c4.c c13 = c4.d.c(1890399220, new f(function1, 10), k13);
            md1.b.f53765a.getClass();
            aVar = k13;
            k9.a(a13, c13, null, null, null, 0, md1.b.a(k13).f41047a.f41064a, 0L, null, c4.d.c(-1158614583, new n(28, (Object) interfaceC0610d, (Object) eVar, (Function1) function1), k13), aVar, 805306422, 444);
        } else {
            aVar = k13;
            aVar.J();
        }
        androidx.compose.runtime.f c03 = aVar.c0();
        if (c03 != null) {
            c03.d = new sa1.a(this, interfaceC0610d, function1, eVar, i13, 17);
        }
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "ForstaSurveyActivity requires ForstaSurveyActivity.Inputs; Please use newInstance method to create intents";
        Object a14 = k7.b.a(a13.a("ARG_ACTIVITY_INPUTS"), "ARG_ACTIVITY_INPUTS", Inputs.class);
        if (a14 == null) {
            pa.c.w("ARG_ACTIVITY_INPUTS was null");
            return;
        }
        Inputs inputs = (Inputs) ((Parcelable) a14);
        this.f16826j = inputs;
        boolean isSurveyInDarkTheme = inputs.e.isSurveyInDarkTheme();
        if (isSurveyInDarkTheme) {
            x.e.getClass();
            f.j.a(this, x.a.a(0), x.a.a(-16777216));
        } else {
            x.a aVar = x.e;
            int i13 = q0.f76062b;
            aVar.getClass();
            f.j.a(this, x.a.b(0, i13), x.a.b(0, i13));
        }
        e71.n.f26183r.getClass();
        n.a.b();
        super.onCreate(bundle);
        g.f.a(this, new c4.c(-488303555, true, new cc1.a(isSurveyInDarkTheme, this, 14)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/ForstaSurveyActivity$a;", "", "<init>", "()V", "", "ARG_ACTIVITY_INPUTS", "Ljava/lang/String;", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, Inputs inputs) {
            context.getClass();
            Intent intent = new Intent(context, ForstaSurveyActivity.class);
            intent.putExtra("ARG_ACTIVITY_INPUTS", inputs);
            return intent;
        }

        private a() {
        }
    }
}
