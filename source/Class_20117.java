/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.List;

public class Class_20117
implements Runnable {
    private boolean Field_20118;
    private long Field_20119;
    private long Field_20120;
    private List Field_20121 = Collections.synchronizedList(Lists.newArrayList());
    private static final Class_20117 Field_20122 = new Class_20117();

    public static Class_20117 Method_20123() {
        return Field_20122;
    }

    public void Method_20124() {
        this.Field_20118 = 147 & 10253;
        while (this.Field_20119 != this.Field_20120) {
            Thread.sleep(-6728224644759805938L & 134171L);
        }
        this.Field_20118 = 72 & 8727;
    }

    private void Method_20125() {
        for (int i = 23560 & -24495; i < this.Field_20121.size(); ++i) {
            Class_17274 class_17274 = (Class_17274)this.Field_20121.get(i);
            boolean bl = class_17274.Method_17275();
            if (!bl) {
                this.Field_20121.remove(i--);
                this.Field_20120 += 336135201L & 1656754449L;
            }
            try {
                Thread.sleep(this.Field_20118 ? 1493353491L & 15732804L : -3955954619694954357L & 170955838L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        if (this.Field_20121.isEmpty()) {
            try {
                Thread.sleep(1611727003L & 23257209L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    private void Method_20126() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_20117() {
        Thread thread = new Thread((Runnable)this, "File IO Thread");
        thread.setPriority(8225 & 589);
        thread.start();
    }

    public void Method_20127() {
        do {
            this.Method_20125();
        } while (true);
    }

    public void Method_20128(Class_17274 class_17274) {
        if (!this.Field_20121.contains(class_17274)) {
            this.Field_20119 += 285393443330720317L & 1140957187L;
            this.Field_20121.add(class_17274);
        }
    }
}

