/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class_45721
extends Class_17103 {
    private final Class_16054 Field_45722 = new Class_16054(this);
    private final Class_16054[] Field_45723 = new Class_16054[3737 & -24555];
    protected final boolean Field_45724;

    public Iterator Method_45725() {
        return new Class_9859(this, null);
    }

    void Method_45726(Class_22553 class_22553) {
        Class_16054 class_16054 = this.Field_45722.Field_16057;
        while (class_16054 != this.Field_45722) {
            class_16054.Method_16070(class_22553);
            class_16054 = class_16054.Field_16057;
        }
    }

    public Class_45721() {
        this((-31217 & 16529) != 0);
    }

    public boolean Method_45727(String string) {
        return (this.Method_45729(string) != null ? -28461 & 10757 : 69 & 10904) != 0;
    }

    public Class_17103 Method_45728(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("name");
        }
        int n = Class_45721.hash((CharSequence)charSequence);
        int n2 = Class_45721.Method_45738(n);
        this.Method_45743(n, n2, charSequence);
        return this;
    }

    public Class_45721(boolean bl) {
        this.Field_45724 = bl;
        this.Field_45722.Field_16056 = this.Field_45722.Field_16057 = this.Field_45722;
    }

    public String Method_45729(String string) {
        return this.Method_45749(string);
    }

    public boolean Method_45730(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        if (charSequence == null) {
            throw new NullPointerException("name");
        }
        int n = Class_45721.hash((CharSequence)charSequence);
        int n2 = Class_45721.Method_45738(n);
        Class_16054 class_16054 = this.Field_45723[n2];
        while (class_16054 != null) {
            if (class_16054.Field_16059 == n && Class_45721.equalsIgnoreCase((CharSequence)charSequence, (CharSequence)class_16054.Field_16061)) {
                if (bl) {
                    if (Class_45721.equalsIgnoreCase((CharSequence)class_16054.Field_16055, (CharSequence)charSequence2)) {
                        return (-32543 & 23817) != 0;
                    }
                } else if (class_16054.Field_16055.equals(charSequence2)) {
                    return (-16379 & 5395) != 0;
                }
            }
            class_16054 = class_16054.Field_16058;
        }
        return (24576 & -30600) != 0;
    }

    public Class_17103 Method_45731(CharSequence charSequence, Object object) {
        CharSequence charSequence2;
        if (this.Field_45724) {
            this.Method_45745(charSequence);
            charSequence2 = Class_45721.Method_45744(object);
            Class_45721.validateHeaderValue((CharSequence)charSequence2);
        } else {
            charSequence2 = Class_45721.Method_45744(object);
        }
        int n = Class_45721.hash((CharSequence)charSequence);
        int n2 = Class_45721.Method_45738(n);
        this.Method_45743(n, n2, charSequence);
        this.Method_45734(n, n2, charSequence, charSequence2);
        return this;
    }

    public List Method_45732(String string) {
        return this.Method_45750(string);
    }

    public Class_17103 Method_45733(String string) {
        return this.Method_45728(string);
    }

    private void Method_45734(int n, int n2, CharSequence charSequence, CharSequence charSequence2) {
        Class_16054 class_16054;
        Class_16054 class_160542 = this.Field_45723[n2];
        this.Field_45723[n2] = class_16054 = new Class_16054(this, n, charSequence, charSequence2);
        class_16054.Field_16058 = class_160542;
        class_16054.Method_16071(this.Field_45722);
    }

    static Class_16054 Method_45735(Class_45721 class_45721) {
        return class_45721.Field_45722;
    }

    public Class_17103 Method_45736(String string, Iterable iterable) {
        return this.Method_45737(string, iterable);
    }

    public Class_17103 Method_45737(CharSequence charSequence, Iterable iterable) {
        if (iterable == null) {
            throw new NullPointerException("values");
        }
        if (this.Field_45724) {
            this.Method_45745(charSequence);
        }
        int n = Class_45721.hash((CharSequence)charSequence);
        int n2 = Class_45721.Method_45738(n);
        this.Method_45743(n, n2, charSequence);
        for (Object t : iterable) {
            if (t == null) break;
            CharSequence charSequence2 = Class_45721.Method_45744(t);
            if (this.Field_45724) {
                Class_45721.validateHeaderValue((CharSequence)charSequence2);
            }
            this.Method_45734(n, n2, charSequence, charSequence2);
        }
        return this;
    }

    private static int Method_45738(int n) {
        return n % (-23981 & 16413);
    }

    public boolean Method_45739(CharSequence charSequence) {
        return (this.Method_45749(charSequence) != null ? 69 & 5433 : 577 & 5140) != 0;
    }

    public Class_17103 Method_45740() {
        Arrays.fill(this.Field_45723, null);
        this.Field_45722.Field_16056 = this.Field_45722.Field_16057 = this.Field_45722;
        return this;
    }

    public Class_17103 Method_45741(String string, Object object) {
        return this.Method_45751(string, object);
    }

    public boolean Method_45742(String string, String string2, boolean bl) {
        return this.Method_45730(string, string2, bl);
    }

    private void Method_45743(int n, int n2, CharSequence charSequence) {
        Class_16054 class_16054;
        Class_16054 class_160542 = this.Field_45723[n2];
        if (class_160542 == null) {
            return;
        }
        while (class_160542.Field_16059 == n && Class_45721.equalsIgnoreCase((CharSequence)charSequence, (CharSequence)class_160542.Field_16061)) {
            class_160542.Method_16067();
            class_16054 = class_160542.Field_16058;
            if (class_16054 != null) {
                this.Field_45723[n2] = class_16054;
                class_160542 = class_16054;
                continue;
            }
            this.Field_45723[n2] = null;
            return;
        }
        while ((class_16054 = class_160542.Field_16058) != null) {
            if (class_16054.Field_16059 == n && Class_45721.equalsIgnoreCase((CharSequence)charSequence, (CharSequence)class_16054.Field_16061)) {
                class_160542.Field_16058 = class_16054.Field_16058;
                class_16054.Method_16067();
                continue;
            }
            class_160542 = class_16054;
        }
    }

    private static CharSequence Method_45744(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof CharSequence) {
            return (CharSequence)object;
        }
        if (object instanceof Number) {
            return object.toString();
        }
        if (object instanceof Date) {
            return Class_6252.Method_6258().format((Date)object);
        }
        if (object instanceof Calendar) {
            return Class_6252.Method_6258().format(((Calendar)object).getTime());
        }
        return object.toString();
    }

    void Method_45745(CharSequence charSequence) {
        Class_45721.validateHeaderName((CharSequence)charSequence);
    }

    public boolean Method_45746() {
        return (this.Field_45722 == this.Field_45722.Field_16057 ? 6339 & 1289 : -8174 & 352) != 0;
    }

    private void Method_45747() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_17103 Method_45748(String string, Object object) {
        return this.Method_45731(string, object);
    }

    public String Method_45749(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("name");
        }
        int n = Class_45721.hash((CharSequence)charSequence);
        int n2 = Class_45721.Method_45738(n);
        Class_16054 class_16054 = this.Field_45723[n2];
        CharSequence charSequence2 = null;
        while (class_16054 != null) {
            if (class_16054.Field_16059 == n && Class_45721.equalsIgnoreCase((CharSequence)charSequence, (CharSequence)class_16054.Field_16061)) {
                charSequence2 = class_16054.Field_16055;
            }
            class_16054 = class_16054.Field_16058;
        }
        if (charSequence2 == null) {
            return null;
        }
        return charSequence2.toString();
    }

    public List Method_45750(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("name");
        }
        LinkedList<String> linkedList = new LinkedList<String>();
        int n = Class_45721.hash((CharSequence)charSequence);
        int n2 = Class_45721.Method_45738(n);
        Class_16054 class_16054 = this.Field_45723[n2];
        while (class_16054 != null) {
            if (class_16054.Field_16059 == n && Class_45721.equalsIgnoreCase((CharSequence)charSequence, (CharSequence)class_16054.Field_16061)) {
                linkedList.addFirst(class_16054.Method_16065());
            }
            class_16054 = class_16054.Field_16058;
        }
        return linkedList;
    }

    public Class_17103 Method_45751(CharSequence charSequence, Object object) {
        CharSequence charSequence2;
        if (this.Field_45724) {
            this.Method_45745(charSequence);
            charSequence2 = Class_45721.Method_45744(object);
            Class_45721.validateHeaderValue((CharSequence)charSequence2);
        } else {
            charSequence2 = Class_45721.Method_45744(object);
        }
        int n = Class_45721.hash((CharSequence)charSequence);
        int n2 = Class_45721.Method_45738(n);
        this.Method_45734(n, n2, charSequence, charSequence2);
        return this;
    }
}

