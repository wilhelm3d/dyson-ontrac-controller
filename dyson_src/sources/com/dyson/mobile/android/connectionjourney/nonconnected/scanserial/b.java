package com.dyson.mobile.android.connectionjourney.nonconnected.scanserial;

import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.LaunchState;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/b;", "", "<init>", "()V", "a", "b", "c", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f13727a = new c(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/b$a;", "Ly9/m0;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/LaunchState;", "launchState", "<init>", "(Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/LaunchState;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final LaunchState f13728a;

        public a(LaunchState launchState) {
            launchState.getClass();
            this.f13728a = launchState;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.actionToMachineSerialCapture;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f13728a == ((a) obj).f13728a;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(LaunchState.class);
            LaunchState launchState = this.f13728a;
            if (isAssignableFrom) {
                bundle.putParcelable("launchState", (Parcelable) launchState);
                return bundle;
            } else if (Serializable.class.isAssignableFrom(LaunchState.class)) {
                bundle.putSerializable("launchState", launchState);
                return bundle;
            } else {
                ie.a.t(LaunchState.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
        }

        public final int hashCode() {
            return this.f13728a.hashCode();
        }

        public final String toString() {
            return "ActionToMachineSerialCapture(launchState=" + this.f13728a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/b$b;", "Ly9/m0;", "", "serialNumber", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0439b implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f13729a;

        /* renamed from: b  reason: collision with root package name */
        public final MachineDescriptor f13730b;

        public C0439b(String str, MachineDescriptor machineDescriptor) {
            str.getClass();
            machineDescriptor.getClass();
            this.f13729a = str;
            this.f13730b = machineDescriptor;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.actionToOwnershipConfirmation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0439b) {
                C0439b c0439b = (C0439b) obj;
                return this.f13729a.equals(c0439b.f13729a) && this.f13730b.equals(c0439b.f13730b);
            }
            return false;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("serialNumber", this.f13729a);
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(MachineDescriptor.class);
            MachineDescriptor machineDescriptor = this.f13730b;
            if (isAssignableFrom) {
                bundle.putParcelable("machineDescriptor", (Parcelable) machineDescriptor);
                return bundle;
            } else if (Serializable.class.isAssignableFrom(MachineDescriptor.class)) {
                bundle.putSerializable("machineDescriptor", machineDescriptor);
                return bundle;
            } else {
                ie.a.t(MachineDescriptor.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
        }

        public final int hashCode() {
            return this.f13730b.hashCode() + (this.f13729a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionToOwnershipConfirmation(serialNumber=" + this.f13729a + ", machineDescriptor=" + this.f13730b + ")";
        }
    }

    private b() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/b$c;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }
}
