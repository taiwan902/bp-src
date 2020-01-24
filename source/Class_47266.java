/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47266 {
    private static String Field_47267 = Class_47266.Method_47277("\u0109\u0101\u010b");
    private static String[] Field_47268;

    public static String Method_47269() {
        Class_2094 class_2094 = Class_2090.Method_2091();
        switch (Class_15849.Field_15850[class_2094.ordinal()]) {
            case 1: {
                return "MC_OS_WINDOWS";
            }
            case 2: {
                return "MC_OS_MAC";
            }
            case 3: {
                return "MC_OS_LINUX";
            }
        }
        return "MC_OS_OTHER";
    }

    public static String[] Method_47270() {
        if (Field_47268 == null) {
            String[] arrstring = Class_19426.Method_19517();
            String[] arrstring2 = new String[arrstring.length];
            for (int i = 17560 & 4389; i < arrstring.length; ++i) {
                arrstring2[i] = Field_47267 + arrstring[i];
            }
            Field_47268 = arrstring2;
        }
        return Field_47268;
    }

    public static String Method_47271() {
        StringBuilder stringBuilder = new StringBuilder();
        Class_47266.Method_47275(stringBuilder, "MC_VERSION", Class_19426.Method_19509());
        Class_47266.Method_47279(stringBuilder, "MC_GL_VERSION " + Class_19426.Method_19553().Method_19674());
        Class_47266.Method_47279(stringBuilder, "MC_GLSL_VERSION " + Class_19426.Method_19559().Method_19674());
        Class_47266.Method_47279(stringBuilder, Class_47266.Method_47269());
        Class_47266.Method_47279(stringBuilder, Class_47266.Method_47276());
        Class_47266.Method_47279(stringBuilder, Class_47266.Method_47273());
        if (Class_12440.Field_12617 > 0) {
            Class_47266.Method_47275(stringBuilder, "MC_FXAA_LEVEL", Class_12440.Field_12617);
        }
        if (Class_12440.Field_12461) {
            Class_47266.Method_47279(stringBuilder, "MC_NORMAL_MAP");
        }
        if (Class_12440.Field_12493) {
            Class_47266.Method_47279(stringBuilder, "MC_SPECULAR_MAP");
        }
        Class_47266.Method_47272(stringBuilder, "MC_RENDER_QUALITY", Class_12440.Field_12554);
        Class_47266.Method_47272(stringBuilder, "MC_SHADOW_QUALITY", Class_12440.Field_12449);
        Class_47266.Method_47272(stringBuilder, "MC_HAND_DEPTH", Class_12440.Field_12454);
        if (Class_12440.Method_12898()) {
            Class_47266.Method_47279(stringBuilder, "MC_OLD_HAND_LIGHT");
        }
        if (Class_12440.Method_12928()) {
            Class_47266.Method_47279(stringBuilder, "MC_OLD_LIGHTING");
        }
        return stringBuilder.toString();
    }

    private static void Method_47272(StringBuilder stringBuilder, String string, float f) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(f);
        stringBuilder.append("\n");
    }

    public static String Method_47273() {
        String string = Class_19426.Field_19434;
        if (string == null) {
            return "MC_GL_RENDERER_OTHER";
        }
        return (string = string.toLowerCase()).startsWith("amd") ? "MC_GL_RENDERER_RADEON" : (string.startsWith("ati") ? "MC_GL_RENDERER_RADEON" : (string.startsWith("radeon") ? "MC_GL_RENDERER_RADEON" : (string.startsWith("gallium") ? "MC_GL_RENDERER_GALLIUM" : (string.startsWith("intel") ? "MC_GL_RENDERER_INTEL" : (string.startsWith("geforce") ? "MC_GL_RENDERER_GEFORCE" : (string.startsWith("nvidia") ? "MC_GL_RENDERER_GEFORCE" : (string.startsWith("quadro") ? "MC_GL_RENDERER_QUADRO" : (string.startsWith("nvs") ? "MC_GL_RENDERER_QUADRO" : (string.startsWith("mesa") ? "MC_GL_RENDERER_MESA" : "MC_GL_RENDERER_OTHER")))))))));
    }

    public static String Method_47274() {
        return Field_47267;
    }

    private static void Method_47275(StringBuilder stringBuilder, String string, int n) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(n);
        stringBuilder.append("\n");
    }

    public static String Method_47276() {
        String string = Class_19426.Field_19431;
        if (string == null) {
            return "MC_GL_VENDOR_OTHER";
        }
        return (string = string.toLowerCase()).startsWith("ati") ? "MC_GL_VENDOR_ATI" : (string.startsWith("intel") ? "MC_GL_VENDOR_INTEL" : (string.startsWith("nvidia") ? "MC_GL_VENDOR_NVIDIA" : (string.startsWith("x.org") ? "MC_GL_VENDOR_XORG" : "MC_GL_VENDOR_OTHER")));
    }

    private static String Method_47277(String string) {
        int n = 26302;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47266.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_47278() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static void Method_47279(StringBuilder stringBuilder, String string) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append("\n");
    }
}

