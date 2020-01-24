/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public class Class_41664
extends Class_1674 {
    private byte[] Field_41665;

    public byte Method_41666() {
        return (byte)(12807 & 7);
    }

    public byte[] Method_41667() {
        return this.Field_41665;
    }

    void Method_41668(DataOutput dataOutput) {
        dataOutput.writeInt(this.Field_41665.length);
        dataOutput.write(this.Field_41665);
    }

    public int Method_41669() {
        return super.Method_1676() ^ Arrays.hashCode(this.Field_41665);
    }

    Class_41664() {
    }

    void Method_41670(DataInput dataInput, int n, Class_19804 class_19804) {
        class_19804.Method_19809(70322369L & 7080743149450306272L);
        int n2 = dataInput.readInt();
        class_19804.Method_19809((4170 & 1689) * n2);
        this.Field_41665 = new byte[n2];
        dataInput.readFully(this.Field_41665);
    }

    public String Method_41671() {
        return "[" + this.Field_41665.length + " bytes]";
    }

    private void Method_41672() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1674 Method_41673() {
        byte[] arrby = new byte[this.Field_41665.length];
        System.arraycopy(this.Field_41665, 9312 & -28658, arrby, 21122 & 9248, this.Field_41665.length);
        return new Class_41664(arrby);
    }

    public Class_41664(byte[] arrby) {
        this.Field_41665 = arrby;
    }

    public boolean Method_41674(Object object) {
        return super.Method_1693(object) ? Arrays.equals(this.Field_41665, ((Class_41664)object).Field_41665) : 5216 & -24318;
    }
}

