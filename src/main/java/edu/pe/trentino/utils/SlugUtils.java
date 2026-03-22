package edu.pe.trentino.utils;

public class SlugUtils {
    public static String slugify(String input) {
        if (input == null) {
            return "";
        }
        String slug = input.toLowerCase()
                .replaceAll("[^a-z0-9\\s-]", "")
                .replaceAll("\\s+", "-");

        slug = slug.replaceAll("-+", "-");
        slug = slug.replaceAll("^-|-$", "");
        return slug;
    }
}