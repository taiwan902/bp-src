/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39686
extends Class_39033 {
    private short Field_39687;

    public byte Method_39688() {
        return (byte)(this.Field_39687 & (-32513 & 511));
    }

    public long Method_39689() {
        return this.Field_39687;
    }

    void Method_39690(DataOutput dataOutput) {
        dataOutput.writeShort(this.Field_39687);
    }

    public byte Method_39691() {
        return (byte)(17446 & 4499);
    }

    public boolean Method_39692(Object object) {
        if (super.equals(object)) {
            Class_39686 class_39686 = (Class_39686)object;
            return (this.Field_39687 == class_39686.Field_39687 ? 9123 & 22601 : -23437 & 20864) != 0;
        }
        return (3121 & 2) != 0;
    }

    public Class_39686() {
    }

    public String Method_39693() {
        return "" + this.Field_39687 + "s";
    }

    public float Method_39694() {
        return this.Field_39687;
    }

    public Class_39686(short s) {
        this.Field_39687 = s;
    }

    public int Method_39695() {
        return this.Field_39687;
    }

    public double Method_39696() {
        return this.Field_39687;
    }

    public short Method_39697() {
        return this.Field_39687;
    }

    public Class_1674 Method_39698() {
        return new Class_39686(this.Field_39687);
    }

    private void Method_39699() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    void Method_39700(DataInput dataInput, int n, Class_19804 class_19804) {
        class_19804.Method_19809(8397168L & 356375438610401363L);
        this.Field_39687 = dataInput.readShort();
    }

    public int Method_39701() {
        return super.hashCode() ^ this.Field_39687;
    }
}

