/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public final class Class_16620 {
    public static final ByteOrder Field_16621;
    public static final Class_22553 Field_16622;
    private static final Class_22837 Field_16623;
    public static final ByteOrder Field_16624;

    public static Class_22553 Method_16625(int n, int n2) {
        return Field_16623.Method_22846(n, n2);
    }

    public static Class_22553 Method_16626(Class_22553 class_22553) {
        return new Class_42807(class_22553);
    }

    public static Class_22553 Method_16627(int n) {
        return Field_16623.Method_22847(n);
    }

    private void Method_16628() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Class_22553 Method_16629(CharBuffer charBuffer, Charset charset) {
        return Class_10346.Method_10352(Field_16623, (18441 & 209) != 0, charBuffer, charset);
    }

    public static Class_22553 Method_16630(int n) {
        return Field_16623.Method_22843(n);
    }

    public static Class_22553 Method_16631(Class_22553 class_22553) {
        if (class_22553.Method_22583()) {
            return class_22553.Method_22636();
        }
        return Field_16622;
    }

    public static Class_22553 Method_16632(byte[] arrby) {
        if (arrby.length == 0) {
            return Field_16622;
        }
        return new Class_44337(Field_16623, arrby, arrby.length);
    }

    public static Class_22553 Method_16633() {
        return Field_16623.Method_22842();
    }

    public static Class_22553 Method_16634(CharSequence charSequence, Charset charset) {
        if (charSequence == null) {
            throw new NullPointerException("string");
        }
        if (charSequence instanceof CharBuffer) {
            return Class_16620.Method_16629((CharBuffer)charSequence, charset);
        }
        return Class_16620.Method_16629(CharBuffer.wrap(charSequence), charset);
    }

    static {
        Field_16623 = Class_39614.Field_39615;
        Field_16624 = ByteOrder.BIG_ENDIAN;
        Field_16621 = ByteOrder.LITTLE_ENDIAN;
        Field_16622 = Field_16623.Method_22840(-28411 & 2712, 8640 & 16917);
    }
}

