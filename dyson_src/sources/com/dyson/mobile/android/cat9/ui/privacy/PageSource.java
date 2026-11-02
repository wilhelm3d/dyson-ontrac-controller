package com.dyson.mobile.android.cat9.ui.privacy;

import androidx.annotation.Keep;
import h12.l;
import h12.m;
import h12.n;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mm0.f;
import t42.b;
import t42.g;
import x42.b0;
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat9/ui/privacy/PageSource;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ConnectionJourney", "ProductSettings", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes2.dex */
public final class PageSource {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ PageSource[] $VALUES;
    private static final l<b<Object>> $cachedSerializer$delegate;
    public static final a Companion;
    public static final PageSource ConnectionJourney = new PageSource("ConnectionJourney", 0);
    public static final PageSource ProductSettings = new PageSource("ProductSettings", 1);

    private static final /* synthetic */ PageSource[] $values() {
        return new PageSource[]{ConnectionJourney, ProductSettings};
    }

    static {
        PageSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
        $cachedSerializer$delegate = m.a(n.PUBLICATION, new f(17));
    }

    private PageSource(String str, int i13) {
        super(str, i13);
    }

    public static final b _init_$_anonymous_() {
        PageSource[] values = values();
        values.getClass();
        return new b0("com.dyson.mobile.android.cat9.ui.privacy.PageSource", values);
    }

    public static o12.a<PageSource> getEntries() {
        return $ENTRIES;
    }

    public static PageSource valueOf(String str) {
        return (PageSource) Enum.valueOf(PageSource.class, str);
    }

    public static PageSource[] values() {
        return (PageSource[]) $VALUES.clone();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat9/ui/privacy/PageSource$a;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/cat9/ui/privacy/PageSource;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<PageSource> serializer() {
            return (b) PageSource.$cachedSerializer$delegate.getValue();
        }

        private a() {
        }
    }
}
