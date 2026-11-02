package com.dyson.mobile.android.robot.newsystem.managerules;

import com.dyson.mobile.android.robot.newsystem.managerules.c;
import com.dyson.mobile.android.robot.newsystem.managerules.h;
import i41.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/b;", "", "Li41/q;", "ruleConstraints", "Lcom/dyson/mobile/android/robot/newsystem/managerules/h;", "ruleActionButtonState", "Lcom/dyson/mobile/android/robot/newsystem/managerules/c;", "manageRuleUpdateState", "Lcom/dyson/mobile/android/robot/newsystem/managerules/i;", "ruleValidationResult", "<init>", "(Li41/q;Lcom/dyson/mobile/android/robot/newsystem/managerules/h;Lcom/dyson/mobile/android/robot/newsystem/managerules/c;Lcom/dyson/mobile/android/robot/newsystem/managerules/i;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final q f16386a;

    /* renamed from: b  reason: collision with root package name */
    public final h f16387b;

    /* renamed from: c  reason: collision with root package name */
    public final c f16388c;
    public final i d;

    public b(q qVar, h hVar, c cVar, i iVar) {
        qVar.getClass();
        hVar.getClass();
        cVar.getClass();
        this.f16386a = qVar;
        this.f16387b = hVar;
        this.f16388c = cVar;
        this.d = iVar;
    }

    public static b a(b bVar, h hVar, c cVar, i iVar, int i13) {
        q qVar = bVar.f16386a;
        if ((i13 & 2) != 0) {
            hVar = bVar.f16387b;
        }
        if ((i13 & 4) != 0) {
            cVar = bVar.f16388c;
        }
        if ((i13 & 8) != 0) {
            iVar = bVar.d;
        }
        bVar.getClass();
        qVar.getClass();
        hVar.getClass();
        cVar.getClass();
        return new b(qVar, hVar, cVar, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return r.c(this.f16386a, bVar.f16386a) && r.c(this.f16387b, bVar.f16387b) && r.c(this.f16388c, bVar.f16388c) && r.c(this.d, bVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f16388c.hashCode() + ((this.f16387b.hashCode() + (this.f16386a.hashCode() * 31)) * 31)) * 31;
        i iVar = this.d;
        return hashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "ManageRuleUIState(ruleConstraints=" + this.f16386a + ", ruleActionButtonState=" + this.f16387b + ", manageRuleUpdateState=" + this.f16388c + ", ruleValidationResult=" + this.d + ")";
    }

    public /* synthetic */ b(q qVar, h hVar, c cVar, i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, (i13 & 2) != 0 ? h.a.f16434c : hVar, (i13 & 4) != 0 ? c.a.f16389a : cVar, (i13 & 8) != 0 ? null : iVar);
    }
}
