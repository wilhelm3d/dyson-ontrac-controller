package com.dyson.mobile.android.support.forsta;

import android.os.Parcel;
import android.os.Parcelable;
import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/ForstaSurveyConfig;", "Landroid/os/Parcelable;", "", "", "baseUrl", "endOfSurveyUrl", "", "isSurveyInDarkTheme", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lh12/f0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "getEndOfSurveyUrl", "Z", "()Z", "GENERAL_APP_EXPERIENCE_FEEDBACK", "DESIGN_SYSTEM_FEEDBACK", "EC_NDS_EXPERIENCE_FEEDBACK", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ForstaSurveyConfig implements Parcelable {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ ForstaSurveyConfig[] $VALUES;
    public static final Parcelable.Creator<ForstaSurveyConfig> CREATOR;
    private final String baseUrl;
    private final String endOfSurveyUrl;
    private final boolean isSurveyInDarkTheme;
    public static final ForstaSurveyConfig GENERAL_APP_EXPERIENCE_FEEDBACK = new ForstaSurveyConfig("GENERAL_APP_EXPERIENCE_FEEDBACK", 0, "https://survey.euro.confirmit.com/wix/p569506949418.aspx", "https://www.dyson.co.uk/", true);
    public static final ForstaSurveyConfig DESIGN_SYSTEM_FEEDBACK = new ForstaSurveyConfig("DESIGN_SYSTEM_FEEDBACK", 1, "https://survey.euro.confirmit.com/wix/p317591997991.aspx", "https://survey.euro.confirmit.com/endofsurvey/", false);
    public static final ForstaSurveyConfig EC_NDS_EXPERIENCE_FEEDBACK = new ForstaSurveyConfig("EC_NDS_EXPERIENCE_FEEDBACK", 2, "https://survey.euro.confirmit.com/wix/p516762125601.aspx", "https://www.dyson.com/", true);

    private static final /* synthetic */ ForstaSurveyConfig[] $values() {
        return new ForstaSurveyConfig[]{GENERAL_APP_EXPERIENCE_FEEDBACK, DESIGN_SYSTEM_FEEDBACK, EC_NDS_EXPERIENCE_FEEDBACK};
    }

    static {
        ForstaSurveyConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        CREATOR = new Parcelable.Creator<ForstaSurveyConfig>() { // from class: com.dyson.mobile.android.support.forsta.ForstaSurveyConfig.a
            @Override // android.os.Parcelable.Creator
            public final ForstaSurveyConfig createFromParcel(Parcel parcel) {
                parcel.getClass();
                return ForstaSurveyConfig.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ForstaSurveyConfig[] newArray(int i13) {
                return new ForstaSurveyConfig[i13];
            }
        };
    }

    private ForstaSurveyConfig(String str, int i13, String str2, String str3, boolean z13) {
        this.baseUrl = str2;
        this.endOfSurveyUrl = str3;
        this.isSurveyInDarkTheme = z13;
    }

    public static o12.a<ForstaSurveyConfig> getEntries() {
        return $ENTRIES;
    }

    public static ForstaSurveyConfig valueOf(String str) {
        return (ForstaSurveyConfig) Enum.valueOf(ForstaSurveyConfig.class, str);
    }

    public static ForstaSurveyConfig[] values() {
        return (ForstaSurveyConfig[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getEndOfSurveyUrl() {
        return this.endOfSurveyUrl;
    }

    public final boolean isSurveyInDarkTheme() {
        return this.isSurveyInDarkTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
