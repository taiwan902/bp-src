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
import java.util.Set;

public abstract class Class_20870 {
    private double Field_20871;
    private Class_1061 Field_20872;
    private int Field_20873 = -15292 & 260;
    private final List Field_20874 = Lists.newArrayList();
    private int Field_20875 = 4496 & 2582;
    private int Field_20876 = -32748 & 4407;
    private int Field_20877 = 1841 & 808;
    private int Field_20878 = 17926 & 10302;
    private Class_27681 Field_20879;
    private int Field_20880 = 2765 & 24776;
    private String Field_20881 = "Pig";
    private double Field_20882;
    private int Field_20883 = 16692 & 524;

    public void Method_20884(Class_1699 class_1699) {
        this.Field_20881 = class_1699.Method_1708("EntityId");
        this.Field_20876 = class_1699.Method_1726("Delay");
        this.Field_20874.clear();
        if (class_1699.Method_1715("SpawnPotentials", 8201 & 25)) {
            Class_1758 class_1758 = class_1699.Method_1735("SpawnPotentials", 4106 & 298);
            for (int i = 2061 & 12288; i < class_1758.Method_1772(); ++i) {
                this.Field_20874.add(new Class_27681(this, class_1758.Method_1768(i)));
            }
        }
        if (class_1699.Method_1715("SpawnData", -26230 & 26155)) {
            this.Method_20893(new Class_27681(this, class_1699.Method_1703("SpawnData"), this.Field_20881));
        } else {
            this.Method_20893(null);
        }
        if (class_1699.Method_1715("MinSpawnDelay", -31005 & 103)) {
            this.Field_20880 = class_1699.Method_1726("MinSpawnDelay");
            this.Field_20877 = class_1699.Method_1726("MaxSpawnDelay");
            this.Field_20873 = class_1699.Method_1726("SpawnCount");
        }
        if (class_1699.Method_1715("MaxNearbyEntities", 20579 & -22925)) {
            this.Field_20878 = class_1699.Method_1726("MaxNearbyEntities");
            this.Field_20875 = class_1699.Method_1726("RequiredPlayerRange");
        }
        if (class_1699.Method_1715("SpawnRange", 6259 & 18411)) {
            this.Field_20883 = class_1699.Method_1726("SpawnRange");
        }
        if (this.Method_20899() != null) {
            this.Field_20872 = null;
        }
    }

    public abstract Class_4751 Method_20885();

    private Class_1061 Method_20886(Class_1061 class_1061, boolean bl) {
        if (this.Method_20891() != null) {
            Object object;
            Object object22;
            Object object3 = new Class_1699();
            class_1061.Method_1282((Class_1699)object3);
            for (Object object22 : Class_27681.Method_27687(this.Method_20891()).Method_1710()) {
                object = Class_27681.Method_27687(this.Method_20891()).Method_1720((String)object22);
                ((Class_1699)object3).Method_1744((String)object22, ((Class_1674)object).Method_1677());
            }
            class_1061.Method_1318((Class_1699)object3);
            if (class_1061.Field_1089 != null && bl) {
                class_1061.Field_1089.Method_350(class_1061);
            }
            object22 = class_1061;
            while (((Class_1699)object3).Method_1715("Riding", 21006 & -24086)) {
                Class_1699 class_1699 = ((Class_1699)object3).Method_1703("Riding");
                object = Class_15516.Method_15559(class_1699.Method_1708("id"), class_1061.Field_1089);
                if (object != null) {
                    Class_1699 class_16992 = new Class_1699();
                    ((Class_1061)object).Method_1282(class_16992);
                    for (String string : class_1699.Method_1710()) {
                        Class_1674 class_1674 = class_1699.Method_1720(string);
                        class_16992.Method_1744(string, class_1674.Method_1677());
                    }
                    ((Class_1061)object).Method_1318(class_16992);
                    ((Class_1061)object).Method_1239(((Class_1061)object22).Field_1130, ((Class_1061)object22).Method_1324(), ((Class_1061)object22).Field_1106, ((Class_1061)object22).Field_1079, ((Class_1061)object22).Field_1093);
                    if (class_1061.Field_1089 != null && bl) {
                        class_1061.Field_1089.Method_350((Class_1061)object);
                    }
                    ((Class_1061)object22).Method_1163((Class_1061)object);
                }
                object22 = object;
                object3 = class_1699;
            }
        } else if (class_1061 instanceof Class_859 && class_1061.Field_1089 != null && bl) {
            if (class_1061 instanceof Class_34093) {
                ((Class_34093)class_1061).Method_34169(class_1061.Field_1089.Method_364(new Class_4751(class_1061)), null);
            }
            class_1061.Field_1089.Method_350(class_1061);
        }
        return class_1061;
    }

    public abstract void Method_20887(int var1);

    public boolean Method_20888(int n) {
        if (n == (4893 & 8195) && this.Method_20899().Field_306) {
            this.Field_20876 = this.Field_20880;
            return (1479 & -11735) != 0;
        }
        return (32 & 5834) != 0;
    }

    public double Method_20889() {
        return this.Field_20882;
    }

    public void Method_20890(Class_1699 class_1699) {
        String string = this.Method_20897();
        if (!Class_35310.Method_35315(string)) {
            class_1699.Method_1702("EntityId", string);
            class_1699.Method_1731("Delay", (short)this.Field_20876);
            class_1699.Method_1731("MinSpawnDelay", (short)this.Field_20880);
            class_1699.Method_1731("MaxSpawnDelay", (short)this.Field_20877);
            class_1699.Method_1731("SpawnCount", (short)this.Field_20873);
            class_1699.Method_1731("MaxNearbyEntities", (short)this.Field_20878);
            class_1699.Method_1731("RequiredPlayerRange", (short)this.Field_20875);
            class_1699.Method_1731("SpawnRange", (short)this.Field_20883);
            if (this.Method_20891() != null) {
                class_1699.Method_1744("SpawnData", Class_27681.Method_27687(this.Method_20891()).Method_1732());
            }
            if (this.Method_20891() != null || this.Field_20874.size() > 0) {
                Class_1758 class_1758 = new Class_1758();
                if (this.Field_20874.size() > 0) {
                    for (Class_27681 class_27681 : this.Field_20874) {
                        class_1758.Method_1781(class_27681.Method_27688());
                    }
                } else {
                    class_1758.Method_1781(this.Method_20891().Method_27688());
                }
                class_1699.Method_1744("SpawnPotentials", class_1758);
            }
        }
    }

    private Class_27681 Method_20891() {
        return this.Field_20879;
    }

    private void Method_20892() {
        if (this.Field_20877 <= this.Field_20880) {
            this.Field_20876 = this.Field_20880;
        } else {
            int n = this.Field_20877 - this.Field_20880;
            this.Field_20876 = this.Field_20880 + this.Method_20899().Field_307.nextInt(n);
        }
        if (this.Field_20874.size() > 0) {
            this.Method_20893((Class_27681)Class_27139.Method_27144(this.Method_20899().Field_307, this.Field_20874));
        }
        this.Method_20887(20489 & -30393);
    }

    public void Method_20893(Class_27681 class_27681) {
        this.Field_20879 = class_27681;
    }

    public void Method_20894(String string) {
        this.Field_20881 = string;
    }

    private void Method_20895() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_20896() {
        if (this.Method_20900()) {
            Class_4751 class_4751 = this.Method_20885();
            if (this.Method_20899().Field_306) {
                double d = (float)class_4751.\u0000= final() + this.Method_20899().Field_307.nextFloat();
                double d2 = (float)class_4751.\u0000, `() + this.Method_20899().Field_307.nextFloat();
                double d3 = (float)class_4751.\u0000strictfp() + this.Method_20899().Field_307.nextFloat();
                this.Method_20899().Method_407(Class_40274.Field_40283, d, d2, d3, 0.0, 0.0, 0.0, new int[48 & 520]);
                this.Method_20899().Method_407(Class_40274.Field_40318, d, d2, d3, 0.0, 0.0, 0.0, new int[17585 & 8520]);
                if (this.Field_20876 > 0) {
                    this.Field_20876 -= 16417 & 12289;
                }
                this.Field_20882 = this.Field_20871;
                this.Field_20871 = (this.Field_20871 + (double)(0.7012987f * 1425.9259f / ((float)this.Field_20876 + 0.79591835f * 251.28206f))) % (0.3108108108108108 * 1158.2608695652175);
            } else {
                if (this.Field_20876 == (-1 & -1)) {
                    this.Method_20892();
                }
                if (this.Field_20876 > 0) {
                    this.Field_20876 -= 17029 & -27613;
                    return;
                }
                int n = -32638 & 19976;
                for (int i = 68 & 34; i < this.Field_20873; ++i) {
                    Class_1061 class_1061 = Class_15516.Method_15559(this.Method_20897(), this.Method_20899());
                    if (class_1061 == null) {
                        return;
                    }
                    int n2 = this.Method_20899().Method_488(class_1061.getClass(), new Class_10997(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), class_4751.\u0000= final() + (4325 & 9473), class_4751.\u0000, `() + (-32475 & 17547), class_4751.\u0000strictfp() + (6659 & 24897)).Method_11017(this.Field_20883, this.Field_20883, this.Field_20883)).size();
                    if (n2 >= this.Field_20878) {
                        this.Method_20892();
                        return;
                    }
                    double d = (double)class_4751.\u0000= final() + (this.Method_20899().Field_307.nextDouble() - this.Method_20899().Field_307.nextDouble()) * (double)this.Field_20883 + 0.075 * 6.666666666666667;
                    double d4 = class_4751.\u0000, `() + this.Method_20899().Field_307.nextInt(8195 & 17799) - (273 & 18441);
                    double d5 = (double)class_4751.\u0000strictfp() + (this.Method_20899().Field_307.nextDouble() - this.Method_20899().Field_307.nextDouble()) * (double)this.Field_20883 + 2.25 * 0.2222222222222222;
                    Class_34093 class_34093 = class_1061 instanceof Class_34093 ? (Class_34093)class_1061 : null;
                    class_1061.Method_1239(d, d4, d5, this.Method_20899().Field_307.nextFloat() * (155.82089f * 2.310345f), 0.0f);
                    if (class_34093 != null && (!class_34093.Method_34143() || !class_34093.Method_34155())) continue;
                    this.Method_20886(class_1061, (401 & 1057) != 0);
                    this.Method_20899().Method_502(-4106 & 6100, class_4751, 56 & 19584);
                    if (class_34093 != null) {
                        class_34093.Method_34189();
                    }
                    n = 8517 & 163;
                }
                if (n != 0) {
                    this.Method_20892();
                }
            }
        }
    }

    private String Method_20897() {
        if (this.Method_20891() == null) {
            if (this.Field_20881 != null && this.Field_20881.equals("Minecart")) {
                this.Field_20881 = "MinecartRideable";
            }
            return this.Field_20881;
        }
        return Class_27681.Method_27686(this.Method_20891());
    }

    public Class_1061 Method_20898(Class_283 class_283) {
        Class_1061 class_1061;
        if (this.Field_20872 == null && (class_1061 = Class_15516.Method_15559(this.Method_20897(), class_283)) != null) {
            this.Field_20872 = class_1061 = this.Method_20886(class_1061, (3 & 128) != 0);
        }
        return this.Field_20872;
    }

    public abstract Class_283 Method_20899();

    private boolean Method_20900() {
        Class_4751 class_4751 = this.Method_20885();
        return this.Method_20899().Method_425((double)class_4751.\u0000= final() + 0.7241379310344828 * 0.6904761904761905, (double)class_4751.\u0000, `() + 1.017857142857143 * 0.49122807017543857, (double)class_4751.\u0000strictfp() + 5.125 * 0.0975609756097561, this.Field_20875);
    }

    public double Method_20901() {
        return this.Field_20871;
    }
}

