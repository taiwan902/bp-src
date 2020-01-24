/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteOrder;

public final class Class_42807
extends Class_31583 {
    private Class_30534 Field_42808;

    public Class_22553 Method_42809() {
        return new Class_42807(this.buf.Method_22636());
    }

    Class_42807(Class_22553 class_22553) {
        super(class_22553);
    }

    public Class_22553 Method_42810(int n, int n2) {
        return new Class_42807(this.buf.Method_22623(n, n2));
    }

    public Class_22553 Method_42811(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        }
        if (byteOrder == this.order()) {
            return this;
        }
        Class_30534 class_30534 = this.Field_42808;
        if (class_30534 == null) {
            this.Field_42808 = class_30534 = new Class_30534(this);
        }
        return class_30534;
    }

    private void Method_42812() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_22553 Method_42813() {
        return this;
    }

    public Class_21482 Method_42814() {
        return this.Method_42813();
    }

    public Class_22553 Method_42815() {
        return new Class_42807(this.buf.Method_22598());
    }

    public boolean Method_42816() {
        return (21544 & 2052) != 0;
    }
}

