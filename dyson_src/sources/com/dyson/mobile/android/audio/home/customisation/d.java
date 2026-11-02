package com.dyson.mobile.android.audio.home.customisation;

import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface d {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/d$a;", "Lcom/dyson/mobile/android/audio/home/customisation/d;", "", "optionName", "", "isLeft", "<init>", "(Ljava/lang/String;Z)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final String f12470a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12471b;

        public a(String str, boolean z13) {
            str.getClass();
            this.f12470a = str;
            this.f12471b = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f12470a.equals(aVar.f12470a) && this.f12471b == aVar.f12471b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12471b) + (this.f12470a.hashCode() * 31);
        }

        public final String toString() {
            return o1.a.e("CapSelected(optionName=", this.f12470a, ", isLeft=", this.f12471b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/d$b;", "Lcom/dyson/mobile/android/audio/home/customisation/d;", "", "optionName", "", "isLeft", "<init>", "(Ljava/lang/String;Z)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final String f12472a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12473b;

        public b(String str, boolean z13) {
            str.getClass();
            this.f12472a = str;
            this.f12473b = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f12472a.equals(bVar.f12472a) && this.f12473b == bVar.f12473b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12473b) + (this.f12472a.hashCode() * 31);
        }

        public final String toString() {
            return o1.a.e("CushionSelected(optionName=", this.f12472a, ", isLeft=", this.f12473b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/d$c;", "Lcom/dyson/mobile/android/audio/home/customisation/d;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f12474a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 859575789;
        }

        public final String toString() {
            return "Save";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/d$d;", "Lcom/dyson/mobile/android/audio/home/customisation/d;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.home.customisation.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0345d implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final C0345d f12475a = new C0345d();

        private C0345d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0345d);
        }

        public final int hashCode() {
            return -881438068;
        }

        public final String toString() {
            return "ScreenError";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/d$e;", "Lcom/dyson/mobile/android/audio/home/customisation/d;", "", "isTurnedOn", "<init>", "(Z)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f12476a;

        public e(boolean z13) {
            this.f12476a = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f12476a == ((e) obj).f12476a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12476a);
        }

        public final String toString() {
            return d72.a.j("SeparateSelectionSwitched(isTurnedOn=", ")", this.f12476a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/d$f;", "Lcom/dyson/mobile/android/audio/home/customisation/d;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final f f12477a = new f();

        private f() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1119615457;
        }

        public final String toString() {
            return "ShopClicked";
        }
    }
}
