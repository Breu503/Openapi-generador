/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.EquilateralTriangle;
import org.openapitools.client.model.IsoscelesTriangle;
import org.openapitools.client.model.ScaleneTriangle;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = Triangle.TriangleDeserializer.class)
@JsonSerialize(using = Triangle.TriangleSerializer.class)
public class Triangle extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Triangle.class.getName());

    public static class TriangleSerializer extends StdSerializer<Triangle> {
        public TriangleSerializer(Class<Triangle> t) {
            super(t);
        }

        public TriangleSerializer() {
            this(null);
        }

        @Override
        public void serialize(Triangle value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class TriangleDeserializer extends StdDeserializer<Triangle> {
        public TriangleDeserializer() {
            this(Triangle.class);
        }

        public TriangleDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Triangle deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize EquilateralTriangle
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EquilateralTriangle.class.equals(Integer.class) || EquilateralTriangle.class.equals(Long.class) || EquilateralTriangle.class.equals(Float.class) || EquilateralTriangle.class.equals(Double.class) || EquilateralTriangle.class.equals(Boolean.class) || EquilateralTriangle.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EquilateralTriangle.class.equals(Integer.class) || EquilateralTriangle.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EquilateralTriangle.class.equals(Float.class) || EquilateralTriangle.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EquilateralTriangle.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EquilateralTriangle.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EquilateralTriangle.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EquilateralTriangle'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EquilateralTriangle'", e);
            }

            // deserialize IsoscelesTriangle
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (IsoscelesTriangle.class.equals(Integer.class) || IsoscelesTriangle.class.equals(Long.class) || IsoscelesTriangle.class.equals(Float.class) || IsoscelesTriangle.class.equals(Double.class) || IsoscelesTriangle.class.equals(Boolean.class) || IsoscelesTriangle.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((IsoscelesTriangle.class.equals(Integer.class) || IsoscelesTriangle.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((IsoscelesTriangle.class.equals(Float.class) || IsoscelesTriangle.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (IsoscelesTriangle.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (IsoscelesTriangle.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(IsoscelesTriangle.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'IsoscelesTriangle'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'IsoscelesTriangle'", e);
            }

            // deserialize ScaleneTriangle
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ScaleneTriangle.class.equals(Integer.class) || ScaleneTriangle.class.equals(Long.class) || ScaleneTriangle.class.equals(Float.class) || ScaleneTriangle.class.equals(Double.class) || ScaleneTriangle.class.equals(Boolean.class) || ScaleneTriangle.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ScaleneTriangle.class.equals(Integer.class) || ScaleneTriangle.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ScaleneTriangle.class.equals(Float.class) || ScaleneTriangle.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ScaleneTriangle.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ScaleneTriangle.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ScaleneTriangle.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ScaleneTriangle'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ScaleneTriangle'", e);
            }

            if (match == 1) {
                Triangle ret = new Triangle();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for Triangle: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Triangle getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "Triangle cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public Triangle() {
        super("oneOf", Boolean.FALSE);
    }

    public Triangle(EquilateralTriangle o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Triangle(IsoscelesTriangle o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Triangle(ScaleneTriangle o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EquilateralTriangle", EquilateralTriangle.class);
        schemas.put("IsoscelesTriangle", IsoscelesTriangle.class);
        schemas.put("ScaleneTriangle", ScaleneTriangle.class);
        JSON.registerDescendants(Triangle.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("EquilateralTriangle", EquilateralTriangle.class);
        mappings.put("IsoscelesTriangle", IsoscelesTriangle.class);
        mappings.put("ScaleneTriangle", ScaleneTriangle.class);
        mappings.put("Triangle", Triangle.class);
        JSON.registerDiscriminator(Triangle.class, "triangleType", mappings);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Triangle.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(EquilateralTriangle.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(IsoscelesTriangle.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ScaleneTriangle.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle");
    }

    /**
     * Get the actual instance, which can be the following:
     * EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle
     *
     * @return The actual instance (EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EquilateralTriangle`. If the actual instance is not `EquilateralTriangle`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EquilateralTriangle`
     * @throws ClassCastException if the instance is not `EquilateralTriangle`
     */
    public EquilateralTriangle getEquilateralTriangle() throws ClassCastException {
        return (EquilateralTriangle)super.getActualInstance();
    }

    /**
     * Get the actual instance of `IsoscelesTriangle`. If the actual instance is not `IsoscelesTriangle`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IsoscelesTriangle`
     * @throws ClassCastException if the instance is not `IsoscelesTriangle`
     */
    public IsoscelesTriangle getIsoscelesTriangle() throws ClassCastException {
        return (IsoscelesTriangle)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ScaleneTriangle`. If the actual instance is not `ScaleneTriangle`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ScaleneTriangle`
     * @throws ClassCastException if the instance is not `ScaleneTriangle`
     */
    public ScaleneTriangle getScaleneTriangle() throws ClassCastException {
        return (ScaleneTriangle)super.getActualInstance();
    }



  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    if (getActualInstance() instanceof EquilateralTriangle) {
        if (getActualInstance() != null) {
          joiner.add(((EquilateralTriangle)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof IsoscelesTriangle) {
        if (getActualInstance() != null) {
          joiner.add(((IsoscelesTriangle)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ScaleneTriangle) {
        if (getActualInstance() != null) {
          joiner.add(((ScaleneTriangle)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}
