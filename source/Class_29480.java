/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_29480 {
    private int Field_29481 = 176 & 16642;
    public final int Field_29482;
    public final int Field_29483;

    private void Method_29484() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_29485() {
        return this.Field_29482 << (-31482 & 8868);
    }

    public Class_4751 Method_29486(int n) {
        return new Class_4751(this.Method_29494(), n, this.Method_29491());
    }

    public int Method_29487() {
        return this.Field_29483 << (4 & 5636);
    }

    public int Method_29488() {
        return (this.Field_29483 << (8196 & -30170)) + (17439 & 8911);
    }

    public boolean Method_29489(Object object) {
        if (this == object) {
            return (33 & 17753) != 0;
        }
        if (!(object instanceof Class_29480)) {
            return (-14078 & 4176) != 0;
        }
        Class_29480 class_29480 = (Class_29480)object;
        return (this.Field_29483 == class_29480.Field_29483 && this.Field_29482 == class_29480.Field_29482 ? 17539 & -18363 : 16 & 16480) != 0;
    }

    public Class_29480(int n, int n2) {
        this.Field_29483 = n;
        this.Field_29482 = n2;
        int n3 = (1795725 & -1661114497) * this.Field_29483 + (1030681439 & 1022293855);
        int n4 = (576415501 & 278492717) * (this.Field_29482 ^ -5243153 & -554844417) + (1013904351 & 1047458655);
        this.Field_29481 = n3 ^ n4;
    }

    public static long Method_29490(int n, int n2) {
        return (long)n & (0xFFFFFFFFL & 0xFFFFFFFFL) | ((long)n2 & (1475073184570015743L & -1475073180275048449L)) << (238 & -12512);
    }

    public int Method_29491() {
        return (this.Field_29482 << (4324 & 9228)) + (29484 & -32632);
    }

    public String Method_29492() {
        return "[" + this.Field_29483 + ", " + this.Field_29482 + "]";
    }

    public Class_4751 Method_29493(int n, int n2, int n3) {
        return new Class_4751((this.Field_29483 << (-32492 & 24581)) + n, n2, (this.Field_29482 << (125 & 4)) + n3);
    }

    public int Method_29494() {
        return (this.Field_29483 << (7509 & 166)) + (4140 & 10249);
    }

    public int Method_29495() {
        return this.Field_29481;
    }

    public int Method_29496() {
        return (this.Field_29482 << (4110 & 17812)) + (18447 & 527);
    }
}

