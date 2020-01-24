/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39580
extends Class_39033 {
    private float Field_39581;

    public float Method_39582() {
        return this.Field_39581;
    }

    public short Method_39583() {
        return (short)(Class_13337.Method_13377(this.Field_39581) & (218300415 & 1343291391));
    }

    public int Method_39584() {
        return super.hashCode() ^ Float.floatToIntBits(this.Field_39581);
    }

    public long Method_39585() {
        return (long)this.Field_39581;
    }

    void Method_39586(DataInput dataInput, int n, Class_19804 class_19804) {
        class_19804.Method_19809(1311976L & -4043545274581249952L);
        this.Field_39581 = dataInput.readFloat();
    }

    public Class_1674 Method_39587() {
        return new Class_39580(this.Field_39581);
    }

    public int Method_39588() {
        return Class_13337.Method_13377(this.Field_39581);
    }

    void Method_39589(DataOutput dataOutput) {
        dataOutput.writeFloat(this.Field_39581);
    }

    Class_39580() {
    }

    public byte Method_39590() {
        return (byte)(8357 & -29929);
    }

    public double Method_39591() {
        return this.Field_39581;
    }

    public Class_39580(float f) {
        this.Field_39581 = f;
    }

    public byte Method_39592() {
        return (byte)(Class_13337.Method_13377(this.Field_39581) & (-32513 & 3583));
    }

    public String Method_39593() {
        return "" + this.Field_39581 + "f";
    }

    public boolean Method_39594(Object object) {
        if (super.equals(object)) {
            Class_39580 class_39580 = (Class_39580)object;
            return (this.Field_39581 == class_39580.Field_39581 ? 13509 & 2577 : 8196 & 4776) != 0;
        }
        return (16406 & 2113) != 0;
    }

    private void Method_39595() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

