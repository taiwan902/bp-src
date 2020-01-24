/*
 * Decompiled with CFR 0.145.
 */
import java.awt.Rectangle;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_36976 {
    private Class_23295 Field_36977;
    private int Field_36978 = -16319 & 30;
    private Class_1490 Field_36979;
    private long Field_36980 = 1037695340584513989L & 23166984L;
    private int Field_36981 = 16656 & 0;

    public Class_36976(Class_1490 class_1490, Class_23295 class_23295) {
        this.Field_36979 = class_1490;
        this.Field_36977 = class_23295;
    }

    private void Method_36982() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_36983(int n, int n2, int n3, int n4, int n5) {
        Class_1551.Method_1558(n, n2 - (-31743 & 24637), n3, n2, n5);
        Class_1551.Method_1558(n, n4, n3, n4 + (-30175 & 1369), n5);
        Class_1551.Method_1558(n - (16433 & 15371), n2, n, n4, n5);
        Class_1551.Method_1558(n3, n2, n3 + (11457 & 1), n4, n5);
    }

    public void Method_36984(int n, int n2, List list) {
        if (Math.abs(n - this.Field_36981) <= (25669 & -27899) && Math.abs(n2 - this.Field_36978) <= (8231 & 18949)) {
            Class_42376 class_42376;
            int n3 = -30020 & 25277;
            if (System.currentTimeMillis() >= this.Field_36980 + (long)n3 && (class_42376 = Class_30038.Method_30041(n, n2, list)) != null) {
                Rectangle rectangle = this.Field_36977.Method_23296(this.Field_36979, n, n2);
                String[] arrstring = this.Field_36977.Method_23298(class_42376, rectangle.width);
                if (arrstring != null) {
                    int n4;
                    if (this.Field_36977.Method_23297()) {
                        n4 = -394166144 & -252790619;
                        this.Method_36983(rectangle.x, rectangle.y, rectangle.x + rectangle.width, rectangle.y + rectangle.height, n4);
                    }
                    Class_1551.Method_1558(rectangle.x, rectangle.y, rectangle.x + rectangle.width, rectangle.y + rectangle.height, -167081984 & -526383317);
                    for (n4 = -19452 & 16536; n4 < arrstring.length; ++n4) {
                        String string = arrstring[n4];
                        int n5 = -891420705 & 14540285;
                        if (string.endsWith("!")) {
                            n5 = 33515044 & 285188384;
                        }
                        Class_28636 class_28636 = Class_18.Field_89.Field_27;
                        class_28636.Method_28729(string, rectangle.x + (24581 & -25651), rectangle.y + (-31219 & 2247) + n4 * (-14065 & 1067), n5);
                    }
                }
            }
        } else {
            this.Field_36981 = n;
            this.Field_36978 = n2;
            this.Field_36980 = System.currentTimeMillis();
        }
    }
}

