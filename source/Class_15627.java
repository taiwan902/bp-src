/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Class_15627
implements ThreadFactory {
    private final AtomicInteger Field_15628 = new AtomicInteger();
    private final int Field_15629;
    private final boolean Field_15630;
    private final String Field_15631;
    private static final AtomicInteger Field_15632 = new AtomicInteger();

    public Class_15627(Class class_) {
        this(class_, (4141 & 24576) != 0, 20485 & 8733);
    }

    private void Method_15633() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Thread Method_15634(Runnable runnable, String string) {
        return new Class_18149(runnable, string);
    }

    private static String Method_15635(Class class_) {
        if (class_ == null) {
            throw new NullPointerException("poolType");
        }
        String string = Class_22304.Method_22309(class_);
        switch (string.length()) {
            case 0: {
                return "unknown";
            }
            case 1: {
                return string.toLowerCase(Locale.US);
            }
        }
        if (Character.isUpperCase(string.charAt(-32510 & 17984)) && Character.isLowerCase(string.charAt(23241 & 8471))) {
            return Character.toLowerCase(string.charAt(29699 & 8)) + string.substring(10241 & 18083);
        }
        return string;
    }

    public Class_15627(Class class_, int n) {
        this(class_, (-23808 & 16401) != 0, n);
    }

    public Class_15627(Class class_, boolean bl, int n) {
        this(Class_15627.Method_15635(class_), bl, n);
    }

    public Thread Method_15636(Runnable runnable) {
        Thread thread = this.Method_15634(new Class_31445(runnable), this.Field_15631 + this.Field_15628.incrementAndGet());
        try {
            if (thread.isDaemon()) {
                if (!this.Field_15630) {
                    thread.setDaemon((10274 & 20993) != 0);
                }
            } else if (this.Field_15630) {
                thread.setDaemon((16919 & 265) != 0);
            }
            if (thread.getPriority() != this.Field_15629) {
                thread.setPriority(this.Field_15629);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return thread;
    }

    public Class_15627(String string, boolean bl, int n) {
        if (string == null) {
            throw new NullPointerException("poolName");
        }
        if (n < (6149 & -24285) || n > (1163 & -32694)) {
            throw new IllegalArgumentException("priority: " + n + " (expected: Thread.MIN_PRIORITY <= priority <= Thread.MAX_PRIORITY)");
        }
        this.Field_15631 = string + (char)(18495 & 13933) + Field_15632.incrementAndGet() + (char)(2413 & 9773);
        this.Field_15630 = bl;
        this.Field_15629 = n;
    }
}

