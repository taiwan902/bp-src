/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Class_34341
extends Class_31428 {
    private boolean Field_34342;
    private Class_29480[] Field_34343 = new Class_29480[-32765 & 16423];
    private List Field_34344 = Lists.newArrayList();
    private double Field_34345 = 0.3516483516483517 * 91.0;
    private int Field_34346 = 10755 & 17443;

    private void Method_34347() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_34341(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("distance")) {
                this.Field_34345 = Class_13337.Method_13355((String)entry.getValue(), this.Field_34345, 1.0);
                continue;
            }
            if (((String)entry.getKey()).equals("count")) {
                this.Field_34343 = new Class_29480[Class_13337.Method_13386((String)entry.getValue(), this.Field_34343.length, 545 & 6169)];
                continue;
            }
            if (!((String)entry.getKey()).equals("spread")) continue;
            this.Field_34346 = Class_13337.Method_13386((String)entry.getValue(), this.Field_34346, 10525 & 21187);
        }
    }

    public Class_34341() {
        Class_17281[] arrclass_17281 = Class_17281.Method_17425();
        int n = arrclass_17281.length;
        for (int i = -30336 & 24660; i < n; ++i) {
            Class_17281 class_17281 = arrclass_17281[i];
            if (class_17281 == null || !(class_17281.Field_17316 > 0.0f)) continue;
            this.Field_34344.add(class_17281);
        }
    }

    protected List Method_34348() {
        ArrayList arrayList = Lists.newArrayList();
        Class_29480[] arrclass_29480 = this.Field_34343;
        int n = arrclass_29480.length;
        for (int i = -28656 & 24745; i < n; ++i) {
            Class_29480 class_29480 = arrclass_29480[i];
            if (class_29480 == null) continue;
            arrayList.add(class_29480.Method_29486(448 & 14406));
        }
        return arrayList;
    }

    protected boolean Method_34349(int n, int n2) {
        Object object;
        if (!this.Field_34342) {
            object = new Random();
            ((Random)object).setSeed(this.\u0000strictfp.Method_392());
            double d = ((Random)object).nextDouble() * (1.1309733552923256 * 2.7777777777777777) * (1.934782608695652 * 1.0337078651685394);
            int n3 = -30141 & 24613;
            for (int i = 4098 & 8; i < this.Field_34343.length; ++i) {
                double d2 = (4.375 * 0.2857142857142857 * (double)n3 + ((Random)object).nextDouble()) * this.Field_34345 * (double)n3;
                int n4 = (int)Math.round(Math.cos(d) * d2);
                int n5 = (int)Math.round(Math.sin(d) * d2);
                Class_4751 class_4751 = this.\u0000strictfp.Method_371().Method_31933((n4 << (-32236 & 10372)) + (2633 & -6758), (n5 << (516 & -19308)) + (11784 & -16370), 112 & 29815, this.Field_34344, (Random)object);
                if (class_4751 != null) {
                    n4 = class_4751.\u0000= final() >> (900 & 24676);
                    n5 = class_4751.\u0000strictfp() >> (582 & 23861);
                }
                this.Field_34343[i] = new Class_29480(n4, n5);
                d += 7.996781300046746 * 0.7857142857142857 * (double)n3 / (double)this.Field_34346;
                if (i != this.Field_34346) continue;
                n3 += (-32605 & 3394) + ((Random)object).nextInt(5199 & 277);
                this.Field_34346 += (4293 & 1049) + ((Random)object).nextInt(8595 & -29662);
            }
            this.Field_34342 = 19077 & 8193;
        }
        object = this.Field_34343;
        int n6 = ((Class_29480[])object).length;
        for (int i = 1152 & 12353; i < n6; ++i) {
            Object object2 = object[i];
            if (n != ((Class_29480)object2).Field_29483 || n2 != ((Class_29480)object2).Field_29482) continue;
            return (-22461 & 417) != 0;
        }
        return (24832 & 3098) != 0;
    }

    protected Class_18019 Method_34350(int n, int n2) {
        Class_25916 class_25916 = new Class_25916(this.\u0000strictfp, this.\u0000strictfp, n, n2);
        while (class_25916.\u0000strictfp().isEmpty() || ((Class_45837)class_25916.\u0000strictfp().get((int)(320 & -30576))).Field_45839 == null) {
            class_25916 = new Class_25916(this.\u0000strictfp, this.\u0000strictfp, n, n2);
        }
        return class_25916;
    }

    public String Method_34351() {
        return "Stronghold";
    }
}

