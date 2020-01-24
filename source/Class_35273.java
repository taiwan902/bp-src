/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_35273 {
    private Map Field_35274 = new HashMap();
    private Class_26655 Field_35275;
    private List Field_35276 = new ArrayList();
    protected Map Field_35277 = new HashMap();

    public int Method_35278(String string) {
        Short s = (Short)this.Field_35274.get(string);
        s = s == null ? Short.valueOf((short)(1097 & 6274)) : Short.valueOf((short)(s + (12453 & 2305)));
        this.Field_35274.put(string, s);
        if (this.Field_35275 == null) {
            return s.shortValue();
        }
        try {
            File file = this.Field_35275.Method_26662("idcounts");
            if (file != null) {
                Class_1699 class_1699 = new Class_1699();
                for (String string2 : this.Field_35274.keySet()) {
                    short s2 = (Short)this.Field_35274.get(string2);
                    class_1699.Method_1731(string2, s2);
                }
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
                Class_24711.Method_24712(class_1699, dataOutputStream);
                dataOutputStream.close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return s.shortValue();
    }

    public Class_27841 Method_35279(Class class_, String string) {
        Class_27841 class_27841;
        block11 : {
            class_27841 = (Class_27841)this.Field_35277.get(string);
            if (class_27841 != null) {
                return class_27841;
            }
            if (this.Field_35275 != null) {
                try {
                    File file;
                    block12 : {
                        file = this.Field_35275.Method_26662(string);
                        if (file == null || !file.exists()) break block11;
                        try {
                            if (class_ == Class_33760.class) {
                                class_27841 = new Class_33760(string);
                                break block12;
                            }
                            if (class_ == Class_47711.class) {
                                class_27841 = new Class_47711(string);
                                break block12;
                            }
                            if (class_ == Class_41901.class) {
                                class_27841 = new Class_41901(string);
                                break block12;
                            }
                            if (class_ == Class_44927.class) {
                                class_27841 = new Class_44927(string);
                                break block12;
                            }
                            throw new RuntimeException("Failed to instantiate " + class_.toString(), new Exception("Clazz " + class_.toString() + " not checked"));
                        }
                        catch (Exception exception) {
                            throw new RuntimeException("Failed to instantiate " + class_.toString(), exception);
                        }
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    Class_1699 class_1699 = Class_24711.Method_24721(fileInputStream);
                    fileInputStream.close();
                    class_27841.Method_27847(class_1699.Method_1703("data"));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        if (class_27841 != null) {
            this.Field_35277.put(string, class_27841);
            this.Field_35276.add(class_27841);
        }
        return class_27841;
    }

    public void Method_35280() {
        for (int i = 1280 & 4630; i < this.Field_35276.size(); ++i) {
            Class_27841 class_27841 = (Class_27841)this.Field_35276.get(i);
            if (!class_27841.Method_27845()) continue;
            this.Method_35283(class_27841);
            class_27841.Method_27848((20 & 17193) != 0);
        }
    }

    private void Method_35281() {
        try {
            this.Field_35274.clear();
            if (this.Field_35275 == null) {
                return;
            }
            File file = this.Field_35275.Method_26662("idcounts");
            if (file != null && file.exists()) {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                Class_1699 class_1699 = Class_24711.Method_24722(dataInputStream);
                dataInputStream.close();
                for (String string : class_1699.Method_1710()) {
                    Class_1674 class_1674 = class_1699.Method_1720(string);
                    if (!(class_1674 instanceof Class_39686)) continue;
                    Class_39686 class_39686 = (Class_39686)class_1674;
                    short s = class_39686.Method_39697();
                    this.Field_35274.put(string, s);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Class_35273(Class_26655 class_26655) {
        this.Field_35275 = class_26655;
        this.Method_35281();
    }

    private void Method_35282() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_35283(Class_27841 class_27841) {
        if (this.Field_35275 != null) {
            try {
                File file = this.Field_35275.Method_26662(class_27841.Field_27842);
                if (file != null) {
                    Class_1699 class_1699 = new Class_1699();
                    class_27841.Method_27844(class_1699);
                    Class_1699 class_16992 = new Class_1699();
                    class_16992.Method_1744("data", class_1699);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    Class_24711.Method_24714(class_16992, fileOutputStream);
                    fileOutputStream.close();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void Method_35284(String string, Class_27841 class_27841) {
        if (this.Field_35277.containsKey(string)) {
            this.Field_35276.remove(this.Field_35277.remove(string));
        }
        this.Field_35277.put(string, class_27841);
        this.Field_35276.add(class_27841);
    }
}

