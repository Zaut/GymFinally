package com.example.diploma2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


public class GetData {

    Connection connect;
    String ConnectionResult = "";
    Boolean isSuccess = false;

    public List<MuscleGroups> getGroups() {

        List<MuscleGroups> data = null;
        data = new ArrayList<MuscleGroups>();
        try
        {
            ConnectionHelper conStr=new ConnectionHelper();
            connect =conStr.connectionclasss();        // Connect to database
            if (connect == null)
            {
                ConnectionResult = "Check Your Internet Access!";
            }
            else
            {
                // Change below query according to your own database.
                String query = "select * from MuscleGroups";
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()){
                    MuscleGroups datanum=new MuscleGroups();
                    datanum.name =rs.getString("name");
                    datanum.id =rs.getInt("id");
                    data.add(datanum);
                }


                ConnectionResult = " successful";
                isSuccess=true;
                connect.close();
            }
        }
        catch (Exception ex)
        {
            isSuccess = false;
            ConnectionResult = ex.getMessage();
        }

        return data;
    }
    public List<Activity> getActivities(int muscleGroupId) {

        List<Activity> data = null;
        data = new ArrayList<Activity>();
        try
        {
            ConnectionHelper conStr=new ConnectionHelper();
            connect =conStr.connectionclasss();        // Connect to database
            if (connect == null)
            {
                ConnectionResult = "Check Your Internet Access!";
            }
            else
            {
                // Change below query according to your own database.
                String query = "select Texts.name AS title, Photos.photo AS photo, Texts.text AS text from Activities INNER JOIN Texts ON Texts.id = Activities.text_id INNER JOIN Photos on Photos.id = Activities.photo_id WHERE Activities.muscleGroup_id = "+ muscleGroupId+";";
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()){
                    Activity datanum=new Activity();
                    datanum.activity_title =rs.getString("title");
                    String photo =rs.getString("photo");
                    datanum.photo = Base64.getDecoder().decode(photo);
                    datanum.text_id =rs.getString("text");
                    data.add(datanum);
                }


                ConnectionResult = " successful";
                isSuccess=true;
                connect.close();
            }
        }
        catch (Exception ex)
        {
            isSuccess = false;
            ConnectionResult = ex.getMessage();
        }

        return data;
    }
    public List<Food> getFood() {

        List<Food> data = null;
        data = new ArrayList<Food>();
        try
        {
            ConnectionHelper conStr=new ConnectionHelper();
            connect =conStr.connectionclasss();        // Connect to database
            if (connect == null)
            {
                ConnectionResult = "Check Your Internet Access!";
            }
            else
            {
                // Change below query according to your own database.
                String query = "select * from Food";
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()){
                    Food datanum=new Food();
                    datanum.name =rs.getString("name");
                    datanum.kcal =rs.getFloat("kcall");
                    data.add(datanum);
                }


                ConnectionResult = " successful";
                isSuccess=true;
                connect.close();
            }
        }
        catch (Exception ex)
        {
            isSuccess = false;
            ConnectionResult = ex.getMessage();
        }

        return data;
    }
    public List<Food> getFood(String Search) {

        List<Food> data = null;
        data = new ArrayList<Food>();
        try
        {
            ConnectionHelper conStr=new ConnectionHelper();
            connect =conStr.connectionclasss();        // Connect to database
            if (connect == null)
            {
                ConnectionResult = "Check Your Internet Access!";
            }
            else
            {
                // Change below query according to your own database.
                String query = "select * from Food where name like N'%" + Search + "%'";
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()){
                    Food datanum=new Food();
                    datanum.name =rs.getString("name");
                    datanum.kcal =rs.getFloat("kcall");
                    data.add(datanum);
                }


                ConnectionResult = " successful";
                isSuccess=true;
                connect.close();
            }
        }
        catch (Exception ex)
        {
            isSuccess = false;
            ConnectionResult = ex.getMessage();
        }

        return data;
    }



}

