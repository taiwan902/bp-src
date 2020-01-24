/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000break instanceof import " const implements 4 % 6 finally double do ] 9 float 9 implements float float true * int do static byte 3 , case goto static 4 = throw goto null + false 7 throw = false if super 8 # finally continue private import ^ ] static ^ true abstract if short
 *  \u0000switch super true char default case while 
 *  \u0000switch super true char default case while $ int 0 7 catch abstract double continue break " package volatile super super try - this void 6 & try synchronized = - char public % transient while else null protected static private transient true const false 
 *  \u0000switch super true char default case while $ int 0 7 catch abstract double continue break " package volatile super super try - this void 6 & try synchronized = - char public % transient while else null protected static private transient true const false $ goto case
 *  com.google.common.base.Charsets
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Callable;

public class Class_12251 {
    private static HashMap Field_12252 = new HashMap();

    public static void Method_12253(Class_20165 class_20165, Class_22751 class_22751) {
        Class_29733 class_29733;
        class_20165.Field_20168 = class_29733 = class_20165.Field_20181.Field_44590 == null ? null : (Class_29733)class_20165.Field_20181.Field_44590.attr(Class_10188.Field_10189).Method_34812();
        if (class_29733 != null) {
            \u0000switch super true char default case while . int 0 7 catch abstract double continue break " package volatile super super try - this void 6 & try synchronized = - char public % transient while else null protected static private transient true const false . goto case.\u0000strictfp = class_29733.Field_29743;
            class_20165.Field_20169.Field_575 = class_29733.Field_29752;
        } else {
            \u0000switch super true char default case while . int 0 7 catch abstract double continue break " package volatile super super try - this void 6 & try synchronized = - char public % transient while else null protected static private transient true const false . goto case.\u0000strictfp = 4704 & 17678;
            class_20165.Field_20169.Field_575 = 19617 & 8713;
        }
        if (class_29733 != null && class_29733.Field_29748 != null && class_29733.Field_29748.length == (2163 & 40) && class_29733.Field_29750) {
            Class_30724.Field_30731 = class_20165;
            class_20165.Field_20181.Method_44629(new Class_28799("REGISTER", "bpcef:t\u0000bpcef:u\u0000bpcef:c\u0000bpcef:e\u0000bpcef:q".getBytes()));
            Class_30724.Method_30742("h", Class_30724.Method_30746());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void Method_12254(Class_20165 class_20165) {
        HashMap hashMap = Field_12252;
        synchronized (hashMap) {
            Field_12252 = new HashMap();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Class_9924 Method_12255(String string) {
        HashMap hashMap = Field_12252;
        synchronized (hashMap) {
            return (Class_9924)Field_12252.get(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void Method_12256(Class_29094 class_29094) {
        HashMap hashMap = Field_12252;
        synchronized (hashMap) {
            for (Class_9924 class_9924 : Field_12252.values()) {
                class_9924.Method_9930(class_29094);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Class_9924 Method_12257(String string, String string2) {
        Class_9924 class_9924;
        HashMap hashMap = Field_12252;
        synchronized (hashMap) {
            class_9924 = (Class_9924)Field_12252.get(string);
            if (class_9924 == null) {
                class_9924 = new Class_9924(string, string2);
                Field_12252.put(string, class_9924);
                class_9924.Method_9928();
            }
        }
        return class_9924;
    }

    public static void Method_12258(Class_20165 class_20165, Class_32319 class_32319) {
        Class_18 class_18 = Class_18.Field_89;
        if ("MC|PrList".equals(class_32319.Method_32324())) {
            class_18.Method_221(null, new Class_24738(class_20165, class_32319.Method_32323().Method_29959()));
        } else if ("MC|SUZI_GSXR_1000_K4".equals(class_32319.Method_32324())) {
            class_18.Method_221(null, new Class_37611(class_20165, class_32319.Method_32323().Method_29959()));
        } else if ("MC|EPack".equals(class_32319.Method_32324())) {
            Class_29733 class_29733;
            Class_29733 class_297332 = class_29733 = class_20165.Field_20181.Field_44590 == null ? null : (Class_29733)class_20165.Field_20181.Field_44590.attr(Class_10188.Field_10189).Method_34812();
            if (class_29733 != null && class_29733.Field_29739) {
                long l = System.nanoTime();
                Class_22553 class_22553 = Class_16620.Method_16633();
                class_22553.Method_22584(l);
                Class_28799 class_28799 = new Class_28799("MC|EPack", new Class_29900(class_22553));
                class_20165.Method_20245(class_28799);
            }
        } else if ("MC|Cbr600F2".equals(class_32319.Method_32324())) {
            class_20165.Field_20173.Method_8590(class_32319.Method_32323().Method_29959());
        } else if ("MC|Cbr600F3".equals(class_32319.Method_32324())) {
            class_20165.Field_20173.Method_8597(new String(class_32319.Method_32323().Method_29959(), Charsets.UTF_8));
        } else if ("MC|BMW_S1000RR".equals(class_32319.Method_32324())) {
            class_20165.Field_20173.Method_8589(class_32319.Method_32323().Method_29959());
        } else if ("MC|YAMAHA_R1".equals(class_32319.Method_32324())) {
            class_20165.Field_20173.Method_8599(class_32319.Method_32323().Method_29959());
        } else if ("MC|HONDA_CBR_1000".equals(class_32319.Method_32324())) {
            class_20165.Field_20173.Method_8593(class_32319.Method_32323().Method_29959());
        } else if ("BP|ShowPingOnTab".equals(class_32319.Method_32324())) {
            String string = new String(class_32319.Method_32323().Method_29959());
            if (string.equals("true")) {
                class_20165.Field_20175 = 18721 & 7;
            } else if (string.equals("false")) {
                class_20165.Field_20175 = 5633 & 380;
            }
        } else if ("BP|UpdateBossInfo".equals(class_32319.Method_32324())) {
            if (class_20165.Field_20168 != null && class_20165.Field_20168.Field_29739) {
                try {
                    Class_30157 class_30157 = new Class_30157();
                    class_30157.Method_30176(class_32319.Method_32323());
                    Class_18.Field_89.Field_105.Method_45443().Method_37683(class_30157);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        } else if ("BP|DeleteBoundingBox".equals(class_32319.Method_32324())) {
            int n = class_32319.Method_32323().Method_29914();
            class_18.Field_72.Method_601((int)n).Field_1107 = Class_1061.Field_1117;
        } else if ("BP|Tag".equals(class_32319.Method_32324())) {
            if (class_20165.Field_20168 != null && class_20165.Field_20168.Field_29739) {
                try {
                    Class_13665 class_13665 = Class_13665.Method_13684(class_32319.Method_32323());
                    class_32319.Method_32323().Method_29972();
                    if (class_13665.Method_13676()) {
                        if (class_18 != null && class_18.Field_72 != null && class_18.Field_72.\u0000strictfp != null) {
                            for (Class_626 class_626 : class_18.Field_72.\u0000strictfp) {
                                if (!class_626.Field_682.getId().equals(class_13665.Method_13680())) continue;
                                class_626.Field_660 = class_13665;
                            }
                        }
                    } else {
                        Class_1061 class_1061 = class_18.Field_72.Method_601(class_13665.Method_13678());
                        if (class_1061 instanceof Class_626) {
                            ((Class_626)class_1061).Field_660 = class_13665;
                        }
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        } else if ("BP|NBS|S".equals(class_32319.Method_32324())) {
            class_18.Field_92.\u0000strictfp();
        } else if ("BP|NBS|P".equals(class_32319.Method_32324())) {
            class_18.Field_92.\u0000
            ();
        } else if ("BP|NBS|R".equals(class_32319.Method_32324())) {
            class_18.Field_92.\u0000= final();
        } else if ("BP|NBS|L".equals(class_32319.Method_32324())) {
            try {
                class_18.Field_92.\u0000strictfp(null);
                class_18.Field_92.\u0000strictfp(new Class_17467(new Class_27606(class_32319.Method_32323())));
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        } else if (class_32319.Method_32324().startsWith("bpcef:")) {
            Class_30724.Method_30734(class_32319, class_20165);
        } else if ("bp:binds".equals(class_32319.Method_32324())) {
            try {
                Class_14775 class_14775 = new Class_14775();
                class_14775.Method_14821(class_32319.Method_32323());
                Class_14775.Field_14780 = class_14775;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        } else if ("bp:heads".equals(class_32319.Method_32324())) {
            if (class_32319.Method_32323().Method_29992()) {
                class_20165.Field_20171 = class_32319.Method_32323().Method_29944();
            }
        } else if ("bp:ultimate".equals(class_32319.Method_32324())) {
            byte by = class_32319.Method_32323().Method_29944();
            if (by == 0) {
                Class_1378 class_1378 = class_18.Field_48;
                class_20165.Field_20174 = 24668 & -28672;
                class_1378.Field_685 = -15327 & 2705;
            }
        } else if ("bp:loadogg".equals(class_32319.Method_32324())) {
            Class_29900 class_29900 = class_32319.Method_32323();
            String string = class_29900.Method_29991(17488 & 11560);
            String string2 = class_29900.Method_29991(3634 & 1029);
            Class_9924 class_9924 = Class_12251.Method_12257(string, string2);
        }
    }

    public static void Method_12259(Class_20165 class_20165) {
        if (Class_18.Field_89.Field_48 != null) {
            Class_1378 class_1378 = Class_18.Field_89.Field_48;
            if (class_1378.Field_685) {
                Class_29900 class_29900 = new Class_29900(Class_16620.Method_16633());
                class_29900.Method_30010(class_20165.Field_20174);
                class_29900.Method_29939(class_1378.Field_702);
                class_29900.Method_29939(class_1378.Field_669);
                int n = 2048 & 13451;
                n = (byte)(n | (class_1378.Field_627 ? 8389 & -16383 : 5132 & 16481));
                n = (byte)(n | (class_1378.Field_630 ? 25114 & -28218 : -14584 & 6));
                n = (byte)(n | (class_1378.Field_664 ? 21012 & 1196 : 1416 & 0));
                class_29900.Method_29949(n);
                class_20165.Field_20181.Method_44629(new Class_28799("bp:u", class_29900));
            }
        }
    }

    private void Method_12260() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

