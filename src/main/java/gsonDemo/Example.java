package gsonDemo;

import com.google.gson.Gson;

public class Example {
    public static void main(String[] args) {
        // Create an instance of the object to be serialized
        MyObject obj = new MyObject("John", 30);

        // Create Gson object
        Gson gson = new Gson();

        // Serialize the object to JSON
        String json = gson.toJson(obj);
        System.out.println("Serialized JSON: " + json);

        // Deserialize JSON to object
        MyObject newObj = gson.fromJson(json, MyObject.class);
        System.out.println("Deserialized Object: " + newObj);
    }

    // Define a simple class
    static class MyObject {
        String name;
        int age;

        // Constructor
        public MyObject(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // toString method for printing object details
        @Override
        public String toString() {
            return "MyObject{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
