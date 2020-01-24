/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15704
implements Runnable {
    final Class_6816 Field_15705;
    final Class_15474 Field_15706;
    final Class_29456 Field_15707;

    private void Method_15708() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_15709() {
        int n = this.Field_15705.Method_6820();
        boolean bl = "pl_PL".equals(Class_9802.Method_9806("language.code", new Object[16549 & -31664]));
        String string = "";
        if (n == (1066 & -32664)) {
            string = string + (bl ? "Pobieranie SRV..." : "Resolving SRV...");
        } else if (n == (3 & 229)) {
            string = string + Class_9802.Method_9806("connect.connecting", new Object[72 & 21265]);
        } else if (n == (9483 & 4611)) {
            string = string + (bl ? "Wywolywanie hosta..." : "Dial...");
        } else if (n == (148 & 2382)) {
            string = string + (bl ? "Wyslano handshake..." : "Handshake sent...");
        }
        this.Field_15706.Field_15479 = string;
    }

    Class_15704(Class_29456 class_29456, Class_6816 class_6816, Class_15474 class_15474) {
        this.Field_15707 = class_29456;
        this.Field_15705 = class_6816;
        this.Field_15706 = class_15474;
    }
}

