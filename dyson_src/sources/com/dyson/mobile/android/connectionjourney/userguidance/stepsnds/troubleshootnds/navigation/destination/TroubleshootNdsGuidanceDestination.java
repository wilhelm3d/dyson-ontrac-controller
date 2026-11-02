package com.dyson.mobile.android.connectionjourney.userguidance.stepsnds.troubleshootnds.navigation.destination;

import android.os.Parcelable;
import e22.d;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import t42.b;
import t42.f;
import t42.g;
import x12.p0;
import x12.q0;
import x42.g1;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bq\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/stepsnds/troubleshootnds/navigation/destination/TroubleshootNdsGuidanceDestination;", "Landroid/os/Parcelable;", "Companion", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes2.dex */
public interface TroubleshootNdsGuidanceDestination extends Parcelable {
    public static final a Companion = a.f13937a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/stepsnds/troubleshootnds/navigation/destination/TroubleshootNdsGuidanceDestination$a;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/connectionjourney/userguidance/stepsnds/troubleshootnds/navigation/destination/TroubleshootNdsGuidanceDestination;", "serializer", "()Lt42/b;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f13937a = new a();

        private a() {
        }

        public final b<TroubleshootNdsGuidanceDestination> serializer() {
            q0 q0Var = p0.f86717a;
            return new f("com.dyson.mobile.android.connectionjourney.userguidance.stepsnds.troubleshootnds.navigation.destination.TroubleshootNdsGuidanceDestination", q0Var.b(TroubleshootNdsGuidanceDestination.class), new d[]{q0Var.b(TroubleshootNdsDestination$TroubleshootNdsGuidance.class)}, new b[]{new g1("com.dyson.mobile.android.connectionjourney.userguidance.stepsnds.troubleshootnds.navigation.destination.TroubleshootNdsDestination.TroubleshootNdsGuidance", TroubleshootNdsDestination$TroubleshootNdsGuidance.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }
}
