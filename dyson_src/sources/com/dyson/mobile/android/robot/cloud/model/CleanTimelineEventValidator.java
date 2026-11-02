package com.dyson.mobile.android.robot.cloud.model;

import com.dyson.mobile.android.robot.cloud.model.CleanTimelineEvent;
import i12.q;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEventValidator;", "Lmf1/a;", "Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CleanTimelineEventValidator implements mf1.a<CleanTimelineEvent> {
    @Override // mf1.a
    public final mf1.b a(CleanTimelineEvent cleanTimelineEvent) {
        CleanTimelineEvent cleanTimelineEvent2 = cleanTimelineEvent;
        cleanTimelineEvent2.getClass();
        return q.s(cleanTimelineEvent2.i(), CleanTimelineEvent.b.values()) ? mf1.b.f53843c : new mf1.b(false, "Invalid CleanTimelineEvent, the event name has not been recognised");
    }
}
