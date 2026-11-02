package com.dyson.mobile.android.support;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.dyson.mobile.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o71.d;
import o71.h;
import o71.j;
import o71.l;
import o71.n;
import o71.p;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import qv1.s;
/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f16745a;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f16746a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(10);
            f16746a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "adapter");
            sparseArray.put(2, "carouselViewModel");
            sparseArray.put(3, "contactDetail");
            sparseArray.put(4, "content");
            sparseArray.put(5, "itemUIState");
            sparseArray.put(6, "name");
            sparseArray.put(7, "showChevron");
            sparseArray.put(8, "title");
            sparseArray.put(9, "viewModel");
        }

        private a() {
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f16747a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(8);
            f16747a = hashMap;
            c.k(R.layout.activity_network_compatibility, hashMap, "layout/activity_network_compatibility_0", R.layout.dialog_contact_dyson, "layout/dialog_contact_dyson_0");
            c.k(R.layout.fragment_contact_dyson, hashMap, "layout/fragment_contact_dyson_0", R.layout.fragment_faulty_machine, "layout/fragment_faulty_machine_0");
            c.k(R.layout.fragment_remote_support_content, hashMap, "layout/fragment_remote_support_content_0", R.layout.fragment_remote_support_list, "layout/fragment_remote_support_list_0");
            c.k(R.layout.item_contact_channel, hashMap, "layout/item_contact_channel_0", R.layout.layout_remote_content_view, "layout/layout_remote_content_view_0");
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        f16745a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_network_compatibility, 1);
        sparseIntArray.put(R.layout.dialog_contact_dyson, 2);
        sparseIntArray.put(R.layout.fragment_contact_dyson, 3);
        sparseIntArray.put(R.layout.fragment_faulty_machine, 4);
        sparseIntArray.put(R.layout.fragment_remote_support_content, 5);
        sparseIntArray.put(R.layout.fragment_remote_support_list, 6);
        sparseIntArray.put(R.layout.item_contact_channel, 7);
        sparseIntArray.put(R.layout.layout_remote_content_view, 8);
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.reporting.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.resources.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.utilities.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // q8.e
    public final String convertBrIdToString(int i13) {
        return a.f16746a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f16745a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i14) {
                    case 1:
                        if ("layout/activity_network_compatibility_0".equals(tag)) {
                            return new o71.b(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_network_compatibility is invalid. Received: "));
                        return null;
                    case 2:
                        if ("layout/dialog_contact_dyson_0".equals(tag)) {
                            return new d(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for dialog_contact_dyson is invalid. Received: "));
                        return null;
                    case 3:
                        if ("layout/fragment_contact_dyson_0".equals(tag)) {
                            return new o71.f(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_contact_dyson is invalid. Received: "));
                        return null;
                    case 4:
                        if ("layout/fragment_faulty_machine_0".equals(tag)) {
                            return new h(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_faulty_machine is invalid. Received: "));
                        return null;
                    case 5:
                        if ("layout/fragment_remote_support_content_0".equals(tag)) {
                            return new j(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_remote_support_content is invalid. Received: "));
                        return null;
                    case 6:
                        if ("layout/fragment_remote_support_list_0".equals(tag)) {
                            return new l(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_remote_support_list is invalid. Received: "));
                        return null;
                    case 7:
                        if ("layout/item_contact_channel_0".equals(tag)) {
                            return new n(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_contact_channel is invalid. Received: "));
                        return null;
                    case 8:
                        if ("layout/layout_remote_content_view_0".equals(tag)) {
                            return new p(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_remote_content_view is invalid. Received: "));
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
        if (str == null || (num = b.f16747a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f16745a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
