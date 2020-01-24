/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45819
extends Class_39033 {
    private long Field_45820;

    void Method_45821(DataOutput dataOutput) {
        dataOutput.writeLong(this.Field_45820);
    }

    Class_45819() {
    }

    private void Method_45822() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public short Method_45823() {
        return (short)(this.Field_45820 & (1169752063L & 273154047L));
    }

    public Class_45819(long l) {
        this.Field_45820 = l;
    }

    public String Method_45824() {
        return "" + this.Field_45820 + "L";
    }

    public int Method_45825() {
        return super.hashCode() ^ (int)(this.Field_45820 ^ this.Field_45820 >>> (-16352 & 9262));
    }

    public Class_1674 Method_45826() {
        return new Class_45819(this.Field_45820);
    }

    public byte Method_45827() {
        return (byte)(this.Field_45820 & (7712915511545696511L & -7712915513554170625L));
    }

    public double Method_45828() {
        return this.Field_45820;
    }

    void Method_45829(DataInput dataInput, int n, Class_19804 class_19804) {
        class_19804.Method_19809(-6071336479012945262L & 6071336478758142152L);
        this.Field_45820 = dataInput.readLong();
    }

    public int Method_45830() {
        return (int)(this.Field_45820 & (-1L & -1L));
    }

    public float Method_45831() {
        return this.Field_45820;
    }

    public byte Method_45832() {
        return (byte)(9358 & 581);
    }

    public boolean Method_45833(Object object) {
        if (super.equals(object)) {
            Class_45819 class_45819 = (Class_45819)object;
            return (this.Field_45820 == class_45819.Field_45820 ? -23287 & 4099 : 9217 & -13630) != 0;
        }
        return (10836 & 4104) != 0;
    }

    public long Method_45834() {
        return this.Field_45820;
    }
}

