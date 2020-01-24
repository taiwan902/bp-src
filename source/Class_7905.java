/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonObject
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_7905 {
    private final Map Field_7906 = Maps.newHashMap();
    private static final ParameterizedType Field_7907;
    protected static final Logger Field_7908;
    private final File Field_7909;
    private boolean Field_7910 = 71 & -13511;
    protected final Gson Field_7911;

    public void Method_7912(Object object) {
        this.Field_7906.remove(this.Method_7914(object));
        try {
            this.Method_7924();
        }
        catch (IOException iOException) {
            Field_7908.warn("Could not save the list after removing a user.", (Throwable)iOException);
        }
    }

    protected Map Method_7913() {
        return this.Field_7906;
    }

    protected String Method_7914(Object object) {
        return object.toString();
    }

    private void Method_7915() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.Field_7906.values()) {
            if (!((Class_9848)object).Method_9851()) continue;
            arrayList.add(((Class_9848)object).Method_9853());
        }
        for (Object object : arrayList) {
            this.Field_7906.remove(object);
        }
    }

    public void Method_7916(Class_9848 class_9848) {
        this.Field_7906.put(this.Method_7914(class_9848.Method_9853()), class_9848);
        try {
            this.Method_7924();
        }
        catch (IOException iOException) {
            Field_7908.warn("Could not save the list after adding a user.", (Throwable)iOException);
        }
    }

    public boolean Method_7917() {
        return this.Field_7910;
    }

    public String[] Method_7918() {
        return this.Field_7906.keySet().toArray(new String[this.Field_7906.size()]);
    }

    public Class_7905(File file) {
        this.Field_7909 = file;
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        gsonBuilder.registerTypeHierarchyAdapter(Class_9848.class, (Object)new Class_17556(this, null));
        this.Field_7911 = gsonBuilder.create();
    }

    protected Class_9848 Method_7919(JsonObject jsonObject) {
        return new Class_9848(null, jsonObject);
    }

    protected boolean Method_7920(Object object) {
        return this.Field_7906.containsKey(this.Method_7914(object));
    }

    static {
        Field_7908 = LogManager.getLogger();
        Field_7907 = new Class_14170();
    }

    public void Method_7921(boolean bl) {
        this.Field_7910 = bl;
    }

    private void Method_7922() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_9848 Method_7923(Object object) {
        this.Method_7915();
        return (Class_9848)this.Field_7906.get(this.Method_7914(object));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_7924() {
        Collection collection = this.Field_7906.values();
        String string = this.Field_7911.toJson(collection);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newWriter((File)this.Field_7909, (Charset)Charsets.UTF_8);
            bufferedWriter.write(string);
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly(bufferedWriter);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)bufferedWriter);
    }
}

