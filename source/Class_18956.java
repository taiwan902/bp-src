/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public abstract class Class_18956 {
    private static final Object Field_18957;
    private static final Class_18956 Field_18958;

    static {
        Field_18958 = new Class_25526();
        Field_18957 = new Object();
    }

    private static Class Method_18959(Class class_, String string) {
        throw new IllegalStateException("cannot determine the type of the type parameter '" + string + "': " + class_);
    }

    public static Class_18956 Method_18960(Object object, Class class_, String string) {
        Class_18956 class_18956;
        Class<?> class_2;
        Map map = Class_32728.Method_32743().Method_32731();
        HashMap<String, Class_18956> hashMap = (HashMap<String, Class_18956>)map.get(class_2 = object.getClass());
        if (hashMap == null) {
            hashMap = new HashMap<String, Class_18956>();
            map.put(class_2, hashMap);
        }
        if ((class_18956 = (Class_18956)hashMap.get(string)) == null) {
            class_18956 = Class_18956.Method_18961(Class_18956.Method_18964(object, class_, string));
            hashMap.put(string, class_18956);
        }
        return class_18956;
    }

    public static Class_18956 Method_18961(Class class_) {
        Map map = Class_32728.Method_32743().Method_32739();
        Class_18956 class_18956 = (Class_18956)map.get(class_);
        if (class_18956 == null) {
            if (class_ == Object.class) {
                class_18956 = Field_18958;
            }
            if (class_18956 == null) {
                class_18956 = new Class_42465(class_);
            }
            map.put(class_, class_18956);
        }
        return class_18956;
    }

    public abstract boolean Method_18962(Object var1);

    protected Class_18956() {
    }

    private void Method_18963() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static Class Method_18964(Object object, Class class_, String string) {
        Class<?> class_2;
        Class<?> class_3 = class_2 = object.getClass();
        do {
            int n;
            Type type;
            TypeVariable<Class<?>>[] arrtypeVariable;
            if (class_3.getSuperclass() == class_) {
                n = -1 & -1;
                arrtypeVariable = class_3.getSuperclass().getTypeParameters();
            } else {
                if ((class_3 = class_3.getSuperclass()) != null) continue;
                return Class_18956.Method_18959(class_2, string);
            }
            for (int i = 10248 & 16384; i < arrtypeVariable.length; ++i) {
                if (!string.equals(arrtypeVariable[i].getName())) continue;
                n = i;
                break;
            }
            if (n < 0) {
                throw new IllegalStateException("unknown type parameter '" + string + "': " + class_);
            }
            Type type2 = class_3.getGenericSuperclass();
            if (!(type2 instanceof ParameterizedType)) {
                return Object.class;
            }
            Type[] arrtype = ((ParameterizedType)type2).getActualTypeArguments();
            Type type3 = arrtype[n];
            if (type3 instanceof ParameterizedType) {
                type3 = ((ParameterizedType)type3).getRawType();
            }
            if (type3 instanceof Class) {
                return (Class)type3;
            }
            if (type3 instanceof GenericArrayType) {
                type = ((GenericArrayType)type3).getGenericComponentType();
                if (type instanceof ParameterizedType) {
                    type = ((ParameterizedType)type).getRawType();
                }
                if (type instanceof Class) {
                    return Array.newInstance((Class)type, 12370 & 16900).getClass();
                }
            }
            if (!(type3 instanceof TypeVariable)) return Class_18956.Method_18959(class_2, string);
            type = (TypeVariable)type3;
            class_3 = class_2;
            if (!(type.getGenericDeclaration() instanceof Class)) {
                return Object.class;
            }
            class_ = (Class)type.getGenericDeclaration();
            string = type.getName();
            if (!class_.isAssignableFrom(class_2)) return Object.class;
        } while (true);
    }
}

