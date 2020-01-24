/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Class_27850
extends Class_13598 {
    static final String Field_27851;
    static final String Field_27852;
    final transient Logger Field_27853;

    public void Method_27854(String string, Object object, Object object2) {
        if (this.Field_27853.isLoggable(Level.FINE)) {
            Class_11672 class_11672 = Class_14494.Method_14508(string, object, object2);
            this.Method_27865(Field_27852, Level.FINE, class_11672.Method_11677(), class_11672.Method_11680());
        }
    }

    public void Method_27855(String string, Object object, Object object2) {
        if (this.Field_27853.isLoggable(Level.SEVERE)) {
            Class_11672 class_11672 = Class_14494.Method_14508(string, object, object2);
            this.Method_27865(Field_27852, Level.SEVERE, class_11672.Method_11677(), class_11672.Method_11680());
        }
    }

    public void Method_27856(String string) {
        if (this.Field_27853.isLoggable(Level.FINE)) {
            this.Method_27865(Field_27852, Level.FINE, string, null);
        }
    }

    public void Method_27857(String string, Object ... arrobject) {
        if (this.Field_27853.isLoggable(Level.SEVERE)) {
            Class_11672 class_11672 = Class_14494.Method_14509(string, arrobject);
            this.Method_27865(Field_27852, Level.SEVERE, class_11672.Method_11677(), class_11672.Method_11680());
        }
    }

    public void Method_27858(String string, Object object) {
        if (this.Field_27853.isLoggable(Level.FINE)) {
            Class_11672 class_11672 = Class_14494.Method_14506(string, object);
            this.Method_27865(Field_27852, Level.FINE, class_11672.Method_11677(), class_11672.Method_11680());
        }
    }

    public void Method_27859(String string, Object ... arrobject) {
        if (this.Field_27853.isLoggable(Level.FINE)) {
            Class_11672 class_11672 = Class_14494.Method_14509(string, arrobject);
            this.Method_27865(Field_27852, Level.FINE, class_11672.Method_11677(), class_11672.Method_11680());
        }
    }

    public void Method_27860(String string, Object object, Object object2) {
        if (this.Field_27853.isLoggable(Level.WARNING)) {
            Class_11672 class_11672 = Class_14494.Method_14508(string, object, object2);
            this.Method_27865(Field_27852, Level.WARNING, class_11672.Method_11677(), class_11672.Method_11680());
        }
    }

    static {
        Field_27852 = Class_27850.class.getName();
        Field_27851 = Class_13598.class.getName();
    }

    public boolean Method_27861() {
        return this.Field_27853.isLoggable(Level.WARNING);
    }

    public void Method_27862(String string, Object object, Object object2) {
        if (this.Field_27853.isLoggable(Level.FINEST)) {
            Class_11672 class_11672 = Class_14494.Method_14508(string, object, object2);
            this.Method_27865(Field_27852, Level.FINEST, class_11672.Method_11677(), class_11672.Method_11680());
        }
    }

    public boolean Method_27863() {
        return this.Field_27853.isLoggable(Level.FINE);
    }

    public void Method_27864(String string, Object object) {
        if (this.Field_27853.isLoggable(Level.FINEST)) {
            Class_11672 class_11672 = Class_14494.Method_14506(string, object);
            this.Method_27865(Field_27852, Level.FINEST, class_11672.Method_11677(), class_11672.Method_11680());
        }
    }

    Class_27850(Logger logger) {
        super(logger.getName());
        this.Field_27853 = logger;
    }

    private void Method_27865(String string, Level level, String string2, Throwable throwable) {
        LogRecord logRecord = new LogRecord(level, string2);
        logRecord.setLoggerName(this.name());
        logRecord.setThrown(throwable);
        Class_27850.Method_27869(string, logRecord);
        this.Field_27853.log(logRecord);
    }

    public boolean Method_27866() {
        return this.Field_27853.isLoggable(Level.SEVERE);
    }

    private void Method_27867() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27868(String string, Throwable throwable) {
        if (this.Field_27853.isLoggable(Level.WARNING)) {
            this.Method_27865(Field_27852, Level.WARNING, string, throwable);
        }
    }

    private static void Method_27869(String string, LogRecord logRecord) {
        int n;
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        int n2 = -1 & -1;
        for (n = 2432 & -24059; n < arrstackTraceElement.length; ++n) {
            String string2 = arrstackTraceElement[n].getClassName();
            if (!string2.equals(string) && !string2.equals(Field_27851)) continue;
            n2 = n;
            break;
        }
        n = -1 & -1;
        for (int i = n2 + (5 & 3665); i < arrstackTraceElement.length; ++i) {
            String string3 = arrstackTraceElement[i].getClassName();
            if (string3.equals(string) || string3.equals(Field_27851)) continue;
            n = i;
            break;
        }
        if (n != (-1 & -1)) {
            StackTraceElement stackTraceElement = arrstackTraceElement[n];
            logRecord.setSourceClassName(stackTraceElement.getClassName());
            logRecord.setSourceMethodName(stackTraceElement.getMethodName());
        }
    }

    public void Method_27870(String string, Throwable throwable) {
        if (this.Field_27853.isLoggable(Level.FINE)) {
            this.Method_27865(Field_27852, Level.FINE, string, throwable);
        }
    }

    public void Method_27871(String string) {
        if (this.Field_27853.isLoggable(Level.WARNING)) {
            this.Method_27865(Field_27852, Level.WARNING, string, null);
        }
    }

    public void Method_27872(String string) {
        if (this.Field_27853.isLoggable(Level.SEVERE)) {
            this.Method_27865(Field_27852, Level.SEVERE, string, null);
        }
    }

    public void Method_27873(String string, Object object) {
        if (this.Field_27853.isLoggable(Level.WARNING)) {
            Class_11672 class_11672 = Class_14494.Method_14506(string, object);
            this.Method_27865(Field_27852, Level.WARNING, class_11672.Method_11677(), class_11672.Method_11680());
        }
    }

    public void Method_27874(String string) {
        if (this.Field_27853.isLoggable(Level.INFO)) {
            this.Method_27865(Field_27852, Level.INFO, string, null);
        }
    }

    public void Method_27875(String string, Throwable throwable) {
        if (this.Field_27853.isLoggable(Level.SEVERE)) {
            this.Method_27865(Field_27852, Level.SEVERE, string, throwable);
        }
    }
}

