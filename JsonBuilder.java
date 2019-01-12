package com.pivot.json;

/**
 * A json parser,main function:
 * 1.query value as string by comma seperated key,like "a.b[1].c"
 * 2.generate java source string by json;
 */
public interface JsonBuilder {
    /**
     * generate java source file from json
     * all classes in a file without imports;
     * @param className root class name
     * @return java source class in string format
     */
    String toSrc(String className);

    /**
     * query json by key.
     * key format
     * 1.seperated by comma;
     * 2.[] from array index;
     * @param path key
     * @return value,string,will  throw new RuntimeException("illegal formated json",e) when anything wrong
     */
    String get(String path);
}
