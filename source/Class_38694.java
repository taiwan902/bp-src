/*
 * Decompiled with CFR 0.145.
 */
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38694
implements Class_20084 {
    public InputStream Method_38695(String string) {
        String string2 = string.replace((char)(2142 & 605), (char)(17471 & -26577));
        return Class_8033.class.getClassLoader().getResourceAsStream(string2);
    }

    private void Method_38696() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

