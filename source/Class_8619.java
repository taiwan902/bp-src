/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;

public final class Class_8619 {
    private static final Class_32390 Field_8620 = new Class_41570();
    ByteBuffer Field_8621;
    ByteBuffer[] Field_8622;
    Object Field_8623;
    boolean Field_8624;
    int Field_8625 = -1 & -1;
    long Field_8626;
    long Field_8627;
    Class_8619 Field_8628;
    private final Class_22999 Field_8629;
    int Field_8630;
    Class_37748 Field_8631;

    Class_8619(Class_22999 class_22999, Class_40010 class_40010) {
        this(class_22999);
    }

    Class_8619 Method_8632() {
        Class_8619 class_8619 = this.Field_8628;
        this.Method_8633();
        return class_8619;
    }

    void Method_8633() {
        this.Field_8628 = null;
        this.Field_8622 = null;
        this.Field_8621 = null;
        this.Field_8623 = null;
        this.Field_8631 = null;
        this.Field_8626 = 1619378433L & 6635981970826330136L;
        this.Field_8627 = 39868420L & 553820416L;
        this.Field_8630 = -23024 & 5;
        this.Field_8625 = -1 & -1;
        this.Field_8624 = 20 & 16992;
        Field_8620.Method_32402(this, this.Field_8629);
    }

    static Class_8619 Method_8634(Object object, int n, long l, Class_37748 class_37748) {
        Class_8619 class_8619 = (Class_8619)Field_8620.Method_32408();
        class_8619.Field_8623 = object;
        class_8619.Field_8630 = n;
        class_8619.Field_8627 = l;
        class_8619.Field_8631 = class_37748;
        return class_8619;
    }

    private void Method_8635() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    int Method_8636() {
        if (!this.Field_8624) {
            this.Field_8624 = 6177 & 10001;
            int n = this.Field_8630;
            Class_24761.Method_24766(this.Field_8623);
            this.Field_8623 = Class_16620.Field_16622;
            this.Field_8630 = 16740 & 2178;
            this.Field_8627 = 5316823943724662793L & -5316823944747771280L;
            this.Field_8626 = 1141124298L & 676495877L;
            this.Field_8622 = null;
            this.Field_8621 = null;
            return n;
        }
        return 30793 & 2;
    }

    private Class_8619(Class_22999 class_22999) {
        this.Field_8629 = class_22999;
    }
}

