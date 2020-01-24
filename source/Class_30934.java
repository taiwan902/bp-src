/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Class_30934 {
    public HashMap Field_30935 = new HashMap();
    public int Field_30936;
    private static final ScheduledThreadPoolExecutor Field_30937 = new ScheduledThreadPoolExecutor(15745 & 35);
    private static Class_30934 Field_30938;
    public HashMap Field_30939 = new HashMap();

    private void Method_30940() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_30934.Method_30945("\u2012\u2019\u2021\u201a\u2033\u203b\u2023\u2031\u2039\u2031\u2001\u2031\u2030\u2039"));
    }

    public static Class_30934 Method_30941() {
        if (Field_30938 == null) {
            Field_30938 = new Class_30934();
        }
        return Field_30938;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_30942(Class_24929 class_24929) {
        Class_30934 class_30934 = this;
        synchronized (class_30934) {
            Class_21665 class_21665 = (Class_21665)this.Field_30939.remove(class_24929.Field_24930);
            if (class_21665 == null) {
                return;
            }
            class_21665.Method_21670(class_24929);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_30943(ScheduledExecutorService scheduledExecutorService, Class_24555 class_24555, int n, Class_6791 class_6791) {
        Class_30934 class_30934 = this;
        synchronized (class_30934) {
            class_6791.Field_6795 = class_24555.Field_24556;
            class_6791.Field_6792 = this;
            this.Field_30935.put(class_6791.Field_6795, class_6791);
            scheduledExecutorService.schedule(class_6791, (long)n, TimeUnit.MILLISECONDS);
            Class_47033.Method_47059(class_24555);
        }
    }

    public void Method_30944(Class_24555 class_24555, int n, Class_6791 class_6791) {
        this.Method_30943(Class_44584.Field_44597, class_24555, n, class_6791);
    }

    private static String Method_30945(String string) {
        int n = 5336;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30934.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_30946(Class_24555 class_24555) {
        Class_30934 class_30934 = this;
        synchronized (class_30934) {
            Class_6791 class_6791 = (Class_6791)this.Field_30935.remove(class_24555.Field_24556);
            if (class_6791 == null) {
                return;
            }
            class_6791.Method_6799(class_24555);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_30947(ScheduledExecutorService scheduledExecutorService, Class_24929 class_24929, int n, Class_21665 class_21665) {
        Class_30934 class_30934 = this;
        synchronized (class_30934) {
            this.Field_30936 += -6107 & 193;
            class_21665.Field_21666 = this.Field_30936;
            class_21665.Field_21668 = this;
            this.Field_30939.put(class_21665.Field_21666, class_21665);
            class_24929.Field_24930 = class_21665.Field_21666;
            scheduledExecutorService.schedule(class_21665, (long)n, TimeUnit.MILLISECONDS);
            Class_47033.Method_47059(class_24929);
        }
    }

    public void Method_30948(Class_24929 class_24929, int n, Class_21665 class_21665) {
        this.Method_30947(Field_30937, class_24929, n, new Class_30233(this, class_21665));
    }
}

