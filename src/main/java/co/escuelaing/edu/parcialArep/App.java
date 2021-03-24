package co.escuelaing.edu.parcialArep;

import com.google.gson.Gson;

import static spark.Spark.*;

public class App {
        /**
         *Es la clase principal que llama la pagina web y pone a correr el servicio en esta pagina
         * @param args argumentos para correr
         * */
        public static void main (String[] args) {
            port (getPort());
            get("/cos", (req, res) -> {
                res.type("application/json");
                String function = req.queryParams("value");
                String USER_AGENT = "Mozilla/5.0";
                String resultado = "Error al realizar la consulta";
                resultado =Double.toString(calculo.cos(Double.parseDouble(function)));
                return new Gson().toJson("{\"operation\": cos \""+"\"input:"+function+"\"output:"+resultado+"\"}");

            });
            get("/acos", (req, res) -> {
                res.type("application/json");
                String function = req.queryParams("value");
                String USER_AGENT = "Mozilla/5.0";
                String resultadone = "Error al realizar la consulta";
                resultadone =Double.toString( calculo.acos(Double.parseDouble(function)));
                return new Gson().toJson("¿{\"operation\": acos \""+"\"input:"+function+" \"output:"+resultadone+"\"}");
            });
        }

        /**
         * metodo que retorna los servicios
         * @return int obtiene el intero del puerto que se corre
         */
        public static int getPort() {
            if (System.getenv("PORT") != null)
            {
                return Integer.parseInt(System.getenv("PORT"));
            }
            return 4567;
        }
}

