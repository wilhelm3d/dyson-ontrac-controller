package com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/g;", "", "<init>", "()V", "b", "a", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/g$a;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/g$b;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class g {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/g$a;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/g;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f15245a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th2) {
            super(null);
            th2.getClass();
            this.f15245a = th2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && r.c(this.f15245a, ((a) obj).f15245a);
        }

        public final int hashCode() {
            return this.f15245a.hashCode();
        }

        public final String toString() {
            return "Error(throwable=" + this.f15245a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/g$b;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/g;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15246a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1206178060;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private g() {
    }
}
