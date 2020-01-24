/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23717 {
    final Class_6735 Field_23718;
    public Class_17281[] Field_23719;
    public int Field_23720;
    public int Field_23721;
    public long Field_23722;
    public float[] Field_23723;

    public Class_17281 Method_23724(int n, int n2) {
        return this.Field_23719[n & (-30145 & 8463) | (n2 & (14383 & 31)) << (-32716 & 3334)];
    }

    private void Method_23725() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23717(Class_6735 class_6735, int n, int n2) {
        this.Field_23718 = class_6735;
        this.Field_23723 = new float[-26336 & 1284];
        this.Field_23719 = new Class_17281[4944 & 8463];
        this.Field_23721 = n;
        this.Field_23720 = n2;
        Class_6735.Method_6744(class_6735).Method_31922(this.Field_23723, n << (5124 & 8453), n2 << (1478 & -8188), 16592 & 4114, 12824 & 83);
        Class_6735.Method_6744(class_6735).Method_31927(this.Field_23719, n << (26182 & 2213), n2 << (-31980 & 20614), 17 & 12316, -16368 & 11096, (8464 & 5185) != 0);
    }
}

