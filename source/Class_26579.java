/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_26579 {
    private final boolean[] Field_26580 = new boolean[Class_17531.Method_17542().length];
    private final boolean[] Field_26581 = new boolean[Class_17531.Method_17542().length];
    public static final Class_26579 Field_26582 = new Class_37970();
    private Class_18381 Field_26583;
    private Class_12181 Field_26584 = new Class_12181();
    private boolean Field_26585 = -30715 & 22433;
    private final ArrayList Field_26586 = Lists.newArrayList();

    public final boolean Method_26587() {
        return this.Field_26585;
    }

    public void Method_26588(Class_17531 class_17531) {
        this.Field_26580[class_17531.ordinal()] = -30687 & 13185;
    }

    public boolean Method_26589(Class_4595 class_4595, Class_4595 class_45952) {
        if (this == Field_26582) {
            return (5152 & 16647) != 0;
        }
        return this.Field_26584.Method_12186(class_4595, class_45952);
    }

    public void Method_26590(Class_12181 class_12181) {
        this.Field_26584 = class_12181;
    }

    public void Method_26591(Class_18381 class_18381) {
        this.Field_26583 = class_18381;
    }

    private void Method_26592() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_26593(Class_4879 class_4879) {
        this.Field_26586.add(class_4879);
    }

    public final ArrayList Method_26594() {
        return this.Field_26586;
    }

    public Class_18381 Method_26595() {
        return this.Field_26583;
    }

    protected void Method_26596(Class_17531 class_17531) {
        this.Field_26585 = 104 & -10240;
        this.Field_26581[class_17531.ordinal()] = 105 & -24575;
    }

    public boolean Method_26597(Class_17531 class_17531) {
        return (!this.Field_26581[class_17531.ordinal()] ? 2771 & 24621 : 2489 & -23552) != 0;
    }

    public boolean Method_26598(Class_17531 class_17531) {
        return this.Field_26580[class_17531.ordinal()];
    }
}

