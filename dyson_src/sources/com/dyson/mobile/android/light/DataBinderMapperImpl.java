package com.dyson.mobile.android.light;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.dyson.mobile.android.R;
import com.paypal.android.platform.authsdk.BR;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import je0.a1;
import je0.a2;
import je0.b0;
import je0.c1;
import je0.c2;
import je0.d;
import je0.d0;
import je0.e1;
import je0.e2;
import je0.f0;
import je0.g1;
import je0.g2;
import je0.h;
import je0.h0;
import je0.i1;
import je0.i2;
import je0.j;
import je0.k0;
import je0.k1;
import je0.k2;
import je0.l;
import je0.m0;
import je0.m1;
import je0.m2;
import je0.n;
import je0.o0;
import je0.o1;
import je0.p;
import je0.q0;
import je0.q1;
import je0.r;
import je0.s0;
import je0.s1;
import je0.u0;
import je0.u1;
import je0.v;
import je0.w0;
import je0.w1;
import je0.x;
import je0.y0;
import je0.y1;
import je0.z;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import qv1.s;
/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f14726a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f14727a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(37);
            f14727a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "adapter");
            sparseArray.put(2, "alpha");
            sparseArray.put(3, "annotation");
            sparseArray.put(4, "carouselViewModel");
            sparseArray.put(5, "colorIndex");
            sparseArray.put(6, "command");
            sparseArray.put(7, "contactDetail");
            sparseArray.put(8, "content");
            sparseArray.put(9, "data");
            sparseArray.put(10, "description1");
            sparseArray.put(11, "description2");
            sparseArray.put(12, "description3");
            sparseArray.put(13, "description3Visibility");
            sparseArray.put(14, "descriptionAccessibilityContainer");
            sparseArray.put(15, "descriptionAccessibilityKey");
            sparseArray.put(16, "descriptionContainer");
            sparseArray.put(17, "descriptionKey");
            sparseArray.put(18, "dividerVisibility");
            sparseArray.put(19, "header");
            sparseArray.put(20, "icon");
            sparseArray.put(21, "image");
            sparseArray.put(22, "importantForAccessibility");
            sparseArray.put(23, "item");
            sparseArray.put(24, "itemUIState");
            sparseArray.put(25, "level");
            sparseArray.put(26, "location");
            sparseArray.put(27, "lottie");
            sparseArray.put(28, "mainViewModel");
            sparseArray.put(29, "name");
            sparseArray.put(30, "overlayVisible");
            sparseArray.put(31, "removeButtonVisible");
            sparseArray.put(32, "showChevron");
            sparseArray.put(33, "title");
            sparseArray.put(34, "titleAccessibilityKey");
            sparseArray.put(35, "titleKey");
            sparseArray.put(36, "viewModel");
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f14728a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(45);
            f14728a = hashMap;
            c.k(R.layout.activity_custom_baseline, hashMap, "layout/activity_custom_baseline_0", R.layout.activity_light_mode_animation, "layout/activity_light_mode_animation_0");
            c.k(R.layout.activity_light_modes_dialog, hashMap, "layout/activity_light_modes_dialog_0", R.layout.activity_light_onboarding, "layout/activity_light_onboarding_0");
            c.k(R.layout.activity_light_permission, hashMap, "layout/activity_light_permission_0", R.layout.activity_light_profile_summary, "layout/activity_light_profile_summary_0");
            c.k(R.layout.activity_wake_up_brightness, hashMap, "layout/activity_wake_up_brightness_0", R.layout.activity_wake_up_schedule_landing, "layout/activity_wake_up_schedule_landing_0");
            c.k(R.layout.activity_wake_up_schedule_multiple_event, hashMap, "layout/activity_wake_up_schedule_multiple_event_0", R.layout.activity_wake_up_schedule_single_event, "layout/activity_wake_up_schedule_single_event_0");
            c.k(R.layout.dialog_light_hours, hashMap, "layout/dialog_light_hours_0", R.layout.dialog_light_set_location, "layout/dialog_light_set_location_0");
            c.k(R.layout.dialog_wake_up_mode, hashMap, "layout/dialog_wake_up_mode_0", R.layout.fragment_auto_brightness, "layout/fragment_auto_brightness_0");
            c.k(R.layout.fragment_custom_modes_control, hashMap, "layout/fragment_custom_modes_control_0", R.layout.fragment_custom_modes_description, "layout/fragment_custom_modes_description_0");
            c.k(R.layout.fragment_engineering_ui_light_home, hashMap, "layout/fragment_engineering_ui_light_home_0", R.layout.fragment_light_configuration, "layout/fragment_light_configuration_0");
            c.k(R.layout.fragment_light_contextual_menu, hashMap, "layout/fragment_light_contextual_menu_0", R.layout.fragment_light_control_dialog, "layout/fragment_light_control_dialog_0");
            c.k(R.layout.fragment_light_home, hashMap, "layout/fragment_light_home_0", R.layout.fragment_light_location, "layout/fragment_light_location_0");
            c.k(R.layout.fragment_light_location_start, hashMap, "layout/fragment_light_location_start_0", R.layout.fragment_light_remove, "layout/fragment_light_remove_0");
            c.k(R.layout.fragment_light_schedule, hashMap, "layout/fragment_light_schedule_0", R.layout.fragment_light_settings, "layout/fragment_light_settings_0");
            c.k(R.layout.fragment_light_values_info_dialog, hashMap, "layout/fragment_light_values_info_dialog_0", R.layout.fragment_movement_sensor, "layout/fragment_movement_sensor_0");
            c.k(R.layout.item_light_onboarding, hashMap, "layout/item_light_onboarding_0", R.layout.item_light_schedule_event, "layout/item_light_schedule_event_0");
            c.k(R.layout.item_light_unit, hashMap, "layout/item_light_unit_0", R.layout.item_modes_light, "layout/item_modes_light_0");
            c.k(R.layout.layout_after_sunset, hashMap, "layout/layout_after_sunset_0", R.layout.layout_age_adjust, "layout/layout_age_adjust_0");
            c.k(R.layout.layout_away_mode, hashMap, "layout/layout_away_mode_0", R.layout.layout_daylight, "layout/layout_daylight_0");
            c.k(R.layout.layout_light_colour, hashMap, "layout/layout_light_colour_0", R.layout.layout_light_contextual_menu_item, "layout/layout_light_contextual_menu_item_0");
            c.k(R.layout.layout_light_ota, hashMap, "layout/layout_light_ota_0", R.layout.layout_ownership, "layout/layout_ownership_0");
            c.k(R.layout.layout_room_label, hashMap, "layout/layout_room_label_0", R.layout.layout_sensors, "layout/layout_sensors_0");
            c.k(R.layout.layout_sleep_mode, hashMap, "layout/layout_sleep_mode_0", R.layout.layout_wake_up_description, "layout/layout_wake_up_description_0");
            hashMap.put("layout/layout_wake_up_mode_0", Integer.valueOf((int) R.layout.layout_wake_up_mode));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(45);
        f14726a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_custom_baseline, 1);
        sparseIntArray.put(R.layout.activity_light_mode_animation, 2);
        sparseIntArray.put(R.layout.activity_light_modes_dialog, 3);
        sparseIntArray.put(R.layout.activity_light_onboarding, 4);
        sparseIntArray.put(R.layout.activity_light_permission, 5);
        sparseIntArray.put(R.layout.activity_light_profile_summary, 6);
        sparseIntArray.put(R.layout.activity_wake_up_brightness, 7);
        sparseIntArray.put(R.layout.activity_wake_up_schedule_landing, 8);
        sparseIntArray.put(R.layout.activity_wake_up_schedule_multiple_event, 9);
        sparseIntArray.put(R.layout.activity_wake_up_schedule_single_event, 10);
        sparseIntArray.put(R.layout.dialog_light_hours, 11);
        sparseIntArray.put(R.layout.dialog_light_set_location, 12);
        sparseIntArray.put(R.layout.dialog_wake_up_mode, 13);
        sparseIntArray.put(R.layout.fragment_auto_brightness, 14);
        sparseIntArray.put(R.layout.fragment_custom_modes_control, 15);
        sparseIntArray.put(R.layout.fragment_custom_modes_description, 16);
        sparseIntArray.put(R.layout.fragment_engineering_ui_light_home, 17);
        sparseIntArray.put(R.layout.fragment_light_configuration, 18);
        sparseIntArray.put(R.layout.fragment_light_contextual_menu, 19);
        sparseIntArray.put(R.layout.fragment_light_control_dialog, 20);
        sparseIntArray.put(R.layout.fragment_light_home, 21);
        sparseIntArray.put(R.layout.fragment_light_location, 22);
        sparseIntArray.put(R.layout.fragment_light_location_start, 23);
        sparseIntArray.put(R.layout.fragment_light_remove, 24);
        sparseIntArray.put(R.layout.fragment_light_schedule, 25);
        sparseIntArray.put(R.layout.fragment_light_settings, 26);
        sparseIntArray.put(R.layout.fragment_light_values_info_dialog, 27);
        sparseIntArray.put(R.layout.fragment_movement_sensor, 28);
        sparseIntArray.put(R.layout.item_light_onboarding, 29);
        sparseIntArray.put(R.layout.item_light_schedule_event, 30);
        sparseIntArray.put(R.layout.item_light_unit, 31);
        sparseIntArray.put(R.layout.item_modes_light, 32);
        sparseIntArray.put(R.layout.layout_after_sunset, 33);
        sparseIntArray.put(R.layout.layout_age_adjust, 34);
        sparseIntArray.put(R.layout.layout_away_mode, 35);
        sparseIntArray.put(R.layout.layout_daylight, 36);
        sparseIntArray.put(R.layout.layout_light_colour, 37);
        sparseIntArray.put(R.layout.layout_light_contextual_menu_item, 38);
        sparseIntArray.put(R.layout.layout_light_ota, 39);
        sparseIntArray.put(R.layout.layout_ownership, 40);
        sparseIntArray.put(R.layout.layout_room_label, 41);
        sparseIntArray.put(R.layout.layout_sensors, 42);
        sparseIntArray.put(R.layout.layout_sleep_mode, 43);
        sparseIntArray.put(R.layout.layout_wake_up_description, 44);
        sparseIntArray.put(R.layout.layout_wake_up_mode, 45);
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.android.mobile.connectedhome.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.account.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.machine.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.reporting.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.resources.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.schedule.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.support.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.utilities.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // q8.e
    public final String convertBrIdToString(int i13) {
        return a.f14727a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f14726a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i14) {
                    case 1:
                        if ("layout/activity_custom_baseline_0".equals(tag)) {
                            return new je0.b(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_custom_baseline is invalid. Received: "));
                        return null;
                    case 2:
                        if ("layout/activity_light_mode_animation_0".equals(tag)) {
                            return new d(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_light_mode_animation is invalid. Received: "));
                        return null;
                    case 3:
                        if ("layout/activity_light_modes_dialog_0".equals(tag)) {
                            return new je0.f(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_light_modes_dialog is invalid. Received: "));
                        return null;
                    case 4:
                        if ("layout/activity_light_onboarding_0".equals(tag)) {
                            return new h(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_light_onboarding is invalid. Received: "));
                        return null;
                    case 5:
                        if ("layout/activity_light_permission_0".equals(tag)) {
                            return new j(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_light_permission is invalid. Received: "));
                        return null;
                    case 6:
                        if ("layout/activity_light_profile_summary_0".equals(tag)) {
                            return new l(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_light_profile_summary is invalid. Received: "));
                        return null;
                    case 7:
                        if ("layout/activity_wake_up_brightness_0".equals(tag)) {
                            return new n(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_wake_up_brightness is invalid. Received: "));
                        return null;
                    case 8:
                        if ("layout/activity_wake_up_schedule_landing_0".equals(tag)) {
                            return new p(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_wake_up_schedule_landing is invalid. Received: "));
                        return null;
                    case 9:
                        if ("layout/activity_wake_up_schedule_multiple_event_0".equals(tag)) {
                            return new r(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_wake_up_schedule_multiple_event is invalid. Received: "));
                        return null;
                    case 10:
                        if ("layout/activity_wake_up_schedule_single_event_0".equals(tag)) {
                            return new je0.t(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_wake_up_schedule_single_event is invalid. Received: "));
                        return null;
                    case 11:
                        if ("layout/dialog_light_hours_0".equals(tag)) {
                            return new v(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for dialog_light_hours is invalid. Received: "));
                        return null;
                    case 12:
                        if ("layout/dialog_light_set_location_0".equals(tag)) {
                            return new x(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for dialog_light_set_location is invalid. Received: "));
                        return null;
                    case 13:
                        if ("layout/dialog_wake_up_mode_0".equals(tag)) {
                            return new z(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for dialog_wake_up_mode is invalid. Received: "));
                        return null;
                    case 14:
                        if ("layout/fragment_auto_brightness_0".equals(tag)) {
                            return new b0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_auto_brightness is invalid. Received: "));
                        return null;
                    case 15:
                        if ("layout/fragment_custom_modes_control_0".equals(tag)) {
                            return new d0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_custom_modes_control is invalid. Received: "));
                        return null;
                    case 16:
                        if ("layout/fragment_custom_modes_description_0".equals(tag)) {
                            return new f0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_custom_modes_description is invalid. Received: "));
                        return null;
                    case 17:
                        if ("layout/fragment_engineering_ui_light_home_0".equals(tag)) {
                            return new h0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_engineering_ui_light_home is invalid. Received: "));
                        return null;
                    case 18:
                        if ("layout/fragment_light_configuration_0".equals(tag)) {
                            return new k0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_light_configuration is invalid. Received: "));
                        return null;
                    case 19:
                        if ("layout/fragment_light_contextual_menu_0".equals(tag)) {
                            return new m0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_light_contextual_menu is invalid. Received: "));
                        return null;
                    case 20:
                        if ("layout/fragment_light_control_dialog_0".equals(tag)) {
                            return new o0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_light_control_dialog is invalid. Received: "));
                        return null;
                    case 21:
                        if ("layout/fragment_light_home_0".equals(tag)) {
                            return new q0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_light_home is invalid. Received: "));
                        return null;
                    case 22:
                        if ("layout/fragment_light_location_0".equals(tag)) {
                            return new s0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_light_location is invalid. Received: "));
                        return null;
                    case 23:
                        if ("layout/fragment_light_location_start_0".equals(tag)) {
                            return new u0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_light_location_start is invalid. Received: "));
                        return null;
                    case 24:
                        if ("layout/fragment_light_remove_0".equals(tag)) {
                            return new w0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_light_remove is invalid. Received: "));
                        return null;
                    case 25:
                        if ("layout/fragment_light_schedule_0".equals(tag)) {
                            return new y0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_light_schedule is invalid. Received: "));
                        return null;
                    case 26:
                        if ("layout/fragment_light_settings_0".equals(tag)) {
                            return new a1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_light_settings is invalid. Received: "));
                        return null;
                    case 27:
                        if ("layout/fragment_light_values_info_dialog_0".equals(tag)) {
                            return new c1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_light_values_info_dialog is invalid. Received: "));
                        return null;
                    case 28:
                        if ("layout/fragment_movement_sensor_0".equals(tag)) {
                            return new e1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_movement_sensor is invalid. Received: "));
                        return null;
                    case 29:
                        if ("layout/item_light_onboarding_0".equals(tag)) {
                            return new g1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_light_onboarding is invalid. Received: "));
                        return null;
                    case 30:
                        if ("layout/item_light_schedule_event_0".equals(tag)) {
                            return new i1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_light_schedule_event is invalid. Received: "));
                        return null;
                    case 31:
                        if ("layout/item_light_unit_0".equals(tag)) {
                            return new k1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_light_unit is invalid. Received: "));
                        return null;
                    case 32:
                        if ("layout/item_modes_light_0".equals(tag)) {
                            return new m1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_modes_light is invalid. Received: "));
                        return null;
                    case 33:
                        if ("layout/layout_after_sunset_0".equals(tag)) {
                            return new o1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_after_sunset is invalid. Received: "));
                        return null;
                    case 34:
                        if ("layout/layout_age_adjust_0".equals(tag)) {
                            return new q1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_age_adjust is invalid. Received: "));
                        return null;
                    case 35:
                        if ("layout/layout_away_mode_0".equals(tag)) {
                            return new s1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_away_mode is invalid. Received: "));
                        return null;
                    case 36:
                        if ("layout/layout_daylight_0".equals(tag)) {
                            return new u1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_daylight is invalid. Received: "));
                        return null;
                    case BR.dysonDomain /* 37 */:
                        if ("layout/layout_light_colour_0".equals(tag)) {
                            return new w1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_light_colour is invalid. Received: "));
                        return null;
                    case BR.ecViewModel /* 38 */:
                        if ("layout/layout_light_contextual_menu_item_0".equals(tag)) {
                            return new y1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_light_contextual_menu_item is invalid. Received: "));
                        return null;
                    case BR.errorVisibility /* 39 */:
                        if ("layout/layout_light_ota_0".equals(tag)) {
                            return new a2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_light_ota is invalid. Received: "));
                        return null;
                    case 40:
                        if ("layout/layout_ownership_0".equals(tag)) {
                            return new c2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_ownership is invalid. Received: "));
                        return null;
                    case BR.filterLabel /* 41 */:
                        if ("layout/layout_room_label_0".equals(tag)) {
                            return new e2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_room_label is invalid. Received: "));
                        return null;
                    case BR.filterLife /* 42 */:
                        if ("layout/layout_sensors_0".equals(tag)) {
                            return new g2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_sensors is invalid. Received: "));
                        return null;
                    case BR.functionIcon /* 43 */:
                        if ("layout/layout_sleep_mode_0".equals(tag)) {
                            return new i2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_sleep_mode is invalid. Received: "));
                        return null;
                    case BR.hasInfiniteLife /* 44 */:
                        if ("layout/layout_wake_up_description_0".equals(tag)) {
                            return new k2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_wake_up_description is invalid. Received: "));
                        return null;
                    case BR.header /* 45 */:
                        if ("layout/layout_wake_up_mode_0".equals(tag)) {
                            return new m2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_wake_up_mode is invalid. Received: "));
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
        if (str == null || (num = b.f14728a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f14726a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
