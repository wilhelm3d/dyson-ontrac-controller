package com.dyson.mobile.android.backgroundexecution.workmanager;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import cq.b;
import ga0.c0;
import kotlin.Metadata;
import kz1.b;
import nz1.e0;
import nz1.w;
import pa.c;
import uf0.a0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/workmanager/AllMachinesSyncWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AllMachinesSyncWorker extends RxWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllMachinesSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.RxWorker
    public final e0 g() {
        w i13;
        new b();
        i13 = cd.b.i(((e80.b) c.d(com.dyson.mobile.android.b.A)).a().a(this.d, a0.e.f81907a), "AllMachinesSyncWorker performing sync from WorkManager", new c0(7), new ga0.a0(5));
        ListenableWorker.a.c cVar = new ListenableWorker.a.c();
        b.a aVar = kz1.b.f50218a;
        return new e0(i13, null, cVar);
    }
}
