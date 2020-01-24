/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.properties.PropertyMap
 *  internal.org.lwjgl.opengl.ContextCapabilities
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GLContext
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  tv.twitch.ErrorCode
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.properties.PropertyMap;
import internal.org.lwjgl.opengl.ContextCapabilities;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GLContext;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tv.twitch.ErrorCode;

public class Class_17485
extends Class_1490 {
    private static final Logger Field_17486 = LogManager.getLogger();
    private final List Field_17487 = Lists.newArrayList();
    private final Class_23562 Field_17488;
    private final Class_1490 Field_17489;
    private final Class_1782 Field_17490 = new Class_2849("stream.unavailable.title", new Object[-32720 & 18564]);
    private final List Field_17491;

    public Class_17485(Class_1490 class_1490, Class_23562 class_23562) {
        this(class_1490, class_23562, null);
    }

    public void Method_17492() {
    }

    private void Method_17493() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_17494(String string) {
        try {
            Class<?> class_ = Class.forName("java.awt.Desktop");
            Object object = class_.getMethod("getDesktop", new Class[-19440 & 16707]).invoke(null, new Object[-16280 & 514]);
            Class[] arrclass = new Class[17 & 8879];
            arrclass[4640 & 1093] = URI.class;
            Object[] arrobject = new Object[12673 & -14321];
            arrobject[0 & -29726] = new URI(string);
            class_.getMethod("browse", arrclass).invoke(object, arrobject);
        }
        catch (Throwable throwable) {
            Field_17486.error("Couldn't open link", throwable);
        }
    }

    public static void Method_17495(Class_1490 class_1490) {
        Class_18 class_18 = Class_18.Field_89;
        Class_1821 class_1821 = class_18.Method_242();
        if (!Class_32876.Field_32879) {
            ArrayList arrayList = Lists.newArrayList();
            Object[] arrobject = new Object[-32231 & 24675];
            arrobject[22546 & 8200] = GL11.glGetString((int)(24530 & 7943));
            arrayList.add(new Class_2849("stream.unavailable.no_fbo.version", arrobject));
            Object[] arrobject2 = new Object[4097 & 11249];
            arrobject2[-16336 & 12932] = GLContext.getCapabilities().GL_EXT_blend_func_separate;
            arrayList.add(new Class_2849("stream.unavailable.no_fbo.blend", arrobject2));
            Object[] arrobject3 = new Object[-31709 & 129];
            arrobject3[-28670 & 16740] = GLContext.getCapabilities().GL_ARB_framebuffer_object;
            arrayList.add(new Class_2849("stream.unavailable.no_fbo.arb", arrobject3));
            Object[] arrobject4 = new Object[12369 & 16783];
            arrobject4[20792 & 8193] = GLContext.getCapabilities().GL_EXT_framebuffer_object;
            arrayList.add(new Class_2849("stream.unavailable.no_fbo.ext", arrobject4));
            class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23567, arrayList));
        } else if (class_1821 instanceof Class_39403) {
            if (((Class_39403)class_1821).Method_39410().getMessage().contains("Can't load AMD 64-bit .dll on a IA 32-bit platform")) {
                class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23565));
            } else {
                class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23569));
            }
        } else if (!class_1821.Method_1826() && class_1821.Method_1830() == ErrorCode.TTV_EC_OS_TOO_OLD) {
            switch (Class_38600.Field_38601[Class_2090.Method_2091().ordinal()]) {
                case 1: {
                    class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23564));
                    break;
                }
                case 2: {
                    class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23574));
                    break;
                }
                default: {
                    class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23576));
                    break;
                }
            }
        } else if (!class_18.Method_161().containsKey((Object)"twitch_access_token")) {
            if (class_18.Method_265().Method_2119() == Class_2121.Field_2124) {
                class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23568));
            } else {
                class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23573));
            }
        } else if (!class_1821.Method_1835()) {
            switch (Class_38600.Field_38602[class_1821.Method_1828().ordinal()]) {
                case 1: {
                    class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23575));
                    break;
                }
                default: {
                    class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23572));
                    break;
                }
            }
        } else if (class_1821.Method_1830() != null) {
            Class_2849[] arrclass_2849 = new Class_2849[129 & 20507];
            Object[] arrobject = new Object[4651 & 1425];
            arrobject[5000 & 16466] = ErrorCode.getString((ErrorCode)class_1821.Method_1830());
            arrclass_2849[-14960 & 4608] = new Class_2849("stream.unavailable.initialization_failure.extra", arrobject);
            List<Class_2849> list = Arrays.asList(arrclass_2849);
            class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23571, list));
        } else {
            class_18.Method_218(new Class_17485(class_1490, Class_23562.Field_23566));
        }
    }

    public void Method_17496(int n, int n2, float f) {
        this.\u0000, 2();
        int n3 = Math.max((int)((double)this.\u0000, ` * (0.3026315789473684 * 2.808695652173913) / (2.875 * 0.6956521739130435) - (double)((float)(this.Field_17487.size() * (-28151 & 1087)) / 2.0f)), 378 & 20662);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_17490.Method_1783(), this.\u0000= final / (18946 & 35), n3 - (1035 & 2825) * (17730 & 571), 754974719 & -2080374785);
        for (String string : this.Field_17487) {
            this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (2 & 3602), n3, 212515490 & 280012009);
            n3 += -16231 & 3083;
        }
        super.Method_1545(n, n2, f);
    }

    public Class_17485(Class_1490 class_1490, Class_23562 class_23562, List list) {
        this.Field_17489 = class_1490;
        this.Field_17488 = class_23562;
        this.Field_17491 = list;
    }

    public void Method_17497() {
        if (this.Field_17487.isEmpty()) {
            this.Field_17487.addAll(this.\u0000strictfp.Method_28733(this.Field_17488.Method_23599().Method_1783(), (int)((float)this.\u0000= final * (0.7340426f * 1.0217391f))));
            if (this.Field_17491 != null) {
                this.Field_17487.add("");
                for (Class_2849 class_2849 : this.Field_17491) {
                    this.Field_17487.add(class_2849.Method_2869());
                }
            }
        }
        if (this.Field_17488.Method_23589() != null) {
            this.\u0000strictfp.add(new Class_42376(-31600 & 2049, this.\u0000= final / (515 & 29030) - (-31589 & 21403), this.\u0000, ` - (8242 & -32141), -14121 & 13206, -31724 & 500, Class_9802.Method_9806("gui.cancel", new Object[4616 & -22396])));
            this.\u0000strictfp.add(new Class_42376(3 & 24081, this.\u0000= final / (2315 & 9286) - (4283 & -15141) + (-31584 & 162), this.\u0000, ` - (13366 & -30149), 5054 & 26839, -32492 & 3094, Class_9802.Method_9806(this.Field_17488.Method_23589().Method_1783(), new Object[-27574 & 8960])));
        } else {
            this.\u0000strictfp.add(new Class_42376(6402 & 9364, this.\u0000= final / (-27133 & 16454) - (-28465 & 16747), this.\u0000, ` - (24691 & -30670), 13022 & 1206, 5140 & 181, Class_9802.Method_9806("gui.cancel", new Object[-8168 & 1408])));
        }
    }

    protected void Method_17498(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (19521 & -32749)) {
                switch (Class_38600.Field_38603[this.Field_17488.ordinal()]) {
                    case 1: 
                    case 2: {
                        this.Method_17494("https://account.mojang.com/me/settings");
                        break;
                    }
                    case 3: {
                        this.Method_17494("https://account.mojang.com/migrate");
                        break;
                    }
                    case 4: {
                        this.Method_17494("http://www.apple.com/osx/");
                        break;
                    }
                    case 5: 
                    case 6: 
                    case 7: {
                        this.Method_17494("http://bugs.mojang.com/browse/MC");
                    }
                }
            }
            this.\u0000strictfp.Method_218(this.Field_17489);
        }
    }
}

