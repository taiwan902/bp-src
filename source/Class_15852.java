/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.vector.Vector3f
 */
import internal.org.lwjgl.util.vector.Vector3f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15852 {
    public static float Field_15853;
    public static float Field_15854;
    public static float Field_15855;
    public final Class_12058 Field_15856;
    public static float Field_15857;
    public static float Field_15858;
    public final Class_12058 Field_15859;
    public final Class_12058 Field_15860;
    public final Class_12058 Field_15861;
    public static float Field_15862;
    public static float Field_15863;
    public final Class_12058 Field_15864;
    public final Class_12058 Field_15865;
    public static final Class_15852 Field_15866;
    public static float Field_15867;
    public static float Field_15868;

    private void Method_15869() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_12058 Method_15870(Class_7673 class_7673) {
        switch (Class_8746.Field_8747[class_7673.ordinal()]) {
            case 1: {
                return this.Field_15860;
            }
            case 2: {
                return this.Field_15856;
            }
            case 3: {
                return this.Field_15864;
            }
            case 4: {
                return this.Field_15861;
            }
            case 5: {
                return this.Field_15865;
            }
            case 6: {
                return this.Field_15859;
            }
        }
        return Class_12058.Field_12061;
    }

    static {
        Field_15866 = new Class_15852();
        Field_15855 = 0.0f;
        Field_15868 = 0.0f;
        Field_15867 = 0.0f;
        Field_15863 = 0.0f;
        Field_15858 = 0.0f;
        Field_15862 = 0.0f;
        Field_15853 = 0.0f;
        Field_15857 = 0.0f;
        Field_15854 = 0.0f;
    }

    private Class_15852() {
        this(Class_12058.Field_12061, Class_12058.Field_12061, Class_12058.Field_12061, Class_12058.Field_12061, Class_12058.Field_12061, Class_12058.Field_12061);
    }

    public boolean Method_15871(Class_7673 class_7673) {
        return (!this.Method_15870(class_7673).Method_12064(Class_12058.Field_12061) ? 12425 & 20039 : -24559 & 1378) != 0;
    }

    public Class_15852(Class_12058 class_12058, Class_12058 class_120582, Class_12058 class_120583, Class_12058 class_120584, Class_12058 class_120585, Class_12058 class_120586) {
        this.Field_15860 = class_12058;
        this.Field_15856 = class_120582;
        this.Field_15864 = class_120583;
        this.Field_15861 = class_120584;
        this.Field_15865 = class_120585;
        this.Field_15859 = class_120586;
    }

    public void Method_15872(Class_7673 class_7673) {
        Class_12058 class_12058 = this.Method_15870(class_7673);
        if (class_12058 != Class_12058.Field_12061) {
            Class_16867.Method_16943(class_12058.Field_12060.x + Field_15855, class_12058.Field_12060.y + Field_15868, class_12058.Field_12060.z + Field_15867);
            Class_16867.Method_16940(class_12058.Field_12062.y + Field_15858, 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16940(class_12058.Field_12062.x + Field_15863, 1.0f, 0.0f, 0.0f);
            Class_16867.Method_16940(class_12058.Field_12062.z + Field_15862, 0.0f, 0.0f, 1.0f);
            Class_16867.Method_16973(class_12058.Field_12059.x + Field_15853, class_12058.Field_12059.y + Field_15857, class_12058.Field_12059.z + Field_15854);
        }
    }
}

