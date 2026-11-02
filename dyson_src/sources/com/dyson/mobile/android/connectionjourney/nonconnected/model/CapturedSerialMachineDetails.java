package com.dyson.mobile.android.connectionjourney.nonconnected.model;

import androidx.annotation.Keep;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineConnectionCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import h12.y;
import java.io.Serializable;
import kotlin.Metadata;
import ma.e;
import x12.r;
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0018¨\u0006("}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/model/CapturedSerialMachineDetails;", "Ljava/io/Serializable;", "machineType", "", "machineVariant", "model", "machineConnectionCategory", "Lcom/dyson/mobile/android/machinetype/MachineConnectionCategory;", "machineCategory", "Lcom/dyson/mobile/android/machinetype/MachineCategory;", "productName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineConnectionCategory;Lcom/dyson/mobile/android/machinetype/MachineCategory;Ljava/lang/String;)V", "getMachineType", "()Ljava/lang/String;", "getMachineVariant", "getModel", "getMachineConnectionCategory", "()Lcom/dyson/mobile/android/machinetype/MachineConnectionCategory;", "getMachineCategory", "()Lcom/dyson/mobile/android/machinetype/MachineCategory;", "getProductName", "isConnected", "", "()Z", "toMachineDescriptor", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CapturedSerialMachineDetails implements Serializable {
    public static final int $stable = 0;
    private final boolean isConnected;
    private final MachineCategory machineCategory;
    private final MachineConnectionCategory machineConnectionCategory;
    private final String machineType;
    private final String machineVariant;
    private final String model;
    private final String productName;

    public CapturedSerialMachineDetails(String str, String str2, String str3, MachineConnectionCategory machineConnectionCategory, MachineCategory machineCategory, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        machineConnectionCategory.getClass();
        machineCategory.getClass();
        str4.getClass();
        this.machineType = str;
        this.machineVariant = str2;
        this.model = str3;
        this.machineConnectionCategory = machineConnectionCategory;
        this.machineCategory = machineCategory;
        this.productName = str4;
        this.isConnected = machineConnectionCategory != MachineConnectionCategory.NON_CONNECTED;
    }

    public static /* synthetic */ CapturedSerialMachineDetails copy$default(CapturedSerialMachineDetails capturedSerialMachineDetails, String str, String str2, String str3, MachineConnectionCategory machineConnectionCategory, MachineCategory machineCategory, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = capturedSerialMachineDetails.machineType;
        }
        if ((i13 & 2) != 0) {
            str2 = capturedSerialMachineDetails.machineVariant;
        }
        if ((i13 & 4) != 0) {
            str3 = capturedSerialMachineDetails.model;
        }
        if ((i13 & 8) != 0) {
            machineConnectionCategory = capturedSerialMachineDetails.machineConnectionCategory;
        }
        if ((i13 & 16) != 0) {
            machineCategory = capturedSerialMachineDetails.machineCategory;
        }
        if ((i13 & 32) != 0) {
            str4 = capturedSerialMachineDetails.productName;
        }
        MachineCategory machineCategory2 = machineCategory;
        String str5 = str4;
        return capturedSerialMachineDetails.copy(str, str2, str3, machineConnectionCategory, machineCategory2, str5);
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

    public final CapturedSerialMachineDetails copy(String str, String str2, String str3, MachineConnectionCategory machineConnectionCategory, MachineCategory machineCategory, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        machineConnectionCategory.getClass();
        machineCategory.getClass();
        str4.getClass();
        return new CapturedSerialMachineDetails(str, str2, str3, machineConnectionCategory, machineCategory, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CapturedSerialMachineDetails) {
            CapturedSerialMachineDetails capturedSerialMachineDetails = (CapturedSerialMachineDetails) obj;
            return r.c(this.machineType, capturedSerialMachineDetails.machineType) && r.c(this.machineVariant, capturedSerialMachineDetails.machineVariant) && r.c(this.model, capturedSerialMachineDetails.model) && this.machineConnectionCategory == capturedSerialMachineDetails.machineConnectionCategory && this.machineCategory == capturedSerialMachineDetails.machineCategory && r.c(this.productName, capturedSerialMachineDetails.productName);
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
        int hashCode = this.machineCategory.hashCode();
        return this.productName.hashCode() + ((hashCode + ((this.machineConnectionCategory.hashCode() + c13) * 31)) * 31);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final MachineDescriptor toMachineDescriptor() {
        return new MachineDescriptor(this.machineType, this.machineVariant, this.model, this.machineConnectionCategory, this.machineCategory, this.productName);
    }

    public String toString() {
        String str = this.machineType;
        String str2 = this.machineVariant;
        String str3 = this.model;
        MachineConnectionCategory machineConnectionCategory = this.machineConnectionCategory;
        MachineCategory machineCategory = this.machineCategory;
        String str4 = this.productName;
        StringBuilder m13 = e.m("CapturedSerialMachineDetails(machineType=", str, ", machineVariant=", str2, ", model=");
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
}
