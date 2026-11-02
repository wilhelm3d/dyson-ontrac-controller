package com.dyson.mobile.android;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.brightcove.player.captioning.TTMLParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lb.s;
import q8.e;
import q8.f;
import q8.t;
import x70.h;
import x70.j;
/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f12083a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f12084a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(com.salesforce.marketingcloud.analytics.stats.b.f20725m);
            f12084a = sparseArray;
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
            sparseArray.put(37, "dysonDomain");
            sparseArray.put(38, "ecViewModel");
            sparseArray.put(39, "errorVisibility");
            sparseArray.put(40, "explanation");
            sparseArray.put(41, "filterLabel");
            sparseArray.put(42, "filterLife");
            sparseArray.put(43, "functionIcon");
            sparseArray.put(44, "hasInfiniteLife");
            sparseArray.put(45, "header");
            sparseArray.put(46, "homeGraphViewModel");
            sparseArray.put(47, "icon");
            sparseArray.put(48, "image");
            sparseArray.put(49, "importantForAccessibility");
            sparseArray.put(50, "infoText");
            sparseArray.put(51, "isDecreaseSensitivityVisible");
            sparseArray.put(52, "isDustMapLayerVisible");
            sparseArray.put(53, "isGraphClickable");
            sparseArray.put(54, "isHelpClickable");
            sparseArray.put(55, "item");
            sparseArray.put(56, "itemUIState");
            sparseArray.put(57, "layoutViewModel");
            sparseArray.put(58, "level");
            sparseArray.put(59, "location");
            sparseArray.put(60, "lottie");
            sparseArray.put(61, "machineType");
            sparseArray.put(62, "mainViewModel");
            sparseArray.put(63, "name");
            sparseArray.put(64, "onClick");
            sparseArray.put(65, "onHelpClick");
            sparseArray.put(66, "overlayVisible");
            sparseArray.put(67, "passwordErrorVisibility");
            sparseArray.put(68, "productName");
            sparseArray.put(69, "progressRange");
            sparseArray.put(70, "progressVisibility");
            sparseArray.put(71, "range");
            sparseArray.put(72, "rangeAccessibility");
            sparseArray.put(73, "removeButtonVisible");
            sparseArray.put(74, "scaleTitle");
            sparseArray.put(75, "scanResult");
            sparseArray.put(76, "screenTitle");
            sparseArray.put(77, "sessionActiveDuration");
            sparseArray.put(78, "sessionActiveDurationTooltip");
            sparseArray.put(79, "sessionTimeRange");
            sparseArray.put(80, "sessionViewModel");
            sparseArray.put(81, "shouldAutoUpdate");
            sparseArray.put(82, "showChevron");
            sparseArray.put(83, "ssid");
            sparseArray.put(84, "stepDescription");
            sparseArray.put(85, "stepImage");
            sparseArray.put(86, "stepNumber");
            sparseArray.put(87, "supportDomain");
            sparseArray.put(88, "targetKey");
            sparseArray.put(89, "text");
            sparseArray.put(90, "timeRangeTooltip");
            sparseArray.put(91, "timelineTooltip");
            sparseArray.put(92, "title");
            sparseArray.put(93, "titleAccessibilityKey");
            sparseArray.put(94, "titleKey");
            sparseArray.put(95, "titleText");
            sparseArray.put(96, "titleTooltipKey");
            sparseArray.put(97, "toolbarViewModel");
            sparseArray.put(98, "topDrawable");
            sparseArray.put(99, "topImage");
            sparseArray.put(100, "viewActions");
            sparseArray.put(101, "viewModel");
            sparseArray.put(102, "viewPager");
            sparseArray.put(103, "viewState");
            sparseArray.put(104, "visibility");
            sparseArray.put(105, "websiteDomain");
            sparseArray.put(106, "zoningHelpViewModel");
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f12085a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(6);
            f12085a = hashMap;
            hashMap.put("layout/activity_domain_configuration_0", Integer.valueOf((int) R.layout.activity_domain_configuration));
            Integer valueOf = Integer.valueOf((int) R.layout.activity_getconnected);
            hashMap.put("layout/activity_getconnected_0", valueOf);
            hashMap.put("layout-sw600dp/activity_getconnected_0", valueOf);
            s.p(hashMap, "layout-h600dp/activity_getconnected_0", valueOf, R.layout.activity_salesforce_marketing_cloud_webview, "layout/activity_salesforce_marketing_cloud_webview_0");
            hashMap.put("layout/fragment_salesforce_marketing_cloud_webview_0", Integer.valueOf((int) R.layout.fragment_salesforce_marketing_cloud_webview));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f12083a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_domain_configuration, 1);
        sparseIntArray.put(R.layout.activity_getconnected, 2);
        sparseIntArray.put(R.layout.activity_salesforce_marketing_cloud_webview, 3);
        sparseIntArray.put(R.layout.fragment_salesforce_marketing_cloud_webview, 4);
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(17);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.android.mobile.connectedhome.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.account.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.audio.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.cat6.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.connectedhaircare.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.connectionjourney.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.interactableec.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.light.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.machine.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.nonconnectedmachine.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.reporting.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.resources.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.robot.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.schedule.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.support.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.utilities.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // q8.e
    public final String convertBrIdToString(int i13) {
        return a.f12084a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f12083a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                s72.a.w("view must have a tag");
            } else if (i14 == 1) {
                if ("layout/activity_domain_configuration_0".equals(tag)) {
                    return new x70.b(fVar, view);
                }
                pa.c.p(qv1.s.h(tag, "The tag for activity_domain_configuration is invalid. Received: "));
                return null;
            } else if (i14 == 2) {
                if ("layout/activity_getconnected_0".equals(tag)) {
                    return new x70.e(fVar, view);
                }
                if ("layout-sw600dp/activity_getconnected_0".equals(tag)) {
                    return new x70.f(fVar, view);
                }
                if ("layout-h600dp/activity_getconnected_0".equals(tag)) {
                    return new x70.d(fVar, view);
                }
                pa.c.p(qv1.s.h(tag, "The tag for activity_getconnected is invalid. Received: "));
                return null;
            } else if (i14 == 3) {
                if ("layout/activity_salesforce_marketing_cloud_webview_0".equals(tag)) {
                    return new h(fVar, view);
                }
                pa.c.p(qv1.s.h(tag, "The tag for activity_salesforce_marketing_cloud_webview is invalid. Received: "));
                return null;
            } else if (i14 == 4) {
                if ("layout/fragment_salesforce_marketing_cloud_webview_0".equals(tag)) {
                    return new j(fVar, view);
                }
                pa.c.p(qv1.s.h(tag, "The tag for fragment_salesforce_marketing_cloud_webview is invalid. Received: "));
                return null;
            }
        }
        return null;
    }

    @Override // q8.e
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12085a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f12083a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
