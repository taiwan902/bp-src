/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ScheduledFuture;

public class Class_27764
implements Class_21832 {
    final ScheduledFuture Field_27765;
    final Class_47372 Field_27766;
    final Class_37748 Field_27767;
    final Class_39158 Field_27768;

    private void Method_27769() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27770(Class_27581 class_27581) {
        if (this.Field_27765 != null) {
            this.Field_27765.cancel((77 & 16640) != 0);
        }
        this.Field_27768.Method_39167(this.Field_27767);
    }

    public void Method_27771(Class_21065 class_21065) {
        this.Method_27770((Class_27581)class_21065);
    }

    Class_27764(Class_47372 class_47372, ScheduledFuture scheduledFuture, Class_39158 class_39158, Class_37748 class_37748) {
        this.Field_27766 = class_47372;
        this.Field_27765 = scheduledFuture;
        this.Field_27768 = class_39158;
        this.Field_27767 = class_37748;
    }
}

