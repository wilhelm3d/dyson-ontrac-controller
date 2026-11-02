package com.dyson.mobile.android.connectionjourney.addbyserial;

import androidx.annotation.Keep;
import com.dyson.mobile.android.R;
import hx.v;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0083\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/addbyserial/NewScannedSerialError;", "", "title", "", "description", "<init>", "(Ljava/lang/String;III)V", "getTitle", "()I", "getDescription", "NOT_RECOGNIZED_BARCODE", "NOT_RECOGNIZED_QRCODE", "MACHINE_ALREADY_ADDED", "MACHINE_NOT_COMPATIBLE", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewScannedSerialError {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ NewScannedSerialError[] $VALUES;
    private final int description;
    private final int title;
    public static final NewScannedSerialError NOT_RECOGNIZED_BARCODE = new NewScannedSerialError("NOT_RECOGNIZED_BARCODE", 0, R.string.connectionJourney_addSerialNumber_error_barcodeNotRecognised_title, R.string.connectionJourney_addSerialNumber_error_barcodeNotRecognised_description);
    public static final NewScannedSerialError NOT_RECOGNIZED_QRCODE = new NewScannedSerialError("NOT_RECOGNIZED_QRCODE", 1, R.string.unsupportedQrcode_error_messageTitle, R.string.unsupportedQrcode_error_messageSubtitle);
    public static final NewScannedSerialError MACHINE_ALREADY_ADDED = new NewScannedSerialError("MACHINE_ALREADY_ADDED", 2, R.string.connectionJourney_addSerialNumber_error_machineAlreadyAdded_title, R.string.connectionJourney_addSerialNumber_error_machineAlreadyAdded_description);
    public static final NewScannedSerialError MACHINE_NOT_COMPATIBLE = new NewScannedSerialError("MACHINE_NOT_COMPATIBLE", 3, R.string.connectionJourney_addSerialNumber_error_machineNotCompatible_title, R.string.connectionJourney_addSerialNumber_error_machineNotCompatible_description);

    private static final /* synthetic */ NewScannedSerialError[] $values() {
        return new NewScannedSerialError[]{NOT_RECOGNIZED_BARCODE, NOT_RECOGNIZED_QRCODE, MACHINE_ALREADY_ADDED, MACHINE_NOT_COMPATIBLE};
    }

    static {
        NewScannedSerialError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private NewScannedSerialError(String str, int i13, int i14, int i15) {
        this.title = i14;
        this.description = i15;
    }

    public static o12.a<NewScannedSerialError> getEntries() {
        return $ENTRIES;
    }

    public static NewScannedSerialError valueOf(String str) {
        return (NewScannedSerialError) Enum.valueOf(NewScannedSerialError.class, str);
    }

    public static NewScannedSerialError[] values() {
        return (NewScannedSerialError[]) $VALUES.clone();
    }

    public final int getDescription() {
        return this.description;
    }

    public final int getTitle() {
        return this.title;
    }
}
