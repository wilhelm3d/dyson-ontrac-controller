package com.dyson.mobile.android.audio.bonding;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xj.q;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/c;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/dyson/mobile/android/audio/bonding/c$a;", "Lcom/dyson/mobile/android/audio/bonding/c$b;", "Lcom/dyson/mobile/android/audio/bonding/c$c;", "Lcom/dyson/mobile/android/audio/bonding/c$d;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/c$a;", "Lcom/dyson/mobile/android/audio/bonding/c;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12365a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/c$b;", "Lcom/dyson/mobile/android/audio/bonding/c;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12366a = new b();

        private b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/c$c;", "Lcom/dyson/mobile/android/audio/bonding/c;", "Lxj/q;", "reason", "<init>", "(Lxj/q;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.bonding.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0339c extends c {

        /* renamed from: a  reason: collision with root package name */
        public final q f12367a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0339c(q qVar) {
            super(null);
            qVar.getClass();
            this.f12367a = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0339c) && this.f12367a == ((C0339c) obj).f12367a;
        }

        public final int hashCode() {
            return this.f12367a.hashCode();
        }

        public final String toString() {
            return "NotBonded(reason=" + this.f12367a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/c$d;", "Lcom/dyson/mobile/android/audio/bonding/c;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f12368a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
