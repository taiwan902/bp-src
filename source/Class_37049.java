/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Class_37049
extends Class_31428 {
    private static final List Field_37050;
    private int Field_37051 = 4657 & -16352;
    public static final List Field_37052;
    private int Field_37053 = -12259 & 8741;

    private void Method_37054() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected boolean Method_37055(int n, int n2) {
        int n3 = n;
        int n4 = n2;
        if (n < 0) {
            n -= this.Field_37051 - (-7893 & 209);
        }
        if (n2 < 0) {
            n2 -= this.Field_37051 - (16385 & -32635);
        }
        int n5 = n / this.Field_37051;
        int n6 = n2 / this.Field_37051;
        Random random = this.\u0000strictfp.Method_424(n5, n6, 144670705 & 79626111);
        n5 *= this.Field_37051;
        n6 *= this.Field_37051;
        if (n3 == (n5 += (random.nextInt(this.Field_37051 - this.Field_37053) + random.nextInt(this.Field_37051 - this.Field_37053)) / (546 & 17415)) && n4 == (n6 += (random.nextInt(this.Field_37051 - this.Field_37053) + random.nextInt(this.Field_37051 - this.Field_37053)) / (20994 & 35))) {
            if (this.\u0000strictfp.Method_371().Method_31924(new Class_4751(n3 * (17424 & 10268) + (8744 & 332), 13376 & 716, n4 * (20496 & -31629) + (520 & 2184)), null) != Class_17281.Field_17338) {
                return (16434 & 3080) != 0;
            }
            boolean bl = this.\u0000strictfp.Method_371().Method_31926(n3 * (-32742 & 16692) + (393 & -13300), n4 * (26 & 17365) + (4344 & 9481), 1565 & 18719, Field_37052);
            if (bl) {
                return (24611 & -32059) != 0;
            }
        }
        return (1216 & 6168) != 0;
    }

    protected Class_18019 Method_37056(int n, int n2) {
        return new Class_31345(this.\u0000strictfp, this.\u0000strictfp, n, n2);
    }

    static {
        Class_17281[] arrclass_17281 = new Class_17281[17229 & 6151];
        arrclass_17281[1536 & 24704] = Class_17281.Field_17303;
        arrclass_17281[17955 & -24107] = Class_17281.Field_17338;
        arrclass_17281[25622 & 66] = Class_17281.Field_17357;
        arrclass_17281[-15085 & 547] = Class_17281.Field_17304;
        arrclass_17281[53 & 18758] = Class_17281.Field_17342;
        Field_37052 = Arrays.asList(arrclass_17281);
        Field_37050 = Lists.newArrayList();
        Field_37050.add(new Class_31871(Class_44640.class, 28961 & -32767, 17542 & 4106, -32156 & 14349));
    }

    public String Method_37057() {
        return "Monument";
    }

    public Class_37049() {
    }

    public List Method_37058() {
        return Field_37050;
    }

    public Class_37049(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("spacing")) {
                this.Field_37051 = Class_13337.Method_13386((String)entry.getValue(), this.Field_37051, 16417 & 645);
                continue;
            }
            if (!((String)entry.getKey()).equals("separation")) continue;
            this.Field_37053 = Class_13337.Method_13386((String)entry.getValue(), this.Field_37053, -13759 & 297);
        }
    }
}

