package com.dyson.mobile.android.interactableec.scheduling;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.C;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.schedule.response.ScheduleSettings;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.push.g;
import f61.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import q62.n;
import x12.r;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BÓ\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001a\u001a\u0004\b2\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b1\u0010\u001cR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001a\u001a\u0004\b5\u0010\u001cR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b6\u0010\u001cR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b7\u0010\u001cR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u001a\u001a\u0004\b9\u0010\u001c¨\u0006:"}, d2 = {"Lcom/dyson/mobile/android/interactableec/scheduling/ECScheduleSettings;", "Lcom/dyson/mobile/android/schedule/response/ScheduleSettings;", "Lf61/b;", "Landroid/os/Parcelable;", "", "fanMode", "fanPower", "fanSpeed", "oscillationMode", "nightMode", "autoMode", "focusDiffuse", "heatMode", "", "targetTemperature", "fanAirDirection", "humidificationMode", "manualHumidificationTarget", "autoHumidification", "tiltMode", "tiltType", "tiltLowerAngle", "tiltUpperAngle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "d", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "e", "getFanPower", "f", g.f21679k, "g", "K", "h", "J", "i", TTMLParser.Tags.CAPTION, "j", "E", "k", "F", "l", "Ljava/lang/Integer;", "L", "()Ljava/lang/Integer;", "m", "q", "n", "G", "o", "H", "O", "Q", "M", g.f21675g, "R", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECScheduleSettings extends ScheduleSettings implements b, Parcelable {
    public static final Parcelable.Creator<ECScheduleSettings> CREATOR = new a();
    @SerializedName("fmod")
    private final String d;
    @SerializedName("fpwr")
    private final String e;
    @SerializedName("fnsp")

    /* renamed from: f  reason: collision with root package name */
    private final String f14608f;
    @SerializedName("oson")

    /* renamed from: g  reason: collision with root package name */
    private final String f14609g;
    @SerializedName("nmod")

    /* renamed from: h  reason: collision with root package name */
    private final String f14610h;
    @SerializedName("auto")

    /* renamed from: i  reason: collision with root package name */
    private final String f14611i;
    @SerializedName("ffoc")

    /* renamed from: j  reason: collision with root package name */
    private final String f14612j;
    @SerializedName("hmod")

    /* renamed from: k  reason: collision with root package name */
    private final String f14613k;
    @SerializedName("hmax")

    /* renamed from: l  reason: collision with root package name */
    private final Integer f14614l;
    @SerializedName("fdir")

    /* renamed from: m  reason: collision with root package name */
    private final String f14615m;
    @SerializedName("hume")

    /* renamed from: n  reason: collision with root package name */
    private final String f14616n;
    @SerializedName("humt")

    /* renamed from: o  reason: collision with root package name */
    private final Integer f14617o;
    @SerializedName("haut")

    /* renamed from: p  reason: collision with root package name */
    private final String f14618p;
    @SerializedName("oton")

    /* renamed from: q  reason: collision with root package name */
    private final String f14619q;
    @SerializedName("anct")

    /* renamed from: r  reason: collision with root package name */
    private final String f14620r;
    @SerializedName("otal")

    /* renamed from: s  reason: collision with root package name */
    private final String f14621s;
    @SerializedName("otau")

    /* renamed from: t  reason: collision with root package name */
    private final String f14622t;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<ECScheduleSettings> {
        @Override // android.os.Parcelable.Creator
        public final ECScheduleSettings createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String readString9 = parcel.readString();
            Integer num2 = num;
            String readString10 = parcel.readString();
            if (parcel.readInt() != 0) {
                num2 = Integer.valueOf(parcel.readInt());
            }
            return new ECScheduleSettings(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, valueOf, readString9, readString10, num2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ECScheduleSettings[] newArray(int i13) {
            return new ECScheduleSettings[i13];
        }
    }

    public /* synthetic */ ECScheduleSettings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, String str12, String str13, String str14, String str15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & 128) != 0 ? null : str8, (i13 & 256) != 0 ? null : num, (i13 & 512) != 0 ? null : str9, (i13 & 1024) != 0 ? null : str10, (i13 & 2048) != 0 ? null : num2, (i13 & 4096) != 0 ? null : str11, (i13 & C.DASH_ROLE_ALTERNATE_FLAG) != 0 ? null : str12, (i13 & 16384) != 0 ? null : str13, (i13 & 32768) != 0 ? null : str14, (i13 & C.DASH_ROLE_SUPPLEMENTARY_FLAG) != 0 ? null : str15);
    }

    public final String E() {
        return this.f14612j;
    }

    public final String F() {
        return this.f14613k;
    }

    public final String G() {
        return this.f14616n;
    }

    public final Integer H() {
        return this.f14617o;
    }

    public final String J() {
        return this.f14610h;
    }

    public final String K() {
        return this.f14609g;
    }

    public final Integer L() {
        return this.f14614l;
    }

    public final String M() {
        return this.f14621s;
    }

    public final String O() {
        return this.f14619q;
    }

    public final String Q() {
        return this.f14620r;
    }

    public final String R() {
        return this.f14622t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ECScheduleSettings) {
            ECScheduleSettings eCScheduleSettings = (ECScheduleSettings) obj;
            return r.c(this.d, eCScheduleSettings.d) && r.c(this.e, eCScheduleSettings.e) && r.c(this.f14608f, eCScheduleSettings.f14608f) && r.c(this.f14609g, eCScheduleSettings.f14609g) && r.c(this.f14610h, eCScheduleSettings.f14610h) && r.c(this.f14611i, eCScheduleSettings.f14611i) && r.c(this.f14612j, eCScheduleSettings.f14612j) && r.c(this.f14613k, eCScheduleSettings.f14613k) && r.c(this.f14614l, eCScheduleSettings.f14614l) && r.c(this.f14615m, eCScheduleSettings.f14615m) && r.c(this.f14616n, eCScheduleSettings.f14616n) && r.c(this.f14617o, eCScheduleSettings.f14617o) && r.c(this.f14618p, eCScheduleSettings.f14618p) && r.c(this.f14619q, eCScheduleSettings.f14619q) && r.c(this.f14620r, eCScheduleSettings.f14620r) && r.c(this.f14621s, eCScheduleSettings.f14621s) && r.c(this.f14622t, eCScheduleSettings.f14622t);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14608f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14609g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14610h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14611i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f14612j;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f14613k;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f14614l;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.f14615m;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f14616n;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num2 = this.f14617o;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str11 = this.f14618p;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f14619q;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f14620r;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f14621s;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f14622t;
        return hashCode16 + (str15 != null ? str15.hashCode() : 0);
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings
    /* renamed from: k */
    public final ECScheduleSettings i() {
        return new ECScheduleSettings(this.d, this.e, this.f14608f, this.f14609g, this.f14610h, this.f14611i, this.f14612j, this.f14613k, this.f14614l, this.f14615m, this.f14616n, this.f14617o, this.f14618p, this.f14619q, this.f14620r, this.f14621s, this.f14622t);
    }

    public final String n() {
        return this.f14618p;
    }

    public final String p() {
        return this.f14611i;
    }

    public final String q() {
        return this.f14615m;
    }

    public final String r() {
        return this.d;
    }

    public final String s() {
        return this.f14608f;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f14608f;
        String str4 = this.f14609g;
        String str5 = this.f14610h;
        String str6 = this.f14611i;
        String str7 = this.f14612j;
        String str8 = this.f14613k;
        Integer num = this.f14614l;
        String str9 = this.f14615m;
        String str10 = this.f14616n;
        Integer num2 = this.f14617o;
        String str11 = this.f14618p;
        String str12 = this.f14619q;
        String str13 = this.f14620r;
        String str14 = this.f14621s;
        String str15 = this.f14622t;
        StringBuilder m13 = e.m("ECScheduleSettings(fanMode=", str, ", fanPower=", str2, ", fanSpeed=");
        n.o(m13, str3, ", oscillationMode=", str4, ", nightMode=");
        n.o(m13, str5, ", autoMode=", str6, ", focusDiffuse=");
        n.o(m13, str7, ", heatMode=", str8, ", targetTemperature=");
        m13.append(num);
        m13.append(", fanAirDirection=");
        m13.append(str9);
        m13.append(", humidificationMode=");
        m13.append(str10);
        m13.append(", manualHumidificationTarget=");
        m13.append(num2);
        m13.append(", autoHumidification=");
        n.o(m13, str11, ", tiltMode=", str12, ", tiltType=");
        n.o(m13, str13, ", tiltLowerAngle=", str14, ", tiltUpperAngle=");
        return ie.a.h(m13, str15, ")");
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f14608f);
        parcel.writeString(this.f14609g);
        parcel.writeString(this.f14610h);
        parcel.writeString(this.f14611i);
        parcel.writeString(this.f14612j);
        parcel.writeString(this.f14613k);
        Integer num = this.f14614l;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f14615m);
        parcel.writeString(this.f14616n);
        Integer num2 = this.f14617o;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.f14618p);
        parcel.writeString(this.f14619q);
        parcel.writeString(this.f14620r);
        parcel.writeString(this.f14621s);
        parcel.writeString(this.f14622t);
    }

    public ECScheduleSettings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, String str12, String str13, String str14, String str15) {
        this.d = str;
        this.e = str2;
        this.f14608f = str3;
        this.f14609g = str4;
        this.f14610h = str5;
        this.f14611i = str6;
        this.f14612j = str7;
        this.f14613k = str8;
        this.f14614l = num;
        this.f14615m = str9;
        this.f14616n = str10;
        this.f14617o = num2;
        this.f14618p = str11;
        this.f14619q = str12;
        this.f14620r = str13;
        this.f14621s = str14;
        this.f14622t = str15;
    }

    public ECScheduleSettings() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }
}
