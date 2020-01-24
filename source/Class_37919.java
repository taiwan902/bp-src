/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.Multimap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Set;
import java.util.UUID;

public class Class_37919
extends Class_1956 {
    protected Class_16800 Field_37920;
    private Set Field_37921;
    private float Field_37922;
    protected float Field_37923 = 4.055556f * 0.98630136f;

    public boolean Method_37924(Class_23823 class_23823, Class_283 class_283, Class_3238 class_3238, Class_4751 class_4751, Class_859 class_859) {
        if ((double)class_3238.Method_3420(class_283, class_4751) != 0.0) {
            class_23823.Method_23883(11703 & 16457, class_859);
        }
        return (-24499 & 4131) != 0;
    }

    public boolean Method_37925() {
        return (4611 & 10569) != 0;
    }

    protected Class_37919(float f, Class_16800 class_16800, Set set) {
        this.Field_37920 = class_16800;
        this.Field_37921 = set;
        this.\u0000strictfp = 709 & -28383;
        this.\u0000strictfp(class_16800.Method_16822());
        this.Field_37923 = class_16800.Method_16824();
        this.Field_37922 = f + class_16800.Method_16816();
        this.\u0000strictfp(Class_3987.Field_3991);
    }

    public Class_16800 Method_37926() {
        return this.Field_37920;
    }

    public boolean Method_37927(Class_23823 class_23823, Class_23823 class_238232) {
        return (this.Field_37920.Method_16812() == class_238232.Method_23844() ? 7257 & 261 : (int)(super.Method_1998(class_23823, class_238232) ? 1 : 0)) != 0;
    }

    public Multimap Method_37928() {
        Multimap multimap = super.Method_2012();
        multimap.put((Object)Class_21716.Field_21717.Method_22373(), (Object)new Class_10375(\u0000strictfp, "Tool modifier", this.Field_37922, -16168 & 3072));
        return multimap;
    }

    public int Method_37929() {
        return this.Field_37920.Method_16814();
    }

    public boolean Method_37930(Class_23823 class_23823, Class_859 class_859, Class_859 class_8592) {
        class_23823.Method_23883(354 & 9362, class_8592);
        return (20625 & 621) != 0;
    }

    private void Method_37931() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_37932(Class_23823 class_23823, Class_3238 class_3238) {
        return this.Field_37921.contains(class_3238) ? this.Field_37923 : 1.0f;
    }

    public String Method_37933() {
        return this.Field_37920.toString();
    }
}

