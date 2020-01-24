/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public final class Class_24791
implements Callable {
    final int Field_24792;

    private void Method_24793() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_24794() {
        if (this.Field_24792 < 0) {
            return "Unknown? (Got " + this.Field_24792 + ")";
        }
        Object[] arrobject = new Object[2065 & -32183];
        arrobject[336 & 522] = Integer.toBinaryString(this.Field_24792);
        String string = String.format("%4s", arrobject).replace(" ", "0");
        Object[] arrobject2 = new Object[534 & 27843];
        arrobject2[521 & 146] = this.Field_24792;
        arrobject2[20497 & 1] = string;
        return String.format("%1$d / 0x%1$X / 0b%2$s", arrobject2);
    }

    public Object Method_24795() {
        return this.Method_24794();
    }

    Class_24791(int n) {
        this.Field_24792 = n;
    }
}

