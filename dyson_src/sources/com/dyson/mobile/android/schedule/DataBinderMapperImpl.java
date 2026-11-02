package com.dyson.mobile.android.schedule;

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
import u51.d;
import u51.h;
import u51.j;
import u51.l;
import u51.n;
import u51.p;
import u51.r;
/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f16708a;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f16709a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(26);
            f16709a = sparseArray;
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
            sparseArray.put(15, "importantForAccessibility");
            sparseArray.put(16, "item");
            sparseArray.put(17, "itemUIState");
            sparseArray.put(18, "level");
            sparseArray.put(19, "location");
            sparseArray.put(20, "name");
            sparseArray.put(21, "showChevron");
            sparseArray.put(22, "title");
            sparseArray.put(23, "titleAccessibilityKey");
            sparseArray.put(24, "titleKey");
            sparseArray.put(25, "viewModel");
        }

        private a() {
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f16710a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(9);
            f16710a = hashMap;
            c.k(R.layout.activity_schedule_edit_event, hashMap, "layout/activity_schedule_edit_event_0", R.layout.activity_schedule_landing, "layout/activity_schedule_landing_0");
            c.k(R.layout.fragment_empty_schedule_landing, hashMap, "layout/fragment_empty_schedule_landing_0", R.layout.fragment_schedule_landing_list, "layout/fragment_schedule_landing_list_0");
            c.k(R.layout.layout_schedule_day_switch, hashMap, "layout/layout_schedule_day_switch_0", R.layout.layout_schedule_days_selector, "layout/layout_schedule_days_selector_0");
            c.k(R.layout.layout_schedule_enable_switch, hashMap, "layout/layout_schedule_enable_switch_0", R.layout.layout_schedule_no_event, "layout/layout_schedule_no_event_0");
            hashMap.put("layout/layout_schedule_time_selector_0", Integer.valueOf((int) R.layout.layout_schedule_time_selector));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(9);
        f16708a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_schedule_edit_event, 1);
        sparseIntArray.put(R.layout.activity_schedule_landing, 2);
        sparseIntArray.put(R.layout.fragment_empty_schedule_landing, 3);
        sparseIntArray.put(R.layout.fragment_schedule_landing_list, 4);
        sparseIntArray.put(R.layout.layout_schedule_day_switch, 5);
        sparseIntArray.put(R.layout.layout_schedule_days_selector, 6);
        sparseIntArray.put(R.layout.layout_schedule_enable_switch, 7);
        sparseIntArray.put(R.layout.layout_schedule_no_event, 8);
        sparseIntArray.put(R.layout.layout_schedule_time_selector, 9);
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
        return a.f16709a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f16708a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i14) {
                    case 1:
                        if ("layout/activity_schedule_edit_event_0".equals(tag)) {
                            return new u51.b(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_schedule_edit_event is invalid. Received: "));
                        return null;
                    case 2:
                        if ("layout/activity_schedule_landing_0".equals(tag)) {
                            return new d(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_schedule_landing is invalid. Received: "));
                        return null;
                    case 3:
                        if ("layout/fragment_empty_schedule_landing_0".equals(tag)) {
                            return new u51.f(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_empty_schedule_landing is invalid. Received: "));
                        return null;
                    case 4:
                        if ("layout/fragment_schedule_landing_list_0".equals(tag)) {
                            return new h(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_schedule_landing_list is invalid. Received: "));
                        return null;
                    case 5:
                        if ("layout/layout_schedule_day_switch_0".equals(tag)) {
                            return new j(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_schedule_day_switch is invalid. Received: "));
                        return null;
                    case 6:
                        if ("layout/layout_schedule_days_selector_0".equals(tag)) {
                            return new l(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_schedule_days_selector is invalid. Received: "));
                        return null;
                    case 7:
                        if ("layout/layout_schedule_enable_switch_0".equals(tag)) {
                            return new n(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_schedule_enable_switch is invalid. Received: "));
                        return null;
                    case 8:
                        if ("layout/layout_schedule_no_event_0".equals(tag)) {
                            return new p(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_schedule_no_event is invalid. Received: "));
                        return null;
                    case 9:
                        if ("layout/layout_schedule_time_selector_0".equals(tag)) {
                            return new r(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_schedule_time_selector is invalid. Received: "));
                        return null;
                }
            }
            s72.a.w("view must have a tag");
        }
        return null;
    }

    @Override // q8.e
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f16710a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f16708a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
