package com.dyson.mobile.android.robot.newsystem.mapengine.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import y01.k;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "ManageRoomApiError", "GetPersistentMapApiError", "Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ApiError$GetPersistentMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ApiError$ManageRoomApiError;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ApiError extends Exception {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ApiError$GetPersistentMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ApiError;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class GetPersistentMapApiError extends ApiError {
        public static final GetPersistentMapApiError d = new GetPersistentMapApiError();

        private GetPersistentMapApiError() {
            super(null);
        }

        private final Object readResolve() {
            return d;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GetPersistentMapApiError);
        }

        public final int hashCode() {
            return -889255783;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "GetPersistentMapApiError";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ApiError$ManageRoomApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ApiError;", "Ly01/k;", "map", "<init>", "(Ly01/k;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ManageRoomApiError extends ApiError {
        public final k d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageRoomApiError(k kVar) {
            super(null);
            kVar.getClass();
            this.d = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ManageRoomApiError) && r.c(this.d, ((ManageRoomApiError) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "ManageRoomApiError(map=" + this.d + ")";
        }
    }

    public /* synthetic */ ApiError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ApiError() {
    }
}
