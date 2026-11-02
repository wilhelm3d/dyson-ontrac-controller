package com.dyson.mobile.android.interactableec;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.R;
import com.paypal.android.platform.authsdk.BR;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import na0.b0;
import na0.b1;
import na0.b2;
import na0.b3;
import na0.b4;
import na0.b5;
import na0.d;
import na0.d0;
import na0.d1;
import na0.d2;
import na0.d3;
import na0.d4;
import na0.d5;
import na0.f0;
import na0.f1;
import na0.f2;
import na0.f3;
import na0.f4;
import na0.f5;
import na0.h;
import na0.h0;
import na0.h1;
import na0.h2;
import na0.h3;
import na0.h4;
import na0.h5;
import na0.j;
import na0.j0;
import na0.j1;
import na0.j2;
import na0.j3;
import na0.j4;
import na0.j5;
import na0.l;
import na0.l0;
import na0.l1;
import na0.l2;
import na0.l3;
import na0.l4;
import na0.l5;
import na0.n;
import na0.n0;
import na0.n1;
import na0.n2;
import na0.n3;
import na0.n4;
import na0.n5;
import na0.p;
import na0.p0;
import na0.p1;
import na0.p2;
import na0.p3;
import na0.p4;
import na0.r;
import na0.r0;
import na0.r1;
import na0.r2;
import na0.r3;
import na0.r4;
import na0.t0;
import na0.t1;
import na0.t2;
import na0.t3;
import na0.t4;
import na0.v;
import na0.v0;
import na0.v1;
import na0.v2;
import na0.v3;
import na0.v4;
import na0.x;
import na0.x0;
import na0.x1;
import na0.x2;
import na0.x3;
import na0.x4;
import na0.z;
import na0.z0;
import na0.z1;
import na0.z2;
import na0.z3;
import na0.z4;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import qv1.s;
/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f14275a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f14276a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(51);
            f14276a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "accessibility");
            sparseArray.put(2, "activated");
            sparseArray.put(3, "adapter");
            sparseArray.put(4, "airQualityLevel");
            sparseArray.put(5, "annotation");
            sparseArray.put(6, "buttonAlpha");
            sparseArray.put(7, "carouselViewModel");
            sparseArray.put(8, TTMLParser.Attributes.COLOR);
            sparseArray.put(9, "colorIndex");
            sparseArray.put(10, "command");
            sparseArray.put(11, "contactDetail");
            sparseArray.put(12, "content");
            sparseArray.put(13, "data");
            sparseArray.put(14, "descriptionAccessibilityContainer");
            sparseArray.put(15, "descriptionAccessibilityKey");
            sparseArray.put(16, "descriptionContainer");
            sparseArray.put(17, "descriptionKey");
            sparseArray.put(18, "dial");
            sparseArray.put(19, "dividerVisibility");
            sparseArray.put(20, "dominantPollutantViewModel");
            sparseArray.put(21, "ecViewModel");
            sparseArray.put(22, "errorVisibility");
            sparseArray.put(23, "explanation");
            sparseArray.put(24, "filterLabel");
            sparseArray.put(25, "filterLife");
            sparseArray.put(26, "hasInfiniteLife");
            sparseArray.put(27, "image");
            sparseArray.put(28, "importantForAccessibility");
            sparseArray.put(29, "item");
            sparseArray.put(30, "itemUIState");
            sparseArray.put(31, "layoutViewModel");
            sparseArray.put(32, "level");
            sparseArray.put(33, "location");
            sparseArray.put(34, "name");
            sparseArray.put(35, "onClick");
            sparseArray.put(36, "progressRange");
            sparseArray.put(37, "range");
            sparseArray.put(38, "rangeAccessibility");
            sparseArray.put(39, "scaleTitle");
            sparseArray.put(40, "showChevron");
            sparseArray.put(41, "stepDescription");
            sparseArray.put(42, "stepImage");
            sparseArray.put(43, "stepNumber");
            sparseArray.put(44, "targetKey");
            sparseArray.put(45, "text");
            sparseArray.put(46, "title");
            sparseArray.put(47, "titleAccessibilityKey");
            sparseArray.put(48, "titleKey");
            sparseArray.put(49, "viewModel");
            sparseArray.put(50, "visibility");
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f14277a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(85);
            f14277a = hashMap;
            c.k(R.layout.activity_advanced_oscillation, hashMap, "layout/activity_advanced_oscillation_0", R.layout.activity_barrel_oscillation, "layout/activity_barrel_oscillation_0");
            c.k(R.layout.activity_connection_help, hashMap, "layout/activity_connection_help_0", R.layout.activity_ec_air_target, "layout/activity_ec_air_target_0");
            c.k(R.layout.activity_ec_control, hashMap, "layout/activity_ec_control_0", R.layout.activity_historical_help, "layout/activity_historical_help_0");
            c.k(R.layout.activity_internal_help, hashMap, "layout/activity_internal_help_0", R.layout.activity_schedule_ec_control, "layout/activity_schedule_ec_control_0");
            c.k(R.layout.activity_timer_control, hashMap, "layout/activity_timer_control_0", R.layout.fragment_advanced_oscillation_idle, "layout/fragment_advanced_oscillation_idle_0");
            c.k(R.layout.fragment_air_quality_target, hashMap, "layout/fragment_air_quality_target_0", R.layout.fragment_ec_filter_reset_status, "layout/fragment_ec_filter_reset_status_0");
            c.k(R.layout.fragment_historical_air_quality_help, hashMap, "layout/fragment_historical_air_quality_help_0", R.layout.fragment_historical_co2_help, "layout/fragment_historical_co2_help_0");
            c.k(R.layout.fragment_historical_humidity_help, hashMap, "layout/fragment_historical_humidity_help_0", R.layout.fragment_historical_pollutant_help, "layout/fragment_historical_pollutant_help_0");
            c.k(R.layout.fragment_historical_temperature_help, hashMap, "layout/fragment_historical_temperature_help_0", R.layout.fragment_interactable_ec_contextual_menu, "layout/fragment_interactable_ec_contextual_menu_0");
            c.k(R.layout.fragment_interactable_ec_filter_management, hashMap, "layout/fragment_interactable_ec_filter_management_0", R.layout.fragment_interactable_ec_home, "layout/fragment_interactable_ec_home_0");
            c.k(R.layout.fragment_interactable_ec_settings, hashMap, "layout/fragment_interactable_ec_settings_0", R.layout.fragment_remove_ec, "layout/fragment_remove_ec_0");
            c.k(R.layout.fragment_schedule_ec_settings, hashMap, "layout/fragment_schedule_ec_settings_0", R.layout.fragment_water_hardness, "layout/fragment_water_hardness_0");
            c.k(R.layout.item_air_quality_scale, hashMap, "layout/item_air_quality_scale_0", R.layout.item_connection_help_footer_view, "layout/item_connection_help_footer_view_0");
            c.k(R.layout.item_connection_help_header_view, hashMap, "layout/item_connection_help_header_view_0", R.layout.item_connection_help_list_content, "layout/item_connection_help_list_content_0");
            c.k(R.layout.item_connection_help_list_title, hashMap, "layout/item_connection_help_list_title_0", R.layout.item_contextual_menu, "layout/item_contextual_menu_0");
            c.k(R.layout.item_pollutant_scale, hashMap, "layout/item_pollutant_scale_0", R.layout.item_reset_instruction_step, "layout/item_reset_instruction_step_0");
            c.k(R.layout.item_schedule_event, hashMap, "layout/item_schedule_event_0", R.layout.layout_air_quality_graph, "layout/layout_air_quality_graph_0");
            c.k(R.layout.layout_air_quality_insights_graph, hashMap, "layout/layout_air_quality_insights_graph_0", R.layout.layout_air_quality_scale, "layout/layout_air_quality_scale_0");
            c.k(R.layout.layout_co2_graph, hashMap, "layout/layout_co2_graph_0", R.layout.layout_current_dominant_pollutant, "layout/layout_current_dominant_pollutant_0");
            c.k(R.layout.layout_current_sensor_data, hashMap, "layout/layout_current_sensor_data_0", R.layout.layout_ec_alert, "layout/layout_ec_alert_0");
            c.k(R.layout.layout_ec_alert_home, hashMap, "layout/layout_ec_alert_home_0", R.layout.layout_ec_control_button_long, "layout/layout_ec_control_button_long_0");
            c.k(R.layout.layout_ec_control_button_round, hashMap, "layout/layout_ec_control_button_round_0", R.layout.layout_ec_control_panel, "layout/layout_ec_control_panel_0");
            c.k(R.layout.layout_ec_control_slider, hashMap, "layout/layout_ec_control_slider_0", R.layout.layout_ec_control_temperature_indicator, "layout/layout_ec_control_temperature_indicator_0");
            c.k(R.layout.layout_ec_schedule_control_panel, hashMap, "layout/layout_ec_schedule_control_panel_0", R.layout.layout_ec_settings_air, "layout/layout_ec_settings_air_0");
            c.k(R.layout.layout_ec_settings_air_filter, hashMap, "layout/layout_ec_settings_air_filter_0", R.layout.layout_ec_settings_connection, "layout/layout_ec_settings_connection_0");
            c.k(R.layout.layout_ec_settings_deep_clean_cycle, hashMap, "layout/layout_ec_settings_deep_clean_cycle_0", R.layout.layout_ec_settings_general, "layout/layout_ec_settings_general_0");
            c.k(R.layout.layout_ec_settings_location, hashMap, "layout/layout_ec_settings_location_0", R.layout.layout_ec_surfaced_controls_button_round, "layout/layout_ec_surfaced_controls_button_round_0");
            c.k(R.layout.layout_ec_surfaced_filter_life_button, hashMap, "layout/layout_ec_surfaced_filter_life_button_0", R.layout.layout_environment_history_data_card, "layout/layout_environment_history_data_card_0");
            c.k(R.layout.layout_environment_history_data_entry, hashMap, "layout/layout_environment_history_data_entry_0", R.layout.layout_external_sensor_data, "layout/layout_external_sensor_data_0");
            c.k(R.layout.layout_home_bottom_data_visualisation, hashMap, "layout/layout_home_bottom_data_visualisation_0", R.layout.layout_home_external_status, "layout/layout_home_external_status_0");
            c.k(R.layout.layout_home_internal_controls, hashMap, "layout/layout_home_internal_controls_0", R.layout.layout_home_internal_status, "layout/layout_home_internal_status_0");
            c.k(R.layout.layout_humidity_graph, hashMap, "layout/layout_humidity_graph_0", R.layout.layout_indoor_focused, "layout/layout_indoor_focused_0");
            c.k(R.layout.layout_interactable_ec_filter_management_cell, hashMap, "layout/layout_interactable_ec_filter_management_cell_0", R.layout.layout_internal_help_container, "layout/layout_internal_help_container_0");
            c.k(R.layout.layout_outdoor_pollutant_display, hashMap, "layout/layout_outdoor_pollutant_display_0", R.layout.layout_pollutant_display, "layout/layout_pollutant_display_0");
            c.k(R.layout.layout_pollutant_graph, hashMap, "layout/layout_pollutant_graph_0", R.layout.layout_pollutant_scale, "layout/layout_pollutant_scale_0");
            c.k(R.layout.layout_rocker_button, hashMap, "layout/layout_rocker_button_0", R.layout.layout_schedule_slider_indicator_fan_speed, "layout/layout_schedule_slider_indicator_fan_speed_0");
            c.k(R.layout.layout_schedule_slider_indicator_fan_speed_digital, hashMap, "layout/layout_schedule_slider_indicator_fan_speed_digital_0", R.layout.layout_schedule_slider_indicator_heat_mode, "layout/layout_schedule_slider_indicator_heat_mode_0");
            c.k(R.layout.layout_schedule_slider_indicator_heat_mode_digital, hashMap, "layout/layout_schedule_slider_indicator_heat_mode_digital_0", R.layout.layout_schedule_slider_indicator_humidification, "layout/layout_schedule_slider_indicator_humidification_0");
            c.k(R.layout.layout_settings_nds_section, hashMap, "layout/layout_settings_nds_section_0", R.layout.layout_slider_indicator_fan_speed, "layout/layout_slider_indicator_fan_speed_0");
            c.k(R.layout.layout_slider_indicator_fan_speed_digital, hashMap, "layout/layout_slider_indicator_fan_speed_digital_0", R.layout.layout_slider_indicator_heat_mode, "layout/layout_slider_indicator_heat_mode_0");
            c.k(R.layout.layout_slider_indicator_heat_mode_digital, hashMap, "layout/layout_slider_indicator_heat_mode_digital_0", R.layout.layout_slider_indicator_humidification, "layout/layout_slider_indicator_humidification_0");
            c.k(R.layout.layout_slider_indicator_tilt_oscillation, hashMap, "layout/layout_slider_indicator_tilt_oscillation_0", R.layout.layout_temperature_graph, "layout/layout_temperature_graph_0");
            hashMap.put("layout/layout_ul_compliance_0", Integer.valueOf((int) R.layout.layout_ul_compliance));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(85);
        f14275a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_advanced_oscillation, 1);
        sparseIntArray.put(R.layout.activity_barrel_oscillation, 2);
        sparseIntArray.put(R.layout.activity_connection_help, 3);
        sparseIntArray.put(R.layout.activity_ec_air_target, 4);
        sparseIntArray.put(R.layout.activity_ec_control, 5);
        sparseIntArray.put(R.layout.activity_historical_help, 6);
        sparseIntArray.put(R.layout.activity_internal_help, 7);
        sparseIntArray.put(R.layout.activity_schedule_ec_control, 8);
        sparseIntArray.put(R.layout.activity_timer_control, 9);
        sparseIntArray.put(R.layout.fragment_advanced_oscillation_idle, 10);
        sparseIntArray.put(R.layout.fragment_air_quality_target, 11);
        sparseIntArray.put(R.layout.fragment_ec_filter_reset_status, 12);
        sparseIntArray.put(R.layout.fragment_historical_air_quality_help, 13);
        sparseIntArray.put(R.layout.fragment_historical_co2_help, 14);
        sparseIntArray.put(R.layout.fragment_historical_humidity_help, 15);
        sparseIntArray.put(R.layout.fragment_historical_pollutant_help, 16);
        sparseIntArray.put(R.layout.fragment_historical_temperature_help, 17);
        sparseIntArray.put(R.layout.fragment_interactable_ec_contextual_menu, 18);
        sparseIntArray.put(R.layout.fragment_interactable_ec_filter_management, 19);
        sparseIntArray.put(R.layout.fragment_interactable_ec_home, 20);
        sparseIntArray.put(R.layout.fragment_interactable_ec_settings, 21);
        sparseIntArray.put(R.layout.fragment_remove_ec, 22);
        sparseIntArray.put(R.layout.fragment_schedule_ec_settings, 23);
        sparseIntArray.put(R.layout.fragment_water_hardness, 24);
        sparseIntArray.put(R.layout.item_air_quality_scale, 25);
        sparseIntArray.put(R.layout.item_connection_help_footer_view, 26);
        sparseIntArray.put(R.layout.item_connection_help_header_view, 27);
        sparseIntArray.put(R.layout.item_connection_help_list_content, 28);
        sparseIntArray.put(R.layout.item_connection_help_list_title, 29);
        sparseIntArray.put(R.layout.item_contextual_menu, 30);
        sparseIntArray.put(R.layout.item_pollutant_scale, 31);
        sparseIntArray.put(R.layout.item_reset_instruction_step, 32);
        sparseIntArray.put(R.layout.item_schedule_event, 33);
        sparseIntArray.put(R.layout.layout_air_quality_graph, 34);
        sparseIntArray.put(R.layout.layout_air_quality_insights_graph, 35);
        sparseIntArray.put(R.layout.layout_air_quality_scale, 36);
        sparseIntArray.put(R.layout.layout_co2_graph, 37);
        sparseIntArray.put(R.layout.layout_current_dominant_pollutant, 38);
        sparseIntArray.put(R.layout.layout_current_sensor_data, 39);
        sparseIntArray.put(R.layout.layout_ec_alert, 40);
        sparseIntArray.put(R.layout.layout_ec_alert_home, 41);
        sparseIntArray.put(R.layout.layout_ec_control_button_long, 42);
        sparseIntArray.put(R.layout.layout_ec_control_button_round, 43);
        sparseIntArray.put(R.layout.layout_ec_control_panel, 44);
        sparseIntArray.put(R.layout.layout_ec_control_slider, 45);
        sparseIntArray.put(R.layout.layout_ec_control_temperature_indicator, 46);
        sparseIntArray.put(R.layout.layout_ec_schedule_control_panel, 47);
        sparseIntArray.put(R.layout.layout_ec_settings_air, 48);
        sparseIntArray.put(R.layout.layout_ec_settings_air_filter, 49);
        sparseIntArray.put(R.layout.layout_ec_settings_connection, 50);
        sparseIntArray.put(R.layout.layout_ec_settings_deep_clean_cycle, 51);
        sparseIntArray.put(R.layout.layout_ec_settings_general, 52);
        sparseIntArray.put(R.layout.layout_ec_settings_location, 53);
        sparseIntArray.put(R.layout.layout_ec_surfaced_controls_button_round, 54);
        sparseIntArray.put(R.layout.layout_ec_surfaced_filter_life_button, 55);
        sparseIntArray.put(R.layout.layout_environment_history_data_card, 56);
        sparseIntArray.put(R.layout.layout_environment_history_data_entry, 57);
        sparseIntArray.put(R.layout.layout_external_sensor_data, 58);
        sparseIntArray.put(R.layout.layout_home_bottom_data_visualisation, 59);
        sparseIntArray.put(R.layout.layout_home_external_status, 60);
        sparseIntArray.put(R.layout.layout_home_internal_controls, 61);
        sparseIntArray.put(R.layout.layout_home_internal_status, 62);
        sparseIntArray.put(R.layout.layout_humidity_graph, 63);
        sparseIntArray.put(R.layout.layout_indoor_focused, 64);
        sparseIntArray.put(R.layout.layout_interactable_ec_filter_management_cell, 65);
        sparseIntArray.put(R.layout.layout_internal_help_container, 66);
        sparseIntArray.put(R.layout.layout_outdoor_pollutant_display, 67);
        sparseIntArray.put(R.layout.layout_pollutant_display, 68);
        sparseIntArray.put(R.layout.layout_pollutant_graph, 69);
        sparseIntArray.put(R.layout.layout_pollutant_scale, 70);
        sparseIntArray.put(R.layout.layout_rocker_button, 71);
        sparseIntArray.put(R.layout.layout_schedule_slider_indicator_fan_speed, 72);
        sparseIntArray.put(R.layout.layout_schedule_slider_indicator_fan_speed_digital, 73);
        sparseIntArray.put(R.layout.layout_schedule_slider_indicator_heat_mode, 74);
        sparseIntArray.put(R.layout.layout_schedule_slider_indicator_heat_mode_digital, 75);
        sparseIntArray.put(R.layout.layout_schedule_slider_indicator_humidification, 76);
        sparseIntArray.put(R.layout.layout_settings_nds_section, 77);
        sparseIntArray.put(R.layout.layout_slider_indicator_fan_speed, 78);
        sparseIntArray.put(R.layout.layout_slider_indicator_fan_speed_digital, 79);
        sparseIntArray.put(R.layout.layout_slider_indicator_heat_mode, 80);
        sparseIntArray.put(R.layout.layout_slider_indicator_heat_mode_digital, 81);
        sparseIntArray.put(R.layout.layout_slider_indicator_humidification, 82);
        sparseIntArray.put(R.layout.layout_slider_indicator_tilt_oscillation, 83);
        sparseIntArray.put(R.layout.layout_temperature_graph, 84);
        sparseIntArray.put(R.layout.layout_ul_compliance, 85);
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
        return a.f14276a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f14275a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i15 = (i14 - 1) / 50;
                if (i15 == 0) {
                    switch (i14) {
                        case 1:
                            if ("layout/activity_advanced_oscillation_0".equals(tag)) {
                                return new na0.b(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_advanced_oscillation is invalid. Received: "));
                            return null;
                        case 2:
                            if ("layout/activity_barrel_oscillation_0".equals(tag)) {
                                return new d(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_barrel_oscillation is invalid. Received: "));
                            return null;
                        case 3:
                            if ("layout/activity_connection_help_0".equals(tag)) {
                                return new na0.f(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_connection_help is invalid. Received: "));
                            return null;
                        case 4:
                            if ("layout/activity_ec_air_target_0".equals(tag)) {
                                return new h(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ec_air_target is invalid. Received: "));
                            return null;
                        case 5:
                            if ("layout/activity_ec_control_0".equals(tag)) {
                                return new j(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ec_control is invalid. Received: "));
                            return null;
                        case 6:
                            if ("layout/activity_historical_help_0".equals(tag)) {
                                return new l(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_historical_help is invalid. Received: "));
                            return null;
                        case 7:
                            if ("layout/activity_internal_help_0".equals(tag)) {
                                return new n(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_internal_help is invalid. Received: "));
                            return null;
                        case 8:
                            if ("layout/activity_schedule_ec_control_0".equals(tag)) {
                                return new p(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_schedule_ec_control is invalid. Received: "));
                            return null;
                        case 9:
                            if ("layout/activity_timer_control_0".equals(tag)) {
                                return new r(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_timer_control is invalid. Received: "));
                            return null;
                        case 10:
                            if ("layout/fragment_advanced_oscillation_idle_0".equals(tag)) {
                                return new na0.t(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_advanced_oscillation_idle is invalid. Received: "));
                            return null;
                        case 11:
                            if ("layout/fragment_air_quality_target_0".equals(tag)) {
                                return new v(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_air_quality_target is invalid. Received: "));
                            return null;
                        case 12:
                            if ("layout/fragment_ec_filter_reset_status_0".equals(tag)) {
                                return new x(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_ec_filter_reset_status is invalid. Received: "));
                            return null;
                        case 13:
                            if ("layout/fragment_historical_air_quality_help_0".equals(tag)) {
                                return new z(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_historical_air_quality_help is invalid. Received: "));
                            return null;
                        case 14:
                            if ("layout/fragment_historical_co2_help_0".equals(tag)) {
                                return new b0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_historical_co2_help is invalid. Received: "));
                            return null;
                        case 15:
                            if ("layout/fragment_historical_humidity_help_0".equals(tag)) {
                                return new d0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_historical_humidity_help is invalid. Received: "));
                            return null;
                        case 16:
                            if ("layout/fragment_historical_pollutant_help_0".equals(tag)) {
                                return new f0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_historical_pollutant_help is invalid. Received: "));
                            return null;
                        case 17:
                            if ("layout/fragment_historical_temperature_help_0".equals(tag)) {
                                return new h0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_historical_temperature_help is invalid. Received: "));
                            return null;
                        case 18:
                            if ("layout/fragment_interactable_ec_contextual_menu_0".equals(tag)) {
                                return new j0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_interactable_ec_contextual_menu is invalid. Received: "));
                            return null;
                        case 19:
                            if ("layout/fragment_interactable_ec_filter_management_0".equals(tag)) {
                                return new l0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_interactable_ec_filter_management is invalid. Received: "));
                            return null;
                        case 20:
                            if ("layout/fragment_interactable_ec_home_0".equals(tag)) {
                                return new n0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_interactable_ec_home is invalid. Received: "));
                            return null;
                        case 21:
                            if ("layout/fragment_interactable_ec_settings_0".equals(tag)) {
                                return new p0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_interactable_ec_settings is invalid. Received: "));
                            return null;
                        case 22:
                            if ("layout/fragment_remove_ec_0".equals(tag)) {
                                return new r0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_remove_ec is invalid. Received: "));
                            return null;
                        case 23:
                            if ("layout/fragment_schedule_ec_settings_0".equals(tag)) {
                                return new t0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_schedule_ec_settings is invalid. Received: "));
                            return null;
                        case 24:
                            if ("layout/fragment_water_hardness_0".equals(tag)) {
                                return new v0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_water_hardness is invalid. Received: "));
                            return null;
                        case 25:
                            if ("layout/item_air_quality_scale_0".equals(tag)) {
                                return new x0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_air_quality_scale is invalid. Received: "));
                            return null;
                        case 26:
                            if ("layout/item_connection_help_footer_view_0".equals(tag)) {
                                return new z0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_connection_help_footer_view is invalid. Received: "));
                            return null;
                        case 27:
                            if ("layout/item_connection_help_header_view_0".equals(tag)) {
                                return new b1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_connection_help_header_view is invalid. Received: "));
                            return null;
                        case 28:
                            if ("layout/item_connection_help_list_content_0".equals(tag)) {
                                return new d1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_connection_help_list_content is invalid. Received: "));
                            return null;
                        case 29:
                            if ("layout/item_connection_help_list_title_0".equals(tag)) {
                                return new f1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_connection_help_list_title is invalid. Received: "));
                            return null;
                        case 30:
                            if ("layout/item_contextual_menu_0".equals(tag)) {
                                return new h1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_contextual_menu is invalid. Received: "));
                            return null;
                        case 31:
                            if ("layout/item_pollutant_scale_0".equals(tag)) {
                                return new j1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_pollutant_scale is invalid. Received: "));
                            return null;
                        case 32:
                            if ("layout/item_reset_instruction_step_0".equals(tag)) {
                                return new l1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_reset_instruction_step is invalid. Received: "));
                            return null;
                        case 33:
                            if ("layout/item_schedule_event_0".equals(tag)) {
                                return new n1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_schedule_event is invalid. Received: "));
                            return null;
                        case 34:
                            if ("layout/layout_air_quality_graph_0".equals(tag)) {
                                return new p1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_air_quality_graph is invalid. Received: "));
                            return null;
                        case 35:
                            if ("layout/layout_air_quality_insights_graph_0".equals(tag)) {
                                return new r1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_air_quality_insights_graph is invalid. Received: "));
                            return null;
                        case 36:
                            if ("layout/layout_air_quality_scale_0".equals(tag)) {
                                return new t1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_air_quality_scale is invalid. Received: "));
                            return null;
                        case BR.dysonDomain /* 37 */:
                            if ("layout/layout_co2_graph_0".equals(tag)) {
                                return new v1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_co2_graph is invalid. Received: "));
                            return null;
                        case BR.ecViewModel /* 38 */:
                            if ("layout/layout_current_dominant_pollutant_0".equals(tag)) {
                                return new x1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_current_dominant_pollutant is invalid. Received: "));
                            return null;
                        case BR.errorVisibility /* 39 */:
                            if ("layout/layout_current_sensor_data_0".equals(tag)) {
                                return new z1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_current_sensor_data is invalid. Received: "));
                            return null;
                        case 40:
                            if ("layout/layout_ec_alert_0".equals(tag)) {
                                return new b2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_alert is invalid. Received: "));
                            return null;
                        case BR.filterLabel /* 41 */:
                            if ("layout/layout_ec_alert_home_0".equals(tag)) {
                                return new d2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_alert_home is invalid. Received: "));
                            return null;
                        case BR.filterLife /* 42 */:
                            if ("layout/layout_ec_control_button_long_0".equals(tag)) {
                                return new f2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_control_button_long is invalid. Received: "));
                            return null;
                        case BR.functionIcon /* 43 */:
                            if ("layout/layout_ec_control_button_round_0".equals(tag)) {
                                return new h2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_control_button_round is invalid. Received: "));
                            return null;
                        case BR.hasInfiniteLife /* 44 */:
                            if ("layout/layout_ec_control_panel_0".equals(tag)) {
                                return new j2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_control_panel is invalid. Received: "));
                            return null;
                        case BR.header /* 45 */:
                            if ("layout/layout_ec_control_slider_0".equals(tag)) {
                                return new l2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_control_slider is invalid. Received: "));
                            return null;
                        case BR.homeGraphViewModel /* 46 */:
                            if ("layout/layout_ec_control_temperature_indicator_0".equals(tag)) {
                                return new n2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_control_temperature_indicator is invalid. Received: "));
                            return null;
                        case BR.icon /* 47 */:
                            if ("layout/layout_ec_schedule_control_panel_0".equals(tag)) {
                                return new p2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_schedule_control_panel is invalid. Received: "));
                            return null;
                        case 48:
                            if ("layout/layout_ec_settings_air_0".equals(tag)) {
                                return new r2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_settings_air is invalid. Received: "));
                            return null;
                        case BR.importantForAccessibility /* 49 */:
                            if ("layout/layout_ec_settings_air_filter_0".equals(tag)) {
                                return new t2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_settings_air_filter is invalid. Received: "));
                            return null;
                        case 50:
                            if ("layout/layout_ec_settings_connection_0".equals(tag)) {
                                return new v2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_settings_connection is invalid. Received: "));
                            return null;
                    }
                } else if (i15 == 1) {
                    switch (i14) {
                        case BR.isDecreaseSensitivityVisible /* 51 */:
                            if ("layout/layout_ec_settings_deep_clean_cycle_0".equals(tag)) {
                                return new x2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_settings_deep_clean_cycle is invalid. Received: "));
                            return null;
                        case BR.isDustMapLayerVisible /* 52 */:
                            if ("layout/layout_ec_settings_general_0".equals(tag)) {
                                return new z2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_settings_general is invalid. Received: "));
                            return null;
                        case BR.isGraphClickable /* 53 */:
                            if ("layout/layout_ec_settings_location_0".equals(tag)) {
                                return new b3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_settings_location is invalid. Received: "));
                            return null;
                        case BR.isHelpClickable /* 54 */:
                            if ("layout/layout_ec_surfaced_controls_button_round_0".equals(tag)) {
                                return new d3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_surfaced_controls_button_round is invalid. Received: "));
                            return null;
                        case BR.item /* 55 */:
                            if ("layout/layout_ec_surfaced_filter_life_button_0".equals(tag)) {
                                return new f3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ec_surfaced_filter_life_button is invalid. Received: "));
                            return null;
                        case 56:
                            if ("layout/layout_environment_history_data_card_0".equals(tag)) {
                                return new h3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_environment_history_data_card is invalid. Received: "));
                            return null;
                        case 57:
                            if ("layout/layout_environment_history_data_entry_0".equals(tag)) {
                                return new j3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_environment_history_data_entry is invalid. Received: "));
                            return null;
                        case BR.level /* 58 */:
                            if ("layout/layout_external_sensor_data_0".equals(tag)) {
                                return new l3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_external_sensor_data is invalid. Received: "));
                            return null;
                        case BR.location /* 59 */:
                            if ("layout/layout_home_bottom_data_visualisation_0".equals(tag)) {
                                return new n3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_home_bottom_data_visualisation is invalid. Received: "));
                            return null;
                        case 60:
                            if ("layout/layout_home_external_status_0".equals(tag)) {
                                return new p3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_home_external_status is invalid. Received: "));
                            return null;
                        case BR.machineType /* 61 */:
                            if ("layout/layout_home_internal_controls_0".equals(tag)) {
                                return new r3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_home_internal_controls is invalid. Received: "));
                            return null;
                        case BR.mainViewModel /* 62 */:
                            if ("layout/layout_home_internal_status_0".equals(tag)) {
                                return new t3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_home_internal_status is invalid. Received: "));
                            return null;
                        case 63:
                            if ("layout/layout_humidity_graph_0".equals(tag)) {
                                return new v3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_humidity_graph is invalid. Received: "));
                            return null;
                        case 64:
                            if ("layout/layout_indoor_focused_0".equals(tag)) {
                                return new x3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_indoor_focused is invalid. Received: "));
                            return null;
                        case BR.onHelpClick /* 65 */:
                            if ("layout/layout_interactable_ec_filter_management_cell_0".equals(tag)) {
                                return new z3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_interactable_ec_filter_management_cell is invalid. Received: "));
                            return null;
                        case BR.overlayVisible /* 66 */:
                            if ("layout/layout_internal_help_container_0".equals(tag)) {
                                return new b4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_internal_help_container is invalid. Received: "));
                            return null;
                        case BR.passwordErrorVisibility /* 67 */:
                            if ("layout/layout_outdoor_pollutant_display_0".equals(tag)) {
                                return new d4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_outdoor_pollutant_display is invalid. Received: "));
                            return null;
                        case BR.productName /* 68 */:
                            if ("layout/layout_pollutant_display_0".equals(tag)) {
                                return new f4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_pollutant_display is invalid. Received: "));
                            return null;
                        case BR.progressRange /* 69 */:
                            if ("layout/layout_pollutant_graph_0".equals(tag)) {
                                return new h4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_pollutant_graph is invalid. Received: "));
                            return null;
                        case 70:
                            if ("layout/layout_pollutant_scale_0".equals(tag)) {
                                return new j4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_pollutant_scale is invalid. Received: "));
                            return null;
                        case BR.range /* 71 */:
                            if ("layout/layout_rocker_button_0".equals(tag)) {
                                return new l4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_rocker_button is invalid. Received: "));
                            return null;
                        case BR.rangeAccessibility /* 72 */:
                            if ("layout/layout_schedule_slider_indicator_fan_speed_0".equals(tag)) {
                                return new n4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_schedule_slider_indicator_fan_speed is invalid. Received: "));
                            return null;
                        case BR.removeButtonVisible /* 73 */:
                            if ("layout/layout_schedule_slider_indicator_fan_speed_digital_0".equals(tag)) {
                                return new p4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_schedule_slider_indicator_fan_speed_digital is invalid. Received: "));
                            return null;
                        case BR.scaleTitle /* 74 */:
                            if ("layout/layout_schedule_slider_indicator_heat_mode_0".equals(tag)) {
                                return new r4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_schedule_slider_indicator_heat_mode is invalid. Received: "));
                            return null;
                        case BR.scanResult /* 75 */:
                            if ("layout/layout_schedule_slider_indicator_heat_mode_digital_0".equals(tag)) {
                                return new t4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_schedule_slider_indicator_heat_mode_digital is invalid. Received: "));
                            return null;
                        case BR.screenTitle /* 76 */:
                            if ("layout/layout_schedule_slider_indicator_humidification_0".equals(tag)) {
                                return new v4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_schedule_slider_indicator_humidification is invalid. Received: "));
                            return null;
                        case BR.sessionActiveDuration /* 77 */:
                            if ("layout/layout_settings_nds_section_0".equals(tag)) {
                                return new x4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_settings_nds_section is invalid. Received: "));
                            return null;
                        case BR.sessionActiveDurationTooltip /* 78 */:
                            if ("layout/layout_slider_indicator_fan_speed_0".equals(tag)) {
                                return new z4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_slider_indicator_fan_speed is invalid. Received: "));
                            return null;
                        case BR.sessionTimeRange /* 79 */:
                            if ("layout/layout_slider_indicator_fan_speed_digital_0".equals(tag)) {
                                return new b5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_slider_indicator_fan_speed_digital is invalid. Received: "));
                            return null;
                        case 80:
                            if ("layout/layout_slider_indicator_heat_mode_0".equals(tag)) {
                                return new d5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_slider_indicator_heat_mode is invalid. Received: "));
                            return null;
                        case BR.shouldAutoUpdate /* 81 */:
                            if ("layout/layout_slider_indicator_heat_mode_digital_0".equals(tag)) {
                                return new f5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_slider_indicator_heat_mode_digital is invalid. Received: "));
                            return null;
                        case BR.showChevron /* 82 */:
                            if ("layout/layout_slider_indicator_humidification_0".equals(tag)) {
                                return new h5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_slider_indicator_humidification is invalid. Received: "));
                            return null;
                        case BR.ssid /* 83 */:
                            if ("layout/layout_slider_indicator_tilt_oscillation_0".equals(tag)) {
                                return new j5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_slider_indicator_tilt_oscillation is invalid. Received: "));
                            return null;
                        case BR.stepDescription /* 84 */:
                            if ("layout/layout_temperature_graph_0".equals(tag)) {
                                return new l5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_temperature_graph is invalid. Received: "));
                            return null;
                        case BR.stepImage /* 85 */:
                            if ("layout/layout_ul_compliance_0".equals(tag)) {
                                return new n5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_ul_compliance is invalid. Received: "));
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
        if (str == null || (num = b.f14277a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f14275a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
