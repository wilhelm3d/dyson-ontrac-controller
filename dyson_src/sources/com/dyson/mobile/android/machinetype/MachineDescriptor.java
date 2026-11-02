package com.dyson.mobile.android.machinetype;

import androidx.annotation.Keep;
import h12.y;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import pf0.f;
import rf0.i0;
import x12.r;
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0018¨\u0006&"}, d2 = {"Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "Ljava/io/Serializable;", "machineType", "", "machineVariant", "model", "machineConnectionCategory", "Lcom/dyson/mobile/android/machinetype/MachineConnectionCategory;", "machineCategory", "Lcom/dyson/mobile/android/machinetype/MachineCategory;", "productName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineConnectionCategory;Lcom/dyson/mobile/android/machinetype/MachineCategory;Ljava/lang/String;)V", "getMachineType", "()Ljava/lang/String;", "getMachineVariant", "getModel", "getMachineConnectionCategory", "()Lcom/dyson/mobile/android/machinetype/MachineConnectionCategory;", "getMachineCategory", "()Lcom/dyson/mobile/android/machinetype/MachineCategory;", "getProductName", "isConnected", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MachineDescriptor implements Serializable {
    private final boolean isConnected;
    private final MachineCategory machineCategory;
    private final MachineConnectionCategory machineConnectionCategory;
    private final String machineType;
    private final String machineVariant;
    private final String model;
    private final String productName;

    public MachineDescriptor(String str, String str2, String str3, MachineConnectionCategory machineConnectionCategory, MachineCategory machineCategory, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        machineCategory.getClass();
        str4.getClass();
        this.machineType = str;
        this.machineVariant = str2;
        this.model = str3;
        this.machineConnectionCategory = machineConnectionCategory;
        this.machineCategory = machineCategory;
        this.productName = str4;
        boolean z13 = false;
        if (machineConnectionCategory != null && machineConnectionCategory != MachineConnectionCategory.NON_CONNECTED) {
            z13 = true;
        }
        this.isConnected = z13;
    }

    public static /* synthetic */ MachineDescriptor copy$default(MachineDescriptor machineDescriptor, String str, String str2, String str3, MachineConnectionCategory machineConnectionCategory, MachineCategory machineCategory, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = machineDescriptor.machineType;
        }
        if ((i13 & 2) != 0) {
            str2 = machineDescriptor.machineVariant;
        }
        if ((i13 & 4) != 0) {
            str3 = machineDescriptor.model;
        }
        if ((i13 & 8) != 0) {
            machineConnectionCategory = machineDescriptor.machineConnectionCategory;
        }
        if ((i13 & 16) != 0) {
            machineCategory = machineDescriptor.machineCategory;
        }
        if ((i13 & 32) != 0) {
            str4 = machineDescriptor.productName;
        }
        MachineCategory machineCategory2 = machineCategory;
        String str5 = str4;
        return machineDescriptor.copy(str, str2, str3, machineConnectionCategory, machineCategory2, str5);
    }

    public final String component1() {
        return this.machineType;
    }

    public final String component2() {
        return this.machineVariant;
    }

    public final String component3() {
        return this.model;
    }

    public final MachineConnectionCategory component4() {
        return this.machineConnectionCategory;
    }

    public final MachineCategory component5() {
        return this.machineCategory;
    }

    public final String component6() {
        return this.productName;
    }

    public final MachineDescriptor copy(String str, String str2, String str3, MachineConnectionCategory machineConnectionCategory, MachineCategory machineCategory, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        machineCategory.getClass();
        str4.getClass();
        return new MachineDescriptor(str, str2, str3, machineConnectionCategory, machineCategory, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MachineDescriptor) {
            MachineDescriptor machineDescriptor = (MachineDescriptor) obj;
            return r.c(this.machineType, machineDescriptor.machineType) && r.c(this.machineVariant, machineDescriptor.machineVariant) && r.c(this.model, machineDescriptor.model) && this.machineConnectionCategory == machineDescriptor.machineConnectionCategory && this.machineCategory == machineDescriptor.machineCategory && r.c(this.productName, machineDescriptor.productName);
        }
        return false;
    }

    public final MachineCategory getMachineCategory() {
        return this.machineCategory;
    }

    public final MachineConnectionCategory getMachineConnectionCategory() {
        return this.machineConnectionCategory;
    }

    public final String getMachineType() {
        return this.machineType;
    }

    public final String getMachineVariant() {
        return this.machineVariant;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getProductName() {
        return this.productName;
    }

    public int hashCode() {
        int c13 = y.c(y.c(this.machineType.hashCode() * 31, 31, this.machineVariant), 31, this.model);
        MachineConnectionCategory machineConnectionCategory = this.machineConnectionCategory;
        int hashCode = machineConnectionCategory == null ? 0 : machineConnectionCategory.hashCode();
        return this.productName.hashCode() + ((this.machineCategory.hashCode() + ((c13 + hashCode) * 31)) * 31);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public String toString() {
        String str = this.machineType;
        String str2 = this.machineVariant;
        String str3 = this.model;
        MachineConnectionCategory machineConnectionCategory = this.machineConnectionCategory;
        MachineCategory machineCategory = this.machineCategory;
        String str4 = this.productName;
        StringBuilder m13 = e.m("MachineDescriptor(machineType=", str, ", machineVariant=", str2, ", model=");
        m13.append(str3);
        m13.append(", machineConnectionCategory=");
        m13.append(machineConnectionCategory);
        m13.append(", machineCategory=");
        m13.append(machineCategory);
        m13.append(", productName=");
        m13.append(str4);
        m13.append(")");
        return m13.toString();
    }

    public /* synthetic */ MachineDescriptor(String str, String str2, String str3, MachineConnectionCategory machineConnectionCategory, MachineCategory machineCategory, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : machineConnectionCategory, machineCategory, (i13 & 32) != 0 ? f.c(i0.H2) : str4);
    }
}
