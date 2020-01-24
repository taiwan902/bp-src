/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_3221 {
    private static final PrintStream Field_3222 = System.out;
    private static boolean Field_3223 = 5 & 8192;
    private static final Logger Field_3224 = LogManager.getLogger();

    static void Method_3225() {
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10568, (Object)new Class_47952());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10545, (Object)new Class_47964());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10561, (Object)new Class_47967());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10643, (Object)new Class_47955());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10687, (Object)new Class_17474());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10573, (Object)new Class_47767());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10583, (Object)new Class_47671());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10627, (Object)new Class_47750());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10696, (Object)new Class_47701());
        Class_47697 class_47697 = new Class_47697();
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10572, (Object)class_47697);
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10695, (Object)class_47697);
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10639, (Object)new Class_47960());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10615, (Object)new Class_47762());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10623, (Object)new Class_47915());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_1956.Method_1981(Class_9265.Field_9462), (Object)new Class_47739());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_10527.Field_10702, (Object)new Class_47682());
        Class_4850.Field_4851.\u0000strictfp((Object)Class_1956.Method_1981(Class_9265.Field_9337), (Object)new Class_47835());
    }

    public static void Method_3226() {
        if (!Field_3223) {
            Field_3223 = 137 & 2371;
            if (Field_3224.isDebugEnabled()) {
                Class_3221.Method_3227();
            }
            Class_3238.Method_3377();
            Class_5859.Method_5894();
            Class_1956.Method_1997();
            Class_19863.Method_19987();
            Class_3221.Method_3225();
        }
    }

    private static void Method_3227() {
        System.setErr(new Class_3231("STDERR", System.err));
        System.setOut(new Class_3231("STDOUT", Field_3222));
    }

    public static boolean Method_3228() {
        return Field_3223;
    }

    private void Method_3229() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_3230(String string) {
        Field_3222.println(string);
    }
}

