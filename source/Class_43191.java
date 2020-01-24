/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Class_43191
extends Class_31916 {
    private float Field_43192;
    private Class_17281 Field_43193;

    public float[] Method_43194(float[] arrf, int n, int n2, int n3, int n4) {
        if (arrf == null || arrf.length < n3 * n4) {
            arrf = new float[n3 * n4];
        }
        Arrays.fill(arrf, 4292 & 16385, n3 * n4, this.Field_43192);
        return arrf;
    }

    public Class_17281 Method_43195(Class_4751 class_4751) {
        return this.Field_43193;
    }

    public Class_43191(Class_17281 class_17281, float f) {
        this.Field_43193 = class_17281;
        this.Field_43192 = f;
    }

    public boolean Method_43196(int n, int n2, int n3, List list) {
        return list.contains(this.Field_43193);
    }

    public Class_17281[] Method_43197(Class_17281[] arrclass_17281, int n, int n2, int n3, int n4) {
        if (arrclass_17281 == null || arrclass_17281.length < n3 * n4) {
            arrclass_17281 = new Class_17281[n3 * n4];
        }
        Arrays.fill(arrclass_17281, 3334 & 513, n3 * n4, this.Field_43193);
        return arrclass_17281;
    }

    private void Method_43198() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_17281[] Method_43199(Class_17281[] arrclass_17281, int n, int n2, int n3, int n4, boolean bl) {
        return this.Method_43200(arrclass_17281, n, n2, n3, n4);
    }

    public Class_17281[] Method_43200(Class_17281[] arrclass_17281, int n, int n2, int n3, int n4) {
        if (arrclass_17281 == null || arrclass_17281.length < n3 * n4) {
            arrclass_17281 = new Class_17281[n3 * n4];
        }
        Arrays.fill(arrclass_17281, 8 & 25138, n3 * n4, this.Field_43193);
        return arrclass_17281;
    }

    public Class_4751 Method_43201(int n, int n2, int n3, List list, Random random) {
        return list.contains(this.Field_43193) ? new Class_4751(n - n3 + random.nextInt(n3 * (-20350 & 1106) + (4099 & 129)), 194 & 20020, n2 - n3 + random.nextInt(n3 * (9123 & 6) + (-28623 & 16515))) : null;
    }
}

