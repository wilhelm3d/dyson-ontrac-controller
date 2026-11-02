package com.dyson.mobile.android.cat9.navigation.destination;

import android.os.Parcelable;
import com.dyson.mobile.android.cat9.navigation.destination.BatteryDestination;
import com.dyson.mobile.android.cat9.navigation.destination.CleanSessionsDestination;
import com.dyson.mobile.android.cat9.navigation.destination.GuidedCleanDestination;
import com.dyson.mobile.android.cat9.navigation.destination.LiveCleanDestination;
import com.dyson.mobile.android.cat9.navigation.destination.PrivacyConsentDestination;
import com.dyson.mobile.android.cat9.navigation.destination.ProductSettingsDestination;
import com.dyson.mobile.android.cat9.navigation.destination.WeekMetricPageDestination;
import e22.d;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import t42.b;
import t42.f;
import t42.g;
import x12.p0;
import x12.q0;
import x42.g1;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/OralCareDestination;", "Landroid/os/Parcelable;", "Companion", "a", "Lcom/dyson/mobile/android/cat9/navigation/destination/BatteryDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/CleanSessionsDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/GuidedCleanDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/LiveCleanDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes2.dex */
public interface OralCareDestination extends Parcelable {
    public static final a Companion = a.f12910a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/OralCareDestination$a;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/cat9/navigation/destination/OralCareDestination;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f12910a = new a();

        private a() {
        }

        public final b<OralCareDestination> serializer() {
            q0 q0Var = p0.f86717a;
            return new f("com.dyson.mobile.android.cat9.navigation.destination.OralCareDestination", q0Var.b(OralCareDestination.class), new d[]{q0Var.b(BatteryDestination.BatteryAuthenticityUnverified.class), q0Var.b(CleanSessionsDestination.AllCleanSessionsView.class), q0Var.b(CleanSessionsDestination.CleanSessionSummaryView.class), q0Var.b(GuidedCleanDestination.BrushingTimer.class), q0Var.b(LiveCleanDestination.BeginApConnection.class), q0Var.b(PrivacyConsentDestination.CameraUsagePolicyView.class), q0Var.b(PrivacyConsentDestination.PrivacyConsentView.class), q0Var.b(ProductSettingsDestination.BrushHeadAuthenticityGenuine.class), q0Var.b(ProductSettingsDestination.BrushHeadAuthenticityUnverified.class), q0Var.b(ProductSettingsDestination.BrushHeadInfo.class), q0Var.b(ProductSettingsDestination.BrushHeadStatus.class), q0Var.b(ProductSettingsDestination.BrushingAlert.class), q0Var.b(ProductSettingsDestination.RemoveProduct.class), q0Var.b(WeekMetricPageDestination.BrushingCoveragePageDestination.class), q0Var.b(WeekMetricPageDestination.BrushingDurationPageDestination.class), q0Var.b(WeekMetricPageDestination.FlossingCoveragePageDestination.class), q0Var.b(WeekMetricPageDestination.OverpressurePageDestination.class), q0Var.b(WeekMetricPageDestination.OverscrubbingPageDestination.class)}, new b[]{new g1("com.dyson.mobile.android.cat9.navigation.destination.BatteryDestination.BatteryAuthenticityUnverified", BatteryDestination.BatteryAuthenticityUnverified.INSTANCE, new Annotation[0]), new g1("com.dyson.mobile.android.cat9.navigation.destination.CleanSessionsDestination.AllCleanSessionsView", CleanSessionsDestination.AllCleanSessionsView.INSTANCE, new Annotation[0]), CleanSessionsDestination.CleanSessionSummaryView.a.f12909a, new g1("com.dyson.mobile.android.cat9.navigation.destination.GuidedCleanDestination.BrushingTimer", GuidedCleanDestination.BrushingTimer.INSTANCE, new Annotation[0]), new g1("com.dyson.mobile.android.cat9.navigation.destination.LiveCleanDestination.BeginApConnection", LiveCleanDestination.BeginApConnection.INSTANCE, new Annotation[0]), new g1("com.dyson.mobile.android.cat9.navigation.destination.PrivacyConsentDestination.CameraUsagePolicyView", PrivacyConsentDestination.CameraUsagePolicyView.INSTANCE, new Annotation[0]), PrivacyConsentDestination.PrivacyConsentView.a.f12911a, new g1("com.dyson.mobile.android.cat9.navigation.destination.ProductSettingsDestination.BrushHeadAuthenticityGenuine", ProductSettingsDestination.BrushHeadAuthenticityGenuine.INSTANCE, new Annotation[0]), new g1("com.dyson.mobile.android.cat9.navigation.destination.ProductSettingsDestination.BrushHeadAuthenticityUnverified", ProductSettingsDestination.BrushHeadAuthenticityUnverified.INSTANCE, new Annotation[0]), new g1("com.dyson.mobile.android.cat9.navigation.destination.ProductSettingsDestination.BrushHeadInfo", ProductSettingsDestination.BrushHeadInfo.INSTANCE, new Annotation[0]), new g1("com.dyson.mobile.android.cat9.navigation.destination.ProductSettingsDestination.BrushHeadStatus", ProductSettingsDestination.BrushHeadStatus.INSTANCE, new Annotation[0]), new g1("com.dyson.mobile.android.cat9.navigation.destination.ProductSettingsDestination.BrushingAlert", ProductSettingsDestination.BrushingAlert.INSTANCE, new Annotation[0]), new g1("com.dyson.mobile.android.cat9.navigation.destination.ProductSettingsDestination.RemoveProduct", ProductSettingsDestination.RemoveProduct.INSTANCE, new Annotation[0]), WeekMetricPageDestination.BrushingCoveragePageDestination.a.f12912a, WeekMetricPageDestination.BrushingDurationPageDestination.a.f12913a, WeekMetricPageDestination.FlossingCoveragePageDestination.a.f12914a, WeekMetricPageDestination.OverpressurePageDestination.a.f12915a, WeekMetricPageDestination.OverscrubbingPageDestination.a.f12916a}, new Annotation[0]);
        }
    }
}
