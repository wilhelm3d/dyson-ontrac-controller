package com.dyson.mobile.android.interactableec.control.slider;

import com.dyson.mobile.android.interactableec.control.slider.ECSlider;
import kotlin.Metadata;
import q8.h;
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/slider/a;", "Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider$d;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements ECSlider.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ECSlider.d f14426a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f14427b;

    public a(ECSlider.d dVar, h hVar) {
        this.f14426a = dVar;
        this.f14427b = hVar;
    }

    @Override // com.dyson.mobile.android.interactableec.control.slider.ECSlider.d
    public final void a(ECSlider eCSlider, int i13, boolean z13) {
        eCSlider.getClass();
        ECSlider.d dVar = this.f14426a;
        if (dVar != null) {
            dVar.a(eCSlider, i13, z13);
        }
        h hVar = this.f14427b;
        if (hVar != null) {
            hVar.a();
        }
    }
}
