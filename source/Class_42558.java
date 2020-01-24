/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Set;

public class Class_42558
implements Class_1486 {
    private double Field_42559;
    private double Field_42560;
    private double Field_42561;
    private float Field_42562;
    private float Field_42563;
    private Set Field_42564;

    public Set Method_42565() {
        return this.Field_42564;
    }

    public void Method_42566(Class_29900 class_29900) {
        class_29900.Method_29941(this.Field_42560);
        class_29900.Method_29941(this.Field_42559);
        class_29900.Method_29941(this.Field_42561);
        class_29900.Method_29939(this.Field_42562);
        class_29900.Method_29939(this.Field_42563);
        class_29900.Method_29949(Class_33501.Method_33513(this.Field_42564));
    }

    public Class_42558(double d, double d2, double d3, float f, float f2, Set set) {
        this.Field_42560 = d;
        this.Field_42559 = d2;
        this.Field_42561 = d3;
        this.Field_42562 = f;
        this.Field_42563 = f2;
        this.Field_42564 = set;
    }

    public Class_42558() {
    }

    public double Method_42567() {
        return this.Field_42559;
    }

    private void Method_42568() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_42569(Class_29900 class_29900) {
        this.Field_42560 = class_29900.Method_29948();
        this.Field_42559 = class_29900.Method_29948();
        this.Field_42561 = class_29900.Method_29948();
        this.Field_42562 = class_29900.Method_29966();
        this.Field_42563 = class_29900.Method_29966();
        this.Field_42564 = Class_33501.Method_33511(class_29900.Method_30016());
    }

    public void Method_42570(Class_14856 class_14856) {
        class_14856.Method_14864(this);
    }

    public float Method_42571() {
        return this.Field_42563;
    }

    public float Method_42572() {
        return this.Field_42562;
    }

    public void Method_42573(Class_10954 class_10954) {
        this.Method_42570((Class_14856)class_10954);
    }

    public double Method_42574() {
        return this.Field_42561;
    }

    public double Method_42575() {
        return this.Field_42560;
    }
}

