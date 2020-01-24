/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Class_47307
extends Class_47259 {
    Selector Field_47308;
    private static final boolean Field_47309;
    private static final Class_6113 Field_47310;
    private final AtomicBoolean Field_47311 = new AtomicBoolean();
    private int Field_47312 = -9614 & 306;
    private boolean Field_47313;
    private static final int Field_47314;
    private int Field_47315;
    private final SelectorProvider Field_47316;
    private Class_11975 Field_47317;

    private static void Method_47318(Class_6750 class_6750, SelectionKey selectionKey, Throwable throwable) {
        try {
            class_6750.Method_6751(selectionKey.channel(), throwable);
        }
        catch (Exception exception) {
            Field_47310.Method_6127("Unexpected exception while running NioTask.channelUnregistered()", exception);
        }
    }

    public void Method_47319() {
        int n;
        block14 : {
            Selector selector;
            if (!this.inEventLoop()) {
                this.execute(new Class_25669(this));
                return;
            }
            Selector selector2 = this.Field_47308;
            if (selector2 == null) {
                return;
            }
            try {
                selector = this.Method_47333();
            }
            catch (Exception exception) {
                Field_47310.Method_6127("Failed to create a new Selector.", exception);
                return;
            }
            n = -24544 & 19712;
            do {
                try {
                    for (SelectionKey selectionKey : selector2.keys()) {
                        Object object;
                        Object object2 = selectionKey.attachment();
                        try {
                            if (!selectionKey.isValid() || selectionKey.channel().keyFor(selector) != null) continue;
                            int n2 = selectionKey.interestOps();
                            selectionKey.cancel();
                            object = selectionKey.channel().register(selector, n2, object2);
                            if (object2 instanceof Class_41102) {
                                ((Class_41102)object2).Field_41106 = object;
                            }
                            ++n;
                        }
                        catch (Exception exception) {
                            Field_47310.Method_6127("Failed to re-register a Channel to the new Selector.", exception);
                            if (object2 instanceof Class_41102) {
                                object = (Class_41102)object2;
                                ((Class_41102)object).Method_41115().close(((Class_41102)object).Method_41115().voidPromise());
                                continue;
                            }
                            object = (Class_6750)object2;
                            Class_47307.Method_47318((Class_6750)object, selectionKey, exception);
                        }
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    continue;
                }
                break;
            } while (true);
            this.Field_47308 = selector;
            try {
                selector2.close();
            }
            catch (Throwable throwable) {
                if (!Field_47310.Method_6119()) break block14;
                Field_47310.Method_6127("Failed to close the old Selector.", throwable);
            }
        }
        Field_47310.Method_6117("Migrated " + n + " channel(s) to the new Selector.");
    }

    void Method_47320() {
        try {
            this.Field_47308.selectNow();
        }
        finally {
            if (this.Field_47311.get()) {
                this.Field_47308.wakeup();
            }
        }
    }

    private void Method_47321() {
        this.Method_47332();
        Set<SelectionKey> set = this.Field_47308.keys();
        ArrayList<Class_41102> arrayList = new ArrayList<Class_41102>(set.size());
        for (SelectionKey object : set) {
            Object object2 = object.attachment();
            if (object2 instanceof Class_41102) {
                arrayList.add((Class_41102)object2);
                continue;
            }
            object.cancel();
            Class_6750 class_6750 = (Class_6750)object2;
            Class_47307.Method_47318(class_6750, object, null);
        }
        for (Class_41102 class_41102 : arrayList) {
            class_41102.Method_41115().close(class_41102.Method_41115().voidPromise());
        }
    }

    protected void Method_47322(boolean bl) {
        if (!bl && this.Field_47311.compareAndSet((8354 & 261) != 0, (4097 & 16481) != 0)) {
            this.Field_47308.wakeup();
        }
    }

    private static String Method_47323(String string) {
        int n = 30494;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47307.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_47324() {
        if (this.Field_47317 != null) {
            this.Method_47328(this.Field_47317.Method_11984());
        } else {
            this.Method_47329(this.Field_47308.selectedKeys());
        }
    }

    private static String Method_47325(String string) {
        int n = 28014;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47307.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_47326() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_47327() {
        try {
            this.Field_47308.close();
        }
        catch (IOException iOException) {
            Field_47310.Method_6127("Failed to close a selector.", iOException);
        }
    }

    private void Method_47328(SelectionKey[] arrselectionKey) {
        SelectionKey selectionKey;
        int n = 4192 & 2445;
        while ((selectionKey = arrselectionKey[n]) != null) {
            arrselectionKey[n] = null;
            Object object = selectionKey.attachment();
            if (object instanceof Class_41102) {
                Class_47307.Method_47339(selectionKey, (Class_41102)object);
            } else {
                Class_6750 class_6750 = (Class_6750)object;
                Class_47307.Method_47331(selectionKey, class_6750);
            }
            if (this.Field_47313) {
                while (arrselectionKey[n] != null) {
                    arrselectionKey[n] = null;
                    ++n;
                }
                this.Method_47332();
                arrselectionKey = this.Field_47317.Method_11984();
                n = -1 & -1;
            }
            ++n;
        }
    }

    private void Method_47329(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator<Object> iterator = set.iterator();
        do {
            SelectionKey selectionKey = (SelectionKey)iterator.next();
            Object object = selectionKey.attachment();
            iterator.remove();
            if (object instanceof Class_41102) {
                Class_47307.Method_47339(selectionKey, (Class_41102)object);
            } else {
                Class_6750 class_6750 = (Class_6750)object;
                Class_47307.Method_47331(selectionKey, class_6750);
            }
            if (!iterator.hasNext()) break;
            if (!this.Field_47313) continue;
            this.Method_47332();
            set = this.Field_47308.selectedKeys();
            if (set.isEmpty()) break;
            iterator = set.iterator();
        } while (true);
    }

    private static String Method_47330(String string) {
        int n = 9730;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47307.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void Method_47331(SelectionKey selectionKey, Class_6750 class_6750) {
        int n = 2832 & 17504;
        try {
            class_6750.Method_6752(selectionKey.channel(), selectionKey);
            n = -28417 & 16641;
        }
        catch (Exception exception) {
            selectionKey.cancel();
            Class_47307.Method_47318(class_6750, selectionKey, exception);
            n = -16313 & 130;
        }
        finally {
            switch (n) {
                case 0: {
                    selectionKey.cancel();
                    Class_47307.Method_47318(class_6750, selectionKey, null);
                    break;
                }
                case 1: {
                    if (selectionKey.isValid()) break;
                    Class_47307.Method_47318(class_6750, selectionKey, null);
                }
            }
        }
    }

    private void Method_47332() {
        this.Field_47313 = -12280 & 11904;
        try {
            this.Field_47308.selectNow();
        }
        catch (Throwable throwable) {
            Field_47310.Method_6127("Failed to update SelectionKeys.", throwable);
        }
    }

    private Selector Method_47333() {
        AbstractSelector abstractSelector;
        try {
            abstractSelector = this.Field_47316.openSelector();
        }
        catch (IOException iOException) {
            throw new Class_31422("failed to open a new selector", iOException);
        }
        if (Field_47309) {
            return abstractSelector;
        }
        try {
            Class_11975 class_11975 = new Class_11975();
            Class<?> class_ = Class.forName("sun.nio.ch.SelectorImpl", (-32623 & 290) != 0, Class_7799.Method_7818());
            if (!class_.isAssignableFrom(abstractSelector.getClass())) {
                return abstractSelector;
            }
            Field field = class_.getDeclaredField("selectedKeys");
            Field field2 = class_.getDeclaredField("publicSelectedKeys");
            field.setAccessible((7297 & -23789) != 0);
            field2.setAccessible((29217 & 3143) != 0);
            field.set(abstractSelector, class_11975);
            field2.set(abstractSelector, class_11975);
            this.Field_47317 = class_11975;
            Field_47310.Method_6129("Instrumented an optimized java.util.Set into: {}", abstractSelector);
        }
        catch (Throwable throwable) {
            this.Field_47317 = null;
            Field_47310.Method_6118("Failed to instrument an optimized java.util.Set into: {}", abstractSelector, throwable);
        }
        return abstractSelector;
    }

    private void Method_47334(boolean bl) {
        block10 : {
            Selector selector = this.Field_47308;
            try {
                int n = 8714 & 84;
                long l = System.nanoTime();
                long l2 = l + this.delayNanos(l);
                do {
                    long l3;
                    if ((l3 = (l2 - l + (2000286355270119790L & -2000286357032295648L)) / (211769936L & 2365517763714212810L)) <= (-1242309527835966952L & 1242309527279763781L)) {
                        if (n != 0) break;
                        selector.selectNow();
                        n = 5217 & 18709;
                        break;
                    }
                    int n2 = selector.select(l3);
                    ++n;
                    if (n2 != 0 || bl || this.Field_47311.get() || this.hasTasks() || this.hasScheduledTasks()) break;
                    if (Thread.interrupted()) {
                        if (Field_47310.Method_6131()) {
                            Field_47310.Method_6130("Selector.select() returned prematurely because Thread.currentThread().interrupt() was called. Use NioEventLoop.shutdownGracefully() to shutdown the NioEventLoop.");
                        }
                        n = 20645 & -32447;
                        break;
                    }
                    long l4 = System.nanoTime();
                    if (l4 - TimeUnit.MILLISECONDS.toNanos(l3) >= l) {
                        n = -28671 & 2529;
                    } else if (Field_47314 > 0 && n >= Field_47314) {
                        Field_47310.Method_6125("Selector.select() returned prematurely {} times in a row; rebuilding selector.", n);
                        this.Method_47319();
                        selector = this.Field_47308;
                        selector.selectNow();
                        n = 4557 & 2049;
                        break;
                    }
                    l = l4;
                } while (true);
                if (n > (16419 & -26469) && Field_47310.Method_6131()) {
                    Field_47310.Method_6114("Selector.select() returned prematurely {} times in a row.", n - (-30399 & 8711));
                }
            }
            catch (CancelledKeyException cancelledKeyException) {
                if (!Field_47310.Method_6131()) break block10;
                Field_47310.Method_6116(CancelledKeyException.class.getSimpleName() + " raised by a Selector - JDK bug?", cancelledKeyException);
            }
        }
    }

    protected Runnable Method_47335() {
        Runnable runnable = super.pollTask();
        if (this.Field_47313) {
            this.Method_47332();
        }
        return runnable;
    }

    protected void Method_47336() {
        do {
            boolean bl = this.Field_47311.getAndSet((1029 & 26640) != 0);
            try {
                if (this.hasTasks()) {
                    this.Method_47320();
                } else {
                    this.Method_47334(bl);
                    if (this.Field_47311.get()) {
                        this.Field_47308.wakeup();
                    }
                }
                this.Field_47315 = 670 & -27392;
                this.Field_47313 = 22546 & 1312;
                int n = this.Field_47312;
                if (n == (108 & 27253)) {
                    this.Method_47324();
                    this.runAllTasks();
                } else {
                    long l = System.nanoTime();
                    this.Method_47324();
                    long l2 = System.nanoTime() - l;
                    this.runAllTasks(l2 * (long)((-28443 & 2148) - n) / (long)n);
                }
                if (!this.isShuttingDown()) continue;
                this.Method_47321();
                if (!this.confirmShutdown()) continue;
            }
            catch (Throwable throwable) {
                Field_47310.Method_6127("Unexpected exception in the selector loop.", throwable);
                try {
                    Thread.sleep(478348270L & 1073744872L);
                }
                catch (InterruptedException interruptedException) {}
                continue;
            }
            break;
        } while (true);
    }

    private static String Method_47337(String string) {
        int n = 23856;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47307.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Queue Method_47338() {
        return Class_7799.Method_7830();
    }

    Class_47307(Class_36973 class_36973, ThreadFactory threadFactory, SelectorProvider selectorProvider) {
        super(class_36973, threadFactory, (5448 & 8230) != 0);
        if (selectorProvider == null) {
            throw new NullPointerException("selectorProvider");
        }
        this.Field_47316 = selectorProvider;
        this.Field_47308 = this.Method_47333();
    }

    private static void Method_47339(SelectionKey selectionKey, Class_41102 class_41102) {
        Class_26558 class_26558 = class_41102.Method_41115();
        if (!selectionKey.isValid()) {
            class_26558.close(class_26558.voidPromise());
            return;
        }
        try {
            int n = selectionKey.readyOps();
            if ((n & (-30563 & 19)) != 0 || n == 0) {
                class_26558.Method_26559();
                if (!class_41102.Method_41116()) {
                    return;
                }
            }
            if ((n & (-32570 & 1028)) != 0) {
                class_41102.Method_41115().Method_26561();
            }
            if ((n & (-8056 & 4187)) != 0) {
                int n2 = selectionKey.interestOps();
                selectionKey.interestOps(n2 &= -9 & -9);
                class_26558.Method_26560();
            }
        }
        catch (CancelledKeyException cancelledKeyException) {
            class_26558.close(class_26558.voidPromise());
        }
    }

    private static String Method_47340(String string) {
        int n = 2873;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47307.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        block5 : {
            Field_47310 = Class_10201.Method_10203(Class_47307.class);
            Field_47309 = Class_16591.Method_16604(Class_47307.Method_47323("\u2000\u2002\u2013\u2003\u2013\u2002\u2002\u2002\u204b\u2009\u2008\u2048\u200b\u2009\u201b\u201a\u2010\u2042\u2001\u2001\u2022\u2001\u2012\u2031\u2008\u2018\u2028\u201a\u2019\u2009\u200a\u200b\u2033\u2021\u2033\u2023\u2022\u2022"), (4147 & 11456) != 0);
            String string = Class_47307.Method_47340("\u2c09\u2c0d\u2c16\u2c56\u2c10\u2c15\u2c13\u2c52\u2c19\u2c10\u2c56\u2c1a\u2c09\u2c19\u2c12\u2c1b\u2c0c\u2c1d\u2c16");
            try {
                String string2 = Class_16591.Method_16598(string);
                if (string2 == null) {
                    System.setProperty(string, "");
                }
            }
            catch (SecurityException securityException) {
                if (!Field_47310.Method_6131()) break block5;
                Field_47310.Method_6122(Class_47307.Method_47341("\u1149\u1171\u117b\u117b\u1170\u1178\u113a\u116b\u1171\u1139\u117b\u117a\u1168\u1130\u116b\u117a\u1168\u1139\u114b\u1162\u1169\u1169\u117b\u1172\u1138\u1149\u116a\u1172\u1168\u1178\u116a\u116b\u1161\u1121\u113a\u1162\u1161"), string, securityException);
            }
        }
        int n = Class_16591.Method_16601(Class_47307.Method_47330("\u5812\u5811\u5801\u5810\u5801\u5811\u5810\u5811\u5819\u581a\u581a\u581b\u5819\u581a\u5809\u5809\u5802\u5811\u5802\u5810\u5813\u5812\u5812\u5801\u5818\u5809\u5818\u5808\u580b\u5818\u580b\u5818\u5831\u5822\u5830\u5831\u5833\u5823\u5831\u5823\u583a\u5828\u5839\u583a\u583b\u583b"), 1746 & 29184);
        if (n < (6155 & 643)) {
            n = -31320 & 4628;
        }
        Field_47314 = n;
        if (Field_47310.Method_6131()) {
            Field_47310.Method_6114(Class_47307.Method_47325("\u6036\u605e\u6070\u6076\u606a\u607a\u606e\u6072\u6072\u607e\u603e\u6078\u6078\u6038\u607a\u6070\u606e\u606e\u6060\u6036\u6070\u6070\u6056\u6078\u606a\u6040\u6074\u6064\u6058\u6066\u6060\u607c\u6076\u6072\u6062\u6078\u606a\u6076\u6072\u6072\u6028\u6032\u606a\u606c"), Field_47309);
            Field_47310.Method_6114(Class_47307.Method_47337("\u100a\u1042\u104c\u104a\u1047\u1047\u1043\u104e\u104e\u1042\u1003\u1045\u1044\u1004\u1047\u104d\u1053\u1052\u105c\u101a\u1050\u1057\u105d\u1055\u105c\u105a\u1052\u105e\u105a\u105f\u105d\u1057\u1065\u1063\u1067\u1061\u106a\u106e\u1065\u1064\u1067\u106c\u1068\u106f\u1063\u1065\u1065\u106c\u103d\u1036\u107e\u1079"), Field_47314);
        }
    }

    private static String Method_47341(String string) {
        int n = 16468;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47307.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    void Method_47342(SelectionKey selectionKey) {
        selectionKey.cancel();
        this.Field_47315 += 25097 & 35;
        if (this.Field_47315 >= (9155 & 284)) {
            this.Field_47315 = 5056 & 8197;
            this.Field_47313 = -31999 & 1169;
        }
    }
}

