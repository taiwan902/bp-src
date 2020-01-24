/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39148
extends Class_38651
implements Class_37974 {
    private Class_7065 Field_39149;

    public Class_7065 Method_39150() {
        return this.Field_39149;
    }

    public String Method_39151() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Class_22304.Method_22312(this));
        stringBuilder.append("(decodeResult: ");
        stringBuilder.append(this.getDecoderResult());
        stringBuilder.append((char)(-14997 & 2605));
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append(this.getProtocolVersion().Method_18312());
        stringBuilder.append((char)(167 & -8152));
        stringBuilder.append(this.Method_39150());
        stringBuilder.append(Class_22304.Field_22308);
        this.appendHeaders(stringBuilder);
        stringBuilder.setLength(stringBuilder.length() - Class_22304.Field_22308.length());
        return stringBuilder.toString();
    }

    public Class_39148(Class_18300 class_18300, Class_7065 class_7065, boolean bl) {
        super(class_18300, bl);
        if (class_7065 == null) {
            throw new NullPointerException("status");
        }
        this.Field_39149 = class_7065;
    }

    private void Method_39152() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

