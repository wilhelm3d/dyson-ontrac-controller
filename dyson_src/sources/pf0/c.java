package pf0;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.localisation.LocalisationKey;
import h12.q;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v32.w;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lpf0/c;", "", "Landroid/content/res/Resources;", "resources", "", "packageName", "Landroid/content/res/Configuration;", AbstractEvent.CONFIGURATION, "Lpf0/d;", "localisationOptions", "<init>", "(Landroid/content/res/Resources;Ljava/lang/String;Landroid/content/res/Configuration;Lpf0/d;)V", "a", "mod-localisation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Resources f64081a;

    /* renamed from: b  reason: collision with root package name */
    public final String f64082b;

    /* renamed from: c  reason: collision with root package name */
    public final Locale f64083c;

    static {
        new a(null);
    }

    public c(Resources resources, String str, Configuration configuration, d dVar) {
        resources.getClass();
        str.getClass();
        configuration.getClass();
        dVar.getClass();
        this.f64081a = resources;
        this.f64082b = str;
        Locale locale = configuration.getLocales().get(0);
        locale.getClass();
        this.f64083c = locale;
    }

    public static String a(String str) {
        String str2 = str.length() == 0 ? null : str;
        return str2 != null ? w.m(str2, "-", "‑", false) : str;
    }

    @SuppressLint({"ResourceType", "DiscouragedApi"})
    public final String b(int i13, LocalisationKey localisationKey) {
        String bVar;
        localisationKey.getClass();
        Integer num = localisationKey.d;
        try {
            int i14 = q.e;
            Integer num2 = null;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            Resources resources = this.f64081a;
            if (num2 != null) {
                bVar = resources.getQuantityString(num.intValue(), i13);
            } else {
                String str = localisationKey.e;
                bVar = str != null ? resources.getQuantityString(resources.getIdentifier(str, "string", this.f64082b), i13) : "";
            }
        } catch (Throwable th2) {
            int i15 = q.e;
            bVar = new q.b(th2);
        }
        String str2 = bVar instanceof q.b ? "" : bVar;
        str2.getClass();
        return a((String) str2);
    }

    public final String c(int i13) {
        String string = this.f64081a.getString(i13);
        string.getClass();
        return a(string);
    }

    public final String d(LocalisationKey localisationKey) {
        String str;
        if (localisationKey != null) {
            String str2 = localisationKey.e;
            if (str2 == null) {
                str2 = "";
            }
            str = e(localisationKey, str2);
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [h12.q$b] */
    @SuppressLint({"DiscouragedApi"})
    public final String e(LocalisationKey localisationKey, String str) {
        String bVar;
        try {
            int i13 = q.e;
            Integer num = localisationKey.d;
            Integer num2 = null;
            if (num != null) {
                if (num.intValue() <= 0) {
                    num = null;
                }
                num2 = num;
            }
            Resources resources = this.f64081a;
            if (num2 != null) {
                bVar = resources.getString(localisationKey.d.intValue());
            } else {
                String str2 = localisationKey.e;
                bVar = str2 != null ? resources.getString(resources.getIdentifier(str2, "string", this.f64082b)) : str;
            }
        } catch (Throwable th2) {
            int i14 = q.e;
            bVar = new q.b(th2);
        }
        if (q.b(bVar) == null) {
            str = bVar;
        }
        str.getClass();
        return a(str);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpf0/c$a;", "", "<init>", "()V", "", "HYPHEN", "Ljava/lang/String;", "NON_BREAKING_HYPHEN", "", "INVALID_RESOURCE_IDENTIFIER", "I", "mod-localisation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
