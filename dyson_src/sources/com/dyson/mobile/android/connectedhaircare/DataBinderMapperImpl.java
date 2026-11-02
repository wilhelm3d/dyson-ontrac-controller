package com.dyson.mobile.android.connectedhaircare;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import q8.e;
import q8.f;
import q8.t;
/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f12931a = new SparseIntArray(0);

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f12932a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(25);
            f12932a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "adapter");
            sparseArray.put(2, "annotation");
            sparseArray.put(3, "carouselViewModel");
            sparseArray.put(4, "colorIndex");
            sparseArray.put(5, "command");
            sparseArray.put(6, "contactDetail");
            sparseArray.put(7, "content");
            sparseArray.put(8, "data");
            sparseArray.put(9, "descriptionAccessibilityContainer");
            sparseArray.put(10, "descriptionAccessibilityKey");
            sparseArray.put(11, "descriptionContainer");
            sparseArray.put(12, "descriptionKey");
            sparseArray.put(13, "dividerVisibility");
            sparseArray.put(14, "image");
            sparseArray.put(15, "item");
            sparseArray.put(16, "itemUIState");
            sparseArray.put(17, "level");
            sparseArray.put(18, "location");
            sparseArray.put(19, "name");
            sparseArray.put(20, "showChevron");
            sparseArray.put(21, "title");
            sparseArray.put(22, "titleAccessibilityKey");
            sparseArray.put(23, "titleKey");
            sparseArray.put(24, "viewModel");
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f12933a = new HashMap<>(0);

        private b() {
        }
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.account.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.machine.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.reporting.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.resources.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.support.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.utilities.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // q8.e
    public final String convertBrIdToString(int i13) {
        return a.f12932a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f12931a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }

    @Override // q8.e
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12933a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        if (f12931a.get(i13) <= 0 || view.getTag() != null) {
            return null;
        }
        s72.a.w("view must have a tag");
        return null;
    }
}
