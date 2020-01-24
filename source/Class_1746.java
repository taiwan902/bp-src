/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_1746
extends Class_1674 {
    private String Field_1747;

    void Method_1748(DataInput dataInput, int n, Class_19804 class_19804) {
        class_19804.Method_19809(2197175101118611937L & 4490016L);
        this.Field_1747 = dataInput.readUTF();
        class_19804.Method_19809((6166 & 26128) * this.Field_1747.length());
    }

    public boolean Method_1749(Object object) {
        if (!super.Method_1693(object)) {
            return (18501 & 776) != 0;
        }
        Class_1746 class_1746 = (Class_1746)object;
        return (this.Field_1747 == null && class_1746.Field_1747 == null || this.Field_1747 != null && this.Field_1747.equals(class_1746.Field_1747) ? -24559 & 16905 : 9 & 9462) != 0;
    }

    public int Method_1750() {
        return super.Method_1676() ^ this.Field_1747.hashCode();
    }

    public String Method_1751() {
        return this.Field_1747;
    }

    public Class_1746(String string) {
        this.Field_1747 = string;
        if (string == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }

    private void Method_1752() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1746() {
        this.Field_1747 = "";
    }

    public String Method_1753() {
        return "\"" + this.Field_1747.replace("\"", "\\\"") + "\"";
    }

    void Method_1754(DataOutput dataOutput) {
        dataOutput.writeUTF(this.Field_1747);
    }

    public boolean Method_1755() {
        return this.Field_1747.isEmpty();
    }

    public byte Method_1756() {
        return (byte)(-22008 & 1240);
    }

    public Class_1674 Method_1757() {
        return new Class_1746(this.Field_1747);
    }
}

