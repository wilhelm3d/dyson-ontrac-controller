package com.dyson.mobile.android.robot.newsystem.managerules;

import com.dyson.mobile.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u001d\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/h;", "", "", AnnotatedPrivateKey.LABEL, "iconRes", "<init>", "(II)V", "a", "b", "Lcom/dyson/mobile/android/robot/newsystem/managerules/h$a;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/h$b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f16432a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16433b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/h$a;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/h;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends h {

        /* renamed from: c  reason: collision with root package name */
        public static final a f16434c = new a();

        private a() {
            super(R.string.machine804a_addRule, R.drawable.plus, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1960223920;
        }

        public final String toString() {
            return "AddRule";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/h$b;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/h;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends h {

        /* renamed from: c  reason: collision with root package name */
        public static final b f16435c = new b();

        private b() {
            super(R.string.machine804a_removeRule, R.drawable.ic_delete, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 297168717;
        }

        public final String toString() {
            return "RemoveRule";
        }
    }

    private h(int i13, int i14) {
        this.f16432a = i13;
        this.f16433b = i14;
    }

    public /* synthetic */ h(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14);
    }
}
