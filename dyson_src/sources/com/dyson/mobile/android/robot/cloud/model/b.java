package com.dyson.mobile.android.robot.cloud.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import ky0.d;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/b;", "", "", "vacuumPowerMode", "Lky0/d;", "cleaningStrategy", "<init>", "(Ljava/lang/Integer;Lky0/d;)V", "a", "Ljava/lang/Integer;", "getVacuumPowerMode", "()Ljava/lang/Integer;", "b", "Lky0/d;", "getCleaningStrategy", "()Lky0/d;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    @SerializedName("vacuumPowerMode")

    /* renamed from: a  reason: collision with root package name */
    private final Integer f15979a;
    @SerializedName("cleaningStrategy")

    /* renamed from: b  reason: collision with root package name */
    private final d f15980b;

    public b(Integer num, d dVar) {
        dVar.getClass();
        this.f15979a = num;
        this.f15980b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return r.c(this.f15979a, bVar.f15979a) && this.f15980b == bVar.f15980b;
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f15979a;
        return this.f15980b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        Integer num = this.f15979a;
        d dVar = this.f15980b;
        return "ZoneBehaviorSettings(vacuumPowerMode=" + num + ", cleaningStrategy=" + dVar + ")";
    }
}
