/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45018
extends Class_39033 {
    private int Field_45019;

    private void Method_45020() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public byte Method_45021() {
        return (byte)(15491 & -15833);
    }

    public Class_45018(int n) {
        this.Field_45019 = n;
    }

    public Class_1674 Method_45022() {
        return new Class_45018(this.Field_45019);
    }

    public short Method_45023() {
        return (short)(this.Field_45019 & (172163071 & 540147711));
    }

    public int Method_45024() {
        return this.Field_45019;
    }

    void Method_45025(DataOutput dataOutput) {
        dataOutput.writeInt(this.Field_45019);
    }

    public long Method_45026() {
        return this.Field_45019;
    }

    public float Method_45027() {
        return this.Field_45019;
    }

    Class_45018() {
    }

    public byte Method_45028() {
        return (byte)(this.Field_45019 & (4607 & -23809));
    }

    public double Method_45029() {
        return this.Field_45019;
    }

    public boolean Method_45030(Object object) {
        if (super.equals(object)) {
            Class_45018 class_45018 = (Class_45018)object;
            return (this.Field_45019 == class_45018.Field_45019 ? 16385 & 4373 : -16384 & 96) != 0;
        }
        return (-32256 & 17408) != 0;
    }

    public int Method_45031() {
        return super.hashCode() ^ this.Field_45019;
    }

    void Method_45032(DataInput dataInput, int n, Class_19804 class_19804) {
        class_19804.Method_19809(622068336L & 1482707052L);
        this.Field_45019 = dataInput.readInt();
    }

    public String Method_45033() {
        return "" + this.Field_45019;
    }
}

