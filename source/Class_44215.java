/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44215
extends Class_39033 {
    private double Field_44216;

    private void Method_44217() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public byte Method_44218() {
        return (byte)(Class_13337.Method_13371(this.Field_44216) & (767 & 1279));
    }

    public Class_1674 Method_44219() {
        return new Class_44215(this.Field_44216);
    }

    public int Method_44220() {
        long l = Double.doubleToLongBits(this.Field_44216);
        return super.hashCode() ^ (int)(l ^ l >>> (288 & -31512));
    }

    public double Method_44221() {
        return this.Field_44216;
    }

    void Method_44222(DataOutput dataOutput) {
        dataOutput.writeDouble(this.Field_44216);
    }

    public float Method_44223() {
        return (float)this.Field_44216;
    }

    public int Method_44224() {
        return Class_13337.Method_13371(this.Field_44216);
    }

    void Method_44225(DataInput dataInput, int n, Class_19804 class_19804) {
        class_19804.Method_19809(138432644L & 269224320L);
        this.Field_44216 = dataInput.readDouble();
    }

    public short Method_44226() {
        return (short)(Class_13337.Method_13371(this.Field_44216) & (288489471 & 1115881471));
    }

    public long Method_44227() {
        return (long)Math.floor(this.Field_44216);
    }

    public String Method_44228() {
        return "" + this.Field_44216 + "d";
    }

    public byte Method_44229() {
        return (byte)(14 & 16454);
    }

    public Class_44215(double d) {
        this.Field_44216 = d;
    }

    public boolean Method_44230(Object object) {
        if (super.equals(object)) {
            Class_44215 class_44215 = (Class_44215)object;
            return (this.Field_44216 == class_44215.Field_44216 ? 16467 & -27227 : 2064 & 6) != 0;
        }
        return (193 & 22528) != 0;
    }

    Class_44215() {
    }
}

