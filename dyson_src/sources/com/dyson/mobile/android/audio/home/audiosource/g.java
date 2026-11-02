package com.dyson.mobile.android.audio.home.audiosource;

import b0.y1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/g;", "", "<init>", "()V", "c", "b", "d", "a", "e", "Lcom/dyson/mobile/android/audio/home/audiosource/g$a;", "Lcom/dyson/mobile/android/audio/home/audiosource/g$b;", "Lcom/dyson/mobile/android/audio/home/audiosource/g$c;", "Lcom/dyson/mobile/android/audio/home/audiosource/g$d;", "Lcom/dyson/mobile/android/audio/home/audiosource/g$e;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/g$a;", "Lcom/dyson/mobile/android/audio/home/audiosource/g;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12403a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1590744826;
        }

        public final String toString() {
            return "CablePluggedIn";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/g$b;", "Lcom/dyson/mobile/android/audio/home/audiosource/g;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12404a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 266550849;
        }

        public final String toString() {
            return "Disconnected";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/g$c;", "Lcom/dyson/mobile/android/audio/home/audiosource/g;", "", "Lcp/a;", "devices", "<init>", "(Ljava/util/List;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends g {

        /* renamed from: a  reason: collision with root package name */
        public final List<cp.a> f12405a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<cp.a> list) {
            super(null);
            list.getClass();
            this.f12405a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && r.c(this.f12405a, ((c) obj).f12405a);
        }

        public final int hashCode() {
            return this.f12405a.hashCode();
        }

        public final String toString() {
            return y1.l("Enabled(devices=", ")", this.f12405a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/g$d;", "Lcom/dyson/mobile/android/audio/home/audiosource/g;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f12406a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1941151400;
        }

        public final String toString() {
            return "NoSourcesAvailable";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/g$e;", "Lcom/dyson/mobile/android/audio/home/audiosource/g;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final e f12407a = new e();

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -695953906;
        }

        public final String toString() {
            return "UpdateRequired";
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private g() {
    }
}
