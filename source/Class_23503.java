/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23503
implements Class_14246 {
    private final Class_18 Field_23504 = Class_18.Field_89;
    private final Class_1551 Field_23505;
    private final Class_1551 Field_23506;
    private Class_1551 Field_23507;

    public void Method_23508(int n, int n2, int n3, int n4, int n5, int n6) {
        this.Method_23522(this.Field_23506, n2, n3, n4);
        this.Method_23522(this.Field_23505, n2, n3, n4);
    }

    private void Method_23509(Class_42376 class_42376, int n, int n2, int n3, boolean bl) {
        class_42376.Field_42390 = n;
        if (!bl) {
            class_42376.Method_42401(this.Field_23504, n2, n3);
        }
    }

    static Class_1551 Method_23510(Class_23503 class_23503) {
        return class_23503.Field_23507;
    }

    public Class_23503(Class_1551 class_1551, Class_1551 class_15512) {
        this.Field_23506 = class_1551;
        this.Field_23505 = class_15512;
    }

    static Class_1551 Method_23511(Class_23503 class_23503) {
        return class_23503.Field_23506;
    }

    public void Method_23512(int n, int n2, int n3) {
        this.Method_23513(this.Field_23506, n3, 17413 & 9120, 9569 & 22544, (195 & 31233) != 0);
        this.Method_23513(this.Field_23505, n3, 810 & 8324, 17 & 12544, (25 & 16389) != 0);
    }

    private void Method_23513(Class_1551 class_1551, int n, int n2, int n3, boolean bl) {
        if (class_1551 != null) {
            if (class_1551 instanceof Class_42376) {
                this.Method_23509((Class_42376)class_1551, n, n2, n3, bl);
            } else if (class_1551 instanceof Class_38813) {
                this.Method_23516((Class_38813)class_1551, n, bl);
            } else if (class_1551 instanceof Class_36766) {
                this.Method_23517((Class_36766)class_1551, n, n2, n3, bl);
            }
        }
    }

    private void Method_23514(Class_38813 class_38813, int n, int n2, int n3) {
        class_38813.Method_38855(n, n2, n3);
        if (class_38813.Method_38861()) {
            this.Field_23507 = class_38813;
        }
    }

    public Class_1551 Method_23515() {
        return this.Field_23505;
    }

    private void Method_23516(Class_38813 class_38813, int n, boolean bl) {
        class_38813.Field_38832 = n;
        if (!bl) {
            class_38813.Method_38849();
        }
    }

    private void Method_23517(Class_36766 class_36766, int n, int n2, int n3, boolean bl) {
        class_36766.Field_36770 = n;
        if (!bl) {
            class_36766.Method_36784(this.Field_23504, n2, n3);
        }
    }

    public void Method_23518(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        this.Method_23513(this.Field_23506, n3, n6, n7, (3090 & 4608) != 0);
        this.Method_23513(this.Field_23505, n3, n6, n7, (-5936 & 1062) != 0);
    }

    private boolean Method_23519(Class_42376 class_42376, int n, int n2, int n3) {
        boolean bl = class_42376.Method_42404(this.Field_23504, n, n2);
        if (bl) {
            this.Field_23507 = class_42376;
        }
        return bl;
    }

    public boolean Method_23520(int n, int n2, int n3, int n4, int n5, int n6) {
        boolean bl = this.Method_23524(this.Field_23506, n2, n3, n4);
        boolean bl2 = this.Method_23524(this.Field_23505, n2, n3, n4);
        return (bl || bl2 ? 2497 & 16421 : 12352 & -32639) != 0;
    }

    private void Method_23521() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_23522(Class_1551 class_1551, int n, int n2, int n3) {
        if (class_1551 != null && class_1551 instanceof Class_42376) {
            this.Method_23523((Class_42376)class_1551, n, n2, n3);
        }
    }

    private void Method_23523(Class_42376 class_42376, int n, int n2, int n3) {
        class_42376.Method_42393(n, n2);
    }

    private boolean Method_23524(Class_1551 class_1551, int n, int n2, int n3) {
        if (class_1551 == null) {
            return (-29176 & 4496) != 0;
        }
        if (class_1551 instanceof Class_42376) {
            return this.Method_23519((Class_42376)class_1551, n, n2, n3);
        }
        if (class_1551 instanceof Class_38813) {
            this.Method_23514((Class_38813)class_1551, n, n2, n3);
        }
        return (1556 & -3646) != 0;
    }

    static Class_1551 Method_23525(Class_23503 class_23503) {
        return class_23503.Field_23505;
    }

    public Class_1551 Method_23526() {
        return this.Field_23506;
    }
}

