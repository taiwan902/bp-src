/*
 * Decompiled with CFR 0.145.
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Date;

public class Class_43957
implements Class_36087 {
    public static PrintStream Field_43958 = System.out;

    private void Method_43959() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_43960(String string) {
        Field_43958.println(new Date() + " INFO:" + string);
    }
}

