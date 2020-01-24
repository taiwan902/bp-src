/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.UUID;

public class Class_23991
extends Class_11681 {
    private final Class_43553 Field_23992 = new Class_43553(25728 & 2372, 25094 & 5440, -15928 & 5218, 16930 & -31456);
    public static Class_23991 Field_23993;
    private static final Class_2080 Field_23994;
    private static final Class_2080 Field_23995;
    private final Class_43553 Field_23996 = new Class_46765();
    private static final Class_2080 Field_23997;
    private static final Class_2080 Field_23998;

    static {
        Field_23994 = new Class_2080(Class_23991.Method_24007("!1+\"  2#p93*0(\"s0)\"* 0**`9\"+!);#\u0019X\u0003\u001a\u0010"));
        Field_23995 = new Class_2080(Class_23991.Method_24000("\u4800\u4800\u480e\u4803\u4805\u4803\u4807\u4800\u480b\u4800\u4808\u4803\u4809\u4805\u480b\u480c\u4817\u481e\u4813\u481b\u4815\u4815\u481d\u481d\u481b\u4812\u481f\u4813\u4818\u4814\u4810\u483c\u4827\u482e\u4823\u482b\u4825\u4825\u482d\u482d\u482a\u4825\u4828\u4820"));
        Field_23997 = new Class_2080(Class_23991.Method_24003("jz`hjhxj8rz`zbh:p``jbj\"rhjbhb(pjX"));
        Field_23998 = new Class_2080(Class_23991.Method_24001("\u1497\u1486\u149b\u1497\u1496\u1491\u1486\u1490\u148c\u1486\u148d\u1497\u148a\u1497\u149a\u148c\u1490\u1481\u1496\u1496\u1483\u1496\u1481\u149c\u1490\u1481\u1496\u1496\u1483\u1496\u1481\u149d\u14b3\u14ad\u14a4"));
    }

    public void Method_23999(Class_4879 class_4879, double d, double d2, double d3, float f, int n) {
        this.Method_24002((Class_37700)class_4879, d, d2, d3, f, n);
    }

    private static String Method_24000(String string) {
        int n = 30085;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23991.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24001(String string) {
        int n = 1709;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23991.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24002(Class_37700 class_37700, double d, double d2, double d3, float f, int n) {
        Class_4595 class_4595 = Class_4595.Method_4637(class_37700.\u0000, `() & (7 & -14009));
        this.Method_24005((float)d, (float)d2, (float)d3, class_4595, (float)(class_37700.Method_37715() * (-20100 & 18283)) / (9.16854f * 1.745098f), class_37700.Method_37710(), class_37700.Method_37708(), n);
    }

    private static String Method_24003(String string) {
        int n = 26356;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23991.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_24004() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_24005(float f, float f2, float f3, Class_4595 class_4595, float f4, int n, GameProfile gameProfile, int n2) {
        Class_43553 class_43553 = this.Field_23992;
        if (n2 >= 0) {
            this.\u0000strictfp(\u0000strictfp[n2]);
            Class_16867.Method_16934(14098 & -24818);
            Class_16867.Method_16961();
            Class_16867.Method_16973(1.7619047f * 2.2702703f, 2.0f, 1.0f);
            Class_16867.Method_16943(33.0f * 0.0018939395f, 0.022988506f * 2.71875f, 0.29375f * 0.21276596f);
            Class_16867.Method_16934(22306 & 8080);
        } else {
            switch (n) {
                default: {
                    this.\u0000strictfp(Field_23994);
                    break;
                }
                case 1: {
                    this.\u0000strictfp(Field_23995);
                    break;
                }
                case 2: {
                    this.\u0000strictfp(Field_23997);
                    class_43553 = this.Field_23996;
                    break;
                }
                case 3: {
                    class_43553 = this.Field_23996;
                    Class_2080 class_2080 = Class_13490.Method_13493();
                    if (gameProfile != null) {
                        Class_18 class_18 = Class_18.Field_89;
                        Map map = class_18.Method_239().Method_16247(gameProfile);
                        if (map.containsKey((Object)MinecraftProfileTexture.Type.SKIN)) {
                            class_2080 = class_18.Method_239().Method_16248((MinecraftProfileTexture)map.get((Object)MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
                        } else {
                            UUID uUID = Class_626.Method_851(gameProfile);
                            class_2080 = Class_13490.Method_13499(uUID);
                        }
                    }
                    this.\u0000strictfp(class_2080);
                    break;
                }
                case 4: {
                    this.\u0000strictfp(Field_23998);
                }
            }
        }
        Class_16867.Method_16961();
        Class_16867.Method_16969();
        if (class_4595 != Class_4595.Field_4601) {
            switch (Class_6259.Field_6260[class_4595.ordinal()]) {
                case 1: {
                    Class_16867.Method_16943(f + 29.5f * 0.016949153f, f2 + 0.21376811f * 1.1694915f, f3 + 0.54f * 1.3703704f);
                    break;
                }
                case 2: {
                    Class_16867.Method_16943(f + 0.2972973f * 1.6818181f, f2 + 0.28260872f * 0.88461536f, f3 + 0.9599999f * 0.27083334f);
                    f4 = 14.4f * 12.5f;
                    break;
                }
                case 3: {
                    Class_16867.Method_16943(f + 2.6363637f * 0.28068966f, f2 + 0.33173078f * 0.7536232f, f3 + 0.40298507f * 1.2407408f);
                    f4 = 1.7192982f * 157.04082f;
                    break;
                }
                default: {
                    Class_16867.Method_16943(f + 0.2268085f * 1.1463414f, f2 + 0.16554055f * 1.5102041f, f3 + 0.15151516f * 3.3f);
                    f4 = 240.0f * 0.375f;
                    break;
                }
            }
        } else {
            Class_16867.Method_16943(f + 3.3461537f * 0.1494253f, f2, f3 + 1.0175439f * 0.4913793f);
        }
        float f5 = 0.01607143f * 3.8888888f;
        Class_16867.Method_16957();
        Class_16867.Method_16973(0.54545456f * -1.8333333f, -1.1666666f * 0.85714287f, 1.0f);
        Class_16867.Method_16913();
        class_43553.Method_33794(null, 0.0f, 0.0f, 0.0f, f4, 0.0f, f5);
        Class_16867.Method_16945();
        if (n2 >= 0) {
            Class_16867.Method_16934(5890 & -26870);
            Class_16867.Method_16945();
            Class_16867.Method_16934(22402 & -24748);
        }
    }

    public void Method_24006(Class_26692 class_26692) {
        super.Method_11697(class_26692);
        Field_23993 = this;
    }

    private static String Method_24007(String string) {
        int n = 26163;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23991.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

