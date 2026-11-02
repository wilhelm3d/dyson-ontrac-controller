package com.dyson.mobile.android.connectionjourney.nonconnected.scanserial;

import androidx.annotation.Keep;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.d0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BK\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/ScannedSerialError;", "", "title", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "subtitle", "iconId", "", "isEnterManuallyButtonVisible", "", "isCloseButtonVisible", "isRefreshButtonVisible", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/lang/Integer;ZZZ)V", "getTitle", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getSubtitle", "getIconId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "UNSUPPORTED", "INVALID_BARCODE", "INVALID_QR_CODE", "ALREADY_ADDED", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScannedSerialError {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ ScannedSerialError[] $VALUES;
    public static final ScannedSerialError ALREADY_ADDED;
    public static final ScannedSerialError INVALID_BARCODE;
    public static final ScannedSerialError INVALID_QR_CODE;
    public static final ScannedSerialError UNSUPPORTED;
    private final Integer iconId;
    private final boolean isCloseButtonVisible;
    private final boolean isEnterManuallyButtonVisible;
    private final boolean isRefreshButtonVisible;
    private final LocalisationKey subtitle;
    private final LocalisationKey title;

    private static final /* synthetic */ ScannedSerialError[] $values() {
        return new ScannedSerialError[]{UNSUPPORTED, INVALID_BARCODE, INVALID_QR_CODE, ALREADY_ADDED};
    }

    static {
        LocalisationKey localisationKey = d0.f71134t;
        Integer valueOf = Integer.valueOf((int) R.drawable.ic_informative);
        UNSUPPORTED = new ScannedSerialError("UNSUPPORTED", 0, localisationKey, null, valueOf, false, true, false, 42, null);
        LocalisationKey localisationKey2 = d0.f71136v;
        LocalisationKey localisationKey3 = d0.f71137w;
        Integer valueOf2 = Integer.valueOf((int) R.drawable.ic_alert_legacy);
        INVALID_BARCODE = new ScannedSerialError("INVALID_BARCODE", 1, localisationKey2, localisationKey3, valueOf2, true, false, true, 16, null);
        INVALID_QR_CODE = new ScannedSerialError("INVALID_QR_CODE", 2, d0.f71138x, d0.f71139y, valueOf2, true, false, true, 16, null);
        ALREADY_ADDED = new ScannedSerialError("ALREADY_ADDED", 3, d0.f71135u, null, valueOf, false, true, false, 42, null);
        ScannedSerialError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    public /* synthetic */ ScannedSerialError(String str, int i13, LocalisationKey localisationKey, LocalisationKey localisationKey2, Integer num, boolean z13, boolean z14, boolean z15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? null : localisationKey, (i14 & 2) != 0 ? null : localisationKey2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? false : z15);
    }

    public static o12.a<ScannedSerialError> getEntries() {
        return $ENTRIES;
    }

    public static ScannedSerialError valueOf(String str) {
        return (ScannedSerialError) Enum.valueOf(ScannedSerialError.class, str);
    }

    public static ScannedSerialError[] values() {
        return (ScannedSerialError[]) $VALUES.clone();
    }

    public final Integer getIconId() {
        return this.iconId;
    }

    public final LocalisationKey getSubtitle() {
        return this.subtitle;
    }

    public final LocalisationKey getTitle() {
        return this.title;
    }

    public final boolean isCloseButtonVisible() {
        return this.isCloseButtonVisible;
    }

    public final boolean isEnterManuallyButtonVisible() {
        return this.isEnterManuallyButtonVisible;
    }

    public final boolean isRefreshButtonVisible() {
        return this.isRefreshButtonVisible;
    }

    private ScannedSerialError(String str, int i13, LocalisationKey localisationKey, LocalisationKey localisationKey2, Integer num, boolean z13, boolean z14, boolean z15) {
        this.title = localisationKey;
        this.subtitle = localisationKey2;
        this.iconId = num;
        this.isEnterManuallyButtonVisible = z13;
        this.isCloseButtonVisible = z14;
        this.isRefreshButtonVisible = z15;
    }
}
