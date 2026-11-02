package com.dyson.mobile.android.robot.newsystem.home.tabs.maps;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "MapMetadataApiError", "PersistentMapApiError", "SetAsCurrentMapApiError", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError$MapMetadataApiError;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError$PersistentMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError$SetAsCurrentMapApiError;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ManageMapsTabApiError extends Exception {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError$MapMetadataApiError;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MapMetadataApiError extends ManageMapsTabApiError {
        public static final MapMetadataApiError d = new MapMetadataApiError();

        private MapMetadataApiError() {
            super(null);
        }

        private final Object readResolve() {
            return d;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MapMetadataApiError);
        }

        public final int hashCode() {
            return 330367212;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "MapMetadataApiError";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError$PersistentMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PersistentMapApiError extends ManageMapsTabApiError {
        public static final PersistentMapApiError d = new PersistentMapApiError();

        private PersistentMapApiError() {
            super(null);
        }

        private final Object readResolve() {
            return d;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PersistentMapApiError);
        }

        public final int hashCode() {
            return 10447046;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "PersistentMapApiError";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError$SetAsCurrentMapApiError;", "Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsTabApiError;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SetAsCurrentMapApiError extends ManageMapsTabApiError {
        public static final SetAsCurrentMapApiError d = new SetAsCurrentMapApiError();

        private SetAsCurrentMapApiError() {
            super(null);
        }

        private final Object readResolve() {
            return d;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SetAsCurrentMapApiError);
        }

        public final int hashCode() {
            return 1124531000;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "SetAsCurrentMapApiError";
        }
    }

    public /* synthetic */ ManageMapsTabApiError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ManageMapsTabApiError() {
    }
}
