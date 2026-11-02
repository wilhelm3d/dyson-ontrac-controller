package com.dyson.mobile.android.robot.newsystem.mapengine;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapengine/MapLoaderApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "FetchMapApiError", "RotateMapApiError", "Lcom/dyson/mobile/android/robot/newsystem/mapengine/MapLoaderApiError$FetchMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapengine/MapLoaderApiError$RotateMapApiError;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MapLoaderApiError extends Exception {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapengine/MapLoaderApiError$FetchMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapengine/MapLoaderApiError;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FetchMapApiError extends MapLoaderApiError {
        public static final FetchMapApiError d = new FetchMapApiError();

        private FetchMapApiError() {
            super(null);
        }

        private final Object readResolve() {
            return d;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FetchMapApiError);
        }

        public final int hashCode() {
            return 1119172097;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "FetchMapApiError";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapengine/MapLoaderApiError$RotateMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/mapengine/MapLoaderApiError;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RotateMapApiError extends MapLoaderApiError {
        public static final RotateMapApiError d = new RotateMapApiError();

        private RotateMapApiError() {
            super(null);
        }

        private final Object readResolve() {
            return d;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RotateMapApiError);
        }

        public final int hashCode() {
            return -1342676034;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "RotateMapApiError";
        }
    }

    public /* synthetic */ MapLoaderApiError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MapLoaderApiError() {
    }
}
