/*
 * Decompiled with CFR 0.145.
 */
import java.awt.Rectangle;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26089
implements Class_23295 {
    public String[] Method_26090(Class_42376 class_42376, int n) {
        if (!(class_42376 instanceof Class_47775)) {
            return null;
        }
        Class_47775 class_47775 = (Class_47775)class_42376;
        Class_11452 class_11452 = class_47775.Method_47777();
        String[] arrstring = this.Method_26093(class_11452);
        return arrstring;
    }

    private void Method_26091() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_26092() {
        return (4225 & 17) != 0;
    }

    private String[] Method_26093(Class_11452 class_11452) {
        return Class_25605.Method_25609(class_11452.Method_11504());
    }

    public Rectangle Method_26094(Class_1490 class_1490, int n, int n2) {
        int n3 = class_1490.Field_1507 - (17346 & 5602);
        int n4 = 8375 & 16931;
        if (n3 < (-32502 & 46)) {
            n3 = 8346 & -12245;
        }
        if (n2 <= n4 + (28767 & -29986)) {
            n4 += 100;
        }
        int n5 = n3 + (438 & 222) + (2007 & 4246);
        int n6 = n4 + (24669 & 5462) + (16459 & 4154);
        return new Rectangle(n3, n4, n5 - n3, n6 - n4);
    }
}

