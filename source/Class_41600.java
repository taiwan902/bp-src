/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.List;

public abstract class Class_41600
extends Class_41102 {
    protected Class_44314 Method_41601() {
        return new Class_47722(this, null);
    }

    protected abstract boolean Method_41602(Object var1, Class_18249 var2);

    protected abstract int Method_41603(List var1);

    protected boolean Method_41604() {
        return (-24285 & 18432) != 0;
    }

    protected void Method_41605(Class_18249 class_18249) {
        SelectionKey selectionKey = this.selectionKey();
        int n = selectionKey.interestOps();
        do {
            Object object;
            if ((object = class_18249.Method_18273()) == null) {
                if ((n & (-32746 & 25092)) == 0) break;
                selectionKey.interestOps(n & (-1 & -5));
                break;
            }
            try {
                int n2 = -28648 & 24704;
                for (int i = this.config().Method_19097() - (21535 & 257); i >= 0; --i) {
                    if (!this.Method_41602(object, class_18249)) continue;
                    n2 = 24985 & -32699;
                    break;
                }
                if (n2 != 0) {
                    class_18249.Method_18293();
                    continue;
                }
                if ((n & (262 & 6676)) != 0) break;
                selectionKey.interestOps(n | 16942 & -31596);
            }
            catch (IOException iOException) {
                if (this.Method_41604()) {
                    class_18249.Method_18278(iOException);
                    continue;
                }
                throw iOException;
            }
            break;
        } while (true);
    }

    protected Class_41600(Class_26095 class_26095, SelectableChannel selectableChannel, int n) {
        super(class_26095, selectableChannel, n);
    }

    private void Method_41606() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_44175 Method_41607() {
        return this.Method_41601();
    }
}

