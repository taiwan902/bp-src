/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_19804 {
    private final long Field_19805;
    private long Field_19806;
    public static final Class_19804 Field_19807 = new Class_31889(82048L & 7178064703590118656L);

    private void Method_19808() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_19809(long l) {
        this.Field_19806 += l / (293508425L & 1082222728L);
        if (this.Field_19806 > this.Field_19805) {
            throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.Field_19806 + "bytes where max allowed: " + this.Field_19805);
        }
    }

    public Class_19804(long l) {
        this.Field_19805 = l;
    }
}

