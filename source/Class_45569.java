/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45569
extends Class_39033 {
    private byte Field_45570;

    public byte Method_45571() {
        return this.Field_45570;
    }

    Class_45569() {
    }

    public byte Method_45572() {
        return (byte)(-29387 & 16457);
    }

    public double Method_45573() {
        return this.Field_45570;
    }

    void Method_45574(DataInput dataInput, int n, Class_19804 class_19804) {
        class_19804.Method_19809(250021393671984714L & -250021395726073752L);
        this.Field_45570 = dataInput.readByte();
    }

    void Method_45575(DataOutput dataOutput) {
        dataOutput.writeByte(this.Field_45570);
    }

    public Class_45569(byte by) {
        this.Field_45570 = by;
    }

    public int Method_45576() {
        return super.hashCode() ^ this.Field_45570;
    }

    public Class_1674 Method_45577() {
        return new Class_45569(this.Field_45570);
    }

    public long Method_45578() {
        return this.Field_45570;
    }

    public int Method_45579() {
        return this.Field_45570;
    }

    public short Method_45580() {
        return this.Field_45570;
    }

    private void Method_45581() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_45582() {
        return this.Field_45570;
    }

    public boolean Method_45583(Object object) {
        if (super.equals(object)) {
            Class_45569 class_45569 = (Class_45569)object;
            return (this.Field_45570 == class_45569.Field_45570 ? -32487 & 2593 : 9756 & -16222) != 0;
        }
        return (17049 & -20478) != 0;
    }

    public String Method_45584() {
        return "" + this.Field_45570 + "b";
    }
}

