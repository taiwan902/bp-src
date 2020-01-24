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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Class_45310
extends Class_31428 {
    private int Field_45311 = 1586 & 14625;
    private List Field_45312 = Lists.newArrayList();
    private int Field_45313 = 8345 & 1544;
    private static final List Field_45314;

    public Class_45310(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.Field_45311 = Class_13337.Method_13386((String)entry.getValue(), this.Field_45311, this.Field_45313 + (1313 & 73));
        }
    }

    protected boolean Method_45315(int n, int n2) {
        int n3 = n;
        int n4 = n2;
        if (n < 0) {
            n -= this.Field_45311 - (4171 & 11153);
        }
        if (n2 < 0) {
            n2 -= this.Field_45311 - (-31387 & 16385);
        }
        int n5 = n / this.Field_45311;
        int n6 = n2 / this.Field_45311;
        Random random = this.\u0000strictfp.Method_424(n5, n6, 148575357 & -1528883599);
        n5 *= this.Field_45311;
        n6 *= this.Field_45311;
        if (n3 == (n5 += random.nextInt(this.Field_45311 - this.Field_45313)) && n4 == (n6 += random.nextInt(this.Field_45311 - this.Field_45313))) {
            Class_17281 class_17281 = this.\u0000strictfp.Method_371().Method_31925(new Class_4751(n3 * (48 & 22550) + (796 & 14472), 1040 & -31867, n4 * (272 & 25748) + (10504 & -28664)));
            if (class_17281 == null) {
                return (336 & -20318) != 0;
            }
            for (Class_17281 class_172812 : Field_45314) {
                if (class_17281 != class_172812) continue;
                return (-29679 & 589) != 0;
            }
        }
        return (292 & 16984) != 0;
    }

    public String Method_45316() {
        return "Temple";
    }

    public List Method_45317() {
        return this.Field_45312;
    }

    private void Method_45318() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_45319(Class_4751 class_4751) {
        Class_18019 class_18019 = this.\u0000strictfp(class_4751);
        if (class_18019 != null && class_18019 instanceof Class_28327 && !class_18019.Field_18020.isEmpty()) {
            Class_13400 class_13400 = (Class_13400)class_18019.Field_18020.getFirst();
            return class_13400 instanceof Class_36967;
        }
        return (15618 & -32635) != 0;
    }

    public Class_45310() {
        this.Field_45312.add(new Class_31871(Class_44826.class, 24577 & -32427, -7915 & 3115, 133 & -11733));
    }

    protected Class_18019 Method_45320(int n, int n2) {
        return new Class_28327(this.\u0000strictfp, this.\u0000strictfp, n, n2);
    }

    static {
        Class_17281[] arrclass_17281 = new Class_17281[-28505 & 18453];
        arrclass_17281[2050 & 18380] = Class_17281.Field_17321;
        arrclass_17281[2663 & -28663] = Class_17281.Field_17319;
        arrclass_17281[659 & -6034] = Class_17281.Field_17335;
        arrclass_17281[-9725 & 8419] = Class_17281.Field_17289;
        arrclass_17281[-14316 & 4261] = Class_17281.Field_17337;
        Field_45314 = Arrays.asList(arrclass_17281);
    }
}

