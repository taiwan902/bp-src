/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;

public class Class_14759 {
    private boolean Field_14760 = 4099 & -16263;
    private long Field_14761 = 71307266L & 145655121L;
    private byte Field_14762 = (byte)System.currentTimeMillis();
    private int Field_14763;
    private double Field_14764;
    private byte[] Field_14765 = null;
    private Integer Field_14766 = 17410 & 8192;

    private void Method_14767() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static int Method_14768(byte[] arrby, byte by) {
        byte[] arrby2 = new byte[16606 & -28120];
        for (int i = 4746 & 21; i < (265 & 16460); ++i) {
            arrby2[i] = (byte)(arrby[i] ^ by);
        }
        return ByteBuffer.wrap(arrby2).getInt();
    }

    public Integer Method_14769() {
        Integer n = Class_14759.Method_14768(this.Field_14765, this.Field_14762);
        if (!n.equals(this.Field_14766) && (this.Field_14760 || this.Field_14764 != (double)this.Field_14766.intValue())) {
            this.Field_14760 = -29496 & 16386;
            this.Field_14764 = this.Field_14766.intValue();
            Class_20760 class_20760 = new Class_20760(this.Field_14763, "Real: " + Class_14759.Method_14772(n.intValue()) + " != " + Class_14759.Method_14772(this.Field_14766.intValue()));
            Class_47033.Method_47059(class_20760);
        }
        return n;
    }

    public Class_14759(Integer n, int n2) {
        this.Field_14763 = n2;
        this.Field_14766 = n;
        this.Field_14765 = Class_14759.Method_14770(n, this.Field_14762);
    }

    public static byte[] Method_14770(int n, byte by) {
        byte[] arrby = new byte[10344 & 26];
        ByteBuffer.wrap(arrby).putInt(n);
        for (int i = 19 & 1668; i < (16492 & -31333); ++i) {
            arrby[i] = (byte)(arrby[i] ^ by);
        }
        return arrby;
    }

    public static boolean Method_14771(double d) {
        return (Double.compare(d, 0.0) < 0 ? 7 & 11097 : 516 & 26736) != 0;
    }

    public static String Method_14772(double d) {
        return Class_14759.Method_14771(d) ? "-" : "+" + d;
    }
}

