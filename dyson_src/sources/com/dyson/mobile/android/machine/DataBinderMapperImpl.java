package com.dyson.mobile.android.machine;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.dyson.mobile.android.R;
import com.paypal.android.platform.authsdk.BR;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mg0.b0;
import mg0.b1;
import mg0.b2;
import mg0.d;
import mg0.d0;
import mg0.d1;
import mg0.d2;
import mg0.f0;
import mg0.f1;
import mg0.f2;
import mg0.h;
import mg0.h0;
import mg0.h1;
import mg0.h2;
import mg0.j;
import mg0.j0;
import mg0.j1;
import mg0.j2;
import mg0.l;
import mg0.l0;
import mg0.l1;
import mg0.n;
import mg0.n0;
import mg0.n1;
import mg0.p;
import mg0.p0;
import mg0.p1;
import mg0.r;
import mg0.r0;
import mg0.r1;
import mg0.t0;
import mg0.t1;
import mg0.v;
import mg0.v0;
import mg0.v1;
import mg0.x;
import mg0.x0;
import mg0.x1;
import mg0.z;
import mg0.z0;
import mg0.z1;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import qv1.s;
/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f15082a;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f15083a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(25);
            f15083a = sparseArray;
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
        public static final HashMap<String, Integer> f15084a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(44);
            f15084a = hashMap;
            c.k(R.layout.activity_expert_content, hashMap, "layout/activity_expert_content_0", R.layout.activity_external_help, "layout/activity_external_help_0");
            c.k(R.layout.activity_help, hashMap, "layout/activity_help_0", R.layout.activity_machine_context, "layout/activity_machine_context_0");
            c.k(R.layout.activity_wifi_signal_strength_help, hashMap, "layout/activity_wifi_signal_strength_help_0", R.layout.dialog_wifi_signal_strength_help, "layout/dialog_wifi_signal_strength_help_0");
            c.k(R.layout.fragment_auto_update, hashMap, "layout/fragment_auto_update_0", R.layout.fragment_carousel, "layout/fragment_carousel_0");
            c.k(R.layout.fragment_machine_dialog, hashMap, "layout/fragment_machine_dialog_0", R.layout.fragment_machine_guide_list, "layout/fragment_machine_guide_list_0");
            c.k(R.layout.fragment_machine_location, hashMap, "layout/fragment_machine_location_0", R.layout.fragment_machine_notifications, "layout/fragment_machine_notifications_0");
            c.k(R.layout.fragment_machine_time_zone, hashMap, "layout/fragment_machine_time_zone_0", R.layout.fragment_temperature_unit, "layout/fragment_temperature_unit_0");
            c.k(R.layout.help_item_divider_view, hashMap, "layout/help_item_divider_view_0", R.layout.help_item_image_view, "layout/help_item_image_view_0");
            c.k(R.layout.help_item_overview, hashMap, "layout/help_item_overview_0", R.layout.help_item_scale_list_item, "layout/help_item_scale_list_item_0");
            c.k(R.layout.help_item_scale_list_view, hashMap, "layout/help_item_scale_list_view_0", R.layout.help_item_title_and_description_view, "layout/help_item_title_and_description_view_0");
            c.k(R.layout.help_item_title_view, hashMap, "layout/help_item_title_view_0", R.layout.item_external_air_quality_scale, "layout/item_external_air_quality_scale_0");
            c.k(R.layout.item_machine_location, hashMap, "layout/item_machine_location_0", R.layout.item_machine_time_zone, "layout/item_machine_time_zone_0");
            c.k(R.layout.layout_annotation, hashMap, "layout/layout_annotation_0", R.layout.layout_external_air_quality_help, "layout/layout_external_air_quality_help_0");
            c.k(R.layout.layout_external_help_container, hashMap, "layout/layout_external_help_container_0", R.layout.layout_external_pollen_help, "layout/layout_external_pollen_help_0");
            c.k(R.layout.layout_fault_resolution_step, hashMap, "layout/layout_fault_resolution_step_0", R.layout.layout_help_page_container, "layout/layout_help_page_container_0");
            c.k(R.layout.layout_machine_guide_view, hashMap, "layout/layout_machine_guide_view_0", R.layout.layout_machine_notification_item, "layout/layout_machine_notification_item_0");
            c.k(R.layout.layout_machine_notification_section, hashMap, "layout/layout_machine_notification_section_0", R.layout.layout_settings_cell, "layout/layout_settings_cell_0");
            c.k(R.layout.layout_settings_general, hashMap, "layout/layout_settings_general_0", R.layout.layout_settings_location, "layout/layout_settings_location_0");
            c.k(R.layout.layout_settings_notifications, hashMap, "layout/layout_settings_notifications_0", R.layout.layout_settings_remove_machine, "layout/layout_settings_remove_machine_0");
            c.k(R.layout.layout_settings_software, hashMap, "layout/layout_settings_software_0", R.layout.layout_settings_temperature, "layout/layout_settings_temperature_0");
            c.k(R.layout.layout_settings_toggle, hashMap, "layout/layout_settings_toggle_0", R.layout.layout_settings_toggle_with_description, "layout/layout_settings_toggle_with_description_0");
            c.k(R.layout.layout_settings_wifi, hashMap, "layout/layout_settings_wifi_0", R.layout.wifi_signal_strength_help_item, "layout/wifi_signal_strength_help_item_0");
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(44);
        f15082a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_expert_content, 1);
        sparseIntArray.put(R.layout.activity_external_help, 2);
        sparseIntArray.put(R.layout.activity_help, 3);
        sparseIntArray.put(R.layout.activity_machine_context, 4);
        sparseIntArray.put(R.layout.activity_wifi_signal_strength_help, 5);
        sparseIntArray.put(R.layout.dialog_wifi_signal_strength_help, 6);
        sparseIntArray.put(R.layout.fragment_auto_update, 7);
        sparseIntArray.put(R.layout.fragment_carousel, 8);
        sparseIntArray.put(R.layout.fragment_machine_dialog, 9);
        sparseIntArray.put(R.layout.fragment_machine_guide_list, 10);
        sparseIntArray.put(R.layout.fragment_machine_location, 11);
        sparseIntArray.put(R.layout.fragment_machine_notifications, 12);
        sparseIntArray.put(R.layout.fragment_machine_time_zone, 13);
        sparseIntArray.put(R.layout.fragment_temperature_unit, 14);
        sparseIntArray.put(R.layout.help_item_divider_view, 15);
        sparseIntArray.put(R.layout.help_item_image_view, 16);
        sparseIntArray.put(R.layout.help_item_overview, 17);
        sparseIntArray.put(R.layout.help_item_scale_list_item, 18);
        sparseIntArray.put(R.layout.help_item_scale_list_view, 19);
        sparseIntArray.put(R.layout.help_item_title_and_description_view, 20);
        sparseIntArray.put(R.layout.help_item_title_view, 21);
        sparseIntArray.put(R.layout.item_external_air_quality_scale, 22);
        sparseIntArray.put(R.layout.item_machine_location, 23);
        sparseIntArray.put(R.layout.item_machine_time_zone, 24);
        sparseIntArray.put(R.layout.layout_annotation, 25);
        sparseIntArray.put(R.layout.layout_external_air_quality_help, 26);
        sparseIntArray.put(R.layout.layout_external_help_container, 27);
        sparseIntArray.put(R.layout.layout_external_pollen_help, 28);
        sparseIntArray.put(R.layout.layout_fault_resolution_step, 29);
        sparseIntArray.put(R.layout.layout_help_page_container, 30);
        sparseIntArray.put(R.layout.layout_machine_guide_view, 31);
        sparseIntArray.put(R.layout.layout_machine_notification_item, 32);
        sparseIntArray.put(R.layout.layout_machine_notification_section, 33);
        sparseIntArray.put(R.layout.layout_settings_cell, 34);
        sparseIntArray.put(R.layout.layout_settings_general, 35);
        sparseIntArray.put(R.layout.layout_settings_location, 36);
        sparseIntArray.put(R.layout.layout_settings_notifications, 37);
        sparseIntArray.put(R.layout.layout_settings_remove_machine, 38);
        sparseIntArray.put(R.layout.layout_settings_software, 39);
        sparseIntArray.put(R.layout.layout_settings_temperature, 40);
        sparseIntArray.put(R.layout.layout_settings_toggle, 41);
        sparseIntArray.put(R.layout.layout_settings_toggle_with_description, 42);
        sparseIntArray.put(R.layout.layout_settings_wifi, 43);
        sparseIntArray.put(R.layout.wifi_signal_strength_help_item, 44);
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.android.mobile.connectedhome.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.account.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.reporting.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.resources.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.support.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.utilities.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // q8.e
    public final String convertBrIdToString(int i13) {
        return a.f15083a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f15082a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i14) {
                    case 1:
                        if ("layout/activity_expert_content_0".equals(tag)) {
                            return new mg0.b(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_expert_content is invalid. Received: "));
                        return null;
                    case 2:
                        if ("layout/activity_external_help_0".equals(tag)) {
                            return new d(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_external_help is invalid. Received: "));
                        return null;
                    case 3:
                        if ("layout/activity_help_0".equals(tag)) {
                            return new mg0.f(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_help is invalid. Received: "));
                        return null;
                    case 4:
                        if ("layout/activity_machine_context_0".equals(tag)) {
                            return new h(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_machine_context is invalid. Received: "));
                        return null;
                    case 5:
                        if ("layout/activity_wifi_signal_strength_help_0".equals(tag)) {
                            return new j(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_wifi_signal_strength_help is invalid. Received: "));
                        return null;
                    case 6:
                        if ("layout/dialog_wifi_signal_strength_help_0".equals(tag)) {
                            return new l(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for dialog_wifi_signal_strength_help is invalid. Received: "));
                        return null;
                    case 7:
                        if ("layout/fragment_auto_update_0".equals(tag)) {
                            return new n(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_auto_update is invalid. Received: "));
                        return null;
                    case 8:
                        if ("layout/fragment_carousel_0".equals(tag)) {
                            return new p(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_carousel is invalid. Received: "));
                        return null;
                    case 9:
                        if ("layout/fragment_machine_dialog_0".equals(tag)) {
                            return new r(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_machine_dialog is invalid. Received: "));
                        return null;
                    case 10:
                        if ("layout/fragment_machine_guide_list_0".equals(tag)) {
                            return new mg0.t(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_machine_guide_list is invalid. Received: "));
                        return null;
                    case 11:
                        if ("layout/fragment_machine_location_0".equals(tag)) {
                            return new v(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_machine_location is invalid. Received: "));
                        return null;
                    case 12:
                        if ("layout/fragment_machine_notifications_0".equals(tag)) {
                            return new x(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_machine_notifications is invalid. Received: "));
                        return null;
                    case 13:
                        if ("layout/fragment_machine_time_zone_0".equals(tag)) {
                            return new z(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_machine_time_zone is invalid. Received: "));
                        return null;
                    case 14:
                        if ("layout/fragment_temperature_unit_0".equals(tag)) {
                            return new b0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_temperature_unit is invalid. Received: "));
                        return null;
                    case 15:
                        if ("layout/help_item_divider_view_0".equals(tag)) {
                            return new d0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for help_item_divider_view is invalid. Received: "));
                        return null;
                    case 16:
                        if ("layout/help_item_image_view_0".equals(tag)) {
                            return new f0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for help_item_image_view is invalid. Received: "));
                        return null;
                    case 17:
                        if ("layout/help_item_overview_0".equals(tag)) {
                            return new h0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for help_item_overview is invalid. Received: "));
                        return null;
                    case 18:
                        if ("layout/help_item_scale_list_item_0".equals(tag)) {
                            return new j0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for help_item_scale_list_item is invalid. Received: "));
                        return null;
                    case 19:
                        if ("layout/help_item_scale_list_view_0".equals(tag)) {
                            return new l0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for help_item_scale_list_view is invalid. Received: "));
                        return null;
                    case 20:
                        if ("layout/help_item_title_and_description_view_0".equals(tag)) {
                            return new n0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for help_item_title_and_description_view is invalid. Received: "));
                        return null;
                    case 21:
                        if ("layout/help_item_title_view_0".equals(tag)) {
                            return new p0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for help_item_title_view is invalid. Received: "));
                        return null;
                    case 22:
                        if ("layout/item_external_air_quality_scale_0".equals(tag)) {
                            return new r0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_external_air_quality_scale is invalid. Received: "));
                        return null;
                    case 23:
                        if ("layout/item_machine_location_0".equals(tag)) {
                            return new t0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_machine_location is invalid. Received: "));
                        return null;
                    case 24:
                        if ("layout/item_machine_time_zone_0".equals(tag)) {
                            return new v0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_machine_time_zone is invalid. Received: "));
                        return null;
                    case 25:
                        if ("layout/layout_annotation_0".equals(tag)) {
                            return new x0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_annotation is invalid. Received: "));
                        return null;
                    case 26:
                        if ("layout/layout_external_air_quality_help_0".equals(tag)) {
                            return new z0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_external_air_quality_help is invalid. Received: "));
                        return null;
                    case 27:
                        if ("layout/layout_external_help_container_0".equals(tag)) {
                            return new b1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_external_help_container is invalid. Received: "));
                        return null;
                    case 28:
                        if ("layout/layout_external_pollen_help_0".equals(tag)) {
                            return new d1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_external_pollen_help is invalid. Received: "));
                        return null;
                    case 29:
                        if ("layout/layout_fault_resolution_step_0".equals(tag)) {
                            return new f1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_fault_resolution_step is invalid. Received: "));
                        return null;
                    case 30:
                        if ("layout/layout_help_page_container_0".equals(tag)) {
                            return new h1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_help_page_container is invalid. Received: "));
                        return null;
                    case 31:
                        if ("layout/layout_machine_guide_view_0".equals(tag)) {
                            return new j1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_machine_guide_view is invalid. Received: "));
                        return null;
                    case 32:
                        if ("layout/layout_machine_notification_item_0".equals(tag)) {
                            return new l1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_machine_notification_item is invalid. Received: "));
                        return null;
                    case 33:
                        if ("layout/layout_machine_notification_section_0".equals(tag)) {
                            return new n1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_machine_notification_section is invalid. Received: "));
                        return null;
                    case 34:
                        if ("layout/layout_settings_cell_0".equals(tag)) {
                            return new p1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_cell is invalid. Received: "));
                        return null;
                    case 35:
                        if ("layout/layout_settings_general_0".equals(tag)) {
                            return new r1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_general is invalid. Received: "));
                        return null;
                    case 36:
                        if ("layout/layout_settings_location_0".equals(tag)) {
                            return new t1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_location is invalid. Received: "));
                        return null;
                    case BR.dysonDomain /* 37 */:
                        if ("layout/layout_settings_notifications_0".equals(tag)) {
                            return new v1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_notifications is invalid. Received: "));
                        return null;
                    case BR.ecViewModel /* 38 */:
                        if ("layout/layout_settings_remove_machine_0".equals(tag)) {
                            return new x1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_remove_machine is invalid. Received: "));
                        return null;
                    case BR.errorVisibility /* 39 */:
                        if ("layout/layout_settings_software_0".equals(tag)) {
                            return new z1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_software is invalid. Received: "));
                        return null;
                    case 40:
                        if ("layout/layout_settings_temperature_0".equals(tag)) {
                            return new b2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_temperature is invalid. Received: "));
                        return null;
                    case BR.filterLabel /* 41 */:
                        if ("layout/layout_settings_toggle_0".equals(tag)) {
                            return new d2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_toggle is invalid. Received: "));
                        return null;
                    case BR.filterLife /* 42 */:
                        if ("layout/layout_settings_toggle_with_description_0".equals(tag)) {
                            return new f2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_toggle_with_description is invalid. Received: "));
                        return null;
                    case BR.functionIcon /* 43 */:
                        if ("layout/layout_settings_wifi_0".equals(tag)) {
                            return new h2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_wifi is invalid. Received: "));
                        return null;
                    case BR.hasInfiniteLife /* 44 */:
                        if ("layout/wifi_signal_strength_help_item_0".equals(tag)) {
                            return new j2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for wifi_signal_strength_help_item is invalid. Received: "));
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
        if (str == null || (num = b.f15084a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f15082a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
