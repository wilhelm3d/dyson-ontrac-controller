package com.dyson.mobile.android.connectionjourney.store;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Base64;
import com.dyson.mobile.android.connectionjourney.applink.DevicePairingParameters;
import com.dyson.mobile.android.connectivity.ble.BleScanningRecord;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineConnectionCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import h12.f0;
import h12.q;
import hj.e;
import i12.q0;
import in0.h;
import in0.i;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj.a;
import u50.j;
import uf0.q;
import x12.r;
import y70.f;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;", "", "Landroid/content/Context;", "context", "", "domain", "", "secure", "Lhj/e;", "trackingManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLhj/e;)V", "ByteArrayToBase64TypeAdapter", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConnectionJourneyDataStore {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final e f13889a;

    /* renamed from: b  reason: collision with root package name */
    public final Gson f13890b;

    /* renamed from: c  reason: collision with root package name */
    public final y70.a f13891c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore$ByteArrayToBase64TypeAdapter;", "Lcom/google/gson/JsonSerializer;", "", "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ByteArrayToBase64TypeAdapter implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
        @Override // com.google.gson.JsonDeserializer
        public final byte[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            return Base64.decode(jsonElement.getAsString(), 2);
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(byte[] bArr, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Base64.encodeToString(bArr, 2));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore$b", "Lcom/google/gson/reflect/TypeToken;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends TypeToken<Map<String, ? extends String>> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore$c", "Lcom/google/gson/reflect/TypeToken;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends TypeToken<BleScanningRecord> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore$d", "Lcom/google/gson/reflect/TypeToken;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends TypeToken<DevicePairingParameters> {
    }

    static {
        new a(null);
    }

    public ConnectionJourneyDataStore(Context context, String str, boolean z13, e eVar) {
        context.getClass();
        str.getClass();
        eVar.getClass();
        this.f13889a = eVar;
        f fVar = new f(context, str);
        if (z13) {
            this.f13891c = new b80.b(new c80.b(), fVar, str);
        } else {
            this.f13891c = fVar;
        }
        Gson create = new GsonBuilder().registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter()).create();
        create.getClass();
        this.f13890b = create;
    }

    public final void a() {
        ((q) this.f13889a.a()).d();
        y70.a aVar = this.f13891c;
        aVar.remove("CONNECTION_JOURNEY_MACHINE_TYPE");
        aVar.remove("CONNECTION_JOURNEY_MACHINE_VARIANT");
        aVar.remove("CONNECTION_JOURNEY_MACHINE_MODEL");
        aVar.remove("CONNECTION_JOURNEY_PRODUCT_NAME");
        aVar.remove("CONNECTION_JOURNEY_MACHINE_CATEGORY");
        aVar.remove("CONNECTION_JOURNEY_MACHINE_CONNECTION_CATEGORY");
    }

    public final void b() {
        y70.a aVar = this.f13891c;
        aVar.remove("CONNECTION_JOURNEY_PENDING_WIFI_PASSWORD_SSID");
        aVar.remove("CONNECTION_JOURNEY_PENDING_WIFI_PASSWORD");
    }

    public final void c() {
        y70.a aVar = this.f13891c;
        String string = aVar.getString("CONNECTION_JOURNEY_PENDING_WIFI_PASSWORD_SSID");
        String string2 = aVar.getString("CONNECTION_JOURNEY_PENDING_WIFI_PASSWORD");
        String str = m().f10408a;
        str.getClass();
        b();
        if (!r.c(string, str) || string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(l());
        linkedHashMap.put(string, string2);
        f0 f0Var = f0.f36844a;
        Map l13 = q0.l(linkedHashMap);
        if (l13.isEmpty()) {
            aVar.remove("CONNECTION_JOURNEY_SAVED_WIFI_PASSWORDS");
        } else {
            aVar.putString("CONNECTION_JOURNEY_SAVED_WIFI_PASSWORDS", this.f13890b.toJson(l13));
        }
    }

    public final BleScanningRecord d() {
        Object bVar;
        String string = this.f13891c.getString("CONNECTION_JOURNEY_BLE_SCAN_RECORD-key");
        Gson gson = this.f13890b;
        try {
            int i13 = h12.q.e;
            bVar = gson.fromJson(string, new c().getType());
        } catch (Throwable th2) {
            int i14 = h12.q.e;
            bVar = new q.b(th2);
        }
        if (bVar instanceof q.b) {
            bVar = null;
        }
        BleScanningRecord bleScanningRecord = (BleScanningRecord) bVar;
        if (bleScanningRecord != null) {
            return bleScanningRecord;
        }
        pa.c.w("BleScanningRecord not found in DataStore");
        return null;
    }

    public final String e() {
        return this.f13891c.getString("ConnectionJourneyServiceStatus-key");
    }

    @SuppressLint({"GsonWithoutSerializedName"})
    public final DevicePairingParameters f() {
        Object bVar;
        Gson gson = this.f13890b;
        String string = this.f13891c.getString("CONNECTION_JOURNEY_RESULT-key");
        try {
            int i13 = h12.q.e;
            bVar = gson.fromJson(string, new d().getType());
        } catch (Throwable th2) {
            int i14 = h12.q.e;
            bVar = new q.b(th2);
        }
        if (bVar instanceof q.b) {
            bVar = null;
        }
        return (DevicePairingParameters) bVar;
    }

    public final c50.c g() {
        y70.a aVar = this.f13891c;
        return new c50.c(aVar.getString("CONNECTION_JOURNEY_MACHINE_AP_CREDENTIALS_SSID"), aVar.getString("CONNECTION_JOURNEY_MACHINE_AP_CREDENTIALS_PASS"));
    }

    @SuppressLint({"EnumNameOrOrdinalReference"})
    public final MachineCategory h() {
        String string = this.f13891c.getString("CONNECTION_JOURNEY_MACHINE_CATEGORY");
        MachineCategory.Companion.getClass();
        return MachineCategory.a.a(string);
    }

    public final c50.c i() {
        y70.a aVar = this.f13891c;
        return new c50.c(aVar.getString("CONNECTION_JOURNEY_MACHINE_CREDENTIALS_SERIAL"), aVar.getString("CONNECTION_JOURNEY_MACHINE_CREDENTIALS_PASS"));
    }

    public final MachineDescriptor j() {
        y70.a aVar = this.f13891c;
        String string = aVar.getString("CONNECTION_JOURNEY_MACHINE_TYPE");
        String string2 = aVar.getString("CONNECTION_JOURNEY_MACHINE_VARIANT");
        String string3 = aVar.getString("CONNECTION_JOURNEY_MACHINE_MODEL");
        String string4 = aVar.getString("CONNECTION_JOURNEY_MACHINE_CONNECTION_CATEGORY");
        String string5 = aVar.getString("CONNECTION_JOURNEY_MACHINE_CATEGORY");
        String string6 = aVar.getString("CONNECTION_JOURNEY_PRODUCT_NAME");
        MachineCategory.Companion.getClass();
        MachineCategory a13 = MachineCategory.a.a(string5);
        if (string == null) {
            string = MachineType.MACHINE_UNKNOWN.getTypeName();
        }
        String str = string;
        if (string2 == null) {
            string2 = i.NO_VARIANT.getValue();
        }
        String str2 = string2;
        String str3 = string3 == null ? "" : string3;
        String str4 = string6 == null ? "" : string6;
        if (a13 == null) {
            a13 = MachineCategory.EC;
        }
        MachineConnectionCategory.Companion.getClass();
        return new MachineDescriptor(str, str2, str3, MachineConnectionCategory.a.a(string4), a13, str4);
    }

    public final String k() {
        return this.f13891c.getString("CONNECTION_JOURNEY_MACHINE_MQTT_ROOT_TOPIC_LEVEL");
    }

    public final Map<String, String> l() {
        Object bVar;
        String string = this.f13891c.getString("CONNECTION_JOURNEY_SAVED_WIFI_PASSWORDS");
        if (string == null || string.length() == 0) {
            i12.f0 f0Var = i12.f0.d;
            f0Var.getClass();
            return f0Var;
        }
        Gson gson = this.f13890b;
        try {
            int i13 = h12.q.e;
            bVar = gson.fromJson(string, new b().getType());
        } catch (Throwable th2) {
            int i14 = h12.q.e;
            bVar = new q.b(th2);
        }
        if (bVar instanceof q.b) {
            bVar = null;
        }
        Map<String, String> map = (Map) bVar;
        if (map == null) {
            i12.f0 f0Var2 = i12.f0.d;
            f0Var2.getClass();
            return f0Var2;
        }
        return map;
    }

    public final c50.c m() {
        y70.a aVar = this.f13891c;
        return new c50.c(aVar.getString("CONNECTION_JOURNEY_WIFI_CREDENTIALS_SSID"), aVar.getString("CONNECTION_JOURNEY_WIFI_CREDENTIALS_PASS"));
    }

    public final int n() {
        String string = this.f13891c.getString("CONNECTION_JOURNEY_WIFI_SECURITY");
        if (string == null || string.length() == 0) {
            return 4;
        }
        return Integer.parseInt(string);
    }

    public final boolean o() {
        return j.a(j()) == h.GATT;
    }

    public final boolean p() {
        try {
            return Boolean.parseBoolean(this.f13891c.getString("CONNECTION_JOURNEY_SUBSEQUENT_JOURNEY"));
        } catch (Exception unused) {
            return false;
        }
    }

    public final void q(String str) {
        Logger.a("Connection Journey Status Stored ".concat(str));
        this.f13891c.putString("ConnectionJourneyServiceStatus-key", str);
    }

    public final void r(MachineCategory machineCategory) {
        machineCategory.getClass();
        ((uf0.q) this.f13889a.a()).b(machineCategory);
        this.f13891c.putString("CONNECTION_JOURNEY_MACHINE_CATEGORY", machineCategory.getShortName());
    }

    public final void s(c50.c cVar) {
        cVar.getClass();
        String str = cVar.f10408a;
        str.getClass();
        a.j.f52159a.getClass();
        ((uf0.q) this.f13889a.a()).a(a.j.d, str);
        String str2 = cVar.f10408a;
        y70.a aVar = this.f13891c;
        aVar.putString("CONNECTION_JOURNEY_MACHINE_CREDENTIALS_SERIAL", str2);
        aVar.putString("CONNECTION_JOURNEY_MACHINE_CREDENTIALS_PASS", cVar.f10409b);
    }

    public final void t(MachineDescriptor machineDescriptor) {
        uf0.q qVar = (uf0.q) this.f13889a.a();
        if (r.c(machineDescriptor.getMachineVariant(), i.NO_VARIANT.getValue())) {
            a.j.f52159a.getClass();
            qVar.a(a.j.f52161c, machineDescriptor.getMachineType());
        } else {
            a.j.f52159a.getClass();
            qVar.a(a.j.f52161c, machineDescriptor.getMachineVariant());
        }
        String machineType = machineDescriptor.getMachineType();
        y70.a aVar = this.f13891c;
        aVar.putString("CONNECTION_JOURNEY_MACHINE_TYPE", machineType);
        aVar.putString("CONNECTION_JOURNEY_MACHINE_VARIANT", machineDescriptor.getMachineVariant());
        aVar.putString("CONNECTION_JOURNEY_MACHINE_MODEL", machineDescriptor.getModel());
        aVar.putString("CONNECTION_JOURNEY_PRODUCT_NAME", machineDescriptor.getProductName());
        MachineConnectionCategory machineConnectionCategory = machineDescriptor.getMachineConnectionCategory();
        if (machineConnectionCategory != null) {
            aVar.putString("CONNECTION_JOURNEY_MACHINE_CONNECTION_CATEGORY", machineConnectionCategory.getValue());
        }
        r(machineDescriptor.getMachineCategory());
    }

    public final void u(String str, MachineCategory machineCategory) {
        if (str != null) {
            a.j.f52159a.getClass();
            ((uf0.q) this.f13889a.a()).a(a.j.f52161c, str);
            this.f13891c.putString("CONNECTION_JOURNEY_MACHINE_TYPE", str);
        }
        if (machineCategory != null) {
            r(machineCategory);
        }
    }

    public final void v(c50.c cVar) {
        cVar.getClass();
        String str = cVar.f10408a;
        y70.a aVar = this.f13891c;
        aVar.putString("CONNECTION_JOURNEY_WIFI_CREDENTIALS_SSID", str);
        aVar.putString("CONNECTION_JOURNEY_WIFI_CREDENTIALS_PASS", cVar.f10409b);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010%\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore$a;", "", "<init>", "()V", "", "CONNECTION_JOURNEY_WIFI", "Ljava/lang/String;", "CONNECTION_JOURNEY_SERVICE_STATUS", "CONNECTION_JOURNEY_BLE_SCAN_RECORD", "CONNECTION_JOURNEY_RESULT", "CONNECTION_JOURNEY_BLE_MANUAL_CODE", "CONNECTION_JOURNEY_WEB_REGISTERED_MACHINE_SCAN_CODE", "CONNECTION_JOURNEY_LEC_PROVISION_TOKEN", "CONNECTION_JOURNEY_WIFI_CREDENTIALS_SSID", "CONNECTION_JOURNEY_WIFI_CREDENTIALS_PASS", "CONNECTION_JOURNEY_MACHINE_AP_CREDENTIALS_SSID", "CONNECTION_JOURNEY_MACHINE_AP_CREDENTIALS_PASS", "CONNECTION_JOURNEY_MACHINE_CREDENTIALS_SERIAL", "CONNECTION_JOURNEY_MACHINE_CREDENTIALS_PASS", "CONNECTION_JOURNEY_MACHINE_TYPE", "CONNECTION_JOURNEY_MACHINE_VARIANT", "CONNECTION_JOURNEY_MACHINE_MODEL", "CONNECTION_JOURNEY_MACHINE_MQTT_ROOT_TOPIC_LEVEL", "CONNECTION_JOURNEY_MACHINE_CATEGORY", "CONNECTION_JOURNEY_MACHINE_CONNECTION_CATEGORY", "CONNECTION_JOURNEY_PRODUCT_NAME", "CONNECTION_JOURNEY_MDNS_SCAN_RECORD", "CONNECTION_JOURNEY_ROBOT_IP", "CONNECTION_JOURNEY_WIFI_SECURITY", "CONNECTION_JOURNEY_SUBSEQUENT_JOURNEY", "CONNECTION_JOURNEY_PROGRESS", "CONNECTION_JOURNEY_WIFI_RSSI", "CONNECTION_JOURNEY_WIFI_SALT", "CONNECTION_JOURNEY_SAVED_WIFI_PASSWORDS", "CONNECTION_JOURNEY_PENDING_WIFI_PASSWORD_SSID", "CONNECTION_JOURNEY_PENDING_WIFI_PASSWORD", "", "UNAVAILABLE_RSSI", "I", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
