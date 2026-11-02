package com.dyson.mobile.android.connectionjourney;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.R;
import com.paypal.android.platform.authsdk.BR;
import f20.a4;
import f20.a5;
import f20.b0;
import f20.b1;
import f20.b2;
import f20.b3;
import f20.c4;
import f20.c5;
import f20.d;
import f20.d0;
import f20.d1;
import f20.d2;
import f20.d3;
import f20.e4;
import f20.e5;
import f20.f0;
import f20.f1;
import f20.f2;
import f20.f3;
import f20.g4;
import f20.g5;
import f20.h;
import f20.h0;
import f20.h1;
import f20.h2;
import f20.h3;
import f20.i4;
import f20.i5;
import f20.j;
import f20.j0;
import f20.j1;
import f20.j2;
import f20.j3;
import f20.k4;
import f20.k5;
import f20.l;
import f20.l0;
import f20.l1;
import f20.l2;
import f20.m4;
import f20.m5;
import f20.n;
import f20.n0;
import f20.n1;
import f20.n2;
import f20.o3;
import f20.o4;
import f20.o5;
import f20.p;
import f20.p0;
import f20.p1;
import f20.p2;
import f20.q3;
import f20.q4;
import f20.r;
import f20.r0;
import f20.r1;
import f20.r2;
import f20.s3;
import f20.s4;
import f20.t0;
import f20.t1;
import f20.t2;
import f20.u3;
import f20.u4;
import f20.v;
import f20.v0;
import f20.v1;
import f20.v2;
import f20.w3;
import f20.w4;
import f20.x;
import f20.x0;
import f20.x1;
import f20.x2;
import f20.y3;
import f20.y4;
import f20.z;
import f20.z0;
import f20.z1;
import f20.z2;
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
    public static final SparseIntArray f13257a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f13258a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(104);
            f13258a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "accessibility");
            sparseArray.put(2, "activated");
            sparseArray.put(3, "adapter");
            sparseArray.put(4, "airQualityLevel");
            sparseArray.put(5, "alpha");
            sparseArray.put(6, "android10PasswordErrorVisibility");
            sparseArray.put(7, "annotation");
            sparseArray.put(8, "apMachinePassword");
            sparseArray.put(9, "aqLiveDataViewModel");
            sparseArray.put(10, "audioLiveDataViewModel");
            sparseArray.put(11, "bottomDrawable");
            sparseArray.put(12, "bottomImage");
            sparseArray.put(13, "bottomSheet");
            sparseArray.put(14, "buttonAlpha");
            sparseArray.put(15, "buttonText");
            sparseArray.put(16, "carouselItem");
            sparseArray.put(17, "carouselViewModel");
            sparseArray.put(18, TTMLParser.Attributes.COLOR);
            sparseArray.put(19, "colorIndex");
            sparseArray.put(20, "command");
            sparseArray.put(21, "contactDetail");
            sparseArray.put(22, "content");
            sparseArray.put(23, "data");
            sparseArray.put(24, "dayViewModel");
            sparseArray.put(25, "description1");
            sparseArray.put(26, "description2");
            sparseArray.put(27, "description3");
            sparseArray.put(28, "description3Visibility");
            sparseArray.put(29, "descriptionAccessibilityContainer");
            sparseArray.put(30, "descriptionAccessibilityKey");
            sparseArray.put(31, "descriptionContainer");
            sparseArray.put(32, "descriptionKey");
            sparseArray.put(33, "descriptionText");
            sparseArray.put(34, "dial");
            sparseArray.put(35, "dividerVisibility");
            sparseArray.put(36, "dominantPollutantViewModel");
            sparseArray.put(37, "ecViewModel");
            sparseArray.put(38, "errorVisibility");
            sparseArray.put(39, "explanation");
            sparseArray.put(40, "filterLabel");
            sparseArray.put(41, "filterLife");
            sparseArray.put(42, "functionIcon");
            sparseArray.put(43, "hasInfiniteLife");
            sparseArray.put(44, "header");
            sparseArray.put(45, "homeGraphViewModel");
            sparseArray.put(46, "icon");
            sparseArray.put(47, "image");
            sparseArray.put(48, "importantForAccessibility");
            sparseArray.put(49, "infoText");
            sparseArray.put(50, "isDecreaseSensitivityVisible");
            sparseArray.put(51, "isDustMapLayerVisible");
            sparseArray.put(52, "isGraphClickable");
            sparseArray.put(53, "isHelpClickable");
            sparseArray.put(54, "item");
            sparseArray.put(55, "itemUIState");
            sparseArray.put(56, "layoutViewModel");
            sparseArray.put(57, "level");
            sparseArray.put(58, "location");
            sparseArray.put(59, "lottie");
            sparseArray.put(60, "machineType");
            sparseArray.put(61, "mainViewModel");
            sparseArray.put(62, "name");
            sparseArray.put(63, "onClick");
            sparseArray.put(64, "onHelpClick");
            sparseArray.put(65, "overlayVisible");
            sparseArray.put(66, "passwordErrorVisibility");
            sparseArray.put(67, "productName");
            sparseArray.put(68, "progressRange");
            sparseArray.put(69, "progressVisibility");
            sparseArray.put(70, "range");
            sparseArray.put(71, "rangeAccessibility");
            sparseArray.put(72, "removeButtonVisible");
            sparseArray.put(73, "scaleTitle");
            sparseArray.put(74, "scanResult");
            sparseArray.put(75, "screenTitle");
            sparseArray.put(76, "sessionActiveDuration");
            sparseArray.put(77, "sessionActiveDurationTooltip");
            sparseArray.put(78, "sessionTimeRange");
            sparseArray.put(79, "sessionViewModel");
            sparseArray.put(80, "shouldAutoUpdate");
            sparseArray.put(81, "showChevron");
            sparseArray.put(82, "ssid");
            sparseArray.put(83, "stepDescription");
            sparseArray.put(84, "stepImage");
            sparseArray.put(85, "stepNumber");
            sparseArray.put(86, "targetKey");
            sparseArray.put(87, "text");
            sparseArray.put(88, "timeRangeTooltip");
            sparseArray.put(89, "timelineTooltip");
            sparseArray.put(90, "title");
            sparseArray.put(91, "titleAccessibilityKey");
            sparseArray.put(92, "titleKey");
            sparseArray.put(93, "titleText");
            sparseArray.put(94, "titleTooltipKey");
            sparseArray.put(95, "toolbarViewModel");
            sparseArray.put(96, "topDrawable");
            sparseArray.put(97, "topImage");
            sparseArray.put(98, "viewActions");
            sparseArray.put(99, "viewModel");
            sparseArray.put(100, "viewPager");
            sparseArray.put(101, "viewState");
            sparseArray.put(102, "visibility");
            sparseArray.put(103, "zoningHelpViewModel");
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f13259a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(84);
            f13259a = hashMap;
            c.k(R.layout.activity_ap_list, hashMap, "layout/activity_ap_list_0", R.layout.activity_ble_connection_journey, "layout/activity_ble_connection_journey_0");
            c.k(R.layout.activity_bluetooth_permission, hashMap, "layout/activity_bluetooth_permission_0", R.layout.activity_change_wifi, "layout/activity_change_wifi_0");
            c.k(R.layout.activity_enable_bluetooth, hashMap, "layout/activity_enable_bluetooth_0", R.layout.activity_enable_location, "layout/activity_enable_location_0");
            c.k(R.layout.activity_enable_wifi, hashMap, "layout/activity_enable_wifi_0", R.layout.activity_gatt_connection, "layout/activity_gatt_connection_0");
            c.k(R.layout.activity_headsup_locate_wifi_screen, hashMap, "layout/activity_headsup_locate_wifi_screen_0", R.layout.activity_headsup_switch_on_screen, "layout/activity_headsup_switch_on_screen_0");
            c.k(R.layout.activity_headsup_switch_on_screen_cat6, hashMap, "layout/activity_headsup_switch_on_screen_cat6_0", R.layout.activity_headsup_switch_on_screen_connected_haircare, "layout/activity_headsup_switch_on_screen_connected_haircare_0");
            c.k(R.layout.activity_headsup_switch_on_screen_robot, hashMap, "layout/activity_headsup_switch_on_screen_robot_0", R.layout.activity_headsup_wifi_state_screen, "layout/activity_headsup_wifi_state_screen_0");
            c.k(R.layout.activity_home_password, hashMap, "layout/activity_home_password_0", R.layout.activity_machine_connection, "layout/activity_machine_connection_0");
            c.k(R.layout.activity_machine_password, hashMap, "layout/activity_machine_password_0", R.layout.activity_machine_prefix_check, "layout/activity_machine_prefix_check_0");
            c.k(R.layout.activity_no_machine_found, hashMap, "layout/activity_no_machine_found_0", R.layout.activity_ownership_auto_update_screen, "layout/activity_ownership_auto_update_screen_0");
            c.k(R.layout.activity_ownership_claim_info, hashMap, "layout/activity_ownership_claim_info_0", R.layout.activity_ownership_failure, "layout/activity_ownership_failure_0");
            c.k(R.layout.activity_ownership_just_using, hashMap, "layout/activity_ownership_just_using_0", R.layout.activity_ownership_machine_name_screen, "layout/activity_ownership_machine_name_screen_0");
            c.k(R.layout.activity_ownership_ota_required_screen, hashMap, "layout/activity_ownership_ota_required_screen_0", R.layout.activity_ownership_purchase_date_screen, "layout/activity_ownership_purchase_date_screen_0");
            c.k(R.layout.activity_ownership_question_screen, hashMap, "layout/activity_ownership_question_screen_0", R.layout.activity_serial_number_based_machine_registration, "layout/activity_serial_number_based_machine_registration_0");
            c.k(R.layout.activity_user_guidance_steps, hashMap, "layout/activity_user_guidance_steps_0", R.layout.ap_user_guidance_ec_model_item, "layout/ap_user_guidance_ec_model_item_0");
            c.k(R.layout.ap_user_guidance_generic_item, hashMap, "layout/ap_user_guidance_generic_item_0", R.layout.ap_user_guidance_help_item, "layout/ap_user_guidance_help_item_0");
            c.k(R.layout.ap_user_guidance_setup_ec_one, hashMap, "layout/ap_user_guidance_setup_ec_one_0", R.layout.ap_user_guidance_setup_ec_three, "layout/ap_user_guidance_setup_ec_three_0");
            c.k(R.layout.ap_user_guidance_setup_ec_two, hashMap, "layout/ap_user_guidance_setup_ec_two_0", R.layout.ap_user_guidance_setup_robot_one, "layout/ap_user_guidance_setup_robot_one_0");
            c.k(R.layout.ap_user_guidance_setup_robot_three, hashMap, "layout/ap_user_guidance_setup_robot_three_0", R.layout.ap_user_guidance_setup_robot_two, "layout/ap_user_guidance_setup_robot_two_0");
            c.k(R.layout.aplist_footer_item, hashMap, "layout/aplist_footer_item_0", R.layout.aplist_item, "layout/aplist_item_0");
            c.k(R.layout.ble_connect_button_pair, hashMap, "layout/ble_connect_button_pair_0", R.layout.ble_connect_hold_near, "layout/ble_connect_hold_near_0");
            c.k(R.layout.ble_user_guidance_setup_audio_one, hashMap, "layout/ble_user_guidance_setup_audio_one_0", R.layout.ble_user_guidance_setup_audio_two, "layout/ble_user_guidance_setup_audio_two_0");
            c.k(R.layout.ble_user_guidance_setup_cat6_one, hashMap, "layout/ble_user_guidance_setup_cat6_one_0", R.layout.ble_user_guidance_setup_cat6_two, "layout/ble_user_guidance_setup_cat6_two_0");
            c.k(R.layout.ble_user_guidance_setup_ec_four, hashMap, "layout/ble_user_guidance_setup_ec_four_0", R.layout.ble_user_guidance_setup_ec_one, "layout/ble_user_guidance_setup_ec_one_0");
            c.k(R.layout.ble_user_guidance_setup_ec_three, hashMap, "layout/ble_user_guidance_setup_ec_three_0", R.layout.ble_user_guidance_setup_ec_two, "layout/ble_user_guidance_setup_ec_two_0");
            c.k(R.layout.ble_user_guidance_setup_light_one, hashMap, "layout/ble_user_guidance_setup_light_one_0", R.layout.ble_user_guidance_setup_light_two, "layout/ble_user_guidance_setup_light_two_0");
            c.k(R.layout.ble_user_guidance_setup_robot_four, hashMap, "layout/ble_user_guidance_setup_robot_four_0", R.layout.ble_user_guidance_setup_robot_one, "layout/ble_user_guidance_setup_robot_one_0");
            c.k(R.layout.ble_user_guidance_setup_robot_three, hashMap, "layout/ble_user_guidance_setup_robot_three_0", R.layout.ble_user_guidance_setup_robot_two, "layout/ble_user_guidance_setup_robot_two_0");
            c.k(R.layout.connecting_info_item, hashMap, "layout/connecting_info_item_0", R.layout.dialog_user_guidance_help, "layout/dialog_user_guidance_help_0");
            c.k(R.layout.fragment_ble_manual_code, hashMap, "layout/fragment_ble_manual_code_0", R.layout.fragment_ble_unable_to_proximity_pair, "layout/fragment_ble_unable_to_proximity_pair_0");
            c.k(R.layout.fragment_bluetooth_permission, hashMap, "layout/fragment_bluetooth_permission_0", R.layout.fragment_connecting_to_new_wifi, "layout/fragment_connecting_to_new_wifi_0");
            c.k(R.layout.fragment_connection_carousel, hashMap, "layout/fragment_connection_carousel_0", R.layout.fragment_enable_bluetooth, "layout/fragment_enable_bluetooth_0");
            c.k(R.layout.fragment_gatt_pair, hashMap, "layout/fragment_gatt_pair_0", R.layout.fragment_home_ap_cant_see, "layout/fragment_home_ap_cant_see_0");
            c.k(R.layout.fragment_home_ap_list, hashMap, "layout/fragment_home_ap_list_0", R.layout.fragment_home_password, "layout/fragment_home_password_0");
            c.k(R.layout.fragment_locate_code, hashMap, "layout/fragment_locate_code_0", R.layout.fragment_locate_ec_code, "layout/fragment_locate_ec_code_0");
            c.k(R.layout.fragment_machine_light_state_information, hashMap, "layout/fragment_machine_light_state_information_0", R.layout.fragment_machine_serial_capture, "layout/fragment_machine_serial_capture_0");
            c.k(R.layout.fragment_non_connected_ownership_bypass, hashMap, "layout/fragment_non_connected_ownership_bypass_0", R.layout.fragment_non_connected_ownership_confirmation, "layout/fragment_non_connected_ownership_confirmation_0");
            c.k(R.layout.fragment_non_connected_ownership_purchase_date, hashMap, "layout/fragment_non_connected_ownership_purchase_date_0", R.layout.fragment_prepare_to_change_wifi, "layout/fragment_prepare_to_change_wifi_0");
            c.k(R.layout.fragment_registered_to_another_user, hashMap, "layout/fragment_registered_to_another_user_0", R.layout.fragment_remain_close_to_machine, "layout/fragment_remain_close_to_machine_0");
            c.k(R.layout.fragment_trouble_connecting, hashMap, "layout/fragment_trouble_connecting_0", R.layout.home_aplist_item, "layout/home_aplist_item_0");
            c.k(R.layout.item_trouble_connecting, hashMap, "layout/item_trouble_connecting_0", R.layout.layout_connection_failed, "layout/layout_connection_failed_0");
            c.k(R.layout.layout_connection_journey_completion_overlay, hashMap, "layout/layout_connection_journey_completion_overlay_0", R.layout.user_guidance_connected_haircare_one, "layout/user_guidance_connected_haircare_one_0");
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(84);
        f13257a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_ap_list, 1);
        sparseIntArray.put(R.layout.activity_ble_connection_journey, 2);
        sparseIntArray.put(R.layout.activity_bluetooth_permission, 3);
        sparseIntArray.put(R.layout.activity_change_wifi, 4);
        sparseIntArray.put(R.layout.activity_enable_bluetooth, 5);
        sparseIntArray.put(R.layout.activity_enable_location, 6);
        sparseIntArray.put(R.layout.activity_enable_wifi, 7);
        sparseIntArray.put(R.layout.activity_gatt_connection, 8);
        sparseIntArray.put(R.layout.activity_headsup_locate_wifi_screen, 9);
        sparseIntArray.put(R.layout.activity_headsup_switch_on_screen, 10);
        sparseIntArray.put(R.layout.activity_headsup_switch_on_screen_cat6, 11);
        sparseIntArray.put(R.layout.activity_headsup_switch_on_screen_connected_haircare, 12);
        sparseIntArray.put(R.layout.activity_headsup_switch_on_screen_robot, 13);
        sparseIntArray.put(R.layout.activity_headsup_wifi_state_screen, 14);
        sparseIntArray.put(R.layout.activity_home_password, 15);
        sparseIntArray.put(R.layout.activity_machine_connection, 16);
        sparseIntArray.put(R.layout.activity_machine_password, 17);
        sparseIntArray.put(R.layout.activity_machine_prefix_check, 18);
        sparseIntArray.put(R.layout.activity_no_machine_found, 19);
        sparseIntArray.put(R.layout.activity_ownership_auto_update_screen, 20);
        sparseIntArray.put(R.layout.activity_ownership_claim_info, 21);
        sparseIntArray.put(R.layout.activity_ownership_failure, 22);
        sparseIntArray.put(R.layout.activity_ownership_just_using, 23);
        sparseIntArray.put(R.layout.activity_ownership_machine_name_screen, 24);
        sparseIntArray.put(R.layout.activity_ownership_ota_required_screen, 25);
        sparseIntArray.put(R.layout.activity_ownership_purchase_date_screen, 26);
        sparseIntArray.put(R.layout.activity_ownership_question_screen, 27);
        sparseIntArray.put(R.layout.activity_serial_number_based_machine_registration, 28);
        sparseIntArray.put(R.layout.activity_user_guidance_steps, 29);
        sparseIntArray.put(R.layout.ap_user_guidance_ec_model_item, 30);
        sparseIntArray.put(R.layout.ap_user_guidance_generic_item, 31);
        sparseIntArray.put(R.layout.ap_user_guidance_help_item, 32);
        sparseIntArray.put(R.layout.ap_user_guidance_setup_ec_one, 33);
        sparseIntArray.put(R.layout.ap_user_guidance_setup_ec_three, 34);
        sparseIntArray.put(R.layout.ap_user_guidance_setup_ec_two, 35);
        sparseIntArray.put(R.layout.ap_user_guidance_setup_robot_one, 36);
        sparseIntArray.put(R.layout.ap_user_guidance_setup_robot_three, 37);
        sparseIntArray.put(R.layout.ap_user_guidance_setup_robot_two, 38);
        sparseIntArray.put(R.layout.aplist_footer_item, 39);
        sparseIntArray.put(R.layout.aplist_item, 40);
        sparseIntArray.put(R.layout.ble_connect_button_pair, 41);
        sparseIntArray.put(R.layout.ble_connect_hold_near, 42);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_audio_one, 43);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_audio_two, 44);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_cat6_one, 45);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_cat6_two, 46);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_ec_four, 47);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_ec_one, 48);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_ec_three, 49);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_ec_two, 50);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_light_one, 51);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_light_two, 52);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_robot_four, 53);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_robot_one, 54);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_robot_three, 55);
        sparseIntArray.put(R.layout.ble_user_guidance_setup_robot_two, 56);
        sparseIntArray.put(R.layout.connecting_info_item, 57);
        sparseIntArray.put(R.layout.dialog_user_guidance_help, 58);
        sparseIntArray.put(R.layout.fragment_ble_manual_code, 59);
        sparseIntArray.put(R.layout.fragment_ble_unable_to_proximity_pair, 60);
        sparseIntArray.put(R.layout.fragment_bluetooth_permission, 61);
        sparseIntArray.put(R.layout.fragment_connecting_to_new_wifi, 62);
        sparseIntArray.put(R.layout.fragment_connection_carousel, 63);
        sparseIntArray.put(R.layout.fragment_enable_bluetooth, 64);
        sparseIntArray.put(R.layout.fragment_gatt_pair, 65);
        sparseIntArray.put(R.layout.fragment_home_ap_cant_see, 66);
        sparseIntArray.put(R.layout.fragment_home_ap_list, 67);
        sparseIntArray.put(R.layout.fragment_home_password, 68);
        sparseIntArray.put(R.layout.fragment_locate_code, 69);
        sparseIntArray.put(R.layout.fragment_locate_ec_code, 70);
        sparseIntArray.put(R.layout.fragment_machine_light_state_information, 71);
        sparseIntArray.put(R.layout.fragment_machine_serial_capture, 72);
        sparseIntArray.put(R.layout.fragment_non_connected_ownership_bypass, 73);
        sparseIntArray.put(R.layout.fragment_non_connected_ownership_confirmation, 74);
        sparseIntArray.put(R.layout.fragment_non_connected_ownership_purchase_date, 75);
        sparseIntArray.put(R.layout.fragment_prepare_to_change_wifi, 76);
        sparseIntArray.put(R.layout.fragment_registered_to_another_user, 77);
        sparseIntArray.put(R.layout.fragment_remain_close_to_machine, 78);
        sparseIntArray.put(R.layout.fragment_trouble_connecting, 79);
        sparseIntArray.put(R.layout.home_aplist_item, 80);
        sparseIntArray.put(R.layout.item_trouble_connecting, 81);
        sparseIntArray.put(R.layout.layout_connection_failed, 82);
        sparseIntArray.put(R.layout.layout_connection_journey_completion_overlay, 83);
        sparseIntArray.put(R.layout.user_guidance_connected_haircare_one, 84);
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.android.mobile.connectedhome.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.account.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.light.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.machine.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.reporting.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.resources.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.support.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.utilities.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // q8.e
    public final String convertBrIdToString(int i13) {
        return a.f13258a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f13257a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i15 = (i14 - 1) / 50;
                if (i15 == 0) {
                    switch (i14) {
                        case 1:
                            if ("layout/activity_ap_list_0".equals(tag)) {
                                return new f20.b(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ap_list is invalid. Received: "));
                            return null;
                        case 2:
                            if ("layout/activity_ble_connection_journey_0".equals(tag)) {
                                return new d(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ble_connection_journey is invalid. Received: "));
                            return null;
                        case 3:
                            if ("layout/activity_bluetooth_permission_0".equals(tag)) {
                                return new f20.f(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_bluetooth_permission is invalid. Received: "));
                            return null;
                        case 4:
                            if ("layout/activity_change_wifi_0".equals(tag)) {
                                return new h(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_change_wifi is invalid. Received: "));
                            return null;
                        case 5:
                            if ("layout/activity_enable_bluetooth_0".equals(tag)) {
                                return new j(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_enable_bluetooth is invalid. Received: "));
                            return null;
                        case 6:
                            if ("layout/activity_enable_location_0".equals(tag)) {
                                return new l(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_enable_location is invalid. Received: "));
                            return null;
                        case 7:
                            if ("layout/activity_enable_wifi_0".equals(tag)) {
                                return new n(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_enable_wifi is invalid. Received: "));
                            return null;
                        case 8:
                            if ("layout/activity_gatt_connection_0".equals(tag)) {
                                return new p(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_gatt_connection is invalid. Received: "));
                            return null;
                        case 9:
                            if ("layout/activity_headsup_locate_wifi_screen_0".equals(tag)) {
                                return new r(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_headsup_locate_wifi_screen is invalid. Received: "));
                            return null;
                        case 10:
                            if ("layout/activity_headsup_switch_on_screen_0".equals(tag)) {
                                return new f20.t(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_headsup_switch_on_screen is invalid. Received: "));
                            return null;
                        case 11:
                            if ("layout/activity_headsup_switch_on_screen_cat6_0".equals(tag)) {
                                return new v(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_headsup_switch_on_screen_cat6 is invalid. Received: "));
                            return null;
                        case 12:
                            if ("layout/activity_headsup_switch_on_screen_connected_haircare_0".equals(tag)) {
                                return new x(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_headsup_switch_on_screen_connected_haircare is invalid. Received: "));
                            return null;
                        case 13:
                            if ("layout/activity_headsup_switch_on_screen_robot_0".equals(tag)) {
                                return new z(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_headsup_switch_on_screen_robot is invalid. Received: "));
                            return null;
                        case 14:
                            if ("layout/activity_headsup_wifi_state_screen_0".equals(tag)) {
                                return new b0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_headsup_wifi_state_screen is invalid. Received: "));
                            return null;
                        case 15:
                            if ("layout/activity_home_password_0".equals(tag)) {
                                return new d0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_home_password is invalid. Received: "));
                            return null;
                        case 16:
                            if ("layout/activity_machine_connection_0".equals(tag)) {
                                return new f0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_machine_connection is invalid. Received: "));
                            return null;
                        case 17:
                            if ("layout/activity_machine_password_0".equals(tag)) {
                                return new h0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_machine_password is invalid. Received: "));
                            return null;
                        case 18:
                            if ("layout/activity_machine_prefix_check_0".equals(tag)) {
                                return new j0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_machine_prefix_check is invalid. Received: "));
                            return null;
                        case 19:
                            if ("layout/activity_no_machine_found_0".equals(tag)) {
                                return new l0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_no_machine_found is invalid. Received: "));
                            return null;
                        case 20:
                            if ("layout/activity_ownership_auto_update_screen_0".equals(tag)) {
                                return new n0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ownership_auto_update_screen is invalid. Received: "));
                            return null;
                        case 21:
                            if ("layout/activity_ownership_claim_info_0".equals(tag)) {
                                return new p0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ownership_claim_info is invalid. Received: "));
                            return null;
                        case 22:
                            if ("layout/activity_ownership_failure_0".equals(tag)) {
                                return new r0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ownership_failure is invalid. Received: "));
                            return null;
                        case 23:
                            if ("layout/activity_ownership_just_using_0".equals(tag)) {
                                return new t0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ownership_just_using is invalid. Received: "));
                            return null;
                        case 24:
                            if ("layout/activity_ownership_machine_name_screen_0".equals(tag)) {
                                return new v0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ownership_machine_name_screen is invalid. Received: "));
                            return null;
                        case 25:
                            if ("layout/activity_ownership_ota_required_screen_0".equals(tag)) {
                                return new x0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ownership_ota_required_screen is invalid. Received: "));
                            return null;
                        case 26:
                            if ("layout/activity_ownership_purchase_date_screen_0".equals(tag)) {
                                return new z0(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ownership_purchase_date_screen is invalid. Received: "));
                            return null;
                        case 27:
                            if ("layout/activity_ownership_question_screen_0".equals(tag)) {
                                return new b1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_ownership_question_screen is invalid. Received: "));
                            return null;
                        case 28:
                            if ("layout/activity_serial_number_based_machine_registration_0".equals(tag)) {
                                return new d1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_serial_number_based_machine_registration is invalid. Received: "));
                            return null;
                        case 29:
                            if ("layout/activity_user_guidance_steps_0".equals(tag)) {
                                return new f1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for activity_user_guidance_steps is invalid. Received: "));
                            return null;
                        case 30:
                            if ("layout/ap_user_guidance_ec_model_item_0".equals(tag)) {
                                return new h1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ap_user_guidance_ec_model_item is invalid. Received: "));
                            return null;
                        case 31:
                            if ("layout/ap_user_guidance_generic_item_0".equals(tag)) {
                                return new j1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ap_user_guidance_generic_item is invalid. Received: "));
                            return null;
                        case 32:
                            if ("layout/ap_user_guidance_help_item_0".equals(tag)) {
                                return new l1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ap_user_guidance_help_item is invalid. Received: "));
                            return null;
                        case 33:
                            if ("layout/ap_user_guidance_setup_ec_one_0".equals(tag)) {
                                return new n1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ap_user_guidance_setup_ec_one is invalid. Received: "));
                            return null;
                        case 34:
                            if ("layout/ap_user_guidance_setup_ec_three_0".equals(tag)) {
                                return new p1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ap_user_guidance_setup_ec_three is invalid. Received: "));
                            return null;
                        case 35:
                            if ("layout/ap_user_guidance_setup_ec_two_0".equals(tag)) {
                                return new r1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ap_user_guidance_setup_ec_two is invalid. Received: "));
                            return null;
                        case 36:
                            if ("layout/ap_user_guidance_setup_robot_one_0".equals(tag)) {
                                return new t1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ap_user_guidance_setup_robot_one is invalid. Received: "));
                            return null;
                        case BR.dysonDomain /* 37 */:
                            if ("layout/ap_user_guidance_setup_robot_three_0".equals(tag)) {
                                return new v1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ap_user_guidance_setup_robot_three is invalid. Received: "));
                            return null;
                        case BR.ecViewModel /* 38 */:
                            if ("layout/ap_user_guidance_setup_robot_two_0".equals(tag)) {
                                return new x1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ap_user_guidance_setup_robot_two is invalid. Received: "));
                            return null;
                        case BR.errorVisibility /* 39 */:
                            if ("layout/aplist_footer_item_0".equals(tag)) {
                                return new z1(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for aplist_footer_item is invalid. Received: "));
                            return null;
                        case 40:
                            if ("layout/aplist_item_0".equals(tag)) {
                                return new b2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for aplist_item is invalid. Received: "));
                            return null;
                        case BR.filterLabel /* 41 */:
                            if ("layout/ble_connect_button_pair_0".equals(tag)) {
                                return new d2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_connect_button_pair is invalid. Received: "));
                            return null;
                        case BR.filterLife /* 42 */:
                            if ("layout/ble_connect_hold_near_0".equals(tag)) {
                                return new f2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_connect_hold_near is invalid. Received: "));
                            return null;
                        case BR.functionIcon /* 43 */:
                            if ("layout/ble_user_guidance_setup_audio_one_0".equals(tag)) {
                                return new h2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_audio_one is invalid. Received: "));
                            return null;
                        case BR.hasInfiniteLife /* 44 */:
                            if ("layout/ble_user_guidance_setup_audio_two_0".equals(tag)) {
                                return new j2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_audio_two is invalid. Received: "));
                            return null;
                        case BR.header /* 45 */:
                            if ("layout/ble_user_guidance_setup_cat6_one_0".equals(tag)) {
                                return new l2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_cat6_one is invalid. Received: "));
                            return null;
                        case BR.homeGraphViewModel /* 46 */:
                            if ("layout/ble_user_guidance_setup_cat6_two_0".equals(tag)) {
                                return new n2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_cat6_two is invalid. Received: "));
                            return null;
                        case BR.icon /* 47 */:
                            if ("layout/ble_user_guidance_setup_ec_four_0".equals(tag)) {
                                return new p2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_ec_four is invalid. Received: "));
                            return null;
                        case 48:
                            if ("layout/ble_user_guidance_setup_ec_one_0".equals(tag)) {
                                return new r2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_ec_one is invalid. Received: "));
                            return null;
                        case BR.importantForAccessibility /* 49 */:
                            if ("layout/ble_user_guidance_setup_ec_three_0".equals(tag)) {
                                return new t2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_ec_three is invalid. Received: "));
                            return null;
                        case 50:
                            if ("layout/ble_user_guidance_setup_ec_two_0".equals(tag)) {
                                return new v2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_ec_two is invalid. Received: "));
                            return null;
                    }
                } else if (i15 == 1) {
                    switch (i14) {
                        case BR.isDecreaseSensitivityVisible /* 51 */:
                            if ("layout/ble_user_guidance_setup_light_one_0".equals(tag)) {
                                return new x2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_light_one is invalid. Received: "));
                            return null;
                        case BR.isDustMapLayerVisible /* 52 */:
                            if ("layout/ble_user_guidance_setup_light_two_0".equals(tag)) {
                                return new z2(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_light_two is invalid. Received: "));
                            return null;
                        case BR.isGraphClickable /* 53 */:
                            if ("layout/ble_user_guidance_setup_robot_four_0".equals(tag)) {
                                return new b3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_robot_four is invalid. Received: "));
                            return null;
                        case BR.isHelpClickable /* 54 */:
                            if ("layout/ble_user_guidance_setup_robot_one_0".equals(tag)) {
                                return new d3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_robot_one is invalid. Received: "));
                            return null;
                        case BR.item /* 55 */:
                            if ("layout/ble_user_guidance_setup_robot_three_0".equals(tag)) {
                                return new f3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_robot_three is invalid. Received: "));
                            return null;
                        case 56:
                            if ("layout/ble_user_guidance_setup_robot_two_0".equals(tag)) {
                                return new h3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for ble_user_guidance_setup_robot_two is invalid. Received: "));
                            return null;
                        case 57:
                            if ("layout/connecting_info_item_0".equals(tag)) {
                                return new j3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for connecting_info_item is invalid. Received: "));
                            return null;
                        case BR.level /* 58 */:
                            if ("layout/dialog_user_guidance_help_0".equals(tag)) {
                                return new o3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for dialog_user_guidance_help is invalid. Received: "));
                            return null;
                        case BR.location /* 59 */:
                            if ("layout/fragment_ble_manual_code_0".equals(tag)) {
                                return new q3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_ble_manual_code is invalid. Received: "));
                            return null;
                        case 60:
                            if ("layout/fragment_ble_unable_to_proximity_pair_0".equals(tag)) {
                                return new s3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_ble_unable_to_proximity_pair is invalid. Received: "));
                            return null;
                        case BR.machineType /* 61 */:
                            if ("layout/fragment_bluetooth_permission_0".equals(tag)) {
                                return new u3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_bluetooth_permission is invalid. Received: "));
                            return null;
                        case BR.mainViewModel /* 62 */:
                            if ("layout/fragment_connecting_to_new_wifi_0".equals(tag)) {
                                return new w3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_connecting_to_new_wifi is invalid. Received: "));
                            return null;
                        case 63:
                            if ("layout/fragment_connection_carousel_0".equals(tag)) {
                                return new y3(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_connection_carousel is invalid. Received: "));
                            return null;
                        case 64:
                            if ("layout/fragment_enable_bluetooth_0".equals(tag)) {
                                return new a4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_enable_bluetooth is invalid. Received: "));
                            return null;
                        case BR.onHelpClick /* 65 */:
                            if ("layout/fragment_gatt_pair_0".equals(tag)) {
                                return new c4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_gatt_pair is invalid. Received: "));
                            return null;
                        case BR.overlayVisible /* 66 */:
                            if ("layout/fragment_home_ap_cant_see_0".equals(tag)) {
                                return new e4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_home_ap_cant_see is invalid. Received: "));
                            return null;
                        case BR.passwordErrorVisibility /* 67 */:
                            if ("layout/fragment_home_ap_list_0".equals(tag)) {
                                return new g4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_home_ap_list is invalid. Received: "));
                            return null;
                        case BR.productName /* 68 */:
                            if ("layout/fragment_home_password_0".equals(tag)) {
                                return new i4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_home_password is invalid. Received: "));
                            return null;
                        case BR.progressRange /* 69 */:
                            if ("layout/fragment_locate_code_0".equals(tag)) {
                                return new k4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_locate_code is invalid. Received: "));
                            return null;
                        case 70:
                            if ("layout/fragment_locate_ec_code_0".equals(tag)) {
                                return new m4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_locate_ec_code is invalid. Received: "));
                            return null;
                        case BR.range /* 71 */:
                            if ("layout/fragment_machine_light_state_information_0".equals(tag)) {
                                return new o4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_machine_light_state_information is invalid. Received: "));
                            return null;
                        case BR.rangeAccessibility /* 72 */:
                            if ("layout/fragment_machine_serial_capture_0".equals(tag)) {
                                return new q4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_machine_serial_capture is invalid. Received: "));
                            return null;
                        case BR.removeButtonVisible /* 73 */:
                            if ("layout/fragment_non_connected_ownership_bypass_0".equals(tag)) {
                                return new s4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_non_connected_ownership_bypass is invalid. Received: "));
                            return null;
                        case BR.scaleTitle /* 74 */:
                            if ("layout/fragment_non_connected_ownership_confirmation_0".equals(tag)) {
                                return new u4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_non_connected_ownership_confirmation is invalid. Received: "));
                            return null;
                        case BR.scanResult /* 75 */:
                            if ("layout/fragment_non_connected_ownership_purchase_date_0".equals(tag)) {
                                return new w4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_non_connected_ownership_purchase_date is invalid. Received: "));
                            return null;
                        case BR.screenTitle /* 76 */:
                            if ("layout/fragment_prepare_to_change_wifi_0".equals(tag)) {
                                return new y4(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_prepare_to_change_wifi is invalid. Received: "));
                            return null;
                        case BR.sessionActiveDuration /* 77 */:
                            if ("layout/fragment_registered_to_another_user_0".equals(tag)) {
                                return new a5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_registered_to_another_user is invalid. Received: "));
                            return null;
                        case BR.sessionActiveDurationTooltip /* 78 */:
                            if ("layout/fragment_remain_close_to_machine_0".equals(tag)) {
                                return new c5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_remain_close_to_machine is invalid. Received: "));
                            return null;
                        case BR.sessionTimeRange /* 79 */:
                            if ("layout/fragment_trouble_connecting_0".equals(tag)) {
                                return new e5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for fragment_trouble_connecting is invalid. Received: "));
                            return null;
                        case 80:
                            if ("layout/home_aplist_item_0".equals(tag)) {
                                return new g5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for home_aplist_item is invalid. Received: "));
                            return null;
                        case BR.shouldAutoUpdate /* 81 */:
                            if ("layout/item_trouble_connecting_0".equals(tag)) {
                                return new i5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for item_trouble_connecting is invalid. Received: "));
                            return null;
                        case BR.showChevron /* 82 */:
                            if ("layout/layout_connection_failed_0".equals(tag)) {
                                return new k5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_connection_failed is invalid. Received: "));
                            return null;
                        case BR.ssid /* 83 */:
                            if ("layout/layout_connection_journey_completion_overlay_0".equals(tag)) {
                                return new m5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for layout_connection_journey_completion_overlay is invalid. Received: "));
                            return null;
                        case BR.stepDescription /* 84 */:
                            if ("layout/user_guidance_connected_haircare_one_0".equals(tag)) {
                                return new o5(fVar, view);
                            }
                            c.p(s.h(tag, "The tag for user_guidance_connected_haircare_one is invalid. Received: "));
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
        if (str == null || (num = b.f13259a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f13257a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
