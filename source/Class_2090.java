/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.apache.logging.log4j.Logger;

public class Class_2090 {
    public static Class_2094 Method_2091() {
        String string = System.getProperty("os.name").toLowerCase();
        return string.contains("win") ? Class_2094.Field_2099 : (string.contains("mac") ? Class_2094.Field_2095 : (string.contains("solaris") ? Class_2094.Field_2096 : (string.contains("sunos") ? Class_2094.Field_2096 : (string.contains("linux") ? Class_2094.Field_2097 : (string.contains("unix") ? Class_2094.Field_2097 : Class_2094.Field_2098)))));
    }

    private void Method_2092() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Object Method_2093(FutureTask futureTask, Logger logger) {
        try {
            futureTask.run();
            return futureTask.get();
        }
        catch (ExecutionException executionException) {
            logger.fatal("Error executing task", (Throwable)executionException);
        }
        catch (InterruptedException interruptedException) {
            logger.fatal("Error executing task", (Throwable)interruptedException);
        }
        return null;
    }
}

