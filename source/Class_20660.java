/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class_20660 {
    private Class_18171 Field_20661;

    private Class_13745 Method_20662(Class_12372 class_12372) {
        if (this.Field_20661 == null) {
            throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Model variable not found: " + class_12372);
        }
        Class_13745 class_13745 = this.Field_20661.Method_18172(class_12372.Method_12378());
        if (class_13745 != null) {
            return class_13745;
        }
        throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Model variable not found: " + class_12372);
    }

    private void Method_20663() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_13745 Method_20664(Deque deque) {
        Class_12372 class_12372;
        if (deque.isEmpty()) {
            return null;
        }
        LinkedList<Class_13745> linkedList = new LinkedList<Class_13745>();
        LinkedList<Class_12372> linkedList2 = new LinkedList<Class_12372>();
        Class_13745 class_13745 = this.Method_20667(deque);
        Class_20660.Method_20677(class_13745, "Missing expression");
        linkedList.add(class_13745);
        while ((class_12372 = (Class_12372)deque.poll()) != null) {
            if (class_12372.Method_12376() != Class_15637.Field_15642) {
                throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Invalid operator: " + class_12372);
            }
            Class_13745 class_137452 = this.Method_20667(deque);
            Class_20660.Method_20677(class_137452, "Missing expression");
            linkedList2.add(class_12372);
            linkedList.add(class_137452);
        }
        return this.Method_20670(linkedList, linkedList2);
    }

    private Class_13745 Method_20665(Class_35389 class_35389, Deque deque) {
        if (class_35389.Method_35447(new Class_13745[578 & -10096]) == 0) {
            return Class_20660.Method_20675(class_35389, new Class_13745[5124 & 18931]);
        }
        Class_12372 class_12372 = (Class_12372)deque.poll();
        Deque deque2 = Class_20660.Method_20673(deque, Class_15637.Field_15644, (20485 & -29935) != 0);
        Class_13745[] arrclass_13745 = this.Method_20674(deque2);
        return Class_20660.Method_20675(class_35389, arrclass_13745);
    }

    private static Class_13745 Method_20666(Class_12372 class_12372) {
        float f = Class_19426.Method_19595(class_12372.Method_12378(), Float.NaN);
        if (f != Float.NaN) {
            return new Class_40687(f);
        }
        throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Invalid float value: " + class_12372);
    }

    private Class_13745 Method_20667(Deque deque) {
        Class_12372 class_12372 = (Class_12372)deque.poll();
        Class_20660.Method_20677(class_12372, "Missing expression");
        switch (class_12372.Method_12376().ordinal()) {
            case 1: {
                return Class_20660.Method_20666(class_12372);
            }
            case 2: {
                Class_35389 class_35389 = this.Method_20668(class_12372, deque);
                if (class_35389 == null) {
                    return this.Method_20662(class_12372);
                }
                return this.Method_20665(class_35389, deque);
            }
            case 3: {
                return this.Method_20671(class_12372, deque);
            }
            case 4: {
                Class_35389 class_35389 = Class_35389.Method_35461(class_12372.Method_12378());
                Class_20660.Method_20677((Object)class_35389, "Invalid operator: " + class_12372);
                if (class_35389 == Class_35389.Field_35407) {
                    return this.Method_20667(deque);
                }
                if (class_35389 == Class_35389.Field_35391) {
                    Class_13745 class_13745 = this.Method_20667(deque);
                    Class_13745[] arrclass_13745 = new Class_13745[-3071 & 2681];
                    arrclass_13745[5648 & 24832] = class_13745;
                    return Class_20660.Method_20675(Class_35389.Field_35415, arrclass_13745);
                }
                if (class_35389 != Class_35389.Field_35396) {
                    throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Invalid expression: " + class_12372);
                }
                Class_13745 class_13745 = this.Method_20667(deque);
                Class_13745[] arrclass_13745 = new Class_13745[-7645 & 1041];
                arrclass_13745[4096 & 25650] = class_13745;
                return Class_20660.Method_20675(Class_35389.Field_35396, arrclass_13745);
            }
        }
        throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Invalid expression: " + class_12372);
    }

    private Class_35389 Method_20668(Class_12372 class_12372, Deque deque) {
        Class_12372 class_123722 = (Class_12372)deque.peek();
        if (class_123722 != null && class_123722.Method_12376() == Class_15637.Field_15646) {
            Class_35389 class_35389 = Class_35389.Method_35461(class_12372.Method_12378());
            Class_20660.Method_20677((Object)class_35389, "Unknown function: " + class_12372);
            return class_35389;
        }
        Class_35389 class_35389 = Class_35389.Method_35461(class_12372.Method_12378());
        if (class_35389 == null) {
            return null;
        }
        if (class_35389.Method_35447(new Class_13745[2560 & -32720]) <= 0) {
            return class_35389;
        }
        throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Missing arguments: " + (Object)((Object)class_35389));
    }

    public Class_13745 Method_20669(String string) {
        try {
            Class_12372[] arrclass_12372 = Class_6270.Method_6272(string);
            if (arrclass_12372 == null) {
                return null;
            }
            ArrayDeque<Class_12372> arrayDeque = new ArrayDeque<Class_12372>(Arrays.asList(arrclass_12372));
            return this.Method_20664(arrayDeque);
        }
        catch (IOException iOException) {
            throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long(iOException.getMessage(), (Throwable)iOException);
        }
    }

    private Class_13745 Method_20670(List list, List list2) {
        LinkedList<Class_35389> linkedList = new LinkedList<Class_35389>();
        for (Class_12372 class_12372 : list2) {
            Class_35389 class_35389 = Class_35389.Method_35461(class_12372.Method_12378());
            Class_20660.Method_20677((Object)class_35389, "Invalid operator: " + class_12372);
            linkedList.add(class_35389);
        }
        return this.Method_20676(list, linkedList);
    }

    public Class_20660(Class_18171 class_18171) {
        this.Field_20661 = class_18171;
    }

    private Class_13745 Method_20671(Class_12372 class_12372, Deque deque) {
        Deque deque2 = Class_20660.Method_20673(deque, Class_15637.Field_15644, (-32315 & 31753) != 0);
        return this.Method_20664(deque2);
    }

    private void Method_20672(List list, List list2, int n) {
        for (int i = 1154 & 16400; i < list2.size(); ++i) {
            Class_35389 class_35389 = (Class_35389)((Object)list2.get(i));
            if (class_35389.Method_35535() != n) continue;
            list2.remove(i);
            Class_13745 class_13745 = (Class_13745)list.remove(i);
            Class_13745 class_137452 = (Class_13745)list.remove(i);
            Class_13745[] arrclass_13745 = new Class_13745[346 & 6179];
            arrclass_13745[-26624 & 1029] = class_13745;
            arrclass_13745[909 & -32719] = class_137452;
            Class_13745 class_137453 = Class_20660.Method_20675(class_35389, arrclass_13745);
            list.add(i, class_137453);
            --i;
        }
    }

    private static Deque Method_20673(Deque deque, Class_15637 class_15637, boolean bl) {
        ArrayDeque<Class_12372> arrayDeque = new ArrayDeque<Class_12372>();
        int n = 1152 & 10252;
        Iterator iterator = deque.iterator();
        do {
            if (!iterator.hasNext()) {
                if (!bl) {
                    return arrayDeque;
                }
                throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Missing end token: " + (Object)((Object)class_15637));
            }
            Class_12372 class_12372 = (Class_12372)iterator.next();
            iterator.remove();
            if (n == 0 && class_12372.Method_12376() == class_15637) {
                return arrayDeque;
            }
            arrayDeque.add(class_12372);
            if (class_12372.Method_12376() == Class_15637.Field_15646) {
                ++n;
            }
            if (class_12372.Method_12376() != Class_15637.Field_15644) continue;
            --n;
        } while (true);
    }

    private Class_13745[] Method_20674(Deque deque) {
        Deque deque2;
        Class_13745 class_13745;
        ArrayList<Class_13745> arrayList = new ArrayList<Class_13745>();
        while ((class_13745 = this.Method_20664(deque2 = Class_20660.Method_20673(deque, Class_15637.Field_15641, (16432 & -24566) != 0))) != null) {
            arrayList.add(class_13745);
        }
        return arrayList.toArray(new Class_13745[arrayList.size()]);
    }

    private static Class_13745 Method_20675(Class_35389 class_35389, Class_13745[] arrclass_13745) {
        Class_18434[] arrclass_18434 = class_35389.Method_35547(arrclass_13745);
        if (arrclass_13745.length != arrclass_18434.length) {
            throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Invalid number of arguments, function: \"" + class_35389.Method_35454() + "\", count arguments: " + arrclass_13745.length + ", should be: " + arrclass_18434.length);
        }
        for (int i = 272 & 3719; i < arrclass_13745.length; ++i) {
            Class_18434 class_18434;
            Class_13745 class_13745 = arrclass_13745[i];
            Class_18434 class_184342 = class_13745.Method_13746();
            if (class_184342 == (class_18434 = arrclass_18434[i])) continue;
            throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Invalid argument type, function: \"" + class_35389.Method_35454() + "\", index: " + i + ", type: " + (Object)((Object)class_184342) + ", should be: " + (Object)((Object)class_18434));
        }
        if (class_35389.Method_35486() == Class_18434.Field_18437) {
            return new Class_37189(class_35389, arrclass_13745);
        }
        if (class_35389.Method_35486() != Class_18434.Field_18436) {
            throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Unknown function type: " + (Object)((Object)class_35389.Method_35486()) + ", function: " + class_35389.Method_35454());
        }
        return new Class_37976(class_35389, arrclass_13745);
    }

    private Class_13745 Method_20676(List list, List list2) {
        if (list.size() != list2.size() + (529 & 37)) {
            throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Invalid infix expression, expressions: " + list.size() + ", operators: " + list2.size());
        }
        if (list.size() == (9315 & 5)) {
            return (Class_13745)list.get(4 & 1040);
        }
        int n = Integer.MAX_VALUE & Integer.MAX_VALUE;
        int n2 = -1034899440 & -1811332827;
        for (Class_35389 class_35389 : list2) {
            n = Math.min(class_35389.Method_35535(), n);
            n2 = Math.max(class_35389.Method_35535(), n2);
        }
        if (n2 < n) {
            throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Invalid infix precedence, min: " + n + ", max: " + n2);
        }
        if (n2 - n > (16539 & 6154)) {
            throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Invalid infix precedence, min: " + n + ", max: " + n2);
        }
        int n3 = n2;
        do {
            if (n3 < n) {
                if (list.size() != (17235 & -19327)) {
                    throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Error merging operators, expressions: " + list.size() + ", operators: " + list2.size());
                }
                if (list2.size() == 0) {
                    return (Class_13745)list.get(-30719 & 8732);
                }
                throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Error merging operators, expressions: " + list.size() + ", operators: " + list2.size());
            }
            this.Method_20672(list, list2, n3);
            --n3;
        } while (true);
    }

    private static void Method_20677(Object object, String string) {
        if (object != null) {
            return;
        }
        throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long(string);
    }
}

