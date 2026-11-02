package k60;

import com.paypal.pyplcheckout.ui.feature.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0012\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lk60/a;", "", "", PayPalNewShippingAddressReviewViewKt.STATE, "<init>", "(Ljava/lang/String;I[B)V", "[B", "getState", "()[B", "ACTIVE", "INACTIVE", "FOREGROUND_ACTIVE", "BACKGROUND_ACTIVE", "BACKGROUND_INACTIVE", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final byte[] state;
    public static final a ACTIVE = new a("ACTIVE", 0, new byte[]{0});
    public static final a INACTIVE = new a("INACTIVE", 1, new byte[]{1});
    public static final a FOREGROUND_ACTIVE = new a("FOREGROUND_ACTIVE", 2, new byte[]{0});
    public static final a BACKGROUND_ACTIVE = new a("BACKGROUND_ACTIVE", 3, new byte[]{1});
    public static final a BACKGROUND_INACTIVE = new a("BACKGROUND_INACTIVE", 4, new byte[]{2});

    private static final /* synthetic */ a[] $values() {
        return new a[]{ACTIVE, INACTIVE, FOREGROUND_ACTIVE, BACKGROUND_ACTIVE, BACKGROUND_INACTIVE};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private a(String str, int i13, byte[] bArr) {
        this.state = bArr;
    }

    public static o12.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final byte[] getState() {
        return this.state;
    }
}
