package com.dyson.mobile.android.light.control;

import com.dyson.mobile.android.R;
import com.google.gson.annotations.SerializedName;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/light/control/e;", "", "", "isInTaskMode", "<init>", "(Z)V", "a", "Z", "()Z", "c", "d", "b", "Lcom/dyson/mobile/android/light/control/e$c;", "Lcom/dyson/mobile/android/light/control/e$d;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class e {
    @SerializedName("isInTaskMode")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14830a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/control/e$b;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14831a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final d f14832b = new d("SYNCHRONISED", R.drawable.button_sync, og0.d.light_modes_synchronised, og0.d.light_modes_synchronisedDescription, true);

        /* renamed from: c  reason: collision with root package name */
        public static final d f14833c = new d("STUDY", R.drawable.button_study, og0.d.light_modes_study, og0.d.light_modes_studyDescription, true);
        public static final d d = new d("RELAX", R.drawable.button_relax, og0.d.light_modes_relax, og0.d.light_modes_relaxDescription, false);
        public static final d e = new d("PRECISION", R.drawable.button_precision, og0.d.light_modes_precision, og0.d.light_modes_precisionDescription, true);

        /* renamed from: f  reason: collision with root package name */
        public static final d f14834f = new d("ADD", R.drawable.button_add_mode, og0.d.light_add, null, true);

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/dyson/mobile/android/light/control/e$d;", "Lcom/dyson/mobile/android/light/control/e;", "", "name", "", "drawable", "Log0/d;", "modesKey", "modesDescriptionKey", "", "isTaskMode", "<init>", "(Ljava/lang/String;ILog0/d;Log0/d;Z)V", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "I", "()I", "d", "Log0/d;", "()Log0/d;", "f", "Z", "()Z", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends e {
        @SerializedName("name")

        /* renamed from: b  reason: collision with root package name */
        private final String f14838b;
        @SerializedName("drawable")

        /* renamed from: c  reason: collision with root package name */
        private final int f14839c;
        @SerializedName("modesKey")
        private final og0.d d;
        @SerializedName("modesDescriptionKey")
        private final og0.d e;
        @SerializedName("isTaskMode")

        /* renamed from: f  reason: collision with root package name */
        private final boolean f14840f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, int i13, og0.d dVar, og0.d dVar2, boolean z13) {
            super(z13, null);
            str.getClass();
            dVar.getClass();
            this.f14838b = str;
            this.f14839c = i13;
            this.d = dVar;
            this.e = dVar2;
            this.f14840f = z13;
        }

        public final int b() {
            return this.f14839c;
        }

        public final og0.d c() {
            return this.e;
        }

        public final og0.d d() {
            return this.d;
        }

        public final String e() {
            return this.f14838b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return r.c(this.f14838b, dVar.f14838b) && this.f14839c == dVar.f14839c && this.d == dVar.d && this.e == dVar.e && this.f14840f == dVar.f14840f;
            }
            return false;
        }

        public final boolean f() {
            return this.f14840f;
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + w.b(this.f14839c, this.f14838b.hashCode() * 31, 31)) * 31;
            og0.d dVar = this.e;
            return Boolean.hashCode(this.f14840f) + ((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        public final String toString() {
            String str = this.f14838b;
            int i13 = this.f14839c;
            og0.d dVar = this.d;
            og0.d dVar2 = this.e;
            boolean z13 = this.f14840f;
            StringBuilder m13 = b0.g.m(i13, "LightPresetMode(name=", str, ", drawable=", ", modesKey=");
            m13.append(dVar);
            m13.append(", modesDescriptionKey=");
            m13.append(dVar2);
            m13.append(", isTaskMode=");
            return jy1.a.g(m13, z13, ")");
        }
    }

    static {
        new a(null);
    }

    private e(boolean z13) {
        this.f14830a = z13;
    }

    public final boolean a() {
        return this.f14830a;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/light/control/e$a;", "", "<init>", "()V", "", "PRESET_MODES_NUMBER", "I", "", "MODE_SYNCHRONISED", "Ljava/lang/String;", "MODE_STUDY", "MODE_RELAX", "MODE_PRECISION", "ADD_MODE", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z13);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/light/control/e$c;", "Lcom/dyson/mobile/android/light/control/e;", "", "modeName", "modeDescription", "", "colourTemperature", "brightness", "", "isTaskMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZ)V", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "d", "I", "()I", "f", "Z", "()Z", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends e {
        @SerializedName("modeName")

        /* renamed from: b  reason: collision with root package name */
        private final String f14835b;
        @SerializedName("modeDescription")

        /* renamed from: c  reason: collision with root package name */
        private final String f14836c;
        @SerializedName("colourTemperature")
        private final int d;
        @SerializedName("brightness")
        private final int e;
        @SerializedName("isTaskMode")

        /* renamed from: f  reason: collision with root package name */
        private final boolean f14837f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, int i13, int i14, boolean z13) {
            super(z13, null);
            str.getClass();
            str2.getClass();
            this.f14835b = str;
            this.f14836c = str2;
            this.d = i13;
            this.e = i14;
            this.f14837f = z13;
        }

        public final int b() {
            return this.e;
        }

        public final int c() {
            return this.d;
        }

        public final String d() {
            return this.f14836c;
        }

        public final String e() {
            return this.f14835b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return r.c(this.f14835b, cVar.f14835b) && r.c(this.f14836c, cVar.f14836c) && this.d == cVar.d && this.e == cVar.e && this.f14837f == cVar.f14837f;
            }
            return false;
        }

        public final boolean f() {
            return this.f14837f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14837f) + w.b(this.e, w.b(this.d, y.c(this.f14835b.hashCode() * 31, 31, this.f14836c), 31), 31);
        }

        public final String toString() {
            String str = this.f14835b;
            String str2 = this.f14836c;
            int i13 = this.d;
            int i14 = this.e;
            boolean z13 = this.f14837f;
            StringBuilder m13 = ma.e.m("LightCustomMode(modeName=", str, ", modeDescription=", str2, ", colourTemperature=");
            o1.a.k(i13, i14, ", brightness=", ", isTaskMode=", m13);
            return jy1.a.g(m13, z13, ")");
        }

        public /* synthetic */ c(String str, String str2, int i13, int i14, boolean z13, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i13, i14, (i15 & 16) != 0 ? false : z13);
        }
    }
}
