/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class_32499
implements Iterator {
    private int Field_32500;
    private int Field_32501;
    private int Field_32502;
    Object Field_32503;
    private int Field_32504;
    final Class_27450 Field_32505;
    private long Field_32506;
    long Field_32507;

    public boolean Method_32508() {
        return (this.Field_32500 < Class_27450.Method_27463(this.Field_32505) ? 1667 & 2049 : 20501 & 1160) != 0;
    }

    public void Method_32509() {
        if (Class_27450.Method_27460(this.Field_32505) != this.Field_32504) {
            throw new ConcurrentModificationException();
        }
        if (this.Field_32506 == (-9223372036824759283L & -6389961830442171744L)) {
            throw new IllegalStateException();
        }
        this.Field_32500 -= -11007 & 11;
        this.Field_32505.Method_27466(this.Field_32506);
        this.Field_32506 = -9223372036820828152L & -9223372035711827968L;
        this.Field_32504 = Class_27450.Method_27460(this.Field_32505);
    }

    public Object Method_32510() {
        if (Class_27450.Method_27460(this.Field_32505) != this.Field_32504) {
            throw new ConcurrentModificationException();
        }
        if (!this.Method_32508()) {
            throw new NoSuchElementException();
        }
        long[][] arrl = Class_27450.Method_27467(this.Field_32505);
        this.Field_32500 += 17059 & -29631;
        if (this.Field_32507 != (-9223372036752793590L & -4579681804242778592L)) {
            this.Field_32501 += 6145 & 9075;
        }
        while (this.Field_32502 < arrl.length) {
            if (arrl[this.Field_32502] != null) {
                if (this.Field_32501 < arrl[this.Field_32502].length) {
                    long l = arrl[this.Field_32502][this.Field_32501];
                    Object object = Class_27450.Method_27469(this.Field_32505)[this.Field_32502][this.Field_32501];
                    if (l != (-9223372036288282620L & -1240013827890688479L)) {
                        this.Field_32506 = l;
                        this.Field_32507 = l;
                        this.Field_32503 = object;
                        return this.Field_32503;
                    }
                }
                this.Field_32501 = 2318 & -27488;
            }
            this.Field_32502 += 2823 & 17657;
        }
        throw new NoSuchElementException();
    }

    private void Method_32511() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_32499(Class_27450 class_27450) {
        this.Field_32505 = class_27450;
        this.Field_32506 = -4957772223951536096L & -4265599813983371122L;
        this.Field_32507 = -9223372036611386336L & -9223372035778803706L;
        this.Field_32504 = Class_27450.Method_27460(class_27450);
    }
}

