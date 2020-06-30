package com.guardarAvion;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

import static com.guardarAvion.Propulsion.MOTOR_A_REACCION;
import static com.guardarAvion.Propulsion.PISTONES;

public class ArchivoAviones {


    public ArrayList<Avion> traerAviones () throws IOException {

        File archivo = new File("aviones.json");
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        Gson gson = new Gson();


        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(br); //Obtengo un jsonElement del buffer
        JsonObject jsonObject;
        JsonArray jsonArray;

        ArrayList<Avion> aviones = new ArrayList<>();
        Avion a = null;

        if (jsonElement != null) {
            jsonArray = jsonElement.getAsJsonArray(); // Obtengo un jsonArray del jsonElement
            for (JsonElement jE : jsonArray){ /// para cada elemento del jsonArray
                jsonObject = jE.getAsJsonObject(); // obtengo un Objetc

                jsonElement = jsonObject.get("idAvion"); // Saco el campo "idAvion"
                int id = jsonElement.getAsInt();

                if (id >= 1000 && id < 2000)
                    a = gson.fromJson(jsonObject,Gold.class);
                else if (id >= 2000 && id < 3000)
                    a = gson.fromJson(jsonObject,Silver.class);
                else if (id >= 1000 && id < 4000)
                    a = gson.fromJson(jsonObject,Bronze.class);

                aviones.add(a);
            }
        }
        br.close();
        return aviones;
    }

    public String mostrarAviones (ArrayList<Avion> aviones){
        String rta = "";
        for (Avion a : aviones)
            rta += a.toString() + "\n-----------------------------------------------------\n";
        return rta;
    }


}
