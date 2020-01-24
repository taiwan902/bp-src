/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_33946
extends Class_30038 {
    private boolean Field_33947 = -24575 & 2962;
    protected String Field_33948 = "Shader Options";
    private Class_39702 Field_33949;
    private String Field_33950 = null;
    private Class_36976 Field_33951 = new Class_36976(this, new Class_32470());
    private String Field_33952 = null;
    private Class_1490 Field_33953;

    public void Method_33954(int n, int n2, float f) {
        this.\u0000, 2();
        if (this.Field_33952 != null) {
            this.\u0000strictfp(this.\u0000strictfp, this.Field_33952, this.\u0000= final / (130 & 1090), 47 & -24033, 1358954495 & 83886079);
        } else {
            this.\u0000strictfp(this.\u0000strictfp, this.Field_33948, this.\u0000= final / (-25598 & 970), 2319 & 12303, 369098751 & 16777215);
        }
        super.\u0000strictfp(n, n2, f);
        this.Field_33951.Method_36984(n, n2, this.\u0000strictfp);
    }

    private void Method_33955() {
        for (Class_42376 class_42376 : this.\u0000strictfp) {
            if (!(class_42376 instanceof Class_45268)) continue;
            Class_45268 class_45268 = (Class_45268)class_42376;
            Class_18480 class_18480 = class_45268.Method_45270();
            if (class_18480 instanceof Class_24723) {
                Class_24723 class_24723 = (Class_24723)class_18480;
                class_24723.Method_24737();
            }
            class_45268.\u0000strictfp = Class_33946.Method_33961(class_18480, class_45268.\u0000strictfp());
            class_45268.Method_45271();
        }
    }

    protected void Method_33956(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            Class_18480[] arrclass_18480;
            if (class_42376.Field_42392 < (456 & -16166) && class_42376 instanceof Class_45268) {
                arrclass_18480 = (Class_18480[])class_42376;
                Class_18480 class_18480 = arrclass_18480.Method_45270();
                if (class_18480 instanceof Class_26376) {
                    String string = class_18480.Method_18504();
                    Class_33946 class_33946 = new Class_33946(this, this.Field_33949, string);
                    this.\u0000strictfp.Method_218(class_33946);
                    return;
                }
                if (Class_33946.\u0000
                ()) {
                    class_18480.Method_18518();
                } else {
                    class_18480.Method_18489();
                }
                this.Method_33955();
                this.Field_33947 = 4235 & 25925;
            }
            if (class_42376.Field_42392 == (1737 & 8409)) {
                arrclass_18480 = Class_12440.Method_12795(Class_12440.Method_12827());
                for (int i = 11264 & 905; i < arrclass_18480.length; ++i) {
                    Class_18480 class_18480 = arrclass_18480[i];
                    class_18480.Method_18518();
                    this.Field_33947 = 1217 & -9723;
                }
                this.Method_33955();
            }
            if (class_42376.Field_42392 == (4553 & 19144)) {
                if (this.Field_33947) {
                    Class_12440.Method_12745();
                    this.Field_33947 = 273 & -19420;
                    Class_12440.Method_12961();
                }
                this.\u0000strictfp.Method_218(this.Field_33953);
            }
        }
    }

    protected void Method_33957(Class_42376 class_42376) {
        if (class_42376 instanceof Class_45268) {
            Class_45268 class_45268 = (Class_45268)class_42376;
            Class_18480 class_18480 = class_45268.Method_45270();
            if (Class_33946.\u0000
            ()) {
                class_18480.Method_18518();
            } else {
                class_18480.Method_18503();
            }
            this.Method_33955();
            this.Field_33947 = 35 & 14345;
        }
    }

    public void Method_33958() {
        super.\u0000c_();
        if (this.Field_33947) {
            Class_12440.Method_12745();
            this.Field_33947 = 4291 & -32244;
            Class_12440.Method_12961();
        }
    }

    private void Method_33959() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_33946(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_33953 = class_1490;
        this.Field_33949 = class_39702;
    }

    public Class_33946(Class_1490 class_1490, Class_39702 class_39702, String string) {
        this(class_1490, class_39702);
        this.Field_33950 = string;
        if (string != null) {
            this.Field_33952 = Class_12440.Method_12859("screen." + string, string);
        }
    }

    public void Method_33960() {
        this.Field_33948 = Class_9802.Method_9806("of.options.shaderOptionsTitle", new Object[4753 & 104]);
        int n = 116 & -31130;
        int n2 = -32704 & 22557;
        int n3 = 8606 & 126;
        int n4 = 4116 & 1053;
        int n5 = 4216 & 1532;
        int n6 = 22932 & 605;
        int n7 = Class_12440.Method_12897(this.Field_33950, -32618 & 9314);
        Class_18480[] arrclass_18480 = Class_12440.Method_12852(this.Field_33950);
        if (arrclass_18480 != null) {
            int n8 = Class_13337.Method_13357((double)arrclass_18480.length / (0.48484848484848486 * 18.5625));
            if (n7 < n8) {
                n7 = n8;
            }
            for (int i = 10240 & -16112; i < arrclass_18480.length; ++i) {
                Class_18480 class_18480 = arrclass_18480[i];
                if (class_18480 == null || !class_18480.Method_18512()) continue;
                int n9 = i % n7;
                int n10 = i / n7;
                int n11 = Math.min(this.\u0000= final / n7, 458 & 25800);
                n2 = (this.\u0000= final - n11 * n7) / (18442 & -32542);
                int n12 = n9 * n11 + (19557 & 645) + n2;
                int n13 = n3 + n10 * n4;
                int n14 = n11 - (1178 & -28149);
                String string = Class_33946.Method_33961(class_18480, n14);
                Class_45268 class_45268 = Class_12440.Method_12784(class_18480.Method_18504()) ? new Class_46497(n + i, n12, n13, n14, n6, class_18480, string) : new Class_45268(n + i, n12, n13, n14, n6, class_18480, string);
                class_45268.\u0000strictfp = class_18480.Method_18508();
                this.\u0000strictfp.add(class_45268);
            }
        }
        this.\u0000strictfp.add(new Class_42376(207 & 1001, this.\u0000= final / (771 & 1154) - n5 - (3092 & 4509), this.\u0000, ` / (-16250 & 4870) + (184 & 15593) + (-18913 & 43), n5, n6, Class_9802.Method_9806("controls.reset", new Object[-24414 & 21248])));
        this.\u0000strictfp.add(new Class_42376(29912 & 2508, this.\u0000= final / (-32582 & 6211) + (-2916 & 23), this.\u0000, ` / (582 & 1454) + (680 & -30276) + (9947 & -32465), n5, n6, Class_9802.Method_9806("gui.done", new Object[1420 & 8194])));
    }

    public static String Method_33961(Class_18480 class_18480, int n) {
        String string = class_18480.Method_18505();
        if (class_18480 instanceof Class_26376) {
            Class_26376 class_26376 = (Class_26376)class_18480;
            return string + "...";
        }
        Class_28636 class_28636 = Class_19426.Method_19519().Field_27;
        int n2 = class_28636.Method_28715(": " + Class_14688.Method_14695()) + (25101 & 1303);
        while (class_28636.Method_28715(string) + n2 >= n && string.length() > 0) {
            string = string.substring(-31744 & 13, string.length() - (3083 & -16351));
        }
        String string2 = class_18480.Method_18498() ? class_18480.Method_18506(class_18480.Method_18493()) : "";
        String string3 = class_18480.Method_18519(class_18480.Method_18493());
        return string + ": " + string2 + string3;
    }
}

