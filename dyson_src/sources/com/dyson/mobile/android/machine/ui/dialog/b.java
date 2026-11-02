package com.dyson.mobile.android.machine.ui.dialog;

import androidx.databinding.ObservableBoolean;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machine.ui.dialog.DialogDescriptor;
import com.dyson.mobile.android.machine.ui.dialog.a;
import e22.m;
import java.util.EnumSet;
import java.util.List;
import kotlin.Metadata;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/dialog/b;", "", "Lcom/dyson/mobile/android/machine/ui/dialog/DialogDescriptor;", "dialogDescriptor", "<init>", "(Lcom/dyson/mobile/android/machine/ui/dialog/DialogDescriptor;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f15343n = {p0.f86717a.f(new y(b.class, "callback", "getCallback()Lkotlin/jvm/functions/Function1;", 0))};

    /* renamed from: a  reason: collision with root package name */
    public a.b f15344a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f15345b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15346c;
    public final LocalisationKey d;
    public final List<LocalisationKey> e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15347f;

    /* renamed from: g  reason: collision with root package name */
    public final LocalisationKey f15348g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f15349h;

    /* renamed from: i  reason: collision with root package name */
    public final LocalisationKey f15350i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f15351j;

    /* renamed from: k  reason: collision with root package name */
    public final LocalisationKey f15352k;

    /* renamed from: l  reason: collision with root package name */
    public final ObservableBoolean f15353l;

    /* renamed from: m  reason: collision with root package name */
    public final tf1.a f15354m;

    public b(DialogDescriptor dialogDescriptor) {
        dialogDescriptor.getClass();
        Integer num = dialogDescriptor.f15339j;
        this.f15345b = num;
        this.f15346c = num != null;
        this.d = dialogDescriptor.d;
        this.e = dialogDescriptor.e;
        this.f15347f = dialogDescriptor.f15335f;
        this.f15348g = dialogDescriptor.f15336g;
        LocalisationKey localisationKey = dialogDescriptor.f15337h;
        this.f15349h = localisationKey != null;
        this.f15350i = localisationKey;
        LocalisationKey localisationKey2 = dialogDescriptor.f15338i;
        this.f15351j = localisationKey2 != null;
        this.f15352k = localisationKey2;
        this.f15353l = new ObservableBoolean(false);
        this.f15354m = new tf1.a(null, 1, null);
    }

    public final EnumSet<DialogDescriptor.a> a(DialogDescriptor.a aVar) {
        if (this.f15353l.d) {
            DialogDescriptor.a[] aVarArr = {DialogDescriptor.a.CHECKBOX_CHECKED, aVar};
            EnumSet<DialogDescriptor.a> noneOf = EnumSet.noneOf(DialogDescriptor.a.class);
            noneOf.getClass();
            i12.y.t(noneOf, aVarArr);
            return noneOf;
        }
        DialogDescriptor.a[] aVarArr2 = {aVar};
        EnumSet<DialogDescriptor.a> noneOf2 = EnumSet.noneOf(DialogDescriptor.a.class);
        noneOf2.getClass();
        i12.y.t(noneOf2, aVarArr2);
        return noneOf2;
    }
}
