package com.dyson.mobile.android.logging;

import com.brightcove.player.event.EventType;
import i12.c0;
import i12.s;
import java.io.File;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import sf0.a;
import sf0.b;
import sf0.c;
import v32.i;
import v32.k;
import v32.w;
import v32.y;
import x12.p0;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/logging/Logger;", "", "<init>", "()V", "mod-logging"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Logger {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f15079a = new Logger();

    /* renamed from: b  reason: collision with root package name */
    public static final String f15080b = p0.f86717a.b(Logger.class).o();

    /* renamed from: c  reason: collision with root package name */
    public static final CopyOnWriteArrayList<a> f15081c = new CopyOnWriteArrayList<>();

    private Logger() {
    }

    public static final void a(String str) {
        str.getClass();
        b bVar = b.DEBUG;
        f15079a.getClass();
        d(bVar, str, null);
    }

    public static final void b(String str, Throwable th2) {
        b bVar = b.ERROR;
        f15079a.getClass();
        d(bVar, str, th2);
    }

    public static final void c(String str) {
        b bVar = b.INFO;
        f15079a.getClass();
        d(bVar, str, null);
    }

    public static void d(b bVar, String str, Throwable th2) {
        String str2;
        String str3;
        String fileName;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int i13 = 0;
        boolean z13 = false;
        while (true) {
            if (i13 >= length) {
                str2 = "NULL_CLASS";
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i13];
            String className = stackTraceElement.getClassName();
            if (className != null) {
                if (r.c((String) y.L(className, new String[]{"\\."}, 0, 6).get(0), f15080b)) {
                    z13 = true;
                } else if (z13 && (fileName = stackTraceElement.getFileName()) != null) {
                    str2 = new File(fileName).getName();
                    str2.getClass();
                    int B = y.B(0, 6, str2, ".");
                    if (B != -1) {
                        str2 = str2.substring(0, B);
                    }
                }
            }
            i13++;
        }
        Iterator<a> it = f15081c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            EnumSet<c> enumSet = next.f76079a;
            f15079a.getClass();
            if (str != null) {
                str3 = str;
                for (c cVar : enumSet) {
                    k b13 = cVar.getRegex().b(str3);
                    while (b13 != null) {
                        i iVar = (i) c0.X(b13.f83108c);
                        if (iVar == null) {
                            break;
                        }
                        d22.k kVar = iVar.f83104b;
                        int i14 = kVar.d;
                        int i15 = kVar.e;
                        String obfuscationString = cVar.getObfuscationString();
                        if (obfuscationString == null) {
                            obfuscationString = w.l(EventType.ANY, (i15 - i14) + 1);
                        }
                        obfuscationString.getClass();
                        str3 = y.H(str3, i14, i15 + 1, obfuscationString).toString();
                        b13 = cVar.getRegex().b(str3);
                    }
                }
            } else {
                str3 = str;
            }
            if (s.c(b.ERROR).contains(bVar)) {
                next.b(str3, th2);
            }
            next.a(bVar, str2, str3, th2);
        }
    }

    public static final void e(String str, Throwable th2) {
        str.getClass();
        b bVar = b.WARN;
        f15079a.getClass();
        d(bVar, str, th2);
    }
}
