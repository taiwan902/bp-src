/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 *  internal.org.lwjgl.input.Mouse
 *  org.cef.CefApp
 *  org.cef.CefClient
 *  org.cef.CefSettings
 *  org.cef.CefSettings$LogSeverity
 *  org.cef.browser.CefBrowser
 *  org.cef.browser.CefBrowserOsr
 *  org.cef.browser.CefMessageRouter
 *  org.cef.browser.CefMessageRouter$CefMessageRouterConfig
 *  org.cef.browser.CefRenderer
 *  org.cef.callback.CefQueryCallback
 *  org.cef.handler.CefAppHandler
 *  org.cef.handler.CefContextMenuHandler
 *  org.cef.handler.CefDisplayHandler
 *  org.cef.handler.CefLoadHandler
 *  org.cef.handler.CefMessageRouterHandler
 */
import internal.org.lwjgl.input.Keyboard;
import internal.org.lwjgl.input.Mouse;
import java.awt.Component;
import java.awt.Label;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import org.cef.CefApp;
import org.cef.CefClient;
import org.cef.CefSettings;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefBrowserOsr;
import org.cef.browser.CefMessageRouter;
import org.cef.browser.CefRenderer;
import org.cef.callback.CefQueryCallback;
import org.cef.handler.CefAppHandler;
import org.cef.handler.CefContextMenuHandler;
import org.cef.handler.CefDisplayHandler;
import org.cef.handler.CefLoadHandler;
import org.cef.handler.CefMessageRouterHandler;

public class Class_30724
extends Class_1490 {
    public static final Component Field_30725 = new Label();
    private static int Field_30726;
    public static CefClient Field_30727;
    public static CefApp Field_30728;
    private static final int[] Field_30729;
    private Point Field_30730 = new Point(-1 & -1, -1 & -1);
    public static Class_20165 Field_30731;
    public static CefBrowserOsr Field_30732;
    private final Class_34018[] Field_30733 = new Class_34018[java.lang.Math.min(Mouse.getButtonCount(), Field_30729.length)];

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Method_30734(Class_32319 var0, Class_20165 var1_1) {
        if (var1_1.Field_20168 == null) return;
        if (!var1_1.Field_20168.Field_29750) {
            return;
        }
        Class_30724.Field_30731 = var1_1;
        var2_2 = var0.Method_32324().substring("bpcef:".length());
        var3_3 = Class_18.Method_231();
        var4_4 = var2_2;
        var5_5 = -1 & -1;
        switch (var4_4.hashCode()) {
            case 116: {
                if (!var4_4.equals("t")) break;
                var5_5 = 1044 & -32118;
                break;
            }
            case 117: {
                if (!var4_4.equals("u")) break;
                var5_5 = 1161 & -28655;
                break;
            }
            case 99: {
                if (!var4_4.equals("c")) break;
                var5_5 = -13498 & 8194;
                break;
            }
            case 101: {
                if (!var4_4.equals("e")) break;
                var5_5 = -32677 & 899;
                break;
            }
            case 113: {
                if (!var4_4.equals("q")) break;
                var5_5 = 11268 & 16558;
            }
        }
        switch (var5_5) {
            case 0: {
                var6_6 = Class_30724.Method_30746();
                var6_6.Method_29982(Class_23299.Method_23327());
                Class_30724.Method_30742("t", var6_6);
                return;
            }
            case 1: {
                var7_10 = Class_23299.Method_23370(var0.Method_32323().Method_29991(32767 & 32767));
                var6_7 = Class_30724.Method_30746();
                var6_7.Method_29982(var7_10);
                Class_30724.Method_30742("s", var6_7);
                return;
            }
            case 2: {
                if (var3_3.Field_36 instanceof Class_30724 == false) return;
                var3_3.Method_218(null);
                return;
            }
            case 3: {
                if (var3_3.Field_36 == null) return;
                if (var3_3.Field_36 instanceof Class_30724 == false) return;
                var6_8 = var0.Method_32323();
                var8_11 = var6_8.Method_29991(32767 & 32767);
                var9_13 = var6_8.Method_29991(-1 & 32767);
                var10_14 = var6_8.Method_30004();
                Class_30724.Field_30732.executeJavaScript(var8_11, var9_13, var10_14);
                return;
            }
            case 4: {
                var6_9 = var0.Method_32323();
                var8_12 = var6_9.Method_30019();
                var10_15 = var6_9.Method_29962();
                var11_16 = 20530 & 2048;
                if (!var10_15) {
                    var11_16 = var6_9.Method_30004();
                }
                var12_17 = var6_9.Method_29991(-1 & 32767);
                var14_18 = Class_42197.Field_42198;
                synchronized (var14_18) {
                    var13_19 = (CefQueryCallback)Class_42197.Field_42198.remove(var8_12);
                    ** if (!var10_15) goto lbl68
                }
lbl-1000: // 1 sources:
                {
                    var13_19.success(var12_17);
                    return;
                }
lbl68: // 1 sources:
                var13_19.failure(var11_16, var12_17);
                return;
            }
        }
    }

    public void Method_30735(Class_18 class_18, int n, int n2) {
        super.Method_1548(class_18, n, n2);
        Field_30732.setSize(this.\u0000strictfp.Field_80, this.\u0000strictfp.Field_44);
    }

    public Class_30724(String string) {
        for (int i = -31544 & 48; i < this.Field_30733.length; ++i) {
            int n = i + (2053 & 553);
            if (i == (8967 & 16465)) {
                ++n;
            } else if (i == (16410 & -31549)) {
                --n;
            }
            this.Field_30733[i] = new Class_34018(n, Field_30726, Field_30729[i]);
        }
        if (Field_30728 == null) {
            CefSettings cefSettings = new CefSettings();
            cefSettings.windowless_rendering_enabled = 2065 & 9475;
            cefSettings.locale = "en-US";
            cefSettings.command_line_args_disabled = 5249 & 10499;
            cefSettings.cache_path = Class_23299.Field_23304 + "\\" + "qFFcNpx0Csny0jJ2eM2I";
            cefSettings.persist_session_cookies = 6213 & 16905;
            cefSettings.log_severity = CefSettings.LogSeverity.LOGSEVERITY_DISABLE;
            CefApp.addAppHandler((CefAppHandler)new Class_24675());
            Field_30728 = CefApp.getInstance((CefSettings)cefSettings);
            Field_30727 = Field_30728.createClient();
            Field_30727.addLoadHandler((CefLoadHandler)new Class_47128());
            Field_30727.addContextMenuHandler((CefContextMenuHandler)new Class_11137());
            Field_30727.addDisplayHandler((CefDisplayHandler)new Class_36669());
            CefMessageRouter.CefMessageRouterConfig cefMessageRouterConfig = new CefMessageRouter.CefMessageRouterConfig();
            CefMessageRouter cefMessageRouter = CefMessageRouter.create((CefMessageRouter.CefMessageRouterConfig)cefMessageRouterConfig);
            cefMessageRouter.addHandler((CefMessageRouterHandler)new Class_42197(), (10369 & 335) != 0);
            Field_30727.addMessageRouter(cefMessageRouter);
            Field_30732 = (CefBrowserOsr)Field_30727.createBrowser(string, (8849 & 22593) != 0, (-9215 & 73) != 0);
        } else {
            Field_30732.loadURL(string);
        }
    }

    static {
        int[] arrn = new int[6196 & -32299];
        arrn[1682 & -20476] = 9858 & 21860;
        arrn[5807 & 16449] = 10240 & 2676;
        arrn[8198 & -32566] = 5664 & -3956;
        arrn[17979 & -22393] = 16512 & -6886;
        arrn[7173 & 8596] = 537301504 & 1392560140;
        arrn[9221 & 2061] = 67715334 & 1082237968;
        arrn[6 & 3102] = -503086391 & 8520704;
        arrn[4119 & 16711] = -2143026942 & 295040;
        arrn[520 & 18441] = 277481650 & -1593309883;
        arrn[10281 & 5259] = 22675477 & -1869496312;
        arrn[14747 & -32754] = 543831072 & -1968078012;
        arrn[6443 & -32741] = -1723564000 & 1658996673;
        arrn[10412 & 20492] = 1083783184 & -2036186972;
        arrn[20495 & 2189] = -1560280768 & 288100364;
        arrn[-29218 & 24622] = 40108213 & -973004736;
        arrn[20911 & 2079] = 110227585 & -2079849946;
        arrn[-9068 & 80] = 151266305 & -393084864;
        arrn[16405 & 2297] = 287951786 & 277885008;
        arrn[-29482 & 17170] = 880804439 & 1744847880;
        arrn[2323 & -22949] = 1175453975 & 1212220416;
        Field_30729 = arrn;
        Field_30726 = -27148 & 2550;
        try {
            Field_30726 = (Integer)Toolkit.getDefaultToolkit().getDesktopProperty(Class_30724.Method_30738("\u4883\u4895\u4894\u4886\u4883\u4893\u4880\u4890\u4883\u4881\u4884\u4881\u4885\u4885\u4885\u4882\u4896\u4887\u4892\u4896\u4887\u4882"));
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private boolean Method_30736(int n, int n2) {
        if (this.Field_30730.x != n || this.Field_30730.y != n2) {
            this.Field_30730.x = n;
            this.Field_30730.y = n2;
            return (2881 & 20497) != 0;
        }
        return (344 & -24574) != 0;
    }

    public void Method_30737(int n, int n2, float f) {
        Class_30724.Field_30732.renderer_.render(0.0, (double)this.\u0000, `, (double)this.\u0000= final, 0.0);
    }

    private static String Method_30738(String string) {
        int n = 27259;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30724.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_30739() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_30740() {
        if (Field_30728 != null) {
            Field_30728.doMessageLoopWork(139527846L & -5403858461765099432L);
        }
    }

    public void Method_30741() {
        if (Keyboard.getEventKey() == (2261 & 21001)) {
            this.\u0000strictfp.Method_218(null);
        }
        Class_31406.Method_31412();
    }

    public static void Method_30742(String string, Class_29900 class_29900) {
        if (Field_30731 == null || Class_30724.Field_30731.Field_20168 == null || !Class_30724.Field_30731.Field_20168.Field_29750) {
            return;
        }
        string = "bpcef:" + string;
        Field_30731.Method_20245(new Class_28799(string, class_29900));
    }

    public void Method_30743() {
        int n;
        long l = System.currentTimeMillis();
        int n2 = Mouse.getX();
        int n3 = this.\u0000strictfp.Field_44 - Mouse.getY() - (-32733 & 6737);
        boolean bl = this.Method_30736(n2, n3);
        int n4 = 24968 & -32239;
        int n5 = 9352 & -32462;
        int n6 = Class_31406.Method_31410();
        for (n = -31221 & 8448; n < this.Field_30733.length; ++n) {
            boolean bl2 = Mouse.isButtonDown((int)n);
            if (bl2) {
                n4 |= Field_30729[n];
            }
            n5 = this.Field_30733[n].Method_34026(n2, n3, bl, bl2, l, n6) || n5 != 0 ? -32765 & 12341 : -13935 & 9222;
        }
        if (bl && n5 == 0) {
            Field_30732.sendMouseEvent(new MouseEvent(Field_30725, n4 != 0 ? -26630 & 8698 : 8695 & 4599, l, n4 | n6, n2, n3, n4 != 0 ? 1027 & -12191 : -27647 & 24584, (-28623 & 1092) != 0));
        }
        if ((n = Mouse.getEventDWheel()) != 0) {
            Field_30732.sendMouseWheelEvent(new MouseWheelEvent(Field_30725, 17403 & -28161, l, n4 | n6, n2, n3, 1094 & 16953, (100 & 4618) != 0, 1329 & 143, 14500 & 16384, n));
        }
    }

    public void Method_30744() {
        Field_30732.loadURL("about:blank");
    }

    public boolean Method_30745() {
        return (152 & 1025) != 0;
    }

    public static Class_29900 Method_30746() {
        return new Class_29900(Class_16620.Method_16633());
    }

    public void Method_30747() {
        Field_30732.setSize(this.\u0000strictfp.Field_80, this.\u0000strictfp.Field_44);
        Keyboard.enableRepeatEvents((2163 & 1029) != 0);
        Field_30732.setFocus((22533 & 3) != 0);
    }
}

