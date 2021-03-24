package co.escuelaing.edu.parcialArep;

import static spark.Spark.*;

public class calculo {

    public static Double cos(Double i){
            return Math.cos(i);
    }
    public static Double acos(Double i){
        return Math.acos(i);
    }

    public static void main(String[] args){
            port(getPort());
            get("hello", (req,res) -> "Hello Docker!");
    }


    private static int getPort() {
            if (System.getenv("PORT") != null) {
                return Integer.parseInt(System.getenv("PORT"));
            }
            return 4567;
    }

}
