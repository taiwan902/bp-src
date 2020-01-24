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

public class Class_24879 {
    private int Field_24880;
    private boolean Field_24881;
    private final List Field_24882 = Lists.newArrayList();
    private boolean Field_24883;
    private int Field_24884;
    private String Field_24885;
    private int Field_24886;
    private final Class_859 Field_24887;

    private void Method_24888() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_24889() {
        this.Field_24885 = null;
    }

    public Class_24879(Class_859 class_859) {
        this.Field_24887 = class_859;
    }

    public Class_859 Method_24890() {
        Class_859 class_859 = null;
        Class_626 class_626 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        for (Class_35356 class_35356 : this.Field_24882) {
            if (class_35356.Method_35365().Method_32856() instanceof Class_626 && (class_626 == null || class_35356.Method_35368() > f2)) {
                f2 = class_35356.Method_35368();
                class_626 = (Class_626)class_35356.Method_35365().Method_32856();
            }
            if (!(class_35356.Method_35365().Method_32856() instanceof Class_859) || class_859 != null && !(class_35356.Method_35368() > f)) continue;
            f = class_35356.Method_35368();
            class_859 = (Class_859)class_35356.Method_35365().Method_32856();
        }
        if (class_626 != null && f2 >= f / (0.8225807f * 3.6470587f)) {
            return class_626;
        }
        return class_859;
    }

    public void Method_24891() {
        int n;
        int n2 = n = this.Field_24883 ? 1324 & 16877 : 101 & -11154;
        if (this.Field_24881 && (!this.Field_24887.Method_1033() || this.Field_24887.\u0000= package - this.Field_24884 > n)) {
            boolean bl = this.Field_24883;
            this.Field_24881 = 1347 & -18432;
            this.Field_24883 = 4654 & 8448;
            this.Field_24880 = this.Field_24887.\u0000= package;
            if (bl) {
                this.Field_24887.Method_956();
            }
            this.Field_24882.clear();
        }
    }

    private Class_35356 Method_24892() {
        Class_35356 class_35356 = null;
        Class_35356 class_353562 = null;
        int n = 256 & -10020;
        float f = 0.0f;
        for (int i = 8232 & 2818; i < this.Field_24882.size(); ++i) {
            Class_35356 class_353563;
            Class_35356 class_353564 = (Class_35356)this.Field_24882.get(i);
            Class_35356 class_353565 = class_353563 = i > 0 ? (Class_35356)this.Field_24882.get(i - (4165 & 25403)) : null;
            if ((class_353564.Method_35365() == Class_32797.Field_32813 || class_353564.Method_35365() == Class_32797.Field_32802) && class_353564.Method_35363() > 0.0f && (class_35356 == null || class_353564.Method_35363() > f)) {
                class_35356 = i > 0 ? class_353563 : class_353564;
                f = class_353564.Method_35363();
            }
            if (class_353564.Method_35366() == null || class_353562 != null && !(class_353564.Method_35368() > (float)n)) continue;
            class_353562 = class_353564;
        }
        if (f > 0.051948052f * 96.25f && class_35356 != null) {
            return class_35356;
        }
        if (n > (12309 & -16251) && class_353562 != null) {
            return class_353562;
        }
        return null;
    }

    public void Method_24893(Class_32797 class_32797, float f, float f2) {
        this.Method_24891();
        this.Method_24896();
        Class_35356 class_35356 = new Class_35356(class_32797, this.Field_24887.\u0000= package, f, f2, this.Field_24885, this.Field_24887.\u0000= finally);
        this.Field_24882.add(class_35356);
        this.Field_24884 = this.Field_24887.\u0000= package;
        this.Field_24881 = -22223 & 73;
        if (class_35356.Method_35369() && !this.Field_24883 && this.Field_24887.Method_1033()) {
            this.Field_24883 = 9 & 16961;
            this.Field_24880 = this.Field_24886 = this.Field_24887.\u0000= package;
            this.Field_24887.Method_944();
        }
    }

    public Class_859 Method_24894() {
        return this.Field_24887;
    }

    public int Method_24895() {
        return this.Field_24883 ? this.Field_24887.\u0000= package - this.Field_24886 : this.Field_24880 - this.Field_24886;
    }

    public void Method_24896() {
        this.Method_24889();
        if (this.Field_24887.Method_1041()) {
            Class_3238 class_3238 = this.Field_24887.\u0000strictfp.Method_375(new Class_4751(this.Field_24887.\u0000= package, this.Field_24887.\u0000, `().Field_11000, this.Field_24887.\u0000= switch)).Method_3442();
            if (class_3238 == Class_9265.Field_9350) {
                this.Field_24885 = "ladder";
            } else if (class_3238 == Class_9265.Field_9323) {
                this.Field_24885 = "vines";
            }
        } else if (this.Field_24887.\u0000switch()) {
            this.Field_24885 = "water";
        }
    }

    private String Method_24897(Class_35356 class_35356) {
        return class_35356.Method_35366() == null ? "generic" : class_35356.Method_35366();
    }

    public Class_1782 Method_24898() {
        Class_1782 class_1782;
        if (this.Field_24882.size() == 0) {
            Object[] arrobject = new Object[-27539 & 27521];
            arrobject[14378 & 17680] = this.Field_24887.\u0000strictfp();
            return new Class_2849("death.attack.generic", arrobject);
        }
        Class_35356 class_35356 = this.Method_24892();
        Class_35356 class_353562 = (Class_35356)this.Field_24882.get(this.Field_24882.size() - (-28635 & 2193));
        Class_1782 class_17822 = class_353562.Method_35364();
        Class_1061 class_1061 = class_353562.Method_35365().Method_32856();
        if (class_35356 != null && class_353562.Method_35365() == Class_32797.Field_32813) {
            Class_1782 class_17823 = class_35356.Method_35364();
            if (class_35356.Method_35365() != Class_32797.Field_32813 && class_35356.Method_35365() != Class_32797.Field_32802) {
                if (!(class_17823 == null || class_17822 != null && class_17823.equals(class_17822))) {
                    Class_23823 class_23823;
                    Class_1061 class_10612 = class_35356.Method_35365().Method_32856();
                    Class_23823 class_238232 = class_23823 = class_10612 instanceof Class_859 ? ((Class_859)class_10612).Method_1010() : null;
                    if (class_23823 != null && class_23823.Method_23851()) {
                        Object[] arrobject = new Object[19475 & 4963];
                        arrobject[-32383 & 2076] = this.Field_24887.\u0000strictfp();
                        arrobject[8773 & 18593] = class_17823;
                        arrobject[299 & 12998] = class_23823.Method_23900();
                        class_1782 = new Class_2849("death.fell.assist.item", arrobject);
                    } else {
                        Object[] arrobject = new Object[-32762 & 17987];
                        arrobject[-23020 & 2] = this.Field_24887.\u0000strictfp();
                        arrobject[17245 & 4225] = class_17823;
                        class_1782 = new Class_2849("death.fell.assist", arrobject);
                    }
                } else if (class_17822 != null) {
                    Class_23823 class_23823;
                    Class_23823 class_238233 = class_23823 = class_1061 instanceof Class_859 ? ((Class_859)class_1061).Method_1010() : null;
                    if (class_23823 != null && class_23823.Method_23851()) {
                        Object[] arrobject = new Object[10575 & -14829];
                        arrobject[17491 & 2184] = this.Field_24887.\u0000strictfp();
                        arrobject[6341 & -31973] = class_17822;
                        arrobject[-28606 & 2182] = class_23823.Method_23900();
                        class_1782 = new Class_2849("death.fell.finish.item", arrobject);
                    } else {
                        Object[] arrobject = new Object[-32254 & 10323];
                        arrobject[9344 & -32757] = this.Field_24887.\u0000strictfp();
                        arrobject[145 & 257] = class_17822;
                        class_1782 = new Class_2849("death.fell.finish", arrobject);
                    }
                } else {
                    Object[] arrobject = new Object[1037 & -9455];
                    arrobject[12328 & 17540] = this.Field_24887.\u0000strictfp();
                    class_1782 = new Class_2849("death.fell.killer", arrobject);
                }
            } else {
                Object[] arrobject = new Object[561 & -5821];
                arrobject[-23998 & 16680] = this.Field_24887.\u0000strictfp();
                class_1782 = new Class_2849("death.fell.accident." + this.Method_24897(class_35356), arrobject);
            }
        } else {
            class_1782 = class_353562.Method_35365().Method_32847(this.Field_24887);
        }
        return class_1782;
    }
}

