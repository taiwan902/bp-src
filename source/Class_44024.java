/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44024
extends Class_38651
implements Class_34657 {
    private Class_16725 Field_44025;
    private String Field_44026;

    public Class_44024(Class_18300 class_18300, Class_16725 class_16725, String string, boolean bl) {
        super(class_18300, bl);
        if (class_16725 == null) {
            throw new NullPointerException("method");
        }
        if (string == null) {
            throw new NullPointerException("uri");
        }
        this.Field_44025 = class_16725;
        this.Field_44026 = string;
    }

    public String Method_44027() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Class_22304.Method_22312(this));
        stringBuilder.append("(decodeResult: ");
        stringBuilder.append(this.getDecoderResult());
        stringBuilder.append((char)(18985 & 1081));
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append(this.Method_44028());
        stringBuilder.append((char)(14372 & 626));
        stringBuilder.append(this.Method_44029());
        stringBuilder.append((char)(28705 & 292));
        stringBuilder.append(this.getProtocolVersion().Method_18312());
        stringBuilder.append(Class_22304.Field_22308);
        this.appendHeaders(stringBuilder);
        stringBuilder.setLength(stringBuilder.length() - Class_22304.Field_22308.length());
        return stringBuilder.toString();
    }

    public Class_44024(Class_18300 class_18300, Class_16725 class_16725, String string) {
        this(class_18300, class_16725, string, (-30975 & 18501) != 0);
    }

    public Class_16725 Method_44028() {
        return this.Field_44025;
    }

    public String Method_44029() {
        return this.Field_44026;
    }

    private void Method_44030() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

