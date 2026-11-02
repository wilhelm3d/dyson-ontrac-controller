package com.dyson.mobile.android.machine.deeplink;

import android.content.Context;
import android.content.Intent;
import com.dyson.mobile.android.machine.deeplink.DeeplinkAction;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.ExpertContentActivity;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.collection.ExpertContentCollectionActivity;
import com.dyson.mobile.android.machine.machinecontent.productinformation.ProductInformationActivity;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.resources.webview.WebViewActivity;
import com.dyson.mobile.android.support.aichatbot.AiChatBotActivity;
import com.dyson.mobile.android.support.ui.contact.compose.ErrorCustomerSupportActivity;
import hj.e;
import mj.m;
/* loaded from: classes3.dex */
public final class a {
    public static final void a(DeeplinkAction deeplinkAction, Context context, e eVar) {
        deeplinkAction.getClass();
        context.getClass();
        eVar.getClass();
        if (deeplinkAction instanceof DeeplinkAction.OpenErrorSupportScreen) {
            DeeplinkAction.OpenErrorSupportScreen openErrorSupportScreen = (DeeplinkAction.OpenErrorSupportScreen) deeplinkAction;
            ErrorCustomerSupportActivity.a aVar = ErrorCustomerSupportActivity.f16863m;
            String str = openErrorSupportScreen.d;
            MachineDescriptor machineDescriptor = openErrorSupportScreen.e;
            String str2 = openErrorSupportScreen.f15085f;
            aVar.getClass();
            context.startActivity(ErrorCustomerSupportActivity.a.a(context, str, machineDescriptor, str2));
        } else if (deeplinkAction instanceof DeeplinkAction.OpenResolveContentUrl) {
            context.startActivity(WebViewActivity.a.a(WebViewActivity.f15911o, context, ((DeeplinkAction.OpenResolveContentUrl) deeplinkAction).d, 20));
        } else if (deeplinkAction instanceof DeeplinkAction.OpenAiChatBot) {
            DeeplinkAction.OpenAiChatBot openAiChatBot = (DeeplinkAction.OpenAiChatBot) deeplinkAction;
            eVar.g(new m("ai_assistant", m.b.WEB_VIEW, m.a.MACHINE_HOME, null, null, 24, null).a(), null);
            AiChatBotActivity.b bVar = AiChatBotActivity.f16749l;
            String str3 = openAiChatBot.d;
            String str4 = openAiChatBot.e;
            bVar.getClass();
            context.startActivity(AiChatBotActivity.b.a(context, str3, str4, null));
        } else if (deeplinkAction instanceof DeeplinkAction.OpenExpertContentItem) {
            DeeplinkAction.OpenExpertContentItem openExpertContentItem = (DeeplinkAction.OpenExpertContentItem) deeplinkAction;
            ExpertContentActivity.a aVar2 = ExpertContentActivity.f15115j;
            String str5 = openExpertContentItem.d;
            String str6 = openExpertContentItem.e;
            String str7 = openExpertContentItem.f15086f;
            aVar2.getClass();
            context.startActivity(ExpertContentActivity.a.a(context, str5, str6, str7));
        } else if (deeplinkAction instanceof DeeplinkAction.OpenExpertContentCollection) {
            DeeplinkAction.OpenExpertContentCollection openExpertContentCollection = (DeeplinkAction.OpenExpertContentCollection) deeplinkAction;
            ExpertContentCollectionActivity.a aVar3 = ExpertContentCollectionActivity.f15150o;
            String str8 = openExpertContentCollection.d;
            String str9 = openExpertContentCollection.e;
            aVar3.getClass();
            str8.getClass();
            str9.getClass();
            Intent intent = new Intent(context, ExpertContentCollectionActivity.class);
            intent.putExtra("machineSerial", str8);
            intent.putExtra("expertContentCollectionId", str9);
            context.startActivity(intent);
        } else if (deeplinkAction instanceof DeeplinkAction.OpenProductInformation) {
            DeeplinkAction.OpenProductInformation openProductInformation = (DeeplinkAction.OpenProductInformation) deeplinkAction;
            ProductInformationActivity.a aVar4 = ProductInformationActivity.f15251l;
            String str10 = openProductInformation.d;
            String str11 = openProductInformation.e;
            aVar4.getClass();
            str10.getClass();
            str11.getClass();
            Intent intent2 = new Intent(context, ProductInformationActivity.class);
            intent2.putExtra("machineSerial", str10);
            intent2.putExtra("productInformationItemId", str11);
            context.startActivity(intent2);
        }
    }
}
