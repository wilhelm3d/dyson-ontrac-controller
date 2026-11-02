package com.dyson.mobile.android.connectedhome.matter;

import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.i0;
import rf0.j0;
import x1.i;
import y9.w;
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013BQ\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/c;", "", "", "drawableId", "", "requiresTint", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "description", "loading", "enabled", "Loz/d;", "itemType", "", "testTag", "<init>", "(IZLcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;ZZLoz/d;Ljava/lang/String;)V", "b", "a", "c", "Lcom/dyson/mobile/android/connectedhome/matter/c$a;", "Lcom/dyson/mobile/android/connectedhome/matter/c$b;", "Lcom/dyson/mobile/android/connectedhome/matter/c$c;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f12956a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12957b;

    /* renamed from: c  reason: collision with root package name */
    public final LocalisationKey f12958c;
    public final LocalisationKey d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12959f;

    /* renamed from: g  reason: collision with root package name */
    public final oz.d f12960g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12961h;

    static {
        LocalisationKey.a aVar = LocalisationKey.f15077f;
    }

    public /* synthetic */ c(int i13, boolean z13, LocalisationKey localisationKey, LocalisationKey localisationKey2, boolean z14, boolean z15, oz.d dVar, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i14 & 2) != 0 ? false : z13, localisationKey, localisationKey2, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? true : z15, dVar, str, null);
    }

    public abstract c a();

    public boolean b() {
        return this.f12959f;
    }

    public boolean c() {
        return this.e;
    }

    public abstract c d();

    public abstract c e();

    private c(int i13, boolean z13, LocalisationKey localisationKey, LocalisationKey localisationKey2, boolean z14, boolean z15, oz.d dVar, String str) {
        this.f12956a = i13;
        this.f12957b = z13;
        this.f12958c = localisationKey;
        this.d = localisationKey2;
        this.e = z14;
        this.f12959f = z15;
        this.f12960g = dVar;
        this.f12961h = str;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/c$c;", "Lcom/dyson/mobile/android/connectedhome/matter/c;", "", "enabled", "loading", "<init>", "(ZZ)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.matter.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0378c extends c {

        /* renamed from: i  reason: collision with root package name */
        public final boolean f12968i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f12969j;

        static {
            LocalisationKey.a aVar = LocalisationKey.f15077f;
        }

        public C0378c(boolean z13, boolean z14) {
            super(R.drawable.icon_matter, true, i0.Pd, i0.Qd, z14, z13, oz.d.SHARE_MATTER_CODE, "SMART_HOME_CONTROL_SHARE_MATTER_CODE_LIST_ITEM", null);
            this.f12968i = z13;
            this.f12969j = z14;
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final c a() {
            return new C0378c(false, false);
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final boolean b() {
            return this.f12968i;
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final boolean c() {
            return this.f12969j;
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final c d() {
            return new C0378c(true, false);
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final c e() {
            return new C0378c(true, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0378c) {
                C0378c c0378c = (C0378c) obj;
                return this.f12968i == c0378c.f12968i && this.f12969j == c0378c.f12969j;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12969j) + (Boolean.hashCode(this.f12968i) * 31);
        }

        public final String toString() {
            return "ShareMatterCode(enabled=" + this.f12968i + ", loading=" + this.f12969j + ")";
        }

        public /* synthetic */ C0378c(boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? true : z13, (i13 & 2) != 0 ? false : z14);
        }

        public C0378c() {
            this(false, false, 3, null);
        }
    }

    public /* synthetic */ c(int i13, boolean z13, LocalisationKey localisationKey, LocalisationKey localisationKey2, boolean z14, boolean z15, oz.d dVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, z13, localisationKey, localisationKey2, z14, z15, dVar, str);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/c$a;", "Lcom/dyson/mobile/android/connectedhome/matter/c;", "", "enabled", "loading", "Lcom/dyson/mobile/android/connectedhome/matter/b;", "connectionStatus", "<init>", "(ZZLcom/dyson/mobile/android/connectedhome/matter/b;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: i  reason: collision with root package name */
        public final boolean f12962i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f12963j;

        /* renamed from: k  reason: collision with root package name */
        public final com.dyson.mobile.android.connectedhome.matter.b f12964k;

        static {
            LocalisationKey.a aVar = LocalisationKey.f15077f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z13, boolean z14, com.dyson.mobile.android.connectedhome.matter.b bVar) {
            super(2131232990, false, j0.f72081f, bVar.getLocalisationKey(), z14, z13, oz.d.AMAZON_ALEXA, "TAG_SMART_HOME_CONTROL_AMAZON_ALEXA_LIST_ITEM", 2, null);
            bVar.getClass();
            this.f12962i = z13;
            this.f12963j = z14;
            this.f12964k = bVar;
        }

        public static a f(a aVar, boolean z13, boolean z14) {
            com.dyson.mobile.android.connectedhome.matter.b bVar = aVar.f12964k;
            bVar.getClass();
            return new a(z13, z14, bVar);
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final c a() {
            return f(this, false, false);
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final boolean b() {
            return this.f12962i;
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final boolean c() {
            return this.f12963j;
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final c d() {
            return f(this, true, false);
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final c e() {
            return f(this, true, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f12962i == aVar.f12962i && this.f12963j == aVar.f12963j && this.f12964k == aVar.f12964k;
            }
            return false;
        }

        public final int hashCode() {
            return this.f12964k.hashCode() + w.c(Boolean.hashCode(this.f12962i) * 31, 31, this.f12963j);
        }

        public final String toString() {
            StringBuilder i13 = i.i("AmazonAlexa(enabled=", ", loading=", ", connectionStatus=", this.f12962i, this.f12963j);
            i13.append(this.f12964k);
            i13.append(")");
            return i13.toString();
        }

        public /* synthetic */ a(boolean z13, boolean z14, com.dyson.mobile.android.connectedhome.matter.b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? true : z13, (i13 & 2) != 0 ? false : z14, (i13 & 4) != 0 ? com.dyson.mobile.android.connectedhome.matter.b.NOT_CONNECTED : bVar);
        }

        public a() {
            this(false, false, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/c$b;", "Lcom/dyson/mobile/android/connectedhome/matter/c;", "", "enabled", "loading", "Lcom/dyson/mobile/android/connectedhome/matter/b;", "connectionStatus", "<init>", "(ZZLcom/dyson/mobile/android/connectedhome/matter/b;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: i  reason: collision with root package name */
        public final boolean f12965i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f12966j;

        /* renamed from: k  reason: collision with root package name */
        public final com.dyson.mobile.android.connectedhome.matter.b f12967k;

        static {
            LocalisationKey.a aVar = LocalisationKey.f15077f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z13, boolean z14, com.dyson.mobile.android.connectedhome.matter.b bVar) {
            super(2131232994, false, i0.Od, bVar.getLocalisationKey(), z14, z13, oz.d.GOOGLE_HOME, "SMART_HOME_CONTROL_GOOGLE_HOME_LIST_ITEM", 2, null);
            bVar.getClass();
            this.f12965i = z13;
            this.f12966j = z14;
            this.f12967k = bVar;
        }

        public static b f(b bVar, boolean z13, boolean z14) {
            com.dyson.mobile.android.connectedhome.matter.b bVar2 = bVar.f12967k;
            bVar2.getClass();
            return new b(z13, z14, bVar2);
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final c a() {
            return f(this, false, false);
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final boolean b() {
            return this.f12965i;
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final boolean c() {
            return this.f12966j;
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final c d() {
            return f(this, true, false);
        }

        @Override // com.dyson.mobile.android.connectedhome.matter.c
        public final c e() {
            return f(this, true, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f12965i == bVar.f12965i && this.f12966j == bVar.f12966j && this.f12967k == bVar.f12967k;
            }
            return false;
        }

        public final int hashCode() {
            return this.f12967k.hashCode() + w.c(Boolean.hashCode(this.f12965i) * 31, 31, this.f12966j);
        }

        public final String toString() {
            StringBuilder i13 = i.i("GoogleHome(enabled=", ", loading=", ", connectionStatus=", this.f12965i, this.f12966j);
            i13.append(this.f12967k);
            i13.append(")");
            return i13.toString();
        }

        public /* synthetic */ b(boolean z13, boolean z14, com.dyson.mobile.android.connectedhome.matter.b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? true : z13, (i13 & 2) != 0 ? false : z14, (i13 & 4) != 0 ? com.dyson.mobile.android.connectedhome.matter.b.NOT_CONNECTED : bVar);
        }

        public b() {
            this(false, false, null, 7, null);
        }
    }
}
