package com.dyson.mobile.android.resources;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.dyson.mobile.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lb.s;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import ss0.a0;
import ss0.c0;
import ss0.c1;
import ss0.e0;
import ss0.e1;
import ss0.g;
import ss0.g0;
import ss0.h1;
import ss0.i0;
import ss0.j1;
import ss0.k0;
import ss0.l1;
import ss0.m0;
import ss0.o;
import ss0.o0;
import ss0.q;
import ss0.r;
import ss0.r0;
import ss0.t0;
import ss0.v0;
import ss0.x0;
import ss0.z;
import ss0.z0;
/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f15625a;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f15626a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(8);
            f15626a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "carouselViewModel");
            sparseArray.put(2, "content");
            sparseArray.put(3, "itemUIState");
            sparseArray.put(4, "name");
            sparseArray.put(5, "showChevron");
            sparseArray.put(6, "title");
            sparseArray.put(7, "viewModel");
        }

        private a() {
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f15627a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(25);
            f15627a = hashMap;
            c.k(R.layout.activity_container, hashMap, "layout/activity_container_0", R.layout.activity_dyson_brightcove_player, "layout/activity_dyson_brightcove_player_0");
            c.k(R.layout.activity_web_view, hashMap, "layout/activity_web_view_0", R.layout.dialog_year_picker, "layout/dialog_year_picker_0");
            Integer valueOf = Integer.valueOf((int) R.layout.dyson_brightcove_video_player);
            hashMap.put("layout/dyson_brightcove_video_player_0", valueOf);
            hashMap.put("layout-large/dyson_brightcove_video_player_0", valueOf);
            Integer valueOf2 = Integer.valueOf((int) R.layout.fragment_alert_dialog);
            hashMap.put("layout-h440dp/fragment_alert_dialog_0", valueOf2);
            s.p(hashMap, "layout/fragment_alert_dialog_0", valueOf2, R.layout.fragment_connectivity_issue, "layout/fragment_connectivity_issue_0");
            c.k(R.layout.fragment_custom_name, hashMap, "layout/fragment_custom_name_0", R.layout.fragment_generic_carousel, "layout/fragment_generic_carousel_0");
            c.k(R.layout.fragment_generic_information_screen, hashMap, "layout/fragment_generic_information_screen_0", R.layout.fragment_name_choice, "layout/fragment_name_choice_0");
            c.k(R.layout.fragment_progress_spinner, hashMap, "layout/fragment_progress_spinner_0", R.layout.generic_carousel_step, "layout/generic_carousel_step_0");
            c.k(R.layout.item_check_list, hashMap, "layout/item_check_list_0", R.layout.item_custom_name, "layout/item_custom_name_0");
            c.k(R.layout.item_dummy, hashMap, "layout/item_dummy_0", R.layout.item_menu_list, "layout/item_menu_list_0");
            c.k(R.layout.item_name, hashMap, "layout/item_name_0", R.layout.layout_data_visualisation_graph, "layout/layout_data_visualisation_graph_0");
            c.k(R.layout.layout_dialog_view, hashMap, "layout/layout_dialog_view_0", R.layout.sheet_dialog_drawer_titled_paged, "layout/sheet_dialog_drawer_titled_paged_0");
            c.k(R.layout.sheet_dialog_drawer_titled_paged_item, hashMap, "layout/sheet_dialog_drawer_titled_paged_item_0", R.layout.sheet_dialog_drawer_with_title, "layout/sheet_dialog_drawer_with_title_0");
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(23);
        f15625a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_container, 1);
        sparseIntArray.put(R.layout.activity_dyson_brightcove_player, 2);
        sparseIntArray.put(R.layout.activity_web_view, 3);
        sparseIntArray.put(R.layout.dialog_year_picker, 4);
        sparseIntArray.put(R.layout.dyson_brightcove_video_player, 5);
        sparseIntArray.put(R.layout.fragment_alert_dialog, 6);
        sparseIntArray.put(R.layout.fragment_connectivity_issue, 7);
        sparseIntArray.put(R.layout.fragment_custom_name, 8);
        sparseIntArray.put(R.layout.fragment_generic_carousel, 9);
        sparseIntArray.put(R.layout.fragment_generic_information_screen, 10);
        sparseIntArray.put(R.layout.fragment_name_choice, 11);
        sparseIntArray.put(R.layout.fragment_progress_spinner, 12);
        sparseIntArray.put(R.layout.generic_carousel_step, 13);
        sparseIntArray.put(R.layout.item_check_list, 14);
        sparseIntArray.put(R.layout.item_custom_name, 15);
        sparseIntArray.put(R.layout.item_dummy, 16);
        sparseIntArray.put(R.layout.item_menu_list, 17);
        sparseIntArray.put(R.layout.item_name, 18);
        sparseIntArray.put(R.layout.layout_data_visualisation_graph, 19);
        sparseIntArray.put(R.layout.layout_dialog_view, 20);
        sparseIntArray.put(R.layout.sheet_dialog_drawer_titled_paged, 21);
        sparseIntArray.put(R.layout.sheet_dialog_drawer_titled_paged_item, 22);
        sparseIntArray.put(R.layout.sheet_dialog_drawer_with_title, 23);
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.utilities.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // q8.e
    public final String convertBrIdToString(int i13) {
        return a.f15626a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f15625a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i14) {
                    case 1:
                        if ("layout/activity_container_0".equals(tag)) {
                            return new ss0.c(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for activity_container is invalid. Received: "));
                        return null;
                    case 2:
                        if ("layout/activity_dyson_brightcove_player_0".equals(tag)) {
                            return new ss0.e(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for activity_dyson_brightcove_player is invalid. Received: "));
                        return null;
                    case 3:
                        if ("layout/activity_web_view_0".equals(tag)) {
                            return new g(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for activity_web_view is invalid. Received: "));
                        return null;
                    case 4:
                        if ("layout/dialog_year_picker_0".equals(tag)) {
                            return new o(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for dialog_year_picker is invalid. Received: "));
                        return null;
                    case 5:
                        if ("layout/dyson_brightcove_video_player_0".equals(tag)) {
                            return new q(fVar, view);
                        }
                        if ("layout-large/dyson_brightcove_video_player_0".equals(tag)) {
                            return new r(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for dyson_brightcove_video_player is invalid. Received: "));
                        return null;
                    case 6:
                        if ("layout-h440dp/fragment_alert_dialog_0".equals(tag)) {
                            return new z(fVar, view);
                        }
                        if ("layout/fragment_alert_dialog_0".equals(tag)) {
                            return new a0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for fragment_alert_dialog is invalid. Received: "));
                        return null;
                    case 7:
                        if ("layout/fragment_connectivity_issue_0".equals(tag)) {
                            return new c0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for fragment_connectivity_issue is invalid. Received: "));
                        return null;
                    case 8:
                        if ("layout/fragment_custom_name_0".equals(tag)) {
                            return new e0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for fragment_custom_name is invalid. Received: "));
                        return null;
                    case 9:
                        if ("layout/fragment_generic_carousel_0".equals(tag)) {
                            return new g0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for fragment_generic_carousel is invalid. Received: "));
                        return null;
                    case 10:
                        if ("layout/fragment_generic_information_screen_0".equals(tag)) {
                            return new i0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for fragment_generic_information_screen is invalid. Received: "));
                        return null;
                    case 11:
                        if ("layout/fragment_name_choice_0".equals(tag)) {
                            return new k0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for fragment_name_choice is invalid. Received: "));
                        return null;
                    case 12:
                        if ("layout/fragment_progress_spinner_0".equals(tag)) {
                            return new m0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for fragment_progress_spinner is invalid. Received: "));
                        return null;
                    case 13:
                        if ("layout/generic_carousel_step_0".equals(tag)) {
                            return new o0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for generic_carousel_step is invalid. Received: "));
                        return null;
                    case 14:
                        if ("layout/item_check_list_0".equals(tag)) {
                            return new r0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for item_check_list is invalid. Received: "));
                        return null;
                    case 15:
                        if ("layout/item_custom_name_0".equals(tag)) {
                            return new t0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for item_custom_name is invalid. Received: "));
                        return null;
                    case 16:
                        if ("layout/item_dummy_0".equals(tag)) {
                            return new v0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for item_dummy is invalid. Received: "));
                        return null;
                    case 17:
                        if ("layout/item_menu_list_0".equals(tag)) {
                            return new x0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for item_menu_list is invalid. Received: "));
                        return null;
                    case 18:
                        if ("layout/item_name_0".equals(tag)) {
                            return new z0(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for item_name is invalid. Received: "));
                        return null;
                    case 19:
                        if ("layout/layout_data_visualisation_graph_0".equals(tag)) {
                            return new c1(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for layout_data_visualisation_graph is invalid. Received: "));
                        return null;
                    case 20:
                        if ("layout/layout_dialog_view_0".equals(tag)) {
                            return new e1(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for layout_dialog_view is invalid. Received: "));
                        return null;
                    case 21:
                        if ("layout/sheet_dialog_drawer_titled_paged_0".equals(tag)) {
                            return new h1(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for sheet_dialog_drawer_titled_paged is invalid. Received: "));
                        return null;
                    case 22:
                        if ("layout/sheet_dialog_drawer_titled_paged_item_0".equals(tag)) {
                            return new j1(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for sheet_dialog_drawer_titled_paged_item is invalid. Received: "));
                        return null;
                    case 23:
                        if ("layout/sheet_dialog_drawer_with_title_0".equals(tag)) {
                            return new l1(fVar, view);
                        }
                        c.p(qv1.s.h(tag, "The tag for sheet_dialog_drawer_with_title is invalid. Received: "));
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
        if (str == null || (num = b.f15627a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f15625a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
