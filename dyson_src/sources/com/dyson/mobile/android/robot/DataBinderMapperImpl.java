package com.dyson.mobile.android.robot;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.dyson.mobile.android.R;
import com.paypal.android.platform.authsdk.BR;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import qv1.s;
import yu0.b0;
import yu0.b1;
import yu0.b2;
import yu0.b3;
import yu0.b4;
import yu0.d;
import yu0.d0;
import yu0.d1;
import yu0.d2;
import yu0.d3;
import yu0.d4;
import yu0.f0;
import yu0.f1;
import yu0.f2;
import yu0.f3;
import yu0.f4;
import yu0.h;
import yu0.h0;
import yu0.h1;
import yu0.h2;
import yu0.h3;
import yu0.h4;
import yu0.j;
import yu0.j0;
import yu0.j1;
import yu0.j2;
import yu0.j3;
import yu0.j4;
import yu0.l;
import yu0.l0;
import yu0.l1;
import yu0.l2;
import yu0.l3;
import yu0.l4;
import yu0.n;
import yu0.n0;
import yu0.n1;
import yu0.n2;
import yu0.n3;
import yu0.n4;
import yu0.p;
import yu0.p0;
import yu0.p1;
import yu0.p2;
import yu0.p3;
import yu0.p4;
import yu0.r;
import yu0.r0;
import yu0.r1;
import yu0.r2;
import yu0.r3;
import yu0.t0;
import yu0.t1;
import yu0.t2;
import yu0.t3;
import yu0.v;
import yu0.v0;
import yu0.v1;
import yu0.v2;
import yu0.v3;
import yu0.x;
import yu0.x0;
import yu0.x1;
import yu0.x2;
import yu0.x3;
import yu0.z;
import yu0.z0;
import yu0.z1;
import yu0.z2;
import yu0.z3;
/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f15921a;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f15922a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(33);
            f15922a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "adapter");
            sparseArray.put(2, "annotation");
            sparseArray.put(3, "bottomSheet");
            sparseArray.put(4, "carouselViewModel");
            sparseArray.put(5, "colorIndex");
            sparseArray.put(6, "command");
            sparseArray.put(7, "contactDetail");
            sparseArray.put(8, "content");
            sparseArray.put(9, "data");
            sparseArray.put(10, "descriptionAccessibilityContainer");
            sparseArray.put(11, "descriptionAccessibilityKey");
            sparseArray.put(12, "descriptionContainer");
            sparseArray.put(13, "descriptionKey");
            sparseArray.put(14, "dividerVisibility");
            sparseArray.put(15, "icon");
            sparseArray.put(16, "image");
            sparseArray.put(17, "importantForAccessibility");
            sparseArray.put(18, "isDecreaseSensitivityVisible");
            sparseArray.put(19, "isDustMapLayerVisible");
            sparseArray.put(20, "item");
            sparseArray.put(21, "itemUIState");
            sparseArray.put(22, "level");
            sparseArray.put(23, "location");
            sparseArray.put(24, "name");
            sparseArray.put(25, "showChevron");
            sparseArray.put(26, "text");
            sparseArray.put(27, "title");
            sparseArray.put(28, "titleAccessibilityKey");
            sparseArray.put(29, "titleKey");
            sparseArray.put(30, "viewModel");
            sparseArray.put(31, "visibility");
            sparseArray.put(32, "zoningHelpViewModel");
        }

        private a() {
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f15923a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(73);
            f15923a = hashMap;
            c.k(R.layout.activity_remove_robot_progress, hashMap, "layout/activity_remove_robot_progress_0", R.layout.activity_restriction_list, "layout/activity_restriction_list_0");
            c.k(R.layout.activity_robot_map_labelling, hashMap, "layout/activity_robot_map_labelling_0", R.layout.activity_robot_map_ready, "layout/activity_robot_map_ready_0");
            c.k(R.layout.activity_robot_map_zone_definition, hashMap, "layout/activity_robot_map_zone_definition_0", R.layout.fragment_clean_history_empty, "layout/fragment_clean_history_empty_0");
            c.k(R.layout.fragment_clean_history_recent_basic, hashMap, "layout/fragment_clean_history_recent_basic_0", R.layout.fragment_clean_history_recent_entry_basic, "layout/fragment_clean_history_recent_entry_basic_0");
            c.k(R.layout.fragment_clean_history_recent_entry_mapped, hashMap, "layout/fragment_clean_history_recent_entry_mapped_0", R.layout.fragment_clean_history_recent_mapped, "layout/fragment_clean_history_recent_mapped_0");
            c.k(R.layout.fragment_clean_mode_global, hashMap, "layout/fragment_clean_mode_global_0", R.layout.fragment_clean_mode_no_maps, "layout/fragment_clean_mode_no_maps_0");
            c.k(R.layout.fragment_clean_mode_unzoned_map, hashMap, "layout/fragment_clean_mode_unzoned_map_0", R.layout.fragment_dialog_activity_complete, "layout/fragment_dialog_activity_complete_0");
            c.k(R.layout.fragment_fault_fatal, hashMap, "layout/fragment_fault_fatal_0", R.layout.fragment_instant_control_drawer, "layout/fragment_instant_control_drawer_0");
            c.k(R.layout.fragment_instructional_view, hashMap, "layout/fragment_instructional_view_0", R.layout.fragment_map_key, "layout/fragment_map_key_0");
            c.k(R.layout.fragment_map_list, hashMap, "layout/fragment_map_list_0", R.layout.fragment_onboarding, "layout/fragment_onboarding_0");
            c.k(R.layout.fragment_onboarding_step, hashMap, "layout/fragment_onboarding_step_0", R.layout.fragment_restriction_behaviour, "layout/fragment_restriction_behaviour_0");
            c.k(R.layout.fragment_restriction_definition, hashMap, "layout/fragment_restriction_definition_0", R.layout.fragment_restriction_list, "layout/fragment_restriction_list_0");
            c.k(R.layout.fragment_robot_contextual_menu, hashMap, "layout/fragment_robot_contextual_menu_0", R.layout.fragment_robot_home, "layout/fragment_robot_home_0");
            c.k(R.layout.fragment_robot_map_rooms_drawer, hashMap, "layout/fragment_robot_map_rooms_drawer_0", R.layout.fragment_robot_navigator, "layout/fragment_robot_navigator_0");
            c.k(R.layout.fragment_robot_schedule_drawer, hashMap, "layout/fragment_robot_schedule_drawer_0", R.layout.fragment_robot_settings, "layout/fragment_robot_settings_0");
            c.k(R.layout.fragment_schedule_robot_settings, hashMap, "layout/fragment_schedule_robot_settings_0", R.layout.fragment_settings_remove_robot, "layout/fragment_settings_remove_robot_0");
            c.k(R.layout.item_create_cell, hashMap, "layout/item_create_cell_0", R.layout.item_map_card, "layout/item_map_card_0");
            c.k(R.layout.item_map_key, hashMap, "layout/item_map_key_0", R.layout.item_no_maps, "layout/item_no_maps_0");
            c.k(R.layout.item_restriction, hashMap, "layout/item_restriction_0", R.layout.item_restriction_list, "layout/item_restriction_list_0");
            c.k(R.layout.item_restriction_list_header, hashMap, "layout/item_restriction_list_header_0", R.layout.item_robot_rooms_drawer, "layout/item_robot_rooms_drawer_0");
            c.k(R.layout.item_robot_schedule_event, hashMap, "layout/item_robot_schedule_event_0", R.layout.layout_clean_history_detail, "layout/layout_clean_history_detail_0");
            c.k(R.layout.layout_clean_history_detail_tile, hashMap, "layout/layout_clean_history_detail_tile_0", R.layout.layout_clean_history_entry_tab, "layout/layout_clean_history_entry_tab_0");
            c.k(R.layout.layout_clean_history_type_selection, hashMap, "layout/layout_clean_history_type_selection_0", R.layout.layout_dust_map_scale, "layout/layout_dust_map_scale_0");
            c.k(R.layout.layout_robot_battery, hashMap, "layout/layout_robot_battery_0", R.layout.layout_robot_clean_control_mode_widget, "layout/layout_robot_clean_control_mode_widget_0");
            c.k(R.layout.layout_robot_clean_controls, hashMap, "layout/layout_robot_clean_controls_0", R.layout.layout_robot_clean_mode_information, "layout/layout_robot_clean_mode_information_0");
            c.k(R.layout.layout_robot_clean_mode_tab, hashMap, "layout/layout_robot_clean_mode_tab_0", R.layout.layout_robot_clean_modes, "layout/layout_robot_clean_modes_0");
            c.k(R.layout.layout_robot_clean_status, hashMap, "layout/layout_robot_clean_status_0", R.layout.layout_robot_configurable_clean_control_mode_zone_list, "layout/layout_robot_configurable_clean_control_mode_zone_list_0");
            c.k(R.layout.layout_robot_configurable_clean_control_mode_zone_list_item, hashMap, "layout/layout_robot_configurable_clean_control_mode_zone_list_item_0", R.layout.layout_robot_configurable_clean_control_modes_estimate, "layout/layout_robot_configurable_clean_control_modes_estimate_0");
            c.k(R.layout.layout_robot_contextual_menu_error, hashMap, "layout/layout_robot_contextual_menu_error_0", R.layout.layout_robot_control, "layout/layout_robot_control_0");
            c.k(R.layout.layout_robot_drawer_clean_label, hashMap, "layout/layout_robot_drawer_clean_label_0", R.layout.layout_robot_mapping_controls, "layout/layout_robot_mapping_controls_0");
            c.k(R.layout.layout_robot_state_detail, hashMap, "layout/layout_robot_state_detail_0", R.layout.layout_robot_state_icon, "layout/layout_robot_state_icon_0");
            c.k(R.layout.layout_robot_state_label, hashMap, "layout/layout_robot_state_label_0", R.layout.layout_settings_manage_map_restrictions, "layout/layout_settings_manage_map_restrictions_0");
            c.k(R.layout.layout_settings_manage_map_zones, hashMap, "layout/layout_settings_manage_map_zones_0", R.layout.layout_settings_preview_map, "layout/layout_settings_preview_map_0");
            c.k(R.layout.layout_settings_remove_map, hashMap, "layout/layout_settings_remove_map_0", R.layout.layout_settings_rename_map, "layout/layout_settings_rename_map_0");
            c.k(R.layout.layout_zone_state_indicator, hashMap, "layout/layout_zone_state_indicator_0", R.layout.robot_contextual_menu_item, "layout/robot_contextual_menu_item_0");
            c.k(R.layout.view_cleaning_areas_created, hashMap, "layout/view_cleaning_areas_created_0", R.layout.view_robot_control_button, "layout/view_robot_control_button_0");
            hashMap.put("layout/view_robot_image_0", Integer.valueOf((int) R.layout.view_robot_image));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(73);
        f15921a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_remove_robot_progress, 1);
        sparseIntArray.put(R.layout.activity_restriction_list, 2);
        sparseIntArray.put(R.layout.activity_robot_map_labelling, 3);
        sparseIntArray.put(R.layout.activity_robot_map_ready, 4);
        sparseIntArray.put(R.layout.activity_robot_map_zone_definition, 5);
        sparseIntArray.put(R.layout.fragment_clean_history_empty, 6);
        sparseIntArray.put(R.layout.fragment_clean_history_recent_basic, 7);
        sparseIntArray.put(R.layout.fragment_clean_history_recent_entry_basic, 8);
        sparseIntArray.put(R.layout.fragment_clean_history_recent_entry_mapped, 9);
        sparseIntArray.put(R.layout.fragment_clean_history_recent_mapped, 10);
        sparseIntArray.put(R.layout.fragment_clean_mode_global, 11);
        sparseIntArray.put(R.layout.fragment_clean_mode_no_maps, 12);
        sparseIntArray.put(R.layout.fragment_clean_mode_unzoned_map, 13);
        sparseIntArray.put(R.layout.fragment_dialog_activity_complete, 14);
        sparseIntArray.put(R.layout.fragment_fault_fatal, 15);
        sparseIntArray.put(R.layout.fragment_instant_control_drawer, 16);
        sparseIntArray.put(R.layout.fragment_instructional_view, 17);
        sparseIntArray.put(R.layout.fragment_map_key, 18);
        sparseIntArray.put(R.layout.fragment_map_list, 19);
        sparseIntArray.put(R.layout.fragment_onboarding, 20);
        sparseIntArray.put(R.layout.fragment_onboarding_step, 21);
        sparseIntArray.put(R.layout.fragment_restriction_behaviour, 22);
        sparseIntArray.put(R.layout.fragment_restriction_definition, 23);
        sparseIntArray.put(R.layout.fragment_restriction_list, 24);
        sparseIntArray.put(R.layout.fragment_robot_contextual_menu, 25);
        sparseIntArray.put(R.layout.fragment_robot_home, 26);
        sparseIntArray.put(R.layout.fragment_robot_map_rooms_drawer, 27);
        sparseIntArray.put(R.layout.fragment_robot_navigator, 28);
        sparseIntArray.put(R.layout.fragment_robot_schedule_drawer, 29);
        sparseIntArray.put(R.layout.fragment_robot_settings, 30);
        sparseIntArray.put(R.layout.fragment_schedule_robot_settings, 31);
        sparseIntArray.put(R.layout.fragment_settings_remove_robot, 32);
        sparseIntArray.put(R.layout.item_create_cell, 33);
        sparseIntArray.put(R.layout.item_map_card, 34);
        sparseIntArray.put(R.layout.item_map_key, 35);
        sparseIntArray.put(R.layout.item_no_maps, 36);
        sparseIntArray.put(R.layout.item_restriction, 37);
        sparseIntArray.put(R.layout.item_restriction_list, 38);
        sparseIntArray.put(R.layout.item_restriction_list_header, 39);
        sparseIntArray.put(R.layout.item_robot_rooms_drawer, 40);
        sparseIntArray.put(R.layout.item_robot_schedule_event, 41);
        sparseIntArray.put(R.layout.layout_clean_history_detail, 42);
        sparseIntArray.put(R.layout.layout_clean_history_detail_tile, 43);
        sparseIntArray.put(R.layout.layout_clean_history_entry_tab, 44);
        sparseIntArray.put(R.layout.layout_clean_history_type_selection, 45);
        sparseIntArray.put(R.layout.layout_dust_map_scale, 46);
        sparseIntArray.put(R.layout.layout_robot_battery, 47);
        sparseIntArray.put(R.layout.layout_robot_clean_control_mode_widget, 48);
        sparseIntArray.put(R.layout.layout_robot_clean_controls, 49);
        sparseIntArray.put(R.layout.layout_robot_clean_mode_information, 50);
        sparseIntArray.put(R.layout.layout_robot_clean_mode_tab, 51);
        sparseIntArray.put(R.layout.layout_robot_clean_modes, 52);
        sparseIntArray.put(R.layout.layout_robot_clean_status, 53);
        sparseIntArray.put(R.layout.layout_robot_configurable_clean_control_mode_zone_list, 54);
        sparseIntArray.put(R.layout.layout_robot_configurable_clean_control_mode_zone_list_item, 55);
        sparseIntArray.put(R.layout.layout_robot_configurable_clean_control_modes_estimate, 56);
        sparseIntArray.put(R.layout.layout_robot_contextual_menu_error, 57);
        sparseIntArray.put(R.layout.layout_robot_control, 58);
        sparseIntArray.put(R.layout.layout_robot_drawer_clean_label, 59);
        sparseIntArray.put(R.layout.layout_robot_mapping_controls, 60);
        sparseIntArray.put(R.layout.layout_robot_state_detail, 61);
        sparseIntArray.put(R.layout.layout_robot_state_icon, 62);
        sparseIntArray.put(R.layout.layout_robot_state_label, 63);
        sparseIntArray.put(R.layout.layout_settings_manage_map_restrictions, 64);
        sparseIntArray.put(R.layout.layout_settings_manage_map_zones, 65);
        sparseIntArray.put(R.layout.layout_settings_preview_map, 66);
        sparseIntArray.put(R.layout.layout_settings_remove_map, 67);
        sparseIntArray.put(R.layout.layout_settings_rename_map, 68);
        sparseIntArray.put(R.layout.layout_zone_state_indicator, 69);
        sparseIntArray.put(R.layout.robot_contextual_menu_item, 70);
        sparseIntArray.put(R.layout.view_cleaning_areas_created, 71);
        sparseIntArray.put(R.layout.view_robot_control_button, 72);
        sparseIntArray.put(R.layout.view_robot_image, 73);
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
        return a.f15922a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f15921a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i15 = (i14 - 1) / 50;
                if (i15 == 0) {
                    switch (i14) {
                        case 1:
                            if ("layout/activity_remove_robot_progress_0".equals(tag)) {
                                return new yu0.b(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_remove_robot_progress is invalid. Received: "));
                            return null;
                        case 2:
                            if ("layout/activity_restriction_list_0".equals(tag)) {
                                return new d(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_restriction_list is invalid. Received: "));
                            return null;
                        case 3:
                            if ("layout/activity_robot_map_labelling_0".equals(tag)) {
                                return new yu0.f(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_robot_map_labelling is invalid. Received: "));
                            return null;
                        case 4:
                            if ("layout/activity_robot_map_ready_0".equals(tag)) {
                                return new h(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_robot_map_ready is invalid. Received: "));
                            return null;
                        case 5:
                            if ("layout/activity_robot_map_zone_definition_0".equals(tag)) {
                                return new j(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_robot_map_zone_definition is invalid. Received: "));
                            return null;
                        case 6:
                            if ("layout/fragment_clean_history_empty_0".equals(tag)) {
                                return new l(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_clean_history_empty is invalid. Received: "));
                            return null;
                        case 7:
                            if ("layout/fragment_clean_history_recent_basic_0".equals(tag)) {
                                return new n(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_clean_history_recent_basic is invalid. Received: "));
                            return null;
                        case 8:
                            if ("layout/fragment_clean_history_recent_entry_basic_0".equals(tag)) {
                                return new p(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_clean_history_recent_entry_basic is invalid. Received: "));
                            return null;
                        case 9:
                            if ("layout/fragment_clean_history_recent_entry_mapped_0".equals(tag)) {
                                return new r(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_clean_history_recent_entry_mapped is invalid. Received: "));
                            return null;
                        case 10:
                            if ("layout/fragment_clean_history_recent_mapped_0".equals(tag)) {
                                return new yu0.t(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_clean_history_recent_mapped is invalid. Received: "));
                            return null;
                        case 11:
                            if ("layout/fragment_clean_mode_global_0".equals(tag)) {
                                return new v(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_clean_mode_global is invalid. Received: "));
                            return null;
                        case 12:
                            if ("layout/fragment_clean_mode_no_maps_0".equals(tag)) {
                                return new x(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_clean_mode_no_maps is invalid. Received: "));
                            return null;
                        case 13:
                            if ("layout/fragment_clean_mode_unzoned_map_0".equals(tag)) {
                                return new z(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_clean_mode_unzoned_map is invalid. Received: "));
                            return null;
                        case 14:
                            if ("layout/fragment_dialog_activity_complete_0".equals(tag)) {
                                return new b0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_dialog_activity_complete is invalid. Received: "));
                            return null;
                        case 15:
                            if ("layout/fragment_fault_fatal_0".equals(tag)) {
                                return new d0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_fault_fatal is invalid. Received: "));
                            return null;
                        case 16:
                            if ("layout/fragment_instant_control_drawer_0".equals(tag)) {
                                return new f0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_instant_control_drawer is invalid. Received: "));
                            return null;
                        case 17:
                            if ("layout/fragment_instructional_view_0".equals(tag)) {
                                return new h0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_instructional_view is invalid. Received: "));
                            return null;
                        case 18:
                            if ("layout/fragment_map_key_0".equals(tag)) {
                                return new j0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_map_key is invalid. Received: "));
                            return null;
                        case 19:
                            if ("layout/fragment_map_list_0".equals(tag)) {
                                return new l0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_map_list is invalid. Received: "));
                            return null;
                        case 20:
                            if ("layout/fragment_onboarding_0".equals(tag)) {
                                return new n0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_onboarding is invalid. Received: "));
                            return null;
                        case 21:
                            if ("layout/fragment_onboarding_step_0".equals(tag)) {
                                return new p0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_onboarding_step is invalid. Received: "));
                            return null;
                        case 22:
                            if ("layout/fragment_restriction_behaviour_0".equals(tag)) {
                                return new r0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_restriction_behaviour is invalid. Received: "));
                            return null;
                        case 23:
                            if ("layout/fragment_restriction_definition_0".equals(tag)) {
                                return new t0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_restriction_definition is invalid. Received: "));
                            return null;
                        case 24:
                            if ("layout/fragment_restriction_list_0".equals(tag)) {
                                return new v0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_restriction_list is invalid. Received: "));
                            return null;
                        case 25:
                            if ("layout/fragment_robot_contextual_menu_0".equals(tag)) {
                                return new x0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_robot_contextual_menu is invalid. Received: "));
                            return null;
                        case 26:
                            if ("layout/fragment_robot_home_0".equals(tag)) {
                                return new z0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_robot_home is invalid. Received: "));
                            return null;
                        case 27:
                            if ("layout/fragment_robot_map_rooms_drawer_0".equals(tag)) {
                                return new b1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_robot_map_rooms_drawer is invalid. Received: "));
                            return null;
                        case 28:
                            if ("layout/fragment_robot_navigator_0".equals(tag)) {
                                return new d1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_robot_navigator is invalid. Received: "));
                            return null;
                        case 29:
                            if ("layout/fragment_robot_schedule_drawer_0".equals(tag)) {
                                return new f1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_robot_schedule_drawer is invalid. Received: "));
                            return null;
                        case 30:
                            if ("layout/fragment_robot_settings_0".equals(tag)) {
                                return new h1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_robot_settings is invalid. Received: "));
                            return null;
                        case 31:
                            if ("layout/fragment_schedule_robot_settings_0".equals(tag)) {
                                return new j1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_schedule_robot_settings is invalid. Received: "));
                            return null;
                        case 32:
                            if ("layout/fragment_settings_remove_robot_0".equals(tag)) {
                                return new l1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_settings_remove_robot is invalid. Received: "));
                            return null;
                        case 33:
                            if ("layout/item_create_cell_0".equals(tag)) {
                                return new n1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_create_cell is invalid. Received: "));
                            return null;
                        case 34:
                            if ("layout/item_map_card_0".equals(tag)) {
                                return new p1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_map_card is invalid. Received: "));
                            return null;
                        case 35:
                            if ("layout/item_map_key_0".equals(tag)) {
                                return new r1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_map_key is invalid. Received: "));
                            return null;
                        case 36:
                            if ("layout/item_no_maps_0".equals(tag)) {
                                return new t1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_no_maps is invalid. Received: "));
                            return null;
                        case BR.dysonDomain /* 37 */:
                            if ("layout/item_restriction_0".equals(tag)) {
                                return new v1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_restriction is invalid. Received: "));
                            return null;
                        case BR.ecViewModel /* 38 */:
                            if ("layout/item_restriction_list_0".equals(tag)) {
                                return new x1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_restriction_list is invalid. Received: "));
                            return null;
                        case BR.errorVisibility /* 39 */:
                            if ("layout/item_restriction_list_header_0".equals(tag)) {
                                return new z1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_restriction_list_header is invalid. Received: "));
                            return null;
                        case 40:
                            if ("layout/item_robot_rooms_drawer_0".equals(tag)) {
                                return new b2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_robot_rooms_drawer is invalid. Received: "));
                            return null;
                        case BR.filterLabel /* 41 */:
                            if ("layout/item_robot_schedule_event_0".equals(tag)) {
                                return new d2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_robot_schedule_event is invalid. Received: "));
                            return null;
                        case BR.filterLife /* 42 */:
                            if ("layout/layout_clean_history_detail_0".equals(tag)) {
                                return new f2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_clean_history_detail is invalid. Received: "));
                            return null;
                        case BR.functionIcon /* 43 */:
                            if ("layout/layout_clean_history_detail_tile_0".equals(tag)) {
                                return new h2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_clean_history_detail_tile is invalid. Received: "));
                            return null;
                        case BR.hasInfiniteLife /* 44 */:
                            if ("layout/layout_clean_history_entry_tab_0".equals(tag)) {
                                return new j2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_clean_history_entry_tab is invalid. Received: "));
                            return null;
                        case BR.header /* 45 */:
                            if ("layout/layout_clean_history_type_selection_0".equals(tag)) {
                                return new l2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_clean_history_type_selection is invalid. Received: "));
                            return null;
                        case BR.homeGraphViewModel /* 46 */:
                            if ("layout/layout_dust_map_scale_0".equals(tag)) {
                                return new n2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_dust_map_scale is invalid. Received: "));
                            return null;
                        case BR.icon /* 47 */:
                            if ("layout/layout_robot_battery_0".equals(tag)) {
                                return new p2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_battery is invalid. Received: "));
                            return null;
                        case 48:
                            if ("layout/layout_robot_clean_control_mode_widget_0".equals(tag)) {
                                return new r2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_clean_control_mode_widget is invalid. Received: "));
                            return null;
                        case BR.importantForAccessibility /* 49 */:
                            if ("layout/layout_robot_clean_controls_0".equals(tag)) {
                                return new t2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_clean_controls is invalid. Received: "));
                            return null;
                        case 50:
                            if ("layout/layout_robot_clean_mode_information_0".equals(tag)) {
                                return new v2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_clean_mode_information is invalid. Received: "));
                            return null;
                    }
                } else if (i15 == 1) {
                    switch (i14) {
                        case BR.isDecreaseSensitivityVisible /* 51 */:
                            if ("layout/layout_robot_clean_mode_tab_0".equals(tag)) {
                                return new x2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_clean_mode_tab is invalid. Received: "));
                            return null;
                        case BR.isDustMapLayerVisible /* 52 */:
                            if ("layout/layout_robot_clean_modes_0".equals(tag)) {
                                return new z2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_clean_modes is invalid. Received: "));
                            return null;
                        case BR.isGraphClickable /* 53 */:
                            if ("layout/layout_robot_clean_status_0".equals(tag)) {
                                return new b3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_clean_status is invalid. Received: "));
                            return null;
                        case BR.isHelpClickable /* 54 */:
                            if ("layout/layout_robot_configurable_clean_control_mode_zone_list_0".equals(tag)) {
                                return new d3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_configurable_clean_control_mode_zone_list is invalid. Received: "));
                            return null;
                        case BR.item /* 55 */:
                            if ("layout/layout_robot_configurable_clean_control_mode_zone_list_item_0".equals(tag)) {
                                return new f3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_configurable_clean_control_mode_zone_list_item is invalid. Received: "));
                            return null;
                        case 56:
                            if ("layout/layout_robot_configurable_clean_control_modes_estimate_0".equals(tag)) {
                                return new h3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_configurable_clean_control_modes_estimate is invalid. Received: "));
                            return null;
                        case 57:
                            if ("layout/layout_robot_contextual_menu_error_0".equals(tag)) {
                                return new j3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_contextual_menu_error is invalid. Received: "));
                            return null;
                        case BR.level /* 58 */:
                            if ("layout/layout_robot_control_0".equals(tag)) {
                                return new l3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_control is invalid. Received: "));
                            return null;
                        case BR.location /* 59 */:
                            if ("layout/layout_robot_drawer_clean_label_0".equals(tag)) {
                                return new n3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_drawer_clean_label is invalid. Received: "));
                            return null;
                        case 60:
                            if ("layout/layout_robot_mapping_controls_0".equals(tag)) {
                                return new p3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_mapping_controls is invalid. Received: "));
                            return null;
                        case BR.machineType /* 61 */:
                            if ("layout/layout_robot_state_detail_0".equals(tag)) {
                                return new r3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_state_detail is invalid. Received: "));
                            return null;
                        case BR.mainViewModel /* 62 */:
                            if ("layout/layout_robot_state_icon_0".equals(tag)) {
                                return new t3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_state_icon is invalid. Received: "));
                            return null;
                        case 63:
                            if ("layout/layout_robot_state_label_0".equals(tag)) {
                                return new v3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_robot_state_label is invalid. Received: "));
                            return null;
                        case 64:
                            if ("layout/layout_settings_manage_map_restrictions_0".equals(tag)) {
                                return new x3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_settings_manage_map_restrictions is invalid. Received: "));
                            return null;
                        case BR.onHelpClick /* 65 */:
                            if ("layout/layout_settings_manage_map_zones_0".equals(tag)) {
                                return new z3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_settings_manage_map_zones is invalid. Received: "));
                            return null;
                        case BR.overlayVisible /* 66 */:
                            if ("layout/layout_settings_preview_map_0".equals(tag)) {
                                return new b4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_settings_preview_map is invalid. Received: "));
                            return null;
                        case BR.passwordErrorVisibility /* 67 */:
                            if ("layout/layout_settings_remove_map_0".equals(tag)) {
                                return new d4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_settings_remove_map is invalid. Received: "));
                            return null;
                        case BR.productName /* 68 */:
                            if ("layout/layout_settings_rename_map_0".equals(tag)) {
                                return new f4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_settings_rename_map is invalid. Received: "));
                            return null;
                        case BR.progressRange /* 69 */:
                            if ("layout/layout_zone_state_indicator_0".equals(tag)) {
                                return new h4(fVar, new View[]{view});
                            }
                            c.p(s.h(tag, "The tag for layout_zone_state_indicator is invalid. Received: "));
                            return null;
                        case 70:
                            if ("layout/robot_contextual_menu_item_0".equals(tag)) {
                                return new j4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for robot_contextual_menu_item is invalid. Received: "));
                            return null;
                        case BR.range /* 71 */:
                            if ("layout/view_cleaning_areas_created_0".equals(tag)) {
                                return new l4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for view_cleaning_areas_created is invalid. Received: "));
                            return null;
                        case BR.rangeAccessibility /* 72 */:
                            if ("layout/view_robot_control_button_0".equals(tag)) {
                                return new n4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for view_robot_control_button is invalid. Received: "));
                            return null;
                        case BR.removeButtonVisible /* 73 */:
                            if ("layout/view_robot_image_0".equals(tag)) {
                                return new p4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for view_robot_image is invalid. Received: "));
                            return null;
                    }
                }
            } else {
                s72.a.w("view must have a tag");
            }
        }
        return null;
    }

    @Override // q8.e
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f15923a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        int i14;
        if (viewArr != null && viewArr.length != 0 && (i14 = f15921a.get(i13)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                s72.a.w("view must have a tag");
            } else if (i14 == 69) {
                if ("layout/layout_zone_state_indicator_0".equals(tag)) {
                    return new h4(fVar, viewArr);
                }
                c.p(s.h(tag, "The tag for layout_zone_state_indicator is invalid. Received: "));
                return null;
            }
        }
        return null;
    }
}
