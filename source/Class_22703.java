/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public class Class_22703 {
    private static final Map Field_22704;
    private static final Set Field_22705;
    private static Logger Field_22706;
    public static Map Field_22707;
    private static Map Field_22708;
    private static final Deque Field_22709;
    private static boolean Field_22710;
    private static final Set Field_22711;

    public static void Method_22712() {
        if (!Field_22710) {
            Class_22703.Method_22713("hooks init");
            Field_22710 = 4609 & 9635;
            Field_22707 = new HashMap();
        }
    }

    private static void Method_22713(String string) {
    }

    static {
        Field_22710 = 6922 & 25600;
        Field_22706 = Class_18.Field_19;
        Field_22708 = Maps.newHashMap();
        Field_22711 = Sets.newHashSet();
        Field_22705 = Sets.newHashSet();
        Field_22704 = new HashMap();
        Field_22709 = Queues.newArrayDeque();
    }

    private void Method_22714() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

