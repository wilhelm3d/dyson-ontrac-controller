package com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding;

import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideoPlaylist;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/h;", "", "<init>", "()V", "a", "b", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/h$a;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/h$b;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/h$a;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/h;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends h {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15247a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 990984725;
        }

        public final String toString() {
            return "OnCloseFragment";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/h$b;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/h;", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", AbstractEvent.PLAYLIST, "<init>", "(Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends h {

        /* renamed from: a  reason: collision with root package name */
        public final ExpertContentVideoPlaylist f15248a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ExpertContentVideoPlaylist expertContentVideoPlaylist) {
            super(null);
            expertContentVideoPlaylist.getClass();
            this.f15248a = expertContentVideoPlaylist;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && r.c(this.f15248a, ((b) obj).f15248a);
        }

        public final int hashCode() {
            return this.f15248a.hashCode();
        }

        public final String toString() {
            return "OnNavigateToChapteredVideo(playlist=" + this.f15248a + ")";
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private h() {
    }
}
