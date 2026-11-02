package com.dyson.mobile.android.nonconnectedmachine;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.dyson.mobile.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import qv1.s;
/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f15579a;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f15580a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(25);
            f15580a = sparseArray;
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

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f15581a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(1);
            f15581a = hashMap;
            hashMap.put("layout/fragment_non_connected_settings_remove_machine_0", Integer.valueOf((int) R.layout.fragment_non_connected_settings_remove_machine));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f15579a = sparseIntArray;
        sparseIntArray.put(R.layout.fragment_non_connected_settings_remove_machine, 1);
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.account.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.machine.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.resources.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.support.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.utilities.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // q8.e
    public final String convertBrIdToString(int i13) {
        return a.f15580a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f15579a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                s72.a.w("view must have a tag");
            } else if (i14 == 1) {
                if ("layout/fragment_non_connected_settings_remove_machine_0".equals(tag)) {
                    return new tn0.b(fVar, view);
                }
                c.p(s.h(tag, "The tag for fragment_non_connected_settings_remove_machine is invalid. Received: "));
                return null;
            }
        }
        return null;
    }

    @Override // q8.e
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f15581a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f15579a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
