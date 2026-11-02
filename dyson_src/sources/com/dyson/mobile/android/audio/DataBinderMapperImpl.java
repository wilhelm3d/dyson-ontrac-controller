package com.dyson.mobile.android.audio;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.dyson.mobile.android.R;
import com.paypal.android.platform.authsdk.BR;
import dk.b0;
import dk.b1;
import dk.b2;
import dk.d;
import dk.d0;
import dk.d1;
import dk.d2;
import dk.f0;
import dk.f1;
import dk.f2;
import dk.h;
import dk.h0;
import dk.h1;
import dk.h2;
import dk.j;
import dk.j0;
import dk.j1;
import dk.j2;
import dk.l;
import dk.l0;
import dk.l1;
import dk.l2;
import dk.n;
import dk.n0;
import dk.n1;
import dk.n2;
import dk.p;
import dk.p0;
import dk.p1;
import dk.p2;
import dk.r;
import dk.r0;
import dk.r1;
import dk.r2;
import dk.t0;
import dk.t1;
import dk.v;
import dk.v0;
import dk.v1;
import dk.x;
import dk.x0;
import dk.x1;
import dk.z;
import dk.z0;
import dk.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import qv1.s;
/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f12321a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f12322a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(44);
            f12322a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "adapter");
            sparseArray.put(2, "annotation");
            sparseArray.put(3, "aqLiveDataViewModel");
            sparseArray.put(4, "audioLiveDataViewModel");
            sparseArray.put(5, "carouselViewModel");
            sparseArray.put(6, "colorIndex");
            sparseArray.put(7, "command");
            sparseArray.put(8, "contactDetail");
            sparseArray.put(9, "content");
            sparseArray.put(10, "data");
            sparseArray.put(11, "dayViewModel");
            sparseArray.put(12, "descriptionAccessibilityContainer");
            sparseArray.put(13, "descriptionAccessibilityKey");
            sparseArray.put(14, "descriptionContainer");
            sparseArray.put(15, "descriptionKey");
            sparseArray.put(16, "dividerVisibility");
            sparseArray.put(17, "functionIcon");
            sparseArray.put(18, "homeGraphViewModel");
            sparseArray.put(19, "image");
            sparseArray.put(20, "isGraphClickable");
            sparseArray.put(21, "isHelpClickable");
            sparseArray.put(22, "item");
            sparseArray.put(23, "itemUIState");
            sparseArray.put(24, "level");
            sparseArray.put(25, "location");
            sparseArray.put(26, "name");
            sparseArray.put(27, "onClick");
            sparseArray.put(28, "onHelpClick");
            sparseArray.put(29, "screenTitle");
            sparseArray.put(30, "sessionActiveDuration");
            sparseArray.put(31, "sessionActiveDurationTooltip");
            sparseArray.put(32, "sessionTimeRange");
            sparseArray.put(33, "sessionViewModel");
            sparseArray.put(34, "showChevron");
            sparseArray.put(35, "timeRangeTooltip");
            sparseArray.put(36, "timelineTooltip");
            sparseArray.put(37, "title");
            sparseArray.put(38, "titleAccessibilityKey");
            sparseArray.put(39, "titleKey");
            sparseArray.put(40, "titleTooltipKey");
            sparseArray.put(41, "toolbarViewModel");
            sparseArray.put(42, "viewModel");
            sparseArray.put(43, "visibility");
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f12323a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(48);
            f12323a = hashMap;
            c.k(R.layout.activity_audio_air_flow_control, hashMap, "layout/activity_audio_air_flow_control_0", R.layout.activity_audio_ear_cushions, "layout/activity_audio_ear_cushions_0");
            c.k(R.layout.activity_audio_filter_management, hashMap, "layout/activity_audio_filter_management_0", R.layout.activity_audio_onboarding, "layout/activity_audio_onboarding_0");
            c.k(R.layout.activity_audio_sound_control, hashMap, "layout/activity_audio_sound_control_0", R.layout.activity_auto_update_external_location_prerequisite, "layout/activity_auto_update_external_location_prerequisite_0");
            c.k(R.layout.activity_bonding, hashMap, "layout/activity_bonding_0", R.layout.activity_fault_show_me_how, "layout/activity_fault_show_me_how_0");
            c.k(R.layout.activity_session_history_nds, hashMap, "layout/activity_session_history_nds_0", R.layout.fragment_audio_air_flow_control, "layout/fragment_audio_air_flow_control_0");
            c.k(R.layout.fragment_audio_contextual_menu, hashMap, "layout/fragment_audio_contextual_menu_0", R.layout.fragment_audio_ear_cushions, "layout/fragment_audio_ear_cushions_0");
            c.k(R.layout.fragment_audio_filter_management, hashMap, "layout/fragment_audio_filter_management_0", R.layout.fragment_audio_filter_reset_status, "layout/fragment_audio_filter_reset_status_0");
            c.k(R.layout.fragment_audio_home, hashMap, "layout/fragment_audio_home_0", R.layout.fragment_audio_onboarding_video, "layout/fragment_audio_onboarding_video_0");
            c.k(R.layout.fragment_audio_recalibrate, hashMap, "layout/fragment_audio_recalibrate_0", R.layout.fragment_audio_recalibration_failed, "layout/fragment_audio_recalibration_failed_0");
            c.k(R.layout.fragment_audio_remove, hashMap, "layout/fragment_audio_remove_0", R.layout.fragment_audio_retry_buy_filter, "layout/fragment_audio_retry_buy_filter_0");
            c.k(R.layout.fragment_audio_settings, hashMap, "layout/fragment_audio_settings_0", R.layout.fragment_audio_sound_control, "layout/fragment_audio_sound_control_0");
            c.k(R.layout.fragment_auto_update_external_location_prerequisite, hashMap, "layout/fragment_auto_update_external_location_prerequisite_0", R.layout.help_item_graph, "layout/help_item_graph_0");
            c.k(R.layout.help_item_history_session_graph, hashMap, "layout/help_item_history_session_graph_0", R.layout.item_sound_control_anc, "layout/item_sound_control_anc_0");
            c.k(R.layout.item_sound_control_equalizer, hashMap, "layout/item_sound_control_equalizer_0", R.layout.layout_air_quality_status, "layout/layout_air_quality_status_0");
            c.k(R.layout.layout_aq_live_graph_area, hashMap, "layout/layout_aq_live_graph_area_0", R.layout.layout_audio_contextual_menu_warning, "layout/layout_audio_contextual_menu_warning_0");
            c.k(R.layout.layout_audio_external_aqi, hashMap, "layout/layout_audio_external_aqi_0", R.layout.layout_audio_external_aqi_summary, "layout/layout_audio_external_aqi_summary_0");
            c.k(R.layout.layout_audio_filter_life, hashMap, "layout/layout_audio_filter_life_0", R.layout.layout_audio_history, "layout/layout_audio_history_0");
            c.k(R.layout.layout_audio_history_day, hashMap, "layout/layout_audio_history_day_0", R.layout.layout_audio_history_session, "layout/layout_audio_history_session_0");
            c.k(R.layout.layout_audio_live_graph_area, hashMap, "layout/layout_audio_live_graph_area_0", R.layout.layout_audio_mode_status, "layout/layout_audio_mode_status_0");
            c.k(R.layout.layout_audio_settings_air, hashMap, "layout/layout_audio_settings_air_0", R.layout.layout_audio_settings_air_filter_ring, "layout/layout_audio_settings_air_filter_ring_0");
            c.k(R.layout.layout_audio_settings_filter_management_filter_ring, hashMap, "layout/layout_audio_settings_filter_management_filter_ring_0", R.layout.layout_battery_and_charge_icon, "layout/layout_battery_and_charge_icon_0");
            c.k(R.layout.layout_external_pollutant_display, hashMap, "layout/layout_external_pollutant_display_0", R.layout.layout_machine_state, "layout/layout_machine_state_0");
            c.k(R.layout.layout_set_location, hashMap, "layout/layout_set_location_0", R.layout.layout_settings_accessories, "layout/layout_settings_accessories_0");
            c.k(R.layout.layout_settings_head_detection, hashMap, "layout/layout_settings_head_detection_0", R.layout.layout_settings_preferences, "layout/layout_settings_preferences_0");
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(48);
        f12321a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_audio_air_flow_control, 1);
        sparseIntArray.put(R.layout.activity_audio_ear_cushions, 2);
        sparseIntArray.put(R.layout.activity_audio_filter_management, 3);
        sparseIntArray.put(R.layout.activity_audio_onboarding, 4);
        sparseIntArray.put(R.layout.activity_audio_sound_control, 5);
        sparseIntArray.put(R.layout.activity_auto_update_external_location_prerequisite, 6);
        sparseIntArray.put(R.layout.activity_bonding, 7);
        sparseIntArray.put(R.layout.activity_fault_show_me_how, 8);
        sparseIntArray.put(R.layout.activity_session_history_nds, 9);
        sparseIntArray.put(R.layout.fragment_audio_air_flow_control, 10);
        sparseIntArray.put(R.layout.fragment_audio_contextual_menu, 11);
        sparseIntArray.put(R.layout.fragment_audio_ear_cushions, 12);
        sparseIntArray.put(R.layout.fragment_audio_filter_management, 13);
        sparseIntArray.put(R.layout.fragment_audio_filter_reset_status, 14);
        sparseIntArray.put(R.layout.fragment_audio_home, 15);
        sparseIntArray.put(R.layout.fragment_audio_onboarding_video, 16);
        sparseIntArray.put(R.layout.fragment_audio_recalibrate, 17);
        sparseIntArray.put(R.layout.fragment_audio_recalibration_failed, 18);
        sparseIntArray.put(R.layout.fragment_audio_remove, 19);
        sparseIntArray.put(R.layout.fragment_audio_retry_buy_filter, 20);
        sparseIntArray.put(R.layout.fragment_audio_settings, 21);
        sparseIntArray.put(R.layout.fragment_audio_sound_control, 22);
        sparseIntArray.put(R.layout.fragment_auto_update_external_location_prerequisite, 23);
        sparseIntArray.put(R.layout.help_item_graph, 24);
        sparseIntArray.put(R.layout.help_item_history_session_graph, 25);
        sparseIntArray.put(R.layout.item_sound_control_anc, 26);
        sparseIntArray.put(R.layout.item_sound_control_equalizer, 27);
        sparseIntArray.put(R.layout.layout_air_quality_status, 28);
        sparseIntArray.put(R.layout.layout_aq_live_graph_area, 29);
        sparseIntArray.put(R.layout.layout_audio_contextual_menu_warning, 30);
        sparseIntArray.put(R.layout.layout_audio_external_aqi, 31);
        sparseIntArray.put(R.layout.layout_audio_external_aqi_summary, 32);
        sparseIntArray.put(R.layout.layout_audio_filter_life, 33);
        sparseIntArray.put(R.layout.layout_audio_history, 34);
        sparseIntArray.put(R.layout.layout_audio_history_day, 35);
        sparseIntArray.put(R.layout.layout_audio_history_session, 36);
        sparseIntArray.put(R.layout.layout_audio_live_graph_area, 37);
        sparseIntArray.put(R.layout.layout_audio_mode_status, 38);
        sparseIntArray.put(R.layout.layout_audio_settings_air, 39);
        sparseIntArray.put(R.layout.layout_audio_settings_air_filter_ring, 40);
        sparseIntArray.put(R.layout.layout_audio_settings_filter_management_filter_ring, 41);
        sparseIntArray.put(R.layout.layout_battery_and_charge_icon, 42);
        sparseIntArray.put(R.layout.layout_external_pollutant_display, 43);
        sparseIntArray.put(R.layout.layout_machine_state, 44);
        sparseIntArray.put(R.layout.layout_set_location, 45);
        sparseIntArray.put(R.layout.layout_settings_accessories, 46);
        sparseIntArray.put(R.layout.layout_settings_head_detection, 47);
        sparseIntArray.put(R.layout.layout_settings_preferences, 48);
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.android.mobile.connectedhome.DataBinderMapperImpl());
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
        return a.f12322a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f12321a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i14) {
                    case 1:
                        if ("layout/activity_audio_air_flow_control_0".equals(tag)) {
                            return new dk.b(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_audio_air_flow_control is invalid. Received: "));
                        return null;
                    case 2:
                        if ("layout/activity_audio_ear_cushions_0".equals(tag)) {
                            return new d(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_audio_ear_cushions is invalid. Received: "));
                        return null;
                    case 3:
                        if ("layout/activity_audio_filter_management_0".equals(tag)) {
                            return new dk.f(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_audio_filter_management is invalid. Received: "));
                        return null;
                    case 4:
                        if ("layout/activity_audio_onboarding_0".equals(tag)) {
                            return new h(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_audio_onboarding is invalid. Received: "));
                        return null;
                    case 5:
                        if ("layout/activity_audio_sound_control_0".equals(tag)) {
                            return new j(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_audio_sound_control is invalid. Received: "));
                        return null;
                    case 6:
                        if ("layout/activity_auto_update_external_location_prerequisite_0".equals(tag)) {
                            return new l(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_auto_update_external_location_prerequisite is invalid. Received: "));
                        return null;
                    case 7:
                        if ("layout/activity_bonding_0".equals(tag)) {
                            return new n(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_bonding is invalid. Received: "));
                        return null;
                    case 8:
                        if ("layout/activity_fault_show_me_how_0".equals(tag)) {
                            return new p(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_fault_show_me_how is invalid. Received: "));
                        return null;
                    case 9:
                        if ("layout/activity_session_history_nds_0".equals(tag)) {
                            return new r(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_session_history_nds is invalid. Received: "));
                        return null;
                    case 10:
                        if ("layout/fragment_audio_air_flow_control_0".equals(tag)) {
                            return new dk.t(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_air_flow_control is invalid. Received: "));
                        return null;
                    case 11:
                        if ("layout/fragment_audio_contextual_menu_0".equals(tag)) {
                            return new v(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_contextual_menu is invalid. Received: "));
                        return null;
                    case 12:
                        if ("layout/fragment_audio_ear_cushions_0".equals(tag)) {
                            return new x(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_ear_cushions is invalid. Received: "));
                        return null;
                    case 13:
                        if ("layout/fragment_audio_filter_management_0".equals(tag)) {
                            return new z(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_filter_management is invalid. Received: "));
                        return null;
                    case 14:
                        if ("layout/fragment_audio_filter_reset_status_0".equals(tag)) {
                            return new b0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_filter_reset_status is invalid. Received: "));
                        return null;
                    case 15:
                        if ("layout/fragment_audio_home_0".equals(tag)) {
                            return new d0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_home is invalid. Received: "));
                        return null;
                    case 16:
                        if ("layout/fragment_audio_onboarding_video_0".equals(tag)) {
                            return new f0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_onboarding_video is invalid. Received: "));
                        return null;
                    case 17:
                        if ("layout/fragment_audio_recalibrate_0".equals(tag)) {
                            return new h0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_recalibrate is invalid. Received: "));
                        return null;
                    case 18:
                        if ("layout/fragment_audio_recalibration_failed_0".equals(tag)) {
                            return new j0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_recalibration_failed is invalid. Received: "));
                        return null;
                    case 19:
                        if ("layout/fragment_audio_remove_0".equals(tag)) {
                            return new l0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_remove is invalid. Received: "));
                        return null;
                    case 20:
                        if ("layout/fragment_audio_retry_buy_filter_0".equals(tag)) {
                            return new n0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_retry_buy_filter is invalid. Received: "));
                        return null;
                    case 21:
                        if ("layout/fragment_audio_settings_0".equals(tag)) {
                            return new p0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_settings is invalid. Received: "));
                        return null;
                    case 22:
                        if ("layout/fragment_audio_sound_control_0".equals(tag)) {
                            return new r0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_audio_sound_control is invalid. Received: "));
                        return null;
                    case 23:
                        if ("layout/fragment_auto_update_external_location_prerequisite_0".equals(tag)) {
                            return new t0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_auto_update_external_location_prerequisite is invalid. Received: "));
                        return null;
                    case 24:
                        if ("layout/help_item_graph_0".equals(tag)) {
                            return new v0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for help_item_graph is invalid. Received: "));
                        return null;
                    case 25:
                        if ("layout/help_item_history_session_graph_0".equals(tag)) {
                            return new x0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for help_item_history_session_graph is invalid. Received: "));
                        return null;
                    case 26:
                        if ("layout/item_sound_control_anc_0".equals(tag)) {
                            return new z0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_sound_control_anc is invalid. Received: "));
                        return null;
                    case 27:
                        if ("layout/item_sound_control_equalizer_0".equals(tag)) {
                            return new b1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for item_sound_control_equalizer is invalid. Received: "));
                        return null;
                    case 28:
                        if ("layout/layout_air_quality_status_0".equals(tag)) {
                            return new d1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_air_quality_status is invalid. Received: "));
                        return null;
                    case 29:
                        if ("layout/layout_aq_live_graph_area_0".equals(tag)) {
                            return new f1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_aq_live_graph_area is invalid. Received: "));
                        return null;
                    case 30:
                        if ("layout/layout_audio_contextual_menu_warning_0".equals(tag)) {
                            return new h1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_contextual_menu_warning is invalid. Received: "));
                        return null;
                    case 31:
                        if ("layout/layout_audio_external_aqi_0".equals(tag)) {
                            return new j1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_external_aqi is invalid. Received: "));
                        return null;
                    case 32:
                        if ("layout/layout_audio_external_aqi_summary_0".equals(tag)) {
                            return new l1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_external_aqi_summary is invalid. Received: "));
                        return null;
                    case 33:
                        if ("layout/layout_audio_filter_life_0".equals(tag)) {
                            return new n1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_filter_life is invalid. Received: "));
                        return null;
                    case 34:
                        if ("layout/layout_audio_history_0".equals(tag)) {
                            return new p1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_history is invalid. Received: "));
                        return null;
                    case 35:
                        if ("layout/layout_audio_history_day_0".equals(tag)) {
                            return new r1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_history_day is invalid. Received: "));
                        return null;
                    case 36:
                        if ("layout/layout_audio_history_session_0".equals(tag)) {
                            return new t1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_history_session is invalid. Received: "));
                        return null;
                    case BR.dysonDomain /* 37 */:
                        if ("layout/layout_audio_live_graph_area_0".equals(tag)) {
                            return new v1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_live_graph_area is invalid. Received: "));
                        return null;
                    case BR.ecViewModel /* 38 */:
                        if ("layout/layout_audio_mode_status_0".equals(tag)) {
                            return new x1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_mode_status is invalid. Received: "));
                        return null;
                    case BR.errorVisibility /* 39 */:
                        if ("layout/layout_audio_settings_air_0".equals(tag)) {
                            return new z1(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_settings_air is invalid. Received: "));
                        return null;
                    case 40:
                        if ("layout/layout_audio_settings_air_filter_ring_0".equals(tag)) {
                            return new b2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_settings_air_filter_ring is invalid. Received: "));
                        return null;
                    case BR.filterLabel /* 41 */:
                        if ("layout/layout_audio_settings_filter_management_filter_ring_0".equals(tag)) {
                            return new d2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_audio_settings_filter_management_filter_ring is invalid. Received: "));
                        return null;
                    case BR.filterLife /* 42 */:
                        if ("layout/layout_battery_and_charge_icon_0".equals(tag)) {
                            return new f2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_battery_and_charge_icon is invalid. Received: "));
                        return null;
                    case BR.functionIcon /* 43 */:
                        if ("layout/layout_external_pollutant_display_0".equals(tag)) {
                            return new h2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_external_pollutant_display is invalid. Received: "));
                        return null;
                    case BR.hasInfiniteLife /* 44 */:
                        if ("layout/layout_machine_state_0".equals(tag)) {
                            return new j2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_machine_state is invalid. Received: "));
                        return null;
                    case BR.header /* 45 */:
                        if ("layout/layout_set_location_0".equals(tag)) {
                            return new l2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_set_location is invalid. Received: "));
                        return null;
                    case BR.homeGraphViewModel /* 46 */:
                        if ("layout/layout_settings_accessories_0".equals(tag)) {
                            return new n2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_accessories is invalid. Received: "));
                        return null;
                    case BR.icon /* 47 */:
                        if ("layout/layout_settings_head_detection_0".equals(tag)) {
                            return new p2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_head_detection is invalid. Received: "));
                        return null;
                    case 48:
                        if ("layout/layout_settings_preferences_0".equals(tag)) {
                            return new r2(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for layout_settings_preferences is invalid. Received: "));
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
        if (str == null || (num = b.f12323a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f12321a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
