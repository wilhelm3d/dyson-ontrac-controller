package com.dyson.mobile.android.robot.history;

import com.dyson.mobile.android.robot.cloud.model.CleanHistory;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/robot/history/a;", "Lm9/u;", "Ljava/util/TimeZone;", "machineTimeZone", "<init>", "(Ljava/util/TimeZone;)V", "a", "b", "Lcom/dyson/mobile/android/robot/history/a$a;", "Lcom/dyson/mobile/android/robot/history/a$b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a extends u {
    public final TimeZone d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/history/a$a;", "Lcom/dyson/mobile/android/robot/history/a;", "Lcom/dyson/mobile/android/robot/cloud/model/CleanHistory;", "cleanHistory", "Ljava/util/TimeZone;", "machineTimeZone", "<init>", "(Lcom/dyson/mobile/android/robot/cloud/model/CleanHistory;Ljava/util/TimeZone;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.history.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0551a extends a {
        public final CleanHistory e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0551a(CleanHistory cleanHistory, TimeZone timeZone) {
            super(timeZone, null);
            cleanHistory.getClass();
            timeZone.getClass();
            this.e = cleanHistory;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/history/a$b;", "Lcom/dyson/mobile/android/robot/history/a;", "", "Lcom/dyson/mobile/android/robot/cloud/model/a;", "cleanMaps", "Ljava/util/TimeZone;", "machineTimeZone", "<init>", "(Ljava/util/List;Ljava/util/TimeZone;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends a {
        public final List<com.dyson.mobile.android.robot.cloud.model.a> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<com.dyson.mobile.android.robot.cloud.model.a> list, TimeZone timeZone) {
            super(timeZone, null);
            list.getClass();
            timeZone.getClass();
            this.e = list;
        }
    }

    private a(TimeZone timeZone) {
        this.d = timeZone;
    }

    public /* synthetic */ a(TimeZone timeZone, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeZone);
    }
}
