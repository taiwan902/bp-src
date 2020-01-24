/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Class_34191
extends Class_31428 {
    private int Field_34192 = 8360 & 34;
    private int Field_34193;
    private int Field_34194 = -28567 & 10270;
    public static final List Field_34195;

    public Class_34191() {
    }

    private void Method_34196() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_18019 Method_34197(int n, int n2) {
        return new Class_26307(this.\u0000strictfp, this.\u0000strictfp, n, n2, this.Field_34193);
    }

    public Class_34191(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("size")) {
                this.Field_34193 = Class_13337.Method_13386((String)entry.getValue(), this.Field_34193, 16732 & 1568);
                continue;
            }
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.Field_34192 = Class_13337.Method_13386((String)entry.getValue(), this.Field_34192, this.Field_34194 + (1041 & 291));
        }
    }

    public String Method_34198() {
        return "Village";
    }

    static {
        Class_17281[] arrclass_17281 = new Class_17281[12291 & -30905];
        arrclass_17281[4 & 29696] = Class_17281.Field_17318;
        arrclass_17281[1669 & -24541] = Class_17281.Field_17321;
        arrclass_17281[1219 & 58] = Class_17281.Field_17291;
        Field_34195 = Arrays.asList(arrclass_17281);
    }

    protected boolean Method_34199(int n, int n2) {
        boolean bl;
        int n3 = n;
        int n4 = n2;
        if (n < 0) {
            n -= this.Field_34192 - (17537 & 67);
        }
        if (n2 < 0) {
            n2 -= this.Field_34192 - (8321 & 1285);
        }
        int n5 = n / this.Field_34192;
        int n6 = n2 / this.Field_34192;
        Random random = this.\u0000strictfp.Method_424(n5, n6, -1996488840 & 1621000054);
        n5 *= this.Field_34192;
        n6 *= this.Field_34192;
        if (n3 == (n5 += random.nextInt(this.Field_34192 - this.Field_34194)) && n4 == (n6 += random.nextInt(this.Field_34192 - this.Field_34194)) && (bl = this.\u0000strictfp.Method_371().Method_31926(n3 * (8241 & -30184) + (1368 & 4617), n4 * (-22255 & 16466) + (-31558 & 77), 232 & 20225, Field_34195))) {
            return (13377 & 16429) != 0;
        }
        return (-5982 & 1032) != 0;
    }
}

