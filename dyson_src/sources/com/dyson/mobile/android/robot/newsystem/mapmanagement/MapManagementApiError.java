package com.dyson.mobile.android.robot.newsystem.mapmanagement;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "GetMapApiError", "RotateMapApiError", "ChangeCurrentMapApiError", "DeleteMapApiError", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError$ChangeCurrentMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError$DeleteMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError$GetMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError$RotateMapApiError;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MapManagementApiError extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError$ChangeCurrentMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ChangeCurrentMapApiError extends MapManagementApiError {
        public ChangeCurrentMapApiError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError$DeleteMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DeleteMapApiError extends MapManagementApiError {
        public DeleteMapApiError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError$GetMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class GetMapApiError extends MapManagementApiError {
        public GetMapApiError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError$RotateMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/MapManagementApiError;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RotateMapApiError extends MapManagementApiError {
        public RotateMapApiError() {
            super(null);
        }
    }

    public /* synthetic */ MapManagementApiError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MapManagementApiError() {
    }
}
