package com.dyson.android.mobile.connectedhome;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.dyson.mobile.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nh.d;
import nh.h;
import nh.j;
import nh.l;
import nh.n;
import nh.p;
import nh.r;
import nh.v;
import nh.x;
import nh.z;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import qv1.s;
/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f12080a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f12081a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(12);
            f12081a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "adapter");
            sparseArray.put(2, "carouselViewModel");
            sparseArray.put(3, "command");
            sparseArray.put(4, "contactDetail");
            sparseArray.put(5, "content");
            sparseArray.put(6, "dividerVisibility");
            sparseArray.put(7, "itemUIState");
            sparseArray.put(8, "name");
            sparseArray.put(9, "showChevron");
            sparseArray.put(10, "title");
            sparseArray.put(11, "viewModel");
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f12082a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(13);
            f12082a = hashMap;
            c.k(R.layout.activity_voice_control, hashMap, "layout/activity_voice_control_0", R.layout.fragment_alexa_failure, "layout/fragment_alexa_failure_0");
            c.k(R.layout.fragment_alexa_landing_screen, hashMap, "layout/fragment_alexa_landing_screen_0", R.layout.fragment_alexa_linking, "layout/fragment_alexa_linking_0");
            c.k(R.layout.fragment_alexa_login_with_amazon, hashMap, "layout/fragment_alexa_login_with_amazon_0", R.layout.fragment_alexa_success, "layout/fragment_alexa_success_0");
            c.k(R.layout.fragment_example_commands_list, hashMap, "layout/fragment_example_commands_list_0", R.layout.fragment_google_home_landing_screen, "layout/fragment_google_home_landing_screen_0");
            c.k(R.layout.fragment_tmall_genie_enable_skill, hashMap, "layout/fragment_tmall_genie_enable_skill_0", R.layout.fragment_voice_control_option_screen, "layout/fragment_voice_control_option_screen_0");
            c.k(R.layout.fragment_voice_tmall, hashMap, "layout/fragment_voice_tmall_0", R.layout.item_example_commands_child, "layout/item_example_commands_child_0");
            hashMap.put("layout/item_example_commands_title_0", Integer.valueOf((int) R.layout.item_example_commands_title));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(13);
        f12080a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_voice_control, 1);
        sparseIntArray.put(R.layout.fragment_alexa_failure, 2);
        sparseIntArray.put(R.layout.fragment_alexa_landing_screen, 3);
        sparseIntArray.put(R.layout.fragment_alexa_linking, 4);
        sparseIntArray.put(R.layout.fragment_alexa_login_with_amazon, 5);
        sparseIntArray.put(R.layout.fragment_alexa_success, 6);
        sparseIntArray.put(R.layout.fragment_example_commands_list, 7);
        sparseIntArray.put(R.layout.fragment_google_home_landing_screen, 8);
        sparseIntArray.put(R.layout.fragment_tmall_genie_enable_skill, 9);
        sparseIntArray.put(R.layout.fragment_voice_control_option_screen, 10);
        sparseIntArray.put(R.layout.fragment_voice_tmall, 11);
        sparseIntArray.put(R.layout.item_example_commands_child, 12);
        sparseIntArray.put(R.layout.item_example_commands_title, 13);
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.resources.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.support.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.utilities.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // q8.e
    public final String convertBrIdToString(int i13) {
        return a.f12081a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f12080a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i14) {
                    case 1:
                        if ("layout/activity_voice_control_0".equals(tag)) {
                            return new nh.b(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_voice_control is invalid. Received: "));
                        return null;
                    case 2:
                        if ("layout/fragment_alexa_failure_0".equals(tag)) {
                            return new d(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_alexa_failure is invalid. Received: "));
                        return null;
                    case 3:
                        if ("layout/fragment_alexa_landing_screen_0".equals(tag)) {
                            return new nh.f(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_alexa_landing_screen is invalid. Received: "));
                        return null;
                    case 4:
                        if ("layout/fragment_alexa_linking_0".equals(tag)) {
                            return new h(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_alexa_linking is invalid. Received: "));
                        return null;
                    case 5:
                        if ("layout/fragment_alexa_login_with_amazon_0".equals(tag)) {
                            return new j(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_alexa_login_with_amazon is invalid. Received: "));
                        return null;
                    case 6:
                        if ("layout/fragment_alexa_success_0".equals(tag)) {
                            return new l(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_alexa_success is invalid. Received: "));
                        return null;
                    case 7:
                        if ("layout/fragment_example_commands_list_0".equals(tag)) {
                            return new n(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_example_commands_list is invalid. Received: "));
                        return null;
                    case 8:
                        if ("layout/fragment_google_home_landing_screen_0".equals(tag)) {
                            return new p(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_google_home_landing_screen is invalid. Received: "));
                        return null;
                    case 9:
                        if ("layout/fragment_tmall_genie_enable_skill_0".equals(tag)) {
                            return new r(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_tmall_genie_enable_skill is invalid. Received: "));
                        return null;
                    case 10:
                        if ("layout/fragment_voice_control_option_screen_0".equals(tag)) {
                            return new nh.t(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_voice_control_option_screen is invalid. Received: "));
                        return null;
                    case 11:
                        if ("layout/fragment_voice_tmall_0".equals(tag)) {
                            return new v(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_voice_tmall is invalid. Received: "));
                        return null;
                    case 12:
                        if ("layout/item_example_commands_child_0".equals(tag)) {
                            return new x(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_example_commands_child is invalid. Received: "));
                        return null;
                    case 13:
                        if ("layout/item_example_commands_title_0".equals(tag)) {
                            return new z(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_example_commands_title is invalid. Received: "));
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
        if (str == null || (num = b.f12082a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f12080a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
