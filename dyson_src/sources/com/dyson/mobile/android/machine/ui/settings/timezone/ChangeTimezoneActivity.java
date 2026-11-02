package com.dyson.mobile.android.machine.ui.settings.timezone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import bv1.f;
import com.dyson.mobile.android.machine.ui.settings.timezone.a;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pl0.e;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/ChangeTimezoneActivity;", "Lpl0/c;", "<init>", "()V", "a", "ActivityInput", "b", "c", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChangeTimezoneActivity extends pl0.c {

    /* renamed from: s  reason: collision with root package name */
    public final e f15518s = new e();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/ChangeTimezoneActivity$ActivityInput;", "Landroid/os/Parcelable;", "", "machineSerial", "currentTimezoneId", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ActivityInput implements Parcelable {
        public static final Parcelable.Creator<ActivityInput> CREATOR = new a();
        public final String d;
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final String f15519f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<ActivityInput> {
            @Override // android.os.Parcelable.Creator
            public final ActivityInput createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ActivityInput(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActivityInput[] newArray(int i13) {
                return new ActivityInput[i13];
            }
        }

        public ActivityInput(String str, String str2, String str3) {
            d72.a.v(str, str2, str3);
            this.d = str;
            this.e = str2;
            this.f15519f = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ActivityInput) {
                ActivityInput activityInput = (ActivityInput) obj;
                return this.d.equals(activityInput.d) && this.e.equals(activityInput.e) && this.f15519f.equals(activityInput.f15519f);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15519f.hashCode() + y.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return ie.a.h(ma.e.m("ActivityInput(machineSerial=", this.d, ", currentTimezoneId=", this.e, ", title="), this.f15519f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f15519f);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/ChangeTimezoneActivity$a;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/dyson/mobile/android/machine/ui/settings/timezone/ChangeTimezoneActivity$ActivityInput;", "Lcom/dyson/mobile/android/machine/ui/settings/timezone/ChangeTimezoneActivity$b;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends ActivityResultContract<ActivityInput, b> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent a(Context context, ActivityInput activityInput) {
            ActivityInput activityInput2 = activityInput;
            context.getClass();
            activityInput2.getClass();
            Intent intent = new Intent(context, ChangeTimezoneActivity.class);
            intent.putExtra("ACTIVITY_ARGS", activityInput2);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final b c(int i13, Intent intent) {
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("ACTIVITY_RESULT") : null;
            return new b(bundleExtra != null ? bundleExtra.getString("EXTRA_MACHINE_TIME_ZONE") : null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/ChangeTimezoneActivity$b;", "", "", "updatedTimezone", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f15520a;

        public b(String str) {
            this.f15520a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && r.c(this.f15520a, ((b) obj).f15520a);
        }

        public final int hashCode() {
            String str = this.f15520a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return f.e("ActivityResult(updatedTimezone=", this.f15520a, ")");
        }
    }

    static {
        new c(null);
    }

    @Override // pl0.c, bt0.f
    public final bt0.a i1() {
        return this.f15518s;
    }

    @Override // pl0.c, bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "RobotChangeTimezoneActivity should be initialized with valid arguments. Please use ActivityLauncherContract.";
        a13.a("ACTIVITY_ARGS");
        Intent intent2 = getIntent();
        intent2.getClass();
        Object a14 = k7.b.a(cd.b.I(intent2), "ACTIVITY_ARGS", ActivityInput.class);
        if (a14 == null) {
            pa.c.w("ACTIVITY_ARGS was null");
            return;
        }
        ActivityInput activityInput = (ActivityInput) ((Parcelable) a14);
        a.C0534a c0534a = com.dyson.mobile.android.machine.ui.settings.timezone.a.f15521f;
        String str = activityInput.d;
        String str2 = activityInput.e;
        c0534a.getClass();
        q1(a.C0534a.a(str, str2), activityInput.f15519f);
    }

    @Override // pl0.c
    public final e r1() {
        return this.f15518s;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/ChangeTimezoneActivity$c;", "", "<init>", "()V", "", "ACTIVITY_ARGS", "Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }
}
