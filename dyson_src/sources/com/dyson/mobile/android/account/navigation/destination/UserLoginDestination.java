package com.dyson.mobile.android.account.navigation.destination;

import android.os.Parcelable;
import com.dyson.mobile.android.account.navigation.destination.ExistingUserDestination$EmailNotRecognisedDestination;
import com.dyson.mobile.android.account.navigation.destination.ExistingUserDestination$EmailValidationDestination;
import com.dyson.mobile.android.account.navigation.destination.ExistingUserDestination$EnterPasswordDestination;
import com.dyson.mobile.android.account.navigation.destination.ExistingUserDestination$ForgotPasswordDestination;
import com.dyson.mobile.android.account.navigation.destination.ExistingUserDestination$OtpCaptureDestination;
import com.dyson.mobile.android.account.navigation.destination.ExistingUserDestination$UnreachableEmailDestination;
import com.dyson.mobile.android.account.navigation.destination.NewOwnerDestination$EmailAlreadyRegisteredDestination;
import com.dyson.mobile.android.account.navigation.destination.NewOwnerDestination$OtpCaptureDestination;
import com.dyson.mobile.android.account.navigation.destination.NewOwnerDestination$PersonalDetailsDestination;
import com.dyson.mobile.android.account.navigation.destination.NewOwnerDestination$UnreachableEmailDestination;
import e22.d;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import t42.b;
import t42.f;
import t42.g;
import x12.p0;
import x12.q0;
import x42.g1;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/dyson/mobile/android/account/navigation/destination/UserLoginDestination;", "Landroid/os/Parcelable;", "Companion", "a", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes2.dex */
public interface UserLoginDestination extends Parcelable {
    public static final a Companion = a.f12290a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/account/navigation/destination/UserLoginDestination$a;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/account/navigation/destination/UserLoginDestination;", "serializer", "()Lt42/b;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f12290a = new a();

        private a() {
        }

        public final b<UserLoginDestination> serializer() {
            q0 q0Var = p0.f86717a;
            return new f("com.dyson.mobile.android.account.navigation.destination.UserLoginDestination", q0Var.b(UserLoginDestination.class), new d[]{q0Var.b(ExistingUserDestination$EmailNotRecognisedDestination.class), q0Var.b(ExistingUserDestination$EmailValidationDestination.class), q0Var.b(ExistingUserDestination$EnterPasswordDestination.class), q0Var.b(ExistingUserDestination$ForgotPasswordDestination.class), q0Var.b(ExistingUserDestination$OtpCaptureDestination.class), q0Var.b(ExistingUserDestination$PhoneNumberCaptureValidationDestination.class), q0Var.b(ExistingUserDestination$UnreachableEmailDestination.class), q0Var.b(NewOwnerDestination$EmailAlreadyRegisteredDestination.class), q0Var.b(NewOwnerDestination$EmailValidationDestination.class), q0Var.b(NewOwnerDestination$OtpCaptureDestination.class), q0Var.b(NewOwnerDestination$PersonalDetailsDestination.class), q0Var.b(NewOwnerDestination$PhoneCaptureValidationDestination.class), q0Var.b(NewOwnerDestination$UnreachableEmailDestination.class)}, new b[]{ExistingUserDestination$EmailNotRecognisedDestination.a.f12280a, ExistingUserDestination$EmailValidationDestination.a.f12281a, ExistingUserDestination$EnterPasswordDestination.a.f12282a, ExistingUserDestination$ForgotPasswordDestination.a.f12283a, ExistingUserDestination$OtpCaptureDestination.a.f12284a, new g1("com.dyson.mobile.android.account.navigation.destination.ExistingUserDestination.PhoneNumberCaptureValidationDestination", ExistingUserDestination$PhoneNumberCaptureValidationDestination.INSTANCE, new Annotation[0]), ExistingUserDestination$UnreachableEmailDestination.a.f12285a, NewOwnerDestination$EmailAlreadyRegisteredDestination.a.f12286a, new g1("com.dyson.mobile.android.account.navigation.destination.NewOwnerDestination.EmailValidationDestination", NewOwnerDestination$EmailValidationDestination.INSTANCE, new Annotation[0]), NewOwnerDestination$OtpCaptureDestination.a.f12287a, NewOwnerDestination$PersonalDetailsDestination.a.f12288a, new g1("com.dyson.mobile.android.account.navigation.destination.NewOwnerDestination.PhoneCaptureValidationDestination", NewOwnerDestination$PhoneCaptureValidationDestination.INSTANCE, new Annotation[0]), NewOwnerDestination$UnreachableEmailDestination.a.f12289a}, new Annotation[0]);
        }
    }
}
