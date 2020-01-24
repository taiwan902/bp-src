/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_38873
implements Class_10321 {
    private final Class_6295 Field_38874;
    private final Class_2080 Field_38875;
    private double Field_38876;
    private double Field_38877;
    private final Random Field_38878 = new Random();
    private final List Field_38879 = Lists.newArrayList();

    public Object Method_38880() {
        return this.Method_38884();
    }

    public int Method_38881() {
        int n = 20858 & 2177;
        for (Class_10321 class_10321 : this.Field_38879) {
            n += class_10321.Method_10323();
        }
        return n;
    }

    public Class_2080 Method_38882() {
        return this.Field_38875;
    }

    public Class_6295 Method_38883() {
        return this.Field_38874;
    }

    public Class_6002 Method_38884() {
        int n = this.Method_38881();
        if (!this.Field_38879.isEmpty() && n != 0) {
            int n2 = this.Field_38878.nextInt(n);
            for (Class_10321 class_10321 : this.Field_38879) {
                if ((n2 -= class_10321.Method_10323()) >= 0) continue;
                Class_6002 class_6002 = (Class_6002)class_10321.Method_10322();
                class_6002.Method_6007(class_6002.Method_6009() * this.Field_38876);
                class_6002.Method_6011(class_6002.Method_6013() * this.Field_38877);
                return class_6002;
            }
            return Class_29094.Field_29097;
        }
        return Class_29094.Field_29097;
    }

    public Class_38873(Class_2080 class_2080, double d, double d2, Class_6295 class_6295) {
        this.Field_38875 = class_2080;
        this.Field_38877 = d2;
        this.Field_38876 = d;
        this.Field_38874 = class_6295;
    }

    public void Method_38885(Class_10321 class_10321) {
        this.Field_38879.add(class_10321);
    }

    private void Method_38886() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

