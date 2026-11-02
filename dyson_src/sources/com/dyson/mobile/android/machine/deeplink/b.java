package com.dyson.mobile.android.machine.deeplink;

import com.dyson.mobile.android.dynamiccontent.deeplinks.DynamicContentDeepLink;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machine.deeplink.DeeplinkAction;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import h80.c;
import kotlin.Metadata;
import ma.e;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/b;", "", "Lh80/c;", "dynamicContentDeeplinkParser", "Lp71/a;", "resolveUrlProvider", "Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "machineDefinition", "<init>", "(Lh80/c;Lp71/a;Lcom/dyson/mobile/android/machinetype/MachineDefinition;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f15087a;

    /* renamed from: b  reason: collision with root package name */
    public final p71.a f15088b;

    /* renamed from: c  reason: collision with root package name */
    public final MachineDefinition f15089c;

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15090a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f15091b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f15092c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[DynamicContentDeepLink.d.a.values().length];
            try {
                iArr[DynamicContentDeepLink.d.a.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DynamicContentDeepLink.d.a.UNVERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15090a = iArr;
            int[] iArr2 = new int[DynamicContentDeepLink.c.a.values().length];
            try {
                iArr2[DynamicContentDeepLink.c.a.NOT_GENUINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f15091b = iArr2;
            int[] iArr3 = new int[DynamicContentDeepLink.y.a.values().length];
            try {
                iArr3[DynamicContentDeepLink.y.a.BLUETOOTH_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[DynamicContentDeepLink.y.a.LOCATION_PERMISSION_NOT_GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[DynamicContentDeepLink.y.a.NEARBY_DEVICE_PERMISSION_NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[DynamicContentDeepLink.y.a.MACHINE_NOT_CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[DynamicContentDeepLink.y.a.WIFI_UNAVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f15092c = iArr3;
            int[] iArr4 = new int[DynamicContentDeepLink.x.a.values().length];
            try {
                iArr4[DynamicContentDeepLink.x.a.DOWNLOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[DynamicContentDeepLink.x.a.READY_TO_INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[DynamicContentDeepLink.x.a.INSTALLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[DynamicContentDeepLink.x.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            d = iArr4;
            int[] iArr5 = new int[DynamicContentDeepLink.v.a.values().length];
            try {
                iArr5[DynamicContentDeepLink.v.a.BLOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[DynamicContentDeepLink.v.a.DIRTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[DynamicContentDeepLink.v.a.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            e = iArr5;
        }
    }

    public b(c cVar, p71.a aVar, MachineDefinition machineDefinition) {
        cVar.getClass();
        aVar.getClass();
        machineDefinition.getClass();
        this.f15087a = cVar;
        this.f15088b = aVar;
        this.f15089c = machineDefinition;
    }

    public final DeeplinkAction a(String str, String str2) {
        str.getClass();
        DynamicContentDeepLink a13 = this.f15087a.a(str);
        if (a13 != null) {
            if (a13 instanceof DynamicContentDeepLink.g) {
                MachineDefinition machineDefinition = this.f15089c;
                String str3 = machineDefinition.d.d;
                MachineDescriptor machineDescriptor = machineDefinition.f15569q;
                if (str2 == null) {
                    str2 = ((DynamicContentDeepLink.g) a13).f14036a;
                }
                return new DeeplinkAction.OpenErrorSupportScreen(str3, machineDescriptor, str2);
            } else if (a13 instanceof DynamicContentDeepLink.m0) {
                DynamicContentDeepLink.m0 m0Var = (DynamicContentDeepLink.m0) a13;
                return new DeeplinkAction.OpenResolveContentUrl(this.f15088b.a(m0Var.f14047a, m0Var.f14048b));
            } else if (a13 instanceof DynamicContentDeepLink.t) {
                return new DeeplinkAction.OpenAiChatBot(null, null, 3, null);
            } else {
                if (a13 instanceof DynamicContentDeepLink.z) {
                    DynamicContentDeepLink.z zVar = (DynamicContentDeepLink.z) a13;
                    return new DeeplinkAction.OpenAiChatBot(zVar.f14069a, zVar.f14070b);
                } else if (a13 instanceof DynamicContentDeepLink.r) {
                    DynamicContentDeepLink.r rVar = (DynamicContentDeepLink.r) a13;
                    return new DeeplinkAction.OpenExpertContentItem(rVar.f14057a, rVar.f14058b, rVar.f14059c);
                } else if (a13 instanceof DynamicContentDeepLink.q) {
                    DynamicContentDeepLink.q qVar = (DynamicContentDeepLink.q) a13;
                    return new DeeplinkAction.OpenExpertContentCollection(qVar.f14055a, qVar.f14056b);
                } else if (a13 instanceof DynamicContentDeepLink.e0) {
                    DynamicContentDeepLink.e0 e0Var = (DynamicContentDeepLink.e0) a13;
                    return new DeeplinkAction.OpenProductInformation(e0Var.f14030a, e0Var.f14031b);
                } else if (a13 instanceof DynamicContentDeepLink.d) {
                    DynamicContentDeepLink.d dVar = (DynamicContentDeepLink.d) a13;
                    String str4 = dVar.f14027a;
                    int i13 = a.f15090a[dVar.f14028b.ordinal()];
                    if (i13 != 1) {
                        if (i13 == 2) {
                            return new DeeplinkAction.OpenBrushHeadUnverifiedScreen(str4);
                        }
                        e.o();
                        return null;
                    }
                    return new DeeplinkAction.OpenBrushHeadStatusInfo(str4);
                } else if (a13 instanceof DynamicContentDeepLink.k) {
                    return new DeeplinkAction.OpenECFilterManagementScreen(((DynamicContentDeepLink.k) a13).f14042a);
                } else {
                    if (a13 instanceof DynamicContentDeepLink.p) {
                        return new DeeplinkAction.OpenECUlComplianceBottomSheet(((DynamicContentDeepLink.p) a13).f14053a);
                    }
                    if (a13 instanceof DynamicContentDeepLink.n) {
                        return new DeeplinkAction.OpenECSensorInitializingBottomSheet(((DynamicContentDeepLink.n) a13).f14049a);
                    }
                    if (a13 instanceof DynamicContentDeepLink.l) {
                        return new DeeplinkAction.OpenECFirmwareUpdateAvailableBottomSheet(((DynamicContentDeepLink.l) a13).f14044a);
                    }
                    if (a13 instanceof DynamicContentDeepLink.c) {
                        DynamicContentDeepLink.c cVar = (DynamicContentDeepLink.c) a13;
                        if (a.f15091b[cVar.f14025b.ordinal()] == 1) {
                            return new DeeplinkAction.OpenBatteryNonGenuineScreen(cVar.f14024a);
                        }
                        e.o();
                        return null;
                    } else if (a13 instanceof DynamicContentDeepLink.y) {
                        DynamicContentDeepLink.y yVar = (DynamicContentDeepLink.y) a13;
                        String str5 = yVar.f14067a;
                        int i14 = a.f15092c[yVar.f14068b.ordinal()];
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3) {
                                    if (i14 != 4) {
                                        if (i14 == 5) {
                                            return new DeeplinkAction.OpenWifiTroubleshootScreen(str5);
                                        }
                                        e.o();
                                        return null;
                                    }
                                    return new DeeplinkAction.MachinePrerequisites.MachineNotConnected(str5);
                                }
                                return new DeeplinkAction.MachinePrerequisites.NearbyDevicePermissionNotGranted(str5);
                            }
                            return new DeeplinkAction.MachinePrerequisites.LocationPermissionNotGranted(str5);
                        }
                        return new DeeplinkAction.MachinePrerequisites.BluetoothOff(str5);
                    } else if (a13 instanceof DynamicContentDeepLink.x) {
                        DynamicContentDeepLink.x xVar = (DynamicContentDeepLink.x) a13;
                        String str6 = xVar.f14065a;
                        int i15 = a.d[xVar.f14066b.ordinal()];
                        if (i15 != 1) {
                            if (i15 != 2) {
                                if (i15 != 3) {
                                    if (i15 == 4) {
                                        return new DeeplinkAction.MachineOta.Failed(str6);
                                    }
                                    e.o();
                                    return null;
                                }
                                return new DeeplinkAction.MachineOta.Installing(str6);
                            }
                            return new DeeplinkAction.MachineOta.ReadyToInstall(str6);
                        }
                        return new DeeplinkAction.MachineOta.Downloading(str6);
                    } else if (a13 instanceof DynamicContentDeepLink.v) {
                        DynamicContentDeepLink.v vVar = (DynamicContentDeepLink.v) a13;
                        String str7 = vVar.f14062a;
                        int i16 = a.e[vVar.f14063b.ordinal()];
                        if (i16 != 1) {
                            if (i16 != 2) {
                                if (i16 == 3) {
                                    return new DeeplinkAction.MachineFilter.Removed(str7);
                                }
                                e.o();
                                return null;
                            }
                            return new DeeplinkAction.MachineFilter.Dirty(str7);
                        }
                        return new DeeplinkAction.MachineFilter.Blocked(str7);
                    } else {
                        Logger.b("Deeplink not supported: ".concat(str), null);
                    }
                }
            }
        }
        return null;
    }
}
