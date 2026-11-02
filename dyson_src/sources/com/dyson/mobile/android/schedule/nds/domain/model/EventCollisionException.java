package com.dyson.mobile.android.schedule.nds.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/schedule/nds/domain/model/EventCollisionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "<init>", "(Ljava/lang/String;)V", "ConflictingEventException", "OverlappingEventException", "Lcom/dyson/mobile/android/schedule/nds/domain/model/EventCollisionException$ConflictingEventException;", "Lcom/dyson/mobile/android/schedule/nds/domain/model/EventCollisionException$OverlappingEventException;", "mod-schedule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EventCollisionException extends RuntimeException {
    public final String d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/schedule/nds/domain/model/EventCollisionException$ConflictingEventException;", "Lcom/dyson/mobile/android/schedule/nds/domain/model/EventCollisionException;", "", "message", "<init>", "(Ljava/lang/String;)V", "mod-schedule"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ConflictingEventException extends EventCollisionException {
        public final String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConflictingEventException(String str) {
            super(str, null);
            str.getClass();
            this.e = str;
        }

        @Override // com.dyson.mobile.android.schedule.nds.domain.model.EventCollisionException, java.lang.Throwable
        public final String getMessage() {
            return this.e;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/schedule/nds/domain/model/EventCollisionException$OverlappingEventException;", "Lcom/dyson/mobile/android/schedule/nds/domain/model/EventCollisionException;", "", "message", "<init>", "(Ljava/lang/String;)V", "mod-schedule"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OverlappingEventException extends EventCollisionException {
        public final String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverlappingEventException(String str) {
            super(str, null);
            str.getClass();
            this.e = str;
        }

        @Override // com.dyson.mobile.android.schedule.nds.domain.model.EventCollisionException, java.lang.Throwable
        public final String getMessage() {
            return this.e;
        }
    }

    private EventCollisionException(String str) {
        this.d = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.d;
    }

    public /* synthetic */ EventCollisionException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
