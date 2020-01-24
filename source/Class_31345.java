/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class Class_31345
extends Class_18019 {
    private boolean Field_31346;
    private Set Field_31347 = Sets.newHashSet();

    public Class_31345(Class_283 class_283, Random random, int n, int n2) {
        super(n, n2);
        this.Method_31349(class_283, random, n, n2);
    }

    public boolean Method_31348(Class_29480 class_29480) {
        return (this.Field_31347.contains(class_29480) ? 16519 & 4904 : (int)(super.Method_18034(class_29480) ? 1 : 0)) != 0;
    }

    private void Method_31349(Class_283 class_283, Random random, int n, int n2) {
        random.setSeed(class_283.Method_392());
        long l = random.nextLong();
        long l2 = random.nextLong();
        long l3 = (long)n * l;
        long l4 = (long)n2 * l2;
        random.setSeed(l3 ^ l4 ^ class_283.Method_392());
        int n3 = n * (16402 & 568) + (-31716 & 4104) - (541 & 29);
        int n4 = n2 * (1243 & -24528) + (2124 & 24587) - (2335 & 541);
        Class_4595 class_4595 = Class_4662.Field_4663.Method_4668(random);
        this.\u0000strictfp.add(new Class_23907(random, n3, n4, class_4595));
        this.\u0000strictfp();
        this.Field_31346 = 21867 & -24571;
    }

    public Class_31345() {
    }

    public void Method_31350(Class_283 class_283, Random random, Class_42666 class_42666) {
        if (!this.Field_31346) {
            this.\u0000strictfp.clear();
            this.Method_31349(class_283, random, this.\u0000, `(), this.\u0000strictfp());
        }
        super.Method_18039(class_283, random, class_42666);
    }

    public void Method_31351(Class_1699 class_1699) {
        super.Method_18024(class_1699);
        if (class_1699.Method_1715("Processed", 11 & 8989)) {
            Class_1758 class_1758 = class_1699.Method_1735("Processed", 16395 & 12554);
            for (int i = 21224 & 9476; i < class_1758.Method_1772(); ++i) {
                Class_1699 class_16992 = class_1758.Method_1768(i);
                this.Field_31347.add(new Class_29480(class_16992.Method_1738("X"), class_16992.Method_1738("Z")));
            }
        }
    }

    public void Method_31352(Class_1699 class_1699) {
        super.Method_18028(class_1699);
        Class_1758 class_1758 = new Class_1758();
        for (Class_29480 class_29480 : this.Field_31347) {
            Class_1699 class_16992 = new Class_1699();
            class_16992.Method_1739("X", class_29480.Field_29483);
            class_16992.Method_1739("Z", class_29480.Field_29482);
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Processed", class_1758);
    }

    public void Method_31353(Class_29480 class_29480) {
        super.Method_18032(class_29480);
        this.Field_31347.add(class_29480);
    }

    private void Method_31354() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

