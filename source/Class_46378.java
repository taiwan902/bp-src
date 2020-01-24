/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Class_46378
extends Class_39999 {
    private final Map.Entry[] Field_46379;
    private final Map.Entry[] Field_46380;
    private final Class_31885 Field_46381;
    private final Class_18163 Field_46382;

    private void Method_46383() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_46378(Class_18163 class_18163, Class_31885 class_31885, Map.Entry[] arrentry, Map.Entry[] arrentry2) {
        this.Field_46382 = class_18163;
        this.Field_46381 = class_31885;
        this.Field_46380 = arrentry;
        this.Field_46379 = arrentry2;
    }

    public void Method_46384(Class_39158 class_39158, Throwable throwable) {
        Class_19087 class_19087 = class_39158.Method_39175().Method_26110();
        if (class_19087.Method_19098()) {
            class_19087.Method_19096((4822 & 16384) != 0);
            class_39158.Method_39175().Method_26113().schedule((Runnable)new Class_6038(this, class_19087), 26365459L & 235769929L, TimeUnit.SECONDS);
        }
        class_39158.Method_39162(throwable);
    }

    static void Method_46385(Class_26095 class_26095, Throwable throwable) {
        Class_46378.Method_46387(class_26095, throwable);
    }

    public void Method_46386(Class_39158 class_39158, Object object) {
        Map.Entry entry;
        int n;
        Class_26095 class_26095 = (Class_26095)object;
        Class_31885[] arrclass_31885 = new Class_31885[1 & -12275];
        arrclass_31885[9376 & -30720] = this.Field_46381;
        class_26095.Method_26106().Method_6275(arrclass_31885);
        Map.Entry[] arrentry = this.Field_46380;
        int n2 = arrentry.length;
        for (n = 5192 & -32765; n < n2; ++n) {
            entry = arrentry[n];
            try {
                if (class_26095.Method_26110().Method_19093((Class_25272)entry.getKey(), entry.getValue())) continue;
                Class_42827.Method_42845().Method_6132("Unknown channel option: " + entry);
                continue;
            }
            catch (Throwable throwable) {
                Class_42827.Method_42845().Method_6127("Failed to set a channel option: " + class_26095, throwable);
            }
        }
        arrentry = this.Field_46379;
        n2 = arrentry.length;
        for (n = -29883 & 16386; n < n2; ++n) {
            entry = arrentry[n];
            class_26095.attr((Class_28213)entry.getKey()).Method_34811(entry.getValue());
        }
        try {
            this.Field_46382.Method_18165(class_26095).Method_27583(new Class_24582(this, class_26095));
        }
        catch (Throwable throwable) {
            Class_46378.Method_46387(class_26095, throwable);
        }
    }

    private static void Method_46387(Class_26095 class_26095, Throwable throwable) {
        class_26095.Method_26101().Method_7312();
        Class_42827.Method_42845().Method_6127("Failed to register an accepted channel: " + class_26095, throwable);
    }
}

