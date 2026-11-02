package com.dyson.mobile.android.machine.ui.settings.name;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.machinetype.MachineCategory;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras;", "Landroid/os/Parcelable;", "", "machineTypeName", "machineSerial", "appMachineVariant", "Lcom/dyson/mobile/android/machinetype/MachineCategory;", "machineCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineCategory;)V", "ReturnName", "PersistName", "Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras$PersistName;", "Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras$ReturnName;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MachineNamingExtras implements Parcelable {
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15424f;

    /* renamed from: g  reason: collision with root package name */
    public final MachineCategory f15425g;

    private MachineNamingExtras(String str, String str2, String str3, MachineCategory machineCategory) {
        this.d = str;
        this.e = str2;
        this.f15424f = str3;
        this.f15425g = machineCategory;
    }

    public String i() {
        return this.f15424f;
    }

    public MachineCategory j() {
        return this.f15425g;
    }

    public String k() {
        return this.e;
    }

    public String l() {
        return this.d;
    }

    public /* synthetic */ MachineNamingExtras(String str, String str2, String str3, MachineCategory machineCategory, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, machineCategory);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras$ReturnName;", "Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras;", "", "machineTypeName", "machineSerial", "appMachineVariant", "Lcom/dyson/mobile/android/machinetype/MachineCategory;", "machineCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineCategory;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ReturnName extends MachineNamingExtras {
        public static final Parcelable.Creator<ReturnName> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public final String f15431h;

        /* renamed from: i  reason: collision with root package name */
        public final String f15432i;

        /* renamed from: j  reason: collision with root package name */
        public final String f15433j;

        /* renamed from: k  reason: collision with root package name */
        public final MachineCategory f15434k;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<ReturnName> {
            @Override // android.os.Parcelable.Creator
            public final ReturnName createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ReturnName(parcel.readString(), parcel.readString(), parcel.readString(), MachineCategory.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final ReturnName[] newArray(int i13) {
                return new ReturnName[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReturnName(String str, String str2, String str3, MachineCategory machineCategory) {
            super(str, str2, str3, machineCategory, null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            machineCategory.getClass();
            this.f15431h = str;
            this.f15432i = str2;
            this.f15433j = str3;
            this.f15434k = machineCategory;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ReturnName) {
                ReturnName returnName = (ReturnName) obj;
                return r.c(this.f15431h, returnName.f15431h) && r.c(this.f15432i, returnName.f15432i) && r.c(this.f15433j, returnName.f15433j) && this.f15434k == returnName.f15434k;
            }
            return false;
        }

        public final int hashCode() {
            return this.f15434k.hashCode() + y.c(y.c(this.f15431h.hashCode() * 31, 31, this.f15432i), 31, this.f15433j);
        }

        @Override // com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras
        public final String i() {
            return this.f15433j;
        }

        @Override // com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras
        public final MachineCategory j() {
            return this.f15434k;
        }

        @Override // com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras
        public final String k() {
            return this.f15432i;
        }

        @Override // com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras
        public final String l() {
            return this.f15431h;
        }

        public final String toString() {
            StringBuilder m13 = ma.e.m("ReturnName(machineTypeName=", this.f15431h, ", machineSerial=", this.f15432i, ", appMachineVariant=");
            m13.append(this.f15433j);
            m13.append(", machineCategory=");
            m13.append(this.f15434k);
            m13.append(")");
            return m13.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.f15431h);
            parcel.writeString(this.f15432i);
            parcel.writeString(this.f15433j);
            parcel.writeString(this.f15434k.name());
        }

        public /* synthetic */ ReturnName(String str, String str2, String str3, MachineCategory machineCategory, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, str2, (i13 & 4) != 0 ? "" : str3, machineCategory);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras$PersistName;", "Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras;", "", "machineSerial", "Lcom/dyson/mobile/android/machinetype/MachineCategory;", "machineCategory", "appMachineVariant", "", "isAutoUpdateEnabled", "machineTypeName", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineCategory;Ljava/lang/String;ZLjava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PersistName extends MachineNamingExtras {
        public static final Parcelable.Creator<PersistName> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public final String f15426h;

        /* renamed from: i  reason: collision with root package name */
        public final MachineCategory f15427i;

        /* renamed from: j  reason: collision with root package name */
        public final String f15428j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f15429k;

        /* renamed from: l  reason: collision with root package name */
        public final String f15430l;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<PersistName> {
            @Override // android.os.Parcelable.Creator
            public final PersistName createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new PersistName(parcel.readString(), MachineCategory.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PersistName[] newArray(int i13) {
                return new PersistName[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersistName(String str, MachineCategory machineCategory, String str2, boolean z13, String str3) {
            super(str3, str, str2, machineCategory, null);
            str.getClass();
            machineCategory.getClass();
            str2.getClass();
            str3.getClass();
            this.f15426h = str;
            this.f15427i = machineCategory;
            this.f15428j = str2;
            this.f15429k = z13;
            this.f15430l = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PersistName) {
                PersistName persistName = (PersistName) obj;
                return r.c(this.f15426h, persistName.f15426h) && this.f15427i == persistName.f15427i && r.c(this.f15428j, persistName.f15428j) && this.f15429k == persistName.f15429k && r.c(this.f15430l, persistName.f15430l);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15430l.hashCode() + w.c(y.c((this.f15427i.hashCode() + (this.f15426h.hashCode() * 31)) * 31, 31, this.f15428j), 31, this.f15429k);
        }

        @Override // com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras
        public final String i() {
            return this.f15428j;
        }

        @Override // com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras
        public final MachineCategory j() {
            return this.f15427i;
        }

        @Override // com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras
        public final String k() {
            return this.f15426h;
        }

        @Override // com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras
        public final String l() {
            return this.f15430l;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PersistName(machineSerial=");
            sb2.append(this.f15426h);
            sb2.append(", machineCategory=");
            sb2.append(this.f15427i);
            sb2.append(", appMachineVariant=");
            v80.c.j(sb2, this.f15428j, ", isAutoUpdateEnabled=", this.f15429k, ", machineTypeName=");
            return ie.a.h(sb2, this.f15430l, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.f15426h);
            parcel.writeString(this.f15427i.name());
            parcel.writeString(this.f15428j);
            parcel.writeInt(this.f15429k ? 1 : 0);
            parcel.writeString(this.f15430l);
        }

        public /* synthetic */ PersistName(String str, MachineCategory machineCategory, String str2, boolean z13, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, machineCategory, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? "" : str3);
        }
    }
}
