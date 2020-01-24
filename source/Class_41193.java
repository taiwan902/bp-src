/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41193
implements Class_1486 {
    private float Field_41194;
    private float Field_41195;
    private static final Class_4751 Field_41196 = new Class_4751(-1 & -1, -1 & -1, -1 & -1);
    private int Field_41197;
    private float Field_41198;
    private Class_4751 Field_41199;
    private Class_23823 Field_41200;

    public Class_41193(Class_4751 class_4751, int n, Class_23823 class_23823, float f, float f2, float f3) {
        this.Field_41199 = class_4751;
        this.Field_41197 = n;
        this.Field_41200 = class_23823 != null ? class_23823.Method_23850() : null;
        this.Field_41198 = f;
        this.Field_41195 = f2;
        this.Field_41194 = f3;
    }

    public void Method_41201(Class_10930 class_10930) {
        class_10930.Method_10931(this);
    }

    public int Method_41202() {
        return this.Field_41197;
    }

    public Class_23823 Method_41203() {
        return this.Field_41200;
    }

    private void Method_41204() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4751 Method_41205() {
        return this.Field_41199;
    }

    public float Method_41206() {
        return this.Field_41195;
    }

    public void Method_41207(Class_10954 class_10954) {
        this.Method_41201((Class_10930)class_10954);
    }

    public float Method_41208() {
        return this.Field_41198;
    }

    public void Method_41209(Class_29900 class_29900) {
        this.Field_41199 = class_29900.Method_29910();
        this.Field_41197 = class_29900.Method_30016();
        this.Field_41200 = class_29900.Method_30002();
        this.Field_41198 = (float)class_29900.Method_30016() / (42.37838f * 0.37755102f);
        this.Field_41195 = (float)class_29900.Method_30016() / (5.7313433f * 2.7916667f);
        this.Field_41194 = (float)class_29900.Method_30016() / (2.2222223f * 7.2f);
    }

    public Class_41193() {
    }

    public void Method_41210(Class_29900 class_29900) {
        class_29900.Method_29996(this.Field_41199);
        class_29900.Method_29949(this.Field_41197);
        class_29900.Method_29984(this.Field_41200);
        class_29900.Method_29949((int)(this.Field_41198 * (53.81818f * 0.2972973f)));
        class_29900.Method_29949((int)(this.Field_41195 * (0.37894738f * 42.22222f)));
        class_29900.Method_29949((int)(this.Field_41194 * (17.846153f * 0.8965517f)));
    }

    public Class_41193(Class_23823 class_23823) {
        this(Field_41196, 4351 & 255, class_23823, 0.0f, 0.0f, 0.0f);
    }

    public float Method_41211() {
        return this.Field_41194;
    }
}

