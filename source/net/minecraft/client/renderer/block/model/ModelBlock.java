/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.renderer.block.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.block.model.ModelBlock$Bookkeep;
import net.minecraft.client.renderer.block.model.ModelBlock$Deserializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ModelBlock {
    protected ModelBlock parent;
    private Class_15852 cameraTransforms;
    private final boolean ambientOcclusion;
    private final List elements;
    private final boolean gui3d;
    static final Gson SERIALIZER;
    private static final Logger LOGGER;
    protected Class_2080 parentLocation;
    protected final Map textures;
    public String name = "";

    public boolean isResolved() {
        return (this.parentLocation == null || this.parent != null && this.parent.isResolved() ? -30687 & 9219 : 0 & 1026) != 0;
    }

    public static ModelBlock deserialize(String string) {
        return ModelBlock.deserialize(new StringReader(string));
    }

    public Class_2080 getParentLocation() {
        return this.parentLocation;
    }

    private void \u0000% \u000a short super " 0 ! continue \u000a continue 2 long native throws ! case 7 byte 1 \u000a return 6 static transient 7 boolean \u000a 0 ! package extends catch void ~ goto try native instanceof boolean while catch 8 { null while this , default boolean extends \u000a private protected() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_15852 func_181682_g() {
        Class_12058 class_12058 = this.func_181681_a(Class_7673.Field_7674);
        Class_12058 class_120582 = this.func_181681_a(Class_7673.Field_7681);
        Class_12058 class_120583 = this.func_181681_a(Class_7673.Field_7675);
        Class_12058 class_120584 = this.func_181681_a(Class_7673.Field_7677);
        Class_12058 class_120585 = this.func_181681_a(Class_7673.Field_7676);
        Class_12058 class_120586 = this.func_181681_a(Class_7673.Field_7680);
        return new Class_15852(class_12058, class_120582, class_120583, class_120584, class_120585, class_120586);
    }

    public List getElements() {
        return this.hasParent() ? this.parent.getElements() : this.elements;
    }

    private String resolveTextureName(String string, ModelBlock$Bookkeep modelBlock$Bookkeep) {
        if (this.startsWithHash(string)) {
            if (this == modelBlock$Bookkeep.\u0000strictfp) {
                LOGGER.warn("Unable to resolve texture due to upward reference: " + string + " in " + this.name);
                return "missingno";
            }
            String string2 = (String)this.textures.get(string.substring(1 & 16529));
            if (string2 == null && this.hasParent()) {
                string2 = this.parent.resolveTextureName(string, modelBlock$Bookkeep);
            }
            modelBlock$Bookkeep.\u0000strictfp = this;
            if (string2 != null && this.startsWithHash(string2)) {
                string2 = modelBlock$Bookkeep.\u0000, `.resolveTextureName(string2, modelBlock$Bookkeep);
            }
            return string2 != null && !this.startsWithHash(string2) ? string2 : "missingno";
        }
        return string;
    }

    protected ModelBlock(Class_2080 class_2080, Map map, boolean bl, boolean bl2, Class_15852 class_15852) {
        this(class_2080, Collections.emptyList(), map, bl, bl2, class_15852);
    }

    private boolean startsWithHash(String string) {
        return (string.charAt(1666 & 0) == (-32605 & 4667) ? 387 & 3109 : -30427 & 16410) != 0;
    }

    private ModelBlock(Class_2080 class_2080, List list, Map map, boolean bl, boolean bl2, Class_15852 class_15852) {
        this.elements = list;
        this.ambientOcclusion = bl;
        this.gui3d = bl2;
        this.textures = map;
        this.parentLocation = class_2080;
        this.cameraTransforms = class_15852;
    }

    public String resolveTextureName(String string) {
        if (!this.startsWithHash(string)) {
            string = (char)(-9173 & 8227) + string;
        }
        return this.resolveTextureName(string, new ModelBlock$Bookkeep(this, null));
    }

    public ModelBlock(List list, Map map, boolean bl, boolean bl2, Class_15852 class_15852) {
        this(null, list, map, bl, bl2, class_15852);
    }

    public void getParentFromMap(Map map) {
        if (this.parentLocation != null) {
            this.parent = (ModelBlock)map.get(this.parentLocation);
        }
    }

    public ModelBlock getRootModel() {
        return this.hasParent() ? this.parent.getRootModel() : this;
    }

    public static ModelBlock deserialize(Reader reader) {
        return (ModelBlock)SERIALIZER.fromJson(reader, ModelBlock.class);
    }

    public boolean isTexturePresent(String string) {
        return (!"missingno".equals(this.resolveTextureName(string)) ? 12289 & 17859 : 2073 & 24868) != 0;
    }

    public static void checkModelHierarchy(Map map) {
    }

    public boolean isAmbientOcclusion() {
        return this.hasParent() ? this.parent.isAmbientOcclusion() : this.ambientOcclusion;
    }

    public boolean isGui3d() {
        return this.gui3d;
    }

    private Class_12058 func_181681_a(Class_7673 class_7673) {
        return this.parent != null && !this.cameraTransforms.Method_15871(class_7673) ? this.parent.func_181681_a(class_7673) : this.cameraTransforms.Method_15870(class_7673);
    }

    private boolean hasParent() {
        return (this.parent != null ? -23399 & 2309 : -32764 & 15360) != 0;
    }

    static {
        LOGGER = LogManager.getLogger();
        SERIALIZER = new GsonBuilder().registerTypeAdapter(ModelBlock.class, (Object)new ModelBlock$Deserializer()).registerTypeAdapter(Class_5986.class, (Object)new Class_39567()).registerTypeAdapter(Class_21223.class, (Object)new Class_13249()).registerTypeAdapter(Class_10006.class, (Object)new Class_8485()).registerTypeAdapter(Class_12058.class, (Object)new Class_7343()).registerTypeAdapter(Class_15852.class, (Object)new Class_13146()).create();
    }
}

