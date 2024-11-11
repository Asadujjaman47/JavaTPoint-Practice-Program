package array_programs.p19.iterating_json_array;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

//Iterate JSON Array Java
public class JSONExample2 {
    public static void main(String[] args) {

        // create instance of JSONObject
        JSONObject jsonObject = new JSONObject();

        // use put() method for inserting the data into JSON object
        jsonObject.put("name", "Asadujjaman");
        jsonObject.put("department", "CSE");
        jsonObject.put("branch", "Computer Science");
        jsonObject.put("year", 4);

        // print the JSON object
//        System.out.println(jsonObject);

        // create JSON Array and store record into JSONObject
        JSONArray list1 = new JSONArray();
        list1.put("Julia");
        list1.put("Paul");
        list1.put("Emma");

        jsonObject.put("Names", list1);

        JSONArray list2 = new JSONArray();
        list2.put("BCA");
        list2.put("B.Tech");
        list2.put("MCA");

        jsonObject.put("Course", list2);

        JSONArray list3 = new JSONArray();
        list3.put("3");
        list3.put("4");
        list3.put("2");

        jsonObject.put("Year", list3);

        // create instance of the FileWriter class by passing
        // the path of the file in the constructor

//        try (FileWriter file = new FileWriter("output.json")){
        try (FileWriter file = new FileWriter("src/array_programs/p19/iterating_JSON_Array/output.json")){

            // use write() method to add JSONObject into file
            file.write(jsonObject.toString());
            file.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // get locations array from the JSON Object and store it into JSONArray
        JSONArray jsonArray = (JSONArray) jsonObject.get("Names");

        // iterate jsonArray using for loop
        for (int i = 0; i <jsonArray.length(); i++) {

            // get field value from JSON Array
            System.out.println(jsonArray.get(i));
        }


    }
}

/*
 OUTPUT:
{
  "Names": [
    "Julia",
    "Paul",
    "Emma"
  ],
  "Year": [
    "3",
    "4",
    "2"
  ],
  "year": 4,
  "name": "Asadujjaman",
  "department": "CSE",
  "Course": [
    "BCA",
    "B.Tech",
    "MCA"
  ],
  "branch": "Computer Science"
}
        */
