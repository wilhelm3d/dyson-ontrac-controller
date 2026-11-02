package com.dyson.mobile.android.cat6.ui.onboarding.language;

import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.cat6.traits.language.ProductUILanguage;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/onboarding/language/a;", "", "<init>", "()V", "a", "b", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f12906a = new b(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/onboarding/language/a$a;", "Ly9/m0;", "Lcom/dyson/mobile/android/cat6/traits/language/ProductUILanguage;", "selectedLanguage", "", "coordinatorId", "<init>", "(Lcom/dyson/mobile/android/cat6/traits/language/ProductUILanguage;Ljava/lang/String;)V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.cat6.ui.onboarding.language.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0372a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final ProductUILanguage f12907a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12908b;

        public C0372a(ProductUILanguage productUILanguage, String str) {
            productUILanguage.getClass();
            str.getClass();
            this.f12907a = productUILanguage;
            this.f12908b = str;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.actionToOwnershipLanguageSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0372a) {
                C0372a c0372a = (C0372a) obj;
                return this.f12907a.equals(c0372a.f12907a) && this.f12908b.equals(c0372a.f12908b);
            }
            return false;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(ProductUILanguage.class);
            ProductUILanguage productUILanguage = this.f12907a;
            if (isAssignableFrom) {
                bundle.putParcelable("selectedLanguage", productUILanguage);
            } else if (!Serializable.class.isAssignableFrom(ProductUILanguage.class)) {
                ie.a.t(ProductUILanguage.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            } else {
                bundle.putSerializable("selectedLanguage", (Serializable) productUILanguage);
            }
            bundle.putString("coordinatorId", this.f12908b);
            return bundle;
        }

        public final int hashCode() {
            return this.f12908b.hashCode() + (this.f12907a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionToOwnershipLanguageSelection(selectedLanguage=" + this.f12907a + ", coordinatorId=" + this.f12908b + ")";
        }
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/onboarding/language/a$b;", "", "<init>", "()V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
