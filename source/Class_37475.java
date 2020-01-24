/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37475
extends Class_28775 {
    private Class_28775 Field_37476;
    private Class_28775 Field_37477;

    private void Method_37478() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_37479(long l) {
        this.Field_37476.Method_28789(l);
        this.Field_37477.Method_28789(l);
        super.Method_28789(l);
    }

    public int[] Method_37480(int n, int n2, int n3, int n4) {
        int[] arrn = this.Field_37476.Method_28781(n, n2, n3, n4);
        int[] arrn2 = this.Field_37477.Method_28781(n, n2, n3, n4);
        int[] arrn3 = Class_10971.Method_10980(n3 * n4);
        for (int i = 17862 & 4136; i < n3 * n4; ++i) {
            if (arrn[i] != Class_17281.Field_17303.Field_17343 && arrn[i] != Class_17281.Field_17338.Field_17343) {
                if (arrn2[i] == Class_17281.Field_17357.Field_17343) {
                    if (arrn[i] == Class_17281.Field_17308.Field_17343) {
                        arrn3[i] = Class_17281.Field_17342.Field_17343;
                        continue;
                    }
                    if (arrn[i] != Class_17281.Field_17301.Field_17343 && arrn[i] != Class_17281.Field_17313.Field_17343) {
                        arrn3[i] = arrn2[i] & (255 & 6399);
                        continue;
                    }
                    arrn3[i] = Class_17281.Field_17313.Field_17343;
                    continue;
                }
                arrn3[i] = arrn[i];
                continue;
            }
            arrn3[i] = arrn[i];
        }
        return arrn3;
    }

    public Class_37475(long l, Class_28775 class_28775, Class_28775 class_287752) {
        super(l);
        this.Field_37476 = class_28775;
        this.Field_37477 = class_287752;
    }
}

