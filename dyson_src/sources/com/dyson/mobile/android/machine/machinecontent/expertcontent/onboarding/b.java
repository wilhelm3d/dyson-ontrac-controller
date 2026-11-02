package com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding;

import android.os.Bundle;
import android.os.Parcelable;
import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideoPlaylist;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/b;", "", "<init>", "()V", "a", "b", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0518b f15235a = new C0518b(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/b$a;", "Ly9/m0;", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", AbstractEvent.PLAYLIST, "", "machineSerial", "<init>", "(Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final ExpertContentVideoPlaylist f15236a;

        /* renamed from: b  reason: collision with root package name */
        public final String f15237b;

        public a(ExpertContentVideoPlaylist expertContentVideoPlaylist, String str) {
            expertContentVideoPlaylist.getClass();
            str.getClass();
            this.f15236a = expertContentVideoPlaylist;
            this.f15237b = str;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.action_onOnboardingChapteredGuideLoaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f15236a.equals(aVar.f15236a) && this.f15237b.equals(aVar.f15237b);
            }
            return false;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(ExpertContentVideoPlaylist.class);
            ExpertContentVideoPlaylist expertContentVideoPlaylist = this.f15236a;
            if (isAssignableFrom) {
                bundle.putParcelable(AbstractEvent.PLAYLIST, expertContentVideoPlaylist);
            } else if (!Serializable.class.isAssignableFrom(ExpertContentVideoPlaylist.class)) {
                ie.a.t(ExpertContentVideoPlaylist.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            } else {
                bundle.putSerializable(AbstractEvent.PLAYLIST, (Serializable) expertContentVideoPlaylist);
            }
            bundle.putString("machineSerial", this.f15237b);
            return bundle;
        }

        public final int hashCode() {
            return this.f15237b.hashCode() + (this.f15236a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionOnOnboardingChapteredGuideLoaded(playlist=" + this.f15236a + ", machineSerial=" + this.f15237b + ")";
        }
    }

    private b() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/b$b;", "", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0518b {
        public /* synthetic */ C0518b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0518b() {
        }
    }
}
