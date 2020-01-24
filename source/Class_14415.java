/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14415 {
    transient int Field_14416;
    transient int Field_14417;
    transient Class_16635[] Field_14418 = new Class_16635[-26442 & 337];
    static final boolean Field_14419 = !Class_14415.class.desiredAssertionStatus() ? -31607 & 4865 : 28675 & 312;

    public void Method_14420() {
        int n = this.Field_14417;
        int n2 = this.Field_14416;
        if (n != n2) {
            this.Field_14417 = this.Field_14416 = 10784 & 5314;
            int n3 = n;
            int n4 = this.Field_14418.length - (5125 & 27);
            do {
                this.Field_14418[n3] = null;
            } while ((n3 = n3 + (25993 & 6163) & n4) != n2);
        }
    }

    private void Method_14421() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_14422(Class_16635 class_16635) {
        this.Method_14423(class_16635);
    }

    public void Method_14423(Class_16635 class_16635) {
        if (class_16635 == null) {
            throw new NullPointerException();
        }
        Class_16635[] arrclass_16635 = this.Field_14418;
        arrclass_16635[this.Field_14416] = class_16635;
        this.Field_14416 = this.Field_14416 + (9831 & 22673) & arrclass_16635.length - (-31729 & 2113);
        if (this.Field_14416 == this.Field_14417) {
            this.Method_14427();
        }
    }

    public boolean Method_14424() {
        return (this.Field_14417 == this.Field_14416 ? 1099 & -15855 : 1024 & 10864) != 0;
    }

    public Class_16635 Method_14425() {
        return this.Method_14426();
    }

    public Class_16635 Method_14426() {
        Class_16635[] arrclass_16635 = this.Field_14418;
        int n = this.Field_14417;
        Class_16635 class_16635 = arrclass_16635[n];
        if (class_16635 == null) {
            return null;
        }
        arrclass_16635[n] = null;
        this.Field_14417 = n + (4191 & -14591) & arrclass_16635.length - (19809 & 137);
        return class_16635;
    }

    private void Method_14427() {
        if (!Field_14419 && this.Field_14417 != this.Field_14416) {
            throw new AssertionError();
        }
        int n = this.Field_14417;
        int n2 = this.Field_14418.length;
        int n3 = n2 - n;
        int n4 = n2 << (-31743 & 17163);
        if (n4 < 0) {
            throw new IllegalStateException("Sorry, deque too big");
        }
        Class_16635[] arrclass_16635 = new Class_16635[n4];
        System.arraycopy(this.Field_14418, n, arrclass_16635, 8704 & -15994, n3);
        System.arraycopy(this.Field_14418, 548 & 4416, arrclass_16635, n3, n);
        this.Field_14418 = arrclass_16635;
        this.Field_14417 = 24608 & 4610;
        this.Field_14416 = n2;
    }
}

