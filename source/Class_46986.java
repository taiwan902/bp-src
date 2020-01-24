/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_46986
extends Class_46488 {
    private final int Field_46987;
    private final int Field_46988;
    final Class_32257 Field_46989;

    private void Method_46990() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_46986(Class_32257 class_32257, int n, int n2, int n3, int n4, int n5) {
        this.Field_46989 = class_32257;
        super(n, n2, n3, Class_1906.Field_1923, (2048 & -32768) + Class_8338.Field_8341[n4].Method_8425() % (4185 & 14) * (3099 & 4274), (4815 & 18678) + Class_8338.Field_8341[n4].Method_8425() / (1064 & -24359) * (16606 & 12306));
        this.Field_46988 = n4;
        this.Field_46987 = n5;
    }

    public void Method_46991(int n, int n2) {
        String string = Class_9802.Method_9806(Class_8338.Field_8341[this.Field_46988].Method_8411(), new Object[16680 & 9873]);
        if (this.Field_46987 >= (259 & 3587) && this.Field_46988 != Class_8338.Field_8348.Field_8364) {
            string = string + " II";
        }
        Class_32257.Method_32264(this.Field_46989, string, n, n2);
    }
}

