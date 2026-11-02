package pf0;

import android.content.Context;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.logging.Logger;
import i12.c0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import x12.u0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpf0/f;", "", "<init>", "()V", "mod-localisation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f64086a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<Context> f64087b;

    private f() {
    }

    public static c a() {
        WeakReference<Context> weakReference = f64087b;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            return new e(context).f64085a;
        }
        Logger.b("Unable to get LocalisationManager, Context is unavailable", null);
        return null;
    }

    public static String b(int i13, LocalisationKey localisationKey) {
        localisationKey.getClass();
        c a13 = a();
        if (a13 != null) {
            return a13.b(i13, localisationKey);
        }
        u0 u0Var = u0.f86723a;
        Logger.b(String.format("Unable to lookup string: %s, LocalisationManager is unavailable", Arrays.copyOf(new Object[]{localisationKey}, 1)), null);
        String str = localisationKey.e;
        if (str == null) {
            Integer num = localisationKey.d;
            String valueOf = num != null ? String.valueOf(num.intValue()) : null;
            return valueOf == null ? "" : valueOf;
        }
        return str;
    }

    public static final String c(LocalisationKey localisationKey) {
        Integer num;
        String str;
        f64086a.getClass();
        c a13 = a();
        if (a13 != null) {
            return a13.d(localisationKey);
        }
        u0 u0Var = u0.f86723a;
        Logger.b(String.format("Unable to lookup string: %s, LocalisationManager is unavailable", Arrays.copyOf(new Object[]{localisationKey}, 1)), null);
        return (localisationKey == null || (str = localisationKey.e) == null) ? (localisationKey == null || (num = localisationKey.d) == null) ? "" : String.valueOf(num.intValue()) : str;
    }

    public static final String d(String str, List list) {
        list.getClass();
        str.getClass();
        return c0.W(list, str, null, null, new pe0.h(6), 30);
    }
}
