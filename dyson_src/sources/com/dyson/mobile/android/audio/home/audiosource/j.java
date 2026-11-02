package com.dyson.mobile.android.audio.home.audiosource;

import b0.y1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/j;", "", "<init>", "()V", "e", "b", "c", "d", "a", "f", "Lcom/dyson/mobile/android/audio/home/audiosource/j$a;", "Lcom/dyson/mobile/android/audio/home/audiosource/j$b;", "Lcom/dyson/mobile/android/audio/home/audiosource/j$c;", "Lcom/dyson/mobile/android/audio/home/audiosource/j$d;", "Lcom/dyson/mobile/android/audio/home/audiosource/j$e;", "Lcom/dyson/mobile/android/audio/home/audiosource/j$f;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/j$a;", "Lcom/dyson/mobile/android/audio/home/audiosource/j;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends j {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12431a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 855832267;
        }

        public final String toString() {
            return "CablePluggedIn";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/j$b;", "Lcom/dyson/mobile/android/audio/home/audiosource/j;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends j {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12432a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1267847299;
        }

        public final String toString() {
            return "Connecting";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/j$c;", "Lcom/dyson/mobile/android/audio/home/audiosource/j;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends j {

        /* renamed from: a  reason: collision with root package name */
        public static final c f12433a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -378947258;
        }

        public final String toString() {
            return "Disconnected";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/j$d;", "Lcom/dyson/mobile/android/audio/home/audiosource/j;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends j {

        /* renamed from: a  reason: collision with root package name */
        public static final d f12434a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 150339746;
        }

        public final String toString() {
            return "Empty";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/j$e;", "Lcom/dyson/mobile/android/audio/home/audiosource/j;", "", "Lvk/m;", "devices", "<init>", "(Ljava/util/List;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e extends j {

        /* renamed from: a  reason: collision with root package name */
        public final List<vk.m> f12435a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<vk.m> list) {
            super(null);
            list.getClass();
            this.f12435a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && r.c(this.f12435a, ((e) obj).f12435a);
        }

        public final int hashCode() {
            return this.f12435a.hashCode();
        }

        public final String toString() {
            return y1.l("Enabled(devices=", ")", this.f12435a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/j$f;", "Lcom/dyson/mobile/android/audio/home/audiosource/j;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f extends j {

        /* renamed from: a  reason: collision with root package name */
        public static final f f12436a = new f();

        private f() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1750623187;
        }

        public final String toString() {
            return "UpdateRequired";
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
