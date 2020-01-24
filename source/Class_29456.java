/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_29456 {
    private static final Logger Field_29457;
    private final List Field_29458 = Collections.synchronizedList(Lists.newArrayList());
    private static final Splitter Field_29459;

    public void Method_29460(Class_15474 class_15474) {
        Class_6816 class_6816 = new Class_6816();
        class_6816.Method_6821(new Class_15704(this, class_6816, class_15474));
        class_6816.Method_6822(-16087 & 632);
        Class_15411 class_15411 = Class_15411.Method_15414(class_15474.Field_15484);
        Class_44584 class_44584 = Class_44584.Method_44618(InetAddress.getByName(class_15411.Method_15418()), class_15411.Method_15416(), (-28512 & 8) != 0, (16512 & 5997) != 0, null, class_6816, (8207 & 8016) != 0);
        this.Field_29458.add(class_44584);
        class_15474.Field_15479 = "Pinging...";
        class_15474.Field_15485 = -2L & -2L;
        class_15474.Field_15489 = null;
        class_44584.Method_44630(new Class_13508(this, class_44584, class_15474));
        try {
            class_44584.Method_44629(new Class_36280(-24529 & 4463, class_15411.Method_15418(), class_15411.Method_15416(), Class_11271.Field_11275));
            class_44584.Method_44629(new Class_34758());
        }
        catch (Throwable throwable) {
            Field_29457.error((Object)throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_29461() {
        List list = this.Field_29458;
        synchronized (list) {
            Iterator iterator = this.Field_29458.iterator();
            while (iterator.hasNext()) {
                Class_44584 class_44584 = (Class_44584)iterator.next();
                if (class_44584.Method_44604()) {
                    class_44584.Method_44631();
                    continue;
                }
                iterator.remove();
                class_44584.Method_44605();
            }
        }
    }

    private void Method_29462() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Logger Method_29463() {
        return Field_29457;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_29464() {
        List list = this.Field_29458;
        synchronized (list) {
            Iterator iterator = this.Field_29458.iterator();
            while (iterator.hasNext()) {
                Class_44584 class_44584 = (Class_44584)iterator.next();
                if (!class_44584.Method_44604()) continue;
                iterator.remove();
                class_44584.Method_44622(new Class_2840("Cancelled"));
            }
        }
    }

    static {
        Field_29459 = Splitter.on((char)(6272 & 24580)).limit(-15314 & 390);
        Field_29457 = LogManager.getLogger();
    }
}

