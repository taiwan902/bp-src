/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_31916 {
    private List Field_31917 = Lists.newArrayList();
    private Class_28775 Field_31918;
    private Class_6735 Field_31919 = new Class_6735(this);
    private Class_28775 Field_31920;
    private String Field_31921 = "";

    public float[] Method_31922(float[] arrf, int n, int n2, int n3, int n4) {
        Class_10971.Method_10979();
        if (arrf == null || arrf.length < n3 * n4) {
            arrf = new float[n3 * n4];
        }
        int[] arrn = this.Field_31920.Method_28781(n, n2, n3, n4);
        for (int i = 904 & 25670; i < n3 * n4; ++i) {
            try {
                float f = (float)Class_17281.Method_17382(arrn[i], Class_17281.Field_17344).Method_17373() / (81920.0f * 0.8f);
                if (f > 1.0f) {
                    f = 1.0f;
                }
                arrf[i] = f;
                continue;
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Invalid Biome id");
                Class_13220 class_13220 = class_13268.Method_13280("DownfallBlock");
                class_13220.Method_13231("biome id", i);
                class_13220.Method_13231("downfalls[] size", arrf.length);
                class_13220.Method_13231("x", n);
                class_13220.Method_13231("z", n2);
                class_13220.Method_13231("w", n3);
                class_13220.Method_13231("h", n4);
                throw new Class_1809(class_13268);
            }
        }
        return arrf;
    }

    public List Method_31923() {
        return this.Field_31917;
    }

    public Class_31916(long l, Class_43755 class_43755, String string) {
        this();
        this.Field_31921 = string;
        Class_28775[] arrclass_28775 = Class_28775.Method_28786(l, class_43755, string);
        this.Field_31918 = arrclass_28775[64 & -30462];
        this.Field_31920 = arrclass_28775[20611 & -23003];
    }

    public Class_17281 Method_31924(Class_4751 class_4751, Class_17281 class_17281) {
        return this.Field_31919.Method_6743(class_4751.\u0000= final(), class_4751.\u0000strictfp(), class_17281);
    }

    public Class_17281 Method_31925(Class_4751 class_4751) {
        return this.Method_31924(class_4751, null);
    }

    public Class_31916(Class_283 class_283) {
        this(class_283.Method_392(), class_283.Method_386().Method_31833(), class_283.Method_386().Method_31778());
    }

    public boolean Method_31926(int n, int n2, int n3, List list) {
        Class_10971.Method_10979();
        int n4 = n - n3 >> (10 & 8230);
        int n5 = n2 - n3 >> (21911 & 2050);
        int n6 = n + n3 >> (2 & 29186);
        int n7 = n2 + n3 >> (-24302 & 1702);
        int n8 = n6 - n4 + (79 & 2097);
        int n9 = n7 - n5 + (16729 & 9347);
        int[] arrn = this.Field_31918.Method_28781(n4, n5, n8, n9);
        try {
            for (int i = -15328 & 11021; i < n8 * n9; ++i) {
                Class_17281 class_17281 = Class_17281.Method_17396(arrn[i]);
                if (list.contains(class_17281)) continue;
                return (17508 & 528) != 0;
            }
            return (13613 & -15869) != 0;
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Invalid Biome id");
            Class_13220 class_13220 = class_13268.Method_13280("Layer");
            class_13220.Method_13231("Layer", this.Field_31918.toString());
            class_13220.Method_13231("x", n);
            class_13220.Method_13231("z", n2);
            class_13220.Method_13231("radius", n3);
            class_13220.Method_13231("allowed", list);
            throw new Class_1809(class_13268);
        }
    }

    public Class_17281[] Method_31927(Class_17281[] arrclass_17281, int n, int n2, int n3, int n4, boolean bl) {
        Class_10971.Method_10979();
        if (arrclass_17281 == null || arrclass_17281.length < n3 * n4) {
            arrclass_17281 = new Class_17281[n3 * n4];
        }
        if (bl && n3 == (-32107 & 48) && n4 == (10896 & -27344) && (n & (-28529 & 18447)) == 0 && (n2 & (24623 & -26801)) == 0) {
            Class_17281[] arrclass_172812 = this.Field_31919.Method_6745(n, n2);
            System.arraycopy(arrclass_172812, 10548 & -28088, arrclass_17281, 3402 & -8192, n3 * n4);
            return arrclass_17281;
        }
        int[] arrn = this.Field_31920.Method_28781(n, n2, n3, n4);
        for (int i = -31706 & 16; i < n3 * n4; ++i) {
            arrclass_17281[i] = Class_17281.Method_17382(arrn[i], Class_17281.Field_17344);
        }
        return arrclass_17281;
    }

    public float Method_31928(float f, int n) {
        return f;
    }

    private void Method_31929() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_17281[] Method_31930(Class_17281[] arrclass_17281, int n, int n2, int n3, int n4) {
        return this.Method_31927(arrclass_17281, n, n2, n3, n4, (1041 & -32635) != 0);
    }

    public Class_17281[] Method_31931(Class_17281[] arrclass_17281, int n, int n2, int n3, int n4) {
        Class_10971.Method_10979();
        if (arrclass_17281 == null || arrclass_17281.length < n3 * n4) {
            arrclass_17281 = new Class_17281[n3 * n4];
        }
        int[] arrn = this.Field_31918.Method_28781(n, n2, n3, n4);
        try {
            for (int i = 274 & -15228; i < n3 * n4; ++i) {
                arrclass_17281[i] = Class_17281.Method_17382(arrn[i], Class_17281.Field_17344);
            }
            return arrclass_17281;
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Invalid Biome id");
            Class_13220 class_13220 = class_13268.Method_13280("RawBiomeBlock");
            class_13220.Method_13231("biomes[] size", arrclass_17281.length);
            class_13220.Method_13231("x", n);
            class_13220.Method_13231("z", n2);
            class_13220.Method_13231("w", n3);
            class_13220.Method_13231("h", n4);
            throw new Class_1809(class_13268);
        }
    }

    public void Method_31932() {
        this.Field_31919.Method_6741();
    }

    protected Class_31916() {
        this.Field_31917.add(Class_17281.Field_17351);
        this.Field_31917.add(Class_17281.Field_17318);
        this.Field_31917.add(Class_17281.Field_17332);
        this.Field_31917.add(Class_17281.Field_17285);
        this.Field_31917.add(Class_17281.Field_17294);
        this.Field_31917.add(Class_17281.Field_17335);
        this.Field_31917.add(Class_17281.Field_17289);
    }

    public Class_4751 Method_31933(int n, int n2, int n3, List list, Random random) {
        Class_10971.Method_10979();
        int n4 = n - n3 >> (770 & -14137);
        int n5 = n2 - n3 >> (5363 & -6142);
        int n6 = n + n3 >> (-24317 & 1122);
        int n7 = n2 + n3 >> (-28094 & 17722);
        int n8 = n6 - n4 + (3239 & -19967);
        int n9 = n7 - n5 + (1249 & -16359);
        int[] arrn = this.Field_31918.Method_28781(n4, n5, n8, n9);
        Class_4751 class_4751 = null;
        int n10 = 313 & 4738;
        for (int i = 8226 & 469; i < n8 * n9; ++i) {
            int n11 = n4 + i % n8 << (530 & 18638);
            int n12 = n5 + i / n8 << (-28537 & 10);
            Class_17281 class_17281 = Class_17281.Method_17396(arrn[i]);
            if (!list.contains(class_17281) || class_4751 != null && random.nextInt(n10 + (-16239 & 6657)) != 0) continue;
            class_4751 = new Class_4751(n11, 10273 & 216, n12);
            ++n10;
        }
        return class_4751;
    }
}

