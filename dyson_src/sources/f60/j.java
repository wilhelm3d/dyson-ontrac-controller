package f60;

import b0.y1;
import com.brightcove.player.event.EventType;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.eclipse.paho.client.mqttv3.MqttTopic;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087D¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\nR\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, d2 = {"Lf60/j;", "Lnn0/a;", "", "mqttRootTopicLevel", "serial", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "h", "Ljava/lang/String;", "getProtocol", "()Ljava/lang/String;", "protocol", "i", "getRecoveryPackageVersion", "e", "(Ljava/lang/String;)V", "recoveryPackageVersion", "j", "getSerialNumber", "serialNumber", "k", "getResetSource", "resetSource", "l", "getVersion", "f", EventType.VERSION, "a", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j extends nn0.a {

    /* renamed from: f  reason: collision with root package name */
    public final transient String f29972f;

    /* renamed from: g  reason: collision with root package name */
    public final transient String f29973g;
    @SerializedName("protocol")

    /* renamed from: h  reason: collision with root package name */
    private final String f29974h;
    @SerializedName("recovery package version")

    /* renamed from: i  reason: collision with root package name */
    private String f29975i;
    @SerializedName("serialNumber")

    /* renamed from: j  reason: collision with root package name */
    private final String f29976j;
    @SerializedName("reset-source")

    /* renamed from: k  reason: collision with root package name */
    private final String f29977k;
    @SerializedName(EventType.VERSION)

    /* renamed from: l  reason: collision with root package name */
    private String f29978l;

    /* renamed from: m  reason: collision with root package name */
    public final String f29979m;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, String str2) {
        super("HELLO", null, 2, null);
        str.getClass();
        str2.getClass();
        this.f29972f = str;
        this.f29973g = str2;
        this.f29974h = "1.0.0";
        this.f29975i = "";
        this.f29976j = str2;
        this.f29977k = "";
        this.f29978l = "";
        this.f29979m = ma.e.j(str, MqttTopic.TOPIC_LEVEL_SEPARATOR, str2, "/status/connection");
    }

    @Override // in0.k
    public final String c() {
        return this.f29979m;
    }

    public final void e(String str) {
        this.f29975i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return x12.r.c(this.f29972f, jVar.f29972f) && x12.r.c(this.f29973g, jVar.f29973g);
        }
        return false;
    }

    public final void f(String str) {
        this.f29978l = str;
    }

    public final int hashCode() {
        return this.f29973g.hashCode() + (this.f29972f.hashCode() * 31);
    }

    public final String toString() {
        return y1.j("AwsHello(mqttRootTopicLevel=", this.f29972f, ", serial=", this.f29973g, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf60/j$a;", "", "<init>", "()V", "", "MESSAGE", "Ljava/lang/String;", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
