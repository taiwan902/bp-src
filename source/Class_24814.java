/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class Class_24814
implements Class_6274 {
    static final boolean Field_24815 = !Class_24814.class.desiredAssertionStatus() ? 17413 & 833 : 10265 & -28510;
    final Class_42469 Field_24816;
    final Class_31282 Field_24817;
    private static final WeakHashMap[] Field_24818;
    static final Class_6113 Field_24819;
    final Class_42469 Field_24820;
    private final Map Field_24821 = new HashMap(1036 & -20396);
    final Map Field_24822 = new IdentityHashMap();

    private static String Method_24823(Class class_) {
        return Class_22304.Method_22309(class_) + "#0";
    }

    public List Method_24824() {
        ArrayList<String> arrayList = new ArrayList<String>();
        Class_42469 class_42469 = this.Field_24816.Field_42474;
        while (class_42469 != null) {
            arrayList.add(class_42469.Method_42507());
            class_42469 = class_42469.Field_42474;
        }
        return arrayList;
    }

    public Class_6274 Method_24825() {
        this.Field_24816.Method_42490();
        if (this.Field_24817.config().Method_19098()) {
            this.Field_24817.Method_31309();
        }
        return this;
    }

    public Class_6274 Method_24826() {
        this.Field_24820.Method_42493();
        return this;
    }

    public Iterator Method_24827() {
        return this.Method_24844().entrySet().iterator();
    }

    private void Method_24828(Class_39158 class_39158) {
        if (class_39158.Method_39175().Method_26112() && !class_39158.Method_39160().Method_37084()) {
            class_39158.Method_39160().execute(new Class_15101(this, class_39158));
            return;
        }
        this.Method_24855(class_39158);
    }

    private void Method_24829(Class_42469 class_42469) {
        if (class_42469.Method_42494().Method_26112() && !class_42469.Method_42521().Method_37084()) {
            class_42469.Method_42521().execute(new Class_27470(this, class_42469));
            return;
        }
        this.Method_24845(class_42469);
    }

    private void Method_24830(String string, Class_42469 class_42469) {
        Class_42469 class_424692;
        Class_24814.Method_24853(class_42469);
        class_42469.Field_42473 = class_424692 = this.Field_24820.Field_42473;
        class_42469.Field_42474 = this.Field_24820;
        class_424692.Field_42474 = class_42469;
        this.Field_24820.Field_42473 = class_42469;
        this.Field_24821.put(string, class_42469);
        this.Method_24828(class_42469);
    }

    public Class_6274 Method_24831() {
        this.Field_24816.Method_42528();
        if (!this.Field_24817.isOpen()) {
            this.Method_24847();
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_6274 Method_24832(Class_17563 class_17563, String string, Class_31885 class_31885) {
        Class_24814 class_24814 = this;
        synchronized (class_24814) {
            this.Method_24867(string);
            Class_43465 class_43465 = new Class_43465(this, class_17563, string, class_31885);
            this.Method_24843(string, class_43465);
        }
        return this;
    }

    public Class_6274 Method_24833(String string, Class_31885 class_31885) {
        return this.Method_24865(null, string, class_31885);
    }

    public Class_6274 Method_24834(Object object) {
        this.Field_24816.Method_42508(object);
        return this;
    }

    public Class_6274 Method_24835(Object object) {
        this.Field_24816.Method_42541(object);
        return this;
    }

    public Class_27581 Method_24836() {
        return this.Field_24820.Method_42537();
    }

    public Class_6274 Method_24837() {
        this.Field_24816.Method_42515();
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_6274 Method_24838(Class_17563 class_17563, String string, String string2, Class_31885 class_31885) {
        Class_24814 class_24814 = this;
        synchronized (class_24814) {
            Class_42469 class_42469 = this.Method_24873(string);
            this.Method_24867(string2);
            Class_43465 class_43465 = new Class_43465(this, class_17563, string2, class_31885);
            this.Method_24850(string2, class_42469, class_43465);
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_39158 Method_24839(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        Class_24814 class_24814 = this;
        synchronized (class_24814) {
            return (Class_39158)this.Field_24821.get(string);
        }
    }

    public Class_39158 Method_24840(Class_31885 class_31885) {
        if (class_31885 == null) {
            throw new NullPointerException("handler");
        }
        Class_42469 class_42469 = this.Field_24816.Field_42474;
        while (class_42469 != null) {
            if (class_42469.handler() == class_31885) {
                return class_42469;
            }
            class_42469 = class_42469.Field_42474;
        }
        return null;
    }

    private static void Method_24841(Future future) {
        try {
            future.get();
        }
        catch (ExecutionException executionException) {
            Class_7799.Method_7834(executionException.getCause());
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public Class_6274 Method_24842(Class_31885 class_31885) {
        this.Method_24872(this.Method_24851(class_31885));
        return this;
    }

    private void Method_24843(String string, Class_42469 class_42469) {
        Class_24814.Method_24853(class_42469);
        Class_42469 class_424692 = this.Field_24816.Field_42474;
        class_42469.Field_42473 = this.Field_24816;
        class_42469.Field_42474 = class_424692;
        this.Field_24816.Field_42474 = class_42469;
        class_424692.Field_42473 = class_42469;
        this.Field_24821.put(string, class_42469);
        this.Method_24828(class_42469);
    }

    public Map Method_24844() {
        LinkedHashMap<String, Class_31885> linkedHashMap = new LinkedHashMap<String, Class_31885>();
        Class_42469 class_42469 = this.Field_24816.Field_42474;
        while (class_42469 != this.Field_24820) {
            linkedHashMap.put(class_42469.Method_42507(), class_42469.handler());
            class_42469 = class_42469.Field_42474;
        }
        return linkedHashMap;
    }

    private void Method_24845(Class_42469 class_42469) {
        try {
            class_42469.handler().Method_31887(class_42469);
            class_42469.Method_42510();
        }
        catch (Throwable throwable) {
            this.Method_24864(new Class_31556(class_42469.handler().getClass().getName() + ".handlerRemoved() has thrown an exception.", throwable));
        }
    }

    void Method_24846(Class_42469 class_42469) {
        Class_42469 class_424692;
        Class_42469 class_424693 = class_42469.Field_42473;
        class_424693.Field_42474 = class_424692 = class_42469.Field_42474;
        class_424692.Field_42473 = class_424693;
        this.Field_24821.remove(class_42469.Method_42507());
        this.Method_24829(class_42469);
    }

    private void Method_24847() {
        this.Field_24820.Field_42473.Method_42542();
    }

    public Class_6274 Method_24848(Class_31885 ... arrclass_31885) {
        return this.Method_24859(null, arrclass_31885);
    }

    public Class_27581 Method_24849(SocketAddress socketAddress, Class_37748 class_37748) {
        return this.Field_24820.Method_42519(socketAddress, class_37748);
    }

    private void Method_24850(String string, Class_42469 class_42469, Class_42469 class_424692) {
        Class_24814.Method_24853(class_424692);
        class_424692.Field_42473 = class_42469.Field_42473;
        class_424692.Field_42474 = class_42469;
        class_42469.Field_42473.Field_42474 = class_424692;
        class_42469.Field_42473 = class_424692;
        this.Field_24821.put(string, class_424692);
        this.Method_24828(class_424692);
    }

    private Class_42469 Method_24851(Class_31885 class_31885) {
        Class_42469 class_42469 = (Class_42469)this.Method_24840(class_31885);
        if (class_42469 == null) {
            throw new NoSuchElementException(class_31885.getClass().getName());
        }
        return class_42469;
    }

    private void Method_24852() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static void Method_24853(Class_39158 class_39158) {
        Class_31885 class_31885 = class_39158.Method_39184();
        if (class_31885 instanceof Class_36003) {
            Class_36003 class_36003 = (Class_36003)class_31885;
            if (!class_36003.Method_36007() && class_36003.Field_36004) {
                throw new Class_31556(class_36003.getClass().getName() + " is not a @Sharable handler, so can't be added or removed multiple times.");
            }
            class_36003.Field_36004 = 161 & 1049;
        }
    }

    public String Method_24854() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Class_22304.Method_22312(this));
        stringBuilder.append((char)(18555 & 511));
        Class_42469 class_42469 = this.Field_24816.Field_42474;
        while (class_42469 != this.Field_24820) {
            stringBuilder.append((char)(9391 & 312));
            stringBuilder.append(class_42469.Method_42507());
            stringBuilder.append(" = ");
            stringBuilder.append(class_42469.handler().getClass().getName());
            stringBuilder.append((char)(16555 & -29399));
            class_42469 = class_42469.Field_42474;
            if (class_42469 == this.Field_24820) break;
            stringBuilder.append(", ");
        }
        stringBuilder.append((char)(-24451 & 19837));
        return stringBuilder.toString();
    }

    private void Method_24855(Class_39158 class_39158) {
        try {
            class_39158.Method_39184().Method_31886(class_39158);
        }
        catch (Throwable throwable) {
            int n;
            block5 : {
                n = 16552 & 2370;
                try {
                    this.Method_24872((Class_42469)class_39158);
                    n = 16491 & 1029;
                }
                catch (Throwable throwable2) {
                    if (!Field_24819.Method_6119()) break block5;
                    Field_24819.Method_6127("Failed to remove a handler: " + class_39158.Method_39180(), throwable2);
                }
            }
            if (n != 0) {
                this.Method_24864(new Class_31556(class_39158.Method_39184().getClass().getName() + ".handlerAdded() has thrown an exception; removed.", throwable));
            }
            this.Method_24864(new Class_31556(class_39158.Method_39184().getClass().getName() + ".handlerAdded() has thrown an exception; also failed to remove.", throwable));
        }
    }

    public Class_6274 Method_24856() {
        this.Field_24816.Method_42497();
        return this;
    }

    public Class_27581 Method_24857(SocketAddress socketAddress, Class_37748 class_37748) {
        return this.Field_24820.Method_42492(socketAddress, class_37748);
    }

    public Class_6274 Method_24858(String string, Class_31885 class_31885) {
        return this.Method_24832(null, string, class_31885);
    }

    public Class_6274 Method_24859(Class_17563 class_17563, Class_31885 ... arrclass_31885) {
        Class_31885 class_31885;
        if (arrclass_31885 == null) {
            throw new NullPointerException("handlers");
        }
        Class_31885[] arrclass_318852 = arrclass_31885;
        int n = arrclass_318852.length;
        for (int i = 4912 & -13312; i < n && (class_31885 = arrclass_318852[i]) != null; ++i) {
            this.Method_24865(class_17563, this.Method_24861(class_31885), class_31885);
        }
        return this;
    }

    static void Method_24860(Class_24814 class_24814, Class_39158 class_39158) {
        class_24814.Method_24855(class_39158);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String Method_24861(Class_31885 class_31885) {
        String string;
        WeakHashMap weakHashMap = Field_24818[(int)(Thread.currentThread().getId() % (long)Field_24818.length)];
        Class<?> class_ = class_31885.getClass();
        Object object = weakHashMap;
        synchronized (object) {
            string = (String)weakHashMap.get(class_);
            if (string == null) {
                string = Class_24814.Method_24823(class_);
                weakHashMap.put(class_, string);
            }
        }
        object = this;
        synchronized (object) {
            if (this.Field_24821.containsKey(string)) {
                String string2 = string.substring(19977 & -32494, string.length() - (24937 & -32619));
                int n = 395 & 9285;
                do {
                    String string3;
                    if (!this.Field_24821.containsKey(string3 = string2 + n)) {
                        string = string3;
                        break;
                    }
                    ++n;
                } while (true);
            }
        }
        return string;
    }

    public Class_6274 Method_24862() {
        this.Field_24820.Method_42553();
        return this;
    }

    public Class_27581 Method_24863(SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        return this.Field_24820.Method_42484(socketAddress, socketAddress2, class_37748);
    }

    public Class_6274 Method_24864(Throwable throwable) {
        this.Field_24816.Method_42513(throwable);
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_6274 Method_24865(Class_17563 class_17563, String string, Class_31885 class_31885) {
        Class_24814 class_24814 = this;
        synchronized (class_24814) {
            this.Method_24867(string);
            Class_43465 class_43465 = new Class_43465(this, class_17563, string, class_31885);
            this.Method_24830(string, class_43465);
        }
        return this;
    }

    static void Method_24866(Class_24814 class_24814, Class_42469 class_42469) {
        class_24814.Method_24845(class_42469);
    }

    private void Method_24867(String string) {
        if (this.Field_24821.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate handler name: " + string);
        }
    }

    static String Method_24868(Class class_) {
        return Class_24814.Method_24823(class_);
    }

    static {
        Field_24819 = Class_10201.Method_10203(Class_24814.class);
        Field_24818 = new WeakHashMap[java.lang.Runtime.getRuntime().availableProcessors()];
        for (int i = 20101 & -32766; i < Field_24818.length; ++i) {
            Class_24814.Field_24818[i] = new WeakHashMap();
        }
    }

    public Class_6274 Method_24869(String string, String string2, Class_31885 class_31885) {
        return this.Method_24838(null, string, string2, class_31885);
    }

    public Class_31885 Method_24870(String string) {
        Class_39158 class_39158 = this.Method_24839(string);
        if (class_39158 == null) {
            return null;
        }
        return class_39158.Method_39184();
    }

    public Class_26095 Method_24871() {
        return this.Field_24817;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Class_42469 Method_24872(Class_42469 class_42469) {
        Class_21065 class_21065;
        Class_42469 class_424692;
        if (!(Field_24815 || class_42469 != this.Field_24816 && class_42469 != this.Field_24820)) {
            throw new AssertionError();
        }
        Class_24814 class_24814 = this;
        synchronized (class_24814) {
            if (!class_42469.Method_42494().Method_26112() || class_42469.Method_42521().Method_37084()) {
                this.Method_24846(class_42469);
                return class_42469;
            }
            class_21065 = class_42469.Method_42521().submit((Runnable)new Class_13997(this, class_42469));
            class_424692 = class_42469;
        }
        Class_24814.Method_24841(class_21065);
        return class_424692;
    }

    private Class_42469 Method_24873(String string) {
        Class_42469 class_42469 = (Class_42469)this.Method_24839(string);
        if (class_42469 == null) {
            throw new NoSuchElementException(string);
        }
        return class_42469;
    }

    public Class_6274 Method_24874() {
        this.Field_24816.Method_42532();
        if (this.Field_24817.config().Method_19098()) {
            this.Method_24862();
        }
        return this;
    }

    public Class_39158 Method_24875() {
        Class_42469 class_42469 = this.Field_24816.Field_42474;
        if (class_42469 == this.Field_24820) {
            return null;
        }
        return this.Field_24816.Field_42474;
    }

    public Class_31885 Method_24876(String string) {
        return this.Method_24872(this.Method_24873(string)).handler();
    }

    public Class_24814(Class_31282 class_31282) {
        if (class_31282 == null) {
            throw new NullPointerException("channel");
        }
        this.Field_24817 = class_31282;
        this.Field_24820 = new Class_44498(this);
        this.Field_24816 = new Class_45934(this);
        this.Field_24816.Field_42474 = this.Field_24820;
        this.Field_24820.Field_42473 = this.Field_24816;
    }

    public Class_27581 Method_24877(Object object) {
        return this.Field_24820.Method_42536(object);
    }

    public Class_6274 Method_24878() {
        this.Field_24816.Method_42538();
        return this;
    }
}

