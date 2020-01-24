/*
 * Decompiled with CFR 0.145.
 */
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class Class_9808 {
    private String Field_9809;
    private String Field_9810 = "add";
    private HashMap Field_9811 = new HashMap();
    private ArrayList Field_9812 = new ArrayList();

    public Object Method_9813(String string) {
        return this.Method_9820(string, Class_8033.Method_8035(string));
    }

    private Method Method_9814(Class class_, String string) {
        Method[] arrmethod = class_.getDeclaredMethods();
        for (int i = -19808 & 20; i < arrmethod.length; ++i) {
            Class<?>[] arrclass;
            Method method;
            if (!arrmethod[i].getName().equalsIgnoreCase(string) || (arrclass = (method = arrmethod[i]).getParameterTypes()).length != (29 & 7171)) continue;
            return method;
        }
        return null;
    }

    private Object Method_9815(String string, Class class_) {
        if (class_ == String.class) {
            return string;
        }
        try {
            class_ = this.Method_9823(class_);
            Class[] arrclass = new Class[-24559 & 2149];
            arrclass[2692 & 16386] = String.class;
            Object[] arrobject = new Object[915 & 3077];
            arrobject[2068 & 29347] = string;
            return class_.getConstructor(arrclass).newInstance(arrobject);
        }
        catch (Exception exception) {
            throw new Class_30423("Failed to convert: " + string + " to the expected primitive type: " + class_, exception);
        }
    }

    private Method Method_9816(Class class_, String string, Class[] arrclass) {
        try {
            return class_.getMethod(string, arrclass);
        }
        catch (SecurityException securityException) {
            return null;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void Method_9817(Method method, Object object, Object[] arrobject) {
        try {
            method.setAccessible((135 & 7177) != 0);
            method.invoke(object, arrobject);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            try {
                throw new Class_30423("Failed to invoke: " + method + " for an XML attribute, is it valid?", illegalArgumentException);
                catch (IllegalAccessException illegalAccessException) {
                    throw new Class_30423("Failed to invoke: " + method + " for an XML attribute, is it valid?", illegalAccessException);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw new Class_30423("Failed to invoke: " + method + " for an XML attribute, is it valid?", invocationTargetException);
                }
            }
            catch (Throwable throwable) {
                method.setAccessible((-28660 & 17152) != 0);
                throw throwable;
            }
        }
        method.setAccessible((4 & 6152) != 0);
        return;
    }

    public Class_9808() {
    }

    private void Method_9818() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_9808(String string) {
        this.Field_9809 = string;
    }

    private Object Method_9819(Class_45002 class_45002, Object object) {
        String string = class_45002.Method_45015();
        if (this.Field_9812.contains(string)) {
            return null;
        }
        Class class_ = object == null ? this.Method_9821(string) : object.getClass();
        if (class_ == null) {
            throw new Class_30423("Unable to map element " + string + " to a class, define the mapping");
        }
        try {
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            if (object == null) {
                object = class_.newInstance();
                Class[] arrclass = new Class[1041 & 485];
                arrclass[22849 & -23512] = String.class;
                object6 = this.Method_9816(class_, "setXMLElementName", arrclass);
                if (object6 != null) {
                    Object[] arrobject = new Object[11571 & -32767];
                    arrobject[18592 & 328] = string;
                    this.Method_9817((Method)object6, object, arrobject);
                }
                Class[] arrclass2 = new Class[16401 & 13379];
                arrclass2[7232 & 8336] = String.class;
                Method method = this.Method_9816(class_, "setXMLElementContent", arrclass2);
                if (method != null) {
                    Object[] arrobject = new Object[17033 & -32751];
                    arrobject[20753 & 8832] = class_45002.Method_45009();
                    this.Method_9817(method, object, arrobject);
                }
            }
            object6 = class_45002.Method_45013();
            for (int i = 14344 & 17415; i < ((String[])object6).length; ++i) {
                String string2 = "set" + object6[i];
                object2 = this.Method_9814(class_, string2);
                if (object2 == null) {
                    object5 = this.Method_9826(class_, object6[i]);
                    if (object5 != null) {
                        object3 = class_45002.Method_45016(object6[i]);
                        object4 = this.Method_9815((String)object3, ((Field)object5).getType());
                        this.Method_9824((Field)object5, object, object4);
                        continue;
                    }
                    Class_6237.Method_6241("Unable to find property on: " + class_ + " for attribute: " + object6[i]);
                    continue;
                }
                object5 = class_45002.Method_45016(object6[i]);
                object3 = this.Method_9815((String)object5, ((Method)object2).getParameterTypes()[8289 & 8]);
                Object[] arrobject = new Object[199 & 4129];
                arrobject[4352 & -32024] = object3;
                this.Method_9817((Method)object2, object, arrobject);
            }
            Class_19761 class_19761 = class_45002.Method_45011();
            for (int i = 1032 & 24692; i < class_19761.Method_19766(); ++i) {
                object2 = class_19761.Method_19764(i);
                object5 = this.Method_9827((Class_45002)object2);
                if (object5 == null) continue;
                object3 = this.Field_9810;
                object4 = this.Method_9825(class_, (String)object3, object5.getClass());
                if (object4 == null) {
                    Class_6237.Method_6241("Unable to find method to add: " + object5 + " to " + class_);
                    continue;
                }
                Object[] arrobject = new Object[-10143 & 1545];
                arrobject[4128 & -32703] = object5;
                this.Method_9817((Method)object4, object, arrobject);
            }
            return object;
        }
        catch (InstantiationException instantiationException) {
            throw new Class_30423("Unable to instance " + class_ + " for element " + string + ", no zero parameter constructor?", instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new Class_30423("Unable to instance " + class_ + " for element " + string + ", no zero parameter constructor?", illegalAccessException);
        }
    }

    public Object Method_9820(String string, InputStream inputStream) {
        Class_22380 class_22380 = new Class_22380();
        Class_45002 class_45002 = class_22380.Method_22384(string, inputStream);
        return this.Method_9827(class_45002);
    }

    private Class Method_9821(String string) {
        Class class_ = (Class)this.Field_9811.get(string);
        if (class_ != null) {
            return class_;
        }
        if (this.Field_9809 != null) {
            try {
                return Class.forName(this.Field_9809 + "." + string);
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        return null;
    }

    public void Method_9822(String string, Class class_) {
        this.Field_9811.put(string, class_);
    }

    private Class Method_9823(Class class_) {
        if (class_ == Integer.TYPE) {
            return Integer.class;
        }
        if (class_ == Double.TYPE) {
            return Double.class;
        }
        if (class_ == Float.TYPE) {
            return Float.class;
        }
        if (class_ == Boolean.TYPE) {
            return Boolean.class;
        }
        if (class_ == Long.TYPE) {
            return Long.class;
        }
        throw new RuntimeException("Unsupported primitive: " + class_);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void Method_9824(Field field, Object object, Object object2) {
        try {
            field.setAccessible((1 & 29411) != 0);
            field.set(object, object2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            try {
                throw new Class_30423("Failed to set: " + field + " for an XML attribute, is it valid?", illegalArgumentException);
                catch (IllegalAccessException illegalAccessException) {
                    throw new Class_30423("Failed to set: " + field + " for an XML attribute, is it valid?", illegalAccessException);
                }
            }
            catch (Throwable throwable) {
                field.setAccessible((513 & -21072) != 0);
                throw throwable;
            }
        }
        field.setAccessible((5400 & -15807) != 0);
        return;
    }

    private Method Method_9825(Class class_, String string, Class class_2) {
        Method[] arrmethod = class_.getDeclaredMethods();
        for (int i = -26880 & 18664; i < arrmethod.length; ++i) {
            Method method;
            Class<?>[] arrclass;
            if (!arrmethod[i].getName().equalsIgnoreCase(string) || (arrclass = (method = arrmethod[i]).getParameterTypes()).length != (-31775 & 11277) || !method.getParameterTypes()[4760 & -31742].isAssignableFrom(class_2)) continue;
            return method;
        }
        return null;
    }

    private Field Method_9826(Class class_, String string) {
        Field[] arrfield = class_.getDeclaredFields();
        for (int i = 20 & 6563; i < arrfield.length; ++i) {
            if (!arrfield[i].getName().equalsIgnoreCase(string)) continue;
            if (arrfield[i].getType().isPrimitive()) {
                return arrfield[i];
            }
            if (arrfield[i].getType() != String.class) continue;
            return arrfield[i];
        }
        return null;
    }

    private Object Method_9827(Class_45002 class_45002) {
        return this.Method_9819(class_45002, null);
    }
}

