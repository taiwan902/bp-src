/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  internal.org.lwjgl.opengl.GL11
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class_28538
extends Class_27380 {
    protected Class_33781 Field_28539;
    protected List Field_28540 = Lists.newArrayList();
    protected FloatBuffer Field_28541 = Class_11552.Method_11553(-16299 & 13830);
    private static final Logger Field_28542 = LogManager.getLogger();
    protected boolean Field_28543 = -32732 & 2200;
    private static final Class_47630 Field_28544 = new Class_47630(4797 & -32432, 88 & -6127);

    public void Method_28545(Class_859 class_859, double d, double d2, double d3) {
        float f;
        double d4;
        if (this.Method_28549(class_859) && (d4 = class_859.\u0000strictfp(this.\u0000strictfp.Field_8510)) < (double)((f = 28.656715f * 2.2333333f - class_859.\u0000
        (0.0f) * (3.5185184f * 9.094737f)) * f)) {
            String string = class_859.\u0000strictfp((1 & 30460) != 0).Method_1783();
            float f2 = 0.013737376f * 1.9411764f;
            Class_16867.Method_16967(1812 & -30196, 0.84375f * 0.118518524f);
            if (class_859.\u0000%()) {
                Class_28636 class_28636 = this.\u0000strictfp();
                Class_16867.Method_16961();
                Class_16867.Method_16943((float)d, (float)d2 + class_859.\u0000= switch() + 1.0493827f * 0.4764706f - (class_859.Method_1059() ? class_859.\u0000= switch() / 2.0f : 0.0f), (float)d3);
                GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                float f3 = this.\u0000strictfp.Field_8492;
                float f4 = this.\u0000strictfp.Field_8499;
                if (Class_18.Field_89.Field_84.Field_39802 == (43 & 1110)) {
                    f4 = -f4;
                }
                Class_16867.Method_16940(-f3, 0.0f, 1.0f, 0.0f);
                Class_16867.Method_16940(f4, 1.0f, 0.0f, 0.0f);
                Class_16867.Method_16973(0.94871795f * -0.028108101f, 0.62650603f * -0.04256409f, 0.68041235f * 0.03919191f);
                Class_16867.Method_16943(0.0f, 8.89423f * 1.054054f, 0.0f);
                Class_16867.Method_16931();
                Class_16867.Method_16930((1218 & 8196) != 0);
                Class_16867.Method_16947();
                Class_16867.Method_16922();
                Class_16867.Method_16984(799 & 6978, 4955 & -23773, -24525 & 18437, 20 & 18688);
                int n = class_28636.Method_28715(string) / (1538 & -8157);
                Class_7644 class_7644 = Class_7644.Method_7649();
                Class_22385 class_22385 = class_7644.Method_7648();
                if (((Boolean)Class_18.Field_89.Field_84.Field_39732.Field_8861.\u0000strictfp()).booleanValue() && !Class_19426.Method_19570()) {
                    class_22385.Method_22417(4167 & 17559, Class_29585.Field_29601);
                    class_22385.Method_22443(-n - (16705 & 147), 1.5098039215686274 * -0.6623376623376623, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.6148649f * 0.4065934f).Method_22451();
                    class_22385.Method_22443(-n - (16707 & -20959), 1.8909090909090909 * 4.230769230769231, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.069148935f * 3.6153846f).Method_22451();
                    class_22385.Method_22443(n + (513 & 81), 1.1645569620253164 * 6.869565217391305, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.4357143f * 0.57377046f).Method_22451();
                    class_22385.Method_22443(n + (21635 & -22015), 0.5858585858585859 * -1.706896551724138, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.3467742f * 0.7209302f).Method_22451();
                    class_7644.Method_7647();
                }
                Class_16867.Method_16965();
                Class_16867.Method_16930((18593 & -23529) != 0);
                this.\u0000strictfp().Method_28692(string, -class_28636.Method_28715(string) / (-11190 & 2194), 4225 & 2598, -1258291201 & 738197503);
                Class_16867.Method_16918();
                Class_16867.Method_16952();
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                Class_16867.Method_16945();
            } else {
                this.\u0000strictfp((Class_1061)class_859, d, d2 - (class_859.Method_1059() ? (double)(class_859.\u0000= switch() / 2.0f) : 0.0), d3, string, 1.057971f * 0.025205482f, d4);
            }
        }
    }

    protected float Method_28546(Class_859 class_859) {
        return 495.0f * 0.18181819f;
    }

    public void Method_28547() {
    }

    private void Method_28548() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected boolean Method_28549(Class_859 class_859) {
        if (Class_18.Field_89.Field_84.Field_39731) {
            return (16530 & 2049) != 0;
        }
        if (Class_19426.Method_19570() && Class_12440.Field_12441) {
            return (10304 & 1160) != 0;
        }
        Class_1378 class_1378 = Class_18.Field_89.Field_48;
        if (class_859 instanceof Class_626 && class_859 != class_1378) {
            Class_9665 class_9665 = class_859.Method_949();
            Class_9665 class_96652 = class_1378.\u0000strictfp();
            if (class_9665 != null) {
                Class_31355 class_31355 = class_9665.Method_9672();
                switch (Class_15271.Field_15272[class_31355.ordinal()]) {
                    case 1: {
                        return (-32687 & 2319) != 0;
                    }
                    case 2: {
                        return (4874 & -30704) != 0;
                    }
                    case 3: {
                        return (class_96652 == null || class_9665.Method_9667(class_96652) ? 4353 & 24709 : 320 & 4756) != 0;
                    }
                    case 4: {
                        return (class_96652 == null || !class_9665.Method_9667(class_96652) ? 12711 & 65 : -16373 & 2048) != 0;
                    }
                }
                return (-25119 & 513) != 0;
            }
        }
        return (Class_18.Method_138() && class_859 != this.\u0000strictfp.Field_8510 && !class_859.\u0000strictfp((Class_626)class_1378) && class_859.\u0000strictfp == null ? 1033 & -6011 : 26953 & -32752) != 0;
    }

    public Class_33781 Method_28550() {
        return this.Field_28539;
    }

    protected void Method_28551(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        for (Class_7380 class_7380 : this.Field_28540) {
            int n = class_7380.Method_7382();
            if (((Boolean)Class_18.Field_89.Field_84.Field_39732.Field_8862.\u0000strictfp()).booleanValue() && class_7380.getClass().equals(Class_20632.class)) {
                n = 17 & -16251;
            }
            boolean bl = this.Method_28559(class_859, f3, n != 0);
            class_7380.Method_7381(class_859, f, f2, f3, f4, f5, f6, f7);
            if (!bl) continue;
            this.Method_28553();
        }
    }

    protected void Method_28552() {
        Class_16867.Method_16918();
        Class_16867.Method_16960(Class_32876.Field_32931);
        Class_16867.Method_16965();
        Class_16867.Method_16960(Class_32876.Field_32911);
        Class_16867.Method_16965();
        Class_16867.Method_16960(Class_32876.Field_32931);
    }

    protected void Method_28553() {
        Class_16867.Method_16960(Class_32876.Field_32931);
        Class_16867.Method_16965();
        GL11.glTexEnvi((int)(11048 & -19696), (int)(9864 & 10866), (int)Class_32876.Field_32919);
        GL11.glTexEnvi((int)(-23788 & 13282), (int)Class_32876.Field_32897, (int)(-24320 & 12721));
        GL11.glTexEnvi((int)(12161 & 13094), (int)Class_32876.Field_32905, (int)Class_32876.Field_32931);
        GL11.glTexEnvi((int)(-7424 & 8988), (int)Class_32876.Field_32929, (int)Class_32876.Field_32884);
        GL11.glTexEnvi((int)(14087 & 9080), (int)Class_32876.Field_32924, (int)(-27656 & 8960));
        GL11.glTexEnvi((int)(9152 & 11032), (int)Class_32876.Field_32882, (int)(-14524 & 2874));
        GL11.glTexEnvi((int)(25440 & 8986), (int)Class_32876.Field_32916, (int)(25409 & 10680));
        GL11.glTexEnvi((int)(25412 & -23752), (int)Class_32876.Field_32932, (int)Class_32876.Field_32931);
        GL11.glTexEnvi((int)(26467 & -19568), (int)Class_32876.Field_32899, (int)Class_32876.Field_32884);
        GL11.glTexEnvi((int)(25360 & 14312), (int)Class_32876.Field_32920, (int)(17287 & 4962));
        GL11.glTexEnvi((int)(25552 & -23804), (int)Class_32876.Field_32904, (int)(28422 & 818));
        Class_16867.Method_16960(Class_32876.Field_32911);
        GL11.glTexEnvi((int)(28424 & -23676), (int)(10752 & -22933), (int)Class_32876.Field_32919);
        GL11.glTexEnvi((int)(9061 & 29442), (int)Class_32876.Field_32897, (int)(25889 & 8978));
        GL11.glTexEnvi((int)(-3326 & 8964), (int)Class_32876.Field_32924, (int)(13121 & -30976));
        GL11.glTexEnvi((int)(25344 & -21759), (int)Class_32876.Field_32882, (int)(11076 & 6048));
        GL11.glTexEnvi((int)(27529 & -19712), (int)Class_32876.Field_32905, (int)(5971 & -26874));
        GL11.glTexEnvi((int)(16311 & 8968), (int)Class_32876.Field_32929, (int)Class_32876.Field_32903);
        GL11.glTexEnvi((int)(10064 & 13186), (int)Class_32876.Field_32916, (int)(26370 & -22239));
        GL11.glTexEnvi((int)(-21668 & 9122), (int)Class_32876.Field_32920, (int)(4930 & -5229));
        GL11.glTexEnvi((int)(-19696 & 26596), (int)Class_32876.Field_32932, (int)(14099 & -24634));
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16960(Class_32876.Field_32922);
        Class_16867.Method_16922();
        Class_16867.Method_16963(16418 & 12492);
        GL11.glTexEnvi((int)(-17592 & 9094), (int)(29253 & -23622), (int)Class_32876.Field_32919);
        GL11.glTexEnvi((int)(-22780 & 8963), (int)Class_32876.Field_32897, (int)(-24320 & 25488));
        GL11.glTexEnvi((int)(9984 & 15118), (int)Class_32876.Field_32924, (int)(17152 & -30840));
        GL11.glTexEnvi((int)(15104 & 8962), (int)Class_32876.Field_32882, (int)(18314 & 2820));
        GL11.glTexEnvi((int)(-21728 & 8976), (int)Class_32876.Field_32905, (int)(6090 & 14114));
        GL11.glTexEnvi((int)(-23734 & 11041), (int)Class_32876.Field_32929, (int)Class_32876.Field_32903);
        GL11.glTexEnvi((int)(-17597 & 9120), (int)Class_32876.Field_32916, (int)(11544 & 9088));
        GL11.glTexEnvi((int)(15234 & 9057), (int)Class_32876.Field_32920, (int)(786 & 8963));
        GL11.glTexEnvi((int)(14214 & 27424), (int)Class_32876.Field_32932, (int)(5891 & -8358));
        Class_16867.Method_16960(Class_32876.Field_32931);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12781(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public void Method_28554(boolean bl) {
        this.Field_28543 = bl;
    }

    protected void Method_28555(Class_859 class_859, float f) {
    }

    protected void Method_28556(Class_859 class_859, float f, float f2, float f3) {
        Class_16867.Method_16940(0.03846154f * 4680.0f - f2, 0.0f, 1.0f, 0.0f);
        if (class_859.Field_928 > 0) {
            float f4 = ((float)class_859.Field_928 + f3 - 1.0f) / (7.142857f * 2.8f) * (1.125926f * 1.4210526f);
            if ((f4 = Class_13337.Method_13388(f4)) > 1.0f) {
                f4 = 1.0f;
            }
            Class_16867.Method_16940(f4 * this.Method_28546(class_859), 0.0f, 0.0f, 1.0f);
        } else {
            String string = Class_5478.Method_5555(class_859.\u0000, `());
            if (string != null && (string.equals("Dinnerbone") || string.equals("Grumm")) && (!(class_859 instanceof Class_626) || ((Class_626)class_859).Method_847(Class_21361.Field_21363))) {
                Class_16867.Method_16943(0.0f, class_859.\u0000= switch() + 0.086419754f * 1.1571429f, 0.0f);
                Class_16867.Method_16940(2.8666666f * 62.7907f, 0.0f, 0.0f, 1.0f);
            } else if (class_859 instanceof Class_626) {
                Class_626 class_626 = (Class_626)class_859;
                if (class_626.Field_678.Field_22183) {
                    float f5 = System.currentTimeMillis() / (-8483586486139264997L & 83918890L) % (-1601242328090779160L & 1601242328020844922L);
                    float f6 = class_859.\u0000= switch() + 2.0f * 0.05f;
                    if (class_626.Field_678.Field_22182) {
                        f6 *= 0.9777778f * 1.5340909f;
                    }
                    float f7 = (Class_13337.Method_13370((float)((double)(f5 - 0.044444446f * 2025.0f) / (0.847457627118644 * 212.4) * (0.3611111111111111 * 8.699795040710196))) + 1.0f) / 2.0f;
                    float f8 = Class_13337.Method_13350((float)((double)(f5 - 3.7142856f * 24.23077f) / (103.84615384615384 * 1.7333333333333334) * (3.652173913043478 * 0.8601979884829196))) / 2.0f;
                    Class_16867.Method_16943(f6 * f8, f6 * f7, 0.0f);
                    Class_16867.Method_16940(f5, 0.0f, 0.0f, 1.0f);
                } else if (class_626.Field_678.Field_22184) {
                    Class_16867.Method_16943(0.0f, class_859.\u0000= switch() + 0.20833334f * 0.48f, 0.0f);
                    Class_16867.Method_16940(0.6666667f * 270.0f, 0.0f, 0.0f, 1.0f);
                }
            }
        }
    }

    protected float Method_28557(float f, float f2, float f3) {
        float f4;
        for (f4 = f2 - f; f4 < 0.8352941f * -215.49295f; f4 += 376.74417f * 0.95555556f) {
        }
        while (f4 >= 109.565216f * 1.6428572f) {
            f4 -= 9.230769f * 39.0f;
        }
        return f + f3 * f4;
    }

    protected void Method_28558(Class_859 class_859, double d, double d2, double d3) {
        Class_16867.Method_16943((float)d, (float)d2, (float)d3);
    }

    protected boolean Method_28559(Class_859 class_859, float f, boolean bl) {
        int n;
        float f2 = class_859.\u0000strictfp(f);
        int n2 = this.Method_28567(class_859, f2, f);
        int n3 = (n2 >> (7192 & -31970) & (511 & 12543)) > 0 ? 1 & 2169 : 10241 & 1984;
        int n4 = n = class_859.Field_872 > 0 || class_859.Field_928 > 0 ? 9253 & 4305 : 16897 & 264;
        if (n3 == 0 && n == 0) {
            return (22528 & 1068) != 0;
        }
        if (n3 == 0 && !bl) {
            return (8193 & 22820) != 0;
        }
        Class_16867.Method_16960(Class_32876.Field_32931);
        Class_16867.Method_16965();
        GL11.glTexEnvi((int)(9040 & -19671), (int)(8961 & 27200), (int)Class_32876.Field_32919);
        GL11.glTexEnvi((int)(9984 & 25455), (int)Class_32876.Field_32897, (int)(12264 & -7934));
        GL11.glTexEnvi((int)(10000 & -19711), (int)Class_32876.Field_32905, (int)Class_32876.Field_32931);
        GL11.glTexEnvi((int)(13153 & 9096), (int)Class_32876.Field_32929, (int)Class_32876.Field_32884);
        GL11.glTexEnvi((int)(9032 & 13094), (int)Class_32876.Field_32924, (int)(-31996 & 17152));
        GL11.glTexEnvi((int)(-2272 & 11008), (int)Class_32876.Field_32882, (int)(2826 & -31899));
        GL11.glTexEnvi((int)(-23712 & 8960), (int)Class_32876.Field_32916, (int)(7745 & 24343));
        GL11.glTexEnvi((int)(8970 & 16209), (int)Class_32876.Field_32932, (int)Class_32876.Field_32931);
        GL11.glTexEnvi((int)(13129 & 11168), (int)Class_32876.Field_32920, (int)(875 & 898));
        Class_16867.Method_16960(Class_32876.Field_32911);
        Class_16867.Method_16965();
        GL11.glTexEnvi((int)(16128 & 8973), (int)(-23916 & 13832), (int)Class_32876.Field_32919);
        GL11.glTexEnvi((int)(9072 & 9088), (int)Class_32876.Field_32897, (int)Class_32876.Field_32921);
        GL11.glTexEnvi((int)(11052 & 9152), (int)Class_32876.Field_32905, (int)Class_32876.Field_32908);
        GL11.glTexEnvi((int)(-7417 & 10080), (int)Class_32876.Field_32929, (int)Class_32876.Field_32903);
        GL11.glTexEnvi((int)(13058 & 12261), (int)Class_32876.Field_32927, (int)Class_32876.Field_32908);
        GL11.glTexEnvi((int)(9019 & 10176), (int)Class_32876.Field_32924, (int)(17161 & 4864));
        GL11.glTexEnvi((int)(14213 & 8960), (int)Class_32876.Field_32882, (int)(4864 & 801));
        GL11.glTexEnvi((int)(9984 & 8972), (int)Class_32876.Field_32900, (int)(-25854 & 930));
        GL11.glTexEnvi((int)(-23790 & 12032), (int)Class_32876.Field_32916, (int)(-8699 & 7793));
        GL11.glTexEnvi((int)(-5343 & 13064), (int)Class_32876.Field_32932, (int)Class_32876.Field_32903);
        GL11.glTexEnvi((int)(9986 & 11081), (int)Class_32876.Field_32920, (int)(4930 & 17314));
        this.Field_28541.position(-31194 & 22992);
        if (n != 0) {
            if (((Boolean)Class_18.Field_89.Field_84.Field_39732.Field_8862.\u0000strictfp()).booleanValue()) {
                this.Field_28541.put(1.2394366f * 0.5647727f);
            } else {
                this.Field_28541.put(1.0f);
            }
            this.Field_28541.put(0.0f);
            this.Field_28541.put(0.0f);
            this.Field_28541.put(1.590164f * 0.1886598f);
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12781(1.0f, 0.0f, 0.0f, 0.050602414f * 5.928571f);
            }
        } else {
            float f3 = (float)(n2 >> (24600 & -30342) & (-24065 & 19199)) / (1.1315789f * 225.34885f);
            float f4 = (float)(n2 >> (7186 & -32400) & (-29953 & 255)) / (1.5714285f * 162.27274f);
            float f5 = (float)(n2 >> (-29911 & 8204) & (511 & 19199)) / (0.18644068f * 1367.7273f);
            float f6 = (float)(n2 & (13567 & 2303)) / (357.0f * 0.71428573f);
            this.Field_28541.put(f4);
            this.Field_28541.put(f5);
            this.Field_28541.put(f6);
            this.Field_28541.put(1.0f - f3);
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12781(f4, f5, f6, 1.0f - f3);
            }
        }
        this.Field_28541.flip();
        GL11.glTexEnv((int)(8976 & -21725), (int)(15105 & -24053), (FloatBuffer)this.Field_28541);
        Class_16867.Method_16960(Class_32876.Field_32922);
        Class_16867.Method_16965();
        Class_16867.Method_16963(Field_28544.\u0000strictfp());
        GL11.glTexEnvi((int)(11137 & 10000), (int)(-7678 & 8820), (int)Class_32876.Field_32919);
        GL11.glTexEnvi((int)(26568 & 11008), (int)Class_32876.Field_32897, (int)(8529 & 14624));
        GL11.glTexEnvi((int)(9025 & 29482), (int)Class_32876.Field_32905, (int)Class_32876.Field_32903);
        GL11.glTexEnvi((int)(14154 & 11172), (int)Class_32876.Field_32929, (int)Class_32876.Field_32911);
        GL11.glTexEnvi((int)(25488 & 10016), (int)Class_32876.Field_32924, (int)(17154 & 16225));
        GL11.glTexEnvi((int)(9024 & 9997), (int)Class_32876.Field_32882, (int)(-29864 & 929));
        GL11.glTexEnvi((int)(11026 & -19703), (int)Class_32876.Field_32916, (int)(7989 & 16003));
        GL11.glTexEnvi((int)(28434 & 13125), (int)Class_32876.Field_32932, (int)Class_32876.Field_32903);
        GL11.glTexEnvi((int)(10152 & -7424), (int)Class_32876.Field_32920, (int)(-31997 & 1922));
        Class_16867.Method_16960(Class_32876.Field_32931);
        return (1065 & 2433) != 0;
    }

    public Class_28538(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491);
        this.Field_28539 = class_33781;
        this.\u0000, ` = f;
    }

    protected boolean Method_28560(Class_859 class_859) {
        String string;
        Class_22057 class_22057;
        int n = 385875967 & 150994943;
        if (class_859 instanceof Class_626 && (class_22057 = (Class_22057)class_859.Method_949()) != null && (string = Class_28636.Method_28693(class_22057.Method_22083())).length() >= (8850 & 17450)) {
            n = this.\u0000strictfp().Method_28695(string.charAt(18465 & -31227));
        }
        float f = (float)(n >> (20497 & 1684) & (-26369 & 9215)) / (0.14444445f * 1765.3845f);
        float f2 = (float)(n >> (-31895 & 20504) & (5887 & 18687)) / (76.5f * 3.3333333f);
        float f3 = (float)(n & (255 & -9473)) / (0.37142858f * 686.53845f);
        Class_16867.Method_16931();
        Class_16867.Method_16960(Class_32876.Field_32931);
        Class_16867.Method_16924(f, f2, f3, 1.0f);
        Class_16867.Method_16922();
        Class_16867.Method_16960(Class_32876.Field_32911);
        Class_16867.Method_16922();
        Class_16867.Method_16960(Class_32876.Field_32931);
        return (-22207 & 1673) != 0;
    }

    protected float Method_28561(Class_859 class_859, float f) {
        return class_859.Method_1018(f);
    }

    protected boolean Method_28562(Class_7380 class_7380) {
        return this.Field_28540.add(class_7380);
    }

    protected float Method_28563(Class_859 class_859, float f) {
        return (float)class_859.\u0000= package + f;
    }

    protected void Method_28564(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6) {
        int n;
        int n2 = !class_859.\u0000= ?() ? 22529 & 8425 : 603 & 18436;
        int n3 = n = n2 == 0 && !class_859.\u0000strictfp((Class_626)Class_18.Field_89.Field_48) ? 4233 & -15037 : 8730 & 20928;
        if (n2 != 0 || n != 0) {
            if (!this.\u0000, `((Class_1061)class_859)) {
                return;
            }
            if (n != 0) {
                Class_16867.Method_16961();
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 0.011235955f * 13.35f);
                Class_16867.Method_16930((19536 & 4641) != 0);
                Class_16867.Method_16947();
                Class_16867.Method_16951(17170 & 16262, 17283 & -22749);
                Class_16867.Method_16967(1556 & -19860, 0.10526316f * 0.037254903f);
            }
            this.Field_28539.Method_33794(class_859, f, f2, f3, f4, f5, f6);
            if (n != 0) {
                Class_16867.Method_16952();
                Class_16867.Method_16967(5671 & 9044, 0.060240965f * 1.66f);
                Class_16867.Method_16945();
                Class_16867.Method_16930((-16351 & 13889) != 0);
            }
        }
    }

    public void Method_28565(Class_859 class_859, double d, double d2, double d3, float f, float f2) {
        Class_16867.Method_16961();
        boolean bl = class_859 instanceof Class_626;
        if (bl) {
            Class_16867.Method_16979();
            Class_16867.Method_16908(1029 & 5397);
        } else {
            Class_16867.Method_16969();
        }
        this.Field_28539.Field_33783 = this.Method_28561(class_859, f2);
        this.Field_28539.Field_33782 = class_859.\u0000= `();
        this.Field_28539.Field_33785 = class_859.Method_1059();
        try {
            float f3;
            float f4 = this.Method_28557(class_859.Field_866, class_859.Field_898, f2);
            float f5 = this.Method_28557(class_859.Field_912, class_859.Field_891, f2);
            float f6 = f5 - f4;
            if (class_859.\u0000= `() && class_859.\u0000, ` instanceof Class_859) {
                Class_859 class_8592 = (Class_859)class_859.\u0000, `;
                f4 = this.Method_28557(class_8592.Field_866, class_8592.Field_898, f2);
                f6 = f5 - f4;
                f3 = Class_13337.Method_13354(f6);
                if (f3 < -23.611113f * 3.6f) {
                    f3 = 4.0f * -21.25f;
                }
                if (f3 >= 0.6111111f * 139.09091f) {
                    f3 = 4.25f * 20.0f;
                }
                f4 = f5 - f3;
                if (f3 * f3 > 0.3783784f * 6607.1426f) {
                    f4 += f3 * (0.5555555f * 0.36f);
                }
            }
            float f7 = class_859.\u0000, 2 + (class_859.\u0000= float - class_859.\u0000, 2) * f2;
            this.Method_28558(class_859, d, d2, d3);
            f3 = this.Method_28563(class_859, f2);
            this.Method_28556(class_859, f3, f4, f2);
            Class_16867.Method_16957();
            Class_16867.Method_16973(-2.9230769f * 0.34210527f, 8.6f * -0.116279066f, 1.0f);
            this.Method_28555(class_859, f2);
            float f8 = 0.6516854f * 0.09590517f;
            Class_16867.Method_16943(0.0f, 0.6956522f * -2.1674805f, 0.0f);
            float f9 = class_859.Field_903 + (class_859.Field_873 - class_859.Field_903) * f2;
            float f10 = class_859.Field_914 - class_859.Field_873 * (1.0f - f2);
            if (class_859.Method_1059()) {
                f10 *= 1.8247423f * 1.6440678f;
            }
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            Class_16867.Method_16913();
            this.Field_28539.Method_33790(class_859, f10, f9, f2);
            this.Field_28539.Method_33797(f10, f9, f3, f6, f7, f8, class_859);
            if (this.Field_28543) {
                boolean bl2 = this.Method_28560(class_859);
                this.Method_28564(class_859, f10, f9, f3, f6, f7, f8);
                if (bl2) {
                    this.Method_28552();
                }
            } else {
                boolean bl3 = this.Method_28569(class_859, f2);
                this.Method_28564(class_859, f10, f9, f3, f6, f7, f8);
                if (bl3) {
                    this.Method_28553();
                }
                Class_16867.Method_16930((171 & 6145) != 0);
                if (!(class_859 instanceof Class_626) || !((Class_626)class_859).Method_752()) {
                    this.Method_28551(class_859, f10, f9, f2, f3, f6, f7, f8);
                }
            }
            Class_16867.Method_16942();
        }
        catch (Exception exception) {
            Field_28542.error("Couldn't render entity", (Throwable)exception);
        }
        Class_16867.Method_16960(Class_32876.Field_32911);
        Class_16867.Method_16965();
        Class_16867.Method_16960(Class_32876.Field_32931);
        Class_16867.Method_16979();
        Class_16867.Method_16945();
        if (!this.Field_28543) {
            super.Method_27403(class_859, d, d2, d3, f, f2);
        }
    }

    protected boolean Method_28566(Class_1061 class_1061) {
        return this.Method_28549((Class_859)class_1061);
    }

    protected int Method_28567(Class_859 class_859, float f, float f2) {
        return 16424 & 7;
    }

    static {
        int[] arrn = Field_28544.Method_47637();
        for (int i = 3115 & 4; i < (2372 & 8576); ++i) {
            arrn[i] = -1 & -1;
        }
        Field_28544.Method_47635();
    }

    public void Method_28568(Class_1061 class_1061, double d, double d2, double d3) {
        this.Method_28545((Class_859)class_1061, d, d2, d3);
    }

    protected boolean Method_28569(Class_859 class_859, float f) {
        return this.Method_28559(class_859, f, (1101 & -30335) != 0);
    }

    public void Method_28570(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_28565((Class_859)class_1061, d, d2, d3, f, f2);
    }

    protected boolean Method_28571(Class_7380 class_7380) {
        return this.Field_28540.remove(class_7380);
    }
}

