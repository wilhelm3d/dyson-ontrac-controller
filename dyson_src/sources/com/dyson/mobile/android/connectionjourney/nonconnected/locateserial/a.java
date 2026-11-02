package com.dyson.mobile.android.connectionjourney.nonconnected.locateserial;

import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.LaunchState;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/locateserial/a;", "", "<init>", "()V", "a", "b", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f13625a = new b(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/locateserial/a$a;", "Ly9/m0;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/LaunchState;", "launchState", "<init>", "(Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/LaunchState;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.locateserial.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0433a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final LaunchState f13626a;

        public C0433a(LaunchState launchState) {
            launchState.getClass();
            this.f13626a = launchState;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.actionToSerialCapture;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0433a) && this.f13626a == ((C0433a) obj).f13626a;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(LaunchState.class);
            LaunchState launchState = this.f13626a;
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
            return this.f13626a.hashCode();
        }

        public final String toString() {
            return "ActionToSerialCapture(launchState=" + this.f13626a + ")";
        }
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/locateserial/a$b;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
