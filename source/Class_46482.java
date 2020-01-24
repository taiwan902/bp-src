/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;

public class Class_46482
extends Class_44949 {
    private static final byte[] Field_46483;

    protected void Method_46484(Class_22553 class_22553, Class_34657 class_34657) {
        class_34657.Method_34659().Method_16739(class_22553);
        class_22553.Method_22606(802 & 8228);
        String string = class_34657.Method_34658();
        if (string.length() == 0) {
            string = string + (char)(8255 & 17455);
        } else {
            int n = string.indexOf("://");
            if (n != (-1 & -1) && string.charAt(1107 & -15864) != (-16145 & 2863)) {
                int n2 = n + (75 & -11849);
                int n3 = string.indexOf(9023 & 127, n2);
                if (n3 == (-1 & -1)) {
                    if (string.lastIndexOf(559 & -20305) <= n2) {
                        string = string + (char)(22575 & 367);
                    }
                } else if (string.lastIndexOf(-5825 & 47, n3) <= n2) {
                    int n4 = string.length();
                    StringBuilder stringBuilder = new StringBuilder(n4 + (2369 & 16403));
                    stringBuilder.append(string, -15872 & 8528, n3);
                    stringBuilder.append((char)(-32577 & 29295));
                    stringBuilder.append(string, n3, n4);
                    string = stringBuilder.toString();
                }
            }
        }
        class_22553.Method_22610(string.getBytes(Class_7203.Field_7207));
        class_22553.Method_22606(33 & -13138);
        class_34657.getProtocolVersion().Method_18326(class_22553);
        class_22553.Method_22610(Field_46483);
    }

    public boolean Method_46485(Object object) {
        return (super.Method_44962(object) && !(object instanceof Class_37974) ? 291 & -32635 : 17710 & -28544) != 0;
    }

    static {
        byte[] arrby = new byte[18434 & 4174];
        arrby[27954 & 140] = 93 & 5135;
        arrby[71 & -7399] = 14475 & 1630;
        Field_46483 = arrby;
    }

    private void Method_46486() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_46487(Class_22553 class_22553, Class_32692 class_32692) {
        this.Method_46484(class_22553, (Class_34657)class_32692);
    }
}

