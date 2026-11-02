package com.dyson.mobile.android.machine.ui.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.localisation.LocalisationKey;
import h12.y;
import hx.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oi1.s;
import x12.r;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBE\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/dialog/DialogDescriptor;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "", TTMLParser.Tags.BODY, "", "separator", "primaryButton", "secondaryButton", "checkboxMessage", "", "icon", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/util/List;Ljava/lang/String;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/lang/Integer;)V", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/lang/Integer;)V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogDescriptor implements Parcelable {
    public static final Parcelable.Creator<DialogDescriptor> CREATOR = new b();
    public final LocalisationKey d;
    public final List<LocalisationKey> e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15335f;

    /* renamed from: g  reason: collision with root package name */
    public final LocalisationKey f15336g;

    /* renamed from: h  reason: collision with root package name */
    public final LocalisationKey f15337h;

    /* renamed from: i  reason: collision with root package name */
    public final LocalisationKey f15338i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f15339j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/dialog/DialogDescriptor$a;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY_BUTTON", "SECONDARY_BUTTON", "CHECKBOX_CHECKED", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PRIMARY_BUTTON = new a("PRIMARY_BUTTON", 0);
        public static final a SECONDARY_BUTTON = new a("SECONDARY_BUTTON", 1);
        public static final a CHECKBOX_CHECKED = new a("CHECKBOX_CHECKED", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{PRIMARY_BUTTON, SECONDARY_BUTTON, CHECKBOX_CHECKED};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private a(String str, int i13) {
        }

        public static o12.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Parcelable.Creator<DialogDescriptor> {
        @Override // android.os.Parcelable.Creator
        public final DialogDescriptor createFromParcel(Parcel parcel) {
            parcel.getClass();
            LocalisationKey localisationKey = (LocalisationKey) parcel.readParcelable(DialogDescriptor.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i13 = 0; i13 != readInt; i13++) {
                arrayList.add(parcel.readParcelable(DialogDescriptor.class.getClassLoader()));
            }
            return new DialogDescriptor(localisationKey, arrayList, parcel.readString(), (LocalisationKey) parcel.readParcelable(DialogDescriptor.class.getClassLoader()), (LocalisationKey) parcel.readParcelable(DialogDescriptor.class.getClassLoader()), (LocalisationKey) parcel.readParcelable(DialogDescriptor.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final DialogDescriptor[] newArray(int i13) {
            return new DialogDescriptor[i13];
        }
    }

    public DialogDescriptor(LocalisationKey localisationKey, List<LocalisationKey> list, String str, LocalisationKey localisationKey2, LocalisationKey localisationKey3, LocalisationKey localisationKey4, Integer num) {
        localisationKey.getClass();
        list.getClass();
        str.getClass();
        localisationKey2.getClass();
        this.d = localisationKey;
        this.e = list;
        this.f15335f = str;
        this.f15336g = localisationKey2;
        this.f15337h = localisationKey3;
        this.f15338i = localisationKey4;
        this.f15339j = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialogDescriptor) {
            DialogDescriptor dialogDescriptor = (DialogDescriptor) obj;
            return r.c(this.d, dialogDescriptor.d) && r.c(this.e, dialogDescriptor.e) && r.c(this.f15335f, dialogDescriptor.f15335f) && r.c(this.f15336g, dialogDescriptor.f15336g) && r.c(this.f15337h, dialogDescriptor.f15337h) && r.c(this.f15338i, dialogDescriptor.f15338i) && r.c(this.f15339j, dialogDescriptor.f15339j);
        }
        return false;
    }

    public final int hashCode() {
        int e = y.e(this.f15336g, y.c(tq1.a.h(this.d.hashCode() * 31, 31, this.e), 31, this.f15335f), 31);
        LocalisationKey localisationKey = this.f15337h;
        int hashCode = (e + (localisationKey == null ? 0 : localisationKey.hashCode())) * 31;
        LocalisationKey localisationKey2 = this.f15338i;
        int hashCode2 = (hashCode + (localisationKey2 == null ? 0 : localisationKey2.hashCode())) * 31;
        Integer num = this.f15339j;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DialogDescriptor(title=");
        sb2.append(this.d);
        sb2.append(", body=");
        sb2.append(this.e);
        sb2.append(", separator=");
        sb2.append(this.f15335f);
        sb2.append(", primaryButton=");
        sb2.append(this.f15336g);
        sb2.append(", secondaryButton=");
        sb2.append(this.f15337h);
        sb2.append(", checkboxMessage=");
        sb2.append(this.f15338i);
        sb2.append(", icon=");
        return s.d(sb2, this.f15339j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int intValue;
        parcel.getClass();
        parcel.writeParcelable(this.d, i13);
        Iterator n13 = d72.a.n(this.e, parcel);
        while (n13.hasNext()) {
            parcel.writeParcelable((Parcelable) n13.next(), i13);
        }
        parcel.writeString(this.f15335f);
        parcel.writeParcelable(this.f15336g, i13);
        parcel.writeParcelable(this.f15337h, i13);
        parcel.writeParcelable(this.f15338i, i13);
        Integer num = this.f15339j;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogDescriptor(LocalisationKey localisationKey, List<LocalisationKey> list, String str, LocalisationKey localisationKey2, LocalisationKey localisationKey3) {
        this(localisationKey, list, str, localisationKey2, localisationKey3, null, null, 96, null);
        localisationKey.getClass();
        list.getClass();
        str.getClass();
        localisationKey2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogDescriptor(LocalisationKey localisationKey, List<LocalisationKey> list, String str, LocalisationKey localisationKey2, LocalisationKey localisationKey3, LocalisationKey localisationKey4) {
        this(localisationKey, list, str, localisationKey2, localisationKey3, localisationKey4, null, 64, null);
        localisationKey.getClass();
        list.getClass();
        str.getClass();
        localisationKey2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogDescriptor(LocalisationKey localisationKey, List<LocalisationKey> list, String str, LocalisationKey localisationKey2) {
        this(localisationKey, list, str, localisationKey2, null, null, null, com.salesforce.marketingcloud.analytics.stats.b.f20728p, null);
        localisationKey.getClass();
        list.getClass();
        str.getClass();
        localisationKey2.getClass();
    }

    public /* synthetic */ DialogDescriptor(LocalisationKey localisationKey, List list, String str, LocalisationKey localisationKey2, LocalisationKey localisationKey3, LocalisationKey localisationKey4, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(localisationKey, list, str, localisationKey2, (i13 & 16) != 0 ? null : localisationKey3, (i13 & 32) != 0 ? null : localisationKey4, (i13 & 64) != 0 ? null : num);
    }

    public /* synthetic */ DialogDescriptor(LocalisationKey localisationKey, LocalisationKey localisationKey2, LocalisationKey localisationKey3, LocalisationKey localisationKey4, LocalisationKey localisationKey5, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(localisationKey, localisationKey2, localisationKey3, (i13 & 8) != 0 ? null : localisationKey4, (i13 & 16) != 0 ? null : localisationKey5, (i13 & 32) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogDescriptor(LocalisationKey localisationKey, LocalisationKey localisationKey2, LocalisationKey localisationKey3, LocalisationKey localisationKey4, LocalisationKey localisationKey5, Integer num) {
        this(localisationKey, i12.s.c(localisationKey2), "", localisationKey3, localisationKey4, localisationKey5, num);
        localisationKey.getClass();
        localisationKey2.getClass();
        localisationKey3.getClass();
    }
}
