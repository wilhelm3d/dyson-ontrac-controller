package com.dyson.mobile.android.cat6;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.dyson.mobile.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mq.d;
import mq.h;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import qv1.s;
/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f12840a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f12841a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(25);
            f12841a = sparseArray;
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
        public static final HashMap<String, Integer> f12842a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(4);
            f12842a = hashMap;
            c.k(R.layout.activity_ownership_language_screen, hashMap, "layout/activity_ownership_language_screen_0", R.layout.fragment_ownership_language_confirmation, "layout/fragment_ownership_language_confirmation_0");
            c.k(R.layout.fragment_ownership_language_selection, hashMap, "layout/fragment_ownership_language_selection_0", R.layout.item_language, "layout/item_language_0");
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f12840a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_ownership_language_screen, 1);
        sparseIntArray.put(R.layout.fragment_ownership_language_confirmation, 2);
        sparseIntArray.put(R.layout.fragment_ownership_language_selection, 3);
        sparseIntArray.put(R.layout.item_language, 4);
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
        return a.f12841a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f12840a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                s72.a.w("view must have a tag");
            } else if (i14 == 1) {
                if ("layout/activity_ownership_language_screen_0".equals(tag)) {
                    return new mq.b(fVar, view);
                }
                c.p(s.h(tag, "The tag for activity_ownership_language_screen is invalid. Received: "));
                return null;
            } else if (i14 == 2) {
                if ("layout/fragment_ownership_language_confirmation_0".equals(tag)) {
                    return new d(fVar, view);
                }
                c.p(s.h(tag, "The tag for fragment_ownership_language_confirmation is invalid. Received: "));
                return null;
            } else if (i14 == 3) {
                if ("layout/fragment_ownership_language_selection_0".equals(tag)) {
                    return new mq.f(fVar, view);
                }
                c.p(s.h(tag, "The tag for fragment_ownership_language_selection is invalid. Received: "));
                return null;
            } else if (i14 == 4) {
                if ("layout/item_language_0".equals(tag)) {
                    return new h(fVar, view);
                }
                c.p(s.h(tag, "The tag for item_language is invalid. Received: "));
                return null;
            }
        }
        return null;
    }

    @Override // q8.e
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12842a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f12840a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
