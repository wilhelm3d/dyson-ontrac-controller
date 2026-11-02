package com.dyson.mobile.android.support.deeplink;

import android.content.Context;
import android.content.Intent;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.resources.webview.WebViewActivity;
import com.dyson.mobile.android.support.aichatbot.AiChatBotActivity;
import com.dyson.mobile.android.support.deeplink.DeepLinkAction;
import com.dyson.mobile.android.support.ui.contact.compose.ErrorCustomerSupportActivity;
import kotlin.Metadata;
import ma.e;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/deeplink/c;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16822a;

    public c(Context context) {
        context.getClass();
        this.f16822a = context;
    }

    public final void a(DeepLinkAction deepLinkAction) {
        deepLinkAction.getClass();
        boolean z13 = deepLinkAction instanceof DeepLinkAction.OpenErrorSupportScreen;
        Context context = this.f16822a;
        if (z13) {
            DeepLinkAction.OpenErrorSupportScreen openErrorSupportScreen = (DeepLinkAction.OpenErrorSupportScreen) deepLinkAction;
            ErrorCustomerSupportActivity.a aVar = ErrorCustomerSupportActivity.f16863m;
            String str = openErrorSupportScreen.d;
            MachineDescriptor machineDescriptor = openErrorSupportScreen.e;
            String str2 = openErrorSupportScreen.f16815f;
            aVar.getClass();
            Intent a13 = ErrorCustomerSupportActivity.a.a(context, str, machineDescriptor, str2);
            a13.setFlags(268435456);
            context.startActivity(a13);
        } else if (deepLinkAction instanceof DeepLinkAction.OpenResolveContentUrl) {
            Intent a14 = WebViewActivity.a.a(WebViewActivity.f15911o, context, ((DeepLinkAction.OpenResolveContentUrl) deepLinkAction).d, 4);
            a14.setFlags(268435456);
            context.startActivity(a14);
        } else if (!(deepLinkAction instanceof DeepLinkAction.OpenAiChatBot)) {
            e.o();
        } else {
            DeepLinkAction.OpenAiChatBot openAiChatBot = (DeepLinkAction.OpenAiChatBot) deepLinkAction;
            AiChatBotActivity.b bVar = AiChatBotActivity.f16749l;
            String str3 = openAiChatBot.d;
            String str4 = openAiChatBot.e;
            String str5 = openAiChatBot.f16814f;
            bVar.getClass();
            Intent a15 = AiChatBotActivity.b.a(context, str3, str4, str5);
            a15.setFlags(268435456);
            context.startActivity(a15);
        }
    }
}
