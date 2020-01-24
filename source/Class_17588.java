/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.UnknownHostException;

public class Class_17588
implements Runnable {
    final Class_20310 Field_17589;

    private void Method_17590() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_17588(Class_20310 class_20310) {
        this.Field_17589 = class_20310;
    }

    public void Method_17591() {
        try {
            Class_20310.Method_20331(this.Field_17589).Method_27800().Method_29460(this.Field_17589.Field_20324);
        }
        catch (UnknownHostException unknownHostException) {
            this.Field_17589.Field_20324.Field_15485 = -1L & -1L;
            this.Field_17589.Field_20324.Field_15479 = (Object)((Object)Class_5478.Field_5502) + "Can't resolve hostname";
        }
        catch (Exception exception) {
            this.Field_17589.Field_20324.Field_15485 = -1L & -1L;
            this.Field_17589.Field_20324.Field_15479 = (Object)((Object)Class_5478.Field_5502) + "Can't connect to server.";
        }
    }
}

