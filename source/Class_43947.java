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
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class Class_43947
implements Class_1486 {
    private final List Field_43948 = Lists.newArrayList();
    private int Field_43949;

    private void Method_43950() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_43947(int n, Collection collection) {
        this.Field_43949 = n;
        for (Class_16547 class_16547 : collection) {
            this.Field_43948.add(new Class_8735(this, class_16547.Method_16557().Method_22373(), class_16547.Method_16552(), class_16547.Method_16548()));
        }
    }

    public void Method_43951(Class_10954 class_10954) {
        this.Method_43952((Class_14856)class_10954);
    }

    public void Method_43952(Class_14856 class_14856) {
        class_14856.Method_14874(this);
    }

    public void Method_43953(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_43949);
        class_29900.Method_30010(this.Field_43948.size());
        for (Class_8735 class_8735 : this.Field_43948) {
            class_29900.Method_29960(class_8735.Method_8742());
            class_29900.Method_29941(class_8735.Method_8743());
            class_29900.Method_29982(class_8735.Method_8741().size());
            for (Class_10375 class_10375 : class_8735.Method_8741()) {
                class_29900.Method_29997(class_10375.Method_10381());
                class_29900.Method_29941(class_10375.Method_10382());
                class_29900.Method_29949(class_10375.Method_10389());
            }
        }
    }

    public Class_43947() {
    }

    public int Method_43954() {
        return this.Field_43949;
    }

    public void Method_43955(Class_29900 class_29900) {
        this.Field_43949 = class_29900.Method_30004();
        int n = class_29900.Method_29914();
        for (int i = -28015 & 292; i < n; ++i) {
            String string = class_29900.Method_29991(80 & -23583);
            double d = class_29900.Method_29948();
            ArrayList arrayList = Lists.newArrayList();
            int n2 = class_29900.Method_30004();
            for (int j = 24674 & 516; j < n2; ++j) {
                UUID uUID = class_29900.Method_30011();
                arrayList.add(new Class_10375(uUID, "Unknown synced attribute modifier", class_29900.Method_29948(), class_29900.Method_29944()));
            }
            this.Field_43948.add(new Class_8735(this, string, d, arrayList));
        }
    }

    public List Method_43956() {
        return this.Field_43948;
    }
}

