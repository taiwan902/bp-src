/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_22674 {
    private final Class_18 Field_22675;
    private static final Logger Field_22676 = LogManager.getLogger();
    public static final Object Field_22677 = new Object();
    private final List Field_22678 = Lists.newArrayList();

    public void Method_22679(int n) {
        this.Field_22678.remove(n);
    }

    public Class_15474 Method_22680(int n) {
        return (Class_15474)this.Field_22678.get(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_22681(int n, int n2) {
        Object object = Field_22677;
        synchronized (object) {
            Class_15474 class_15474 = this.Method_22680(n);
            this.Field_22678.set(n, this.Method_22680(n2));
            this.Field_22678.set(n2, class_15474);
            this.Method_22686();
        }
    }

    public Class_22674(Class_18 class_18) {
        this.Field_22675 = class_18;
        this.Method_22684();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void Method_22682(Class_15474 class_15474) {
        Object object = Field_22677;
        synchronized (object) {
            Class_22674 class_22674 = new Class_22674(Class_18.Field_89);
            class_22674.Method_22684();
            for (int i = 5163 & -32688; i < class_22674.Method_22685(); ++i) {
                Class_15474 class_154742 = class_22674.Method_22680(i);
                if (!class_154742.Field_15482.equals(class_15474.Field_15482) || !class_154742.Field_15484.equals(class_15474.Field_15484)) continue;
                class_22674.Method_22683(i, class_15474);
                break;
            }
            class_22674.Method_22686();
        }
    }

    public void Method_22683(int n, Class_15474 class_15474) {
        this.Field_22678.set(n, class_15474);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_22684() {
        Object object = Field_22677;
        synchronized (object) {
            try {
                int n;
                this.Field_22678.clear();
                Class_1699 class_1699 = Class_24711.Method_24719(new File(this.Field_22675.Field_68, "servers.dat"));
                if (class_1699 == null) {
                    return;
                }
                Class_1758 class_1758 = class_1699.Method_1735("servers", 12314 & -30038);
                for (n = 3630 & -28415; n < class_1758.Method_1772(); ++n) {
                    this.Field_22678.add(Class_15474.Method_15507(class_1758.Method_1768(n)));
                }
                for (n = 10624 & -27072; n < Class_29539.Field_29540.size(); ++n) {
                    Object object2;
                    Object object3;
                    Class_15321 class_15321 = (Class_15321)Class_29539.Field_29540.get(Class_29539.Field_29540.size() - n - (-17343 & 517));
                    if (class_15321.Method_15329()) {
                        object2 = new Class_15474(" ", class_15321.Field_15323, (224 & -32766) != 0);
                        ((Class_15474)object2).Method_15500((8195 & -28655) != 0);
                        ((Class_15474)object2).Method_15508(class_15321.Method_15330());
                        object3 = this.Field_22678.iterator();
                        while (object3.hasNext()) {
                            Class_15474 class_15474 = (Class_15474)object3.next();
                            if (!class_15474.Field_15484.equalsIgnoreCase(((Class_15474)object2).Field_15484)) continue;
                            object3.remove();
                            break;
                        }
                        this.Field_22678.add(16386 & 8337, object2);
                    }
                    if (!class_15321.Method_15328()) continue;
                    object2 = this.Field_22678.iterator();
                    while (object2.hasNext()) {
                        object3 = (Class_15474)object2.next();
                        if (!class_15321.Method_15326(Class_32037.Method_32040(((Class_15474)object3).Field_15484))) continue;
                        object2.remove();
                    }
                }
            }
            catch (Exception exception) {
                Field_22676.error("Couldn't load server list", (Throwable)exception);
            }
        }
    }

    public int Method_22685() {
        return this.Field_22678.size();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_22686() {
        Object object = Field_22677;
        synchronized (object) {
            try {
                Class_1758 class_1758 = new Class_1758();
                for (Class_15474 class_15474 : this.Field_22678) {
                    class_1758.Method_1781(class_15474.Method_15498());
                }
                Class_1699 class_1699 = new Class_1699();
                class_1699.Method_1744("servers", class_1758);
                Class_24711.Method_24718(class_1699, new File(this.Field_22675.Field_68, "servers.dat"));
            }
            catch (Exception exception) {
                Field_22676.error("Couldn't save server list", (Throwable)exception);
            }
        }
    }

    private void Method_22687() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_22688(Class_15474 class_15474) {
        this.Field_22678.add(class_15474);
    }
}

