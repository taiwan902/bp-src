/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public class Class_37367
extends Class_1674 {
    private int[] Field_37368;

    public int Method_37369() {
        return super.Method_1676() ^ Arrays.hashCode(this.Field_37368);
    }

    public boolean Method_37370(Object object) {
        return super.Method_1693(object) ? Arrays.equals(this.Field_37368, ((Class_37367)object).Field_37368) : -24576 & 6674;
    }

    public byte Method_37371() {
        return (byte)(4187 & 20015);
    }

    void Method_37372(DataOutput dataOutput) {
        dataOutput.writeInt(this.Field_37368.length);
        for (int i = 5120 & 24608; i < this.Field_37368.length; ++i) {
            dataOutput.writeInt(this.Field_37368[i]);
        }
    }

    void Method_37373(DataInput dataInput, int n, Class_19804 class_19804) {
        class_19804.Method_19809(1086519979053941472L & -1086519979743337264L);
        int n2 = dataInput.readInt();
        class_19804.Method_19809((6378 & 820) * n2);
        this.Field_37368 = new int[n2];
        for (int i = 16834 & 11285; i < n2; ++i) {
            this.Field_37368[i] = dataInput.readInt();
        }
    }

    public Class_37367(int[] arrn) {
        this.Field_37368 = arrn;
    }

    public String Method_37374() {
        String string = "[";
        int[] arrn = this.Field_37368;
        int n = arrn.length;
        for (int i = 901 & -15256; i < n; ++i) {
            int n2 = arrn[i];
            string = string + n2 + ",";
        }
        return string + "]";
    }

    private void Method_37375() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_37367() {
    }

    public int[] Method_37376() {
        return this.Field_37368;
    }

    public Class_1674 Method_37377() {
        int[] arrn = new int[this.Field_37368.length];
        System.arraycopy(this.Field_37368, 9230 & -30336, arrn, -5855 & 1220, this.Field_37368.length);
        return new Class_37367(arrn);
    }
}

