package array_programs.p19.iterating_json_array;

import org.json.JSONArray;
import org.json.JSONObject;

//Iterate JSON Array Java
public class JSONExample {
    public static void main(String[] args) {
        String jsonData = "{" +
                "\"locations\":[" +
                        "{" +
                            "\"lat\":\"23.053\"," +
                            "\"long\":\"72.629\"," +
                            "\"location\":\"ABC\"," +
                            "\"address\":\"DEF\"," +
                            "\"city\":\"Ahmedabad\"," +
                            "\"state\":\"Gujrat\"," +
                            "\"phonenumber\":\"1234567\"" +
                        "}," +
                        "{" +
                            "\"lat\":\"21.013\"," +
                            "\"long\":\"52.619\"," +
                            "\"location\":\"XYZ\"," +
                            "\"address\":\"MNP\"," +
                            "\"city\":\"Ghaziabad\"," +
                            "\"state\":\"UP\"," +
                            "\"phonenumber\":\"212321\"" +
                        "}" +
                    "]" +
                "}";

        // convert JSON string into JSON Object using JSONObject() method
        JSONObject json = new JSONObject(jsonData);

        // get locations array from the JSON Object and store it into JSONArray
        JSONArray jsonArray = json.getJSONArray("locations");
//        System.out.println(jsonArray);

        // Iterate jsonArray using for loop
        for (int i = 0; i < jsonArray.length(); i++) {

            // store each object in JSONObject
            JSONObject explrObject = jsonArray.getJSONObject(i);

            // get field value from JSONObject using get() method
            System.out.println(explrObject.get("address"));

        }

    }
}
