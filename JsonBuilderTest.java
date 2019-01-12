package com.pivot.json;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonBuilderTest {

    @Test
    void get() {
        String json = "{\"menu\": {\n" +
                "  \"id\": \"file\",\n" +
                "  \"value\": \"File\",\n" +
                "  \"popup\": {\n" +
                "    \"menuitem\": [\n" +
                "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" +
                "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" +
                "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" +
                "    ]\n" +
                "  }\n" +
                "}}";
        JsonBuilder jb = AntlrJsonBuilder.build(json);
        String s1 = jb.get("menu.id");
        String s2 = jb.get("menu.popup.menuitem[1].onclick");
        assertEquals("file",s1);
        assertEquals("OpenDoc()",s2);
        String src=jb.toSrc("MENU");
        System.out.println(src);
        assertNotNull(src);
    }
}