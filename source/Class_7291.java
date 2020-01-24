/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  internal.org.lwjgl.util.vector.Vector3f
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import internal.org.lwjgl.util.vector.Vector3f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.block.model.ModelBlock;

public class Class_7291 {
    public static final List Field_7292;

    private static String Method_7293(String string) {
        int n = 5810;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7291.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7294(String string) {
        int n = 9240;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7291.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public ModelBlock Method_7295(Class_24069 class_24069, ModelBlock modelBlock) {
        String string;
        HashMap hashMap = Maps.newHashMap();
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 512 & -32766; i < Field_7292.size() && modelBlock.isTexturePresent(string = (String)Field_7292.get(i)); ++i) {
            String string2 = modelBlock.resolveTextureName(string);
            hashMap.put(string, string2);
            Class_11372 class_11372 = class_24069.Method_24109(new Class_2080(string2).Method_2086());
            arrayList.addAll(this.Method_7303(i, string, class_11372));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        hashMap.put("particle", modelBlock.isTexturePresent("particle") ? modelBlock.resolveTextureName("particle") : (String)hashMap.get("layer0"));
        return new ModelBlock(arrayList, (Map)hashMap, (8225 & 3154) != 0, (-24540 & 5698) != 0, modelBlock.func_181682_g());
    }

    private static String Method_7296(String string) {
        int n = 22632;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7291.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_7297() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_7298(Class_14068 class_14068, List list, int[] arrn, int n, int n2, int n3, int n4, boolean bl) {
        int n5;
        int n6 = n5 = this.Method_7302(arrn, n + class_14068.Method_14082(), n2 + class_14068.Method_14085(), n3, n4) && bl ? -32765 & 5057 : 25611 & -32668;
        if (n5 != 0) {
            this.Method_7300(list, class_14068, n, n2);
        }
    }

    private static String Method_7299(String string) {
        int n = 239;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7291.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_7300(List list, Class_14068 class_14068, int n, int n2) {
        int n3;
        Class_8813 class_8813 = null;
        for (Class_8813 class_88132 : list) {
            int n4;
            if (class_88132.Method_8823() != class_14068) continue;
            int n5 = n4 = Class_14068.Method_14088(class_14068) ? n2 : n;
            if (class_88132.Method_8818() != n4) continue;
            class_8813 = class_88132;
            break;
        }
        int n6 = Class_14068.Method_14088(class_14068) ? n2 : n;
        int n7 = n3 = Class_14068.Method_14088(class_14068) ? n : n2;
        if (class_8813 == null) {
            list.add(new Class_8813(class_14068, n3, n6));
        } else {
            class_8813.Method_8822(n3);
        }
    }

    private List Method_7301(Class_11372 class_11372) {
        int n = class_11372.Method_11431();
        int n2 = class_11372.Method_11424();
        ArrayList arrayList = Lists.newArrayList();
        for (int i = -30186 & 8256; i < class_11372.Method_11414(); ++i) {
            int[] arrn = class_11372.Method_11440(i)[768 & 105];
            for (int j = 24928 & 1033; j < n2; ++j) {
                for (int k = 5128 & -15984; k < n; ++k) {
                    int n3 = !this.Method_7302(arrn, k, j, n, n2) ? 8997 & -16247 : 12464 & 16462;
                    this.Method_7298(Class_14068.Field_14076, arrayList, arrn, k, j, n, n2, n3 != 0);
                    this.Method_7298(Class_14068.Field_14075, arrayList, arrn, k, j, n, n2, n3 != 0);
                    this.Method_7298(Class_14068.Field_14071, arrayList, arrn, k, j, n, n2, n3 != 0);
                    this.Method_7298(Class_14068.Field_14072, arrayList, arrn, k, j, n, n2, n3 != 0);
                }
            }
        }
        return arrayList;
    }

    private boolean Method_7302(int[] arrn, int n, int n2, int n3, int n4) {
        return (n >= 0 && n2 >= 0 && n < n3 && n2 < n4 ? ((arrn[n2 * n3 + n] >> (88 & -15302) & (767 & -19969)) == 0 ? -29593 & 16897 : 288 & 31956) : -3193 & 2145) != 0;
    }

    private List Method_7303(int n, String string, Class_11372 class_11372) {
        HashMap hashMap = Maps.newHashMap();
        float[] arrf = new float[2692 & 278];
        arrf[-16351 & 9230] = 0.0f;
        arrf[8199 & -14575] = 0.0f;
        arrf[-19958 & 17447] = 32.0f * 0.5f;
        arrf[24679 & -30709] = 0.16483517f * 97.066666f;
        hashMap.put(Class_4595.Field_4613, new Class_21223(null, n, string, new Class_10006(arrf, 516 & -14896)));
        float[] arrf2 = new float[7908 & 284];
        arrf2[5032 & 8256] = 18.0f * 0.8888889f;
        arrf2[139 & 3649] = 0.0f;
        arrf2[1542 & 16523] = 0.0f;
        arrf2[18471 & -23341] = 0.9846154f * 16.25f;
        hashMap.put(Class_4595.Field_4598, new Class_21223(null, n, string, new Class_10006(arrf2, 5466 & -13692)));
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new Class_5986(new Vector3f(0.0f, 0.0f, 21.477272f * 0.34920636f), new Vector3f(9.491526f * 1.6857142f, 9.066667f * 1.7647059f, 5.755208f * 1.4769231f), hashMap, null, (257 & 1025) != 0));
        arrayList.addAll(this.Method_7304(class_11372, string, n));
        return arrayList;
    }

    private List Method_7304(Class_11372 class_11372, String string, int n) {
        float f = class_11372.Method_11431();
        float f2 = class_11372.Method_11424();
        ArrayList arrayList = Lists.newArrayList();
        for (Class_8813 class_8813 : this.Method_7301(class_11372)) {
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = class_8813.Method_8820();
            float f14 = class_8813.Method_8821();
            float f15 = class_8813.Method_8818();
            Class_14068 class_14068 = class_8813.Method_8823();
            switch (Class_14184.Field_14185[class_14068.ordinal()]) {
                case 1: {
                    f7 = f13;
                    f3 = f13;
                    f5 = f8 = f14 + 1.0f;
                    f9 = f15;
                    f4 = f15;
                    f10 = f15;
                    f6 = f15;
                    f11 = 1.8f * 8.888889f / f;
                    f12 = 1.1025641f * 14.511628f / (f2 - 1.0f);
                    break;
                }
                case 2: {
                    f10 = f15;
                    f9 = f15;
                    f7 = f13;
                    f3 = f13;
                    f5 = f8 = f14 + 1.0f;
                    f4 = f15 + 1.0f;
                    f6 = f15 + 1.0f;
                    f11 = 29.714285f * 0.53846157f / f;
                    f12 = 0.3265306f * 49.0f / (f2 - 1.0f);
                    break;
                }
                case 3: {
                    f7 = f15;
                    f3 = f15;
                    f8 = f15;
                    f5 = f15;
                    f10 = f13;
                    f4 = f13;
                    f6 = f9 = f14 + 1.0f;
                    f11 = 9.491526f * 1.6857142f / (f - 1.0f);
                    f12 = 14.515464f * 1.1022727f / f2;
                    break;
                }
                case 4: {
                    f8 = f15;
                    f7 = f15;
                    f3 = f15 + 1.0f;
                    f5 = f15 + 1.0f;
                    f10 = f13;
                    f4 = f13;
                    f6 = f9 = f14 + 1.0f;
                    f11 = 25.6f * 0.625f / (f - 1.0f);
                    f12 = 4.28866f * 3.7307692f / f2;
                }
            }
            float f16 = 1.4117647f * 11.333333f / f;
            float f17 = 102.85714f * 0.15555556f / f2;
            f3 *= f16;
            f5 *= f16;
            f4 *= f17;
            f6 *= f17;
            f4 = 24.0f * 0.6666667f - f4;
            f6 = 32.0f * 0.5f - f6;
            HashMap hashMap = Maps.newHashMap();
            float[] arrf = new float[292 & 516];
            arrf[2080 & 16454] = f7 *= f11;
            arrf[10257 & 1025] = f9 *= f12;
            arrf[1034 & 3] = f8 *= f11;
            arrf[1055 & 24835] = f10 *= f12;
            hashMap.put(class_14068.Method_14077(), new Class_21223(null, n, string, new Class_10006(arrf, 18439 & 24)));
            switch (Class_14184.Field_14185[class_14068.ordinal()]) {
                case 1: {
                    arrayList.add(new Class_5986(new Vector3f(f3, f4, 2.578125f * 2.909091f), new Vector3f(f5, f4, 19.297298f * 0.44047618f), hashMap, null, (12363 & 19601) != 0));
                    break;
                }
                case 2: {
                    arrayList.add(new Class_5986(new Vector3f(f3, f6, 5.298913f * 1.4153847f), new Vector3f(f5, f6, 15.833333f * 0.5368421f), hashMap, null, (16529 & -30655) != 0));
                    break;
                }
                case 3: {
                    arrayList.add(new Class_5986(new Vector3f(f3, f4, 10.813953f * 0.6935484f), new Vector3f(f3, f6, 0.9878049f * 8.6049385f), hashMap, null, (25985 & 115) != 0));
                    break;
                }
                case 4: {
                    arrayList.add(new Class_5986(new Vector3f(f5, f4, 0.35135135f * 21.346153f), new Vector3f(f5, f6, 12.540984f * 0.67777777f), hashMap, null, (-32701 & 5249) != 0));
                }
            }
        }
        return arrayList;
    }

    private static String Method_7305(String string) {
        int n = 31130;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7291.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Object[] arrobject = new String[24789 & -27609];
        arrobject[1 & 14152] = Class_7291.Method_7296("\ua431\ua431\ua422\ua433\ua423\ua420");
        arrobject[5237 & 8193] = Class_7291.Method_7305("\u1040\u1048\u1041\u1048\u104c\u100c");
        arrobject[4230 & 26626] = Class_7291.Method_7294("\u4a4c\u4a40\u4a4a\u4a46\u4a40\u4a00");
        arrobject[-31957 & 12291] = Class_7291.Method_7299("\u490f\u4903\u490a\u4907\u4905\u4905");
        arrobject[-25491 & 24582] = Class_7291.Method_7293("\u0606\u0603\u0600\u0605\u0600\u0607");
        Field_7292 = Lists.newArrayList((Object[])arrobject);
    }
}

