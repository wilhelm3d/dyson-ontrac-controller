package com.dyson.nst.dyson3d.schema.parsing;

import com.salesforce.marketingcloud.messages.inbox.b;
import kotlin.Metadata;
import ma.e;
import oy1.i0;
import oy1.p;
import sg1.d;
import tq1.a;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/parsing/DecodableAnimationCurveAdaptor;", "", "<init>", "()V", "Lsg1/d;", b.f21448j, "", "toJson", "(Lsg1/d;)Ljava/lang/String;", "string", "fromJson", "(Ljava/lang/String;)Lsg1/d;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DecodableAnimationCurveAdaptor {
    public static final int $stable = 0;

    @p
    public final d fromJson(String str) {
        str.getClass();
        if (str.equals("linear")) {
            return d.b.f76142b;
        }
        if (str.equals("easeInOut")) {
            return d.a.f76140b;
        }
        a.k();
        return null;
    }

    @i0
    public final String toJson(d dVar) {
        dVar.getClass();
        if (dVar.equals(d.b.f76142b)) {
            return "linear";
        }
        if (dVar.equals(d.a.f76140b)) {
            return "easeInOut";
        }
        e.o();
        return null;
    }
}
