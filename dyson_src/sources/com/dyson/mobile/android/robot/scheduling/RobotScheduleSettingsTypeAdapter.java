package com.dyson.mobile.android.robot.scheduling;

import com.dyson.mobile.android.robot.cloud.model.schedule.RobotScheduleSettings;
import com.dyson.mobile.android.schedule.response.ScheduleSettingsTypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import f41.e;
import kotlin.Metadata;
import ky0.a;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/scheduling/RobotScheduleSettingsTypeAdapter;", "Lcom/dyson/mobile/android/schedule/response/ScheduleSettingsTypeAdapter;", "Lcom/dyson/mobile/android/robot/cloud/model/schedule/RobotScheduleSettings;", "Lf41/e;", "robotScheduleSettingsHelper", "<init>", "(Lf41/e;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotScheduleSettingsTypeAdapter extends ScheduleSettingsTypeAdapter<RobotScheduleSettings> {

    /* renamed from: c  reason: collision with root package name */
    public final e f16660c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotScheduleSettingsTypeAdapter(e eVar) {
        super(RobotScheduleSettings.class);
        eVar.getClass();
        this.f16660c = eVar;
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettingsTypeAdapter
    public final RobotScheduleSettings a(JsonReader jsonReader) {
        jsonReader.getClass();
        return this.f16660c.b((RobotScheduleSettings) super.read(jsonReader));
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettingsTypeAdapter, com.google.gson.TypeAdapter
    /* renamed from: c */
    public final void write(JsonWriter jsonWriter, RobotScheduleSettings robotScheduleSettings) {
        jsonWriter.getClass();
        robotScheduleSettings.getClass();
        if (robotScheduleSettings.q() == a.ZONE_CONFIGURED) {
            robotScheduleSettings = RobotScheduleSettings.k(robotScheduleSettings, null, null, null, null, 12);
        }
        super.write(jsonWriter, robotScheduleSettings);
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettingsTypeAdapter, com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        jsonReader.getClass();
        return this.f16660c.b((RobotScheduleSettings) super.read(jsonReader));
    }
}
