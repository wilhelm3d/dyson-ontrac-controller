package com.dyson.mobile.android.robot.newsystem.activityhistory;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/activityhistory/ActivityHistoryError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "ActivityHistoryMetadataError", "MapMetadataError", "MapMetadataEmptyError", "Lcom/dyson/mobile/android/robot/newsystem/activityhistory/ActivityHistoryError$ActivityHistoryMetadataError;", "Lcom/dyson/mobile/android/robot/newsystem/activityhistory/ActivityHistoryError$MapMetadataEmptyError;", "Lcom/dyson/mobile/android/robot/newsystem/activityhistory/ActivityHistoryError$MapMetadataError;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ActivityHistoryError extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/activityhistory/ActivityHistoryError$ActivityHistoryMetadataError;", "Lcom/dyson/mobile/android/robot/newsystem/activityhistory/ActivityHistoryError;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ActivityHistoryMetadataError extends ActivityHistoryError {
        public ActivityHistoryMetadataError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/activityhistory/ActivityHistoryError$MapMetadataEmptyError;", "Lcom/dyson/mobile/android/robot/newsystem/activityhistory/ActivityHistoryError;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MapMetadataEmptyError extends ActivityHistoryError {
        public MapMetadataEmptyError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/activityhistory/ActivityHistoryError$MapMetadataError;", "Lcom/dyson/mobile/android/robot/newsystem/activityhistory/ActivityHistoryError;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MapMetadataError extends ActivityHistoryError {
        public MapMetadataError() {
            super(null);
        }
    }

    public /* synthetic */ ActivityHistoryError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ActivityHistoryError() {
    }
}
