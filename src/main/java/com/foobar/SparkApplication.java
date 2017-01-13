package com.foobar;

import static spark.Spark.*;

public class SparkApplication {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello world");
    }
}
