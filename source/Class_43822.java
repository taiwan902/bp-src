/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;

public final class Class_43822
implements Runnable {
    final Class_18 Field_43823;
    final Class_23208 Field_43824;

    Class_43822(Class_23208 class_23208, Class_18 class_18) {
        this.Field_43824 = class_23208;
        this.Field_43823 = class_18;
    }

    private void Method_43825() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_43826() {
        try {
            if (InetAddress.getByName("update2.blazingpack.pl").getHostAddress().equals("127.0.0.1") || InetAddress.getByName("update.blazingpack.pl").getHostAddress().equals("127.0.0.1") || InetAddress.getByName("remote.blazingpack.pl").getHostAddress().equals("127.0.0.1")) {
                this.Field_43824.Method_23222();
                this.Field_43824.Method_23221("\u00a74B\u0142\u0105d przy automatycznej aktualizacji paczki!\n\u00a7ePrawdopodobnie przez to, \u017ce u\u017cy\u0142es obej\u015bcia! :(");
                return;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            Class_41092.Method_41098(this.Field_43823, this.Field_43824);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Class_41092.Method_41096(this.Field_43824, exception + "");
        }
    }
}

