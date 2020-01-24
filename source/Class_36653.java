/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_36653 {
    private final int Field_36654;
    private final Class_14963 Field_36655;
    private final Class_36653 Field_36656;
    Class_36653 Field_36657;
    private final int Field_36658;
    static final boolean Field_36659 = !Class_36653.class.desiredAssertionStatus() ? 1093 & 4225 : -31575 & 2050;
    private Class_8772 Field_36660;

    void Method_36661(Class_8772 class_8772, long l) {
        class_8772.Method_8799(l);
        if (class_8772.Method_8804() < this.Field_36658) {
            this.Method_36664(class_8772);
            if (this.Field_36657 == null) {
                if (!Field_36659 && class_8772.Method_8804() != 0) {
                    throw new AssertionError();
                }
                this.Field_36655.Method_14990(class_8772);
            } else {
                this.Field_36657.Method_36663(class_8772);
            }
        }
    }

    boolean Method_36662(Class_43430 class_43430, int n, int n2) {
        long l;
        if (this.Field_36660 == null) {
            return (-29488 & 4366) != 0;
        }
        Class_8772 class_8772 = this.Field_36660;
        while ((l = class_8772.Method_8796(n2)) < (5860709922666187904L & 704676390L)) {
            class_8772 = class_8772.Field_8785;
            if (class_8772 != null) continue;
            return (20493 & 8256) != 0;
        }
        class_8772.Method_8808(class_43430, l, n);
        if (class_8772.Method_8804() >= this.Field_36654) {
            this.Method_36664(class_8772);
            this.Field_36656.Method_36663(class_8772);
        }
        return (1043 & 2177) != 0;
    }

    void Method_36663(Class_8772 class_8772) {
        if (class_8772.Method_8804() >= this.Field_36654) {
            this.Field_36656.Method_36663(class_8772);
            return;
        }
        class_8772.Field_8776 = this;
        if (this.Field_36660 == null) {
            this.Field_36660 = class_8772;
            class_8772.Field_8791 = null;
            class_8772.Field_8785 = null;
        } else {
            class_8772.Field_8791 = null;
            class_8772.Field_8785 = this.Field_36660;
            this.Field_36660.Field_8791 = class_8772;
            this.Field_36660 = class_8772;
        }
    }

    Class_36653(Class_14963 class_14963, Class_36653 class_36653, int n, int n2) {
        this.Field_36655 = class_14963;
        this.Field_36656 = class_36653;
        this.Field_36658 = n;
        this.Field_36654 = n2;
    }

    private void Method_36664(Class_8772 class_8772) {
        if (class_8772 == this.Field_36660) {
            this.Field_36660 = class_8772.Field_8785;
            if (this.Field_36660 != null) {
                this.Field_36660.Field_8791 = null;
            }
        } else {
            Class_8772 class_87722;
            class_8772.Field_8791.Field_8785 = class_87722 = class_8772.Field_8785;
            if (class_87722 != null) {
                class_87722.Field_8791 = class_8772.Field_8791;
            }
        }
    }

    private void Method_36665() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_36666() {
        if (this.Field_36660 == null) {
            return "none";
        }
        StringBuilder stringBuilder = new StringBuilder();
        Class_8772 class_8772 = this.Field_36660;
        do {
            stringBuilder.append(class_8772);
            class_8772 = class_8772.Field_8785;
            if (class_8772 == null) break;
            stringBuilder.append(Class_22304.Field_22308);
        } while (true);
        return stringBuilder.toString();
    }
}

