package com.dyson.mobile.android.account;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.dyson.mobile.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import pa.c;
import q8.e;
import q8.f;
import q8.t;
import qv1.s;
import rh.b0;
import rh.d;
import rh.d0;
import rh.f0;
import rh.h;
import rh.h0;
import rh.j;
import rh.j0;
import rh.l;
import rh.n;
import rh.p;
import rh.r;
import rh.v;
import rh.x;
import rh.z;
/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f12086a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f12087a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(10);
            f12087a = sparseArray;
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

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f12088a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(18);
            f12088a = hashMap;
            c.k(R.layout.activity_login_signup, hashMap, "layout/activity_login_signup_0", R.layout.activity_password_reset_host, "layout/activity_password_reset_host_0");
            c.k(R.layout.dialog_developer_mode, hashMap, "layout/dialog_developer_mode_0", R.layout.fragment_account_already_exists, "layout/fragment_account_already_exists_0");
            c.k(R.layout.fragment_account_created, hashMap, "layout/fragment_account_created_0", R.layout.fragment_activate_account, "layout/fragment_activate_account_0");
            c.k(R.layout.fragment_check_your_inbox_activate, hashMap, "layout/fragment_check_your_inbox_activate_0", R.layout.fragment_check_your_inbox_reset, "layout/fragment_check_your_inbox_reset_0");
            c.k(R.layout.fragment_create_password, hashMap, "layout/fragment_create_password_0", R.layout.fragment_email_capture, "layout/fragment_email_capture_0");
            c.k(R.layout.fragment_email_not_recognised, hashMap, "layout/fragment_email_not_recognised_0", R.layout.fragment_forgotten_password, "layout/fragment_forgotten_password_0");
            c.k(R.layout.fragment_name_capture, hashMap, "layout/fragment_name_capture_0", R.layout.fragment_otp_capture, "layout/fragment_otp_capture_0");
            c.k(R.layout.fragment_password_and_otp_capture, hashMap, "layout/fragment_password_and_otp_capture_0", R.layout.fragment_password_capture, "layout/fragment_password_capture_0");
            c.k(R.layout.fragment_phone_number_capture, hashMap, "layout/fragment_phone_number_capture_0", R.layout.fragment_unreachable_email, "layout/fragment_unreachable_email_0");
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(18);
        f12086a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_login_signup, 1);
        sparseIntArray.put(R.layout.activity_password_reset_host, 2);
        sparseIntArray.put(R.layout.dialog_developer_mode, 3);
        sparseIntArray.put(R.layout.fragment_account_already_exists, 4);
        sparseIntArray.put(R.layout.fragment_account_created, 5);
        sparseIntArray.put(R.layout.fragment_activate_account, 6);
        sparseIntArray.put(R.layout.fragment_check_your_inbox_activate, 7);
        sparseIntArray.put(R.layout.fragment_check_your_inbox_reset, 8);
        sparseIntArray.put(R.layout.fragment_create_password, 9);
        sparseIntArray.put(R.layout.fragment_email_capture, 10);
        sparseIntArray.put(R.layout.fragment_email_not_recognised, 11);
        sparseIntArray.put(R.layout.fragment_forgotten_password, 12);
        sparseIntArray.put(R.layout.fragment_name_capture, 13);
        sparseIntArray.put(R.layout.fragment_otp_capture, 14);
        sparseIntArray.put(R.layout.fragment_password_and_otp_capture, 15);
        sparseIntArray.put(R.layout.fragment_password_capture, 16);
        sparseIntArray.put(R.layout.fragment_phone_number_capture, 17);
        sparseIntArray.put(R.layout.fragment_unreachable_email, 18);
    }

    @Override // q8.e
    public final List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.reporting.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.resources.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.support.DataBinderMapperImpl());
        arrayList.add(new com.dyson.mobile.android.utilities.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // q8.e
    public final String convertBrIdToString(int i13) {
        return a.f12087a.get(i13);
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View view, int i13) {
        int i14 = f12086a.get(i13);
        if (i14 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i14) {
                    case 1:
                        if ("layout/activity_login_signup_0".equals(tag)) {
                            return new rh.b(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_login_signup is invalid. Received: "));
                        return null;
                    case 2:
                        if ("layout/activity_password_reset_host_0".equals(tag)) {
                            return new d(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for activity_password_reset_host is invalid. Received: "));
                        return null;
                    case 3:
                        if ("layout/dialog_developer_mode_0".equals(tag)) {
                            return new rh.f(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for dialog_developer_mode is invalid. Received: "));
                        return null;
                    case 4:
                        if ("layout/fragment_account_already_exists_0".equals(tag)) {
                            return new h(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_account_already_exists is invalid. Received: "));
                        return null;
                    case 5:
                        if ("layout/fragment_account_created_0".equals(tag)) {
                            return new j(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_account_created is invalid. Received: "));
                        return null;
                    case 6:
                        if ("layout/fragment_activate_account_0".equals(tag)) {
                            return new l(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_activate_account is invalid. Received: "));
                        return null;
                    case 7:
                        if ("layout/fragment_check_your_inbox_activate_0".equals(tag)) {
                            return new n(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_check_your_inbox_activate is invalid. Received: "));
                        return null;
                    case 8:
                        if ("layout/fragment_check_your_inbox_reset_0".equals(tag)) {
                            return new p(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_check_your_inbox_reset is invalid. Received: "));
                        return null;
                    case 9:
                        if ("layout/fragment_create_password_0".equals(tag)) {
                            return new r(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_create_password is invalid. Received: "));
                        return null;
                    case 10:
                        if ("layout/fragment_email_capture_0".equals(tag)) {
                            return new rh.t(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_email_capture is invalid. Received: "));
                        return null;
                    case 11:
                        if ("layout/fragment_email_not_recognised_0".equals(tag)) {
                            return new v(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_email_not_recognised is invalid. Received: "));
                        return null;
                    case 12:
                        if ("layout/fragment_forgotten_password_0".equals(tag)) {
                            return new x(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_forgotten_password is invalid. Received: "));
                        return null;
                    case 13:
                        if ("layout/fragment_name_capture_0".equals(tag)) {
                            return new z(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_name_capture is invalid. Received: "));
                        return null;
                    case 14:
                        if ("layout/fragment_otp_capture_0".equals(tag)) {
                            return new b0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_otp_capture is invalid. Received: "));
                        return null;
                    case 15:
                        if ("layout/fragment_password_and_otp_capture_0".equals(tag)) {
                            return new d0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_password_and_otp_capture is invalid. Received: "));
                        return null;
                    case 16:
                        if ("layout/fragment_password_capture_0".equals(tag)) {
                            return new f0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_password_capture is invalid. Received: "));
                        return null;
                    case 17:
                        if ("layout/fragment_phone_number_capture_0".equals(tag)) {
                            return new h0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_phone_number_capture is invalid. Received: "));
                        return null;
                    case 18:
                        if ("layout/fragment_unreachable_email_0".equals(tag)) {
                            return new j0(fVar, view);
                        }
                        c.p(s.h(tag, "The tag for fragment_unreachable_email is invalid. Received: "));
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
        if (str == null || (num = b.f12088a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // q8.e
    public final t getDataBinder(f fVar, View[] viewArr, int i13) {
        if (viewArr != null && viewArr.length != 0 && f12086a.get(i13) > 0 && viewArr[0].getTag() == null) {
            s72.a.w("view must have a tag");
        }
        return null;
    }
}
